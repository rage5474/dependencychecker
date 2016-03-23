package de.ragedev.cdsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import de.ragedev.cdsl.services.CDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCDSLParser extends AbstractInternalAntlrParser {
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

        public InternalCDSLParser(TokenStream input, CDSLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Domainmodel";
       	}

       	@Override
       	protected CDSLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleDomainmodel"
    // InternalCDSL.g:64:1: entryRuleDomainmodel returns [EObject current=null] : iv_ruleDomainmodel= ruleDomainmodel EOF ;
    public final EObject entryRuleDomainmodel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDomainmodel = null;


        try {
            // InternalCDSL.g:64:52: (iv_ruleDomainmodel= ruleDomainmodel EOF )
            // InternalCDSL.g:65:2: iv_ruleDomainmodel= ruleDomainmodel EOF
            {
             newCompositeNode(grammarAccess.getDomainmodelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDomainmodel=ruleDomainmodel();

            state._fsp--;

             current =iv_ruleDomainmodel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDomainmodel"


    // $ANTLR start "ruleDomainmodel"
    // InternalCDSL.g:71:1: ruleDomainmodel returns [EObject current=null] : ( (lv_entries_0_0= ruleAbstractEntry ) )* ;
    public final EObject ruleDomainmodel() throws RecognitionException {
        EObject current = null;

        EObject lv_entries_0_0 = null;



        	enterRule();

        try {
            // InternalCDSL.g:77:2: ( ( (lv_entries_0_0= ruleAbstractEntry ) )* )
            // InternalCDSL.g:78:2: ( (lv_entries_0_0= ruleAbstractEntry ) )*
            {
            // InternalCDSL.g:78:2: ( (lv_entries_0_0= ruleAbstractEntry ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11||LA1_0==17) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalCDSL.g:79:3: (lv_entries_0_0= ruleAbstractEntry )
            	    {
            	    // InternalCDSL.g:79:3: (lv_entries_0_0= ruleAbstractEntry )
            	    // InternalCDSL.g:80:4: lv_entries_0_0= ruleAbstractEntry
            	    {

            	    				newCompositeNode(grammarAccess.getDomainmodelAccess().getEntriesAbstractEntryParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_entries_0_0=ruleAbstractEntry();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getDomainmodelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"entries",
            	    					lv_entries_0_0,
            	    					"de.ragedev.cdsl.CDSL.AbstractEntry");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDomainmodel"


    // $ANTLR start "entryRuleAbstractEntry"
    // InternalCDSL.g:100:1: entryRuleAbstractEntry returns [EObject current=null] : iv_ruleAbstractEntry= ruleAbstractEntry EOF ;
    public final EObject entryRuleAbstractEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractEntry = null;


        try {
            // InternalCDSL.g:100:54: (iv_ruleAbstractEntry= ruleAbstractEntry EOF )
            // InternalCDSL.g:101:2: iv_ruleAbstractEntry= ruleAbstractEntry EOF
            {
             newCompositeNode(grammarAccess.getAbstractEntryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAbstractEntry=ruleAbstractEntry();

            state._fsp--;

             current =iv_ruleAbstractEntry; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAbstractEntry"


    // $ANTLR start "ruleAbstractEntry"
    // InternalCDSL.g:107:1: ruleAbstractEntry returns [EObject current=null] : (this_DValidator_0= ruleDValidator | this_ComponentDescription_1= ruleComponentDescription ) ;
    public final EObject ruleAbstractEntry() throws RecognitionException {
        EObject current = null;

        EObject this_DValidator_0 = null;

        EObject this_ComponentDescription_1 = null;



        	enterRule();

        try {
            // InternalCDSL.g:113:2: ( (this_DValidator_0= ruleDValidator | this_ComponentDescription_1= ruleComponentDescription ) )
            // InternalCDSL.g:114:2: (this_DValidator_0= ruleDValidator | this_ComponentDescription_1= ruleComponentDescription )
            {
            // InternalCDSL.g:114:2: (this_DValidator_0= ruleDValidator | this_ComponentDescription_1= ruleComponentDescription )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            else if ( (LA2_0==17) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalCDSL.g:115:3: this_DValidator_0= ruleDValidator
                    {

                    			newCompositeNode(grammarAccess.getAbstractEntryAccess().getDValidatorParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_DValidator_0=ruleDValidator();

                    state._fsp--;


                    			current = this_DValidator_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalCDSL.g:124:3: this_ComponentDescription_1= ruleComponentDescription
                    {

                    			newCompositeNode(grammarAccess.getAbstractEntryAccess().getComponentDescriptionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ComponentDescription_1=ruleComponentDescription();

                    state._fsp--;


                    			current = this_ComponentDescription_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAbstractEntry"


    // $ANTLR start "entryRuleDValidator"
    // InternalCDSL.g:136:1: entryRuleDValidator returns [EObject current=null] : iv_ruleDValidator= ruleDValidator EOF ;
    public final EObject entryRuleDValidator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDValidator = null;


        try {
            // InternalCDSL.g:136:51: (iv_ruleDValidator= ruleDValidator EOF )
            // InternalCDSL.g:137:2: iv_ruleDValidator= ruleDValidator EOF
            {
             newCompositeNode(grammarAccess.getDValidatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDValidator=ruleDValidator();

            state._fsp--;

             current =iv_ruleDValidator; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDValidator"


    // $ANTLR start "ruleDValidator"
    // InternalCDSL.g:143:1: ruleDValidator returns [EObject current=null] : (otherlv_0= 'dval' ( (lv_valName_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'comps' otherlv_4= ':' ( (otherlv_5= RULE_ID ) )+ otherlv_6= ';' otherlv_7= '}' ) ;
    public final EObject ruleDValidator() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_valName_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalCDSL.g:149:2: ( (otherlv_0= 'dval' ( (lv_valName_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'comps' otherlv_4= ':' ( (otherlv_5= RULE_ID ) )+ otherlv_6= ';' otherlv_7= '}' ) )
            // InternalCDSL.g:150:2: (otherlv_0= 'dval' ( (lv_valName_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'comps' otherlv_4= ':' ( (otherlv_5= RULE_ID ) )+ otherlv_6= ';' otherlv_7= '}' )
            {
            // InternalCDSL.g:150:2: (otherlv_0= 'dval' ( (lv_valName_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'comps' otherlv_4= ':' ( (otherlv_5= RULE_ID ) )+ otherlv_6= ';' otherlv_7= '}' )
            // InternalCDSL.g:151:3: otherlv_0= 'dval' ( (lv_valName_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'comps' otherlv_4= ':' ( (otherlv_5= RULE_ID ) )+ otherlv_6= ';' otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getDValidatorAccess().getDvalKeyword_0());
            		
            // InternalCDSL.g:155:3: ( (lv_valName_1_0= RULE_ID ) )
            // InternalCDSL.g:156:4: (lv_valName_1_0= RULE_ID )
            {
            // InternalCDSL.g:156:4: (lv_valName_1_0= RULE_ID )
            // InternalCDSL.g:157:5: lv_valName_1_0= RULE_ID
            {
            lv_valName_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_valName_1_0, grammarAccess.getDValidatorAccess().getValNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDValidatorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"valName",
            						lv_valName_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getDValidatorAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getDValidatorAccess().getCompsKeyword_3());
            		
            otherlv_4=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_4, grammarAccess.getDValidatorAccess().getColonKeyword_4());
            		
            // InternalCDSL.g:185:3: ( (otherlv_5= RULE_ID ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalCDSL.g:186:4: (otherlv_5= RULE_ID )
            	    {
            	    // InternalCDSL.g:186:4: (otherlv_5= RULE_ID )
            	    // InternalCDSL.g:187:5: otherlv_5= RULE_ID
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getDValidatorRule());
            	    					}
            	    				
            	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_8); 

            	    					newLeafNode(otherlv_5, grammarAccess.getDValidatorAccess().getRefComponentsComponentDescriptionCrossReference_5_0());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);

            otherlv_6=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_6, grammarAccess.getDValidatorAccess().getSemicolonKeyword_6());
            		
            otherlv_7=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getDValidatorAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDValidator"


    // $ANTLR start "entryRuleComponentDescription"
    // InternalCDSL.g:210:1: entryRuleComponentDescription returns [EObject current=null] : iv_ruleComponentDescription= ruleComponentDescription EOF ;
    public final EObject entryRuleComponentDescription() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentDescription = null;


        try {
            // InternalCDSL.g:210:61: (iv_ruleComponentDescription= ruleComponentDescription EOF )
            // InternalCDSL.g:211:2: iv_ruleComponentDescription= ruleComponentDescription EOF
            {
             newCompositeNode(grammarAccess.getComponentDescriptionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComponentDescription=ruleComponentDescription();

            state._fsp--;

             current =iv_ruleComponentDescription; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComponentDescription"


    // $ANTLR start "ruleComponentDescription"
    // InternalCDSL.g:217:1: ruleComponentDescription returns [EObject current=null] : (otherlv_0= 'comp' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_ports_3_0= rulePorts ) )? ( (lv_units_4_0= ruleUnitElements ) )? ( (lv_notAllowedRef_5_0= ruleNotAllowedRef ) )? otherlv_6= '}' ) ;
    public final EObject ruleComponentDescription() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_6=null;
        EObject lv_ports_3_0 = null;

        EObject lv_units_4_0 = null;

        EObject lv_notAllowedRef_5_0 = null;



        	enterRule();

        try {
            // InternalCDSL.g:223:2: ( (otherlv_0= 'comp' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_ports_3_0= rulePorts ) )? ( (lv_units_4_0= ruleUnitElements ) )? ( (lv_notAllowedRef_5_0= ruleNotAllowedRef ) )? otherlv_6= '}' ) )
            // InternalCDSL.g:224:2: (otherlv_0= 'comp' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_ports_3_0= rulePorts ) )? ( (lv_units_4_0= ruleUnitElements ) )? ( (lv_notAllowedRef_5_0= ruleNotAllowedRef ) )? otherlv_6= '}' )
            {
            // InternalCDSL.g:224:2: (otherlv_0= 'comp' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_ports_3_0= rulePorts ) )? ( (lv_units_4_0= ruleUnitElements ) )? ( (lv_notAllowedRef_5_0= ruleNotAllowedRef ) )? otherlv_6= '}' )
            // InternalCDSL.g:225:3: otherlv_0= 'comp' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_ports_3_0= rulePorts ) )? ( (lv_units_4_0= ruleUnitElements ) )? ( (lv_notAllowedRef_5_0= ruleNotAllowedRef ) )? otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getComponentDescriptionAccess().getCompKeyword_0());
            		
            // InternalCDSL.g:229:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalCDSL.g:230:4: (lv_name_1_0= RULE_ID )
            {
            // InternalCDSL.g:230:4: (lv_name_1_0= RULE_ID )
            // InternalCDSL.g:231:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getComponentDescriptionAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComponentDescriptionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getComponentDescriptionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalCDSL.g:251:3: ( (lv_ports_3_0= rulePorts ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==18) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalCDSL.g:252:4: (lv_ports_3_0= rulePorts )
                    {
                    // InternalCDSL.g:252:4: (lv_ports_3_0= rulePorts )
                    // InternalCDSL.g:253:5: lv_ports_3_0= rulePorts
                    {

                    					newCompositeNode(grammarAccess.getComponentDescriptionAccess().getPortsPortsParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_11);
                    lv_ports_3_0=rulePorts();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getComponentDescriptionRule());
                    					}
                    					set(
                    						current,
                    						"ports",
                    						lv_ports_3_0,
                    						"de.ragedev.cdsl.CDSL.Ports");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalCDSL.g:270:3: ( (lv_units_4_0= ruleUnitElements ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==20) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalCDSL.g:271:4: (lv_units_4_0= ruleUnitElements )
                    {
                    // InternalCDSL.g:271:4: (lv_units_4_0= ruleUnitElements )
                    // InternalCDSL.g:272:5: lv_units_4_0= ruleUnitElements
                    {

                    					newCompositeNode(grammarAccess.getComponentDescriptionAccess().getUnitsUnitElementsParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_12);
                    lv_units_4_0=ruleUnitElements();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getComponentDescriptionRule());
                    					}
                    					set(
                    						current,
                    						"units",
                    						lv_units_4_0,
                    						"de.ragedev.cdsl.CDSL.UnitElements");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalCDSL.g:289:3: ( (lv_notAllowedRef_5_0= ruleNotAllowedRef ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==19) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalCDSL.g:290:4: (lv_notAllowedRef_5_0= ruleNotAllowedRef )
                    {
                    // InternalCDSL.g:290:4: (lv_notAllowedRef_5_0= ruleNotAllowedRef )
                    // InternalCDSL.g:291:5: lv_notAllowedRef_5_0= ruleNotAllowedRef
                    {

                    					newCompositeNode(grammarAccess.getComponentDescriptionAccess().getNotAllowedRefNotAllowedRefParserRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_9);
                    lv_notAllowedRef_5_0=ruleNotAllowedRef();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getComponentDescriptionRule());
                    					}
                    					set(
                    						current,
                    						"notAllowedRef",
                    						lv_notAllowedRef_5_0,
                    						"de.ragedev.cdsl.CDSL.NotAllowedRef");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getComponentDescriptionAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComponentDescription"


    // $ANTLR start "entryRulePorts"
    // InternalCDSL.g:316:1: entryRulePorts returns [EObject current=null] : iv_rulePorts= rulePorts EOF ;
    public final EObject entryRulePorts() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePorts = null;


        try {
            // InternalCDSL.g:316:46: (iv_rulePorts= rulePorts EOF )
            // InternalCDSL.g:317:2: iv_rulePorts= rulePorts EOF
            {
             newCompositeNode(grammarAccess.getPortsRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePorts=rulePorts();

            state._fsp--;

             current =iv_rulePorts; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePorts"


    // $ANTLR start "rulePorts"
    // InternalCDSL.g:323:1: rulePorts returns [EObject current=null] : (otherlv_0= 'ports' otherlv_1= ':' ( (lv_port_2_0= ruleQualifiedName ) )+ otherlv_3= ';' ) ;
    public final EObject rulePorts() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_port_2_0 = null;



        	enterRule();

        try {
            // InternalCDSL.g:329:2: ( (otherlv_0= 'ports' otherlv_1= ':' ( (lv_port_2_0= ruleQualifiedName ) )+ otherlv_3= ';' ) )
            // InternalCDSL.g:330:2: (otherlv_0= 'ports' otherlv_1= ':' ( (lv_port_2_0= ruleQualifiedName ) )+ otherlv_3= ';' )
            {
            // InternalCDSL.g:330:2: (otherlv_0= 'ports' otherlv_1= ':' ( (lv_port_2_0= ruleQualifiedName ) )+ otherlv_3= ';' )
            // InternalCDSL.g:331:3: otherlv_0= 'ports' otherlv_1= ':' ( (lv_port_2_0= ruleQualifiedName ) )+ otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getPortsAccess().getPortsKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getPortsAccess().getColonKeyword_1());
            		
            // InternalCDSL.g:339:3: ( (lv_port_2_0= ruleQualifiedName ) )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalCDSL.g:340:4: (lv_port_2_0= ruleQualifiedName )
            	    {
            	    // InternalCDSL.g:340:4: (lv_port_2_0= ruleQualifiedName )
            	    // InternalCDSL.g:341:5: lv_port_2_0= ruleQualifiedName
            	    {

            	    					newCompositeNode(grammarAccess.getPortsAccess().getPortQualifiedNameParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_port_2_0=ruleQualifiedName();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPortsRule());
            	    					}
            	    					add(
            	    						current,
            	    						"port",
            	    						lv_port_2_0,
            	    						"de.ragedev.cdsl.CDSL.QualifiedName");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);

            otherlv_3=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getPortsAccess().getSemicolonKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePorts"


    // $ANTLR start "entryRuleNotAllowedRef"
    // InternalCDSL.g:366:1: entryRuleNotAllowedRef returns [EObject current=null] : iv_ruleNotAllowedRef= ruleNotAllowedRef EOF ;
    public final EObject entryRuleNotAllowedRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotAllowedRef = null;


        try {
            // InternalCDSL.g:366:54: (iv_ruleNotAllowedRef= ruleNotAllowedRef EOF )
            // InternalCDSL.g:367:2: iv_ruleNotAllowedRef= ruleNotAllowedRef EOF
            {
             newCompositeNode(grammarAccess.getNotAllowedRefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNotAllowedRef=ruleNotAllowedRef();

            state._fsp--;

             current =iv_ruleNotAllowedRef; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNotAllowedRef"


    // $ANTLR start "ruleNotAllowedRef"
    // InternalCDSL.g:373:1: ruleNotAllowedRef returns [EObject current=null] : (otherlv_0= 'forbidden' otherlv_1= ':' ( (otherlv_2= RULE_ID ) )+ otherlv_3= ';' ) ;
    public final EObject ruleNotAllowedRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalCDSL.g:379:2: ( (otherlv_0= 'forbidden' otherlv_1= ':' ( (otherlv_2= RULE_ID ) )+ otherlv_3= ';' ) )
            // InternalCDSL.g:380:2: (otherlv_0= 'forbidden' otherlv_1= ':' ( (otherlv_2= RULE_ID ) )+ otherlv_3= ';' )
            {
            // InternalCDSL.g:380:2: (otherlv_0= 'forbidden' otherlv_1= ':' ( (otherlv_2= RULE_ID ) )+ otherlv_3= ';' )
            // InternalCDSL.g:381:3: otherlv_0= 'forbidden' otherlv_1= ':' ( (otherlv_2= RULE_ID ) )+ otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getNotAllowedRefAccess().getForbiddenKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getNotAllowedRefAccess().getColonKeyword_1());
            		
            // InternalCDSL.g:389:3: ( (otherlv_2= RULE_ID ) )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalCDSL.g:390:4: (otherlv_2= RULE_ID )
            	    {
            	    // InternalCDSL.g:390:4: (otherlv_2= RULE_ID )
            	    // InternalCDSL.g:391:5: otherlv_2= RULE_ID
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getNotAllowedRefRule());
            	    					}
            	    				
            	    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_8); 

            	    					newLeafNode(otherlv_2, grammarAccess.getNotAllowedRefAccess().getUnitsComponentDescriptionCrossReference_2_0());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);

            otherlv_3=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getNotAllowedRefAccess().getSemicolonKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNotAllowedRef"


    // $ANTLR start "entryRuleUnitElements"
    // InternalCDSL.g:410:1: entryRuleUnitElements returns [EObject current=null] : iv_ruleUnitElements= ruleUnitElements EOF ;
    public final EObject entryRuleUnitElements() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnitElements = null;


        try {
            // InternalCDSL.g:410:53: (iv_ruleUnitElements= ruleUnitElements EOF )
            // InternalCDSL.g:411:2: iv_ruleUnitElements= ruleUnitElements EOF
            {
             newCompositeNode(grammarAccess.getUnitElementsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUnitElements=ruleUnitElements();

            state._fsp--;

             current =iv_ruleUnitElements; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnitElements"


    // $ANTLR start "ruleUnitElements"
    // InternalCDSL.g:417:1: ruleUnitElements returns [EObject current=null] : ( (lv_unit_0_0= ruleComponentID ) )+ ;
    public final EObject ruleUnitElements() throws RecognitionException {
        EObject current = null;

        EObject lv_unit_0_0 = null;



        	enterRule();

        try {
            // InternalCDSL.g:423:2: ( ( (lv_unit_0_0= ruleComponentID ) )+ )
            // InternalCDSL.g:424:2: ( (lv_unit_0_0= ruleComponentID ) )+
            {
            // InternalCDSL.g:424:2: ( (lv_unit_0_0= ruleComponentID ) )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==20) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalCDSL.g:425:3: (lv_unit_0_0= ruleComponentID )
            	    {
            	    // InternalCDSL.g:425:3: (lv_unit_0_0= ruleComponentID )
            	    // InternalCDSL.g:426:4: lv_unit_0_0= ruleComponentID
            	    {

            	    				newCompositeNode(grammarAccess.getUnitElementsAccess().getUnitComponentIDParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_13);
            	    lv_unit_0_0=ruleComponentID();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getUnitElementsRule());
            	    				}
            	    				add(
            	    					current,
            	    					"unit",
            	    					lv_unit_0_0,
            	    					"de.ragedev.cdsl.CDSL.ComponentID");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnitElements"


    // $ANTLR start "entryRuleComponentID"
    // InternalCDSL.g:446:1: entryRuleComponentID returns [EObject current=null] : iv_ruleComponentID= ruleComponentID EOF ;
    public final EObject entryRuleComponentID() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentID = null;


        try {
            // InternalCDSL.g:446:52: (iv_ruleComponentID= ruleComponentID EOF )
            // InternalCDSL.g:447:2: iv_ruleComponentID= ruleComponentID EOF
            {
             newCompositeNode(grammarAccess.getComponentIDRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComponentID=ruleComponentID();

            state._fsp--;

             current =iv_ruleComponentID; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComponentID"


    // $ANTLR start "ruleComponentID"
    // InternalCDSL.g:453:1: ruleComponentID returns [EObject current=null] : (otherlv_0= 'idents' otherlv_1= ':' ( (lv_qualifiedNames_2_0= ruleQualifiedName ) )+ otherlv_3= ';' ) ;
    public final EObject ruleComponentID() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_qualifiedNames_2_0 = null;



        	enterRule();

        try {
            // InternalCDSL.g:459:2: ( (otherlv_0= 'idents' otherlv_1= ':' ( (lv_qualifiedNames_2_0= ruleQualifiedName ) )+ otherlv_3= ';' ) )
            // InternalCDSL.g:460:2: (otherlv_0= 'idents' otherlv_1= ':' ( (lv_qualifiedNames_2_0= ruleQualifiedName ) )+ otherlv_3= ';' )
            {
            // InternalCDSL.g:460:2: (otherlv_0= 'idents' otherlv_1= ':' ( (lv_qualifiedNames_2_0= ruleQualifiedName ) )+ otherlv_3= ';' )
            // InternalCDSL.g:461:3: otherlv_0= 'idents' otherlv_1= ':' ( (lv_qualifiedNames_2_0= ruleQualifiedName ) )+ otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getComponentIDAccess().getIdentsKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getComponentIDAccess().getColonKeyword_1());
            		
            // InternalCDSL.g:469:3: ( (lv_qualifiedNames_2_0= ruleQualifiedName ) )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalCDSL.g:470:4: (lv_qualifiedNames_2_0= ruleQualifiedName )
            	    {
            	    // InternalCDSL.g:470:4: (lv_qualifiedNames_2_0= ruleQualifiedName )
            	    // InternalCDSL.g:471:5: lv_qualifiedNames_2_0= ruleQualifiedName
            	    {

            	    					newCompositeNode(grammarAccess.getComponentIDAccess().getQualifiedNamesQualifiedNameParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_qualifiedNames_2_0=ruleQualifiedName();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getComponentIDRule());
            	    					}
            	    					add(
            	    						current,
            	    						"qualifiedNames",
            	    						lv_qualifiedNames_2_0,
            	    						"de.ragedev.cdsl.CDSL.QualifiedName");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);

            otherlv_3=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getComponentIDAccess().getSemicolonKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComponentID"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalCDSL.g:496:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalCDSL.g:496:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalCDSL.g:497:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalCDSL.g:503:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_WildCardID_0= ruleWildCardID (kw= '.' this_WildCardID_2= ruleWildCardID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_WildCardID_0 = null;

        AntlrDatatypeRuleToken this_WildCardID_2 = null;



        	enterRule();

        try {
            // InternalCDSL.g:509:2: ( (this_WildCardID_0= ruleWildCardID (kw= '.' this_WildCardID_2= ruleWildCardID )* ) )
            // InternalCDSL.g:510:2: (this_WildCardID_0= ruleWildCardID (kw= '.' this_WildCardID_2= ruleWildCardID )* )
            {
            // InternalCDSL.g:510:2: (this_WildCardID_0= ruleWildCardID (kw= '.' this_WildCardID_2= ruleWildCardID )* )
            // InternalCDSL.g:511:3: this_WildCardID_0= ruleWildCardID (kw= '.' this_WildCardID_2= ruleWildCardID )*
            {

            			newCompositeNode(grammarAccess.getQualifiedNameAccess().getWildCardIDParserRuleCall_0());
            		
            pushFollow(FOLLOW_14);
            this_WildCardID_0=ruleWildCardID();

            state._fsp--;


            			current.merge(this_WildCardID_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalCDSL.g:521:3: (kw= '.' this_WildCardID_2= ruleWildCardID )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==21) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalCDSL.g:522:4: kw= '.' this_WildCardID_2= ruleWildCardID
            	    {
            	    kw=(Token)match(input,21,FOLLOW_4); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	    			

            	    				newCompositeNode(grammarAccess.getQualifiedNameAccess().getWildCardIDParserRuleCall_1_1());
            	    			
            	    pushFollow(FOLLOW_14);
            	    this_WildCardID_2=ruleWildCardID();

            	    state._fsp--;


            	    				current.merge(this_WildCardID_2);
            	    			

            	    				afterParserOrEnumRuleCall();
            	    			

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleWildCardID"
    // InternalCDSL.g:542:1: entryRuleWildCardID returns [String current=null] : iv_ruleWildCardID= ruleWildCardID EOF ;
    public final String entryRuleWildCardID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleWildCardID = null;


        try {
            // InternalCDSL.g:542:50: (iv_ruleWildCardID= ruleWildCardID EOF )
            // InternalCDSL.g:543:2: iv_ruleWildCardID= ruleWildCardID EOF
            {
             newCompositeNode(grammarAccess.getWildCardIDRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWildCardID=ruleWildCardID();

            state._fsp--;

             current =iv_ruleWildCardID.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWildCardID"


    // $ANTLR start "ruleWildCardID"
    // InternalCDSL.g:549:1: ruleWildCardID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '*' )? ) ;
    public final AntlrDatatypeRuleToken ruleWildCardID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;


        	enterRule();

        try {
            // InternalCDSL.g:555:2: ( (this_ID_0= RULE_ID (kw= '*' )? ) )
            // InternalCDSL.g:556:2: (this_ID_0= RULE_ID (kw= '*' )? )
            {
            // InternalCDSL.g:556:2: (this_ID_0= RULE_ID (kw= '*' )? )
            // InternalCDSL.g:557:3: this_ID_0= RULE_ID (kw= '*' )?
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_15); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getWildCardIDAccess().getIDTerminalRuleCall_0());
            		
            // InternalCDSL.g:564:3: (kw= '*' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==22) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalCDSL.g:565:4: kw= '*'
                    {
                    kw=(Token)match(input,22,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getWildCardIDAccess().getAsteriskKeyword_1());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWildCardID"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000020802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000001D0000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000190000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000090000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400002L});

}