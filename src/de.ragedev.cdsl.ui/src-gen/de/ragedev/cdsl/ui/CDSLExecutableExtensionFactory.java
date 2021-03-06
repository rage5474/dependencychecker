/*
 * generated by Xtext 2.9.1
 */
package de.ragedev.cdsl.ui;

import com.google.inject.Injector;
import de.ragedev.cdsl.ui.internal.CdslActivator;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class CDSLExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return CdslActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return CdslActivator.getInstance().getInjector(CdslActivator.DE_RAGEDEV_CDSL_CDSL);
	}
	
}
