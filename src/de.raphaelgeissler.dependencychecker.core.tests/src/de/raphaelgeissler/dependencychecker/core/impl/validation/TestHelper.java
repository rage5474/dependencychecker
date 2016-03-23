package de.raphaelgeissler.dependencychecker.core.impl.validation;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;

public class TestHelper {
	public static boolean equalToIgnoringWhiteSpace(String expectedResult, String plantUmlString) {
		if (expectedResult.replaceAll("\\s+", "").equalsIgnoreCase(plantUmlString.replaceAll("\\s+", ""))) {
			return true;
		}
		return false;
	}

	public static String readFile(String path, Charset encoding) throws IOException {
		byte[] encoded = Files.readAllBytes(Paths.get(path));
		return new String(encoded, encoding);
	}
}
