package de.raphaelgeissler.dependencychecker.core.impl.manifest;

import java.util.jar.Attributes.Name;
import java.util.jar.Manifest;

public class ManifestBuilder {

	private Manifest manifest;
private String requiredBundleIds = "";
	
	public ManifestBuilder() {
		this.manifest = new Manifest();
		this.manifest.getMainAttributes().putValue(Name.MANIFEST_VERSION.toString(), "1.0");
		this.manifest.getMainAttributes().putValue("Bundle-ManifestVersion", "2");
	}
	
	public ManifestBuilder symbolicName(String symbolicName) {
		manifest.getMainAttributes().putValue("Bundle-SymbolicName", symbolicName);
		return this;
	}

	public ManifestBuilder addRequiredBundle(String requiredBundleID) {
		requiredBundleIds += "," + requiredBundleID;
		return this;
	}
	
	public ManifestBuilder addRequiredBundle(String requiredBundleID, String bundleVersion) {
		requiredBundleIds += "," + requiredBundleID + ";bundle-version=\"" + bundleVersion + "\"";
		return this;
	}

	public Manifest build() {
		if(!requiredBundleIds.isEmpty())
		{
			manifest.getMainAttributes().putValue("Require-Bundle", requiredBundleIds.substring(1));
		}
		return manifest;
	}

	
}
