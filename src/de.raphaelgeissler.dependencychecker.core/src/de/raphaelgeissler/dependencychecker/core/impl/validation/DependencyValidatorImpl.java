package de.raphaelgeissler.dependencychecker.core.impl.validation;

import java.util.List;

import de.raphaelgeissler.dependencychecker.Checker;
import de.raphaelgeissler.dependencychecker.ComponentDescription;
import de.raphaelgeissler.dependencychecker.ComponentItemDescription;
import de.raphaelgeissler.dependencychecker.core.api.DependencyValidationResult;
import de.raphaelgeissler.dependencychecker.core.api.DependencyValidator;
import de.raphaelgeissler.dependencychecker.core.impl.manifest.ManifestDataStore;

public class DependencyValidatorImpl implements DependencyValidator {

	private ManifestDataStore manifestDataStore;
	private Checker checker;

	public DependencyValidatorImpl(Checker checker, ManifestDataStore manifestDataStore) {
		this.checker = checker;
		this.manifestDataStore = manifestDataStore;
	}

	@Override
	public DependencyValidationResult validate() {

		DependencyValidationResultImpl result = new DependencyValidationResultImpl();

		for (String nextPluginToValidate : manifestDataStore.getIDs()) {
			List<String> dependentPlugins = manifestDataStore.getDependencies(nextPluginToValidate);
			for (String nextDependentPlugin : dependentPlugins) {
				if (!validate(nextPluginToValidate, nextDependentPlugin, checker)) {
					result.setSuccessful(false);
					result.addResultMessage(nextPluginToValidate, nextDependentPlugin,
							manifestDataStore.getLineNumber(nextPluginToValidate), false);
				} else {
					result.addResultMessage(nextPluginToValidate, nextDependentPlugin,
							manifestDataStore.getLineNumber(nextPluginToValidate), true);
				}
			}
		}

		return result;
	}

	private boolean validate(String pluginToValidate, String dependentPlugin, Checker checkerConfig) {

		ComponentDescription group = foundComponentOfPlugin(pluginToValidate, checkerConfig);

		if (group != null) {

			boolean result = true;
			for (String notAllowedGroup : group.getForbiddenComponents()) {
				if (notAllowedGroup != null && !isDependencyAllowed(dependentPlugin, notAllowedGroup))
					result &= false;
			}

			return result;

		}

		return true;
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
			String value = nextComponentItem.getId();
			return WildCardMatcher.isMatching(pluginToValidate, value);
		}
		return false;
	}

	private boolean isDependencyAllowed(String dependentPlugin, String notAllowedGroup) {
		ComponentDescription notAllowdComponent = getComponentByName(notAllowedGroup);
		if (notAllowdComponent != null) {
			if (isPluginInComponent(dependentPlugin, notAllowdComponent))
				return false;
		}

		return true;
	}

	private ComponentDescription getComponentByName(String notAllowedGroup) {
		for (ComponentDescription nextComponentDescription : checker.getComponentDefinitions()) {
			if (nextComponentDescription.getName().equals(notAllowedGroup))
				return nextComponentDescription;
		}
		return null;
	}

	

}
