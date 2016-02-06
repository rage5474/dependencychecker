/*
 * generated by Xtext 2.9.1
 */
package de.raphaegeissler.cdsl.tests

import com.google.inject.Inject
import de.raphaegeissler.cdsl.cDSL.Domainmodel
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(XtextRunner)
@InjectWith(CDSLInjectorProvider)
class CDSLParsingTest{

	@Inject
	ParseHelper<Domainmodel> parseHelper;

	@Test 
	def void loadModel() {
		val result = parseHelper.parse('''
			Hello Xtext!
		''')
//		Assert.assertNotNull(result)
	}

}