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

public class DValidationResultToPlantUMLTransformer {

	public static String transform(DependencyValidationResult result, Checker checker) {

		String start = "@startuml\n";

		String sprite = "sprite $error [16x16/16] {\n"
				+ "0000000000000000\n"
				+ "000000FFFF000000\n"
				+ "000000FFFF000000\n"
				+ "000000FFFF000000\n"
				+ "000000FFFF000000\n"
				+ "000000FFFF000000\n"
				+ "000000FFFF000000\n"
				+ "000000FFFF000000\n"
				+ "000000FFFF000000\n"
				+ "000000FFFF000000\n"
				+ "0000000000000000\n"
				+ "0000000000000000\n"
				+ "000000FFFF000000\n"
				+ "000000FFFF000000\n"
				+ "000000FFFF000000\n"
				+ "0000000000000000\n"
				+ "}\n";
		
		String skins = "skinparam componentArrowColor #black\n"
				+ "skinparam componentArrowFontColor #white\n"
				+ "skinparam component {\n"
				+ "    backgroundColor<<Port>> #00eb00\n"
				+ "    BorderColor<<Port>> #000000\n"
				+ "    backgroundColor<<Inner>> RosyBrown\n"
				+ "    BorderColor<<Inner>> #000000\n"
				+ "}\n";
		
		String packagesPlantUMLString = generatePackagePlantUMLString(result, checker);

		String dependenciesPlantUMLString = "";

		for (DependencyValidationResultMessage nextMessage : result.getResultMessages()) {

			String label = "";
			if (!nextMessage.correct())
				label = ":<$error>";

			dependenciesPlantUMLString += "[" + nextMessage.getPluginId() + "]" + "-->" + "["
					+ nextMessage.getDependencyPluginId() + "]" + label + "\n";
		}

		String legend = "legend right\n"
				+ "**Note:**\n"
				+ "Forbidden dependencies are labeled with a <$error>.\n"
				+ "endlegend\n";
		
		
		String end = "@enduml";

		String resultPlantUmlString = start + sprite + skins + packagesPlantUMLString + dependenciesPlantUMLString + legend + end;

		return resultPlantUmlString;
	}

	private static String generatePackagePlantUMLString(DependencyValidationResult result, Checker checker) {
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
				if(nextPluginInfo.isPort())
					stereoType = "<<Port>>";
				middle += "[" + nextPluginInfo.getPluginId() + "] " + stereoType + "\n";
			}
			middle += "}\n";
		}
		return middle;
	}

	private static void addPluginInfoToRightPackage(Checker checker, Map<String, Set<PluginInfo>> pluginInfos,
			String pluginId) {
		PluginInfo pluginInfo = getPluginInfo(pluginId,checker);
		if(!pluginInfos.containsKey(pluginInfo.getPackageName()))
			pluginInfos.put(pluginInfo.getPackageName(), new TreeSet<PluginInfo>());
		pluginInfos.get(pluginInfo.getPackageName()).add(pluginInfo);
	}

	private static PluginInfo getPluginInfo(String pluginId, Checker checker) {
		
		String currentPackage = "Unknown";
		boolean port = false;
		for (ComponentDescription nextComp : checker.getComponentDefinitions()) {
			for (ComponentItemDescription nextItem : nextComp.getComponentItems()) {
				if (WildCardMatcher.isMatching(pluginId, nextItem.getId()))
				{
					currentPackage = nextComp.getName();
				}
			}
			for (ComponentItemDescription nextItem : nextComp.getPorts()) {
				if (WildCardMatcher.isMatching(pluginId, nextItem.getId()))
				{
					currentPackage = nextComp.getName();
					port = true;
				}
			}

		}
		return new PluginInfo(pluginId, currentPackage, port);
	}

}
