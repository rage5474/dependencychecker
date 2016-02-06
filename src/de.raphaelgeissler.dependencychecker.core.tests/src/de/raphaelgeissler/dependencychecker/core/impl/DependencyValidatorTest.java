package de.raphaelgeissler.dependencychecker.core.impl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.util.Arrays;

import org.junit.Test;

import de.raphaelgeissler.dependencychecker.core.api.DependencyValidationResult;
import de.raphaelgeissler.dependencychecker.core.api.DependencyValidator;

public class DependencyValidatorTest {
	
	@Test
	public void complexFailingValidation() throws Exception {
		File configFile = new File("files/example/example.dependencychecker");
		DependencyCheckerConfig dependencyCheckerConfig = new DependencyCheckerConfig();
		dependencyCheckerConfig.loadData(configFile.getAbsolutePath());
		
		File manifestCore = new File("files/example/core/MANIFEST.MF");
		File manifestModel = new File("files/example/model/MANIFEST.MF");
		File manifestUI = new File("files/example/ui/MANIFEST.MF");
		
		ManifestDataStore manifestDataStore = new ManifestDataStore();
		manifestDataStore.parseManifestFiles(Arrays.asList(manifestCore.getAbsolutePath(),manifestModel.getAbsolutePath(),manifestUI.getAbsolutePath()));
		
		DependencyValidator dependencyValidator = new DependencyValidatorImpl(dependencyCheckerConfig, manifestDataStore);
		
		DependencyValidationResult result = dependencyValidator.validate();
		assertFalse(result.wasSuccessful());
		assertTrue(result.getResultMessages().size() == 1);
		assertEquals("de.raphaelgeissler.example.ui", result.getResultMessages().get(0).getPluginId());
		assertEquals("de.raphaelgeissler.example.model", result.getResultMessages().get(0).getDependencyPluginId());
		assertEquals(7, result.getResultMessages().get(0).getLineNumber());
	}
}
