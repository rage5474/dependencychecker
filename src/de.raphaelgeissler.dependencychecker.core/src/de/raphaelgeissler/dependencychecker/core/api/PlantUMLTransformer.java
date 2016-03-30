package de.raphaelgeissler.dependencychecker.core.api;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

import de.raphaelgeissler.dependencychecker.core.impl.validation.DValidationResultToPlantUMLTransformer;
import de.raphaelgeissler.dependencychecker.core.impl.validation.DependencyCheckerConfig;
import de.raphaelgeissler.dependencychecker.core.impl.validation.FullPlantUMLGenerator;
import de.raphaelgeissler.dependencychecker.core.impl.validation.PackageOnlyPlantUMLGenerator;

public class PlantUMLTransformer {

	public static void transform(String pathToResultFile, String pathToCheckerConfig, DependencyValidationResult result)
	{
		final DependencyCheckerConfig config = new DependencyCheckerConfig();
		if(config.loadData(pathToCheckerConfig))
		{
			String plantUMLString = DValidationResultToPlantUMLTransformer.transform(new PackageOnlyPlantUMLGenerator(result, config.getChecker()));
			try(  PrintWriter out = new PrintWriter( pathToResultFile )  ){
			    out.println( plantUMLString );
			} catch (FileNotFoundException e) {
				throw new IllegalArgumentException("Couldn't not write to " + pathToResultFile + ".");
			}
		}
		else {
			throw new IllegalArgumentException("Couldn't load DependencyCheckerConfig file " + pathToCheckerConfig + ".");
		}
	}
	
}
