package de.raphaelgeissler.dependencychecker.ui.console;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class ManifestFinder {

	public static List<String> find(final String path) {
		return find(path, new ArrayList<String>(), false);
	}
	
	public static List<String> find(final String path, final boolean debug) {
		return find(path, new ArrayList<String>(), debug);
	}
	
	private static List<String> find(final String path, final List<String> manifestFiles, final boolean debug) {

		File root = new File(path);
		File[] list = root.listFiles();

		if (list != null)
		{
			for (File nextEntry : list) {
				if (nextEntry.isDirectory()) {
					find(nextEntry.getAbsolutePath(), manifestFiles, debug);
					if(debug)
						System.out.println("Dir:" + nextEntry.getAbsoluteFile());
				} else {
					if(nextEntry.getName().equalsIgnoreCase("manifest.mf"))
					{
						if(debug)
							System.out.println("Manifest-File:" + nextEntry.getAbsoluteFile());
						manifestFiles.add(nextEntry.getAbsolutePath());
					}
				}
			}
		}
		
		return new ArrayList<String>(manifestFiles);
	}

}
