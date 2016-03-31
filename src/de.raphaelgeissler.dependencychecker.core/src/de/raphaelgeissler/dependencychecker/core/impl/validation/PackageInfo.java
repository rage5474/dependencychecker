package de.raphaelgeissler.dependencychecker.core.impl.validation;

import java.util.ArrayList;
import java.util.List;

public class PackageInfo implements Comparable<PackageInfo> {

	private String name;

	private List<PackageInfo> forbiddenPackages = new ArrayList<PackageInfo>();

	public PackageInfo(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void addForbiddenPackage(PackageInfo packageInfo) {
		forbiddenPackages.add(packageInfo);
	}

	public List<PackageInfo> getForbiddenPackages() {
		return forbiddenPackages;
	}

	@Override
	public int compareTo(PackageInfo secondPackageInfo) {
		return this.name.compareTo(secondPackageInfo.name);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		PackageInfo other = (PackageInfo) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "PackageInfo [name=" + name + "]";
	}

}
