package de.raphaelgeissler.dependencychecker.core.impl.validation;

import static de.raphaelgeissler.dependencychecker.core.impl.validation.TestHelper.equalToIgnoringWhiteSpace;
import static de.raphaelgeissler.dependencychecker.core.impl.validation.TestHelper.readFile;
import static org.junit.Assert.assertTrue;

import java.nio.charset.Charset;

import org.junit.Test;

import de.raphaelgeissler.dependencychecker.Checker;

public class DValidationResultToPlantUMLTransformerTest {

	@Test
	public void fullPlantUmlGenerator() throws Exception {
		DependencyValidationResultImpl result = new DependencyValidationResultImpl();
		result.addResultMessage(new DependencyValidationResultMessageImpl(false, 0, "de.ragedev.example.core",
				"de.ragedev.example.ui"));
		result.addResultMessage(new DependencyValidationResultMessageImpl(true, 0, "de.ragedev.example.core.api",
				"de.ragedev.example.ui"));
		
		Checker checker = new DValBuilder("TestConfig")
				.comp(new DValCompBuilder("Core").id("de.ragedev.example.core*").port("de.ragedev.example.core.api"))
				.comp(new DValCompBuilder("UI").id("de.ragedev.example.ui*")).build();

		String plantUmlString = DValidationResultToPlantUMLTransformer.transform(new FullPlantUMLGenerator(result, checker));
		
		String expectedResult = readFile("files/result.iuml", Charset.defaultCharset());
		
		assertTrue(equalToIgnoringWhiteSpace(expectedResult, plantUmlString));
	}
	
	@Test
	public void fullPlantUmlGeneratorNoInnerConnection() throws Exception {
		DependencyValidationResultImpl result = new DependencyValidationResultImpl();
		result.addResultMessage(new DependencyValidationResultMessageImpl(true, 0, "de.ragedev.example.core.plugin.dest",
				"de.ragedev.example.core.plugin.src"));
		result.addResultMessage(new DependencyValidationResultMessageImpl(true, 0, "de.ragedev.example.core.api",
				"de.ragedev.example.ui"));
		
		Checker checker = new DValBuilder("TestConfig")
				.comp(new DValCompBuilder("Core").id("de.ragedev.example.core*").port("de.ragedev.example.core.api"))
				.comp(new DValCompBuilder("UI").id("de.ragedev.example.ui*")).build();

		String plantUmlString = DValidationResultToPlantUMLTransformer.transform(new FullPlantUMLGenerator(result, checker, false));
		
		System.out.println(plantUmlString);
		
		String expectedResult = readFile("files/resultNoInner.iuml", Charset.defaultCharset());
		
		assertTrue(equalToIgnoringWhiteSpace(expectedResult, plantUmlString));
	}

}
