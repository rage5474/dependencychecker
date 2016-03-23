package de.raphaelgeissler.dependencychecker.core.impl.validation;

import static de.raphaelgeissler.dependencychecker.core.impl.validation.TestHelper.equalToIgnoringWhiteSpace;
import static de.raphaelgeissler.dependencychecker.core.impl.validation.TestHelper.readFile;
import static org.junit.Assert.assertTrue;

import java.nio.charset.Charset;

import org.junit.Test;

import de.raphaelgeissler.dependencychecker.Checker;

public class DValidationResultToPlantUMLTransformerTest {

	@Test
	public void simpleTest() throws Exception {
		DependencyValidationResultImpl result = new DependencyValidationResultImpl();
		result.addResultMessage(new DependencyValidationResultMessageImpl(false, 0, "de.ragedev.example.core",
				"de.ragedev.example.ui"));
		result.addResultMessage(new DependencyValidationResultMessageImpl(true, 0, "de.ragedev.example.core.api",
				"de.ragedev.example.ui"));
		
		Checker checker = new DValBuilder("TestConfig")
				.comp(new DValCompBuilder("Core").id("de.ragedev.example.core*").port("de.ragedev.example.core.api"))
				.comp(new DValCompBuilder("UI").id("de.ragedev.example.ui*")).build();

		String plantUmlString = DValidationResultToPlantUMLTransformer.transform(result, checker);
		
		String expectedResult = readFile("files/result.iuml", Charset.defaultCharset());
		
		System.out.println("Simple");
		System.out.println(plantUmlString);
		
		assertTrue(equalToIgnoringWhiteSpace(expectedResult, plantUmlString));
	}

}
