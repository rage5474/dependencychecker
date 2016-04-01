package de.raphaelgeissler.dependencychecker.core.impl.validation

import de.raphaelgeissler.dependencychecker.Checker
import org.junit.Before
import org.junit.Test

import static org.junit.Assert.*

class UmlGeneratorTest {

	private DependencyValidationResultImpl result;
	private Checker checker;

	@Before
	def void setup() {
		result = new DependencyValidationResultImpl();
		result.addResultMessage(
			new DependencyValidationResultMessageImpl(true, 0, "de.ragedev.example.core.plugin.dest",
				"de.ragedev.example.core.plugin.src"));
		result.addResultMessage(new DependencyValidationResultMessageImpl(true, 0, "de.ragedev.example.core.api",
			"de.ragedev.example.ui"));
		result.addResultMessage(new DependencyValidationResultMessageImpl(true, 0, "de.ragedev.example.model",
			"de.ragedev.example.ui"));

		checker = new DValBuilder("TestConfig").comp(
			new DValCompBuilder("Core").id("de.ragedev.example.core*").port("de.ragedev.example.core.api")).comp(
			new DValCompBuilder("UI").id("de.ragedev.example.ui*")).build();
	}

	@Test
	def void noInnerConnection() throws Exception {
		val generator = new OuterDependencyUMLGenerator(result, checker, false, false);

		val generatedPackageString = generator.generatePackagePlantUMLString();
		val generatedDependenciesString = generator.generateDependenciesPlantUMLString();
		
		val generatedUmlString = generatedPackageString + generatedDependenciesString

		val String expectedUmlString = '''
		package Core{
		[de.ragedev.example.core.api] <<Port>>
		}
		package UI{
		[de.ragedev.example.ui] <<Inner>>
		}
		package Unknown{
		[de.ragedev.example.model] <<Inner>>
		}
		[de.ragedev.example.ui]-->[de.ragedev.example.core.api]
		[de.ragedev.example.ui]-->[de.ragedev.example.model]
		'''

		assertEquals(expectedUmlString.replaceAll("\\s+", ""), generatedUmlString.replaceAll("\\s+", ""))
	}
	
	@Test
	def void innerConnection() throws Exception {
		val generator = new OuterDependencyUMLGenerator(result, checker, true, false);

		val generatedPackageString = generator.generatePackagePlantUMLString();
		val generatedDependenciesString = generator.generateDependenciesPlantUMLString();
		
		val generatedUmlString = generatedPackageString + generatedDependenciesString

		var String expectedUmlString = '''
		package Core{
		[de.ragedev.example.core.api] <<Port>>
		[de.ragedev.example.core.plugin.dest] <<Inner>>
		[de.ragedev.example.core.plugin.src] <<Inner>>
		}
		package UI{
		[de.ragedev.example.ui] <<Inner>>
		}
		package Unknown{
		[de.ragedev.example.model] <<Inner>>
		}
		[de.ragedev.example.core.plugin.src]-->[de.ragedev.example.core.plugin.dest]
		[de.ragedev.example.ui]-->[de.ragedev.example.core.api]
		[de.ragedev.example.ui]-->[de.ragedev.example.model]
		'''

		assertEquals(expectedUmlString.replaceAll("\\s+", ""), generatedUmlString.replaceAll("\\s+", ""))
	}
	
	@Test
	def void ignoreUnknown() throws Exception {
		val generator = new OuterDependencyUMLGenerator(result, checker, true, true);

		val generatedPackageString = generator.generatePackagePlantUMLString();
		val generatedDependenciesString = generator.generateDependenciesPlantUMLString();
		
		val generatedUmlString = generatedPackageString + generatedDependenciesString

		var String expectedUmlString = '''
		package Core{
		[de.ragedev.example.core.api] <<Port>>
		[de.ragedev.example.core.plugin.dest] <<Inner>>
		[de.ragedev.example.core.plugin.src] <<Inner>>
		}
		package UI{
		[de.ragedev.example.ui] <<Inner>>
		}
		package Unknown{
		[de.ragedev.example.model] <<Inner>>
		}
		[de.ragedev.example.core.plugin.src]-->[de.ragedev.example.core.plugin.dest]
		[de.ragedev.example.ui]-->[de.ragedev.example.core.api]
		[de.ragedev.example.ui]-->[de.ragedev.example.model]
		'''

		assertEquals(expectedUmlString.replaceAll("\\s+", ""), generatedUmlString.replaceAll("\\s+", ""))
	}
}
