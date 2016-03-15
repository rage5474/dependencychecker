package de.raphaelgeissler.dependencychecker.core.impl.validation;

import static org.junit.Assert.*;

import org.junit.Test;

public class WildCardMatcherTest {

	@Test
	public void wildCardAtEndMatchingTest() throws Exception {
		assertTrue(WildCardMatcher.isMatching("de.ragedev.core.plugin1","de.ragedev.core.*"));
	}
	
	@Test
	public void wildCardAtEndNotMatchingTest() throws Exception {
		assertFalse(WildCardMatcher.isMatching("de.ragedev.core.plugin1","de.ragedev.ui.*"));
	}
	
	@Test
	public void wildCardAtMidMatchingTest() throws Exception {
		assertTrue(WildCardMatcher.isMatching("de.ragedev.core.plugin1","de.ragedev.*.plugin1"));
	}
	
	@Test
	public void wildCardAtMidNotMatchingTest() throws Exception {
		assertFalse(WildCardMatcher.isMatching("de.ragedev.core.plugin1","de.ragedev.*.plugin2"));
	}
	
	@Test
	public void wildCardAtStartMatchingTest() throws Exception {
		assertTrue(WildCardMatcher.isMatching("de.ragedev.core.plugin1","*.plugin1"));
	}
	
	@Test
	public void wildCardAtStartNotMatchingTest() throws Exception {
		assertFalse(WildCardMatcher.isMatching("de.ragedev.core.plugin1","*.plugin2"));
	}
	
	@Test
	public void wildCardExactlyMatchingTest() throws Exception {
		assertFalse(WildCardMatcher.isMatching("de.ragedev.ui","de.ragedev.ui.*"));
	}
}
