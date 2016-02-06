package de.raphaelgeissler.dependencychecker.core.api;

public interface DependencyValidationResultMessage {

	public String getPluginId();
	
	public String getDependencyPluginId();

	public int getLineNumber();
	
	public boolean correct();

}
