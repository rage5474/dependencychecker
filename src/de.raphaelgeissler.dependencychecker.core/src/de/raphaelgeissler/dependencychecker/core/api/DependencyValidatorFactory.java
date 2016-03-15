package de.raphaelgeissler.dependencychecker.core.api;

import java.util.List;

import de.raphaelgeissler.dependencychecker.core.impl.manifest.ManifestDataStore;
import de.raphaelgeissler.dependencychecker.core.impl.validation.DependencyCheckerConfig;
import de.raphaelgeissler.dependencychecker.core.impl.validation.DependencyValidatorImpl;

public class DependencyValidatorFactory {

	public static DependencyValidator createDependencyValidator(String pathToCheckerConfig, List<String> pathToManifestFiles)
	{
		DependencyValidatorImpl dependencyValidator = null;
		
		final DependencyCheckerConfig config = new DependencyCheckerConfig();
		if(config.loadData(pathToCheckerConfig))
		{
			ManifestDataStore manifestDataStore = new ManifestDataStore();
			if(manifestDataStore.parseManifestFiles(pathToManifestFiles))
			{
				dependencyValidator = new DependencyValidatorImpl(config.getChecker(), manifestDataStore);
			}
			else
			{
				throw new IllegalArgumentException("Couldn't parse Manifest file.");
			}
		}
		else {
			throw new IllegalArgumentException("Couldn't load DependencyCheckerConfig file " + pathToCheckerConfig + ".");
		}
		
		return dependencyValidator;
	}
	
}
