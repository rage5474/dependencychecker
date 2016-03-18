/*
 * generated by Xtext 2.9.1
 */
package de.ragedev.cdsl.parser.antlr;

import com.google.inject.Inject;
import de.ragedev.cdsl.parser.antlr.internal.InternalCDSLParser;
import de.ragedev.cdsl.services.CDSLGrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class CDSLParser extends AbstractAntlrParser {

	@Inject
	private CDSLGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalCDSLParser createParser(XtextTokenStream stream) {
		return new InternalCDSLParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Domainmodel";
	}

	public CDSLGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(CDSLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
