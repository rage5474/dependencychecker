package de.raphaelgeissler.dependencychecker.core.impl.validation;

import static org.junit.Assert.*;

import java.io.File;
import java.util.Arrays;
import java.util.jar.Manifest;

import org.junit.Before;
import org.junit.Test;

import de.raphaelgeissler.dependencychecker.Checker;
import de.raphaelgeissler.dependencychecker.core.api.DependencyValidationResult;
import de.raphaelgeissler.dependencychecker.core.api.DependencyValidator;
import de.raphaelgeissler.dependencychecker.core.impl.manifest.ManifestBuilder;
import de.raphaelgeissler.dependencychecker.core.impl.manifest.ManifestDataStore;
import de.raphaelgeissler.dependencychecker.core.impl.validation.DValBuilder;
import de.raphaelgeissler.dependencychecker.core.impl.validation.DValCompBuilder;
import de.raphaelgeissler.dependencychecker.core.impl.validation.DependencyCheckerConfig;
import de.raphaelgeissler.dependencychecker.core.impl.validation.DependencyValidatorImpl;

public class DependencyValidatorTest extends AbstractDependencyCheckerConfigTest {

	private DependencyCheckerConfig dependencyCheckerConfig;
	private ManifestDataStore manifestDataStore;

	@Before
	public void setup() {
		File configFile = new File("files/example/example.dependencychecker");
		dependencyCheckerConfig = new DependencyCheckerConfig();
		dependencyCheckerConfig.loadData(configFile.getAbsolutePath());

		File manifestCore = new File("files/example/core/MANIFEST.MF");
		File manifestModel = new File("files/example/model/MANIFEST.MF");
		File manifestUI = new File("files/example/ui/MANIFEST.MF");

		manifestDataStore = new ManifestDataStore();
		manifestDataStore.parseManifestFiles(Arrays.asList(manifestCore.getAbsolutePath(),
				manifestModel.getAbsolutePath(), manifestUI.getAbsolutePath()));

	}

	@Test
	public void complexFailingValidation() throws Exception {
		DependencyValidator dependencyValidator = new DependencyValidatorImpl(dependencyCheckerConfig.getChecker(),
				manifestDataStore);
		DependencyValidationResult result = dependencyValidator.validate();

		assertFalse(result.wasSuccessful());
		assertTrue(result.getResultMessages().size() == 3);
		assertEquals("de.raphaelgeissler.example.ui", result.getResultMessages().get(2).getPluginId());
		assertEquals("de.raphaelgeissler.example.model", result.getResultMessages().get(2).getDependencyPluginId());
		assertEquals(7, result.getResultMessages().get(2).getLineNumber());
		assertFalse(result.getResultMessages().get(2).correct());
	}

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

		System.out.println(result.getResultMessages());
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
