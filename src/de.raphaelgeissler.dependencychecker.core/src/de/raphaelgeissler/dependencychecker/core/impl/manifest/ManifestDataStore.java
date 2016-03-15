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

	private Map<String, List<String>> dependencyMap = new HashMap<>();
	private Map<String, Integer> lineNumberMap = new HashMap<>();

	public ManifestDataStore() {
	}

	
	public boolean parseManifestFiles(List<String> pathToManifestFiles) {
		for (String nextPathToManifest : pathToManifestFiles) {
			try {
				File manifestFile = new File(nextPathToManifest);
				parseManifestFile(manifestFile);
			} catch (IOException e) {
				dependencyMap.clear();
				return false;
			}
		}
		return true;
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
			dependencyMap.put(bundleID, requireBundles);

			int lineNumber = getLineNumber(file);
			lineNumberMap.put(bundleID, lineNumber);

		} catch (IOException ex) {
			throw ex;
		}
	}

	private String parseBundleID(Manifest manifest) {
		return manifest.getMainAttributes().getValue("Bundle-SymbolicName").split(";")[0];
	}

	private List<String> parseRequireBundleAttribute(Manifest manifest) {
		final List<String> requireBundleList = new ArrayList<String>();

		final Attributes mainAttributes = manifest.getMainAttributes();
		final String requireBundleAttribute = mainAttributes.getValue("Require-Bundle");
		if (requireBundleAttribute != null) {
			final String[] requireBundles = requireBundleAttribute.split(",");
			for (String nextRequireBundle : requireBundles) {
				requireBundleList.add(nextRequireBundle.split(";")[0]);
			}
		}

		return requireBundleList;
	}

	private int getLineNumber(File manifestFile) throws IOException {

		Map<String, List<Integer>> result = LineNumberFinder.find(Arrays.asList("Require-Bundle"), manifestFile);
		List<Integer> lineNumbers = result.get("Require-Bundle");

		if (lineNumbers.isEmpty())
			return 0;
		else
			return lineNumbers.get(0);
	}

	public List<String> getDependencies(String pluginId) {
		return dependencyMap.get(pluginId);
	}

	public List<String> getIDs() {
		return new ArrayList<>(dependencyMap.keySet());
	}

	public int getLineNumber(String pluginId) {
		return lineNumberMap.get(pluginId);
	}

}