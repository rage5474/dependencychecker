package de.raphaelgeissler.dependencychecker.core.impl;

import java.util.ArrayList;
import java.util.List;

import de.raphaelgeissler.dependencychecker.core.api.DependencyValidationResult;
import de.raphaelgeissler.dependencychecker.core.api.DependencyValidationResultMessage;

public class DependencyValidationResultImpl implements DependencyValidationResult{

	private boolean successful = true;
	private List<DependencyValidationResultMessage> resultMessages = new ArrayList<>();

	public DependencyValidationResultImpl() {
	}
	
	public void setSuccessful(boolean successful)
	{
		this.successful = successful;
	}
	
	@Override
	public boolean wasSuccessful() {
		return successful;
	}

	public void addResultMessage(final String bundleID, final String dependentPlugin, final int lineNumber)
	{
		resultMessages.add(new DependencyValidationResultMessage() {
			
			@Override
			public String getWrongDependency() {
				return dependentPlugin;
			}
			
			@Override
			public int getLineNumber() {
				return lineNumber;
			}

			@Override
			public String getPluginId() {
				return bundleID;
			}
		});
	}
	
	@Override
	public List<DependencyValidationResultMessage> getResultMessages() {
		return resultMessages;
	}

}
