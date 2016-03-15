package de.raphaelgeissler.dependencychecker.core.impl.validation;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import de.raphaelgeissler.dependencychecker.Checker;
import de.raphaelgeissler.dependencychecker.core.impl.validation.DValBuilder;
import de.raphaelgeissler.dependencychecker.core.impl.validation.DValCompBuilder;

public class DValBuilderTest {

	private Checker checker;

	@Before
	public void setup() {
		checker = new DValBuilder("MyChecker").comp(new DValCompBuilder("Core").id("de.ragedev.core.*").forbidden("UI")).build();
	}
	
	@Test
	public void checkerCompNameCorrect() throws Exception {
		assertEquals("Core", checker.getComponentDefinitions().get(0).getName());
	}
	
	@Test
	public void checkerCompIdCorrect() throws Exception {
		assertEquals("de.ragedev.core.*", checker.getComponentDefinitions().get(0).getComponentItems().get(0).getValue());
	}
	
	@Test
	public void checkerCompForbiddenIdCorrect() throws Exception {
		assertEquals("UI", checker.getComponentDefinitions().get(0).getForbiddenComponents().get(0));
	}
}
