package de.raphaelgeissler.dependencychecker.core.impl.validation;

import de.raphaelgeissler.dependencychecker.Checker;
import de.raphaelgeissler.dependencychecker.core.api.DependencyValidationResult;

public interface PlantUmlGenerator {
	
	public String generatePackagePlantUMLString(DependencyValidationResult result, Checker checker);

	public String generateDependenciesPlantUMLString(DependencyValidationResult result);
	
}
