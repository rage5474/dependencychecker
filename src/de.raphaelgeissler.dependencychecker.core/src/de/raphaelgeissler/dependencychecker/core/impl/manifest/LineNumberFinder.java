package de.raphaelgeissler.dependencychecker.core.impl.manifest;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LineNumberFinder {
	public static Map<String, List<Integer>> find(List<String> words, File text) throws IOException {
		LineNumberReader lineNumberReader = new LineNumberReader(new FileReader(text));

		Map<String, List<Integer>> resultMap = new HashMap<>();
		
		for (String nextWord : words) {
			resultMap.put(nextWord, new ArrayList<Integer>());
		}
		
		try {
			String line;
			while((line = lineNumberReader.readLine()) != null)
			for (String nextWord : words) {
				if (line.indexOf(nextWord) >= 0 /*line.contains(nextWord)*/) {
					int lineNumber = lineNumberReader.getLineNumber();
					resultMap.get(nextWord).add(lineNumber);
				}
			}

		} finally {
			lineNumberReader.close();
		}
		return resultMap;
	}
}
