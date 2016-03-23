package de.ragedev.cdsl.generator;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import de.ragedev.cdsl.cDSL.ComponentDescription;
import de.ragedev.cdsl.cDSL.ComponentID;
import de.ragedev.cdsl.cDSL.DValidator;
import de.ragedev.cdsl.cDSL.NotAllowedRef;
import de.ragedev.cdsl.cDSL.Ports;
import de.ragedev.cdsl.cDSL.UnitElements;
import de.raphaelgeissler.dependencychecker.Checker;
import de.raphaelgeissler.dependencychecker.ComponentItemDescription;
import de.raphaelgeissler.dependencychecker.DependencycheckerFactory;
import java.util.Map;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;

@SuppressWarnings("all")
public class CDSLGenerator extends AbstractGenerator {
  private Map<String, Object> saveProperties;
  
  public Object CDSLGenerator() {
    Object _xblockexpression = null;
    {
      Map<String, Object> _extensionToFactoryMap = Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap();
      this.saveProperties = _extensionToFactoryMap;
      XMIResourceFactoryImpl _xMIResourceFactoryImpl = new XMIResourceFactoryImpl();
      _xblockexpression = this.saveProperties.put("key", _xMIResourceFactoryImpl);
    }
    return _xblockexpression;
  }
  
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    try {
      final ResourceSet resourceSet = new ResourceSetImpl();
      TreeIterator<EObject> _allContents = resource.getAllContents();
      Iterable<EObject> _iterable = IteratorExtensions.<EObject>toIterable(_allContents);
      Iterable<DValidator> _filter = Iterables.<DValidator>filter(_iterable, DValidator.class);
      for (final DValidator nextDValidator : _filter) {
        {
          String _valName = nextDValidator.getValName();
          String _plus = (_valName + ".dependencychecker");
          URI _uRI = fsa.getURI(_plus);
          final Resource dependencyCheckerResource = resourceSet.createResource(_uRI);
          this.generate(nextDValidator, dependencyCheckerResource);
          dependencyCheckerResource.save(this.saveProperties);
          String _valName_1 = nextDValidator.getValName();
          final String fileURI = (_valName_1 + ".uml");
          final String contents = this.generateUml(nextDValidator);
          fsa.generateFile(fileURI, contents);
        }
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public String generateUml(final DValidator validator) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("@startuml");
    _builder.newLine();
    {
      EList<ComponentDescription> _refComponents = validator.getRefComponents();
      for(final ComponentDescription nextComp : _refComponents) {
        {
          NotAllowedRef _notAllowedRef = nextComp.getNotAllowedRef();
          boolean _notEquals = (!Objects.equal(_notAllowedRef, null));
          if (_notEquals) {
            {
              NotAllowedRef _notAllowedRef_1 = nextComp.getNotAllowedRef();
              EList<ComponentDescription> _units = _notAllowedRef_1.getUnits();
              for(final ComponentDescription nextForbiddenComp : _units) {
                _builder.append("[");
                String _name = nextComp.getName();
                _builder.append(_name, "");
                _builder.append("] -[#red]> [");
                String _name_1 = nextForbiddenComp.getName();
                _builder.append(_name_1, "");
                _builder.append("]");
                _builder.newLineIfNotEmpty();
              }
            }
          }
        }
      }
    }
    _builder.append("@enduml");
    _builder.newLine();
    final String result = _builder.toString();
    EList<ComponentDescription> _refComponents_1 = validator.getRefComponents();
    for (final ComponentDescription nextRefComp : _refComponents_1) {
      String _name_2 = nextRefComp.getName();
      String _plus = ("Comp: " + _name_2);
      InputOutput.<String>println(_plus);
    }
    return result;
  }
  
  public void generate(final DValidator validator, final Resource dependencyCheckerResource) {
    final Checker checker = DependencycheckerFactory.eINSTANCE.createChecker();
    EList<ComponentDescription> _refComponents = validator.getRefComponents();
    for (final ComponentDescription nextRefComp : _refComponents) {
      {
        final de.raphaelgeissler.dependencychecker.ComponentDescription compDesc = DependencycheckerFactory.eINSTANCE.createComponentDescription();
        String _name = nextRefComp.getName();
        compDesc.setName(_name);
        UnitElements _units = nextRefComp.getUnits();
        boolean _notEquals = (!Objects.equal(_units, null));
        if (_notEquals) {
          UnitElements _units_1 = nextRefComp.getUnits();
          EList<ComponentID> _unit = _units_1.getUnit();
          for (final ComponentID nextUnit : _unit) {
            EList<String> _qualifiedNames = nextUnit.getQualifiedNames();
            for (final String nextCompId : _qualifiedNames) {
              EList<ComponentItemDescription> _componentItems = compDesc.getComponentItems();
              ComponentItemDescription _createCompItemDesc = this.createCompItemDesc(nextCompId);
              _componentItems.add(_createCompItemDesc);
            }
          }
        }
        Ports _ports = nextRefComp.getPorts();
        boolean _notEquals_1 = (!Objects.equal(_ports, null));
        if (_notEquals_1) {
          Ports _ports_1 = nextRefComp.getPorts();
          EList<String> _port = _ports_1.getPort();
          for (final String nextPortId : _port) {
            EList<ComponentItemDescription> _ports_2 = compDesc.getPorts();
            ComponentItemDescription _createCompItemDesc_1 = this.createCompItemDesc(nextPortId);
            _ports_2.add(_createCompItemDesc_1);
          }
        }
        NotAllowedRef _notAllowedRef = nextRefComp.getNotAllowedRef();
        boolean _notEquals_2 = (!Objects.equal(_notAllowedRef, null));
        if (_notEquals_2) {
          NotAllowedRef _notAllowedRef_1 = nextRefComp.getNotAllowedRef();
          EList<ComponentDescription> _units_2 = _notAllowedRef_1.getUnits();
          for (final ComponentDescription nextNotAllowedUnit : _units_2) {
            EList<String> _forbiddenComponents = compDesc.getForbiddenComponents();
            String _name_1 = nextNotAllowedUnit.getName();
            _forbiddenComponents.add(_name_1);
          }
        }
        EList<de.raphaelgeissler.dependencychecker.ComponentDescription> _componentDefinitions = checker.getComponentDefinitions();
        _componentDefinitions.add(compDesc);
      }
    }
    EList<EObject> _contents = dependencyCheckerResource.getContents();
    _contents.add(checker);
  }
  
  public ComponentItemDescription createCompItemDesc(final String nextUnit) {
    ComponentItemDescription _xblockexpression = null;
    {
      final ComponentItemDescription compItemDesc = DependencycheckerFactory.eINSTANCE.createComponentItemDescription();
      compItemDesc.setId(nextUnit);
      _xblockexpression = compItemDesc;
    }
    return _xblockexpression;
  }
  
  public de.raphaelgeissler.dependencychecker.ComponentDescription findCD(final Checker checker, final String name) {
    EList<de.raphaelgeissler.dependencychecker.ComponentDescription> _componentDefinitions = checker.getComponentDefinitions();
    for (final de.raphaelgeissler.dependencychecker.ComponentDescription nextComponent : _componentDefinitions) {
      String _name = nextComponent.getName();
      boolean _equals = _name.equals(name);
      if (_equals) {
        return nextComponent;
      }
    }
    return null;
  }
}
