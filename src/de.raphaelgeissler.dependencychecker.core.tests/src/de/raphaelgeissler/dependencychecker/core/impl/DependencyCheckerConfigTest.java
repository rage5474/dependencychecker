package de.raphaelgeissler.dependencychecker.core.impl;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.File;

import org.junit.Test;

public class DependencyCheckerConfigTest {

	@Test
	public void checkerFound() throws Exception {
		File configFile = new File("files/example/example.dependencychecker");
		DependencyCheckerConfig dependencyCheckerConfig = new DependencyCheckerConfig();
		assertTrue(dependencyCheckerConfig.loadData(configFile.getAbsolutePath()));
		assertNotNull(dependencyCheckerConfig.getChecker());
	}

}
