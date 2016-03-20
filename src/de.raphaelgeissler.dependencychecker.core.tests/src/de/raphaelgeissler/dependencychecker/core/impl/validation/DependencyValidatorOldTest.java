package de.raphaelgeissler.dependencychecker.core.impl.validation;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.jar.Manifest;

import org.junit.Test;

import de.raphaelgeissler.dependencychecker.Checker;
import de.raphaelgeissler.dependencychecker.core.api.DependencyValidationResult;
import de.raphaelgeissler.dependencychecker.core.api.DependencyValidator;
import de.raphaelgeissler.dependencychecker.core.impl.manifest.ManifestBuilder;
import de.raphaelgeissler.dependencychecker.core.impl.manifest.ManifestDataStore;

public class DependencyValidatorOldTest extends AbstractDependencyCheckerConfigTest {

	@Test
	public void testName() throws Exception {

		Checker checker = new DValBuilder("TestConfig")
				.comp(new DValCompBuilder("Core").id("de.ragedev.example.core.*").forbidden("UI"))
				.comp(new DValCompBuilder("UI").id("de.ragedev.example.ui.*")).build();
		Manifest manifestCorePlugin1 = new ManifestBuilder().symbolicName("de.ragedev.example.core.plugin1").build();
		Manifest manifestCorePlugin2 = new ManifestBuilder().symbolicName("de.ragedev.example.core.plugin2").build();
		Manifest manifestCoreAPIPlugin = new ManifestBuilder().symbolicName("de.ragedev.example.core.api")
				.addRequiredBundle("de.ragedev.example.ui.plugin1").build();
		Manifest manifestUI = new ManifestBuilder().symbolicName("de.ragedev.example.ui.plugin1")
				.addRequiredBundle("de.ragedev.example.core.api").build();

		ManifestDataStore store = new ManifestDataStore();
		store.parseManifests(
				Arrays.asList(manifestCorePlugin1, manifestCorePlugin2, manifestCoreAPIPlugin, manifestUI));

		DependencyValidator dependencyValidator = new DependencyValidatorImpl(checker, store);
		DependencyValidationResult result = dependencyValidator.validate();

		assertFalse(result.wasSuccessful());

	}

	@Test
	public void sameComponent() throws Exception {
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
	public void differentComponents() throws Exception {
		Checker checker = new DValBuilder("TestConfig")
				.comp(new DValCompBuilder("Core").id("de.ragedev.example.core.*").port("de.ragedev.example.core.api"))
				.comp(new DValCompBuilder("UI").id("de.ragedev.example.ui.*")).build();

		Manifest manifestCorePlugin1 = new ManifestBuilder().symbolicName("de.ragedev.example.core.plugin1").build();
		Manifest manifestUiPlugin1 = new ManifestBuilder().symbolicName("de.ragedev.example.ui.plugin1")
				.addRequiredBundle("de.ragedev.example.core.plugin1").build();

		ManifestDataStore store = new ManifestDataStore();
		store.parseManifests(Arrays.asList(manifestCorePlugin1, manifestUiPlugin1));

		DependencyValidator dependencyValidator = new DependencyValidatorImpl(checker, store);
		DependencyValidationResult result = dependencyValidator.validate();

		assertFalse(result.wasSuccessful());
	}
	
	@Test
	public void differentComponentsAndPort() throws Exception {
		Checker checker = new DValBuilder("TestConfig")
				.comp(new DValCompBuilder("Core").id("de.ragedev.example.core.*").port("de.ragedev.example.core.api"))
				.comp(new DValCompBuilder("UI").id("de.ragedev.example.ui.*")).build();

		Manifest manifestCorePlugin1 = new ManifestBuilder().symbolicName("de.ragedev.example.core.plugin1").build();
		Manifest manifestUiPlugin1 = new ManifestBuilder().symbolicName("de.ragedev.example.ui.plugin1")
				.addRequiredBundle("de.ragedev.example.core.api").build();

		ManifestDataStore store = new ManifestDataStore();
		store.parseManifests(Arrays.asList(manifestCorePlugin1, manifestUiPlugin1));

		DependencyValidator dependencyValidator = new DependencyValidatorImpl(checker, store);
		DependencyValidationResult result = dependencyValidator.validate();

		assertTrue(result.wasSuccessful());
	}
	
	@Test
	public void differentComponentsAndForbidden() throws Exception {
		Checker checker = new DValBuilder("TestConfig")
				.comp(new DValCompBuilder("Core").id("de.ragedev.example.core.*").port("de.ragedev.example.core.api"))
				.comp(new DValCompBuilder("UI").id("de.ragedev.example.ui.*").forbidden("Core")).build();

		Manifest manifestCorePlugin1 = new ManifestBuilder().symbolicName("de.ragedev.example.core.plugin1").build();
		Manifest manifestUiPlugin1 = new ManifestBuilder().symbolicName("de.ragedev.example.ui.plugin1")
				.addRequiredBundle("de.ragedev.example.core.api").build();

		ManifestDataStore store = new ManifestDataStore();
		store.parseManifests(Arrays.asList(manifestCorePlugin1, manifestUiPlugin1));

		DependencyValidator dependencyValidator = new DependencyValidatorImpl(checker, store);
		DependencyValidationResult result = dependencyValidator.validate();

		assertFalse(result.wasSuccessful());
	}

}
