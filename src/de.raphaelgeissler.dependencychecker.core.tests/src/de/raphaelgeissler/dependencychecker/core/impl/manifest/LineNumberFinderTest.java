package de.raphaelgeissler.dependencychecker.core.impl.manifest;

import static org.junit.Assert.*;

import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import de.raphaelgeissler.dependencychecker.core.impl.manifest.LineNumberFinder;

public class LineNumberFinderTest {
	@Test
	public void lineNumberOfRequireBundle() throws Exception {
		File manifestFile = new File("files/example/core/MANIFEST.MF");
		Map<String, List<Integer>> result = LineNumberFinder.find(Arrays.asList("Require-Bundle"), manifestFile);
		
		assertEquals(1, result.get("Require-Bundle").size());
		assertEquals(new Integer(7), result.get("Require-Bundle").get(0));
	}
}
