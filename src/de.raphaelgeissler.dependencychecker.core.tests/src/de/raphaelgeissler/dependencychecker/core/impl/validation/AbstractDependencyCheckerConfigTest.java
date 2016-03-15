package de.raphaelgeissler.dependencychecker.core.impl.validation;

import org.eclipse.emf.ecore.EPackage;

import de.raphaelgeissler.dependencychecker.DependencycheckerPackage;

/**
 * Derive from this test class if a checker config file must be loaded in a test.
 * 
 * @author rage5457
 *
 */
public class AbstractDependencyCheckerConfigTest {

	public AbstractDependencyCheckerConfigTest() {
		EPackage.Registry.INSTANCE.put(DependencycheckerPackage.eNS_URI, DependencycheckerPackage.eINSTANCE);
	}
	
}
