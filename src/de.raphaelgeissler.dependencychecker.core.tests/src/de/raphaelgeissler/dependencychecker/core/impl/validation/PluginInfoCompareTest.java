package de.raphaelgeissler.dependencychecker.core.impl.validation;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PluginInfoCompareTest {

	@Test
	public void sameMembers() throws Exception {
		PluginInfo pluginInfo1 = new PluginInfo("de.ragedev.ui", "UI", true);
		PluginInfo pluginInfo2 = new PluginInfo("de.ragedev.ui", "UI", true);

		assertTrue(pluginInfo1.compareTo(pluginInfo2) == 0);
	}

	@Test
	public void differentPort() throws Exception {
		PluginInfo pluginInfo1 = new PluginInfo("de.ragedev.ui", "UI", true);
		PluginInfo pluginInfo2 = new PluginInfo("de.ragedev.ui", "UI", false);

		assertTrue(pluginInfo1.compareTo(pluginInfo2) < 0);
	}

	@Test
	public void differentIdsSamePackageDifferentPort() throws Exception {
		PluginInfo pluginInfo1 = new PluginInfo("de.ragedev.ui.first", "UI", false);
		PluginInfo pluginInfo2 = new PluginInfo("de.ragedev.ui.second", "UI", true);

		assertTrue(pluginInfo1.compareTo(pluginInfo2) > 0);
		assertTrue(pluginInfo2.compareTo(pluginInfo1) < 0);
	}
	
	@Test
	public void differentIdsSamePackageSamePort() throws Exception {
		PluginInfo pluginInfo1 = new PluginInfo("de.ragedev.ui.first", "UI", true);
		PluginInfo pluginInfo2 = new PluginInfo("de.ragedev.ui.second", "UI", true);

		assertTrue(pluginInfo1.compareTo(pluginInfo2) < 0);
		assertTrue(pluginInfo2.compareTo(pluginInfo1) > 0);
	}

	@Test
	public void SameIdsDifferentPackage() throws Exception {
		PluginInfo pluginInfo1 = new PluginInfo("de.ragedev.plugin", "Core", true);
		PluginInfo pluginInfo2 = new PluginInfo("de.ragedev.plugin", "UI", true);

		assertTrue(pluginInfo1.compareTo(pluginInfo2) < 0);
		assertTrue(pluginInfo2.compareTo(pluginInfo1) > 0);
	}

	@Test
	public void differentIdsDifferentPackage() throws Exception {
		PluginInfo pluginInfo1 = new PluginInfo("de.ragedev.core", "Core", true);
		PluginInfo pluginInfo2 = new PluginInfo("de.ragedev.ui", "UI", true);

		assertTrue(pluginInfo1.compareTo(pluginInfo2) < 0);
		assertTrue(pluginInfo2.compareTo(pluginInfo1) > 0);
	}
}
