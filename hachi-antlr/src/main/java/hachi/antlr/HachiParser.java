// Generated from Hachi.g4 by ANTLR 4.7.1

    package hachi.antlr;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class HachiParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		VARIABLE=39, PRINT=40, EQUALS=41, NUMBER=42, STRING=43, BOOLEAN=44, ID=45, 
		WHITE_SPACE=46;
	public static final int
		RULE_compilationUnit = 0, RULE_classDeclaration = 1, RULE_className = 2, 
		RULE_classBody = 3, RULE_field = 4, RULE_function = 5, RULE_functionDeclaration = 6, 
		RULE_functionName = 7, RULE_functionParameterList = 8, RULE_functionParameter = 9, 
		RULE_functionParameterWithDefaultValue = 10, RULE_functionBody = 11, RULE_type = 12, 
		RULE_primitiveType = 13, RULE_classType = 14, RULE_statement = 15, RULE_blockStatement = 16, 
		RULE_variableDeclaration = 17, RULE_assignment = 18, RULE_printStatement = 19, 
		RULE_forStatement = 20, RULE_forCondition = 21, RULE_returnStatement = 22, 
		RULE_ifStatement = 23, RULE_name = 24, RULE_functionArgument = 25, RULE_functionArgumentList = 26, 
		RULE_namedFunctionArgument = 27, RULE_expression = 28, RULE_variableReference = 29, 
		RULE_value = 30, RULE_qualifiedName = 31;
	public static final String[] ruleNames = {
		"compilationUnit", "classDeclaration", "className", "classBody", "field", 
		"function", "functionDeclaration", "functionName", "functionParameterList", 
		"functionParameter", "functionParameterWithDefaultValue", "functionBody", 
		"type", "primitiveType", "classType", "statement", "blockStatement", "variableDeclaration", 
		"assignment", "printStatement", "forStatement", "forCondition", "returnStatement", 
		"ifStatement", "name", "functionArgument", "functionArgumentList", "namedFunctionArgument", 
		"expression", "variableReference", "value", "qualifiedName"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'class'", "'{'", "'}'", "'('", "')'", "','", "'boolean'", "'['", 
		"']'", "'string'", "'char'", "'byte'", "'short'", "'int'", "'long'", "'float'", 
		"'double'", "'void'", "'for'", "'from'", "'to'", "'return'", "'if'", "'else'", 
		"'->'", "'.'", "'super'", "'new'", "'*'", "'/'", "'+'", "'-'", "'>'", 
		"'<'", "'=='", "'!='", "'>='", "'<='", "'var'", "'print'", "'='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, "VARIABLE", "PRINT", "EQUALS", "NUMBER", "STRING", "BOOLEAN", 
		"ID", "WHITE_SPACE"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Hachi.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public HachiParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class CompilationUnitContext extends ParserRuleContext {
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public TerminalNode EOF() { return getToken(HachiParser.EOF, 0); }
		public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilationUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HachiListener ) ((HachiListener)listener).enterCompilationUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HachiListener ) ((HachiListener)listener).exitCompilationUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HachiVisitor ) return ((HachiVisitor<? extends T>)visitor).visitCompilationUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compilationUnit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			classDeclaration();
			setState(65);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassDeclarationContext extends ParserRuleContext {
		public ClassNameContext className() {
			return getRuleContext(ClassNameContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HachiListener ) ((HachiListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HachiListener ) ((HachiListener)listener).exitClassDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HachiVisitor ) return ((HachiVisitor<? extends T>)visitor).visitClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_classDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(T__0);
			setState(68);
			className();
			setState(69);
			match(T__1);
			setState(70);
			classBody();
			setState(71);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassNameContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public ClassNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_className; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HachiListener ) ((HachiListener)listener).enterClassName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HachiListener ) ((HachiListener)listener).exitClassName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HachiVisitor ) return ((HachiVisitor<? extends T>)visitor).visitClassName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassNameContext className() throws RecognitionException {
		ClassNameContext _localctx = new ClassNameContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_className);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			qualifiedName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassBodyContext extends ParserRuleContext {
		public List<FieldContext> field() {
			return getRuleContexts(FieldContext.class);
		}
		public FieldContext field(int i) {
			return getRuleContext(FieldContext.class,i);
		}
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public ClassBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HachiListener ) ((HachiListener)listener).enterClassBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HachiListener ) ((HachiListener)listener).exitClassBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HachiVisitor ) return ((HachiVisitor<? extends T>)visitor).visitClassBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_classBody);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(75);
					field();
					}
					} 
				}
				setState(80);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << ID))) != 0)) {
				{
				{
				setState(81);
				function();
				}
				}
				setState(86);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public FieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HachiListener ) ((HachiListener)listener).enterField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HachiListener ) ((HachiListener)listener).exitField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HachiVisitor ) return ((HachiVisitor<? extends T>)visitor).visitField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldContext field() throws RecognitionException {
		FieldContext _localctx = new FieldContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_field);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			type();
			setState(88);
			name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionContext extends ParserRuleContext {
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HachiListener ) ((HachiListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HachiListener ) ((HachiListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HachiVisitor ) return ((HachiVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			functionDeclaration();
			setState(91);
			functionBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionDeclarationContext extends ParserRuleContext {
		public FunctionNameContext functionName() {
			return getRuleContext(FunctionNameContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public FunctionParameterListContext functionParameterList() {
			return getRuleContext(FunctionParameterListContext.class,0);
		}
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HachiListener ) ((HachiListener)listener).enterFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HachiListener ) ((HachiListener)listener).exitFunctionDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HachiVisitor ) return ((HachiVisitor<? extends T>)visitor).visitFunctionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_functionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(93);
				type();
				}
				break;
			}
			setState(96);
			functionName();
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(97);
				match(T__3);
				}
			}

			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << ID))) != 0)) {
				{
				setState(100);
				functionParameterList();
				}
			}

			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(103);
				match(T__4);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionNameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(HachiParser.ID, 0); }
		public FunctionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HachiListener ) ((HachiListener)listener).enterFunctionName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HachiListener ) ((HachiListener)listener).exitFunctionName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HachiVisitor ) return ((HachiVisitor<? extends T>)visitor).visitFunctionName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionNameContext functionName() throws RecognitionException {
		FunctionNameContext _localctx = new FunctionNameContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_functionName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionParameterListContext extends ParserRuleContext {
		public List<FunctionParameterContext> functionParameter() {
			return getRuleContexts(FunctionParameterContext.class);
		}
		public FunctionParameterContext functionParameter(int i) {
			return getRuleContext(FunctionParameterContext.class,i);
		}
		public List<FunctionParameterWithDefaultValueContext> functionParameterWithDefaultValue() {
			return getRuleContexts(FunctionParameterWithDefaultValueContext.class);
		}
		public FunctionParameterWithDefaultValueContext functionParameterWithDefaultValue(int i) {
			return getRuleContext(FunctionParameterWithDefaultValueContext.class,i);
		}
		public FunctionParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HachiListener ) ((HachiListener)listener).enterFunctionParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HachiListener ) ((HachiListener)listener).exitFunctionParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HachiVisitor ) return ((HachiVisitor<? extends T>)visitor).visitFunctionParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionParameterListContext functionParameterList() throws RecognitionException {
		FunctionParameterListContext _localctx = new FunctionParameterListContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_functionParameterList);
		int _la;
		try {
			setState(132);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(108);
				functionParameter();
				setState(113);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(109);
					match(T__5);
					setState(110);
					functionParameter();
					}
					}
					setState(115);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(116);
				functionParameter();
				setState(121);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(117);
					match(T__5);
					setState(118);
					functionParameterWithDefaultValue();
					}
					}
					setState(123);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(124);
				functionParameterWithDefaultValue();
				setState(129);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(125);
					match(T__5);
					setState(126);
					functionParameterWithDefaultValue();
					}
					}
					setState(131);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionParameterContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(HachiParser.ID, 0); }
		public FunctionParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HachiListener ) ((HachiListener)listener).enterFunctionParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HachiListener ) ((HachiListener)listener).exitFunctionParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HachiVisitor ) return ((HachiVisitor<? extends T>)visitor).visitFunctionParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionParameterContext functionParameter() throws RecognitionException {
		FunctionParameterContext _localctx = new FunctionParameterContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_functionParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			type();
			setState(135);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionParameterWithDefaultValueContext extends ParserRuleContext {
		public ExpressionContext defaultValue;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(HachiParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FunctionParameterWithDefaultValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionParameterWithDefaultValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HachiListener ) ((HachiListener)listener).enterFunctionParameterWithDefaultValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HachiListener ) ((HachiListener)listener).exitFunctionParameterWithDefaultValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HachiVisitor ) return ((HachiVisitor<? extends T>)visitor).visitFunctionParameterWithDefaultValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionParameterWithDefaultValueContext functionParameterWithDefaultValue() throws RecognitionException {
		FunctionParameterWithDefaultValueContext _localctx = new FunctionParameterWithDefaultValueContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_functionParameterWithDefaultValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			type();
			setState(138);
			match(ID);
			setState(139);
			match(EQUALS);
			setState(140);
			((FunctionParameterWithDefaultValueContext)_localctx).defaultValue = expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionBodyContext extends ParserRuleContext {
		public BlockStatementContext blockStatement() {
			return getRuleContext(BlockStatementContext.class,0);
		}
		public FunctionBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HachiListener ) ((HachiListener)listener).enterFunctionBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HachiListener ) ((HachiListener)listener).exitFunctionBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HachiVisitor ) return ((HachiVisitor<? extends T>)visitor).visitFunctionBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionBodyContext functionBody() throws RecognitionException {
		FunctionBodyContext _localctx = new FunctionBodyContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_functionBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			blockStatement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public ClassTypeContext classType() {
			return getRuleContext(ClassTypeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HachiListener ) ((HachiListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HachiListener ) ((HachiListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HachiVisitor ) return ((HachiVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_type);
		try {
			setState(146);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
			case T__9:
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case T__14:
			case T__15:
			case T__16:
			case T__17:
				enterOuterAlt(_localctx, 1);
				{
				setState(144);
				primitiveType();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(145);
				classType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimitiveTypeContext extends ParserRuleContext {
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HachiListener ) ((HachiListener)listener).enterPrimitiveType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HachiListener ) ((HachiListener)listener).exitPrimitiveType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HachiVisitor ) return ((HachiVisitor<? extends T>)visitor).visitPrimitiveType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_primitiveType);
		int _la;
		try {
			setState(228);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(148);
				match(T__6);
				setState(153);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(149);
					match(T__7);
					setState(150);
					match(T__8);
					}
					}
					setState(155);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				setState(156);
				match(T__9);
				setState(161);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(157);
					match(T__7);
					setState(158);
					match(T__8);
					}
					}
					setState(163);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 3);
				{
				setState(164);
				match(T__10);
				setState(169);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(165);
					match(T__7);
					setState(166);
					match(T__8);
					}
					}
					setState(171);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 4);
				{
				setState(172);
				match(T__11);
				setState(177);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(173);
					match(T__7);
					setState(174);
					match(T__8);
					}
					}
					setState(179);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 5);
				{
				setState(180);
				match(T__12);
				setState(185);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(181);
					match(T__7);
					setState(182);
					match(T__8);
					}
					}
					setState(187);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 6);
				{
				setState(188);
				match(T__13);
				setState(193);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(189);
					match(T__7);
					setState(190);
					match(T__8);
					}
					}
					setState(195);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 7);
				{
				setState(196);
				match(T__14);
				setState(201);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(197);
					match(T__7);
					setState(198);
					match(T__8);
					}
					}
					setState(203);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 8);
				{
				setState(204);
				match(T__15);
				setState(209);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(205);
					match(T__7);
					setState(206);
					match(T__8);
					}
					}
					setState(211);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 9);
				{
				setState(212);
				match(T__16);
				setState(217);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(213);
					match(T__7);
					setState(214);
					match(T__8);
					}
					}
					setState(219);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 10);
				{
				setState(220);
				match(T__17);
				setState(225);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(221);
					match(T__7);
					setState(222);
					match(T__8);
					}
					}
					setState(227);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassTypeContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public ClassTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HachiListener ) ((HachiListener)listener).enterClassType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HachiListener ) ((HachiListener)listener).exitClassType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HachiVisitor ) return ((HachiVisitor<? extends T>)visitor).visitClassType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassTypeContext classType() throws RecognitionException {
		ClassTypeContext _localctx = new ClassTypeContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_classType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			qualifiedName();
			setState(235);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(231);
				match(T__7);
				setState(232);
				match(T__8);
				}
				}
				setState(237);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public BlockStatementContext blockStatement() {
			return getRuleContext(BlockStatementContext.class,0);
		}
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public PrintStatementContext printStatement() {
			return getRuleContext(PrintStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HachiListener ) ((HachiListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HachiListener ) ((HachiListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HachiVisitor ) return ((HachiVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_statement);
		try {
			setState(246);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(238);
				blockStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(239);
				variableDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(240);
				assignment();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(241);
				printStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(242);
				forStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(243);
				returnStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(244);
				ifStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(245);
				expression(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockStatementContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HachiListener ) ((HachiListener)listener).enterBlockStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HachiListener ) ((HachiListener)listener).exitBlockStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HachiVisitor ) return ((HachiVisitor<? extends T>)visitor).visitBlockStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockStatementContext blockStatement() throws RecognitionException {
		BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_blockStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			match(T__1);
			setState(252);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__3) | (1L << T__18) | (1L << T__21) | (1L << T__22) | (1L << T__26) | (1L << T__27) | (1L << VARIABLE) | (1L << PRINT) | (1L << NUMBER) | (1L << STRING) | (1L << BOOLEAN) | (1L << ID))) != 0)) {
				{
				{
				setState(249);
				statement();
				}
				}
				setState(254);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(255);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclarationContext extends ParserRuleContext {
		public TerminalNode VARIABLE() { return getToken(HachiParser.VARIABLE, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode EQUALS() { return getToken(HachiParser.EQUALS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HachiListener ) ((HachiListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HachiListener ) ((HachiListener)listener).exitVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HachiVisitor ) return ((HachiVisitor<? extends T>)visitor).visitVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_variableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			match(VARIABLE);
			setState(258);
			name();
			setState(259);
			match(EQUALS);
			setState(260);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode EQUALS() { return getToken(HachiParser.EQUALS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HachiListener ) ((HachiListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HachiListener ) ((HachiListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HachiVisitor ) return ((HachiVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			name();
			setState(263);
			match(EQUALS);
			setState(264);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrintStatementContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(HachiParser.PRINT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PrintStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HachiListener ) ((HachiListener)listener).enterPrintStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HachiListener ) ((HachiListener)listener).exitPrintStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HachiVisitor ) return ((HachiVisitor<? extends T>)visitor).visitPrintStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintStatementContext printStatement() throws RecognitionException {
		PrintStatementContext _localctx = new PrintStatementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_printStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			match(PRINT);
			setState(267);
			match(T__3);
			setState(268);
			expression(0);
			setState(269);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForStatementContext extends ParserRuleContext {
		public ForConditionContext forCondition() {
			return getRuleContext(ForConditionContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HachiListener ) ((HachiListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HachiListener ) ((HachiListener)listener).exitForStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HachiVisitor ) return ((HachiVisitor<? extends T>)visitor).visitForStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_forStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			match(T__18);
			setState(273);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(272);
				match(T__3);
				}
			}

			setState(275);
			forCondition();
			setState(277);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(276);
				match(T__4);
				}
			}

			setState(279);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForConditionContext extends ParserRuleContext {
		public VariableReferenceContext iterator;
		public ExpressionContext startExpression;
		public Token range;
		public ExpressionContext endExpression;
		public VariableReferenceContext variableReference() {
			return getRuleContext(VariableReferenceContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ForConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HachiListener ) ((HachiListener)listener).enterForCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HachiListener ) ((HachiListener)listener).exitForCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HachiVisitor ) return ((HachiVisitor<? extends T>)visitor).visitForCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForConditionContext forCondition() throws RecognitionException {
		ForConditionContext _localctx = new ForConditionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_forCondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			((ForConditionContext)_localctx).iterator = variableReference();
			setState(282);
			match(T__19);
			setState(283);
			((ForConditionContext)_localctx).startExpression = expression(0);
			setState(284);
			((ForConditionContext)_localctx).range = match(T__20);
			setState(285);
			((ForConditionContext)_localctx).endExpression = expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnStatementContext extends ParserRuleContext {
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
	 
		public ReturnStatementContext() { }
		public void copyFrom(ReturnStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ReturnVoidContext extends ReturnStatementContext {
		public ReturnVoidContext(ReturnStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HachiListener ) ((HachiListener)listener).enterReturnVoid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HachiListener ) ((HachiListener)listener).exitReturnVoid(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HachiVisitor ) return ((HachiVisitor<? extends T>)visitor).visitReturnVoid(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReturnWithValueContext extends ReturnStatementContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnWithValueContext(ReturnStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HachiListener ) ((HachiListener)listener).enterReturnWithValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HachiListener ) ((HachiListener)listener).exitReturnWithValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HachiVisitor ) return ((HachiVisitor<? extends T>)visitor).visitReturnWithValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_returnStatement);
		try {
			setState(290);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				_localctx = new ReturnWithValueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(287);
				match(T__21);
				setState(288);
				expression(0);
				}
				break;
			case 2:
				_localctx = new ReturnVoidContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(289);
				match(T__21);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfStatementContext extends ParserRuleContext {
		public StatementContext trueStatement;
		public StatementContext falseStatement;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HachiListener ) ((HachiListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HachiListener ) ((HachiListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HachiVisitor ) return ((HachiVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			match(T__22);
			setState(294);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(293);
				match(T__3);
				}
				break;
			}
			setState(296);
			expression(0);
			setState(298);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(297);
				match(T__4);
				}
			}

			setState(300);
			((IfStatementContext)_localctx).trueStatement = statement();
			setState(303);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(301);
				match(T__23);
				setState(302);
				((IfStatementContext)_localctx).falseStatement = statement();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(HachiParser.ID, 0); }
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HachiListener ) ((HachiListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HachiListener ) ((HachiListener)listener).exitName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HachiVisitor ) return ((HachiVisitor<? extends T>)visitor).visitName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionArgumentContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FunctionArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HachiListener ) ((HachiListener)listener).enterFunctionArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HachiListener ) ((HachiListener)listener).exitFunctionArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HachiVisitor ) return ((HachiVisitor<? extends T>)visitor).visitFunctionArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionArgumentContext functionArgument() throws RecognitionException {
		FunctionArgumentContext _localctx = new FunctionArgumentContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_functionArgument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionArgumentListContext extends ParserRuleContext {
		public FunctionArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionArgumentList; }
	 
		public FunctionArgumentListContext() { }
		public void copyFrom(FunctionArgumentListContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NamedFunctionArgumentListContext extends FunctionArgumentListContext {
		public List<NamedFunctionArgumentContext> namedFunctionArgument() {
			return getRuleContexts(NamedFunctionArgumentContext.class);
		}
		public NamedFunctionArgumentContext namedFunctionArgument(int i) {
			return getRuleContext(NamedFunctionArgumentContext.class,i);
		}
		public NamedFunctionArgumentListContext(FunctionArgumentListContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HachiListener ) ((HachiListener)listener).enterNamedFunctionArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HachiListener ) ((HachiListener)listener).exitNamedFunctionArgumentList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HachiVisitor ) return ((HachiVisitor<? extends T>)visitor).visitNamedFunctionArgumentList(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnnamedFunctionArgumentListContext extends FunctionArgumentListContext {
		public List<FunctionArgumentContext> functionArgument() {
			return getRuleContexts(FunctionArgumentContext.class);
		}
		public FunctionArgumentContext functionArgument(int i) {
			return getRuleContext(FunctionArgumentContext.class,i);
		}
		public UnnamedFunctionArgumentListContext(FunctionArgumentListContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HachiListener ) ((HachiListener)listener).enterUnnamedFunctionArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HachiListener ) ((HachiListener)listener).exitUnnamedFunctionArgumentList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HachiVisitor ) return ((HachiVisitor<? extends T>)visitor).visitUnnamedFunctionArgumentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionArgumentListContext functionArgumentList() throws RecognitionException {
		FunctionArgumentListContext _localctx = new FunctionArgumentListContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_functionArgumentList);
		int _la;
		try {
			setState(329);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				_localctx = new UnnamedFunctionArgumentListContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(310);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__26) | (1L << T__27) | (1L << NUMBER) | (1L << STRING) | (1L << BOOLEAN) | (1L << ID))) != 0)) {
					{
					setState(309);
					functionArgument();
					}
				}

				setState(316);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(312);
					match(T__5);
					setState(313);
					functionArgument();
					}
					}
					setState(318);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				_localctx = new NamedFunctionArgumentListContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(320);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(319);
					namedFunctionArgument();
					}
				}

				setState(326);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(322);
					match(T__5);
					setState(323);
					namedFunctionArgument();
					}
					}
					setState(328);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NamedFunctionArgumentContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NamedFunctionArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedFunctionArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HachiListener ) ((HachiListener)listener).enterNamedFunctionArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HachiListener ) ((HachiListener)listener).exitNamedFunctionArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HachiVisitor ) return ((HachiVisitor<? extends T>)visitor).visitNamedFunctionArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamedFunctionArgumentContext namedFunctionArgument() throws RecognitionException {
		NamedFunctionArgumentContext _localctx = new NamedFunctionArgumentContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_namedFunctionArgument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(331);
			name();
			setState(332);
			match(T__24);
			setState(333);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AddContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public AddContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HachiListener ) ((HachiListener)listener).enterAdd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HachiListener ) ((HachiListener)listener).exitAdd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HachiVisitor ) return ((HachiVisitor<? extends T>)visitor).visitAdd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VariableReferenceLabelContext extends ExpressionContext {
		public VariableReferenceContext variableReference() {
			return getRuleContext(VariableReferenceContext.class,0);
		}
		public VariableReferenceLabelContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HachiListener ) ((HachiListener)listener).enterVariableReferenceLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HachiListener ) ((HachiListener)listener).exitVariableReferenceLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HachiVisitor ) return ((HachiVisitor<? extends T>)visitor).visitVariableReferenceLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ValueLabelContext extends ExpressionContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ValueLabelContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HachiListener ) ((HachiListener)listener).enterValueLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HachiListener ) ((HachiListener)listener).exitValueLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HachiVisitor ) return ((HachiVisitor<? extends T>)visitor).visitValueLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SupercallContext extends ExpressionContext {
		public Token superCall;
		public FunctionArgumentListContext functionArgumentList() {
			return getRuleContext(FunctionArgumentListContext.class,0);
		}
		public SupercallContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HachiListener ) ((HachiListener)listener).enterSupercall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HachiListener ) ((HachiListener)listener).exitSupercall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HachiVisitor ) return ((HachiVisitor<? extends T>)visitor).visitSupercall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConditionalExpressionContext extends ExpressionContext {
		public Token cmp;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ConditionalExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HachiListener ) ((HachiListener)listener).enterConditionalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HachiListener ) ((HachiListener)listener).exitConditionalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HachiVisitor ) return ((HachiVisitor<? extends T>)visitor).visitConditionalExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunctionCallContext extends ExpressionContext {
		public ExpressionContext owner;
		public FunctionNameContext functionName() {
			return getRuleContext(FunctionNameContext.class,0);
		}
		public FunctionArgumentListContext functionArgumentList() {
			return getRuleContext(FunctionArgumentListContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FunctionCallContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HachiListener ) ((HachiListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HachiListener ) ((HachiListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HachiVisitor ) return ((HachiVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubtractContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public SubtractContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HachiListener ) ((HachiListener)listener).enterSubtract(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HachiListener ) ((HachiListener)listener).exitSubtract(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HachiVisitor ) return ((HachiVisitor<? extends T>)visitor).visitSubtract(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConstructorCallContext extends ExpressionContext {
		public Token newCall;
		public ClassNameContext className() {
			return getRuleContext(ClassNameContext.class,0);
		}
		public FunctionArgumentListContext functionArgumentList() {
			return getRuleContext(FunctionArgumentListContext.class,0);
		}
		public ConstructorCallContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HachiListener ) ((HachiListener)listener).enterConstructorCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HachiListener ) ((HachiListener)listener).exitConstructorCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HachiVisitor ) return ((HachiVisitor<? extends T>)visitor).visitConstructorCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DivideContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public DivideContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HachiListener ) ((HachiListener)listener).enterDivide(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HachiListener ) ((HachiListener)listener).exitDivide(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HachiVisitor ) return ((HachiVisitor<? extends T>)visitor).visitDivide(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultiplyContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public MultiplyContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HachiListener ) ((HachiListener)listener).enterMultiply(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HachiListener ) ((HachiListener)listener).exitMultiply(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HachiVisitor ) return ((HachiVisitor<? extends T>)visitor).visitMultiply(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 56;
		enterRecursionRule(_localctx, 56, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(378);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				_localctx = new VariableReferenceLabelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(336);
				variableReference();
				}
				break;
			case 2:
				{
				_localctx = new FunctionCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(337);
				functionName();
				setState(338);
				match(T__3);
				setState(339);
				functionArgumentList();
				setState(340);
				match(T__4);
				}
				break;
			case 3:
				{
				_localctx = new SupercallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(342);
				((SupercallContext)_localctx).superCall = match(T__26);
				setState(343);
				match(T__3);
				setState(344);
				functionArgumentList();
				setState(345);
				match(T__4);
				}
				break;
			case 4:
				{
				_localctx = new ConstructorCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(347);
				((ConstructorCallContext)_localctx).newCall = match(T__27);
				setState(348);
				className();
				setState(349);
				match(T__3);
				setState(350);
				functionArgumentList();
				setState(351);
				match(T__4);
				}
				break;
			case 5:
				{
				_localctx = new ValueLabelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(353);
				value();
				}
				break;
			case 6:
				{
				_localctx = new MultiplyContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(354);
				match(T__3);
				setState(355);
				expression(0);
				setState(356);
				match(T__28);
				setState(357);
				expression(0);
				setState(358);
				match(T__4);
				}
				break;
			case 7:
				{
				_localctx = new DivideContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(360);
				match(T__3);
				setState(361);
				expression(0);
				setState(362);
				match(T__29);
				setState(363);
				expression(0);
				setState(364);
				match(T__4);
				}
				break;
			case 8:
				{
				_localctx = new AddContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(366);
				match(T__3);
				setState(367);
				expression(0);
				setState(368);
				match(T__30);
				setState(369);
				expression(0);
				setState(370);
				match(T__4);
				}
				break;
			case 9:
				{
				_localctx = new SubtractContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(372);
				match(T__3);
				setState(373);
				expression(0);
				setState(374);
				match(T__31);
				setState(375);
				expression(0);
				setState(376);
				match(T__4);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(419);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(417);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplyContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(380);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(381);
						match(T__28);
						setState(382);
						expression(14);
						}
						break;
					case 2:
						{
						_localctx = new DivideContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(383);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(384);
						match(T__29);
						setState(385);
						expression(12);
						}
						break;
					case 3:
						{
						_localctx = new AddContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(386);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(387);
						match(T__30);
						setState(388);
						expression(10);
						}
						break;
					case 4:
						{
						_localctx = new SubtractContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(389);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(390);
						match(T__31);
						setState(391);
						expression(8);
						}
						break;
					case 5:
						{
						_localctx = new ConditionalExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(392);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(393);
						((ConditionalExpressionContext)_localctx).cmp = match(T__32);
						setState(394);
						expression(7);
						}
						break;
					case 6:
						{
						_localctx = new ConditionalExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(395);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(396);
						((ConditionalExpressionContext)_localctx).cmp = match(T__33);
						setState(397);
						expression(6);
						}
						break;
					case 7:
						{
						_localctx = new ConditionalExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(398);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(399);
						((ConditionalExpressionContext)_localctx).cmp = match(T__34);
						setState(400);
						expression(5);
						}
						break;
					case 8:
						{
						_localctx = new ConditionalExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(401);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(402);
						((ConditionalExpressionContext)_localctx).cmp = match(T__35);
						setState(403);
						expression(4);
						}
						break;
					case 9:
						{
						_localctx = new ConditionalExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(404);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(405);
						((ConditionalExpressionContext)_localctx).cmp = match(T__36);
						setState(406);
						expression(3);
						}
						break;
					case 10:
						{
						_localctx = new ConditionalExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(407);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(408);
						((ConditionalExpressionContext)_localctx).cmp = match(T__37);
						setState(409);
						expression(2);
						}
						break;
					case 11:
						{
						_localctx = new FunctionCallContext(new ExpressionContext(_parentctx, _parentState));
						((FunctionCallContext)_localctx).owner = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(410);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(411);
						match(T__25);
						setState(412);
						functionName();
						setState(413);
						match(T__3);
						setState(414);
						functionArgumentList();
						setState(415);
						match(T__4);
						}
						break;
					}
					} 
				}
				setState(421);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class VariableReferenceContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(HachiParser.ID, 0); }
		public VariableReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableReference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HachiListener ) ((HachiListener)listener).enterVariableReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HachiListener ) ((HachiListener)listener).exitVariableReference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HachiVisitor ) return ((HachiVisitor<? extends T>)visitor).visitVariableReference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableReferenceContext variableReference() throws RecognitionException {
		VariableReferenceContext _localctx = new VariableReferenceContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_variableReference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(422);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValueContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(HachiParser.NUMBER, 0); }
		public TerminalNode STRING() { return getToken(HachiParser.STRING, 0); }
		public TerminalNode BOOLEAN() { return getToken(HachiParser.BOOLEAN, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HachiListener ) ((HachiListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HachiListener ) ((HachiListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HachiVisitor ) return ((HachiVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(424);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMBER) | (1L << STRING) | (1L << BOOLEAN))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QualifiedNameContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(HachiParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(HachiParser.ID, i);
		}
		public QualifiedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HachiListener ) ((HachiListener)listener).enterQualifiedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HachiListener ) ((HachiListener)listener).exitQualifiedName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HachiVisitor ) return ((HachiVisitor<? extends T>)visitor).visitQualifiedName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedNameContext qualifiedName() throws RecognitionException {
		QualifiedNameContext _localctx = new QualifiedNameContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_qualifiedName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(426);
			match(ID);
			setState(431);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__25) {
				{
				{
				setState(427);
				match(T__25);
				setState(428);
				match(ID);
				}
				}
				setState(433);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 28:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 13);
		case 1:
			return precpred(_ctx, 11);
		case 2:
			return precpred(_ctx, 9);
		case 3:
			return precpred(_ctx, 7);
		case 4:
			return precpred(_ctx, 6);
		case 5:
			return precpred(_ctx, 5);
		case 6:
			return precpred(_ctx, 4);
		case 7:
			return precpred(_ctx, 3);
		case 8:
			return precpred(_ctx, 2);
		case 9:
			return precpred(_ctx, 1);
		case 10:
			return precpred(_ctx, 19);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\60\u01b5\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\7\5O\n\5\f\5\16\5"+
		"R\13\5\3\5\7\5U\n\5\f\5\16\5X\13\5\3\6\3\6\3\6\3\7\3\7\3\7\3\b\5\ba\n"+
		"\b\3\b\3\b\5\be\n\b\3\b\5\bh\n\b\3\b\5\bk\n\b\3\t\3\t\3\n\3\n\3\n\7\n"+
		"r\n\n\f\n\16\nu\13\n\3\n\3\n\3\n\7\nz\n\n\f\n\16\n}\13\n\3\n\3\n\3\n\7"+
		"\n\u0082\n\n\f\n\16\n\u0085\13\n\5\n\u0087\n\n\3\13\3\13\3\13\3\f\3\f"+
		"\3\f\3\f\3\f\3\r\3\r\3\16\3\16\5\16\u0095\n\16\3\17\3\17\3\17\7\17\u009a"+
		"\n\17\f\17\16\17\u009d\13\17\3\17\3\17\3\17\7\17\u00a2\n\17\f\17\16\17"+
		"\u00a5\13\17\3\17\3\17\3\17\7\17\u00aa\n\17\f\17\16\17\u00ad\13\17\3\17"+
		"\3\17\3\17\7\17\u00b2\n\17\f\17\16\17\u00b5\13\17\3\17\3\17\3\17\7\17"+
		"\u00ba\n\17\f\17\16\17\u00bd\13\17\3\17\3\17\3\17\7\17\u00c2\n\17\f\17"+
		"\16\17\u00c5\13\17\3\17\3\17\3\17\7\17\u00ca\n\17\f\17\16\17\u00cd\13"+
		"\17\3\17\3\17\3\17\7\17\u00d2\n\17\f\17\16\17\u00d5\13\17\3\17\3\17\3"+
		"\17\7\17\u00da\n\17\f\17\16\17\u00dd\13\17\3\17\3\17\3\17\7\17\u00e2\n"+
		"\17\f\17\16\17\u00e5\13\17\5\17\u00e7\n\17\3\20\3\20\3\20\7\20\u00ec\n"+
		"\20\f\20\16\20\u00ef\13\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21"+
		"\u00f9\n\21\3\22\3\22\7\22\u00fd\n\22\f\22\16\22\u0100\13\22\3\22\3\22"+
		"\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25"+
		"\3\26\3\26\5\26\u0114\n\26\3\26\3\26\5\26\u0118\n\26\3\26\3\26\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\5\30\u0125\n\30\3\31\3\31\5\31"+
		"\u0129\n\31\3\31\3\31\5\31\u012d\n\31\3\31\3\31\3\31\5\31\u0132\n\31\3"+
		"\32\3\32\3\33\3\33\3\34\5\34\u0139\n\34\3\34\3\34\7\34\u013d\n\34\f\34"+
		"\16\34\u0140\13\34\3\34\5\34\u0143\n\34\3\34\3\34\7\34\u0147\n\34\f\34"+
		"\16\34\u014a\13\34\5\34\u014c\n\34\3\35\3\35\3\35\3\35\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u017d"+
		"\n\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\7\36\u01a4\n\36\f\36"+
		"\16\36\u01a7\13\36\3\37\3\37\3 \3 \3!\3!\3!\7!\u01b0\n!\f!\16!\u01b3\13"+
		"!\3!\2\3:\"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\66"+
		"8:<>@\2\3\3\2,.\2\u01db\2B\3\2\2\2\4E\3\2\2\2\6K\3\2\2\2\bP\3\2\2\2\n"+
		"Y\3\2\2\2\f\\\3\2\2\2\16`\3\2\2\2\20l\3\2\2\2\22\u0086\3\2\2\2\24\u0088"+
		"\3\2\2\2\26\u008b\3\2\2\2\30\u0090\3\2\2\2\32\u0094\3\2\2\2\34\u00e6\3"+
		"\2\2\2\36\u00e8\3\2\2\2 \u00f8\3\2\2\2\"\u00fa\3\2\2\2$\u0103\3\2\2\2"+
		"&\u0108\3\2\2\2(\u010c\3\2\2\2*\u0111\3\2\2\2,\u011b\3\2\2\2.\u0124\3"+
		"\2\2\2\60\u0126\3\2\2\2\62\u0133\3\2\2\2\64\u0135\3\2\2\2\66\u014b\3\2"+
		"\2\28\u014d\3\2\2\2:\u017c\3\2\2\2<\u01a8\3\2\2\2>\u01aa\3\2\2\2@\u01ac"+
		"\3\2\2\2BC\5\4\3\2CD\7\2\2\3D\3\3\2\2\2EF\7\3\2\2FG\5\6\4\2GH\7\4\2\2"+
		"HI\5\b\5\2IJ\7\5\2\2J\5\3\2\2\2KL\5@!\2L\7\3\2\2\2MO\5\n\6\2NM\3\2\2\2"+
		"OR\3\2\2\2PN\3\2\2\2PQ\3\2\2\2QV\3\2\2\2RP\3\2\2\2SU\5\f\7\2TS\3\2\2\2"+
		"UX\3\2\2\2VT\3\2\2\2VW\3\2\2\2W\t\3\2\2\2XV\3\2\2\2YZ\5\32\16\2Z[\5\62"+
		"\32\2[\13\3\2\2\2\\]\5\16\b\2]^\5\30\r\2^\r\3\2\2\2_a\5\32\16\2`_\3\2"+
		"\2\2`a\3\2\2\2ab\3\2\2\2bd\5\20\t\2ce\7\6\2\2dc\3\2\2\2de\3\2\2\2eg\3"+
		"\2\2\2fh\5\22\n\2gf\3\2\2\2gh\3\2\2\2hj\3\2\2\2ik\7\7\2\2ji\3\2\2\2jk"+
		"\3\2\2\2k\17\3\2\2\2lm\7/\2\2m\21\3\2\2\2ns\5\24\13\2op\7\b\2\2pr\5\24"+
		"\13\2qo\3\2\2\2ru\3\2\2\2sq\3\2\2\2st\3\2\2\2t\u0087\3\2\2\2us\3\2\2\2"+
		"v{\5\24\13\2wx\7\b\2\2xz\5\26\f\2yw\3\2\2\2z}\3\2\2\2{y\3\2\2\2{|\3\2"+
		"\2\2|\u0087\3\2\2\2}{\3\2\2\2~\u0083\5\26\f\2\177\u0080\7\b\2\2\u0080"+
		"\u0082\5\26\f\2\u0081\177\3\2\2\2\u0082\u0085\3\2\2\2\u0083\u0081\3\2"+
		"\2\2\u0083\u0084\3\2\2\2\u0084\u0087\3\2\2\2\u0085\u0083\3\2\2\2\u0086"+
		"n\3\2\2\2\u0086v\3\2\2\2\u0086~\3\2\2\2\u0087\23\3\2\2\2\u0088\u0089\5"+
		"\32\16\2\u0089\u008a\7/\2\2\u008a\25\3\2\2\2\u008b\u008c\5\32\16\2\u008c"+
		"\u008d\7/\2\2\u008d\u008e\7+\2\2\u008e\u008f\5:\36\2\u008f\27\3\2\2\2"+
		"\u0090\u0091\5\"\22\2\u0091\31\3\2\2\2\u0092\u0095\5\34\17\2\u0093\u0095"+
		"\5\36\20\2\u0094\u0092\3\2\2\2\u0094\u0093\3\2\2\2\u0095\33\3\2\2\2\u0096"+
		"\u009b\7\t\2\2\u0097\u0098\7\n\2\2\u0098\u009a\7\13\2\2\u0099\u0097\3"+
		"\2\2\2\u009a\u009d\3\2\2\2\u009b\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c"+
		"\u00e7\3\2\2\2\u009d\u009b\3\2\2\2\u009e\u00a3\7\f\2\2\u009f\u00a0\7\n"+
		"\2\2\u00a0\u00a2\7\13\2\2\u00a1\u009f\3\2\2\2\u00a2\u00a5\3\2\2\2\u00a3"+
		"\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00e7\3\2\2\2\u00a5\u00a3\3\2"+
		"\2\2\u00a6\u00ab\7\r\2\2\u00a7\u00a8\7\n\2\2\u00a8\u00aa\7\13\2\2\u00a9"+
		"\u00a7\3\2\2\2\u00aa\u00ad\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3\2"+
		"\2\2\u00ac\u00e7\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ae\u00b3\7\16\2\2\u00af"+
		"\u00b0\7\n\2\2\u00b0\u00b2\7\13\2\2\u00b1\u00af\3\2\2\2\u00b2\u00b5\3"+
		"\2\2\2\u00b3\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00e7\3\2\2\2\u00b5"+
		"\u00b3\3\2\2\2\u00b6\u00bb\7\17\2\2\u00b7\u00b8\7\n\2\2\u00b8\u00ba\7"+
		"\13\2\2\u00b9\u00b7\3\2\2\2\u00ba\u00bd\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb"+
		"\u00bc\3\2\2\2\u00bc\u00e7\3\2\2\2\u00bd\u00bb\3\2\2\2\u00be\u00c3\7\20"+
		"\2\2\u00bf\u00c0\7\n\2\2\u00c0\u00c2\7\13\2\2\u00c1\u00bf\3\2\2\2\u00c2"+
		"\u00c5\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00e7\3\2"+
		"\2\2\u00c5\u00c3\3\2\2\2\u00c6\u00cb\7\21\2\2\u00c7\u00c8\7\n\2\2\u00c8"+
		"\u00ca\7\13\2\2\u00c9\u00c7\3\2\2\2\u00ca\u00cd\3\2\2\2\u00cb\u00c9\3"+
		"\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00e7\3\2\2\2\u00cd\u00cb\3\2\2\2\u00ce"+
		"\u00d3\7\22\2\2\u00cf\u00d0\7\n\2\2\u00d0\u00d2\7\13\2\2\u00d1\u00cf\3"+
		"\2\2\2\u00d2\u00d5\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4"+
		"\u00e7\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d6\u00db\7\23\2\2\u00d7\u00d8\7"+
		"\n\2\2\u00d8\u00da\7\13\2\2\u00d9\u00d7\3\2\2\2\u00da\u00dd\3\2\2\2\u00db"+
		"\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00e7\3\2\2\2\u00dd\u00db\3\2"+
		"\2\2\u00de\u00e3\7\24\2\2\u00df\u00e0\7\n\2\2\u00e0\u00e2\7\13\2\2\u00e1"+
		"\u00df\3\2\2\2\u00e2\u00e5\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e3\u00e4\3\2"+
		"\2\2\u00e4\u00e7\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e6\u0096\3\2\2\2\u00e6"+
		"\u009e\3\2\2\2\u00e6\u00a6\3\2\2\2\u00e6\u00ae\3\2\2\2\u00e6\u00b6\3\2"+
		"\2\2\u00e6\u00be\3\2\2\2\u00e6\u00c6\3\2\2\2\u00e6\u00ce\3\2\2\2\u00e6"+
		"\u00d6\3\2\2\2\u00e6\u00de\3\2\2\2\u00e7\35\3\2\2\2\u00e8\u00ed\5@!\2"+
		"\u00e9\u00ea\7\n\2\2\u00ea\u00ec\7\13\2\2\u00eb\u00e9\3\2\2\2\u00ec\u00ef"+
		"\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\37\3\2\2\2\u00ef"+
		"\u00ed\3\2\2\2\u00f0\u00f9\5\"\22\2\u00f1\u00f9\5$\23\2\u00f2\u00f9\5"+
		"&\24\2\u00f3\u00f9\5(\25\2\u00f4\u00f9\5*\26\2\u00f5\u00f9\5.\30\2\u00f6"+
		"\u00f9\5\60\31\2\u00f7\u00f9\5:\36\2\u00f8\u00f0\3\2\2\2\u00f8\u00f1\3"+
		"\2\2\2\u00f8\u00f2\3\2\2\2\u00f8\u00f3\3\2\2\2\u00f8\u00f4\3\2\2\2\u00f8"+
		"\u00f5\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f8\u00f7\3\2\2\2\u00f9!\3\2\2\2"+
		"\u00fa\u00fe\7\4\2\2\u00fb\u00fd\5 \21\2\u00fc\u00fb\3\2\2\2\u00fd\u0100"+
		"\3\2\2\2\u00fe\u00fc\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u0101\3\2\2\2\u0100"+
		"\u00fe\3\2\2\2\u0101\u0102\7\5\2\2\u0102#\3\2\2\2\u0103\u0104\7)\2\2\u0104"+
		"\u0105\5\62\32\2\u0105\u0106\7+\2\2\u0106\u0107\5:\36\2\u0107%\3\2\2\2"+
		"\u0108\u0109\5\62\32\2\u0109\u010a\7+\2\2\u010a\u010b\5:\36\2\u010b\'"+
		"\3\2\2\2\u010c\u010d\7*\2\2\u010d\u010e\7\6\2\2\u010e\u010f\5:\36\2\u010f"+
		"\u0110\7\7\2\2\u0110)\3\2\2\2\u0111\u0113\7\25\2\2\u0112\u0114\7\6\2\2"+
		"\u0113\u0112\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u0117"+
		"\5,\27\2\u0116\u0118\7\7\2\2\u0117\u0116\3\2\2\2\u0117\u0118\3\2\2\2\u0118"+
		"\u0119\3\2\2\2\u0119\u011a\5 \21\2\u011a+\3\2\2\2\u011b\u011c\5<\37\2"+
		"\u011c\u011d\7\26\2\2\u011d\u011e\5:\36\2\u011e\u011f\7\27\2\2\u011f\u0120"+
		"\5:\36\2\u0120-\3\2\2\2\u0121\u0122\7\30\2\2\u0122\u0125\5:\36\2\u0123"+
		"\u0125\7\30\2\2\u0124\u0121\3\2\2\2\u0124\u0123\3\2\2\2\u0125/\3\2\2\2"+
		"\u0126\u0128\7\31\2\2\u0127\u0129\7\6\2\2\u0128\u0127\3\2\2\2\u0128\u0129"+
		"\3\2\2\2\u0129\u012a\3\2\2\2\u012a\u012c\5:\36\2\u012b\u012d\7\7\2\2\u012c"+
		"\u012b\3\2\2\2\u012c\u012d\3\2\2\2\u012d\u012e\3\2\2\2\u012e\u0131\5 "+
		"\21\2\u012f\u0130\7\32\2\2\u0130\u0132\5 \21\2\u0131\u012f\3\2\2\2\u0131"+
		"\u0132\3\2\2\2\u0132\61\3\2\2\2\u0133\u0134\7/\2\2\u0134\63\3\2\2\2\u0135"+
		"\u0136\5:\36\2\u0136\65\3\2\2\2\u0137\u0139\5\64\33\2\u0138\u0137\3\2"+
		"\2\2\u0138\u0139\3\2\2\2\u0139\u013e\3\2\2\2\u013a\u013b\7\b\2\2\u013b"+
		"\u013d\5\64\33\2\u013c\u013a\3\2\2\2\u013d\u0140\3\2\2\2\u013e\u013c\3"+
		"\2\2\2\u013e\u013f\3\2\2\2\u013f\u014c\3\2\2\2\u0140\u013e\3\2\2\2\u0141"+
		"\u0143\58\35\2\u0142\u0141\3\2\2\2\u0142\u0143\3\2\2\2\u0143\u0148\3\2"+
		"\2\2\u0144\u0145\7\b\2\2\u0145\u0147\58\35\2\u0146\u0144\3\2\2\2\u0147"+
		"\u014a\3\2\2\2\u0148\u0146\3\2\2\2\u0148\u0149\3\2\2\2\u0149\u014c\3\2"+
		"\2\2\u014a\u0148\3\2\2\2\u014b\u0138\3\2\2\2\u014b\u0142\3\2\2\2\u014c"+
		"\67\3\2\2\2\u014d\u014e\5\62\32\2\u014e\u014f\7\33\2\2\u014f\u0150\5:"+
		"\36\2\u01509\3\2\2\2\u0151\u0152\b\36\1\2\u0152\u017d\5<\37\2\u0153\u0154"+
		"\5\20\t\2\u0154\u0155\7\6\2\2\u0155\u0156\5\66\34\2\u0156\u0157\7\7\2"+
		"\2\u0157\u017d\3\2\2\2\u0158\u0159\7\35\2\2\u0159\u015a\7\6\2\2\u015a"+
		"\u015b\5\66\34\2\u015b\u015c\7\7\2\2\u015c\u017d\3\2\2\2\u015d\u015e\7"+
		"\36\2\2\u015e\u015f\5\6\4\2\u015f\u0160\7\6\2\2\u0160\u0161\5\66\34\2"+
		"\u0161\u0162\7\7\2\2\u0162\u017d\3\2\2\2\u0163\u017d\5> \2\u0164\u0165"+
		"\7\6\2\2\u0165\u0166\5:\36\2\u0166\u0167\7\37\2\2\u0167\u0168\5:\36\2"+
		"\u0168\u0169\7\7\2\2\u0169\u017d\3\2\2\2\u016a\u016b\7\6\2\2\u016b\u016c"+
		"\5:\36\2\u016c\u016d\7 \2\2\u016d\u016e\5:\36\2\u016e\u016f\7\7\2\2\u016f"+
		"\u017d\3\2\2\2\u0170\u0171\7\6\2\2\u0171\u0172\5:\36\2\u0172\u0173\7!"+
		"\2\2\u0173\u0174\5:\36\2\u0174\u0175\7\7\2\2\u0175\u017d\3\2\2\2\u0176"+
		"\u0177\7\6\2\2\u0177\u0178\5:\36\2\u0178\u0179\7\"\2\2\u0179\u017a\5:"+
		"\36\2\u017a\u017b\7\7\2\2\u017b\u017d\3\2\2\2\u017c\u0151\3\2\2\2\u017c"+
		"\u0153\3\2\2\2\u017c\u0158\3\2\2\2\u017c\u015d\3\2\2\2\u017c\u0163\3\2"+
		"\2\2\u017c\u0164\3\2\2\2\u017c\u016a\3\2\2\2\u017c\u0170\3\2\2\2\u017c"+
		"\u0176\3\2\2\2\u017d\u01a5\3\2\2\2\u017e\u017f\f\17\2\2\u017f\u0180\7"+
		"\37\2\2\u0180\u01a4\5:\36\20\u0181\u0182\f\r\2\2\u0182\u0183\7 \2\2\u0183"+
		"\u01a4\5:\36\16\u0184\u0185\f\13\2\2\u0185\u0186\7!\2\2\u0186\u01a4\5"+
		":\36\f\u0187\u0188\f\t\2\2\u0188\u0189\7\"\2\2\u0189\u01a4\5:\36\n\u018a"+
		"\u018b\f\b\2\2\u018b\u018c\7#\2\2\u018c\u01a4\5:\36\t\u018d\u018e\f\7"+
		"\2\2\u018e\u018f\7$\2\2\u018f\u01a4\5:\36\b\u0190\u0191\f\6\2\2\u0191"+
		"\u0192\7%\2\2\u0192\u01a4\5:\36\7\u0193\u0194\f\5\2\2\u0194\u0195\7&\2"+
		"\2\u0195\u01a4\5:\36\6\u0196\u0197\f\4\2\2\u0197\u0198\7\'\2\2\u0198\u01a4"+
		"\5:\36\5\u0199\u019a\f\3\2\2\u019a\u019b\7(\2\2\u019b\u01a4\5:\36\4\u019c"+
		"\u019d\f\25\2\2\u019d\u019e\7\34\2\2\u019e\u019f\5\20\t\2\u019f\u01a0"+
		"\7\6\2\2\u01a0\u01a1\5\66\34\2\u01a1\u01a2\7\7\2\2\u01a2\u01a4\3\2\2\2"+
		"\u01a3\u017e\3\2\2\2\u01a3\u0181\3\2\2\2\u01a3\u0184\3\2\2\2\u01a3\u0187"+
		"\3\2\2\2\u01a3\u018a\3\2\2\2\u01a3\u018d\3\2\2\2\u01a3\u0190\3\2\2\2\u01a3"+
		"\u0193\3\2\2\2\u01a3\u0196\3\2\2\2\u01a3\u0199\3\2\2\2\u01a3\u019c\3\2"+
		"\2\2\u01a4\u01a7\3\2\2\2\u01a5\u01a3\3\2\2\2\u01a5\u01a6\3\2\2\2\u01a6"+
		";\3\2\2\2\u01a7\u01a5\3\2\2\2\u01a8\u01a9\7/\2\2\u01a9=\3\2\2\2\u01aa"+
		"\u01ab\t\2\2\2\u01ab?\3\2\2\2\u01ac\u01b1\7/\2\2\u01ad\u01ae\7\34\2\2"+
		"\u01ae\u01b0\7/\2\2\u01af\u01ad\3\2\2\2\u01b0\u01b3\3\2\2\2\u01b1\u01af"+
		"\3\2\2\2\u01b1\u01b2\3\2\2\2\u01b2A\3\2\2\2\u01b3\u01b1\3\2\2\2*PV`dg"+
		"js{\u0083\u0086\u0094\u009b\u00a3\u00ab\u00b3\u00bb\u00c3\u00cb\u00d3"+
		"\u00db\u00e3\u00e6\u00ed\u00f8\u00fe\u0113\u0117\u0124\u0128\u012c\u0131"+
		"\u0138\u013e\u0142\u0148\u014b\u017c\u01a3\u01a5\u01b1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}