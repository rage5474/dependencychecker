package de.raphaelgeissler.dependencychecker.core.impl.manifest;

import java.util.List;

public class PluginData {

	private final String symbolicName;
	private final List<String> requiredBundles;
	private final List<String> importPackages;
	private final Integer requireBundleLineNumber;
	private final Integer importPackagesLineNumber;

	public PluginData(String symbolicName, List<String> requiredBundles, List<String> importPackages,
			Integer requireBundleLineNumber, Integer importPackagesLineNumber) {
		this.symbolicName = symbolicName;
		this.requiredBundles = requiredBundles;
		this.importPackages = importPackages;
		this.requireBundleLineNumber = requireBundleLineNumber;
		this.importPackagesLineNumber = importPackagesLineNumber;
	}

	public String getSymbolicName() {
		return symbolicName;
	}

	public List<String> getRequiredBundles() {
		return requiredBundles;
	}

	public List<String> getImportPackages() {
		return importPackages;
	}

	public Integer getRequireBundleLineNumber() {
		return requireBundleLineNumber;
	}

	public Integer getImportPackagesLineNumber() {
		return importPackagesLineNumber;
	}

	@Override
	public String toString() {
		return "PluginData [symbolicName=" + symbolicName + ", requiredBundles=" + requiredBundles + ", importPackages="
				+ importPackages + ", requireBundleLineNumber=" + requireBundleLineNumber
				+ ", importPackagesLineNumber=" + importPackagesLineNumber + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((symbolicName == null) ? 0 : symbolicName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PluginData other = (PluginData) obj;
		if (symbolicName == null) {
			if (other.symbolicName != null)
				return false;
		} else if (!symbolicName.equals(other.symbolicName))
			return false;
		return true;
	}
}
