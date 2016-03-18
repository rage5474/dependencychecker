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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCDSLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'dval'", "'{'", "'comps'", "':'", "';'", "'}'", "'comp'", "'ports'", "'forbidden'", "'idents'", "'.'", "'*'"
    };
    public static final int RULE_ID=4;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__19=19;
    public static final int RULE_STRING=6;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=5;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalCDSLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalCDSLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalCDSLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalCDSL.g"; }


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



    // $ANTLR start "entryRuleDomainmodel"
    // InternalCDSL.g:53:1: entryRuleDomainmodel : ruleDomainmodel EOF ;
    public final void entryRuleDomainmodel() throws RecognitionException {
        try {
            // InternalCDSL.g:54:1: ( ruleDomainmodel EOF )
            // InternalCDSL.g:55:1: ruleDomainmodel EOF
            {
             before(grammarAccess.getDomainmodelRule()); 
            pushFollow(FOLLOW_1);
            ruleDomainmodel();

            state._fsp--;

             after(grammarAccess.getDomainmodelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDomainmodel"


    // $ANTLR start "ruleDomainmodel"
    // InternalCDSL.g:62:1: ruleDomainmodel : ( ( rule__Domainmodel__EntriesAssignment )* ) ;
    public final void ruleDomainmodel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCDSL.g:66:2: ( ( ( rule__Domainmodel__EntriesAssignment )* ) )
            // InternalCDSL.g:67:2: ( ( rule__Domainmodel__EntriesAssignment )* )
            {
            // InternalCDSL.g:67:2: ( ( rule__Domainmodel__EntriesAssignment )* )
            // InternalCDSL.g:68:3: ( rule__Domainmodel__EntriesAssignment )*
            {
             before(grammarAccess.getDomainmodelAccess().getEntriesAssignment()); 
            // InternalCDSL.g:69:3: ( rule__Domainmodel__EntriesAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11||LA1_0==17) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalCDSL.g:69:4: rule__Domainmodel__EntriesAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Domainmodel__EntriesAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getDomainmodelAccess().getEntriesAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDomainmodel"


    // $ANTLR start "entryRuleAbstractEntry"
    // InternalCDSL.g:78:1: entryRuleAbstractEntry : ruleAbstractEntry EOF ;
    public final void entryRuleAbstractEntry() throws RecognitionException {
        try {
            // InternalCDSL.g:79:1: ( ruleAbstractEntry EOF )
            // InternalCDSL.g:80:1: ruleAbstractEntry EOF
            {
             before(grammarAccess.getAbstractEntryRule()); 
            pushFollow(FOLLOW_1);
            ruleAbstractEntry();

            state._fsp--;

             after(grammarAccess.getAbstractEntryRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAbstractEntry"


    // $ANTLR start "ruleAbstractEntry"
    // InternalCDSL.g:87:1: ruleAbstractEntry : ( ( rule__AbstractEntry__Alternatives ) ) ;
    public final void ruleAbstractEntry() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCDSL.g:91:2: ( ( ( rule__AbstractEntry__Alternatives ) ) )
            // InternalCDSL.g:92:2: ( ( rule__AbstractEntry__Alternatives ) )
            {
            // InternalCDSL.g:92:2: ( ( rule__AbstractEntry__Alternatives ) )
            // InternalCDSL.g:93:3: ( rule__AbstractEntry__Alternatives )
            {
             before(grammarAccess.getAbstractEntryAccess().getAlternatives()); 
            // InternalCDSL.g:94:3: ( rule__AbstractEntry__Alternatives )
            // InternalCDSL.g:94:4: rule__AbstractEntry__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AbstractEntry__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAbstractEntryAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAbstractEntry"


    // $ANTLR start "entryRuleDValidator"
    // InternalCDSL.g:103:1: entryRuleDValidator : ruleDValidator EOF ;
    public final void entryRuleDValidator() throws RecognitionException {
        try {
            // InternalCDSL.g:104:1: ( ruleDValidator EOF )
            // InternalCDSL.g:105:1: ruleDValidator EOF
            {
             before(grammarAccess.getDValidatorRule()); 
            pushFollow(FOLLOW_1);
            ruleDValidator();

            state._fsp--;

             after(grammarAccess.getDValidatorRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDValidator"


    // $ANTLR start "ruleDValidator"
    // InternalCDSL.g:112:1: ruleDValidator : ( ( rule__DValidator__Group__0 ) ) ;
    public final void ruleDValidator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCDSL.g:116:2: ( ( ( rule__DValidator__Group__0 ) ) )
            // InternalCDSL.g:117:2: ( ( rule__DValidator__Group__0 ) )
            {
            // InternalCDSL.g:117:2: ( ( rule__DValidator__Group__0 ) )
            // InternalCDSL.g:118:3: ( rule__DValidator__Group__0 )
            {
             before(grammarAccess.getDValidatorAccess().getGroup()); 
            // InternalCDSL.g:119:3: ( rule__DValidator__Group__0 )
            // InternalCDSL.g:119:4: rule__DValidator__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DValidator__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDValidatorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDValidator"


    // $ANTLR start "entryRuleComponentDescription"
    // InternalCDSL.g:128:1: entryRuleComponentDescription : ruleComponentDescription EOF ;
    public final void entryRuleComponentDescription() throws RecognitionException {
        try {
            // InternalCDSL.g:129:1: ( ruleComponentDescription EOF )
            // InternalCDSL.g:130:1: ruleComponentDescription EOF
            {
             before(grammarAccess.getComponentDescriptionRule()); 
            pushFollow(FOLLOW_1);
            ruleComponentDescription();

            state._fsp--;

             after(grammarAccess.getComponentDescriptionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleComponentDescription"


    // $ANTLR start "ruleComponentDescription"
    // InternalCDSL.g:137:1: ruleComponentDescription : ( ( rule__ComponentDescription__Group__0 ) ) ;
    public final void ruleComponentDescription() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCDSL.g:141:2: ( ( ( rule__ComponentDescription__Group__0 ) ) )
            // InternalCDSL.g:142:2: ( ( rule__ComponentDescription__Group__0 ) )
            {
            // InternalCDSL.g:142:2: ( ( rule__ComponentDescription__Group__0 ) )
            // InternalCDSL.g:143:3: ( rule__ComponentDescription__Group__0 )
            {
             before(grammarAccess.getComponentDescriptionAccess().getGroup()); 
            // InternalCDSL.g:144:3: ( rule__ComponentDescription__Group__0 )
            // InternalCDSL.g:144:4: rule__ComponentDescription__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ComponentDescription__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComponentDescriptionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComponentDescription"


    // $ANTLR start "entryRulePorts"
    // InternalCDSL.g:153:1: entryRulePorts : rulePorts EOF ;
    public final void entryRulePorts() throws RecognitionException {
        try {
            // InternalCDSL.g:154:1: ( rulePorts EOF )
            // InternalCDSL.g:155:1: rulePorts EOF
            {
             before(grammarAccess.getPortsRule()); 
            pushFollow(FOLLOW_1);
            rulePorts();

            state._fsp--;

             after(grammarAccess.getPortsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePorts"


    // $ANTLR start "rulePorts"
    // InternalCDSL.g:162:1: rulePorts : ( ( rule__Ports__Group__0 ) ) ;
    public final void rulePorts() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCDSL.g:166:2: ( ( ( rule__Ports__Group__0 ) ) )
            // InternalCDSL.g:167:2: ( ( rule__Ports__Group__0 ) )
            {
            // InternalCDSL.g:167:2: ( ( rule__Ports__Group__0 ) )
            // InternalCDSL.g:168:3: ( rule__Ports__Group__0 )
            {
             before(grammarAccess.getPortsAccess().getGroup()); 
            // InternalCDSL.g:169:3: ( rule__Ports__Group__0 )
            // InternalCDSL.g:169:4: rule__Ports__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Ports__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPortsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePorts"


    // $ANTLR start "entryRuleNotAllowedRef"
    // InternalCDSL.g:178:1: entryRuleNotAllowedRef : ruleNotAllowedRef EOF ;
    public final void entryRuleNotAllowedRef() throws RecognitionException {
        try {
            // InternalCDSL.g:179:1: ( ruleNotAllowedRef EOF )
            // InternalCDSL.g:180:1: ruleNotAllowedRef EOF
            {
             before(grammarAccess.getNotAllowedRefRule()); 
            pushFollow(FOLLOW_1);
            ruleNotAllowedRef();

            state._fsp--;

             after(grammarAccess.getNotAllowedRefRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNotAllowedRef"


    // $ANTLR start "ruleNotAllowedRef"
    // InternalCDSL.g:187:1: ruleNotAllowedRef : ( ( rule__NotAllowedRef__Group__0 ) ) ;
    public final void ruleNotAllowedRef() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCDSL.g:191:2: ( ( ( rule__NotAllowedRef__Group__0 ) ) )
            // InternalCDSL.g:192:2: ( ( rule__NotAllowedRef__Group__0 ) )
            {
            // InternalCDSL.g:192:2: ( ( rule__NotAllowedRef__Group__0 ) )
            // InternalCDSL.g:193:3: ( rule__NotAllowedRef__Group__0 )
            {
             before(grammarAccess.getNotAllowedRefAccess().getGroup()); 
            // InternalCDSL.g:194:3: ( rule__NotAllowedRef__Group__0 )
            // InternalCDSL.g:194:4: rule__NotAllowedRef__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NotAllowedRef__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNotAllowedRefAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNotAllowedRef"


    // $ANTLR start "entryRuleUnitElements"
    // InternalCDSL.g:203:1: entryRuleUnitElements : ruleUnitElements EOF ;
    public final void entryRuleUnitElements() throws RecognitionException {
        try {
            // InternalCDSL.g:204:1: ( ruleUnitElements EOF )
            // InternalCDSL.g:205:1: ruleUnitElements EOF
            {
             before(grammarAccess.getUnitElementsRule()); 
            pushFollow(FOLLOW_1);
            ruleUnitElements();

            state._fsp--;

             after(grammarAccess.getUnitElementsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUnitElements"


    // $ANTLR start "ruleUnitElements"
    // InternalCDSL.g:212:1: ruleUnitElements : ( ( ( rule__UnitElements__UnitAssignment ) ) ( ( rule__UnitElements__UnitAssignment )* ) ) ;
    public final void ruleUnitElements() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCDSL.g:216:2: ( ( ( ( rule__UnitElements__UnitAssignment ) ) ( ( rule__UnitElements__UnitAssignment )* ) ) )
            // InternalCDSL.g:217:2: ( ( ( rule__UnitElements__UnitAssignment ) ) ( ( rule__UnitElements__UnitAssignment )* ) )
            {
            // InternalCDSL.g:217:2: ( ( ( rule__UnitElements__UnitAssignment ) ) ( ( rule__UnitElements__UnitAssignment )* ) )
            // InternalCDSL.g:218:3: ( ( rule__UnitElements__UnitAssignment ) ) ( ( rule__UnitElements__UnitAssignment )* )
            {
            // InternalCDSL.g:218:3: ( ( rule__UnitElements__UnitAssignment ) )
            // InternalCDSL.g:219:4: ( rule__UnitElements__UnitAssignment )
            {
             before(grammarAccess.getUnitElementsAccess().getUnitAssignment()); 
            // InternalCDSL.g:220:4: ( rule__UnitElements__UnitAssignment )
            // InternalCDSL.g:220:5: rule__UnitElements__UnitAssignment
            {
            pushFollow(FOLLOW_4);
            rule__UnitElements__UnitAssignment();

            state._fsp--;


            }

             after(grammarAccess.getUnitElementsAccess().getUnitAssignment()); 

            }

            // InternalCDSL.g:223:3: ( ( rule__UnitElements__UnitAssignment )* )
            // InternalCDSL.g:224:4: ( rule__UnitElements__UnitAssignment )*
            {
             before(grammarAccess.getUnitElementsAccess().getUnitAssignment()); 
            // InternalCDSL.g:225:4: ( rule__UnitElements__UnitAssignment )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==20) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalCDSL.g:225:5: rule__UnitElements__UnitAssignment
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__UnitElements__UnitAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getUnitElementsAccess().getUnitAssignment()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUnitElements"


    // $ANTLR start "entryRuleComponentID"
    // InternalCDSL.g:235:1: entryRuleComponentID : ruleComponentID EOF ;
    public final void entryRuleComponentID() throws RecognitionException {
        try {
            // InternalCDSL.g:236:1: ( ruleComponentID EOF )
            // InternalCDSL.g:237:1: ruleComponentID EOF
            {
             before(grammarAccess.getComponentIDRule()); 
            pushFollow(FOLLOW_1);
            ruleComponentID();

            state._fsp--;

             after(grammarAccess.getComponentIDRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleComponentID"


    // $ANTLR start "ruleComponentID"
    // InternalCDSL.g:244:1: ruleComponentID : ( ( rule__ComponentID__Group__0 ) ) ;
    public final void ruleComponentID() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCDSL.g:248:2: ( ( ( rule__ComponentID__Group__0 ) ) )
            // InternalCDSL.g:249:2: ( ( rule__ComponentID__Group__0 ) )
            {
            // InternalCDSL.g:249:2: ( ( rule__ComponentID__Group__0 ) )
            // InternalCDSL.g:250:3: ( rule__ComponentID__Group__0 )
            {
             before(grammarAccess.getComponentIDAccess().getGroup()); 
            // InternalCDSL.g:251:3: ( rule__ComponentID__Group__0 )
            // InternalCDSL.g:251:4: rule__ComponentID__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ComponentID__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComponentIDAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComponentID"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalCDSL.g:260:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalCDSL.g:261:1: ( ruleQualifiedName EOF )
            // InternalCDSL.g:262:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalCDSL.g:269:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCDSL.g:273:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalCDSL.g:274:2: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalCDSL.g:274:2: ( ( rule__QualifiedName__Group__0 ) )
            // InternalCDSL.g:275:3: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // InternalCDSL.g:276:3: ( rule__QualifiedName__Group__0 )
            // InternalCDSL.g:276:4: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleWildCardID"
    // InternalCDSL.g:285:1: entryRuleWildCardID : ruleWildCardID EOF ;
    public final void entryRuleWildCardID() throws RecognitionException {
        try {
            // InternalCDSL.g:286:1: ( ruleWildCardID EOF )
            // InternalCDSL.g:287:1: ruleWildCardID EOF
            {
             before(grammarAccess.getWildCardIDRule()); 
            pushFollow(FOLLOW_1);
            ruleWildCardID();

            state._fsp--;

             after(grammarAccess.getWildCardIDRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleWildCardID"


    // $ANTLR start "ruleWildCardID"
    // InternalCDSL.g:294:1: ruleWildCardID : ( ( rule__WildCardID__Group__0 ) ) ;
    public final void ruleWildCardID() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCDSL.g:298:2: ( ( ( rule__WildCardID__Group__0 ) ) )
            // InternalCDSL.g:299:2: ( ( rule__WildCardID__Group__0 ) )
            {
            // InternalCDSL.g:299:2: ( ( rule__WildCardID__Group__0 ) )
            // InternalCDSL.g:300:3: ( rule__WildCardID__Group__0 )
            {
             before(grammarAccess.getWildCardIDAccess().getGroup()); 
            // InternalCDSL.g:301:3: ( rule__WildCardID__Group__0 )
            // InternalCDSL.g:301:4: rule__WildCardID__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__WildCardID__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWildCardIDAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWildCardID"


    // $ANTLR start "rule__AbstractEntry__Alternatives"
    // InternalCDSL.g:309:1: rule__AbstractEntry__Alternatives : ( ( ruleDValidator ) | ( ruleComponentDescription ) );
    public final void rule__AbstractEntry__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCDSL.g:313:1: ( ( ruleDValidator ) | ( ruleComponentDescription ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            else if ( (LA3_0==17) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalCDSL.g:314:2: ( ruleDValidator )
                    {
                    // InternalCDSL.g:314:2: ( ruleDValidator )
                    // InternalCDSL.g:315:3: ruleDValidator
                    {
                     before(grammarAccess.getAbstractEntryAccess().getDValidatorParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleDValidator();

                    state._fsp--;

                     after(grammarAccess.getAbstractEntryAccess().getDValidatorParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCDSL.g:320:2: ( ruleComponentDescription )
                    {
                    // InternalCDSL.g:320:2: ( ruleComponentDescription )
                    // InternalCDSL.g:321:3: ruleComponentDescription
                    {
                     before(grammarAccess.getAbstractEntryAccess().getComponentDescriptionParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleComponentDescription();

                    state._fsp--;

                     after(grammarAccess.getAbstractEntryAccess().getComponentDescriptionParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractEntry__Alternatives"


    // $ANTLR start "rule__DValidator__Group__0"
    // InternalCDSL.g:330:1: rule__DValidator__Group__0 : rule__DValidator__Group__0__Impl rule__DValidator__Group__1 ;
    public final void rule__DValidator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCDSL.g:334:1: ( rule__DValidator__Group__0__Impl rule__DValidator__Group__1 )
            // InternalCDSL.g:335:2: rule__DValidator__Group__0__Impl rule__DValidator__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__DValidator__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DValidator__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DValidator__Group__0"


    // $ANTLR start "rule__DValidator__Group__0__Impl"
    // InternalCDSL.g:342:1: rule__DValidator__Group__0__Impl : ( 'dval' ) ;
    public final void rule__DValidator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCDSL.g:346:1: ( ( 'dval' ) )
            // InternalCDSL.g:347:1: ( 'dval' )
            {
            // InternalCDSL.g:347:1: ( 'dval' )
            // InternalCDSL.g:348:2: 'dval'
            {
             before(grammarAccess.getDValidatorAccess().getDvalKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getDValidatorAccess().getDvalKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DValidator__Group__0__Impl"


    // $ANTLR start "rule__DValidator__Group__1"
    // InternalCDSL.g:357:1: rule__DValidator__Group__1 : rule__DValidator__Group__1__Impl rule__DValidator__Group__2 ;
    public final void rule__DValidator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCDSL.g:361:1: ( rule__DValidator__Group__1__Impl rule__DValidator__Group__2 )
            // InternalCDSL.g:362:2: rule__DValidator__Group__1__Impl rule__DValidator__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__DValidator__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DValidator__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DValidator__Group__1"


    // $ANTLR start "rule__DValidator__Group__1__Impl"
    // InternalCDSL.g:369:1: rule__DValidator__Group__1__Impl : ( ( rule__DValidator__ValNameAssignment_1 ) ) ;
    public final void rule__DValidator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCDSL.g:373:1: ( ( ( rule__DValidator__ValNameAssignment_1 ) ) )
            // InternalCDSL.g:374:1: ( ( rule__DValidator__ValNameAssignment_1 ) )
            {
            // InternalCDSL.g:374:1: ( ( rule__DValidator__ValNameAssignment_1 ) )
            // InternalCDSL.g:375:2: ( rule__DValidator__ValNameAssignment_1 )
            {
             before(grammarAccess.getDValidatorAccess().getValNameAssignment_1()); 
            // InternalCDSL.g:376:2: ( rule__DValidator__ValNameAssignment_1 )
            // InternalCDSL.g:376:3: rule__DValidator__ValNameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DValidator__ValNameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDValidatorAccess().getValNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DValidator__Group__1__Impl"


    // $ANTLR start "rule__DValidator__Group__2"
    // InternalCDSL.g:384:1: rule__DValidator__Group__2 : rule__DValidator__Group__2__Impl rule__DValidator__Group__3 ;
    public final void rule__DValidator__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCDSL.g:388:1: ( rule__DValidator__Group__2__Impl rule__DValidator__Group__3 )
            // InternalCDSL.g:389:2: rule__DValidator__Group__2__Impl rule__DValidator__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__DValidator__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DValidator__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DValidator__Group__2"


    // $ANTLR start "rule__DValidator__Group__2__Impl"
    // InternalCDSL.g:396:1: rule__DValidator__Group__2__Impl : ( '{' ) ;
    public final void rule__DValidator__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCDSL.g:400:1: ( ( '{' ) )
            // InternalCDSL.g:401:1: ( '{' )
            {
            // InternalCDSL.g:401:1: ( '{' )
            // InternalCDSL.g:402:2: '{'
            {
             before(grammarAccess.getDValidatorAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getDValidatorAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DValidator__Group__2__Impl"


    // $ANTLR start "rule__DValidator__Group__3"
    // InternalCDSL.g:411:1: rule__DValidator__Group__3 : rule__DValidator__Group__3__Impl rule__DValidator__Group__4 ;
    public final void rule__DValidator__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCDSL.g:415:1: ( rule__DValidator__Group__3__Impl rule__DValidator__Group__4 )
            // InternalCDSL.g:416:2: rule__DValidator__Group__3__Impl rule__DValidator__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__DValidator__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DValidator__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DValidator__Group__3"


    // $ANTLR start "rule__DValidator__Group__3__Impl"
    // InternalCDSL.g:423:1: rule__DValidator__Group__3__Impl : ( 'comps' ) ;
    public final void rule__DValidator__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCDSL.g:427:1: ( ( 'comps' ) )
            // InternalCDSL.g:428:1: ( 'comps' )
            {
            // InternalCDSL.g:428:1: ( 'comps' )
            // InternalCDSL.g:429:2: 'comps'
            {
             before(grammarAccess.getDValidatorAccess().getCompsKeyword_3()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getDValidatorAccess().getCompsKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DValidator__Group__3__Impl"


    // $ANTLR start "rule__DValidator__Group__4"
    // InternalCDSL.g:438:1: rule__DValidator__Group__4 : rule__DValidator__Group__4__Impl rule__DValidator__Group__5 ;
    public final void rule__DValidator__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCDSL.g:442:1: ( rule__DValidator__Group__4__Impl rule__DValidator__Group__5 )
            // InternalCDSL.g:443:2: rule__DValidator__Group__4__Impl rule__DValidator__Group__5
            {
            pushFollow(FOLLOW_5);
            rule__DValidator__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DValidator__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DValidator__Group__4"


    // $ANTLR start "rule__DValidator__Group__4__Impl"
    // InternalCDSL.g:450:1: rule__DValidator__Group__4__Impl : ( ':' ) ;
    public final void rule__DValidator__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCDSL.g:454:1: ( ( ':' ) )
            // InternalCDSL.g:455:1: ( ':' )
            {
            // InternalCDSL.g:455:1: ( ':' )
            // InternalCDSL.g:456:2: ':'
            {
             before(grammarAccess.getDValidatorAccess().getColonKeyword_4()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getDValidatorAccess().getColonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DValidator__Group__4__Impl"


    // $ANTLR start "rule__DValidator__Group__5"
    // InternalCDSL.g:465:1: rule__DValidator__Group__5 : rule__DValidator__Group__5__Impl rule__DValidator__Group__6 ;
    public final void rule__DValidator__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCDSL.g:469:1: ( rule__DValidator__Group__5__Impl rule__DValidator__Group__6 )
            // InternalCDSL.g:470:2: rule__DValidator__Group__5__Impl rule__DValidator__Group__6
            {
            pushFollow(FOLLOW_9);
            rule__DValidator__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DValidator__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DValidator__Group__5"


    // $ANTLR start "rule__DValidator__Group__5__Impl"
    // InternalCDSL.g:477:1: rule__DValidator__Group__5__Impl : ( ( ( rule__DValidator__RefComponentsAssignment_5 ) ) ( ( rule__DValidator__RefComponentsAssignment_5 )* ) ) ;
    public final void rule__DValidator__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCDSL.g:481:1: ( ( ( ( rule__DValidator__RefComponentsAssignment_5 ) ) ( ( rule__DValidator__RefComponentsAssignment_5 )* ) ) )
            // InternalCDSL.g:482:1: ( ( ( rule__DValidator__RefComponentsAssignment_5 ) ) ( ( rule__DValidator__RefComponentsAssignment_5 )* ) )
            {
            // InternalCDSL.g:482:1: ( ( ( rule__DValidator__RefComponentsAssignment_5 ) ) ( ( rule__DValidator__RefComponentsAssignment_5 )* ) )
            // InternalCDSL.g:483:2: ( ( rule__DValidator__RefComponentsAssignment_5 ) ) ( ( rule__DValidator__RefComponentsAssignment_5 )* )
            {
            // InternalCDSL.g:483:2: ( ( rule__DValidator__RefComponentsAssignment_5 ) )
            // InternalCDSL.g:484:3: ( rule__DValidator__RefComponentsAssignment_5 )
            {
             before(grammarAccess.getDValidatorAccess().getRefComponentsAssignment_5()); 
            // InternalCDSL.g:485:3: ( rule__DValidator__RefComponentsAssignment_5 )
            // InternalCDSL.g:485:4: rule__DValidator__RefComponentsAssignment_5
            {
            pushFollow(FOLLOW_10);
            rule__DValidator__RefComponentsAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getDValidatorAccess().getRefComponentsAssignment_5()); 

            }

            // InternalCDSL.g:488:2: ( ( rule__DValidator__RefComponentsAssignment_5 )* )
            // InternalCDSL.g:489:3: ( rule__DValidator__RefComponentsAssignment_5 )*
            {
             before(grammarAccess.getDValidatorAccess().getRefComponentsAssignment_5()); 
            // InternalCDSL.g:490:3: ( rule__DValidator__RefComponentsAssignment_5 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalCDSL.g:490:4: rule__DValidator__RefComponentsAssignment_5
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__DValidator__RefComponentsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getDValidatorAccess().getRefComponentsAssignment_5()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DValidator__Group__5__Impl"


    // $ANTLR start "rule__DValidator__Group__6"
    // InternalCDSL.g:499:1: rule__DValidator__Group__6 : rule__DValidator__Group__6__Impl rule__DValidator__Group__7 ;
    public final void rule__DValidator__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCDSL.g:503:1: ( rule__DValidator__Group__6__Impl rule__DValidator__Group__7 )
            // InternalCDSL.g:504:2: rule__DValidator__Group__6__Impl rule__DValidator__Group__7
            {
            pushFollow(FOLLOW_11);
            rule__DValidator__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DValidator__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DValidator__Group__6"


    // $ANTLR start "rule__DValidator__Group__6__Impl"
    // InternalCDSL.g:511:1: rule__DValidator__Group__6__Impl : ( ';' ) ;
    public final void rule__DValidator__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCDSL.g:515:1: ( ( ';' ) )
            // InternalCDSL.g:516:1: ( ';' )
            {
            // InternalCDSL.g:516:1: ( ';' )
            // InternalCDSL.g:517:2: ';'
            {
             before(grammarAccess.getDValidatorAccess().getSemicolonKeyword_6()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getDValidatorAccess().getSemicolonKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DValidator__Group__6__Impl"


    // $ANTLR start "rule__DValidator__Group__7"
    // InternalCDSL.g:526:1: rule__DValidator__Group__7 : rule__DValidator__Group__7__Impl ;
    public final void rule__DValidator__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCDSL.g:530:1: ( rule__DValidator__Group__7__Impl )
            // InternalCDSL.g:531:2: rule__DValidator__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DValidator__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DValidator__Group__7"


    // $ANTLR start "rule__DValidator__Group__7__Impl"
    // InternalCDSL.g:537:1: rule__DValidator__Group__7__Impl : ( '}' ) ;
    public final void rule__DValidator__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCDSL.g:541:1: ( ( '}' ) )
            // InternalCDSL.g:542:1: ( '}' )
            {
            // InternalCDSL.g:542:1: ( '}' )
            // InternalCDSL.g:543:2: '}'
            {
             before(grammarAccess.getDValidatorAccess().getRightCurlyBracketKeyword_7()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getDValidatorAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DValidator__Group__7__Impl"


    // $ANTLR start "rule__ComponentDescription__Group__0"
    // InternalCDSL.g:553:1: rule__ComponentDescription__Group__0 : rule__ComponentDescription__Group__0__Impl rule__ComponentDescription__Group__1 ;
    public final void rule__ComponentDescription__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCDSL.g:557:1: ( rule__ComponentDescription__Group__0__Impl rule__ComponentDescription__Group__1 )
            // InternalCDSL.g:558:2: rule__ComponentDescription__Group__0__Impl rule__ComponentDescription__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__ComponentDescription__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentDescription__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentDescription__Group__0"


    // $ANTLR start "rule__ComponentDescription__Group__0__Impl"
    // InternalCDSL.g:565:1: rule__ComponentDescription__Group__0__Impl : ( 'comp' ) ;
    public final void rule__ComponentDescription__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCDSL.g:569:1: ( ( 'comp' ) )
            // InternalCDSL.g:570:1: ( 'comp' )
            {
            // InternalCDSL.g:570:1: ( 'comp' )
            // InternalCDSL.g:571:2: 'comp'
            {
             before(grammarAccess.getComponentDescriptionAccess().getCompKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getComponentDescriptionAccess().getCompKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentDescription__Group__0__Impl"


    // $ANTLR start "rule__ComponentDescription__Group__1"
    // InternalCDSL.g:580:1: rule__ComponentDescription__Group__1 : rule__ComponentDescription__Group__1__Impl rule__ComponentDescription__Group__2 ;
    public final void rule__ComponentDescription__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCDSL.g:584:1: ( rule__ComponentDescription__Group__1__Impl rule__ComponentDescription__Group__2 )
            // InternalCDSL.g:585:2: rule__ComponentDescription__Group__1__Impl rule__ComponentDescription__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__ComponentDescription__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentDescription__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentDescription__Group__1"


    // $ANTLR start "rule__ComponentDescription__Group__1__Impl"
    // InternalCDSL.g:592:1: rule__ComponentDescription__Group__1__Impl : ( ( rule__ComponentDescription__NameAssignment_1 ) ) ;
    public final void rule__ComponentDescription__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCDSL.g:596:1: ( ( ( rule__ComponentDescription__NameAssignment_1 ) ) )
            // InternalCDSL.g:597:1: ( ( rule__ComponentDescription__NameAssignment_1 ) )
            {
            // InternalCDSL.g:597:1: ( ( rule__ComponentDescription__NameAssignment_1 ) )
            // InternalCDSL.g:598:2: ( rule__ComponentDescription__NameAssignment_1 )
            {
             before(grammarAccess.getComponentDescriptionAccess().getNameAssignment_1()); 
            // InternalCDSL.g:599:2: ( rule__ComponentDescription__NameAssignment_1 )
            // InternalCDSL.g:599:3: rule__ComponentDescription__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ComponentDescription__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getComponentDescriptionAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentDescription__Group__1__Impl"


    // $ANTLR start "rule__ComponentDescription__Group__2"
    // InternalCDSL.g:607:1: rule__ComponentDescription__Group__2 : rule__ComponentDescription__Group__2__Impl rule__ComponentDescription__Group__3 ;
    public final void rule__ComponentDescription__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCDSL.g:611:1: ( rule__ComponentDescription__Group__2__Impl rule__ComponentDescription__Group__3 )
            // InternalCDSL.g:612:2: rule__ComponentDescription__Group__2__Impl rule__ComponentDescription__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__ComponentDescription__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentDescription__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentDescription__Group__2"


    // $ANTLR start "rule__ComponentDescription__Group__2__Impl"
    // InternalCDSL.g:619:1: rule__ComponentDescription__Group__2__Impl : ( '{' ) ;
    public final void rule__ComponentDescription__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCDSL.g:623:1: ( ( '{' ) )
            // InternalCDSL.g:624:1: ( '{' )
            {
            // InternalCDSL.g:624:1: ( '{' )
            // InternalCDSL.g:625:2: '{'
            {
             before(grammarAccess.getComponentDescriptionAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getComponentDescriptionAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentDescription__Group__2__Impl"


    // $ANTLR start "rule__ComponentDescription__Group__3"
    // InternalCDSL.g:634:1: rule__ComponentDescription__Group__3 : rule__ComponentDescription__Group__3__Impl rule__ComponentDescription__Group__4 ;
    public final void rule__ComponentDescription__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCDSL.g:638:1: ( rule__ComponentDescription__Group__3__Impl rule__ComponentDescription__Group__4 )
            // InternalCDSL.g:639:2: rule__ComponentDescription__Group__3__Impl rule__ComponentDescription__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__ComponentDescription__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentDescription__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentDescription__Group__3"


    // $ANTLR start "rule__ComponentDescription__Group__3__Impl"
    // InternalCDSL.g:646:1: rule__ComponentDescription__Group__3__Impl : ( ( rule__ComponentDescription__PortsAssignment_3 )? ) ;
    public final void rule__ComponentDescription__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCDSL.g:650:1: ( ( ( rule__ComponentDescription__PortsAssignment_3 )? ) )
            // InternalCDSL.g:651:1: ( ( rule__ComponentDescription__PortsAssignment_3 )? )
            {
            // InternalCDSL.g:651:1: ( ( rule__ComponentDescription__PortsAssignment_3 )? )
            // InternalCDSL.g:652:2: ( rule__ComponentDescription__PortsAssignment_3 )?
            {
             before(grammarAccess.getComponentDescriptionAccess().getPortsAssignment_3()); 
            // InternalCDSL.g:653:2: ( rule__ComponentDescription__PortsAssignment_3 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalCDSL.g:653:3: rule__ComponentDescription__PortsAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__ComponentDescription__PortsAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getComponentDescriptionAccess().getPortsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentDescription__Group__3__Impl"


    // $ANTLR start "rule__ComponentDescription__Group__4"
    // InternalCDSL.g:661:1: rule__ComponentDescription__Group__4 : rule__ComponentDescription__Group__4__Impl rule__ComponentDescription__Group__5 ;
    public final void rule__ComponentDescription__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCDSL.g:665:1: ( rule__ComponentDescription__Group__4__Impl rule__ComponentDescription__Group__5 )
            // InternalCDSL.g:666:2: rule__ComponentDescription__Group__4__Impl rule__ComponentDescription__Group__5
            {
            pushFollow(FOLLOW_12);
            rule__ComponentDescription__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentDescription__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentDescription__Group__4"


    // $ANTLR start "rule__ComponentDescription__Group__4__Impl"
    // InternalCDSL.g:673:1: rule__ComponentDescription__Group__4__Impl : ( ( rule__ComponentDescription__UnitsAssignment_4 )? ) ;
    public final void rule__ComponentDescription__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCDSL.g:677:1: ( ( ( rule__ComponentDescription__UnitsAssignment_4 )? ) )
            // InternalCDSL.g:678:1: ( ( rule__ComponentDescription__UnitsAssignment_4 )? )
            {
            // InternalCDSL.g:678:1: ( ( rule__ComponentDescription__UnitsAssignment_4 )? )
            // InternalCDSL.g:679:2: ( rule__ComponentDescription__UnitsAssignment_4 )?
            {
             before(grammarAccess.getComponentDescriptionAccess().getUnitsAssignment_4()); 
            // InternalCDSL.g:680:2: ( rule__ComponentDescription__UnitsAssignment_4 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==20) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalCDSL.g:680:3: rule__ComponentDescription__UnitsAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__ComponentDescription__UnitsAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getComponentDescriptionAccess().getUnitsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentDescription__Group__4__Impl"


    // $ANTLR start "rule__ComponentDescription__Group__5"
    // InternalCDSL.g:688:1: rule__ComponentDescription__Group__5 : rule__ComponentDescription__Group__5__Impl rule__ComponentDescription__Group__6 ;
    public final void rule__ComponentDescription__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCDSL.g:692:1: ( rule__ComponentDescription__Group__5__Impl rule__ComponentDescription__Group__6 )
            // InternalCDSL.g:693:2: rule__ComponentDescription__Group__5__Impl rule__ComponentDescription__Group__6
            {
            pushFollow(FOLLOW_12);
            rule__ComponentDescription__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentDescription__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentDescription__Group__5"


    // $ANTLR start "rule__ComponentDescription__Group__5__Impl"
    // InternalCDSL.g:700:1: rule__ComponentDescription__Group__5__Impl : ( ( rule__ComponentDescription__NotAllowedRefAssignment_5 )? ) ;
    public final void rule__ComponentDescription__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCDSL.g:704:1: ( ( ( rule__ComponentDescription__NotAllowedRefAssignment_5 )? ) )
            // InternalCDSL.g:705:1: ( ( rule__ComponentDescription__NotAllowedRefAssignment_5 )? )
            {
            // InternalCDSL.g:705:1: ( ( rule__ComponentDescription__NotAllowedRefAssignment_5 )? )
            // InternalCDSL.g:706:2: ( rule__ComponentDescription__NotAllowedRefAssignment_5 )?
            {
             before(grammarAccess.getComponentDescriptionAccess().getNotAllowedRefAssignment_5()); 
            // InternalCDSL.g:707:2: ( rule__ComponentDescription__NotAllowedRefAssignment_5 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalCDSL.g:707:3: rule__ComponentDescription__NotAllowedRefAssignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__ComponentDescription__NotAllowedRefAssignment_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getComponentDescriptionAccess().getNotAllowedRefAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentDescription__Group__5__Impl"


    // $ANTLR start "rule__ComponentDescription__Group__6"
    // InternalCDSL.g:715:1: rule__ComponentDescription__Group__6 : rule__ComponentDescription__Group__6__Impl ;
    public final void rule__ComponentDescription__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCDSL.g:719:1: ( rule__ComponentDescription__Group__6__Impl )
            // InternalCDSL.g:720:2: rule__ComponentDescription__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComponentDescription__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentDescription__Group__6"


    // $ANTLR start "rule__ComponentDescription__Group__6__Impl"
    // InternalCDSL.g:726:1: rule__ComponentDescription__Group__6__Impl : ( '}' ) ;
    public final void rule__ComponentDescription__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCDSL.g:730:1: ( ( '}' ) )
            // InternalCDSL.g:731:1: ( '}' )
            {
            // InternalCDSL.g:731:1: ( '}' )
            // InternalCDSL.g:732:2: '}'
            {
             before(grammarAccess.getComponentDescriptionAccess().getRightCurlyBracketKeyword_6()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getComponentDescriptionAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentDescription__Group__6__Impl"


    // $ANTLR start "rule__Ports__Group__0"
    // InternalCDSL.g:742:1: rule__Ports__Group__0 : rule__Ports__Group__0__Impl rule__Ports__Group__1 ;
    public final void rule__Ports__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCDSL.g:746:1: ( rule__Ports__Group__0__Impl rule__Ports__Group__1 )
            // InternalCDSL.g:747:2: rule__Ports__Group__0__Impl rule__Ports__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Ports__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ports__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ports__Group__0"


    // $ANTLR start "rule__Ports__Group__0__Impl"
    // InternalCDSL.g:754:1: rule__Ports__Group__0__Impl : ( 'ports' ) ;
    public final void rule__Ports__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCDSL.g:758:1: ( ( 'ports' ) )
            // InternalCDSL.g:759:1: ( 'ports' )
            {
            // InternalCDSL.g:759:1: ( 'ports' )
            // InternalCDSL.g:760:2: 'ports'
            {
             before(grammarAccess.getPortsAccess().getPortsKeyword_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getPortsAccess().getPortsKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ports__Group__0__Impl"


    // $ANTLR start "rule__Ports__Group__1"
    // InternalCDSL.g:769:1: rule__Ports__Group__1 : rule__Ports__Group__1__Impl rule__Ports__Group__2 ;
    public final void rule__Ports__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCDSL.g:773:1: ( rule__Ports__Group__1__Impl rule__Ports__Group__2 )
            // InternalCDSL.g:774:2: rule__Ports__Group__1__Impl rule__Ports__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Ports__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ports__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ports__Group__1"


    // $ANTLR start "rule__Ports__Group__1__Impl"
    // InternalCDSL.g:781:1: rule__Ports__Group__1__Impl : ( ':' ) ;
    public final void rule__Ports__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCDSL.g:785:1: ( ( ':' ) )
            // InternalCDSL.g:786:1: ( ':' )
            {
            // InternalCDSL.g:786:1: ( ':' )
            // InternalCDSL.g:787:2: ':'
            {
             before(grammarAccess.getPortsAccess().getColonKeyword_1()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getPortsAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ports__Group__1__Impl"


    // $ANTLR start "rule__Ports__Group__2"
    // InternalCDSL.g:796:1: rule__Ports__Group__2 : rule__Ports__Group__2__Impl rule__Ports__Group__3 ;
    public final void rule__Ports__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCDSL.g:800:1: ( rule__Ports__Group__2__Impl rule__Ports__Group__3 )
            // InternalCDSL.g:801:2: rule__Ports__Group__2__Impl rule__Ports__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__Ports__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ports__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ports__Group__2"


    // $ANTLR start "rule__Ports__Group__2__Impl"
    // InternalCDSL.g:808:1: rule__Ports__Group__2__Impl : ( ( ( rule__Ports__PortAssignment_2 ) ) ( ( rule__Ports__PortAssignment_2 )* ) ) ;
    public final void rule__Ports__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCDSL.g:812:1: ( ( ( ( rule__Ports__PortAssignment_2 ) ) ( ( rule__Ports__PortAssignment_2 )* ) ) )
            // InternalCDSL.g:813:1: ( ( ( rule__Ports__PortAssignment_2 ) ) ( ( rule__Ports__PortAssignment_2 )* ) )
            {
            // InternalCDSL.g:813:1: ( ( ( rule__Ports__PortAssignment_2 ) ) ( ( rule__Ports__PortAssignment_2 )* ) )
            // InternalCDSL.g:814:2: ( ( rule__Ports__PortAssignment_2 ) ) ( ( rule__Ports__PortAssignment_2 )* )
            {
            // InternalCDSL.g:814:2: ( ( rule__Ports__PortAssignment_2 ) )
            // InternalCDSL.g:815:3: ( rule__Ports__PortAssignment_2 )
            {
             before(grammarAccess.getPortsAccess().getPortAssignment_2()); 
            // InternalCDSL.g:816:3: ( rule__Ports__PortAssignment_2 )
            // InternalCDSL.g:816:4: rule__Ports__PortAssignment_2
            {
            pushFollow(FOLLOW_10);
            rule__Ports__PortAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPortsAccess().getPortAssignment_2()); 

            }

            // InternalCDSL.g:819:2: ( ( rule__Ports__PortAssignment_2 )* )
            // InternalCDSL.g:820:3: ( rule__Ports__PortAssignment_2 )*
            {
             before(grammarAccess.getPortsAccess().getPortAssignment_2()); 
            // InternalCDSL.g:821:3: ( rule__Ports__PortAssignment_2 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalCDSL.g:821:4: rule__Ports__PortAssignment_2
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Ports__PortAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getPortsAccess().getPortAssignment_2()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ports__Group__2__Impl"


    // $ANTLR start "rule__Ports__Group__3"
    // InternalCDSL.g:830:1: rule__Ports__Group__3 : rule__Ports__Group__3__Impl ;
    public final void rule__Ports__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCDSL.g:834:1: ( rule__Ports__Group__3__Impl )
            // InternalCDSL.g:835:2: rule__Ports__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Ports__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ports__Group__3"


    // $ANTLR start "rule__Ports__Group__3__Impl"
    // InternalCDSL.g:841:1: rule__Ports__Group__3__Impl : ( ';' ) ;
    public final void rule__Ports__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCDSL.g:845:1: ( ( ';' ) )
            // InternalCDSL.g:846:1: ( ';' )
            {
            // InternalCDSL.g:846:1: ( ';' )
            // InternalCDSL.g:847:2: ';'
            {
             before(grammarAccess.getPortsAccess().getSemicolonKeyword_3()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getPortsAccess().getSemicolonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ports__Group__3__Impl"


    // $ANTLR start "rule__NotAllowedRef__Group__0"
    // InternalCDSL.g:857:1: rule__NotAllowedRef__Group__0 : rule__NotAllowedRef__Group__0__Impl rule__NotAllowedRef__Group__1 ;
    public final void rule__NotAllowedRef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCDSL.g:861:1: ( rule__NotAllowedRef__Group__0__Impl rule__NotAllowedRef__Group__1 )
            // InternalCDSL.g:862:2: rule__NotAllowedRef__Group__0__Impl rule__NotAllowedRef__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__NotAllowedRef__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NotAllowedRef__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NotAllowedRef__Group__0"


    // $ANTLR start "rule__NotAllowedRef__Group__0__Impl"
    // InternalCDSL.g:869:1: rule__NotAllowedRef__Group__0__Impl : ( 'forbidden' ) ;
    public final void rule__NotAllowedRef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCDSL.g:873:1: ( ( 'forbidden' ) )
            // InternalCDSL.g:874:1: ( 'forbidden' )
            {
            // InternalCDSL.g:874:1: ( 'forbidden' )
            // InternalCDSL.g:875:2: 'forbidden'
            {
             before(grammarAccess.getNotAllowedRefAccess().getForbiddenKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getNotAllowedRefAccess().getForbiddenKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NotAllowedRef__Group__0__Impl"


    // $ANTLR start "rule__NotAllowedRef__Group__1"
    // InternalCDSL.g:884:1: rule__NotAllowedRef__Group__1 : rule__NotAllowedRef__Group__1__Impl rule__NotAllowedRef__Group__2 ;
    public final void rule__NotAllowedRef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCDSL.g:888:1: ( rule__NotAllowedRef__Group__1__Impl rule__NotAllowedRef__Group__2 )
            // InternalCDSL.g:889:2: rule__NotAllowedRef__Group__1__Impl rule__NotAllowedRef__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__NotAllowedRef__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NotAllowedRef__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NotAllowedRef__Group__1"


    // $ANTLR start "rule__NotAllowedRef__Group__1__Impl"
    // InternalCDSL.g:896:1: rule__NotAllowedRef__Group__1__Impl : ( ':' ) ;
    public final void rule__NotAllowedRef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCDSL.g:900:1: ( ( ':' ) )
            // InternalCDSL.g:901:1: ( ':' )
            {
            // InternalCDSL.g:901:1: ( ':' )
            // InternalCDSL.g:902:2: ':'
            {
             before(grammarAccess.getNotAllowedRefAccess().getColonKeyword_1()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getNotAllowedRefAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NotAllowedRef__Group__1__Impl"


    // $ANTLR start "rule__NotAllowedRef__Group__2"
    // InternalCDSL.g:911:1: rule__NotAllowedRef__Group__2 : rule__NotAllowedRef__Group__2__Impl rule__NotAllowedRef__Group__3 ;
    public final void rule__NotAllowedRef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCDSL.g:915:1: ( rule__NotAllowedRef__Group__2__Impl rule__NotAllowedRef__Group__3 )
            // InternalCDSL.g:916:2: rule__NotAllowedRef__Group__2__Impl rule__NotAllowedRef__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__NotAllowedRef__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NotAllowedRef__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NotAllowedRef__Group__2"


    // $ANTLR start "rule__NotAllowedRef__Group__2__Impl"
    // InternalCDSL.g:923:1: rule__NotAllowedRef__Group__2__Impl : ( ( ( rule__NotAllowedRef__UnitsAssignment_2 ) ) ( ( rule__NotAllowedRef__UnitsAssignment_2 )* ) ) ;
    public final void rule__NotAllowedRef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCDSL.g:927:1: ( ( ( ( rule__NotAllowedRef__UnitsAssignment_2 ) ) ( ( rule__NotAllowedRef__UnitsAssignment_2 )* ) ) )
            // InternalCDSL.g:928:1: ( ( ( rule__NotAllowedRef__UnitsAssignment_2 ) ) ( ( rule__NotAllowedRef__UnitsAssignment_2 )* ) )
            {
            // InternalCDSL.g:928:1: ( ( ( rule__NotAllowedRef__UnitsAssignment_2 ) ) ( ( rule__NotAllowedRef__UnitsAssignment_2 )* ) )
            // InternalCDSL.g:929:2: ( ( rule__NotAllowedRef__UnitsAssignment_2 ) ) ( ( rule__NotAllowedRef__UnitsAssignment_2 )* )
            {
            // InternalCDSL.g:929:2: ( ( rule__NotAllowedRef__UnitsAssignment_2 ) )
            // InternalCDSL.g:930:3: ( rule__NotAllowedRef__UnitsAssignment_2 )
            {
             before(grammarAccess.getNotAllowedRefAccess().getUnitsAssignment_2()); 
            // InternalCDSL.g:931:3: ( rule__NotAllowedRef__UnitsAssignment_2 )
            // InternalCDSL.g:931:4: rule__NotAllowedRef__UnitsAssignment_2
            {
            pushFollow(FOLLOW_10);
            rule__NotAllowedRef__UnitsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getNotAllowedRefAccess().getUnitsAssignment_2()); 

            }

            // InternalCDSL.g:934:2: ( ( rule__NotAllowedRef__UnitsAssignment_2 )* )
            // InternalCDSL.g:935:3: ( rule__NotAllowedRef__UnitsAssignment_2 )*
            {
             before(grammarAccess.getNotAllowedRefAccess().getUnitsAssignment_2()); 
            // InternalCDSL.g:936:3: ( rule__NotAllowedRef__UnitsAssignment_2 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalCDSL.g:936:4: rule__NotAllowedRef__UnitsAssignment_2
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__NotAllowedRef__UnitsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getNotAllowedRefAccess().getUnitsAssignment_2()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NotAllowedRef__Group__2__Impl"


    // $ANTLR start "rule__NotAllowedRef__Group__3"
    // InternalCDSL.g:945:1: rule__NotAllowedRef__Group__3 : rule__NotAllowedRef__Group__3__Impl ;
    public final void rule__NotAllowedRef__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCDSL.g:949:1: ( rule__NotAllowedRef__Group__3__Impl )
            // InternalCDSL.g:950:2: rule__NotAllowedRef__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NotAllowedRef__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NotAllowedRef__Group__3"


    // $ANTLR start "rule__NotAllowedRef__Group__3__Impl"
    // InternalCDSL.g:956:1: rule__NotAllowedRef__Group__3__Impl : ( ';' ) ;
    public final void rule__NotAllowedRef__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCDSL.g:960:1: ( ( ';' ) )
            // InternalCDSL.g:961:1: ( ';' )
            {
            // InternalCDSL.g:961:1: ( ';' )
            // InternalCDSL.g:962:2: ';'
            {
             before(grammarAccess.getNotAllowedRefAccess().getSemicolonKeyword_3()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getNotAllowedRefAccess().getSemicolonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NotAllowedRef__Group__3__Impl"


    // $ANTLR start "rule__ComponentID__Group__0"
    // InternalCDSL.g:972:1: rule__ComponentID__Group__0 : rule__ComponentID__Group__0__Impl rule__ComponentID__Group__1 ;
    public final void rule__ComponentID__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCDSL.g:976:1: ( rule__ComponentID__Group__0__Impl rule__ComponentID__Group__1 )
            // InternalCDSL.g:977:2: rule__ComponentID__Group__0__Impl rule__ComponentID__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__ComponentID__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentID__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentID__Group__0"


    // $ANTLR start "rule__ComponentID__Group__0__Impl"
    // InternalCDSL.g:984:1: rule__ComponentID__Group__0__Impl : ( 'idents' ) ;
    public final void rule__ComponentID__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCDSL.g:988:1: ( ( 'idents' ) )
            // InternalCDSL.g:989:1: ( 'idents' )
            {
            // InternalCDSL.g:989:1: ( 'idents' )
            // InternalCDSL.g:990:2: 'idents'
            {
             before(grammarAccess.getComponentIDAccess().getIdentsKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getComponentIDAccess().getIdentsKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentID__Group__0__Impl"


    // $ANTLR start "rule__ComponentID__Group__1"
    // InternalCDSL.g:999:1: rule__ComponentID__Group__1 : rule__ComponentID__Group__1__Impl rule__ComponentID__Group__2 ;
    public final void rule__ComponentID__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCDSL.g:1003:1: ( rule__ComponentID__Group__1__Impl rule__ComponentID__Group__2 )
            // InternalCDSL.g:1004:2: rule__ComponentID__Group__1__Impl rule__ComponentID__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__ComponentID__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentID__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentID__Group__1"


    // $ANTLR start "rule__ComponentID__Group__1__Impl"
    // InternalCDSL.g:1011:1: rule__ComponentID__Group__1__Impl : ( ':' ) ;
    public final void rule__ComponentID__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCDSL.g:1015:1: ( ( ':' ) )
            // InternalCDSL.g:1016:1: ( ':' )
            {
            // InternalCDSL.g:1016:1: ( ':' )
            // InternalCDSL.g:1017:2: ':'
            {
             before(grammarAccess.getComponentIDAccess().getColonKeyword_1()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getComponentIDAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentID__Group__1__Impl"


    // $ANTLR start "rule__ComponentID__Group__2"
    // InternalCDSL.g:1026:1: rule__ComponentID__Group__2 : rule__ComponentID__Group__2__Impl rule__ComponentID__Group__3 ;
    public final void rule__ComponentID__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCDSL.g:1030:1: ( rule__ComponentID__Group__2__Impl rule__ComponentID__Group__3 )
            // InternalCDSL.g:1031:2: rule__ComponentID__Group__2__Impl rule__ComponentID__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__ComponentID__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentID__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentID__Group__2"


    // $ANTLR start "rule__ComponentID__Group__2__Impl"
    // InternalCDSL.g:1038:1: rule__ComponentID__Group__2__Impl : ( ( ( rule__ComponentID__QualifiedNamesAssignment_2 ) ) ( ( rule__ComponentID__QualifiedNamesAssignment_2 )* ) ) ;
    public final void rule__ComponentID__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCDSL.g:1042:1: ( ( ( ( rule__ComponentID__QualifiedNamesAssignment_2 ) ) ( ( rule__ComponentID__QualifiedNamesAssignment_2 )* ) ) )
            // InternalCDSL.g:1043:1: ( ( ( rule__ComponentID__QualifiedNamesAssignment_2 ) ) ( ( rule__ComponentID__QualifiedNamesAssignment_2 )* ) )
            {
            // InternalCDSL.g:1043:1: ( ( ( rule__ComponentID__QualifiedNamesAssignment_2 ) ) ( ( rule__ComponentID__QualifiedNamesAssignment_2 )* ) )
            // InternalCDSL.g:1044:2: ( ( rule__ComponentID__QualifiedNamesAssignment_2 ) ) ( ( rule__ComponentID__QualifiedNamesAssignment_2 )* )
            {
            // InternalCDSL.g:1044:2: ( ( rule__ComponentID__QualifiedNamesAssignment_2 ) )
            // InternalCDSL.g:1045:3: ( rule__ComponentID__QualifiedNamesAssignment_2 )
            {
             before(grammarAccess.getComponentIDAccess().getQualifiedNamesAssignment_2()); 
            // InternalCDSL.g:1046:3: ( rule__ComponentID__QualifiedNamesAssignment_2 )
            // InternalCDSL.g:1046:4: rule__ComponentID__QualifiedNamesAssignment_2
            {
            pushFollow(FOLLOW_10);
            rule__ComponentID__QualifiedNamesAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getComponentIDAccess().getQualifiedNamesAssignment_2()); 

            }

            // InternalCDSL.g:1049:2: ( ( rule__ComponentID__QualifiedNamesAssignment_2 )* )
            // InternalCDSL.g:1050:3: ( rule__ComponentID__QualifiedNamesAssignment_2 )*
            {
             before(grammarAccess.getComponentIDAccess().getQualifiedNamesAssignment_2()); 
            // InternalCDSL.g:1051:3: ( rule__ComponentID__QualifiedNamesAssignment_2 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalCDSL.g:1051:4: rule__ComponentID__QualifiedNamesAssignment_2
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__ComponentID__QualifiedNamesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getComponentIDAccess().getQualifiedNamesAssignment_2()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentID__Group__2__Impl"


    // $ANTLR start "rule__ComponentID__Group__3"
    // InternalCDSL.g:1060:1: rule__ComponentID__Group__3 : rule__ComponentID__Group__3__Impl ;
    public final void rule__ComponentID__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCDSL.g:1064:1: ( rule__ComponentID__Group__3__Impl )
            // InternalCDSL.g:1065:2: rule__ComponentID__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComponentID__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentID__Group__3"


    // $ANTLR start "rule__ComponentID__Group__3__Impl"
    // InternalCDSL.g:1071:1: rule__ComponentID__Group__3__Impl : ( ';' ) ;
    public final void rule__ComponentID__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCDSL.g:1075:1: ( ( ';' ) )
            // InternalCDSL.g:1076:1: ( ';' )
            {
            // InternalCDSL.g:1076:1: ( ';' )
            // InternalCDSL.g:1077:2: ';'
            {
             before(grammarAccess.getComponentIDAccess().getSemicolonKeyword_3()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getComponentIDAccess().getSemicolonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentID__Group__3__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // InternalCDSL.g:1087:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCDSL.g:1091:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalCDSL.g:1092:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0"


    // $ANTLR start "rule__QualifiedName__Group__0__Impl"
    // InternalCDSL.g:1099:1: rule__QualifiedName__Group__0__Impl : ( ruleWildCardID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCDSL.g:1103:1: ( ( ruleWildCardID ) )
            // InternalCDSL.g:1104:1: ( ruleWildCardID )
            {
            // InternalCDSL.g:1104:1: ( ruleWildCardID )
            // InternalCDSL.g:1105:2: ruleWildCardID
            {
             before(grammarAccess.getQualifiedNameAccess().getWildCardIDParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleWildCardID();

            state._fsp--;

             after(grammarAccess.getQualifiedNameAccess().getWildCardIDParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group__1"
    // InternalCDSL.g:1114:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCDSL.g:1118:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalCDSL.g:1119:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1"


    // $ANTLR start "rule__QualifiedName__Group__1__Impl"
    // InternalCDSL.g:1125:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCDSL.g:1129:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalCDSL.g:1130:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalCDSL.g:1130:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalCDSL.g:1131:2: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // InternalCDSL.g:1132:2: ( rule__QualifiedName__Group_1__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==21) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalCDSL.g:1132:3: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getQualifiedNameAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__0"
    // InternalCDSL.g:1141:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCDSL.g:1145:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalCDSL.g:1146:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_5);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0"


    // $ANTLR start "rule__QualifiedName__Group_1__0__Impl"
    // InternalCDSL.g:1153:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCDSL.g:1157:1: ( ( '.' ) )
            // InternalCDSL.g:1158:1: ( '.' )
            {
            // InternalCDSL.g:1158:1: ( '.' )
            // InternalCDSL.g:1159:2: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__1"
    // InternalCDSL.g:1168:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCDSL.g:1172:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalCDSL.g:1173:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1"


    // $ANTLR start "rule__QualifiedName__Group_1__1__Impl"
    // InternalCDSL.g:1179:1: rule__QualifiedName__Group_1__1__Impl : ( ruleWildCardID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCDSL.g:1183:1: ( ( ruleWildCardID ) )
            // InternalCDSL.g:1184:1: ( ruleWildCardID )
            {
            // InternalCDSL.g:1184:1: ( ruleWildCardID )
            // InternalCDSL.g:1185:2: ruleWildCardID
            {
             before(grammarAccess.getQualifiedNameAccess().getWildCardIDParserRuleCall_1_1()); 
            pushFollow(FOLLOW_2);
            ruleWildCardID();

            state._fsp--;

             after(grammarAccess.getQualifiedNameAccess().getWildCardIDParserRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1__Impl"


    // $ANTLR start "rule__WildCardID__Group__0"
    // InternalCDSL.g:1195:1: rule__WildCardID__Group__0 : rule__WildCardID__Group__0__Impl rule__WildCardID__Group__1 ;
    public final void rule__WildCardID__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCDSL.g:1199:1: ( rule__WildCardID__Group__0__Impl rule__WildCardID__Group__1 )
            // InternalCDSL.g:1200:2: rule__WildCardID__Group__0__Impl rule__WildCardID__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__WildCardID__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WildCardID__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WildCardID__Group__0"


    // $ANTLR start "rule__WildCardID__Group__0__Impl"
    // InternalCDSL.g:1207:1: rule__WildCardID__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__WildCardID__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCDSL.g:1211:1: ( ( RULE_ID ) )
            // InternalCDSL.g:1212:1: ( RULE_ID )
            {
            // InternalCDSL.g:1212:1: ( RULE_ID )
            // InternalCDSL.g:1213:2: RULE_ID
            {
             before(grammarAccess.getWildCardIDAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getWildCardIDAccess().getIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WildCardID__Group__0__Impl"


    // $ANTLR start "rule__WildCardID__Group__1"
    // InternalCDSL.g:1222:1: rule__WildCardID__Group__1 : rule__WildCardID__Group__1__Impl ;
    public final void rule__WildCardID__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCDSL.g:1226:1: ( rule__WildCardID__Group__1__Impl )
            // InternalCDSL.g:1227:2: rule__WildCardID__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WildCardID__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WildCardID__Group__1"


    // $ANTLR start "rule__WildCardID__Group__1__Impl"
    // InternalCDSL.g:1233:1: rule__WildCardID__Group__1__Impl : ( ( '*' )? ) ;
    public final void rule__WildCardID__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCDSL.g:1237:1: ( ( ( '*' )? ) )
            // InternalCDSL.g:1238:1: ( ( '*' )? )
            {
            // InternalCDSL.g:1238:1: ( ( '*' )? )
            // InternalCDSL.g:1239:2: ( '*' )?
            {
             before(grammarAccess.getWildCardIDAccess().getAsteriskKeyword_1()); 
            // InternalCDSL.g:1240:2: ( '*' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==22) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalCDSL.g:1240:3: '*'
                    {
                    match(input,22,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getWildCardIDAccess().getAsteriskKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WildCardID__Group__1__Impl"


    // $ANTLR start "rule__Domainmodel__EntriesAssignment"
    // InternalCDSL.g:1249:1: rule__Domainmodel__EntriesAssignment : ( ruleAbstractEntry ) ;
    public final void rule__Domainmodel__EntriesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCDSL.g:1253:1: ( ( ruleAbstractEntry ) )
            // InternalCDSL.g:1254:2: ( ruleAbstractEntry )
            {
            // InternalCDSL.g:1254:2: ( ruleAbstractEntry )
            // InternalCDSL.g:1255:3: ruleAbstractEntry
            {
             before(grammarAccess.getDomainmodelAccess().getEntriesAbstractEntryParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleAbstractEntry();

            state._fsp--;

             after(grammarAccess.getDomainmodelAccess().getEntriesAbstractEntryParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domainmodel__EntriesAssignment"


    // $ANTLR start "rule__DValidator__ValNameAssignment_1"
    // InternalCDSL.g:1264:1: rule__DValidator__ValNameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DValidator__ValNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCDSL.g:1268:1: ( ( RULE_ID ) )
            // InternalCDSL.g:1269:2: ( RULE_ID )
            {
            // InternalCDSL.g:1269:2: ( RULE_ID )
            // InternalCDSL.g:1270:3: RULE_ID
            {
             before(grammarAccess.getDValidatorAccess().getValNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDValidatorAccess().getValNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DValidator__ValNameAssignment_1"


    // $ANTLR start "rule__DValidator__RefComponentsAssignment_5"
    // InternalCDSL.g:1279:1: rule__DValidator__RefComponentsAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__DValidator__RefComponentsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCDSL.g:1283:1: ( ( ( RULE_ID ) ) )
            // InternalCDSL.g:1284:2: ( ( RULE_ID ) )
            {
            // InternalCDSL.g:1284:2: ( ( RULE_ID ) )
            // InternalCDSL.g:1285:3: ( RULE_ID )
            {
             before(grammarAccess.getDValidatorAccess().getRefComponentsComponentDescriptionCrossReference_5_0()); 
            // InternalCDSL.g:1286:3: ( RULE_ID )
            // InternalCDSL.g:1287:4: RULE_ID
            {
             before(grammarAccess.getDValidatorAccess().getRefComponentsComponentDescriptionIDTerminalRuleCall_5_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDValidatorAccess().getRefComponentsComponentDescriptionIDTerminalRuleCall_5_0_1()); 

            }

             after(grammarAccess.getDValidatorAccess().getRefComponentsComponentDescriptionCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DValidator__RefComponentsAssignment_5"


    // $ANTLR start "rule__ComponentDescription__NameAssignment_1"
    // InternalCDSL.g:1298:1: rule__ComponentDescription__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ComponentDescription__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCDSL.g:1302:1: ( ( RULE_ID ) )
            // InternalCDSL.g:1303:2: ( RULE_ID )
            {
            // InternalCDSL.g:1303:2: ( RULE_ID )
            // InternalCDSL.g:1304:3: RULE_ID
            {
             before(grammarAccess.getComponentDescriptionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getComponentDescriptionAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentDescription__NameAssignment_1"


    // $ANTLR start "rule__ComponentDescription__PortsAssignment_3"
    // InternalCDSL.g:1313:1: rule__ComponentDescription__PortsAssignment_3 : ( rulePorts ) ;
    public final void rule__ComponentDescription__PortsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCDSL.g:1317:1: ( ( rulePorts ) )
            // InternalCDSL.g:1318:2: ( rulePorts )
            {
            // InternalCDSL.g:1318:2: ( rulePorts )
            // InternalCDSL.g:1319:3: rulePorts
            {
             before(grammarAccess.getComponentDescriptionAccess().getPortsPortsParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            rulePorts();

            state._fsp--;

             after(grammarAccess.getComponentDescriptionAccess().getPortsPortsParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentDescription__PortsAssignment_3"


    // $ANTLR start "rule__ComponentDescription__UnitsAssignment_4"
    // InternalCDSL.g:1328:1: rule__ComponentDescription__UnitsAssignment_4 : ( ruleUnitElements ) ;
    public final void rule__ComponentDescription__UnitsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCDSL.g:1332:1: ( ( ruleUnitElements ) )
            // InternalCDSL.g:1333:2: ( ruleUnitElements )
            {
            // InternalCDSL.g:1333:2: ( ruleUnitElements )
            // InternalCDSL.g:1334:3: ruleUnitElements
            {
             before(grammarAccess.getComponentDescriptionAccess().getUnitsUnitElementsParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleUnitElements();

            state._fsp--;

             after(grammarAccess.getComponentDescriptionAccess().getUnitsUnitElementsParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentDescription__UnitsAssignment_4"


    // $ANTLR start "rule__ComponentDescription__NotAllowedRefAssignment_5"
    // InternalCDSL.g:1343:1: rule__ComponentDescription__NotAllowedRefAssignment_5 : ( ruleNotAllowedRef ) ;
    public final void rule__ComponentDescription__NotAllowedRefAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCDSL.g:1347:1: ( ( ruleNotAllowedRef ) )
            // InternalCDSL.g:1348:2: ( ruleNotAllowedRef )
            {
            // InternalCDSL.g:1348:2: ( ruleNotAllowedRef )
            // InternalCDSL.g:1349:3: ruleNotAllowedRef
            {
             before(grammarAccess.getComponentDescriptionAccess().getNotAllowedRefNotAllowedRefParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleNotAllowedRef();

            state._fsp--;

             after(grammarAccess.getComponentDescriptionAccess().getNotAllowedRefNotAllowedRefParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentDescription__NotAllowedRefAssignment_5"


    // $ANTLR start "rule__Ports__PortAssignment_2"
    // InternalCDSL.g:1358:1: rule__Ports__PortAssignment_2 : ( ruleQualifiedName ) ;
    public final void rule__Ports__PortAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCDSL.g:1362:1: ( ( ruleQualifiedName ) )
            // InternalCDSL.g:1363:2: ( ruleQualifiedName )
            {
            // InternalCDSL.g:1363:2: ( ruleQualifiedName )
            // InternalCDSL.g:1364:3: ruleQualifiedName
            {
             before(grammarAccess.getPortsAccess().getPortQualifiedNameParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getPortsAccess().getPortQualifiedNameParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ports__PortAssignment_2"


    // $ANTLR start "rule__NotAllowedRef__UnitsAssignment_2"
    // InternalCDSL.g:1373:1: rule__NotAllowedRef__UnitsAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__NotAllowedRef__UnitsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCDSL.g:1377:1: ( ( ( RULE_ID ) ) )
            // InternalCDSL.g:1378:2: ( ( RULE_ID ) )
            {
            // InternalCDSL.g:1378:2: ( ( RULE_ID ) )
            // InternalCDSL.g:1379:3: ( RULE_ID )
            {
             before(grammarAccess.getNotAllowedRefAccess().getUnitsComponentDescriptionCrossReference_2_0()); 
            // InternalCDSL.g:1380:3: ( RULE_ID )
            // InternalCDSL.g:1381:4: RULE_ID
            {
             before(grammarAccess.getNotAllowedRefAccess().getUnitsComponentDescriptionIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNotAllowedRefAccess().getUnitsComponentDescriptionIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getNotAllowedRefAccess().getUnitsComponentDescriptionCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NotAllowedRef__UnitsAssignment_2"


    // $ANTLR start "rule__UnitElements__UnitAssignment"
    // InternalCDSL.g:1392:1: rule__UnitElements__UnitAssignment : ( ruleComponentID ) ;
    public final void rule__UnitElements__UnitAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCDSL.g:1396:1: ( ( ruleComponentID ) )
            // InternalCDSL.g:1397:2: ( ruleComponentID )
            {
            // InternalCDSL.g:1397:2: ( ruleComponentID )
            // InternalCDSL.g:1398:3: ruleComponentID
            {
             before(grammarAccess.getUnitElementsAccess().getUnitComponentIDParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleComponentID();

            state._fsp--;

             after(grammarAccess.getUnitElementsAccess().getUnitComponentIDParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnitElements__UnitAssignment"


    // $ANTLR start "rule__ComponentID__QualifiedNamesAssignment_2"
    // InternalCDSL.g:1407:1: rule__ComponentID__QualifiedNamesAssignment_2 : ( ruleQualifiedName ) ;
    public final void rule__ComponentID__QualifiedNamesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCDSL.g:1411:1: ( ( ruleQualifiedName ) )
            // InternalCDSL.g:1412:2: ( ruleQualifiedName )
            {
            // InternalCDSL.g:1412:2: ( ruleQualifiedName )
            // InternalCDSL.g:1413:3: ruleQualifiedName
            {
             before(grammarAccess.getComponentIDAccess().getQualifiedNamesQualifiedNameParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getComponentIDAccess().getQualifiedNamesQualifiedNameParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentID__QualifiedNamesAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000020802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000000001D0000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400000L});

}