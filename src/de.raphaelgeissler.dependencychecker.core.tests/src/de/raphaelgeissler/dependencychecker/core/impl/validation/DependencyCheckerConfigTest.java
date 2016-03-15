package de.raphaelgeissler.dependencychecker.core.impl.validation;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.File;

import org.junit.Test;

import de.raphaelgeissler.dependencychecker.core.impl.validation.DependencyCheckerConfig;

public class DependencyCheckerConfigTest extends AbstractDependencyCheckerConfigTest {

	@Test
	public void checkerFound() throws Exception {
		File configFile = new File("files/example/example.dependencychecker");
		DependencyCheckerConfig dependencyCheckerConfig = new DependencyCheckerConfig();
		assertTrue(dependencyCheckerConfig.loadData(configFile.getAbsolutePath()));
		assertNotNull(dependencyCheckerConfig.getChecker());
	}

}
