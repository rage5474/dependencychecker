/*
 * generated by Xtext 2.9.1
 */
package de.raphaegeissler.cdsl.generator

import de.raphaegeissler.cdsl.cDSL.DValidator
import de.raphaelgeissler.dependencychecker.Checker
import de.raphaelgeissler.dependencychecker.ComponentDescription
import de.raphaelgeissler.dependencychecker.DependencycheckerFactory
import java.util.Map
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class CDSLGenerator extends AbstractGenerator {

	private var Map<String, Object> saveProperties

	def CDSLGenerator() {
		saveProperties = Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap()
		saveProperties.put("key", new XMIResourceFactoryImpl());
	}

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {

		val ResourceSet resourceSet = new ResourceSetImpl();

		for (nextDValidator : resource.allContents.toIterable.filter(DValidator)) {
			val dependencyCheckerResource = resourceSet.createResource(
				fsa.getURI(nextDValidator.valName + ".dependencychecker"));
			nextDValidator.generate(dependencyCheckerResource)
			dependencyCheckerResource.save(saveProperties)
		}

	}

	def void generate(DValidator validator, Resource dependencyCheckerResource) {
		val checker = DependencycheckerFactory.eINSTANCE.createChecker

		for (nextRefComp : validator.refComponents) {

			val compDesc = DependencycheckerFactory.eINSTANCE.createComponentDescription
			compDesc.name = nextRefComp.name

			for (nextUnit : nextRefComp.units.unit) {
				for(q : nextUnit.qualifiedNames)
				{
					println(q)
					compDesc.componentItems.add(createCompItemDescFromUnit(q))
					
				}
			}

			for (notAllowedRef : nextRefComp.notAllowedRef) {
				for (nextNotAllowedUnit : notAllowedRef.units) {
					compDesc.forbiddenComponents.add(nextNotAllowedUnit.name)
				}
			}

			checker.componentDefinitions.add(compDesc)
		}

		dependencyCheckerResource.getContents().add(checker);
	}

	def createCompItemDescFromUnit(String nextUnit) {
		val compItemDesc = DependencycheckerFactory.eINSTANCE.createComponentItemDescription

		compItemDesc.value = nextUnit
		compItemDesc
	}

	def ComponentDescription findCD(Checker checker, String name) {
		for (c : checker.componentDefinitions) {
			if (c.name.equals(name))
				return c
		}

		return null
	}

}
