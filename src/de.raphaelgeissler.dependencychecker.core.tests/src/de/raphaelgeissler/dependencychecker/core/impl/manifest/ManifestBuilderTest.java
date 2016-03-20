package de.raphaelgeissler.dependencychecker.core.impl.manifest;

import static org.junit.Assert.assertEquals;

import java.util.jar.Manifest;

import org.junit.Test;

import de.raphaelgeissler.dependencychecker.core.impl.manifest.ManifestBuilder;

public class ManifestBuilderTest {

	@Test
	public void simpleTest() throws Exception {
		Manifest m = new ManifestBuilder().symbolicName("MyBundleID").addRequiredBundle("MyDepPlugin1").addImportPackage("MyPackage1").addRequiredBundle("MyDepPlugin", "1.0.0").addImportPackage("MyPackage2","1.0.0").build();
		
		assertEquals("1.0" , m.getMainAttributes().getValue("Manifest-Version"));
		assertEquals("2" , m.getMainAttributes().getValue("Bundle-ManifestVersion"));
		assertEquals("MyBundleID" , m.getMainAttributes().getValue("Bundle-SymbolicName"));
		assertEquals("MyDepPlugin1,MyDepPlugin;bundle-version=\"1.0.0\"" , m.getMainAttributes().getValue("Require-Bundle"));
		assertEquals("MyPackage1,MyPackage2;version=\"1.0.0\"" , m.getMainAttributes().getValue("Import-Package"));
	}
	
}
