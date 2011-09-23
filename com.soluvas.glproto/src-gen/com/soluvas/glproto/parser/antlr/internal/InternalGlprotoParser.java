package com.soluvas.glproto.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import com.soluvas.glproto.services.GlprotoGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGlprotoParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'(language'", "')'", "'.'", "'(package'", "'(file'", "'java'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_STRING=6;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int RULE_WS=9;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;

    // delegates
    // delegators


        public InternalGlprotoParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalGlprotoParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalGlprotoParser.tokenNames; }
    public String getGrammarFileName() { return "../com.soluvas.glproto/src-gen/com/soluvas/glproto/parser/antlr/internal/InternalGlproto.g"; }



     	private GlprotoGrammarAccess grammarAccess;
     	
        public InternalGlprotoParser(TokenStream input, GlprotoGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected GlprotoGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../com.soluvas.glproto/src-gen/com/soluvas/glproto/parser/antlr/internal/InternalGlproto.g:67:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../com.soluvas.glproto/src-gen/com/soluvas/glproto/parser/antlr/internal/InternalGlproto.g:68:2: (iv_ruleModel= ruleModel EOF )
            // ../com.soluvas.glproto/src-gen/com/soluvas/glproto/parser/antlr/internal/InternalGlproto.g:69:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel85); 

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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../com.soluvas.glproto/src-gen/com/soluvas/glproto/parser/antlr/internal/InternalGlproto.g:76:1: ruleModel returns [EObject current=null] : (otherlv_0= '(language' ( (lv_package_1_0= ruleFQN ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ')' ( (lv_packages_4_0= rulePackage ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_package_1_0 = null;

        EObject lv_packages_4_0 = null;


         enterRule(); 
            
        try {
            // ../com.soluvas.glproto/src-gen/com/soluvas/glproto/parser/antlr/internal/InternalGlproto.g:79:28: ( (otherlv_0= '(language' ( (lv_package_1_0= ruleFQN ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ')' ( (lv_packages_4_0= rulePackage ) )* ) )
            // ../com.soluvas.glproto/src-gen/com/soluvas/glproto/parser/antlr/internal/InternalGlproto.g:80:1: (otherlv_0= '(language' ( (lv_package_1_0= ruleFQN ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ')' ( (lv_packages_4_0= rulePackage ) )* )
            {
            // ../com.soluvas.glproto/src-gen/com/soluvas/glproto/parser/antlr/internal/InternalGlproto.g:80:1: (otherlv_0= '(language' ( (lv_package_1_0= ruleFQN ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ')' ( (lv_packages_4_0= rulePackage ) )* )
            // ../com.soluvas.glproto/src-gen/com/soluvas/glproto/parser/antlr/internal/InternalGlproto.g:80:3: otherlv_0= '(language' ( (lv_package_1_0= ruleFQN ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ')' ( (lv_packages_4_0= rulePackage ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleModel122); 

                	newLeafNode(otherlv_0, grammarAccess.getModelAccess().getLanguageKeyword_0());
                
            // ../com.soluvas.glproto/src-gen/com/soluvas/glproto/parser/antlr/internal/InternalGlproto.g:84:1: ( (lv_package_1_0= ruleFQN ) )
            // ../com.soluvas.glproto/src-gen/com/soluvas/glproto/parser/antlr/internal/InternalGlproto.g:85:1: (lv_package_1_0= ruleFQN )
            {
            // ../com.soluvas.glproto/src-gen/com/soluvas/glproto/parser/antlr/internal/InternalGlproto.g:85:1: (lv_package_1_0= ruleFQN )
            // ../com.soluvas.glproto/src-gen/com/soluvas/glproto/parser/antlr/internal/InternalGlproto.g:86:3: lv_package_1_0= ruleFQN
            {
             
            	        newCompositeNode(grammarAccess.getModelAccess().getPackageFQNParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleFQN_in_ruleModel143);
            lv_package_1_0=ruleFQN();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getModelRule());
            	        }
                   		set(
                   			current, 
                   			"package",
                    		lv_package_1_0, 
                    		"FQN");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../com.soluvas.glproto/src-gen/com/soluvas/glproto/parser/antlr/internal/InternalGlproto.g:102:2: ( (lv_name_2_0= RULE_ID ) )
            // ../com.soluvas.glproto/src-gen/com/soluvas/glproto/parser/antlr/internal/InternalGlproto.g:103:1: (lv_name_2_0= RULE_ID )
            {
            // ../com.soluvas.glproto/src-gen/com/soluvas/glproto/parser/antlr/internal/InternalGlproto.g:103:1: (lv_name_2_0= RULE_ID )
            // ../com.soluvas.glproto/src-gen/com/soluvas/glproto/parser/antlr/internal/InternalGlproto.g:104:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleModel160); 

            			newLeafNode(lv_name_2_0, grammarAccess.getModelAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getModelRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleModel177); 

                	newLeafNode(otherlv_3, grammarAccess.getModelAccess().getRightParenthesisKeyword_3());
                
            // ../com.soluvas.glproto/src-gen/com/soluvas/glproto/parser/antlr/internal/InternalGlproto.g:124:1: ( (lv_packages_4_0= rulePackage ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../com.soluvas.glproto/src-gen/com/soluvas/glproto/parser/antlr/internal/InternalGlproto.g:125:1: (lv_packages_4_0= rulePackage )
            	    {
            	    // ../com.soluvas.glproto/src-gen/com/soluvas/glproto/parser/antlr/internal/InternalGlproto.g:125:1: (lv_packages_4_0= rulePackage )
            	    // ../com.soluvas.glproto/src-gen/com/soluvas/glproto/parser/antlr/internal/InternalGlproto.g:126:3: lv_packages_4_0= rulePackage
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getPackagesPackageParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePackage_in_ruleModel198);
            	    lv_packages_4_0=rulePackage();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"packages",
            	            		lv_packages_4_0, 
            	            		"Package");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleFQN"
    // ../com.soluvas.glproto/src-gen/com/soluvas/glproto/parser/antlr/internal/InternalGlproto.g:150:1: entryRuleFQN returns [String current=null] : iv_ruleFQN= ruleFQN EOF ;
    public final String entryRuleFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQN = null;


        try {
            // ../com.soluvas.glproto/src-gen/com/soluvas/glproto/parser/antlr/internal/InternalGlproto.g:151:2: (iv_ruleFQN= ruleFQN EOF )
            // ../com.soluvas.glproto/src-gen/com/soluvas/glproto/parser/antlr/internal/InternalGlproto.g:152:2: iv_ruleFQN= ruleFQN EOF
            {
             newCompositeNode(grammarAccess.getFQNRule()); 
            pushFollow(FOLLOW_ruleFQN_in_entryRuleFQN236);
            iv_ruleFQN=ruleFQN();

            state._fsp--;

             current =iv_ruleFQN.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFQN247); 

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
    // $ANTLR end "entryRuleFQN"


    // $ANTLR start "ruleFQN"
    // ../com.soluvas.glproto/src-gen/com/soluvas/glproto/parser/antlr/internal/InternalGlproto.g:159:1: ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../com.soluvas.glproto/src-gen/com/soluvas/glproto/parser/antlr/internal/InternalGlproto.g:162:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../com.soluvas.glproto/src-gen/com/soluvas/glproto/parser/antlr/internal/InternalGlproto.g:163:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../com.soluvas.glproto/src-gen/com/soluvas/glproto/parser/antlr/internal/InternalGlproto.g:163:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../com.soluvas.glproto/src-gen/com/soluvas/glproto/parser/antlr/internal/InternalGlproto.g:163:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFQN287); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 
                
            // ../com.soluvas.glproto/src-gen/com/soluvas/glproto/parser/antlr/internal/InternalGlproto.g:170:1: (kw= '.' this_ID_2= RULE_ID )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==13) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../com.soluvas.glproto/src-gen/com/soluvas/glproto/parser/antlr/internal/InternalGlproto.g:171:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,13,FOLLOW_13_in_ruleFQN306); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFQN321); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop2;
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
    // $ANTLR end "ruleFQN"


    // $ANTLR start "entryRulePackage"
    // ../com.soluvas.glproto/src-gen/com/soluvas/glproto/parser/antlr/internal/InternalGlproto.g:191:1: entryRulePackage returns [EObject current=null] : iv_rulePackage= rulePackage EOF ;
    public final EObject entryRulePackage() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackage = null;


        try {
            // ../com.soluvas.glproto/src-gen/com/soluvas/glproto/parser/antlr/internal/InternalGlproto.g:192:2: (iv_rulePackage= rulePackage EOF )
            // ../com.soluvas.glproto/src-gen/com/soluvas/glproto/parser/antlr/internal/InternalGlproto.g:193:2: iv_rulePackage= rulePackage EOF
            {
             newCompositeNode(grammarAccess.getPackageRule()); 
            pushFollow(FOLLOW_rulePackage_in_entryRulePackage368);
            iv_rulePackage=rulePackage();

            state._fsp--;

             current =iv_rulePackage; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePackage378); 

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
    // $ANTLR end "entryRulePackage"


    // $ANTLR start "rulePackage"
    // ../com.soluvas.glproto/src-gen/com/soluvas/glproto/parser/antlr/internal/InternalGlproto.g:200:1: rulePackage returns [EObject current=null] : (otherlv_0= '(package' ( (lv_name_1_0= ruleFQN ) ) ( (lv_files_2_0= ruleFile ) )* otherlv_3= ')' ) ;
    public final EObject rulePackage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_files_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.soluvas.glproto/src-gen/com/soluvas/glproto/parser/antlr/internal/InternalGlproto.g:203:28: ( (otherlv_0= '(package' ( (lv_name_1_0= ruleFQN ) ) ( (lv_files_2_0= ruleFile ) )* otherlv_3= ')' ) )
            // ../com.soluvas.glproto/src-gen/com/soluvas/glproto/parser/antlr/internal/InternalGlproto.g:204:1: (otherlv_0= '(package' ( (lv_name_1_0= ruleFQN ) ) ( (lv_files_2_0= ruleFile ) )* otherlv_3= ')' )
            {
            // ../com.soluvas.glproto/src-gen/com/soluvas/glproto/parser/antlr/internal/InternalGlproto.g:204:1: (otherlv_0= '(package' ( (lv_name_1_0= ruleFQN ) ) ( (lv_files_2_0= ruleFile ) )* otherlv_3= ')' )
            // ../com.soluvas.glproto/src-gen/com/soluvas/glproto/parser/antlr/internal/InternalGlproto.g:204:3: otherlv_0= '(package' ( (lv_name_1_0= ruleFQN ) ) ( (lv_files_2_0= ruleFile ) )* otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_rulePackage415); 

                	newLeafNode(otherlv_0, grammarAccess.getPackageAccess().getPackageKeyword_0());
                
            // ../com.soluvas.glproto/src-gen/com/soluvas/glproto/parser/antlr/internal/InternalGlproto.g:208:1: ( (lv_name_1_0= ruleFQN ) )
            // ../com.soluvas.glproto/src-gen/com/soluvas/glproto/parser/antlr/internal/InternalGlproto.g:209:1: (lv_name_1_0= ruleFQN )
            {
            // ../com.soluvas.glproto/src-gen/com/soluvas/glproto/parser/antlr/internal/InternalGlproto.g:209:1: (lv_name_1_0= ruleFQN )
            // ../com.soluvas.glproto/src-gen/com/soluvas/glproto/parser/antlr/internal/InternalGlproto.g:210:3: lv_name_1_0= ruleFQN
            {
             
            	        newCompositeNode(grammarAccess.getPackageAccess().getNameFQNParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleFQN_in_rulePackage436);
            lv_name_1_0=ruleFQN();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPackageRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"FQN");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../com.soluvas.glproto/src-gen/com/soluvas/glproto/parser/antlr/internal/InternalGlproto.g:226:2: ( (lv_files_2_0= ruleFile ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==15) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../com.soluvas.glproto/src-gen/com/soluvas/glproto/parser/antlr/internal/InternalGlproto.g:227:1: (lv_files_2_0= ruleFile )
            	    {
            	    // ../com.soluvas.glproto/src-gen/com/soluvas/glproto/parser/antlr/internal/InternalGlproto.g:227:1: (lv_files_2_0= ruleFile )
            	    // ../com.soluvas.glproto/src-gen/com/soluvas/glproto/parser/antlr/internal/InternalGlproto.g:228:3: lv_files_2_0= ruleFile
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPackageAccess().getFilesFileParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleFile_in_rulePackage457);
            	    lv_files_2_0=ruleFile();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPackageRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"files",
            	            		lv_files_2_0, 
            	            		"File");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_3=(Token)match(input,12,FOLLOW_12_in_rulePackage470); 

                	newLeafNode(otherlv_3, grammarAccess.getPackageAccess().getRightParenthesisKeyword_3());
                

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
    // $ANTLR end "rulePackage"


    // $ANTLR start "entryRuleFile"
    // ../com.soluvas.glproto/src-gen/com/soluvas/glproto/parser/antlr/internal/InternalGlproto.g:256:1: entryRuleFile returns [EObject current=null] : iv_ruleFile= ruleFile EOF ;
    public final EObject entryRuleFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFile = null;


        try {
            // ../com.soluvas.glproto/src-gen/com/soluvas/glproto/parser/antlr/internal/InternalGlproto.g:257:2: (iv_ruleFile= ruleFile EOF )
            // ../com.soluvas.glproto/src-gen/com/soluvas/glproto/parser/antlr/internal/InternalGlproto.g:258:2: iv_ruleFile= ruleFile EOF
            {
             newCompositeNode(grammarAccess.getFileRule()); 
            pushFollow(FOLLOW_ruleFile_in_entryRuleFile506);
            iv_ruleFile=ruleFile();

            state._fsp--;

             current =iv_ruleFile; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFile516); 

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
    // $ANTLR end "entryRuleFile"


    // $ANTLR start "ruleFile"
    // ../com.soluvas.glproto/src-gen/com/soluvas/glproto/parser/antlr/internal/InternalGlproto.g:265:1: ruleFile returns [EObject current=null] : (otherlv_0= '(file' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'java' otherlv_3= ')' ) ;
    public final EObject ruleFile() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../com.soluvas.glproto/src-gen/com/soluvas/glproto/parser/antlr/internal/InternalGlproto.g:268:28: ( (otherlv_0= '(file' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'java' otherlv_3= ')' ) )
            // ../com.soluvas.glproto/src-gen/com/soluvas/glproto/parser/antlr/internal/InternalGlproto.g:269:1: (otherlv_0= '(file' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'java' otherlv_3= ')' )
            {
            // ../com.soluvas.glproto/src-gen/com/soluvas/glproto/parser/antlr/internal/InternalGlproto.g:269:1: (otherlv_0= '(file' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'java' otherlv_3= ')' )
            // ../com.soluvas.glproto/src-gen/com/soluvas/glproto/parser/antlr/internal/InternalGlproto.g:269:3: otherlv_0= '(file' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'java' otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleFile553); 

                	newLeafNode(otherlv_0, grammarAccess.getFileAccess().getFileKeyword_0());
                
            // ../com.soluvas.glproto/src-gen/com/soluvas/glproto/parser/antlr/internal/InternalGlproto.g:273:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.soluvas.glproto/src-gen/com/soluvas/glproto/parser/antlr/internal/InternalGlproto.g:274:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.soluvas.glproto/src-gen/com/soluvas/glproto/parser/antlr/internal/InternalGlproto.g:274:1: (lv_name_1_0= RULE_ID )
            // ../com.soluvas.glproto/src-gen/com/soluvas/glproto/parser/antlr/internal/InternalGlproto.g:275:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFile570); 

            			newLeafNode(lv_name_1_0, grammarAccess.getFileAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFileRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleFile587); 

                	newLeafNode(otherlv_2, grammarAccess.getFileAccess().getJavaKeyword_2());
                
            otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleFile599); 

                	newLeafNode(otherlv_3, grammarAccess.getFileAccess().getRightParenthesisKeyword_3());
                

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
    // $ANTLR end "ruleFile"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleModel122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleModel143 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleModel160 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleModel177 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_rulePackage_in_ruleModel198 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_ruleFQN_in_entryRuleFQN236 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFQN247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFQN287 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_13_in_ruleFQN306 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFQN321 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_rulePackage_in_entryRulePackage368 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackage378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rulePackage415 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_rulePackage436 = new BitSet(new long[]{0x0000000000009000L});
    public static final BitSet FOLLOW_ruleFile_in_rulePackage457 = new BitSet(new long[]{0x0000000000009000L});
    public static final BitSet FOLLOW_12_in_rulePackage470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFile_in_entryRuleFile506 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFile516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleFile553 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFile570 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleFile587 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleFile599 = new BitSet(new long[]{0x0000000000000002L});

}