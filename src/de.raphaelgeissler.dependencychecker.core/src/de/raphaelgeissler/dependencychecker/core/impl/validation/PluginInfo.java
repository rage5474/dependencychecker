package de.raphaelgeissler.dependencychecker.core.impl.validation;

public class PluginInfo implements Comparable<PluginInfo>{

	private final String pluginId;
	
	private final PackageInfo packageName;
	
	private final boolean isPort;
	
	public PluginInfo(final String pluginId, String packageName, boolean isPort) {
		this.pluginId = pluginId;
		this.packageName = new PackageInfo(packageName);
		this.isPort = isPort;
	}
	
	public PluginInfo(final String pluginId, PackageInfo packageName, boolean isPort) {
		this.pluginId = pluginId;
		this.packageName = packageName;
		this.isPort = isPort;
	}

	public String getPluginId() {
		return pluginId;
	}

	public PackageInfo getPackageInfo() {
		return packageName;
	}

	public boolean isPort() {
		return isPort;
	}
	
	@Override
	public int compareTo(PluginInfo arg0) {
		int packageNameCompareResult =  packageName.getName().compareTo(arg0.packageName.getName());
		if(packageNameCompareResult != 0)
			return packageNameCompareResult;
		if(isPort && !arg0.isPort)
			return -1;
		if(!isPort && arg0.isPort)
			return 1;
		
		return  pluginId.compareTo(arg0.pluginId);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((packageName == null) ? 0 : packageName.hashCode());
		result = prime * result + ((pluginId == null) ? 0 : pluginId.hashCode());
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
		PluginInfo other = (PluginInfo) obj;
		if (packageName == null) {
			if (other.packageName != null)
				return false;
		} else if (!packageName.equals(other.packageName))
			return false;
		if (pluginId == null) {
			if (other.pluginId != null)
				return false;
		} else if (!pluginId.equals(other.pluginId))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "PluginInfo [pluginId=" + pluginId + ", packageName=" + packageName + ", isPort=" + isPort + "]";
	}


	
	
}
