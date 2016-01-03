package de.raphaelgeissler.dependencychecker.core.impl;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;

import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;

import de.raphaelgeissler.dependencychecker.Checker;

public class DependencyCheckerConfig {

	private Checker checker;

	public DependencyCheckerConfig() {
	}

	public boolean loadData(String fileName) {
		XMIResourceImpl resourceFile = loadCheckerFile(fileName);
		checker = convertResourceToChecker(resourceFile);
		return checker != null;
	}

	private Checker convertResourceToChecker(XMIResourceImpl checkerFile) {
		if (checkerFile != null && checkerFile.getContents().size() == 1) {
			if (checkerFile.getContents().get(0) instanceof Checker) {
				return (Checker) checkerFile.getContents().get(0);
			}
		}

		return null;
	}

	private XMIResourceImpl loadCheckerFile(String fileName) {
		XMIResourceImpl resource = new XMIResourceImpl();
		File source = new File(fileName);
		try {
			resource.load(new FileInputStream(source), new HashMap<Object, Object>());
		} catch (IOException e) {
			// TODO Add better error message
			e.printStackTrace();
			return null;
		}
		return resource;
	}

	public Checker getChecker() {
		if(isCheckerThere())
		{
			return checker;
		}
		return null;
	}

	private boolean isCheckerThere() {
		if (checker == null) {
			throw new IllegalArgumentException("Please load checker file first.");
		}
		
		return true;
	}
}
