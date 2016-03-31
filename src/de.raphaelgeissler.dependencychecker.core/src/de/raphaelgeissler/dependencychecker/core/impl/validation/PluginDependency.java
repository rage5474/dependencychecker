package de.raphaelgeissler.dependencychecker.core.impl.validation;

public class PluginDependency {

	private PluginInfo sourcePlugin;
	private PluginInfo destPlugin;
	private boolean allowed;

	public PluginDependency(final PluginInfo sourcePlugin, final PluginInfo destPlugin) {
		this(sourcePlugin,destPlugin,true);
	}

	public PluginDependency(final PluginInfo sourcePlugin, final PluginInfo destPlugin, final boolean allowed) {
		this.sourcePlugin = sourcePlugin;
		this.destPlugin = destPlugin;
		this.allowed = allowed;
	}

	public PluginInfo getSourcePlugin() {
		return sourcePlugin;
	}

	public PluginInfo getDestPlugin() {
		return destPlugin;
	}

	public boolean isAllowed() {
		return allowed;
	}

	@Override
	public String toString() {
		return "PluginDependency [" + sourcePlugin + "-->" + destPlugin + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((destPlugin == null) ? 0 : destPlugin.hashCode());
		result = prime * result + ((sourcePlugin == null) ? 0 : sourcePlugin.hashCode());
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
		PluginDependency other = (PluginDependency) obj;
		if (destPlugin == null) {
			if (other.destPlugin != null)
				return false;
		} else if (!destPlugin.equals(other.destPlugin))
			return false;
		if (sourcePlugin == null) {
			if (other.sourcePlugin != null)
				return false;
		} else if (!sourcePlugin.equals(other.sourcePlugin))
			return false;
		return true;
	}

}
