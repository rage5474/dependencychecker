package de.raphaelgeissler.dependencychecker.core.impl.manifest;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import de.raphaelgeissler.dependencychecker.core.impl.manifest.ManifestDataStore;

public class ManifestDataStoreTest {

	private ManifestDataStore manifestDataStore;

	@Before
	public void setup()
	{
		File manifestCore = new File("files/example/core/MANIFEST.MF");
		File manifestModel = new File("files/example/model/MANIFEST.MF");
		
		manifestDataStore = new ManifestDataStore();
		manifestDataStore.parseManifestFiles(Arrays.asList(manifestCore.getAbsolutePath(),manifestModel.getAbsolutePath()));
		
	}
	
	@Test
	public void parseTwoManifest() throws Exception {
		
		List<String> dependenciesCore = manifestDataStore.getDependencies("de.raphaelgeissler.example.core");
		List<String> expectedDependenciesCore = Arrays.asList("de.raphaelgeissler.example.model");
		
		List<String> dependenciesModel = manifestDataStore.getDependencies("de.raphaelgeissler.example.model");
		List<String> expecteddependenciesModel = new ArrayList<>();

		assertEquals(expectedDependenciesCore, dependenciesCore);
		assertEquals(expecteddependenciesModel, dependenciesModel);
	}
	
	@Test
	public void getManifestIDs() throws Exception {
		
		List<String> expectedResult = Arrays.asList("de.raphaelgeissler.example.core","de.raphaelgeissler.example.model");
		
		assertEquals(expectedResult, manifestDataStore.getIDs());
	}
	
}
