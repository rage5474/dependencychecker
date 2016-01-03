package de.raphaelgeissler.dependencychecker.core.impl;

import java.util.List;

import de.raphaelgeissler.dependencychecker.Checker;
import de.raphaelgeissler.dependencychecker.ComponentDescription;
import de.raphaelgeissler.dependencychecker.ComponentItemDescription;
import de.raphaelgeissler.dependencychecker.MatchType;
import de.raphaelgeissler.dependencychecker.SelectionType;
import de.raphaelgeissler.dependencychecker.core.api.DependencyValidationResult;
import de.raphaelgeissler.dependencychecker.core.api.DependencyValidator;

public class DependencyValidatorImpl implements DependencyValidator {

	private DependencyCheckerConfig checkerConfig;
	private ManifestDataStore manifestDataStore;

	public DependencyValidatorImpl(DependencyCheckerConfig checkerConfig, ManifestDataStore manifestDataStore) {
		this.checkerConfig = checkerConfig;
		this.manifestDataStore = manifestDataStore;
	}

	@Override
	public DependencyValidationResult validate() {

		DependencyValidationResultImpl result = new DependencyValidationResultImpl();

		for (String nextPluginToValidate : manifestDataStore.getIDs()) {
			List<String> dependentPlugins = manifestDataStore.getDependencies(nextPluginToValidate);
			for (String nextDependentPlugin : dependentPlugins) {
				if (!validate(nextPluginToValidate, nextDependentPlugin, checkerConfig.getChecker())) {
					result.setSuccessful(false);
					result.addResultMessage(nextPluginToValidate, nextDependentPlugin, manifestDataStore.getLineNumber(nextPluginToValidate));
				}
			}
		}

		return result;
	}

	private boolean validate(String pluginToValidate, String dependentPlugin, Checker checkerConfig) {

		ComponentDescription group = foundComponentOfPlugin(pluginToValidate, checkerConfig);

		if (group != null) {
			if (group.getDependencies().getType() == SelectionType.EXCLUDE) {
				
				boolean result = true;
				for(String nextDependencyGroup : group.getDependencies().getComponents())
				{
//					Group notAllowedGroup = foundGroupOfPlugin(nextDependencyGroup, checkerConfig);
					ComponentDescription notAllowedGroup = getComponentByName(nextDependencyGroup, checkerConfig);
					if(notAllowedGroup != null && !isDependencyAllowed(dependentPlugin, notAllowedGroup))
						result &= false;
				}
				
				return result;
			} else if (group.getDependencies().getType() == SelectionType.INCLUDE) {
				throw new UnsupportedOperationException("SelectionType INCLUDE not implemented yet.");
			} else {
				throw new IllegalArgumentException(
						"SelectionType " + group.getDependencies().getType().toString() + " not supported.");
			}

		}

		return true;
	}

	private ComponentDescription getComponentByName(String nextDependencyGroup, Checker checkerConfig) {
		for(ComponentDescription nextComponent : checkerConfig.getComponentDefinitions())
		{
			if(nextComponent.getName().equals(nextDependencyGroup))
				return nextComponent;
		}
		return null;
	}

	private boolean isDependencyAllowed(String dependentPlugin, ComponentDescription notAllowedGroup) {
		boolean result = true;
		for (ComponentItemDescription nextNotAllowedEntry : notAllowedGroup.getComponentItems()) {
			if(nextNotAllowedEntry.getMatchType() == MatchType.STARTSWITH)
			{
				if (dependentPlugin.startsWith(nextNotAllowedEntry.getValue()))
					result &= false;
			}
			else
			{
				throw new UnsupportedOperationException("MatchType " + nextNotAllowedEntry.getMatchType() + " not implemented.");
			}
		}
		return result;
	}

	private ComponentDescription foundComponentOfPlugin(String pluginToValidate, Checker checkerConfig) {

		for (ComponentDescription nextComponent : checkerConfig.getComponentDefinitions()) {
			if (isPluginInComponent(pluginToValidate, nextComponent))
				return nextComponent;
		}

		return null;
	}

	private boolean isPluginInComponent(String pluginToValidate, ComponentDescription group) {
		for (ComponentItemDescription nextComponentItem : group.getComponentItems()) {
			if (nextComponentItem.getMatchType() == MatchType.STARTSWITH) {
				return pluginToValidate.startsWith(nextComponentItem.getValue());
			} else if (nextComponentItem.getMatchType() == MatchType.EQUALS) {
				throw new UnsupportedOperationException("MatchType EQUALS not implemented yet.");
			} else if (nextComponentItem.getMatchType() == MatchType.REGEX) {
				throw new UnsupportedOperationException("MatchType EQUALS not implemented yet.");
			} else {
				throw new IllegalArgumentException(
						"MatchType " + nextComponentItem.getMatchType().toString() + " is not supported.");
			}
		}
		return false;
	}

}
