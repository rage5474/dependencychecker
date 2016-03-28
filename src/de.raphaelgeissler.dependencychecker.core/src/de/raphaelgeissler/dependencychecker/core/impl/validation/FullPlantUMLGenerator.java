package de.raphaelgeissler.dependencychecker.core.impl.validation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import de.raphaelgeissler.dependencychecker.Checker;
import de.raphaelgeissler.dependencychecker.ComponentDescription;
import de.raphaelgeissler.dependencychecker.ComponentItemDescription;
import de.raphaelgeissler.dependencychecker.core.api.DependencyValidationResult;
import de.raphaelgeissler.dependencychecker.core.api.DependencyValidationResultMessage;

public class FullPlantUMLGenerator implements PlantUmlGenerator {

	private DependencyValidationResult result;
	private Checker checker;

	public FullPlantUMLGenerator(DependencyValidationResult result, Checker checker) {
		this.result = result;
		this.checker = checker;
	}
	
	@Override
	public String generatePackagePlantUMLString() {
		String middle = "";

		Map<String, Set<PluginInfo>> pluginInfos = new HashMap<String, Set<PluginInfo>>();
		for (DependencyValidationResultMessage nextMessage : result.getResultMessages()) {
			addPluginInfoToRightPackage(checker, pluginInfos, nextMessage.getPluginId());
			addPluginInfoToRightPackage(checker, pluginInfos, nextMessage.getDependencyPluginId());
		}

		List<String> sortedPackageNames = new ArrayList<String>(pluginInfos.keySet());
		Collections.sort(sortedPackageNames);

		for (String nextPackage : sortedPackageNames) {
			middle += "package " + nextPackage + "{\n";
			for (PluginInfo nextPluginInfo : pluginInfos.get(nextPackage)) {
				String stereoType = "<<Inner>>";
				if (nextPluginInfo.isPort())
					stereoType = "<<Port>>";
				middle += "[" + nextPluginInfo.getPluginId() + "] " + stereoType + "\n";
			}
			middle += "}\n";
		}
		return middle;
	}
	
	private void addPluginInfoToRightPackage(Checker checker, Map<String, Set<PluginInfo>> pluginInfos,
			String pluginId) {
		PluginInfo pluginInfo = getPluginInfo(pluginId, checker);
		if (!pluginInfos.containsKey(pluginInfo.getPackageInfo().getName()))
			pluginInfos.put(pluginInfo.getPackageInfo().getName(), new TreeSet<PluginInfo>());
		pluginInfos.get(pluginInfo.getPackageInfo().getName()).add(pluginInfo);
	}
	
	private PluginInfo getPluginInfo(String pluginId, Checker checker) {

		String currentPackage = "Unknown";
		boolean port = false;
		for (ComponentDescription nextComp : checker.getComponentDefinitions()) {
			for (ComponentItemDescription nextItem : nextComp.getComponentItems()) {
				if (WildCardMatcher.isMatching(pluginId, nextItem.getId())) {
					currentPackage = nextComp.getName();
				}
			}
			for (ComponentItemDescription nextItem : nextComp.getPorts()) {
				if (WildCardMatcher.isMatching(pluginId, nextItem.getId())) {
					currentPackage = nextComp.getName();
					port = true;
				}
			}

		}
		return new PluginInfo(pluginId, currentPackage, port);
	}

	@Override
	public String generateDependenciesPlantUMLString() {
		String dependenciesPlantUMLString = "";

		for (DependencyValidationResultMessage nextMessage : result.getResultMessages()) {

			String label = "";
			if (!nextMessage.correct())
				label = ":<$error>";

			dependenciesPlantUMLString += "[" + nextMessage.getPluginId() + "]" + "-->" + "["
					+ nextMessage.getDependencyPluginId() + "]" + label + "\n";
		}
		return dependenciesPlantUMLString;
	}

}
