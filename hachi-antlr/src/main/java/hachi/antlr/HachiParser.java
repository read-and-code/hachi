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
		T__38=39, VARIABLE=40, PRINT=41, EQUALS=42, NUMBER=43, STRING=44, BOOLEAN=45, 
		ID=46, WHITE_SPACE=47;
	public static final int
		RULE_compilationUnit = 0, RULE_classDeclaration = 1, RULE_className = 2, 
		RULE_classBody = 3, RULE_field = 4, RULE_constructor = 5, RULE_constructorDeclaration = 6, 
		RULE_function = 7, RULE_functionDeclaration = 8, RULE_functionName = 9, 
		RULE_functionParameterList = 10, RULE_functionParameter = 11, RULE_functionParameterWithDefaultValue = 12, 
		RULE_functionBody = 13, RULE_type = 14, RULE_primitiveType = 15, RULE_classType = 16, 
		RULE_statement = 17, RULE_variableDeclaration = 18, RULE_assignmentStatement = 19, 
		RULE_forStatement = 20, RULE_forCondition = 21, RULE_ifStatement = 22, 
		RULE_returnStatement = 23, RULE_printStatement = 24, RULE_blockStatement = 25, 
		RULE_name = 26, RULE_functionArgument = 27, RULE_functionArgumentList = 28, 
		RULE_namedFunctionArgument = 29, RULE_expression = 30, RULE_variableReference = 31, 
		RULE_value = 32, RULE_qualifiedName = 33;
	public static final String[] ruleNames = {
		"compilationUnit", "classDeclaration", "className", "classBody", "field", 
		"constructor", "constructorDeclaration", "function", "functionDeclaration", 
		"functionName", "functionParameterList", "functionParameter", "functionParameterWithDefaultValue", 
		"functionBody", "type", "primitiveType", "classType", "statement", "variableDeclaration", 
		"assignmentStatement", "forStatement", "forCondition", "ifStatement", 
		"returnStatement", "printStatement", "blockStatement", "name", "functionArgument", 
		"functionArgumentList", "namedFunctionArgument", "expression", "variableReference", 
		"value", "qualifiedName"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'class'", "'{'", "'}'", "'constructor'", "'('", "')'", "','", "'boolean'", 
		"'['", "']'", "'string'", "'char'", "'byte'", "'short'", "'int'", "'long'", 
		"'float'", "'double'", "'void'", "'for'", "'from'", "'to'", "'if'", "'else'", 
		"'return'", "'->'", "'*'", "'/'", "'+'", "'-'", "'>'", "'<'", "'=='", 
		"'!='", "'>='", "'<='", "'.'", "'super'", "'new'", "'var'", "'print'", 
		"'='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, "VARIABLE", "PRINT", "EQUALS", "NUMBER", "STRING", 
		"BOOLEAN", "ID", "WHITE_SPACE"
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
			setState(68);
			classDeclaration();
			setState(69);
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
			setState(71);
			match(T__0);
			setState(72);
			className();
			setState(73);
			match(T__1);
			setState(74);
			classBody();
			setState(75);
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
			setState(77);
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
		public List<ConstructorContext> constructor() {
			return getRuleContexts(ConstructorContext.class);
		}
		public ConstructorContext constructor(int i) {
			return getRuleContext(ConstructorContext.class,i);
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
			setState(82);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(79);
					field();
					}
					} 
				}
				setState(84);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(85);
				constructor();
				}
				}
				setState(90);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(94);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << ID))) != 0)) {
				{
				{
				setState(91);
				function();
				}
				}
				setState(96);
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
			setState(97);
			type();
			setState(98);
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

	public static class ConstructorContext extends ParserRuleContext {
		public ConstructorDeclarationContext constructorDeclaration() {
			return getRuleContext(ConstructorDeclarationContext.class,0);
		}
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public ConstructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HachiListener ) ((HachiListener)listener).enterConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HachiListener ) ((HachiListener)listener).exitConstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HachiVisitor ) return ((HachiVisitor<? extends T>)visitor).visitConstructor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorContext constructor() throws RecognitionException {
		ConstructorContext _localctx = new ConstructorContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_constructor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			constructorDeclaration();
			setState(101);
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

	public static class ConstructorDeclarationContext extends ParserRuleContext {
		public FunctionParameterListContext functionParameterList() {
			return getRuleContext(FunctionParameterListContext.class,0);
		}
		public ConstructorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HachiListener ) ((HachiListener)listener).enterConstructorDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HachiListener ) ((HachiListener)listener).exitConstructorDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HachiVisitor ) return ((HachiVisitor<? extends T>)visitor).visitConstructorDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorDeclarationContext constructorDeclaration() throws RecognitionException {
		ConstructorDeclarationContext _localctx = new ConstructorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_constructorDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(T__3);
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(104);
				match(T__4);
				}
			}

			setState(108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << ID))) != 0)) {
				{
				setState(107);
				functionParameterList();
				}
			}

			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(110);
				match(T__5);
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
		enterRule(_localctx, 14, RULE_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			functionDeclaration();
			setState(114);
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
		enterRule(_localctx, 16, RULE_functionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(116);
				type();
				}
				break;
			}
			setState(119);
			functionName();
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(120);
				match(T__4);
				}
			}

			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << ID))) != 0)) {
				{
				setState(123);
				functionParameterList();
				}
			}

			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(126);
				match(T__5);
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
		enterRule(_localctx, 18, RULE_functionName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
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
		enterRule(_localctx, 20, RULE_functionParameterList);
		int _la;
		try {
			setState(155);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(131);
				functionParameter();
				setState(136);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6) {
					{
					{
					setState(132);
					match(T__6);
					setState(133);
					functionParameter();
					}
					}
					setState(138);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(139);
				functionParameter();
				setState(144);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6) {
					{
					{
					setState(140);
					match(T__6);
					setState(141);
					functionParameterWithDefaultValue();
					}
					}
					setState(146);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(147);
				functionParameterWithDefaultValue();
				setState(152);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6) {
					{
					{
					setState(148);
					match(T__6);
					setState(149);
					functionParameterWithDefaultValue();
					}
					}
					setState(154);
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
		enterRule(_localctx, 22, RULE_functionParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			type();
			setState(158);
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
		enterRule(_localctx, 24, RULE_functionParameterWithDefaultValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			type();
			setState(161);
			match(ID);
			setState(162);
			match(EQUALS);
			setState(163);
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
		enterRule(_localctx, 26, RULE_functionBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
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
		enterRule(_localctx, 28, RULE_type);
		try {
			setState(169);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case T__14:
			case T__15:
			case T__16:
			case T__17:
			case T__18:
				enterOuterAlt(_localctx, 1);
				{
				setState(167);
				primitiveType();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(168);
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
		enterRule(_localctx, 30, RULE_primitiveType);
		int _la;
		try {
			setState(251);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(171);
				match(T__7);
				setState(176);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__8) {
					{
					{
					setState(172);
					match(T__8);
					setState(173);
					match(T__9);
					}
					}
					setState(178);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 2);
				{
				setState(179);
				match(T__10);
				setState(184);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__8) {
					{
					{
					setState(180);
					match(T__8);
					setState(181);
					match(T__9);
					}
					}
					setState(186);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 3);
				{
				setState(187);
				match(T__11);
				setState(192);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__8) {
					{
					{
					setState(188);
					match(T__8);
					setState(189);
					match(T__9);
					}
					}
					setState(194);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 4);
				{
				setState(195);
				match(T__12);
				setState(200);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__8) {
					{
					{
					setState(196);
					match(T__8);
					setState(197);
					match(T__9);
					}
					}
					setState(202);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 5);
				{
				setState(203);
				match(T__13);
				setState(208);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__8) {
					{
					{
					setState(204);
					match(T__8);
					setState(205);
					match(T__9);
					}
					}
					setState(210);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 6);
				{
				setState(211);
				match(T__14);
				setState(216);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__8) {
					{
					{
					setState(212);
					match(T__8);
					setState(213);
					match(T__9);
					}
					}
					setState(218);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 7);
				{
				setState(219);
				match(T__15);
				setState(224);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__8) {
					{
					{
					setState(220);
					match(T__8);
					setState(221);
					match(T__9);
					}
					}
					setState(226);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 8);
				{
				setState(227);
				match(T__16);
				setState(232);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__8) {
					{
					{
					setState(228);
					match(T__8);
					setState(229);
					match(T__9);
					}
					}
					setState(234);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 9);
				{
				setState(235);
				match(T__17);
				setState(240);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__8) {
					{
					{
					setState(236);
					match(T__8);
					setState(237);
					match(T__9);
					}
					}
					setState(242);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 10);
				{
				setState(243);
				match(T__18);
				setState(248);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__8) {
					{
					{
					setState(244);
					match(T__8);
					setState(245);
					match(T__9);
					}
					}
					setState(250);
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
		enterRule(_localctx, 32, RULE_classType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			qualifiedName();
			setState(258);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(254);
				match(T__8);
				setState(255);
				match(T__9);
				}
				}
				setState(260);
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
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public AssignmentStatementContext assignmentStatement() {
			return getRuleContext(AssignmentStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public PrintStatementContext printStatement() {
			return getRuleContext(PrintStatementContext.class,0);
		}
		public BlockStatementContext blockStatement() {
			return getRuleContext(BlockStatementContext.class,0);
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
		enterRule(_localctx, 34, RULE_statement);
		try {
			setState(269);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(261);
				variableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(262);
				assignmentStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(263);
				forStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(264);
				ifStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(265);
				returnStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(266);
				printStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(267);
				blockStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(268);
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
		enterRule(_localctx, 36, RULE_variableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			match(VARIABLE);
			setState(272);
			name();
			setState(273);
			match(EQUALS);
			setState(274);
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

	public static class AssignmentStatementContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode EQUALS() { return getToken(HachiParser.EQUALS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HachiListener ) ((HachiListener)listener).enterAssignmentStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HachiListener ) ((HachiListener)listener).exitAssignmentStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HachiVisitor ) return ((HachiVisitor<? extends T>)visitor).visitAssignmentStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentStatementContext assignmentStatement() throws RecognitionException {
		AssignmentStatementContext _localctx = new AssignmentStatementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_assignmentStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			name();
			setState(277);
			match(EQUALS);
			setState(278);
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
			setState(280);
			match(T__19);
			setState(282);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(281);
				match(T__4);
				}
			}

			setState(284);
			forCondition();
			setState(286);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(285);
				match(T__5);
				}
			}

			setState(288);
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
			setState(290);
			((ForConditionContext)_localctx).iterator = variableReference();
			setState(291);
			match(T__20);
			setState(292);
			((ForConditionContext)_localctx).startExpression = expression(0);
			setState(293);
			((ForConditionContext)_localctx).range = match(T__21);
			setState(294);
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
		enterRule(_localctx, 44, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			match(T__22);
			setState(298);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(297);
				match(T__4);
				}
				break;
			}
			setState(300);
			expression(0);
			setState(302);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(301);
				match(T__5);
				}
			}

			setState(304);
			((IfStatementContext)_localctx).trueStatement = statement();
			setState(307);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(305);
				match(T__23);
				setState(306);
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
		enterRule(_localctx, 46, RULE_returnStatement);
		try {
			setState(312);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				_localctx = new ReturnWithValueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(309);
				match(T__24);
				setState(310);
				expression(0);
				}
				break;
			case 2:
				_localctx = new ReturnVoidContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(311);
				match(T__24);
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
		enterRule(_localctx, 48, RULE_printStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			match(PRINT);
			setState(315);
			match(T__4);
			setState(316);
			expression(0);
			setState(317);
			match(T__5);
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
		enterRule(_localctx, 50, RULE_blockStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
			match(T__1);
			setState(323);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__4) | (1L << T__19) | (1L << T__22) | (1L << T__24) | (1L << T__37) | (1L << T__38) | (1L << VARIABLE) | (1L << PRINT) | (1L << NUMBER) | (1L << STRING) | (1L << BOOLEAN) | (1L << ID))) != 0)) {
				{
				{
				setState(320);
				statement();
				}
				}
				setState(325);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(326);
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
		enterRule(_localctx, 52, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
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
		enterRule(_localctx, 54, RULE_functionArgument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
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
		enterRule(_localctx, 56, RULE_functionArgumentList);
		int _la;
		try {
			setState(352);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				_localctx = new UnnamedFunctionArgumentListContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(333);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__37) | (1L << T__38) | (1L << NUMBER) | (1L << STRING) | (1L << BOOLEAN) | (1L << ID))) != 0)) {
					{
					setState(332);
					functionArgument();
					}
				}

				setState(339);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6) {
					{
					{
					setState(335);
					match(T__6);
					setState(336);
					functionArgument();
					}
					}
					setState(341);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				_localctx = new NamedFunctionArgumentListContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(343);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(342);
					namedFunctionArgument();
					}
				}

				setState(349);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6) {
					{
					{
					setState(345);
					match(T__6);
					setState(346);
					namedFunctionArgument();
					}
					}
					setState(351);
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
		enterRule(_localctx, 58, RULE_namedFunctionArgument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
			name();
			setState(355);
			match(T__25);
			setState(356);
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
		int _startState = 60;
		enterRecursionRule(_localctx, 60, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(401);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				{
				_localctx = new ValueLabelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(359);
				value();
				}
				break;
			case 2:
				{
				_localctx = new VariableReferenceLabelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(360);
				variableReference();
				}
				break;
			case 3:
				{
				_localctx = new MultiplyContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(361);
				match(T__4);
				setState(362);
				expression(0);
				setState(363);
				match(T__26);
				setState(364);
				expression(0);
				setState(365);
				match(T__5);
				}
				break;
			case 4:
				{
				_localctx = new DivideContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(367);
				match(T__4);
				setState(368);
				expression(0);
				setState(369);
				match(T__27);
				setState(370);
				expression(0);
				setState(371);
				match(T__5);
				}
				break;
			case 5:
				{
				_localctx = new AddContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(373);
				match(T__4);
				setState(374);
				expression(0);
				setState(375);
				match(T__28);
				setState(376);
				expression(0);
				setState(377);
				match(T__5);
				}
				break;
			case 6:
				{
				_localctx = new SubtractContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(379);
				match(T__4);
				setState(380);
				expression(0);
				setState(381);
				match(T__29);
				setState(382);
				expression(0);
				setState(383);
				match(T__5);
				}
				break;
			case 7:
				{
				_localctx = new FunctionCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(385);
				functionName();
				setState(386);
				match(T__4);
				setState(387);
				functionArgumentList();
				setState(388);
				match(T__5);
				}
				break;
			case 8:
				{
				_localctx = new SupercallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(390);
				((SupercallContext)_localctx).superCall = match(T__37);
				setState(391);
				match(T__4);
				setState(392);
				functionArgumentList();
				setState(393);
				match(T__5);
				}
				break;
			case 9:
				{
				_localctx = new ConstructorCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(395);
				((ConstructorCallContext)_localctx).newCall = match(T__38);
				setState(396);
				className();
				setState(397);
				match(T__4);
				setState(398);
				functionArgumentList();
				setState(399);
				match(T__5);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(442);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(440);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplyContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(403);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(404);
						match(T__26);
						setState(405);
						expression(18);
						}
						break;
					case 2:
						{
						_localctx = new DivideContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(406);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(407);
						match(T__27);
						setState(408);
						expression(16);
						}
						break;
					case 3:
						{
						_localctx = new AddContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(409);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(410);
						match(T__28);
						setState(411);
						expression(14);
						}
						break;
					case 4:
						{
						_localctx = new SubtractContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(412);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(413);
						match(T__29);
						setState(414);
						expression(12);
						}
						break;
					case 5:
						{
						_localctx = new ConditionalExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(415);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(416);
						((ConditionalExpressionContext)_localctx).cmp = match(T__30);
						setState(417);
						expression(11);
						}
						break;
					case 6:
						{
						_localctx = new ConditionalExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(418);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(419);
						((ConditionalExpressionContext)_localctx).cmp = match(T__31);
						setState(420);
						expression(10);
						}
						break;
					case 7:
						{
						_localctx = new ConditionalExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(421);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(422);
						((ConditionalExpressionContext)_localctx).cmp = match(T__32);
						setState(423);
						expression(9);
						}
						break;
					case 8:
						{
						_localctx = new ConditionalExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(424);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(425);
						((ConditionalExpressionContext)_localctx).cmp = match(T__33);
						setState(426);
						expression(8);
						}
						break;
					case 9:
						{
						_localctx = new ConditionalExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(427);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(428);
						((ConditionalExpressionContext)_localctx).cmp = match(T__34);
						setState(429);
						expression(7);
						}
						break;
					case 10:
						{
						_localctx = new ConditionalExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(430);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(431);
						((ConditionalExpressionContext)_localctx).cmp = match(T__35);
						setState(432);
						expression(6);
						}
						break;
					case 11:
						{
						_localctx = new FunctionCallContext(new ExpressionContext(_parentctx, _parentState));
						((FunctionCallContext)_localctx).owner = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(433);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(434);
						match(T__36);
						setState(435);
						functionName();
						setState(436);
						match(T__4);
						setState(437);
						functionArgumentList();
						setState(438);
						match(T__5);
						}
						break;
					}
					} 
				}
				setState(444);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
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
		enterRule(_localctx, 62, RULE_variableReference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(445);
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
		enterRule(_localctx, 64, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(447);
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
		enterRule(_localctx, 66, RULE_qualifiedName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(449);
			match(ID);
			setState(454);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__36) {
				{
				{
				setState(450);
				match(T__36);
				setState(451);
				match(ID);
				}
				}
				setState(456);
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
		case 30:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 17);
		case 1:
			return precpred(_ctx, 15);
		case 2:
			return precpred(_ctx, 13);
		case 3:
			return precpred(_ctx, 11);
		case 4:
			return precpred(_ctx, 10);
		case 5:
			return precpred(_ctx, 9);
		case 6:
			return precpred(_ctx, 8);
		case 7:
			return precpred(_ctx, 7);
		case 8:
			return precpred(_ctx, 6);
		case 9:
			return precpred(_ctx, 5);
		case 10:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\61\u01cc\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\7\5"+
		"S\n\5\f\5\16\5V\13\5\3\5\7\5Y\n\5\f\5\16\5\\\13\5\3\5\7\5_\n\5\f\5\16"+
		"\5b\13\5\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\5\bl\n\b\3\b\5\bo\n\b\3\b\5\b"+
		"r\n\b\3\t\3\t\3\t\3\n\5\nx\n\n\3\n\3\n\5\n|\n\n\3\n\5\n\177\n\n\3\n\5"+
		"\n\u0082\n\n\3\13\3\13\3\f\3\f\3\f\7\f\u0089\n\f\f\f\16\f\u008c\13\f\3"+
		"\f\3\f\3\f\7\f\u0091\n\f\f\f\16\f\u0094\13\f\3\f\3\f\3\f\7\f\u0099\n\f"+
		"\f\f\16\f\u009c\13\f\5\f\u009e\n\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16"+
		"\3\17\3\17\3\20\3\20\5\20\u00ac\n\20\3\21\3\21\3\21\7\21\u00b1\n\21\f"+
		"\21\16\21\u00b4\13\21\3\21\3\21\3\21\7\21\u00b9\n\21\f\21\16\21\u00bc"+
		"\13\21\3\21\3\21\3\21\7\21\u00c1\n\21\f\21\16\21\u00c4\13\21\3\21\3\21"+
		"\3\21\7\21\u00c9\n\21\f\21\16\21\u00cc\13\21\3\21\3\21\3\21\7\21\u00d1"+
		"\n\21\f\21\16\21\u00d4\13\21\3\21\3\21\3\21\7\21\u00d9\n\21\f\21\16\21"+
		"\u00dc\13\21\3\21\3\21\3\21\7\21\u00e1\n\21\f\21\16\21\u00e4\13\21\3\21"+
		"\3\21\3\21\7\21\u00e9\n\21\f\21\16\21\u00ec\13\21\3\21\3\21\3\21\7\21"+
		"\u00f1\n\21\f\21\16\21\u00f4\13\21\3\21\3\21\3\21\7\21\u00f9\n\21\f\21"+
		"\16\21\u00fc\13\21\5\21\u00fe\n\21\3\22\3\22\3\22\7\22\u0103\n\22\f\22"+
		"\16\22\u0106\13\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u0110"+
		"\n\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\5\26\u011d"+
		"\n\26\3\26\3\26\5\26\u0121\n\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\30\3\30\5\30\u012d\n\30\3\30\3\30\5\30\u0131\n\30\3\30\3\30\3\30\5"+
		"\30\u0136\n\30\3\31\3\31\3\31\5\31\u013b\n\31\3\32\3\32\3\32\3\32\3\32"+
		"\3\33\3\33\7\33\u0144\n\33\f\33\16\33\u0147\13\33\3\33\3\33\3\34\3\34"+
		"\3\35\3\35\3\36\5\36\u0150\n\36\3\36\3\36\7\36\u0154\n\36\f\36\16\36\u0157"+
		"\13\36\3\36\5\36\u015a\n\36\3\36\3\36\7\36\u015e\n\36\f\36\16\36\u0161"+
		"\13\36\5\36\u0163\n\36\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3 "+
		"\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 "+
		"\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \5 \u0194\n \3 \3 \3 \3 \3 \3 \3 \3 "+
		"\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 "+
		"\3 \3 \3 \3 \3 \3 \7 \u01bb\n \f \16 \u01be\13 \3!\3!\3\"\3\"\3#\3#\3"+
		"#\7#\u01c7\n#\f#\16#\u01ca\13#\3#\2\3>$\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&(*,.\60\62\64\668:<>@BD\2\3\3\2-/\2\u01f4\2F\3\2\2\2\4I"+
		"\3\2\2\2\6O\3\2\2\2\bT\3\2\2\2\nc\3\2\2\2\ff\3\2\2\2\16i\3\2\2\2\20s\3"+
		"\2\2\2\22w\3\2\2\2\24\u0083\3\2\2\2\26\u009d\3\2\2\2\30\u009f\3\2\2\2"+
		"\32\u00a2\3\2\2\2\34\u00a7\3\2\2\2\36\u00ab\3\2\2\2 \u00fd\3\2\2\2\"\u00ff"+
		"\3\2\2\2$\u010f\3\2\2\2&\u0111\3\2\2\2(\u0116\3\2\2\2*\u011a\3\2\2\2,"+
		"\u0124\3\2\2\2.\u012a\3\2\2\2\60\u013a\3\2\2\2\62\u013c\3\2\2\2\64\u0141"+
		"\3\2\2\2\66\u014a\3\2\2\28\u014c\3\2\2\2:\u0162\3\2\2\2<\u0164\3\2\2\2"+
		">\u0193\3\2\2\2@\u01bf\3\2\2\2B\u01c1\3\2\2\2D\u01c3\3\2\2\2FG\5\4\3\2"+
		"GH\7\2\2\3H\3\3\2\2\2IJ\7\3\2\2JK\5\6\4\2KL\7\4\2\2LM\5\b\5\2MN\7\5\2"+
		"\2N\5\3\2\2\2OP\5D#\2P\7\3\2\2\2QS\5\n\6\2RQ\3\2\2\2SV\3\2\2\2TR\3\2\2"+
		"\2TU\3\2\2\2UZ\3\2\2\2VT\3\2\2\2WY\5\f\7\2XW\3\2\2\2Y\\\3\2\2\2ZX\3\2"+
		"\2\2Z[\3\2\2\2[`\3\2\2\2\\Z\3\2\2\2]_\5\20\t\2^]\3\2\2\2_b\3\2\2\2`^\3"+
		"\2\2\2`a\3\2\2\2a\t\3\2\2\2b`\3\2\2\2cd\5\36\20\2de\5\66\34\2e\13\3\2"+
		"\2\2fg\5\16\b\2gh\5\34\17\2h\r\3\2\2\2ik\7\6\2\2jl\7\7\2\2kj\3\2\2\2k"+
		"l\3\2\2\2ln\3\2\2\2mo\5\26\f\2nm\3\2\2\2no\3\2\2\2oq\3\2\2\2pr\7\b\2\2"+
		"qp\3\2\2\2qr\3\2\2\2r\17\3\2\2\2st\5\22\n\2tu\5\34\17\2u\21\3\2\2\2vx"+
		"\5\36\20\2wv\3\2\2\2wx\3\2\2\2xy\3\2\2\2y{\5\24\13\2z|\7\7\2\2{z\3\2\2"+
		"\2{|\3\2\2\2|~\3\2\2\2}\177\5\26\f\2~}\3\2\2\2~\177\3\2\2\2\177\u0081"+
		"\3\2\2\2\u0080\u0082\7\b\2\2\u0081\u0080\3\2\2\2\u0081\u0082\3\2\2\2\u0082"+
		"\23\3\2\2\2\u0083\u0084\7\60\2\2\u0084\25\3\2\2\2\u0085\u008a\5\30\r\2"+
		"\u0086\u0087\7\t\2\2\u0087\u0089\5\30\r\2\u0088\u0086\3\2\2\2\u0089\u008c"+
		"\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u009e\3\2\2\2\u008c"+
		"\u008a\3\2\2\2\u008d\u0092\5\30\r\2\u008e\u008f\7\t\2\2\u008f\u0091\5"+
		"\32\16\2\u0090\u008e\3\2\2\2\u0091\u0094\3\2\2\2\u0092\u0090\3\2\2\2\u0092"+
		"\u0093\3\2\2\2\u0093\u009e\3\2\2\2\u0094\u0092\3\2\2\2\u0095\u009a\5\32"+
		"\16\2\u0096\u0097\7\t\2\2\u0097\u0099\5\32\16\2\u0098\u0096\3\2\2\2\u0099"+
		"\u009c\3\2\2\2\u009a\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009e\3\2"+
		"\2\2\u009c\u009a\3\2\2\2\u009d\u0085\3\2\2\2\u009d\u008d\3\2\2\2\u009d"+
		"\u0095\3\2\2\2\u009e\27\3\2\2\2\u009f\u00a0\5\36\20\2\u00a0\u00a1\7\60"+
		"\2\2\u00a1\31\3\2\2\2\u00a2\u00a3\5\36\20\2\u00a3\u00a4\7\60\2\2\u00a4"+
		"\u00a5\7,\2\2\u00a5\u00a6\5> \2\u00a6\33\3\2\2\2\u00a7\u00a8\5\64\33\2"+
		"\u00a8\35\3\2\2\2\u00a9\u00ac\5 \21\2\u00aa\u00ac\5\"\22\2\u00ab\u00a9"+
		"\3\2\2\2\u00ab\u00aa\3\2\2\2\u00ac\37\3\2\2\2\u00ad\u00b2\7\n\2\2\u00ae"+
		"\u00af\7\13\2\2\u00af\u00b1\7\f\2\2\u00b0\u00ae\3\2\2\2\u00b1\u00b4\3"+
		"\2\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00fe\3\2\2\2\u00b4"+
		"\u00b2\3\2\2\2\u00b5\u00ba\7\r\2\2\u00b6\u00b7\7\13\2\2\u00b7\u00b9\7"+
		"\f\2\2\u00b8\u00b6\3\2\2\2\u00b9\u00bc\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba"+
		"\u00bb\3\2\2\2\u00bb\u00fe\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bd\u00c2\7\16"+
		"\2\2\u00be\u00bf\7\13\2\2\u00bf\u00c1\7\f\2\2\u00c0\u00be\3\2\2\2\u00c1"+
		"\u00c4\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00fe\3\2"+
		"\2\2\u00c4\u00c2\3\2\2\2\u00c5\u00ca\7\17\2\2\u00c6\u00c7\7\13\2\2\u00c7"+
		"\u00c9\7\f\2\2\u00c8\u00c6\3\2\2\2\u00c9\u00cc\3\2\2\2\u00ca\u00c8\3\2"+
		"\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00fe\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cd"+
		"\u00d2\7\20\2\2\u00ce\u00cf\7\13\2\2\u00cf\u00d1\7\f\2\2\u00d0\u00ce\3"+
		"\2\2\2\u00d1\u00d4\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3"+
		"\u00fe\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d5\u00da\7\21\2\2\u00d6\u00d7\7"+
		"\13\2\2\u00d7\u00d9\7\f\2\2\u00d8\u00d6\3\2\2\2\u00d9\u00dc\3\2\2\2\u00da"+
		"\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00fe\3\2\2\2\u00dc\u00da\3\2"+
		"\2\2\u00dd\u00e2\7\22\2\2\u00de\u00df\7\13\2\2\u00df\u00e1\7\f\2\2\u00e0"+
		"\u00de\3\2\2\2\u00e1\u00e4\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e3\3\2"+
		"\2\2\u00e3\u00fe\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e5\u00ea\7\23\2\2\u00e6"+
		"\u00e7\7\13\2\2\u00e7\u00e9\7\f\2\2\u00e8\u00e6\3\2\2\2\u00e9\u00ec\3"+
		"\2\2\2\u00ea\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00fe\3\2\2\2\u00ec"+
		"\u00ea\3\2\2\2\u00ed\u00f2\7\24\2\2\u00ee\u00ef\7\13\2\2\u00ef\u00f1\7"+
		"\f\2\2\u00f0\u00ee\3\2\2\2\u00f1\u00f4\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f2"+
		"\u00f3\3\2\2\2\u00f3\u00fe\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f5\u00fa\7\25"+
		"\2\2\u00f6\u00f7\7\13\2\2\u00f7\u00f9\7\f\2\2\u00f8\u00f6\3\2\2\2\u00f9"+
		"\u00fc\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fe\3\2"+
		"\2\2\u00fc\u00fa\3\2\2\2\u00fd\u00ad\3\2\2\2\u00fd\u00b5\3\2\2\2\u00fd"+
		"\u00bd\3\2\2\2\u00fd\u00c5\3\2\2\2\u00fd\u00cd\3\2\2\2\u00fd\u00d5\3\2"+
		"\2\2\u00fd\u00dd\3\2\2\2\u00fd\u00e5\3\2\2\2\u00fd\u00ed\3\2\2\2\u00fd"+
		"\u00f5\3\2\2\2\u00fe!\3\2\2\2\u00ff\u0104\5D#\2\u0100\u0101\7\13\2\2\u0101"+
		"\u0103\7\f\2\2\u0102\u0100\3\2\2\2\u0103\u0106\3\2\2\2\u0104\u0102\3\2"+
		"\2\2\u0104\u0105\3\2\2\2\u0105#\3\2\2\2\u0106\u0104\3\2\2\2\u0107\u0110"+
		"\5&\24\2\u0108\u0110\5(\25\2\u0109\u0110\5*\26\2\u010a\u0110\5.\30\2\u010b"+
		"\u0110\5\60\31\2\u010c\u0110\5\62\32\2\u010d\u0110\5\64\33\2\u010e\u0110"+
		"\5> \2\u010f\u0107\3\2\2\2\u010f\u0108\3\2\2\2\u010f\u0109\3\2\2\2\u010f"+
		"\u010a\3\2\2\2\u010f\u010b\3\2\2\2\u010f\u010c\3\2\2\2\u010f\u010d\3\2"+
		"\2\2\u010f\u010e\3\2\2\2\u0110%\3\2\2\2\u0111\u0112\7*\2\2\u0112\u0113"+
		"\5\66\34\2\u0113\u0114\7,\2\2\u0114\u0115\5> \2\u0115\'\3\2\2\2\u0116"+
		"\u0117\5\66\34\2\u0117\u0118\7,\2\2\u0118\u0119\5> \2\u0119)\3\2\2\2\u011a"+
		"\u011c\7\26\2\2\u011b\u011d\7\7\2\2\u011c\u011b\3\2\2\2\u011c\u011d\3"+
		"\2\2\2\u011d\u011e\3\2\2\2\u011e\u0120\5,\27\2\u011f\u0121\7\b\2\2\u0120"+
		"\u011f\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u0122\3\2\2\2\u0122\u0123\5$"+
		"\23\2\u0123+\3\2\2\2\u0124\u0125\5@!\2\u0125\u0126\7\27\2\2\u0126\u0127"+
		"\5> \2\u0127\u0128\7\30\2\2\u0128\u0129\5> \2\u0129-\3\2\2\2\u012a\u012c"+
		"\7\31\2\2\u012b\u012d\7\7\2\2\u012c\u012b\3\2\2\2\u012c\u012d\3\2\2\2"+
		"\u012d\u012e\3\2\2\2\u012e\u0130\5> \2\u012f\u0131\7\b\2\2\u0130\u012f"+
		"\3\2\2\2\u0130\u0131\3\2\2\2\u0131\u0132\3\2\2\2\u0132\u0135\5$\23\2\u0133"+
		"\u0134\7\32\2\2\u0134\u0136\5$\23\2\u0135\u0133\3\2\2\2\u0135\u0136\3"+
		"\2\2\2\u0136/\3\2\2\2\u0137\u0138\7\33\2\2\u0138\u013b\5> \2\u0139\u013b"+
		"\7\33\2\2\u013a\u0137\3\2\2\2\u013a\u0139\3\2\2\2\u013b\61\3\2\2\2\u013c"+
		"\u013d\7+\2\2\u013d\u013e\7\7\2\2\u013e\u013f\5> \2\u013f\u0140\7\b\2"+
		"\2\u0140\63\3\2\2\2\u0141\u0145\7\4\2\2\u0142\u0144\5$\23\2\u0143\u0142"+
		"\3\2\2\2\u0144\u0147\3\2\2\2\u0145\u0143\3\2\2\2\u0145\u0146\3\2\2\2\u0146"+
		"\u0148\3\2\2\2\u0147\u0145\3\2\2\2\u0148\u0149\7\5\2\2\u0149\65\3\2\2"+
		"\2\u014a\u014b\7\60\2\2\u014b\67\3\2\2\2\u014c\u014d\5> \2\u014d9\3\2"+
		"\2\2\u014e\u0150\58\35\2\u014f\u014e\3\2\2\2\u014f\u0150\3\2\2\2\u0150"+
		"\u0155\3\2\2\2\u0151\u0152\7\t\2\2\u0152\u0154\58\35\2\u0153\u0151\3\2"+
		"\2\2\u0154\u0157\3\2\2\2\u0155\u0153\3\2\2\2\u0155\u0156\3\2\2\2\u0156"+
		"\u0163\3\2\2\2\u0157\u0155\3\2\2\2\u0158\u015a\5<\37\2\u0159\u0158\3\2"+
		"\2\2\u0159\u015a\3\2\2\2\u015a\u015f\3\2\2\2\u015b\u015c\7\t\2\2\u015c"+
		"\u015e\5<\37\2\u015d\u015b\3\2\2\2\u015e\u0161\3\2\2\2\u015f\u015d\3\2"+
		"\2\2\u015f\u0160\3\2\2\2\u0160\u0163\3\2\2\2\u0161\u015f\3\2\2\2\u0162"+
		"\u014f\3\2\2\2\u0162\u0159\3\2\2\2\u0163;\3\2\2\2\u0164\u0165\5\66\34"+
		"\2\u0165\u0166\7\34\2\2\u0166\u0167\5> \2\u0167=\3\2\2\2\u0168\u0169\b"+
		" \1\2\u0169\u0194\5B\"\2\u016a\u0194\5@!\2\u016b\u016c\7\7\2\2\u016c\u016d"+
		"\5> \2\u016d\u016e\7\35\2\2\u016e\u016f\5> \2\u016f\u0170\7\b\2\2\u0170"+
		"\u0194\3\2\2\2\u0171\u0172\7\7\2\2\u0172\u0173\5> \2\u0173\u0174\7\36"+
		"\2\2\u0174\u0175\5> \2\u0175\u0176\7\b\2\2\u0176\u0194\3\2\2\2\u0177\u0178"+
		"\7\7\2\2\u0178\u0179\5> \2\u0179\u017a\7\37\2\2\u017a\u017b\5> \2\u017b"+
		"\u017c\7\b\2\2\u017c\u0194\3\2\2\2\u017d\u017e\7\7\2\2\u017e\u017f\5>"+
		" \2\u017f\u0180\7 \2\2\u0180\u0181\5> \2\u0181\u0182\7\b\2\2\u0182\u0194"+
		"\3\2\2\2\u0183\u0184\5\24\13\2\u0184\u0185\7\7\2\2\u0185\u0186\5:\36\2"+
		"\u0186\u0187\7\b\2\2\u0187\u0194\3\2\2\2\u0188\u0189\7(\2\2\u0189\u018a"+
		"\7\7\2\2\u018a\u018b\5:\36\2\u018b\u018c\7\b\2\2\u018c\u0194\3\2\2\2\u018d"+
		"\u018e\7)\2\2\u018e\u018f\5\6\4\2\u018f\u0190\7\7\2\2\u0190\u0191\5:\36"+
		"\2\u0191\u0192\7\b\2\2\u0192\u0194\3\2\2\2\u0193\u0168\3\2\2\2\u0193\u016a"+
		"\3\2\2\2\u0193\u016b\3\2\2\2\u0193\u0171\3\2\2\2\u0193\u0177\3\2\2\2\u0193"+
		"\u017d\3\2\2\2\u0193\u0183\3\2\2\2\u0193\u0188\3\2\2\2\u0193\u018d\3\2"+
		"\2\2\u0194\u01bc\3\2\2\2\u0195\u0196\f\23\2\2\u0196\u0197\7\35\2\2\u0197"+
		"\u01bb\5> \24\u0198\u0199\f\21\2\2\u0199\u019a\7\36\2\2\u019a\u01bb\5"+
		"> \22\u019b\u019c\f\17\2\2\u019c\u019d\7\37\2\2\u019d\u01bb\5> \20\u019e"+
		"\u019f\f\r\2\2\u019f\u01a0\7 \2\2\u01a0\u01bb\5> \16\u01a1\u01a2\f\f\2"+
		"\2\u01a2\u01a3\7!\2\2\u01a3\u01bb\5> \r\u01a4\u01a5\f\13\2\2\u01a5\u01a6"+
		"\7\"\2\2\u01a6\u01bb\5> \f\u01a7\u01a8\f\n\2\2\u01a8\u01a9\7#\2\2\u01a9"+
		"\u01bb\5> \13\u01aa\u01ab\f\t\2\2\u01ab\u01ac\7$\2\2\u01ac\u01bb\5> \n"+
		"\u01ad\u01ae\f\b\2\2\u01ae\u01af\7%\2\2\u01af\u01bb\5> \t\u01b0\u01b1"+
		"\f\7\2\2\u01b1\u01b2\7&\2\2\u01b2\u01bb\5> \b\u01b3\u01b4\f\6\2\2\u01b4"+
		"\u01b5\7\'\2\2\u01b5\u01b6\5\24\13\2\u01b6\u01b7\7\7\2\2\u01b7\u01b8\5"+
		":\36\2\u01b8\u01b9\7\b\2\2\u01b9\u01bb\3\2\2\2\u01ba\u0195\3\2\2\2\u01ba"+
		"\u0198\3\2\2\2\u01ba\u019b\3\2\2\2\u01ba\u019e\3\2\2\2\u01ba\u01a1\3\2"+
		"\2\2\u01ba\u01a4\3\2\2\2\u01ba\u01a7\3\2\2\2\u01ba\u01aa\3\2\2\2\u01ba"+
		"\u01ad\3\2\2\2\u01ba\u01b0\3\2\2\2\u01ba\u01b3\3\2\2\2\u01bb\u01be\3\2"+
		"\2\2\u01bc\u01ba\3\2\2\2\u01bc\u01bd\3\2\2\2\u01bd?\3\2\2\2\u01be\u01bc"+
		"\3\2\2\2\u01bf\u01c0\7\60\2\2\u01c0A\3\2\2\2\u01c1\u01c2\t\2\2\2\u01c2"+
		"C\3\2\2\2\u01c3\u01c8\7\60\2\2\u01c4\u01c5\7\'\2\2\u01c5\u01c7\7\60\2"+
		"\2\u01c6\u01c4\3\2\2\2\u01c7\u01ca\3\2\2\2\u01c8\u01c6\3\2\2\2\u01c8\u01c9"+
		"\3\2\2\2\u01c9E\3\2\2\2\u01ca\u01c8\3\2\2\2.TZ`knqw{~\u0081\u008a\u0092"+
		"\u009a\u009d\u00ab\u00b2\u00ba\u00c2\u00ca\u00d2\u00da\u00e2\u00ea\u00f2"+
		"\u00fa\u00fd\u0104\u010f\u011c\u0120\u012c\u0130\u0135\u013a\u0145\u014f"+
		"\u0155\u0159\u015f\u0162\u0193\u01ba\u01bc\u01c8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}