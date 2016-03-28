package de.raphaelgeissler.dependencychecker.core.impl.validation;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.jar.Manifest;

import org.junit.Test;

import de.raphaelgeissler.dependencychecker.Checker;
import de.raphaelgeissler.dependencychecker.core.api.DependencyValidationResult;
import de.raphaelgeissler.dependencychecker.core.api.DependencyValidator;
import de.raphaelgeissler.dependencychecker.core.impl.manifest.ManifestBuilder;
import de.raphaelgeissler.dependencychecker.core.impl.manifest.ManifestDataStore;

public class DependencyValidatorSameCompTest extends AbstractDependencyCheckerConfigTest {


	@Test
	public void onlyRequiredBundle() throws Exception {
		Checker checker = new DValBuilder("TestConfig")
				.comp(new DValCompBuilder("Core").id("de.ragedev.example.core.*")).build();

		Manifest manifestCorePlugin1 = new ManifestBuilder().symbolicName("de.ragedev.example.core.plugin1").build();
		Manifest manifestCorePlugin2 = new ManifestBuilder().symbolicName("de.ragedev.example.core.plugin2")
				.addRequiredBundle("de.ragedev.example.core.plugin1").build();

		ManifestDataStore store = new ManifestDataStore();
		store.parseManifests(Arrays.asList(manifestCorePlugin1, manifestCorePlugin2));

		DependencyValidator dependencyValidator = new DependencyValidatorImpl(checker, store);
		DependencyValidationResult result = dependencyValidator.validate();

		assertTrue(result.wasSuccessful());
	}
	
	@Test
	public void onlyImportPackage() throws Exception {
		Checker checker = new DValBuilder("TestConfig")
				.comp(new DValCompBuilder("Core").id("de.ragedev.example.core.*")).build();

		Manifest manifestCorePlugin1 = new ManifestBuilder().symbolicName("de.ragedev.example.core.plugin1").build();
		Manifest manifestCorePlugin2 = new ManifestBuilder().symbolicName("de.ragedev.example.core.plugin2")
				.addImportPackage("de.ragedev.example.core.plugin1").build();

		ManifestDataStore store = new ManifestDataStore();
		store.parseManifests(Arrays.asList(manifestCorePlugin1, manifestCorePlugin2));

		DependencyValidator dependencyValidator = new DependencyValidatorImpl(checker, store);
		DependencyValidationResult result = dependencyValidator.validate();

		assertTrue(result.wasSuccessful());
	}
	
	@Test
	public void ignoringImportPackage() throws Exception {
		Checker checker = new DValBuilder("TestConfig")
				.comp(new DValCompBuilder("Core").id("de.ragedev.example.core.*").forbidden("UI")).comp(new DValCompBuilder("UI").id("de.ragedev.example.ui.*")).build();

		Manifest manifestUiPlugin1 = new ManifestBuilder().symbolicName("de.ragedev.example.ui.plugin1").build();
		Manifest manifestCorePlugin1 = new ManifestBuilder().symbolicName("de.ragedev.example.core.plugin1")
				.addImportPackage("de.ragedev.example.ui.plugin1").build();

		ManifestDataStore store = new ManifestDataStore();
		store.parseManifests(Arrays.asList(manifestUiPlugin1, manifestCorePlugin1));

		DependencyValidator dependencyValidator = new DependencyValidatorImpl(checker, store, false);
		DependencyValidationResult result = dependencyValidator.validate();

		assertTrue(result.wasSuccessful());
	}
	

}
