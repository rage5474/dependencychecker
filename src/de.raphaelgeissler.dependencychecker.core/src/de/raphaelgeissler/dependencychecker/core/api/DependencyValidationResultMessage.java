package de.raphaelgeissler.dependencychecker.core.api;

public interface DependencyValidationResultMessage {

	public String getPluginId();
	
	public String getWrongDependency();

	public int getLineNumber();

}
