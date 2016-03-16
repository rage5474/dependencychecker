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

		ComponentDescription pluginComp = foundComponentOfPlugin(pluginToValidate, checkerConfig);
		ComponentDescription dependentPluginComp = foundComponentOfPlugin(dependentPlugin, checkerConfig);

		// One plug-in not specified for checking 
		// --> is allowed by specification.
		if (pluginComp == null || dependentPluginComp == null) {
			return true;
			// Same component --> is allowed by specification
		} else if (pluginComp.equals(dependentPluginComp)) {
			return true;
			// Dependency is not allowed by definition in checker file
		} else if (dependentCompIsForbidden(pluginComp, dependentPluginComp)) {
			return false;
			// Dependency not forbidden and communication via port
		} else if (dependentPluginIsPort(dependentPlugin, dependentPluginComp)) {
			return true;
		} else {
			return false;
		}
	}

	private boolean dependentPluginIsPort(String dependentPlugin, ComponentDescription dependentPluginComp) {
		for (ComponentItemDescription nextComponentItemDescription : dependentPluginComp.getPorts()) {
			if (WildCardMatcher.isMatching(dependentPlugin, nextComponentItemDescription.getId()))
				return true;
		}
		return false;
	}

	private boolean dependentCompIsForbidden(ComponentDescription pluginComp,
			ComponentDescription dependentPluginComp) {
		for (String nextForbiddenComponent : pluginComp.getForbiddenComponents()) {
			if (nextForbiddenComponent.equals(dependentPluginComp.getName()))
				return true;
		}

		return false;
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

}
