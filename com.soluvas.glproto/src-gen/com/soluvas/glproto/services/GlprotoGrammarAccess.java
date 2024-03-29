/*
* generated by Xtext
*/

package com.soluvas.glproto.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;

import org.eclipse.xtext.common.services.TerminalsGrammarAccess;

@Singleton
public class GlprotoGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class ModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Model");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLanguageKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cPackageAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cPackageFQNParserRuleCall_1_0 = (RuleCall)cPackageAssignment_1.eContents().get(0);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cPackagesAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cPackagesPackageParserRuleCall_4_0 = (RuleCall)cPackagesAssignment_4.eContents().get(0);
		
		//Model:
		//	"(language" package=FQN name=ID ")" packages+=Package*;
		public ParserRule getRule() { return rule; }

		//"(language" package=FQN name=ID ")" packages+=Package*
		public Group getGroup() { return cGroup; }

		//"(language"
		public Keyword getLanguageKeyword_0() { return cLanguageKeyword_0; }

		//package=FQN
		public Assignment getPackageAssignment_1() { return cPackageAssignment_1; }

		//FQN
		public RuleCall getPackageFQNParserRuleCall_1_0() { return cPackageFQNParserRuleCall_1_0; }

		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }

		//")"
		public Keyword getRightParenthesisKeyword_3() { return cRightParenthesisKeyword_3; }

		//packages+=Package*
		public Assignment getPackagesAssignment_4() { return cPackagesAssignment_4; }

		//Package
		public RuleCall getPackagesPackageParserRuleCall_4_0() { return cPackagesPackageParserRuleCall_4_0; }
	}

	public class FQNElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "FQN");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cIDTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cFullStopKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1_1 = (RuleCall)cGroup_1.eContents().get(1);
		
		//FQN:
		//	ID ("." ID)*;
		public ParserRule getRule() { return rule; }

		//ID ("." ID)*
		public Group getGroup() { return cGroup; }

		//ID
		public RuleCall getIDTerminalRuleCall_0() { return cIDTerminalRuleCall_0; }

		//("." ID)*
		public Group getGroup_1() { return cGroup_1; }

		//"."
		public Keyword getFullStopKeyword_1_0() { return cFullStopKeyword_1_0; }

		//ID
		public RuleCall getIDTerminalRuleCall_1_1() { return cIDTerminalRuleCall_1_1; }
	}

	public class PackageElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Package");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cPackageKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameFQNParserRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Assignment cFilesAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cFilesFileParserRuleCall_2_0 = (RuleCall)cFilesAssignment_2.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//Package:
		//	"(package" name=FQN files+=File* ")";
		public ParserRule getRule() { return rule; }

		//"(package" name=FQN files+=File* ")"
		public Group getGroup() { return cGroup; }

		//"(package"
		public Keyword getPackageKeyword_0() { return cPackageKeyword_0; }

		//name=FQN
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//FQN
		public RuleCall getNameFQNParserRuleCall_1_0() { return cNameFQNParserRuleCall_1_0; }

		//files+=File*
		public Assignment getFilesAssignment_2() { return cFilesAssignment_2; }

		//File
		public RuleCall getFilesFileParserRuleCall_2_0() { return cFilesFileParserRuleCall_2_0; }

		//")"
		public Keyword getRightParenthesisKeyword_3() { return cRightParenthesisKeyword_3; }
	}

	public class FileElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "File");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cFileKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cJavaKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cRightParenthesisKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//File:
		//	"(file" name=ID "java" ")";
		public ParserRule getRule() { return rule; }

		//"(file" name=ID "java" ")"
		public Group getGroup() { return cGroup; }

		//"(file"
		public Keyword getFileKeyword_0() { return cFileKeyword_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//"java"
		public Keyword getJavaKeyword_2() { return cJavaKeyword_2; }

		//")"
		public Keyword getRightParenthesisKeyword_3() { return cRightParenthesisKeyword_3; }
	}
	
	
	private ModelElements pModel;
	private FQNElements pFQN;
	private PackageElements pPackage;
	private FileElements pFile;
	
	private final GrammarProvider grammarProvider;

	private TerminalsGrammarAccess gaTerminals;

	@Inject
	public GlprotoGrammarAccess(GrammarProvider grammarProvider,
		TerminalsGrammarAccess gaTerminals) {
		this.grammarProvider = grammarProvider;
		this.gaTerminals = gaTerminals;
	}
	
	public Grammar getGrammar() {	
		return grammarProvider.getGrammar(this);
	}
	

	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Model:
	//	"(language" package=FQN name=ID ")" packages+=Package*;
	public ModelElements getModelAccess() {
		return (pModel != null) ? pModel : (pModel = new ModelElements());
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}

	//FQN:
	//	ID ("." ID)*;
	public FQNElements getFQNAccess() {
		return (pFQN != null) ? pFQN : (pFQN = new FQNElements());
	}
	
	public ParserRule getFQNRule() {
		return getFQNAccess().getRule();
	}

	//Package:
	//	"(package" name=FQN files+=File* ")";
	public PackageElements getPackageAccess() {
		return (pPackage != null) ? pPackage : (pPackage = new PackageElements());
	}
	
	public ParserRule getPackageRule() {
		return getPackageAccess().getRule();
	}

	//File:
	//	"(file" name=ID "java" ")";
	public FileElements getFileAccess() {
		return (pFile != null) ? pFile : (pFile = new FileElements());
	}
	
	public ParserRule getFileRule() {
		return getFileAccess().getRule();
	}

	//terminal ID:
	//	"^"? ("a".."z" | "A".."Z" | "_") ("a".."z" | "A".."Z" | "_" | "0".."9")*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	} 

	//terminal INT returns ecore::EInt:
	//	"0".."9"+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	} 

	//terminal STRING:
	//	"\"" ("\\" ("b" | "t" | "n" | "f" | "r" | "u" | "\"" | "\'" | "\\") | !("\\" | "\""))* "\"" | "\'" ("\\" ("b" | "t" |
	//	"n" | "f" | "r" | "u" | "\"" | "\'" | "\\") | !("\\" | "\'"))* "\'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	} 

	//terminal ML_COMMENT:
	//	"/ *"->"* /";
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	} 

	//terminal SL_COMMENT:
	//	"//" !("\n" | "\r")* ("\r"? "\n")?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	} 

	//terminal WS:
	//	(" " | "\t" | "\r" | "\n")+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	} 

	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	} 
}
