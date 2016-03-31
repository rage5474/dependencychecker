package de.raphaelgeissler.dependencychecker.core.impl.validation;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.TreeSet;

import de.raphaelgeissler.dependencychecker.Checker;
import de.raphaelgeissler.dependencychecker.ComponentDescription;
import de.raphaelgeissler.dependencychecker.ComponentItemDescription;
import de.raphaelgeissler.dependencychecker.core.api.DependencyValidationResult;
import de.raphaelgeissler.dependencychecker.core.api.DependencyValidationResultMessage;

public class OuterDependencyUMLGenerator implements PlantUmlGenerator {

	private DependencyValidationResult result;
	private Checker checker;
	private boolean innerConnections;

	private final List<PluginDependency> dependencies = new ArrayList<PluginDependency>();

	public OuterDependencyUMLGenerator(DependencyValidationResult result, Checker checker) {
		this(result, checker, true);
	}

	public OuterDependencyUMLGenerator(DependencyValidationResult result, Checker checker, boolean innerConnection) {
		this.result = result;
		this.checker = checker;
		innerConnections = innerConnection;

		generateDependencies(result, checker);
	}

	private void generateDependencies(DependencyValidationResult result, Checker checker) {
		for (DependencyValidationResultMessage nextMessage : result.getResultMessages()) {

			PluginInfo nextPlugin = getPluginInfo(nextMessage.getPluginId(), checker);
			PluginInfo dependentPlugin = getPluginInfo(nextMessage.getDependencyPluginId(), checker);

			if (innerConnections) {
				dependencies.add(new PluginDependency(nextPlugin, dependentPlugin, nextMessage.correct()));
			} else if (!nextPlugin.getPackageInfo().equals(dependentPlugin.getPackageInfo())) {
				dependencies.add(new PluginDependency(nextPlugin, dependentPlugin,  nextMessage.correct()));
			}
		}
	}

	@Override
	public String generatePackagePlantUMLString() {

		SortedMap<PackageInfo, Set<PluginInfo>> packageMap = createPackageMap();

		String middle = "";
		for (PackageInfo nextPackage : packageMap.keySet()) {
			middle += "package " + nextPackage.getName() + "{\n";
			for (PluginInfo nextPluginInfo : packageMap.get(nextPackage)) {
				String stereoType = "<<Inner>>";
				if (nextPluginInfo.isPort())
					stereoType = "<<Port>>";
				middle += "[" + nextPluginInfo.getPluginId() + "] " + stereoType + "\n";
			}
			middle += "}\n";
		}

		return middle;
	}

	private SortedMap<PackageInfo, Set<PluginInfo>> createPackageMap() {
		SortedMap<PackageInfo, Set<PluginInfo>> packageMap = new TreeMap<PackageInfo, Set<PluginInfo>>();

		for (PluginDependency pluginDependency : dependencies) {
			addPluginToPackageMap(packageMap, pluginDependency.getSourcePlugin());
			addPluginToPackageMap(packageMap, pluginDependency.getDestPlugin());
		}
		return packageMap;
	}

	private void addPluginToPackageMap(SortedMap<PackageInfo, Set<PluginInfo>> packageMap, PluginInfo plugin) {
		PackageInfo pluginPackage = plugin.getPackageInfo();
		if (packageMap.get(pluginPackage) == null)
			packageMap.put(pluginPackage, new TreeSet<PluginInfo>());

		packageMap.get(pluginPackage).add(plugin);
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

		for (PluginDependency pluginDependency : dependencies) {
			dependenciesPlantUMLString += generateDependencyUmlString(pluginDependency);
		}
//		
//		for (DependencyValidationResultMessage nextMessage : result.getResultMessages()) {
//
//			if (innerConnections) {
//				dependenciesPlantUMLString = addDependencyToUmlString(dependenciesPlantUMLString, nextMessage);
//			} else {
//				PluginInfo nextPlugin = getPluginInfo(nextMessage.getPluginId(), checker);
//				PluginInfo dependentPlugin = getPluginInfo(nextMessage.getDependencyPluginId(), checker);
//
//				if (!nextPlugin.getPackageInfo().equals(dependentPlugin.getPackageInfo())) {
//					dependenciesPlantUMLString = addDependencyToUmlString(dependenciesPlantUMLString, nextMessage);
//				}
//			}
//
//		}
		return dependenciesPlantUMLString;
	}
	private String generateDependencyUmlString(PluginDependency pluginDependency) {
		String label = "";
		if (!pluginDependency.isAllowed())
			label = ":<$error>";

		String result = "[" + pluginDependency.getSourcePlugin().getPluginId() + "]" + "-->" + "["
				+ pluginDependency.getDestPlugin().getPluginId() + "]" + label + "\n";
		return result;
	}

	private String addDependencyToUmlString(String dependenciesPlantUMLString,
			DependencyValidationResultMessage nextMessage) {
		String label = "";
		if (!nextMessage.correct())
			label = ":<$error>";

		dependenciesPlantUMLString += "[" + nextMessage.getPluginId() + "]" + "-->" + "["
				+ nextMessage.getDependencyPluginId() + "]" + label + "\n";
		return dependenciesPlantUMLString;
	}

}
