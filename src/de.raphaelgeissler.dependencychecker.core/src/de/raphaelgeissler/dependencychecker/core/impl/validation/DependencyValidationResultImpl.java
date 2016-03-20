package de.raphaelgeissler.dependencychecker.core.impl.validation;

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

	public void addResultMessage(final String bundleID, final String dependentPlugin, final int lineNumber, final boolean correct)
	{
		addResultMessage(new DependencyValidationResultMessageImpl(correct, lineNumber, dependentPlugin, bundleID));
	}
	
	public void addResultMessage(final DependencyValidationResultMessage resultMessage)
	{
		resultMessages.add(resultMessage);
	}
	
	@Override
	public List<DependencyValidationResultMessage> getResultMessages() {
		return resultMessages;
	}

}
