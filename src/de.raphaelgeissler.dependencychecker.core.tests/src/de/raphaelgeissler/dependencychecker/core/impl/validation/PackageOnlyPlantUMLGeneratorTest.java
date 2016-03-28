package de.raphaelgeissler.dependencychecker.core.impl.validation;

import static de.raphaelgeissler.dependencychecker.core.impl.validation.TestHelper.equalToIgnoringWhiteSpace;
import static org.junit.Assert.*;

import org.junit.Test;

import de.raphaelgeissler.dependencychecker.Checker;

public class PackageOnlyPlantUMLGeneratorTest {
	@Test
	public void packageGenerationCorrect() throws Exception {
		DependencyValidationResultImpl validationResult = new DependencyValidationResultImpl();
		validationResult.addResultMessage(new DependencyValidationResultMessageImpl(false, 0, "de.ragedev.example.core",
				"de.ragedev.example.ui"));
		validationResult.addResultMessage(new DependencyValidationResultMessageImpl(true, 0, "de.ragedev.example.core.api",
				"de.ragedev.example.ui"));
		
		Checker checker = new DValBuilder("TestConfig")
				.comp(new DValCompBuilder("Core").id("de.ragedev.example.core*").port("de.ragedev.example.core.api"))
				.comp(new DValCompBuilder("UI").id("de.ragedev.example.ui*")).build();
		
		String expectedResult = ""
				+ "package Core{\n"
				+ "}\n"
				+ "package UI{\n"
				+ "}\n";
		
		String result = new PackageOnlyPlantUMLGenerator(validationResult, checker).generatePackagePlantUMLString();
		
		assertTrue(equalToIgnoringWhiteSpace(expectedResult, result));
		
	}
	
	@Test
	public void dependencyGenerationCorrect() throws Exception {
		DependencyValidationResultImpl validationResult = new DependencyValidationResultImpl();
		validationResult.addResultMessage(new DependencyValidationResultMessageImpl(false, 0, "de.ragedev.example.core",
				"de.ragedev.example.ui"));
		validationResult.addResultMessage(new DependencyValidationResultMessageImpl(true, 0, "de.ragedev.example.core.api",
				"de.ragedev.example.ui"));
		
		Checker checker = new DValBuilder("TestConfig")
				.comp(new DValCompBuilder("Core").id("de.ragedev.example.core*").port("de.ragedev.example.core.api"))
				.comp(new DValCompBuilder("UI").id("de.ragedev.example.ui*")).build();
		
		String expectedResult = "UI-->Core\n";
		
		String result = new PackageOnlyPlantUMLGenerator(validationResult, checker).generateDependenciesPlantUMLString();
		
		assertTrue(equalToIgnoringWhiteSpace(expectedResult, result));
		
	}
}
