/**
 * generated by Xtext 2.9.1
 */
package de.ragedev.cdsl.cDSL.impl;

import de.ragedev.cdsl.cDSL.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CDSLFactoryImpl extends EFactoryImpl implements CDSLFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static CDSLFactory init()
  {
    try
    {
      CDSLFactory theCDSLFactory = (CDSLFactory)EPackage.Registry.INSTANCE.getEFactory(CDSLPackage.eNS_URI);
      if (theCDSLFactory != null)
      {
        return theCDSLFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new CDSLFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CDSLFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case CDSLPackage.DOMAINMODEL: return createDomainmodel();
      case CDSLPackage.ABSTRACT_ENTRY: return createAbstractEntry();
      case CDSLPackage.DVALIDATOR: return createDValidator();
      case CDSLPackage.COMPONENT_DESCRIPTION: return createComponentDescription();
      case CDSLPackage.PORTS: return createPorts();
      case CDSLPackage.NOT_ALLOWED_REF: return createNotAllowedRef();
      case CDSLPackage.UNIT_ELEMENTS: return createUnitElements();
      case CDSLPackage.COMPONENT_ID: return createComponentID();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Domainmodel createDomainmodel()
  {
    DomainmodelImpl domainmodel = new DomainmodelImpl();
    return domainmodel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractEntry createAbstractEntry()
  {
    AbstractEntryImpl abstractEntry = new AbstractEntryImpl();
    return abstractEntry;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DValidator createDValidator()
  {
    DValidatorImpl dValidator = new DValidatorImpl();
    return dValidator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComponentDescription createComponentDescription()
  {
    ComponentDescriptionImpl componentDescription = new ComponentDescriptionImpl();
    return componentDescription;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Ports createPorts()
  {
    PortsImpl ports = new PortsImpl();
    return ports;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotAllowedRef createNotAllowedRef()
  {
    NotAllowedRefImpl notAllowedRef = new NotAllowedRefImpl();
    return notAllowedRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UnitElements createUnitElements()
  {
    UnitElementsImpl unitElements = new UnitElementsImpl();
    return unitElements;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComponentID createComponentID()
  {
    ComponentIDImpl componentID = new ComponentIDImpl();
    return componentID;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CDSLPackage getCDSLPackage()
  {
    return (CDSLPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static CDSLPackage getPackage()
  {
    return CDSLPackage.eINSTANCE;
  }

} //CDSLFactoryImpl
