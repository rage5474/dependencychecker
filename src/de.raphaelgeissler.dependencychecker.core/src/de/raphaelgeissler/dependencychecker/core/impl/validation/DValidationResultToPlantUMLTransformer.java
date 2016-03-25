package de.raphaelgeissler.dependencychecker.core.impl.validation;

import de.raphaelgeissler.dependencychecker.Checker;
import de.raphaelgeissler.dependencychecker.core.api.DependencyValidationResult;

public class DValidationResultToPlantUMLTransformer {

	public static String transform(DependencyValidationResult result, Checker checker, PlantUmlGenerator plantUmlGenerator) {

		String start = "@startuml\n";

		//@formatter:off
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
		//@formatter:on

		String packagesPlantUMLString = plantUmlGenerator.generatePackagePlantUMLString(result, checker);

		String dependenciesPlantUMLString = plantUmlGenerator.generateDependenciesPlantUMLString(result);

		//@formatter:off
		String legend = ""
				+ "legend right\n"
				+ "**Note:**\n"
				+ "Forbidden dependencies are labeled with a <$error>.\n"
				+ "endlegend\n";
		//@formatter:on

		String end = "@enduml";

		String resultPlantUmlString = start + sprite + skins + packagesPlantUMLString + dependenciesPlantUMLString
				+ legend + end;

		return resultPlantUmlString;
	}

}
