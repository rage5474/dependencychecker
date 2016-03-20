package de.raphaelgeissler.dependencychecker.core.impl.validation;

import de.raphaelgeissler.dependencychecker.core.api.DependencyValidationResultMessage;

public final class DependencyValidationResultMessageImpl implements DependencyValidationResultMessage {
	private final boolean correct;
	private final int lineNumber;
	private final String dependentPlugin;
	private final String bundleID;

	public DependencyValidationResultMessageImpl(boolean correct, int lineNumber, String dependentPlugin,
			String bundleID) {
		this.correct = correct;
		this.lineNumber = lineNumber;
		this.dependentPlugin = dependentPlugin;
		this.bundleID = bundleID;
	}

	@Override
	public String getDependencyPluginId() {
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

	@Override
	public boolean correct() {
		return correct;
	}

	@Override
	public String toString() {

		String checkMarkSymbol = Character.toString((char)((int)0x2714));
		
		String successSymbol = correct ? checkMarkSymbol : "X"; 
		
		return bundleID + " --> " + dependentPlugin + " | " + successSymbol + " | " + lineNumber ;
	}
}
