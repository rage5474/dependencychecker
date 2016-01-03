package de.raphaelgeissler.dependencychecker.core.api;

import static org.junit.Assert.assertNotNull;

import java.util.Arrays;

import org.junit.Ignore;
import org.junit.Test;

import de.raphaelgeissler.dependencychecker.core.impl.DependencyCheckerConfig;
import de.raphaelgeissler.dependencychecker.core.impl.DependencyValidatorImpl;
import de.raphaelgeissler.dependencychecker.core.impl.ManifestDataStore;

public class IntegrationTest {
	
	@Ignore
	@Test
	public void simpleControlTest() throws Exception {
		ManifestDataStore manifestDataStore = new ManifestDataStore();
		manifestDataStore.parseManifestFiles(Arrays.asList("pathtoManifestFile1", "pathToManifestFile2"));
		DependencyCheckerConfig checkerConfig = new DependencyCheckerConfig();
		checkerConfig.loadData("pathToConfigFile");
		
		DependencyValidatorImpl dependencyValidator = new DependencyValidatorImpl(checkerConfig, manifestDataStore);
		DependencyValidationResult result = dependencyValidator.validate();
		
		assertNotNull(result);
	}
}
