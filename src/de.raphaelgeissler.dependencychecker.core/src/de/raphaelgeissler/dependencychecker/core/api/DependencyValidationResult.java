package de.raphaelgeissler.dependencychecker.core.api;

import java.util.List;

public interface DependencyValidationResult {
	public boolean wasSuccessful();
	
	public List<DependencyValidationResultMessage> getResultMessages();
}
