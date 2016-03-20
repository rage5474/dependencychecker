package de.raphaelgeissler.dependencychecker.core.impl.validation;

import java.util.ArrayList;
import java.util.List;

import de.raphaelgeissler.dependencychecker.Checker;
import de.raphaelgeissler.dependencychecker.ComponentDescription;
import de.raphaelgeissler.dependencychecker.ComponentItemDescription;
import de.raphaelgeissler.dependencychecker.core.api.DependencyValidationResult;
import de.raphaelgeissler.dependencychecker.core.api.DependencyValidationResultMessage;
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
			validateRequiredBundles(result, nextPluginToValidate);
			validateImportPackages(result, nextPluginToValidate);
		}

		return result;
	}

	private void validateRequiredBundles(DependencyValidationResultImpl result, String nextPluginToValidate) {
		List<String> dependentPlugins = manifestDataStore.getPluginData(nextPluginToValidate).getRequiredBundles();
		for (String nextDependentPlugin : dependentPlugins) {
			Integer lineNumber = manifestDataStore.getPluginData(nextPluginToValidate).getRequireBundleLineNumber();
			if (!validate(nextPluginToValidate, nextDependentPlugin, checker)) {
				result.setSuccessful(false);
				result.addResultMessage(createFailMessage(lineNumber, nextPluginToValidate, nextDependentPlugin));
			} else {
				result.addResultMessage(createSuccessMessage(lineNumber, nextPluginToValidate, nextDependentPlugin));
			}
		}
	}

	private DependencyValidationResultMessage createFailMessage(Integer lineNumber, String nextPluginToValidate,
			String nextDependentPlugin) {
		return new DependencyValidationResultMessageImpl(false, lineNumber, nextDependentPlugin, nextPluginToValidate);
	}

	private DependencyValidationResultMessage createSuccessMessage(Integer lineNumber, String nextPluginToValidate,
			String nextDependentPlugin) {
		return new DependencyValidationResultMessageImpl(true, lineNumber, nextDependentPlugin, nextPluginToValidate);
	}

	private void validateImportPackages(DependencyValidationResultImpl result, String nextPluginToValidate) {
		List<String> dependentPlugins = manifestDataStore.getPluginData(nextPluginToValidate).getImportPackages();
		for (String nextDependentPlugin : dependentPlugins) {
			Integer lineNumber = manifestDataStore.getPluginData(nextPluginToValidate).getImportPackagesLineNumber();
			if (!validate(nextPluginToValidate, nextDependentPlugin, checker)) {
				result.setSuccessful(false);
				result.addResultMessage(createFailMessage(lineNumber, nextPluginToValidate, nextDependentPlugin));
			} else {
				result.addResultMessage(createSuccessMessage(lineNumber, nextPluginToValidate, nextDependentPlugin));
			}
		}

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
		List<ComponentItemDescription> groupIds = new ArrayList<ComponentItemDescription>(group.getPorts());
		groupIds.addAll(group.getComponentItems());

		for (ComponentItemDescription nextComponentItem : groupIds) {
			String value = nextComponentItem.getId();
			if (WildCardMatcher.isMatching(pluginToValidate, value))
				return true;
		}

		return false;
	}

}
