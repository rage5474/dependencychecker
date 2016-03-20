package de.raphaelgeissler.dependencychecker.core.impl.manifest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.jar.Attributes;
import java.util.jar.Manifest;

public class ManifestDataStore {

	private static final String BUNDLE_SYMBOLIC_NAME = "Bundle-SymbolicName";
	private static final String REQUIRE_BUNDLE = "Require-Bundle";
	private static final String IMPORT_PACKAGE = "Import-Package";
	
	private Map<String, PluginData> pluginDataMap = new HashMap<>();

	public ManifestDataStore() {
	}
	
	public boolean parseManifestFiles(List<String> pathToManifestFiles) {
		for (String nextPathToManifest : pathToManifestFiles) {
			try {
				File manifestFile = new File(nextPathToManifest);
				parseManifestFile(manifestFile);
			} catch (IOException e) {
				cleanup();
				return false;
			}
		}
		return true;
	}

	private void cleanup() {
		pluginDataMap.clear();
	}

	public boolean parseManifests(List<Manifest> manifests) {
		List<String> pathToManifestFiles = new ArrayList<String>();
		
		for(int i = 0; i < manifests.size(); i++)
		{
			try {
				File file = File.createTempFile("MANIFEST" + i, "MF");
				file.deleteOnExit();
				FileOutputStream stream = new FileOutputStream(file);
				manifests.get(i).write(stream);
				stream.close();
				pathToManifestFiles.add(file.getAbsolutePath());
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		parseManifestFiles(pathToManifestFiles );
		return true;
	}
	
	private void parseManifestFile(File file) throws IOException {
		try (InputStream is = new FileInputStream(file)) {
			Manifest manifest = new Manifest(is);

			String bundleID = parseBundleID(manifest);
			List<String> requireBundles = parseRequireBundleAttribute(manifest);
			List<String> importPackages = parseImportPackageAttribute(manifest);
			Map<String, List<Integer>> lineNumbers = getLineNumber(Arrays.asList(REQUIRE_BUNDLE,IMPORT_PACKAGE),file);
			
			pluginDataMap.put(bundleID, new PluginData(bundleID, requireBundles, importPackages, getRequiredBundleLineNumber(lineNumbers), getImportPackageLineNumber(lineNumbers)));
			
		} catch (IOException ex) {
			throw ex;
		}
	}

	private Integer getRequiredBundleLineNumber(Map<String, List<Integer>> lineNumbers) {
		return getLineNumber(REQUIRE_BUNDLE, lineNumbers);
	}

	private Integer getLineNumber(String value, Map<String, List<Integer>> lineNumbers) {
		List<Integer> result = lineNumbers.get(value);
		if(result.isEmpty())
			return null;
		else
			return result.get(0);
	}
	
	private Integer getImportPackageLineNumber(Map<String, List<Integer>> lineNumbers) {
		return getLineNumber(IMPORT_PACKAGE, lineNumbers);
	}

	private String parseBundleID(Manifest manifest) {
		return manifest.getMainAttributes().getValue(BUNDLE_SYMBOLIC_NAME).split(";")[0];
	}

	private List<String> parseRequireBundleAttribute(Manifest manifest) {
		return parseRequireBundleAttribute(REQUIRE_BUNDLE, manifest);
	}
	
	private List<String> parseImportPackageAttribute(Manifest manifest) {
		return parseRequireBundleAttribute(IMPORT_PACKAGE, manifest);
	}
	
	private List<String> parseRequireBundleAttribute(String value, Manifest manifest) {
		final List<String> requireBundleList = new ArrayList<String>();

		final Attributes mainAttributes = manifest.getMainAttributes();
		final String requireBundleAttribute = mainAttributes.getValue(value);
		if (requireBundleAttribute != null) {
			final String[] requireBundles = requireBundleAttribute.split(",");
			for (String nextRequireBundle : requireBundles) {
				requireBundleList.add(nextRequireBundle.split(";")[0]);
			}
		}

		return requireBundleList;
	}

	private Map<String, List<Integer>> getLineNumber(List<String> searchStrings, File manifestFile) throws IOException {
		return LineNumberFinder.find(searchStrings, manifestFile);
	}

	public List<String> getIDs() {
		return new ArrayList<>(pluginDataMap.keySet());
	}

	public PluginData getPluginData(String pluginId) {
		return pluginDataMap.get(pluginId);
	}

}
