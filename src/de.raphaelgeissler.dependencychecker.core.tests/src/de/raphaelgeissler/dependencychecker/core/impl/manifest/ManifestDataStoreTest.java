package de.raphaelgeissler.dependencychecker.core.impl.manifest;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;
import java.util.jar.Manifest;

import org.junit.Before;
import org.junit.Test;

public class ManifestDataStoreTest {

	private ManifestDataStore manifestDataStore;

	@Before
	public void setup() {
		Manifest manifestCore = new ManifestBuilder().symbolicName("de.raphaelgeissler.example.core")
				.addRequiredBundle("de.raphaelgeissler.example.model", "1.0.0")
				.addImportPackage("de.raphaelgeissler.example.ui", "1.0.0").build();

		Manifest manifestModel = new ManifestBuilder().symbolicName("de.raphaelgeissler.example.model").build();

		Manifest manifestUi = new ManifestBuilder().symbolicName("de.raphaelgeissler.example.ui").build();

		manifestDataStore = new ManifestDataStore();
		manifestDataStore.parseManifests(Arrays.asList(manifestCore, manifestModel, manifestUi));
	}

	@Test
	public void areRequiredBundleParsedCorrect() throws Exception {

		List<String> requiredBundles =  manifestDataStore.getPluginData("de.raphaelgeissler.example.core").getRequiredBundles();
		List<String> expectedRequiredBundles = Arrays.asList("de.raphaelgeissler.example.model");

		assertEquals(expectedRequiredBundles, requiredBundles);
	}

	@Test
	public void areImportPackageParsedCorrect() throws Exception {

		List<String> importPackages = manifestDataStore.getPluginData("de.raphaelgeissler.example.core").getImportPackages();
		List<String> expectedImportPackages = Arrays.asList("de.raphaelgeissler.example.ui");

		assertEquals(expectedImportPackages, importPackages);
	}
	
	@Test
	public void testName() throws Exception {
		PluginData pluginData = manifestDataStore.getPluginData("de.raphaelgeissler.example.core");
		
		assertEquals("de.raphaelgeissler.example.core", pluginData.getSymbolicName());
		assertEquals(Arrays.asList("de.raphaelgeissler.example.model"), pluginData.getRequiredBundles());
		assertEquals(Arrays.asList("de.raphaelgeissler.example.ui"), pluginData.getImportPackages());
	}

	@Test
	public void getManifestIDs() throws Exception {
		assertTrue(manifestDataStore.getIDs().contains("de.raphaelgeissler.example.core"));
		assertTrue(manifestDataStore.getIDs().contains("de.raphaelgeissler.example.model"));
		assertTrue(manifestDataStore.getIDs().contains("de.raphaelgeissler.example.ui"));
	}

}
