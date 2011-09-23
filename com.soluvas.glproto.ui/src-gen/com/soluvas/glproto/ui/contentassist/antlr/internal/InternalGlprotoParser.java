package com.soluvas.glproto.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import com.soluvas.glproto.services.GlprotoGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGlprotoParser extends AbstractInternalContentAssistParser {
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
    public String getGrammarFileName() { return "../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g"; }


     
     	private GlprotoGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(GlprotoGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleModel"
    // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:60:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:61:1: ( ruleModel EOF )
            // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:62:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel61);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel68); 

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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:69:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:73:2: ( ( ( rule__Model__Group__0 ) ) )
            // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:74:1: ( ( rule__Model__Group__0 ) )
            {
            // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:74:1: ( ( rule__Model__Group__0 ) )
            // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:75:1: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:76:1: ( rule__Model__Group__0 )
            // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:76:2: rule__Model__Group__0
            {
            pushFollow(FOLLOW_rule__Model__Group__0_in_ruleModel94);
            rule__Model__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleFQN"
    // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:88:1: entryRuleFQN : ruleFQN EOF ;
    public final void entryRuleFQN() throws RecognitionException {
        try {
            // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:89:1: ( ruleFQN EOF )
            // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:90:1: ruleFQN EOF
            {
             before(grammarAccess.getFQNRule()); 
            pushFollow(FOLLOW_ruleFQN_in_entryRuleFQN121);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getFQNRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFQN128); 

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
    // $ANTLR end "entryRuleFQN"


    // $ANTLR start "ruleFQN"
    // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:97:1: ruleFQN : ( ( rule__FQN__Group__0 ) ) ;
    public final void ruleFQN() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:101:2: ( ( ( rule__FQN__Group__0 ) ) )
            // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:102:1: ( ( rule__FQN__Group__0 ) )
            {
            // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:102:1: ( ( rule__FQN__Group__0 ) )
            // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:103:1: ( rule__FQN__Group__0 )
            {
             before(grammarAccess.getFQNAccess().getGroup()); 
            // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:104:1: ( rule__FQN__Group__0 )
            // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:104:2: rule__FQN__Group__0
            {
            pushFollow(FOLLOW_rule__FQN__Group__0_in_ruleFQN154);
            rule__FQN__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFQNAccess().getGroup()); 

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
    // $ANTLR end "ruleFQN"


    // $ANTLR start "entryRulePackage"
    // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:116:1: entryRulePackage : rulePackage EOF ;
    public final void entryRulePackage() throws RecognitionException {
        try {
            // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:117:1: ( rulePackage EOF )
            // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:118:1: rulePackage EOF
            {
             before(grammarAccess.getPackageRule()); 
            pushFollow(FOLLOW_rulePackage_in_entryRulePackage181);
            rulePackage();

            state._fsp--;

             after(grammarAccess.getPackageRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePackage188); 

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
    // $ANTLR end "entryRulePackage"


    // $ANTLR start "rulePackage"
    // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:125:1: rulePackage : ( ( rule__Package__Group__0 ) ) ;
    public final void rulePackage() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:129:2: ( ( ( rule__Package__Group__0 ) ) )
            // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:130:1: ( ( rule__Package__Group__0 ) )
            {
            // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:130:1: ( ( rule__Package__Group__0 ) )
            // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:131:1: ( rule__Package__Group__0 )
            {
             before(grammarAccess.getPackageAccess().getGroup()); 
            // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:132:1: ( rule__Package__Group__0 )
            // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:132:2: rule__Package__Group__0
            {
            pushFollow(FOLLOW_rule__Package__Group__0_in_rulePackage214);
            rule__Package__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPackageAccess().getGroup()); 

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
    // $ANTLR end "rulePackage"


    // $ANTLR start "entryRuleFile"
    // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:144:1: entryRuleFile : ruleFile EOF ;
    public final void entryRuleFile() throws RecognitionException {
        try {
            // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:145:1: ( ruleFile EOF )
            // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:146:1: ruleFile EOF
            {
             before(grammarAccess.getFileRule()); 
            pushFollow(FOLLOW_ruleFile_in_entryRuleFile241);
            ruleFile();

            state._fsp--;

             after(grammarAccess.getFileRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFile248); 

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
    // $ANTLR end "entryRuleFile"


    // $ANTLR start "ruleFile"
    // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:153:1: ruleFile : ( ( rule__File__Group__0 ) ) ;
    public final void ruleFile() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:157:2: ( ( ( rule__File__Group__0 ) ) )
            // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:158:1: ( ( rule__File__Group__0 ) )
            {
            // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:158:1: ( ( rule__File__Group__0 ) )
            // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:159:1: ( rule__File__Group__0 )
            {
             before(grammarAccess.getFileAccess().getGroup()); 
            // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:160:1: ( rule__File__Group__0 )
            // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:160:2: rule__File__Group__0
            {
            pushFollow(FOLLOW_rule__File__Group__0_in_ruleFile274);
            rule__File__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFileAccess().getGroup()); 

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
    // $ANTLR end "ruleFile"


    // $ANTLR start "rule__Model__Group__0"
    // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:174:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:178:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:179:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__0308);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__1_in_rule__Model__Group__0311);
            rule__Model__Group__1();

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
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:186:1: rule__Model__Group__0__Impl : ( '(language' ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:190:1: ( ( '(language' ) )
            // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:191:1: ( '(language' )
            {
            // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:191:1: ( '(language' )
            // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:192:1: '(language'
            {
             before(grammarAccess.getModelAccess().getLanguageKeyword_0()); 
            match(input,11,FOLLOW_11_in_rule__Model__Group__0__Impl339); 
             after(grammarAccess.getModelAccess().getLanguageKeyword_0()); 

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
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:205:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:209:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:210:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__1370);
            rule__Model__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__2_in_rule__Model__Group__1373);
            rule__Model__Group__2();

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
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:217:1: rule__Model__Group__1__Impl : ( ( rule__Model__PackageAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:221:1: ( ( ( rule__Model__PackageAssignment_1 ) ) )
            // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:222:1: ( ( rule__Model__PackageAssignment_1 ) )
            {
            // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:222:1: ( ( rule__Model__PackageAssignment_1 ) )
            // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:223:1: ( rule__Model__PackageAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getPackageAssignment_1()); 
            // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:224:1: ( rule__Model__PackageAssignment_1 )
            // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:224:2: rule__Model__PackageAssignment_1
            {
            pushFollow(FOLLOW_rule__Model__PackageAssignment_1_in_rule__Model__Group__1__Impl400);
            rule__Model__PackageAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getPackageAssignment_1()); 

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
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__Model__Group__2"
    // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:234:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:238:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:239:2: rule__Model__Group__2__Impl rule__Model__Group__3
            {
            pushFollow(FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__2430);
            rule__Model__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__3_in_rule__Model__Group__2433);
            rule__Model__Group__3();

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
    // $ANTLR end "rule__Model__Group__2"


    // $ANTLR start "rule__Model__Group__2__Impl"
    // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:246:1: rule__Model__Group__2__Impl : ( ( rule__Model__NameAssignment_2 ) ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:250:1: ( ( ( rule__Model__NameAssignment_2 ) ) )
            // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:251:1: ( ( rule__Model__NameAssignment_2 ) )
            {
            // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:251:1: ( ( rule__Model__NameAssignment_2 ) )
            // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:252:1: ( rule__Model__NameAssignment_2 )
            {
             before(grammarAccess.getModelAccess().getNameAssignment_2()); 
            // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:253:1: ( rule__Model__NameAssignment_2 )
            // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:253:2: rule__Model__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Model__NameAssignment_2_in_rule__Model__Group__2__Impl460);
            rule__Model__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__Model__Group__2__Impl"


    // $ANTLR start "rule__Model__Group__3"
    // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:263:1: rule__Model__Group__3 : rule__Model__Group__3__Impl rule__Model__Group__4 ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:267:1: ( rule__Model__Group__3__Impl rule__Model__Group__4 )
            // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:268:2: rule__Model__Group__3__Impl rule__Model__Group__4
            {
            pushFollow(FOLLOW_rule__Model__Group__3__Impl_in_rule__Model__Group__3490);
            rule__Model__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__4_in_rule__Model__Group__3493);
            rule__Model__Group__4();

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
    // $ANTLR end "rule__Model__Group__3"


    // $ANTLR start "rule__Model__Group__3__Impl"
    // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:275:1: rule__Model__Group__3__Impl : ( ')' ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:279:1: ( ( ')' ) )
            // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:280:1: ( ')' )
            {
            // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:280:1: ( ')' )
            // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:281:1: ')'
            {
             before(grammarAccess.getModelAccess().getRightParenthesisKeyword_3()); 
            match(input,12,FOLLOW_12_in_rule__Model__Group__3__Impl521); 
             after(grammarAccess.getModelAccess().getRightParenthesisKeyword_3()); 

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
    // $ANTLR end "rule__Model__Group__3__Impl"


    // $ANTLR start "rule__Model__Group__4"
    // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:294:1: rule__Model__Group__4 : rule__Model__Group__4__Impl ;
    public final void rule__Model__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:298:1: ( rule__Model__Group__4__Impl )
            // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:299:2: rule__Model__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group__4__Impl_in_rule__Model__Group__4552);
            rule__Model__Group__4__Impl();

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
    // $ANTLR end "rule__Model__Group__4"


    // $ANTLR start "rule__Model__Group__4__Impl"
    // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:305:1: rule__Model__Group__4__Impl : ( ( rule__Model__PackagesAssignment_4 )* ) ;
    public final void rule__Model__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:309:1: ( ( ( rule__Model__PackagesAssignment_4 )* ) )
            // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:310:1: ( ( rule__Model__PackagesAssignment_4 )* )
            {
            // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:310:1: ( ( rule__Model__PackagesAssignment_4 )* )
            // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:311:1: ( rule__Model__PackagesAssignment_4 )*
            {
             before(grammarAccess.getModelAccess().getPackagesAssignment_4()); 
            // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:312:1: ( rule__Model__PackagesAssignment_4 )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:312:2: rule__Model__PackagesAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Model__PackagesAssignment_4_in_rule__Model__Group__4__Impl579);
            	    rule__Model__PackagesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getPackagesAssignment_4()); 

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
    // $ANTLR end "rule__Model__Group__4__Impl"


    // $ANTLR start "rule__FQN__Group__0"
    // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:332:1: rule__FQN__Group__0 : rule__FQN__Group__0__Impl rule__FQN__Group__1 ;
    public final void rule__FQN__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:336:1: ( rule__FQN__Group__0__Impl rule__FQN__Group__1 )
            // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:337:2: rule__FQN__Group__0__Impl rule__FQN__Group__1
            {
            pushFollow(FOLLOW_rule__FQN__Group__0__Impl_in_rule__FQN__Group__0620);
            rule__FQN__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FQN__Group__1_in_rule__FQN__Group__0623);
            rule__FQN__Group__1();

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
    // $ANTLR end "rule__FQN__Group__0"


    // $ANTLR start "rule__FQN__Group__0__Impl"
    // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:344:1: rule__FQN__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:348:1: ( ( RULE_ID ) )
            // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:349:1: ( RULE_ID )
            {
            // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:349:1: ( RULE_ID )
            // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:350:1: RULE_ID
            {
             before(grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FQN__Group__0__Impl650); 
             after(grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__FQN__Group__0__Impl"


    // $ANTLR start "rule__FQN__Group__1"
    // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:361:1: rule__FQN__Group__1 : rule__FQN__Group__1__Impl ;
    public final void rule__FQN__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:365:1: ( rule__FQN__Group__1__Impl )
            // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:366:2: rule__FQN__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__FQN__Group__1__Impl_in_rule__FQN__Group__1679);
            rule__FQN__Group__1__Impl();

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
    // $ANTLR end "rule__FQN__Group__1"


    // $ANTLR start "rule__FQN__Group__1__Impl"
    // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:372:1: rule__FQN__Group__1__Impl : ( ( rule__FQN__Group_1__0 )* ) ;
    public final void rule__FQN__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:376:1: ( ( ( rule__FQN__Group_1__0 )* ) )
            // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:377:1: ( ( rule__FQN__Group_1__0 )* )
            {
            // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:377:1: ( ( rule__FQN__Group_1__0 )* )
            // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:378:1: ( rule__FQN__Group_1__0 )*
            {
             before(grammarAccess.getFQNAccess().getGroup_1()); 
            // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:379:1: ( rule__FQN__Group_1__0 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==13) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:379:2: rule__FQN__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__FQN__Group_1__0_in_rule__FQN__Group__1__Impl706);
            	    rule__FQN__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getFQNAccess().getGroup_1()); 

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
    // $ANTLR end "rule__FQN__Group__1__Impl"


    // $ANTLR start "rule__FQN__Group_1__0"
    // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:393:1: rule__FQN__Group_1__0 : rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 ;
    public final void rule__FQN__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:397:1: ( rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 )
            // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:398:2: rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1
            {
            pushFollow(FOLLOW_rule__FQN__Group_1__0__Impl_in_rule__FQN__Group_1__0741);
            rule__FQN__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FQN__Group_1__1_in_rule__FQN__Group_1__0744);
            rule__FQN__Group_1__1();

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
    // $ANTLR end "rule__FQN__Group_1__0"


    // $ANTLR start "rule__FQN__Group_1__0__Impl"
    // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:405:1: rule__FQN__Group_1__0__Impl : ( '.' ) ;
    public final void rule__FQN__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:409:1: ( ( '.' ) )
            // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:410:1: ( '.' )
            {
            // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:410:1: ( '.' )
            // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:411:1: '.'
            {
             before(grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            match(input,13,FOLLOW_13_in_rule__FQN__Group_1__0__Impl772); 
             after(grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 

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
    // $ANTLR end "rule__FQN__Group_1__0__Impl"


    // $ANTLR start "rule__FQN__Group_1__1"
    // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:424:1: rule__FQN__Group_1__1 : rule__FQN__Group_1__1__Impl ;
    public final void rule__FQN__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:428:1: ( rule__FQN__Group_1__1__Impl )
            // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:429:2: rule__FQN__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__FQN__Group_1__1__Impl_in_rule__FQN__Group_1__1803);
            rule__FQN__Group_1__1__Impl();

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
    // $ANTLR end "rule__FQN__Group_1__1"


    // $ANTLR start "rule__FQN__Group_1__1__Impl"
    // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:435:1: rule__FQN__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:439:1: ( ( RULE_ID ) )
            // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:440:1: ( RULE_ID )
            {
            // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:440:1: ( RULE_ID )
            // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:441:1: RULE_ID
            {
             before(grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FQN__Group_1__1__Impl830); 
             after(grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); 

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
    // $ANTLR end "rule__FQN__Group_1__1__Impl"


    // $ANTLR start "rule__Package__Group__0"
    // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:456:1: rule__Package__Group__0 : rule__Package__Group__0__Impl rule__Package__Group__1 ;
    public final void rule__Package__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:460:1: ( rule__Package__Group__0__Impl rule__Package__Group__1 )
            // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:461:2: rule__Package__Group__0__Impl rule__Package__Group__1
            {
            pushFollow(FOLLOW_rule__Package__Group__0__Impl_in_rule__Package__Group__0863);
            rule__Package__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Package__Group__1_in_rule__Package__Group__0866);
            rule__Package__Group__1();

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
    // $ANTLR end "rule__Package__Group__0"


    // $ANTLR start "rule__Package__Group__0__Impl"
    // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:468:1: rule__Package__Group__0__Impl : ( '(package' ) ;
    public final void rule__Package__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:472:1: ( ( '(package' ) )
            // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:473:1: ( '(package' )
            {
            // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:473:1: ( '(package' )
            // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:474:1: '(package'
            {
             before(grammarAccess.getPackageAccess().getPackageKeyword_0()); 
            match(input,14,FOLLOW_14_in_rule__Package__Group__0__Impl894); 
             after(grammarAccess.getPackageAccess().getPackageKeyword_0()); 

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
    // $ANTLR end "rule__Package__Group__0__Impl"


    // $ANTLR start "rule__Package__Group__1"
    // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:487:1: rule__Package__Group__1 : rule__Package__Group__1__Impl rule__Package__Group__2 ;
    public final void rule__Package__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:491:1: ( rule__Package__Group__1__Impl rule__Package__Group__2 )
            // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:492:2: rule__Package__Group__1__Impl rule__Package__Group__2
            {
            pushFollow(FOLLOW_rule__Package__Group__1__Impl_in_rule__Package__Group__1925);
            rule__Package__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Package__Group__2_in_rule__Package__Group__1928);
            rule__Package__Group__2();

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
    // $ANTLR end "rule__Package__Group__1"


    // $ANTLR start "rule__Package__Group__1__Impl"
    // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:499:1: rule__Package__Group__1__Impl : ( ( rule__Package__NameAssignment_1 ) ) ;
    public final void rule__Package__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:503:1: ( ( ( rule__Package__NameAssignment_1 ) ) )
            // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:504:1: ( ( rule__Package__NameAssignment_1 ) )
            {
            // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:504:1: ( ( rule__Package__NameAssignment_1 ) )
            // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:505:1: ( rule__Package__NameAssignment_1 )
            {
             before(grammarAccess.getPackageAccess().getNameAssignment_1()); 
            // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:506:1: ( rule__Package__NameAssignment_1 )
            // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:506:2: rule__Package__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Package__NameAssignment_1_in_rule__Package__Group__1__Impl955);
            rule__Package__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPackageAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Package__Group__1__Impl"


    // $ANTLR start "rule__Package__Group__2"
    // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:516:1: rule__Package__Group__2 : rule__Package__Group__2__Impl rule__Package__Group__3 ;
    public final void rule__Package__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:520:1: ( rule__Package__Group__2__Impl rule__Package__Group__3 )
            // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:521:2: rule__Package__Group__2__Impl rule__Package__Group__3
            {
            pushFollow(FOLLOW_rule__Package__Group__2__Impl_in_rule__Package__Group__2985);
            rule__Package__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Package__Group__3_in_rule__Package__Group__2988);
            rule__Package__Group__3();

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
    // $ANTLR end "rule__Package__Group__2"


    // $ANTLR start "rule__Package__Group__2__Impl"
    // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:528:1: rule__Package__Group__2__Impl : ( ( rule__Package__FilesAssignment_2 )* ) ;
    public final void rule__Package__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:532:1: ( ( ( rule__Package__FilesAssignment_2 )* ) )
            // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:533:1: ( ( rule__Package__FilesAssignment_2 )* )
            {
            // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:533:1: ( ( rule__Package__FilesAssignment_2 )* )
            // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:534:1: ( rule__Package__FilesAssignment_2 )*
            {
             before(grammarAccess.getPackageAccess().getFilesAssignment_2()); 
            // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:535:1: ( rule__Package__FilesAssignment_2 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==15) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:535:2: rule__Package__FilesAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Package__FilesAssignment_2_in_rule__Package__Group__2__Impl1015);
            	    rule__Package__FilesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getPackageAccess().getFilesAssignment_2()); 

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
    // $ANTLR end "rule__Package__Group__2__Impl"


    // $ANTLR start "rule__Package__Group__3"
    // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:545:1: rule__Package__Group__3 : rule__Package__Group__3__Impl ;
    public final void rule__Package__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:549:1: ( rule__Package__Group__3__Impl )
            // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:550:2: rule__Package__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Package__Group__3__Impl_in_rule__Package__Group__31046);
            rule__Package__Group__3__Impl();

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
    // $ANTLR end "rule__Package__Group__3"


    // $ANTLR start "rule__Package__Group__3__Impl"
    // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:556:1: rule__Package__Group__3__Impl : ( ')' ) ;
    public final void rule__Package__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:560:1: ( ( ')' ) )
            // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:561:1: ( ')' )
            {
            // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:561:1: ( ')' )
            // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:562:1: ')'
            {
             before(grammarAccess.getPackageAccess().getRightParenthesisKeyword_3()); 
            match(input,12,FOLLOW_12_in_rule__Package__Group__3__Impl1074); 
             after(grammarAccess.getPackageAccess().getRightParenthesisKeyword_3()); 

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
    // $ANTLR end "rule__Package__Group__3__Impl"


    // $ANTLR start "rule__File__Group__0"
    // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:583:1: rule__File__Group__0 : rule__File__Group__0__Impl rule__File__Group__1 ;
    public final void rule__File__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:587:1: ( rule__File__Group__0__Impl rule__File__Group__1 )
            // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:588:2: rule__File__Group__0__Impl rule__File__Group__1
            {
            pushFollow(FOLLOW_rule__File__Group__0__Impl_in_rule__File__Group__01113);
            rule__File__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__File__Group__1_in_rule__File__Group__01116);
            rule__File__Group__1();

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
    // $ANTLR end "rule__File__Group__0"


    // $ANTLR start "rule__File__Group__0__Impl"
    // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:595:1: rule__File__Group__0__Impl : ( '(file' ) ;
    public final void rule__File__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:599:1: ( ( '(file' ) )
            // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:600:1: ( '(file' )
            {
            // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:600:1: ( '(file' )
            // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:601:1: '(file'
            {
             before(grammarAccess.getFileAccess().getFileKeyword_0()); 
            match(input,15,FOLLOW_15_in_rule__File__Group__0__Impl1144); 
             after(grammarAccess.getFileAccess().getFileKeyword_0()); 

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
    // $ANTLR end "rule__File__Group__0__Impl"


    // $ANTLR start "rule__File__Group__1"
    // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:614:1: rule__File__Group__1 : rule__File__Group__1__Impl rule__File__Group__2 ;
    public final void rule__File__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:618:1: ( rule__File__Group__1__Impl rule__File__Group__2 )
            // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:619:2: rule__File__Group__1__Impl rule__File__Group__2
            {
            pushFollow(FOLLOW_rule__File__Group__1__Impl_in_rule__File__Group__11175);
            rule__File__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__File__Group__2_in_rule__File__Group__11178);
            rule__File__Group__2();

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
    // $ANTLR end "rule__File__Group__1"


    // $ANTLR start "rule__File__Group__1__Impl"
    // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:626:1: rule__File__Group__1__Impl : ( ( rule__File__NameAssignment_1 ) ) ;
    public final void rule__File__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:630:1: ( ( ( rule__File__NameAssignment_1 ) ) )
            // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:631:1: ( ( rule__File__NameAssignment_1 ) )
            {
            // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:631:1: ( ( rule__File__NameAssignment_1 ) )
            // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:632:1: ( rule__File__NameAssignment_1 )
            {
             before(grammarAccess.getFileAccess().getNameAssignment_1()); 
            // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:633:1: ( rule__File__NameAssignment_1 )
            // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:633:2: rule__File__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__File__NameAssignment_1_in_rule__File__Group__1__Impl1205);
            rule__File__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFileAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__File__Group__1__Impl"


    // $ANTLR start "rule__File__Group__2"
    // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:643:1: rule__File__Group__2 : rule__File__Group__2__Impl rule__File__Group__3 ;
    public final void rule__File__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:647:1: ( rule__File__Group__2__Impl rule__File__Group__3 )
            // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:648:2: rule__File__Group__2__Impl rule__File__Group__3
            {
            pushFollow(FOLLOW_rule__File__Group__2__Impl_in_rule__File__Group__21235);
            rule__File__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__File__Group__3_in_rule__File__Group__21238);
            rule__File__Group__3();

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
    // $ANTLR end "rule__File__Group__2"


    // $ANTLR start "rule__File__Group__2__Impl"
    // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:655:1: rule__File__Group__2__Impl : ( 'java' ) ;
    public final void rule__File__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:659:1: ( ( 'java' ) )
            // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:660:1: ( 'java' )
            {
            // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:660:1: ( 'java' )
            // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:661:1: 'java'
            {
             before(grammarAccess.getFileAccess().getJavaKeyword_2()); 
            match(input,16,FOLLOW_16_in_rule__File__Group__2__Impl1266); 
             after(grammarAccess.getFileAccess().getJavaKeyword_2()); 

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
    // $ANTLR end "rule__File__Group__2__Impl"


    // $ANTLR start "rule__File__Group__3"
    // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:674:1: rule__File__Group__3 : rule__File__Group__3__Impl ;
    public final void rule__File__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:678:1: ( rule__File__Group__3__Impl )
            // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:679:2: rule__File__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__File__Group__3__Impl_in_rule__File__Group__31297);
            rule__File__Group__3__Impl();

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
    // $ANTLR end "rule__File__Group__3"


    // $ANTLR start "rule__File__Group__3__Impl"
    // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:685:1: rule__File__Group__3__Impl : ( ')' ) ;
    public final void rule__File__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:689:1: ( ( ')' ) )
            // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:690:1: ( ')' )
            {
            // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:690:1: ( ')' )
            // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:691:1: ')'
            {
             before(grammarAccess.getFileAccess().getRightParenthesisKeyword_3()); 
            match(input,12,FOLLOW_12_in_rule__File__Group__3__Impl1325); 
             after(grammarAccess.getFileAccess().getRightParenthesisKeyword_3()); 

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
    // $ANTLR end "rule__File__Group__3__Impl"


    // $ANTLR start "rule__Model__PackageAssignment_1"
    // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:713:1: rule__Model__PackageAssignment_1 : ( ruleFQN ) ;
    public final void rule__Model__PackageAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:717:1: ( ( ruleFQN ) )
            // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:718:1: ( ruleFQN )
            {
            // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:718:1: ( ruleFQN )
            // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:719:1: ruleFQN
            {
             before(grammarAccess.getModelAccess().getPackageFQNParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleFQN_in_rule__Model__PackageAssignment_11369);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getModelAccess().getPackageFQNParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Model__PackageAssignment_1"


    // $ANTLR start "rule__Model__NameAssignment_2"
    // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:728:1: rule__Model__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Model__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:732:1: ( ( RULE_ID ) )
            // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:733:1: ( RULE_ID )
            {
            // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:733:1: ( RULE_ID )
            // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:734:1: RULE_ID
            {
             before(grammarAccess.getModelAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Model__NameAssignment_21400); 
             after(grammarAccess.getModelAccess().getNameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Model__NameAssignment_2"


    // $ANTLR start "rule__Model__PackagesAssignment_4"
    // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:743:1: rule__Model__PackagesAssignment_4 : ( rulePackage ) ;
    public final void rule__Model__PackagesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:747:1: ( ( rulePackage ) )
            // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:748:1: ( rulePackage )
            {
            // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:748:1: ( rulePackage )
            // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:749:1: rulePackage
            {
             before(grammarAccess.getModelAccess().getPackagesPackageParserRuleCall_4_0()); 
            pushFollow(FOLLOW_rulePackage_in_rule__Model__PackagesAssignment_41431);
            rulePackage();

            state._fsp--;

             after(grammarAccess.getModelAccess().getPackagesPackageParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Model__PackagesAssignment_4"


    // $ANTLR start "rule__Package__NameAssignment_1"
    // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:758:1: rule__Package__NameAssignment_1 : ( ruleFQN ) ;
    public final void rule__Package__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:762:1: ( ( ruleFQN ) )
            // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:763:1: ( ruleFQN )
            {
            // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:763:1: ( ruleFQN )
            // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:764:1: ruleFQN
            {
             before(grammarAccess.getPackageAccess().getNameFQNParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleFQN_in_rule__Package__NameAssignment_11462);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getPackageAccess().getNameFQNParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Package__NameAssignment_1"


    // $ANTLR start "rule__Package__FilesAssignment_2"
    // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:773:1: rule__Package__FilesAssignment_2 : ( ruleFile ) ;
    public final void rule__Package__FilesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:777:1: ( ( ruleFile ) )
            // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:778:1: ( ruleFile )
            {
            // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:778:1: ( ruleFile )
            // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:779:1: ruleFile
            {
             before(grammarAccess.getPackageAccess().getFilesFileParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleFile_in_rule__Package__FilesAssignment_21493);
            ruleFile();

            state._fsp--;

             after(grammarAccess.getPackageAccess().getFilesFileParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Package__FilesAssignment_2"


    // $ANTLR start "rule__File__NameAssignment_1"
    // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:788:1: rule__File__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__File__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:792:1: ( ( RULE_ID ) )
            // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:793:1: ( RULE_ID )
            {
            // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:793:1: ( RULE_ID )
            // ../com.soluvas.glproto.ui/src-gen/com/soluvas/glproto/ui/contentassist/antlr/internal/InternalGlproto.g:794:1: RULE_ID
            {
             before(grammarAccess.getFileAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__File__NameAssignment_11524); 
             after(grammarAccess.getFileAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__File__NameAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0_in_ruleModel94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_entryRuleFQN121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFQN128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group__0_in_ruleFQN154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_in_entryRulePackage181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackage188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__Group__0_in_rulePackage214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFile_in_entryRuleFile241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFile248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__File__Group__0_in_ruleFile274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__0308 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Model__Group__1_in_rule__Model__Group__0311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Model__Group__0__Impl339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__1370 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Model__Group__2_in_rule__Model__Group__1373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__PackageAssignment_1_in_rule__Model__Group__1__Impl400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__2430 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Model__Group__3_in_rule__Model__Group__2433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__NameAssignment_2_in_rule__Model__Group__2__Impl460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__3__Impl_in_rule__Model__Group__3490 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Model__Group__4_in_rule__Model__Group__3493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Model__Group__3__Impl521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__4__Impl_in_rule__Model__Group__4552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__PackagesAssignment_4_in_rule__Model__Group__4__Impl579 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_rule__FQN__Group__0__Impl_in_rule__FQN__Group__0620 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__FQN__Group__1_in_rule__FQN__Group__0623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FQN__Group__0__Impl650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group__1__Impl_in_rule__FQN__Group__1679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__0_in_rule__FQN__Group__1__Impl706 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__0__Impl_in_rule__FQN__Group_1__0741 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__1_in_rule__FQN__Group_1__0744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__FQN__Group_1__0__Impl772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__1__Impl_in_rule__FQN__Group_1__1803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FQN__Group_1__1__Impl830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__Group__0__Impl_in_rule__Package__Group__0863 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Package__Group__1_in_rule__Package__Group__0866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Package__Group__0__Impl894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__Group__1__Impl_in_rule__Package__Group__1925 = new BitSet(new long[]{0x0000000000009000L});
    public static final BitSet FOLLOW_rule__Package__Group__2_in_rule__Package__Group__1928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__NameAssignment_1_in_rule__Package__Group__1__Impl955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__Group__2__Impl_in_rule__Package__Group__2985 = new BitSet(new long[]{0x0000000000009000L});
    public static final BitSet FOLLOW_rule__Package__Group__3_in_rule__Package__Group__2988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__FilesAssignment_2_in_rule__Package__Group__2__Impl1015 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_rule__Package__Group__3__Impl_in_rule__Package__Group__31046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Package__Group__3__Impl1074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__File__Group__0__Impl_in_rule__File__Group__01113 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__File__Group__1_in_rule__File__Group__01116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__File__Group__0__Impl1144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__File__Group__1__Impl_in_rule__File__Group__11175 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__File__Group__2_in_rule__File__Group__11178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__File__NameAssignment_1_in_rule__File__Group__1__Impl1205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__File__Group__2__Impl_in_rule__File__Group__21235 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__File__Group__3_in_rule__File__Group__21238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__File__Group__2__Impl1266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__File__Group__3__Impl_in_rule__File__Group__31297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__File__Group__3__Impl1325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__Model__PackageAssignment_11369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Model__NameAssignment_21400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_in_rule__Model__PackagesAssignment_41431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__Package__NameAssignment_11462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFile_in_rule__Package__FilesAssignment_21493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__File__NameAssignment_11524 = new BitSet(new long[]{0x0000000000000002L});

}