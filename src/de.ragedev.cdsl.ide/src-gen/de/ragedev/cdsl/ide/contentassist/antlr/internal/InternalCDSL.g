/*
 * generated by Xtext 2.9.1
 */
grammar InternalCDSL;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package de.ragedev.cdsl.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package de.ragedev.cdsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import de.ragedev.cdsl.services.CDSLGrammarAccess;

}
@parser::members {
	private CDSLGrammarAccess grammarAccess;

	public void setGrammarAccess(CDSLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}

	@Override
	protected Grammar getGrammar() {
		return grammarAccess.getGrammar();
	}

	@Override
	protected String getValueForTokenName(String tokenName) {
		return tokenName;
	}
}

// Entry rule entryRuleDomainmodel
entryRuleDomainmodel
:
{ before(grammarAccess.getDomainmodelRule()); }
	 ruleDomainmodel
{ after(grammarAccess.getDomainmodelRule()); } 
	 EOF 
;

// Rule Domainmodel
ruleDomainmodel 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDomainmodelAccess().getEntriesAssignment()); }
		(rule__Domainmodel__EntriesAssignment)*
		{ after(grammarAccess.getDomainmodelAccess().getEntriesAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAbstractEntry
entryRuleAbstractEntry
:
{ before(grammarAccess.getAbstractEntryRule()); }
	 ruleAbstractEntry
{ after(grammarAccess.getAbstractEntryRule()); } 
	 EOF 
;

// Rule AbstractEntry
ruleAbstractEntry 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAbstractEntryAccess().getAlternatives()); }
		(rule__AbstractEntry__Alternatives)
		{ after(grammarAccess.getAbstractEntryAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleDValidator
entryRuleDValidator
:
{ before(grammarAccess.getDValidatorRule()); }
	 ruleDValidator
{ after(grammarAccess.getDValidatorRule()); } 
	 EOF 
;

// Rule DValidator
ruleDValidator 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDValidatorAccess().getGroup()); }
		(rule__DValidator__Group__0)
		{ after(grammarAccess.getDValidatorAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleComponentDescription
entryRuleComponentDescription
:
{ before(grammarAccess.getComponentDescriptionRule()); }
	 ruleComponentDescription
{ after(grammarAccess.getComponentDescriptionRule()); } 
	 EOF 
;

// Rule ComponentDescription
ruleComponentDescription 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getComponentDescriptionAccess().getGroup()); }
		(rule__ComponentDescription__Group__0)
		{ after(grammarAccess.getComponentDescriptionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRulePorts
entryRulePorts
:
{ before(grammarAccess.getPortsRule()); }
	 rulePorts
{ after(grammarAccess.getPortsRule()); } 
	 EOF 
;

// Rule Ports
rulePorts 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getPortsAccess().getGroup()); }
		(rule__Ports__Group__0)
		{ after(grammarAccess.getPortsAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleNotAllowedRef
entryRuleNotAllowedRef
:
{ before(grammarAccess.getNotAllowedRefRule()); }
	 ruleNotAllowedRef
{ after(grammarAccess.getNotAllowedRefRule()); } 
	 EOF 
;

// Rule NotAllowedRef
ruleNotAllowedRef 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getNotAllowedRefAccess().getGroup()); }
		(rule__NotAllowedRef__Group__0)
		{ after(grammarAccess.getNotAllowedRefAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleUnitElements
entryRuleUnitElements
:
{ before(grammarAccess.getUnitElementsRule()); }
	 ruleUnitElements
{ after(grammarAccess.getUnitElementsRule()); } 
	 EOF 
;

// Rule UnitElements
ruleUnitElements 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		(
			{ before(grammarAccess.getUnitElementsAccess().getUnitAssignment()); }
			(rule__UnitElements__UnitAssignment)
			{ after(grammarAccess.getUnitElementsAccess().getUnitAssignment()); }
		)
		(
			{ before(grammarAccess.getUnitElementsAccess().getUnitAssignment()); }
			(rule__UnitElements__UnitAssignment)*
			{ after(grammarAccess.getUnitElementsAccess().getUnitAssignment()); }
		)
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleComponentID
entryRuleComponentID
:
{ before(grammarAccess.getComponentIDRule()); }
	 ruleComponentID
{ after(grammarAccess.getComponentIDRule()); } 
	 EOF 
;

// Rule ComponentID
ruleComponentID 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getComponentIDAccess().getGroup()); }
		(rule__ComponentID__Group__0)
		{ after(grammarAccess.getComponentIDAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleQualifiedName
entryRuleQualifiedName
:
{ before(grammarAccess.getQualifiedNameRule()); }
	 ruleQualifiedName
{ after(grammarAccess.getQualifiedNameRule()); } 
	 EOF 
;

// Rule QualifiedName
ruleQualifiedName 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getQualifiedNameAccess().getGroup()); }
		(rule__QualifiedName__Group__0)
		{ after(grammarAccess.getQualifiedNameAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleWildCardID
entryRuleWildCardID
:
{ before(grammarAccess.getWildCardIDRule()); }
	 ruleWildCardID
{ after(grammarAccess.getWildCardIDRule()); } 
	 EOF 
;

// Rule WildCardID
ruleWildCardID 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getWildCardIDAccess().getGroup()); }
		(rule__WildCardID__Group__0)
		{ after(grammarAccess.getWildCardIDAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AbstractEntry__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAbstractEntryAccess().getDValidatorParserRuleCall_0()); }
		ruleDValidator
		{ after(grammarAccess.getAbstractEntryAccess().getDValidatorParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getAbstractEntryAccess().getComponentDescriptionParserRuleCall_1()); }
		ruleComponentDescription
		{ after(grammarAccess.getAbstractEntryAccess().getComponentDescriptionParserRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DValidator__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DValidator__Group__0__Impl
	rule__DValidator__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DValidator__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDValidatorAccess().getDvalKeyword_0()); }
	'dval'
	{ after(grammarAccess.getDValidatorAccess().getDvalKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DValidator__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DValidator__Group__1__Impl
	rule__DValidator__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__DValidator__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDValidatorAccess().getValNameAssignment_1()); }
	(rule__DValidator__ValNameAssignment_1)
	{ after(grammarAccess.getDValidatorAccess().getValNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DValidator__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DValidator__Group__2__Impl
	rule__DValidator__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__DValidator__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDValidatorAccess().getLeftCurlyBracketKeyword_2()); }
	'{'
	{ after(grammarAccess.getDValidatorAccess().getLeftCurlyBracketKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DValidator__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DValidator__Group__3__Impl
	rule__DValidator__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__DValidator__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDValidatorAccess().getCompsKeyword_3()); }
	'comps'
	{ after(grammarAccess.getDValidatorAccess().getCompsKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DValidator__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DValidator__Group__4__Impl
	rule__DValidator__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__DValidator__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDValidatorAccess().getColonKeyword_4()); }
	':'
	{ after(grammarAccess.getDValidatorAccess().getColonKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DValidator__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DValidator__Group__5__Impl
	rule__DValidator__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__DValidator__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getDValidatorAccess().getRefComponentsAssignment_5()); }
		(rule__DValidator__RefComponentsAssignment_5)
		{ after(grammarAccess.getDValidatorAccess().getRefComponentsAssignment_5()); }
	)
	(
		{ before(grammarAccess.getDValidatorAccess().getRefComponentsAssignment_5()); }
		(rule__DValidator__RefComponentsAssignment_5)*
		{ after(grammarAccess.getDValidatorAccess().getRefComponentsAssignment_5()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DValidator__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DValidator__Group__6__Impl
	rule__DValidator__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__DValidator__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDValidatorAccess().getSemicolonKeyword_6()); }
	';'
	{ after(grammarAccess.getDValidatorAccess().getSemicolonKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DValidator__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DValidator__Group__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DValidator__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDValidatorAccess().getRightCurlyBracketKeyword_7()); }
	'}'
	{ after(grammarAccess.getDValidatorAccess().getRightCurlyBracketKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ComponentDescription__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ComponentDescription__Group__0__Impl
	rule__ComponentDescription__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentDescription__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentDescriptionAccess().getCompKeyword_0()); }
	'comp'
	{ after(grammarAccess.getComponentDescriptionAccess().getCompKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentDescription__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ComponentDescription__Group__1__Impl
	rule__ComponentDescription__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentDescription__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentDescriptionAccess().getNameAssignment_1()); }
	(rule__ComponentDescription__NameAssignment_1)
	{ after(grammarAccess.getComponentDescriptionAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentDescription__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ComponentDescription__Group__2__Impl
	rule__ComponentDescription__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentDescription__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentDescriptionAccess().getLeftCurlyBracketKeyword_2()); }
	'{'
	{ after(grammarAccess.getComponentDescriptionAccess().getLeftCurlyBracketKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentDescription__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ComponentDescription__Group__3__Impl
	rule__ComponentDescription__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentDescription__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentDescriptionAccess().getPortsAssignment_3()); }
	(rule__ComponentDescription__PortsAssignment_3)?
	{ after(grammarAccess.getComponentDescriptionAccess().getPortsAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentDescription__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ComponentDescription__Group__4__Impl
	rule__ComponentDescription__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentDescription__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentDescriptionAccess().getUnitsAssignment_4()); }
	(rule__ComponentDescription__UnitsAssignment_4)?
	{ after(grammarAccess.getComponentDescriptionAccess().getUnitsAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentDescription__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ComponentDescription__Group__5__Impl
	rule__ComponentDescription__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentDescription__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentDescriptionAccess().getNotAllowedRefAssignment_5()); }
	(rule__ComponentDescription__NotAllowedRefAssignment_5)?
	{ after(grammarAccess.getComponentDescriptionAccess().getNotAllowedRefAssignment_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentDescription__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ComponentDescription__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentDescription__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentDescriptionAccess().getRightCurlyBracketKeyword_6()); }
	'}'
	{ after(grammarAccess.getComponentDescriptionAccess().getRightCurlyBracketKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Ports__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Ports__Group__0__Impl
	rule__Ports__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Ports__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPortsAccess().getPortsKeyword_0()); }
	'ports'
	{ after(grammarAccess.getPortsAccess().getPortsKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Ports__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Ports__Group__1__Impl
	rule__Ports__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Ports__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPortsAccess().getColonKeyword_1()); }
	':'
	{ after(grammarAccess.getPortsAccess().getColonKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Ports__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Ports__Group__2__Impl
	rule__Ports__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Ports__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getPortsAccess().getPortAssignment_2()); }
		(rule__Ports__PortAssignment_2)
		{ after(grammarAccess.getPortsAccess().getPortAssignment_2()); }
	)
	(
		{ before(grammarAccess.getPortsAccess().getPortAssignment_2()); }
		(rule__Ports__PortAssignment_2)*
		{ after(grammarAccess.getPortsAccess().getPortAssignment_2()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Ports__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Ports__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Ports__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPortsAccess().getSemicolonKeyword_3()); }
	';'
	{ after(grammarAccess.getPortsAccess().getSemicolonKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__NotAllowedRef__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NotAllowedRef__Group__0__Impl
	rule__NotAllowedRef__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__NotAllowedRef__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNotAllowedRefAccess().getForbiddenKeyword_0()); }
	'forbidden'
	{ after(grammarAccess.getNotAllowedRefAccess().getForbiddenKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NotAllowedRef__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NotAllowedRef__Group__1__Impl
	rule__NotAllowedRef__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__NotAllowedRef__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNotAllowedRefAccess().getColonKeyword_1()); }
	':'
	{ after(grammarAccess.getNotAllowedRefAccess().getColonKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NotAllowedRef__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NotAllowedRef__Group__2__Impl
	rule__NotAllowedRef__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__NotAllowedRef__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getNotAllowedRefAccess().getUnitsAssignment_2()); }
		(rule__NotAllowedRef__UnitsAssignment_2)
		{ after(grammarAccess.getNotAllowedRefAccess().getUnitsAssignment_2()); }
	)
	(
		{ before(grammarAccess.getNotAllowedRefAccess().getUnitsAssignment_2()); }
		(rule__NotAllowedRef__UnitsAssignment_2)*
		{ after(grammarAccess.getNotAllowedRefAccess().getUnitsAssignment_2()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NotAllowedRef__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NotAllowedRef__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__NotAllowedRef__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNotAllowedRefAccess().getSemicolonKeyword_3()); }
	';'
	{ after(grammarAccess.getNotAllowedRefAccess().getSemicolonKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ComponentID__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ComponentID__Group__0__Impl
	rule__ComponentID__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentID__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentIDAccess().getIdentsKeyword_0()); }
	'idents'
	{ after(grammarAccess.getComponentIDAccess().getIdentsKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentID__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ComponentID__Group__1__Impl
	rule__ComponentID__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentID__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentIDAccess().getColonKeyword_1()); }
	':'
	{ after(grammarAccess.getComponentIDAccess().getColonKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentID__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ComponentID__Group__2__Impl
	rule__ComponentID__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentID__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getComponentIDAccess().getQualifiedNamesAssignment_2()); }
		(rule__ComponentID__QualifiedNamesAssignment_2)
		{ after(grammarAccess.getComponentIDAccess().getQualifiedNamesAssignment_2()); }
	)
	(
		{ before(grammarAccess.getComponentIDAccess().getQualifiedNamesAssignment_2()); }
		(rule__ComponentID__QualifiedNamesAssignment_2)*
		{ after(grammarAccess.getComponentIDAccess().getQualifiedNamesAssignment_2()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentID__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ComponentID__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentID__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentIDAccess().getSemicolonKeyword_3()); }
	';'
	{ after(grammarAccess.getComponentIDAccess().getSemicolonKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__QualifiedName__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QualifiedName__Group__0__Impl
	rule__QualifiedName__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedName__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQualifiedNameAccess().getWildCardIDParserRuleCall_0()); }
	ruleWildCardID
	{ after(grammarAccess.getQualifiedNameAccess().getWildCardIDParserRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedName__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QualifiedName__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedName__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQualifiedNameAccess().getGroup_1()); }
	(rule__QualifiedName__Group_1__0)*
	{ after(grammarAccess.getQualifiedNameAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__QualifiedName__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QualifiedName__Group_1__0__Impl
	rule__QualifiedName__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedName__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); }
	'.'
	{ after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedName__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QualifiedName__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedName__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQualifiedNameAccess().getWildCardIDParserRuleCall_1_1()); }
	ruleWildCardID
	{ after(grammarAccess.getQualifiedNameAccess().getWildCardIDParserRuleCall_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__WildCardID__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__WildCardID__Group__0__Impl
	rule__WildCardID__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__WildCardID__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getWildCardIDAccess().getIDTerminalRuleCall_0()); }
	RULE_ID
	{ after(grammarAccess.getWildCardIDAccess().getIDTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__WildCardID__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__WildCardID__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__WildCardID__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getWildCardIDAccess().getAsteriskKeyword_1()); }
	('*')?
	{ after(grammarAccess.getWildCardIDAccess().getAsteriskKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Domainmodel__EntriesAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDomainmodelAccess().getEntriesAbstractEntryParserRuleCall_0()); }
		ruleAbstractEntry
		{ after(grammarAccess.getDomainmodelAccess().getEntriesAbstractEntryParserRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DValidator__ValNameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDValidatorAccess().getValNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getDValidatorAccess().getValNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DValidator__RefComponentsAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDValidatorAccess().getRefComponentsComponentDescriptionCrossReference_5_0()); }
		(
			{ before(grammarAccess.getDValidatorAccess().getRefComponentsComponentDescriptionIDTerminalRuleCall_5_0_1()); }
			RULE_ID
			{ after(grammarAccess.getDValidatorAccess().getRefComponentsComponentDescriptionIDTerminalRuleCall_5_0_1()); }
		)
		{ after(grammarAccess.getDValidatorAccess().getRefComponentsComponentDescriptionCrossReference_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentDescription__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getComponentDescriptionAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getComponentDescriptionAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentDescription__PortsAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getComponentDescriptionAccess().getPortsPortsParserRuleCall_3_0()); }
		rulePorts
		{ after(grammarAccess.getComponentDescriptionAccess().getPortsPortsParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentDescription__UnitsAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getComponentDescriptionAccess().getUnitsUnitElementsParserRuleCall_4_0()); }
		ruleUnitElements
		{ after(grammarAccess.getComponentDescriptionAccess().getUnitsUnitElementsParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentDescription__NotAllowedRefAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getComponentDescriptionAccess().getNotAllowedRefNotAllowedRefParserRuleCall_5_0()); }
		ruleNotAllowedRef
		{ after(grammarAccess.getComponentDescriptionAccess().getNotAllowedRefNotAllowedRefParserRuleCall_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Ports__PortAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPortsAccess().getPortQualifiedNameParserRuleCall_2_0()); }
		ruleQualifiedName
		{ after(grammarAccess.getPortsAccess().getPortQualifiedNameParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__NotAllowedRef__UnitsAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNotAllowedRefAccess().getUnitsComponentDescriptionCrossReference_2_0()); }
		(
			{ before(grammarAccess.getNotAllowedRefAccess().getUnitsComponentDescriptionIDTerminalRuleCall_2_0_1()); }
			RULE_ID
			{ after(grammarAccess.getNotAllowedRefAccess().getUnitsComponentDescriptionIDTerminalRuleCall_2_0_1()); }
		)
		{ after(grammarAccess.getNotAllowedRefAccess().getUnitsComponentDescriptionCrossReference_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__UnitElements__UnitAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getUnitElementsAccess().getUnitComponentIDParserRuleCall_0()); }
		ruleComponentID
		{ after(grammarAccess.getUnitElementsAccess().getUnitComponentIDParserRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComponentID__QualifiedNamesAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getComponentIDAccess().getQualifiedNamesQualifiedNameParserRuleCall_2_0()); }
		ruleQualifiedName
		{ after(grammarAccess.getComponentIDAccess().getQualifiedNamesQualifiedNameParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;