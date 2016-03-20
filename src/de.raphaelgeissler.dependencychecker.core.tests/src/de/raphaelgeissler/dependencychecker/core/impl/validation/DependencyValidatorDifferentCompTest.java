package de.raphaelgeissler.dependencychecker.core.impl.validation;

import static org.junit.Assert.assertFalse;

import java.util.Arrays;
import java.util.jar.Manifest;

import org.junit.Test;

import de.raphaelgeissler.dependencychecker.Checker;
import de.raphaelgeissler.dependencychecker.core.api.DependencyValidationResult;
import de.raphaelgeissler.dependencychecker.core.api.DependencyValidator;
import de.raphaelgeissler.dependencychecker.core.impl.manifest.ManifestBuilder;
import de.raphaelgeissler.dependencychecker.core.impl.manifest.ManifestDataStore;

public class DependencyValidatorDifferentCompTest extends AbstractDependencyCheckerConfigTest {

	@Test
	public void onlyRequiredBundle() throws Exception {
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
	public void onlyImportPackage() throws Exception {
		Checker checker = new DValBuilder("TestConfig")
				.comp(new DValCompBuilder("Core").id("de.ragedev.example.core.*").port("de.ragedev.example.core.api"))
				.comp(new DValCompBuilder("UI").id("de.ragedev.example.ui.*")).build();

		Manifest manifestCorePlugin1 = new ManifestBuilder().symbolicName("de.ragedev.example.core.plugin1").build();
		Manifest manifestUiPlugin1 = new ManifestBuilder().symbolicName("de.ragedev.example.ui.plugin1")
				.addImportPackage("de.ragedev.example.core.plugin1").build();

		ManifestDataStore store = new ManifestDataStore();
		store.parseManifests(Arrays.asList(manifestCorePlugin1, manifestUiPlugin1));

		DependencyValidator dependencyValidator = new DependencyValidatorImpl(checker, store);
		DependencyValidationResult result = dependencyValidator.validate();

		assertFalse(result.wasSuccessful());
	}

}
