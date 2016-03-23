package de.raphaelgeissler.dependencychecker.ui.console;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Map;

import org.apache.commons.cli.BasicParser;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;
import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;

import de.raphaelgeissler.dependencychecker.core.api.DependencyValidationResult;
import de.raphaelgeissler.dependencychecker.core.api.DependencyValidationResultMessage;
import de.raphaelgeissler.dependencychecker.core.api.DependencyValidator;
import de.raphaelgeissler.dependencychecker.core.api.DependencyValidatorFactory;
import de.raphaelgeissler.dependencychecker.core.api.PlantUMLTransformer;

public class DependencyCheckerConsole implements IApplication {

	public Object start(IApplicationContext context) throws Exception {

		Options options = defineCLIOptions();
		CommandLine cmd = parseCLIArguments(context, options);

		boolean validationSuccessful = true;
		if (argsCorrect(cmd)) {
			DependencyValidationResult result = validateDependencies(cmd);
			validationSuccessful = result.wasSuccessful();
			printValidationResult(result);
			PlantUMLTransformer.transform("result.iuml", getConfigPath(cmd), result);
		} else {
			printHelp(options);
			validationSuccessful = false;
		}

		if (noExit(cmd))
			waitForInput();

		if (validationSuccessful)
			return IApplication.EXIT_OK;
		else
			return new Integer(1);
	}

	private Options defineCLIOptions() {
		Options options = new Options();

		options.addOption("c", "config", true, "Absolute path to dependency checker config file.");
		options.addOption("f", "folder", true, "Absolute path to bundle root folder.");
		options.addOption("w", "wait-for-input", false, "Console will be closed by user input.");
		return options;
	}

	private CommandLine parseCLIArguments(IApplicationContext context, Options options) throws ParseException {
		CommandLineParser parser = new BasicParser();

		final Map<?, ?> args = context.getArguments();
		final String[] appArgs = (String[]) args.get("application.args");
		CommandLine cmd = parser.parse(options, appArgs);
		return cmd;
	}

	private boolean argsCorrect(CommandLine cmd) {
		return cmd.hasOption("c") && cmd.hasOption("f");
	}

	private String getConfigPath(CommandLine cmd) {
		return cmd.getOptionValue("c");
	}

	private String getFolderPath(CommandLine cmd) {
		return cmd.getOptionValue("f");
	}

	private DependencyValidationResult validateDependencies(CommandLine cmd) {
		String pathToConfig = getConfigPath(cmd);
		String pathToFolder = getFolderPath(cmd);
		List<String> manifestFiles = ManifestFinder.find(pathToFolder);

		if (manifestFiles.isEmpty())
			System.out.println("WARN: No manifest files found in folder " + pathToFolder + ".");

		DependencyValidator validator = DependencyValidatorFactory.createDependencyValidator(pathToConfig,
				manifestFiles);
		return validator.validate();
	}

	private void printValidationResult(DependencyValidationResult result) {
		printResult(result);
		if (result.wasSuccessful()) {
			System.out.println("\nOverall validation result: [OK].");

		} else {
			System.out.println("\nOverall validation result: [FAILED].");
		}
	}

	private void printResult(DependencyValidationResult result) {
		System.out.println("Validation details");
		System.out.println("------------------------------------------------------");
		for (DependencyValidationResultMessage nextResultMessage : result.getResultMessages()) {
			System.out.println(nextResultMessage.toString());
		}
		System.out.println("------------------------------------------------------");
	}

	private void printHelp(Options options) {
		new HelpFormatter().printHelp("dvalidator-console", options);
	}

	private boolean noExit(CommandLine cmd) {
		return cmd.hasOption("w");
	}

	private void waitForInput() throws IOException {
		System.out.print("Type RETURN to exit.");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
	}

	public void stop() {
	}
}
