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
		T__31=32, T__32=33, T__33=34, T__34=35, VARIABLE=36, PRINT=37, EQUALS=38, 
		NUMBER=39, STRING=40, ID=41, QUALIFIED_NAME=42, WHITE_SPACE=43;
	public static final int
		RULE_compilationUnit = 0, RULE_classDeclaration = 1, RULE_className = 2, 
		RULE_classBody = 3, RULE_function = 4, RULE_functionDeclaration = 5, RULE_functionName = 6, 
		RULE_functionParameter = 7, RULE_functionParameterDefaultValue = 8, RULE_functionBody = 9, 
		RULE_type = 10, RULE_primitiveType = 11, RULE_classType = 12, RULE_statement = 13, 
		RULE_blockStatement = 14, RULE_variableDeclaration = 15, RULE_printStatement = 16, 
		RULE_functionCall = 17, RULE_returnStatement = 18, RULE_ifStatement = 19, 
		RULE_forStatement = 20, RULE_forCondition = 21, RULE_name = 22, RULE_argument = 23, 
		RULE_expression = 24, RULE_variableReference = 25, RULE_value = 26;
	public static final String[] ruleNames = {
		"compilationUnit", "classDeclaration", "className", "classBody", "function", 
		"functionDeclaration", "functionName", "functionParameter", "functionParameterDefaultValue", 
		"functionBody", "type", "primitiveType", "classType", "statement", "blockStatement", 
		"variableDeclaration", "printStatement", "functionCall", "returnStatement", 
		"ifStatement", "forStatement", "forCondition", "name", "argument", "expression", 
		"variableReference", "value"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'class'", "'{'", "'}'", "'('", "','", "')'", "'boolean'", "'['", 
		"']'", "'string'", "'char'", "'byte'", "'short'", "'int'", "'long'", "'float'", 
		"'double'", "'void'", "'return'", "'if'", "'else'", "'for'", "'from'", 
		"'to'", "'->'", "'*'", "'/'", "'+'", "'-'", "'>'", "'<'", "'=='", "'!='", 
		"'>='", "'<='", "'var'", "'print'", "'='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		"VARIABLE", "PRINT", "EQUALS", "NUMBER", "STRING", "ID", "QUALIFIED_NAME", 
		"WHITE_SPACE"
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
			setState(54);
			classDeclaration();
			setState(55);
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
			setState(57);
			match(T__0);
			setState(58);
			className();
			setState(59);
			match(T__1);
			setState(60);
			classBody();
			setState(61);
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
		public TerminalNode ID() { return getToken(HachiParser.ID, 0); }
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
			setState(63);
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

	public static class ClassBodyContext extends ParserRuleContext {
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
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << ID) | (1L << QUALIFIED_NAME))) != 0)) {
				{
				{
				setState(65);
				function();
				}
				}
				setState(70);
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
		enterRule(_localctx, 8, RULE_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			functionDeclaration();
			setState(72);
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
		public List<FunctionParameterContext> functionParameter() {
			return getRuleContexts(FunctionParameterContext.class);
		}
		public FunctionParameterContext functionParameter(int i) {
			return getRuleContext(FunctionParameterContext.class,i);
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
		enterRule(_localctx, 10, RULE_functionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << QUALIFIED_NAME))) != 0)) {
				{
				setState(74);
				type();
				}
			}

			setState(77);
			functionName();
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(78);
				match(T__3);
				}
			}

			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << QUALIFIED_NAME))) != 0)) {
				{
				setState(81);
				functionParameter();
				setState(86);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(82);
					match(T__4);
					setState(83);
					functionParameter();
					}
					}
					setState(88);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(91);
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
		enterRule(_localctx, 12, RULE_functionName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
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

	public static class FunctionParameterContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(HachiParser.ID, 0); }
		public FunctionParameterDefaultValueContext functionParameterDefaultValue() {
			return getRuleContext(FunctionParameterDefaultValueContext.class,0);
		}
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
		enterRule(_localctx, 14, RULE_functionParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			type();
			setState(97);
			match(ID);
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUALS) {
				{
				setState(98);
				functionParameterDefaultValue();
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

	public static class FunctionParameterDefaultValueContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FunctionParameterDefaultValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionParameterDefaultValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HachiListener ) ((HachiListener)listener).enterFunctionParameterDefaultValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HachiListener ) ((HachiListener)listener).exitFunctionParameterDefaultValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HachiVisitor ) return ((HachiVisitor<? extends T>)visitor).visitFunctionParameterDefaultValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionParameterDefaultValueContext functionParameterDefaultValue() throws RecognitionException {
		FunctionParameterDefaultValueContext _localctx = new FunctionParameterDefaultValueContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_functionParameterDefaultValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(EQUALS);
			setState(102);
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
		enterRule(_localctx, 18, RULE_functionBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
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
		enterRule(_localctx, 20, RULE_type);
		try {
			setState(108);
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
				setState(106);
				primitiveType();
				}
				break;
			case QUALIFIED_NAME:
				enterOuterAlt(_localctx, 2);
				{
				setState(107);
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
		enterRule(_localctx, 22, RULE_primitiveType);
		int _la;
		try {
			setState(190);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(110);
				match(T__6);
				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(111);
					match(T__7);
					setState(112);
					match(T__8);
					}
					}
					setState(117);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				setState(118);
				match(T__9);
				setState(123);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(119);
					match(T__7);
					setState(120);
					match(T__8);
					}
					}
					setState(125);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 3);
				{
				setState(126);
				match(T__10);
				setState(131);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(127);
					match(T__7);
					setState(128);
					match(T__8);
					}
					}
					setState(133);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 4);
				{
				setState(134);
				match(T__11);
				setState(139);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(135);
					match(T__7);
					setState(136);
					match(T__8);
					}
					}
					setState(141);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 5);
				{
				setState(142);
				match(T__12);
				setState(147);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(143);
					match(T__7);
					setState(144);
					match(T__8);
					}
					}
					setState(149);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 6);
				{
				setState(150);
				match(T__13);
				setState(155);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(151);
					match(T__7);
					setState(152);
					match(T__8);
					}
					}
					setState(157);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 7);
				{
				setState(158);
				match(T__14);
				setState(163);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(159);
					match(T__7);
					setState(160);
					match(T__8);
					}
					}
					setState(165);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 8);
				{
				setState(166);
				match(T__15);
				setState(171);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(167);
					match(T__7);
					setState(168);
					match(T__8);
					}
					}
					setState(173);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 9);
				{
				setState(174);
				match(T__16);
				setState(179);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(175);
					match(T__7);
					setState(176);
					match(T__8);
					}
					}
					setState(181);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 10);
				{
				setState(182);
				match(T__17);
				setState(187);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(183);
					match(T__7);
					setState(184);
					match(T__8);
					}
					}
					setState(189);
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
		public TerminalNode QUALIFIED_NAME() { return getToken(HachiParser.QUALIFIED_NAME, 0); }
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
		enterRule(_localctx, 24, RULE_classType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			match(QUALIFIED_NAME);
			setState(197);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(193);
				match(T__7);
				setState(194);
				match(T__8);
				}
				}
				setState(199);
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
		public PrintStatementContext printStatement() {
			return getRuleContext(PrintStatementContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
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
		enterRule(_localctx, 26, RULE_statement);
		try {
			setState(207);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(200);
				blockStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(201);
				variableDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(202);
				printStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(203);
				functionCall();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(204);
				returnStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(205);
				ifStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(206);
				forStatement();
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
		enterRule(_localctx, 28, RULE_blockStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			match(T__1);
			setState(213);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__3) | (1L << T__18) | (1L << T__19) | (1L << T__21) | (1L << VARIABLE) | (1L << PRINT) | (1L << NUMBER) | (1L << STRING) | (1L << ID))) != 0)) {
				{
				{
				setState(210);
				statement();
				}
				}
				setState(215);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(216);
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
		enterRule(_localctx, 30, RULE_variableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			match(VARIABLE);
			setState(219);
			name();
			setState(220);
			match(EQUALS);
			setState(221);
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
		enterRule(_localctx, 32, RULE_printStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			match(PRINT);
			setState(224);
			match(T__3);
			setState(225);
			expression(0);
			setState(226);
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

	public static class FunctionCallContext extends ParserRuleContext {
		public FunctionNameContext functionName() {
			return getRuleContext(FunctionNameContext.class,0);
		}
		public List<ArgumentContext> argument() {
			return getRuleContexts(ArgumentContext.class);
		}
		public ArgumentContext argument(int i) {
			return getRuleContext(ArgumentContext.class,i);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
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

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			functionName();
			setState(229);
			match(T__3);
			setState(231);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << NUMBER) | (1L << STRING) | (1L << ID))) != 0)) {
				{
				setState(230);
				argument();
				}
			}

			setState(237);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(233);
				match(T__4);
				setState(234);
				argument();
				}
				}
				setState(239);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(240);
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
		enterRule(_localctx, 36, RULE_returnStatement);
		int _la;
		try {
			setState(247);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				_localctx = new ReturnVoidContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(242);
				match(T__18);
				}
				break;
			case 2:
				_localctx = new ReturnWithValueContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(244);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__18) {
					{
					setState(243);
					match(T__18);
					}
				}

				setState(246);
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
		enterRule(_localctx, 38, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			match(T__19);
			setState(251);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(250);
				match(T__3);
				}
				break;
			}
			setState(253);
			expression(0);
			setState(255);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(254);
				match(T__5);
				}
			}

			setState(257);
			((IfStatementContext)_localctx).trueStatement = statement();
			setState(260);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(258);
				match(T__20);
				setState(259);
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
			setState(262);
			match(T__21);
			setState(264);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(263);
				match(T__3);
				}
			}

			setState(266);
			forCondition();
			setState(268);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(267);
				match(T__5);
				}
			}

			setState(270);
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
			setState(272);
			((ForConditionContext)_localctx).iterator = variableReference();
			setState(273);
			match(T__22);
			setState(274);
			((ForConditionContext)_localctx).startExpression = expression(0);
			setState(275);
			((ForConditionContext)_localctx).range = match(T__23);
			setState(276);
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
		enterRule(_localctx, 44, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
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

	public static class ArgumentContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public ArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HachiListener ) ((HachiListener)listener).enterArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HachiListener ) ((HachiListener)listener).exitArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HachiVisitor ) return ((HachiVisitor<? extends T>)visitor).visitArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_argument);
		try {
			setState(285);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(280);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(281);
				name();
				setState(282);
				match(T__24);
				setState(283);
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
	public static class FunctionCallLabelContext extends ExpressionContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public FunctionCallLabelContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HachiListener ) ((HachiListener)listener).enterFunctionCallLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HachiListener ) ((HachiListener)listener).exitFunctionCallLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HachiVisitor ) return ((HachiVisitor<? extends T>)visitor).visitFunctionCallLabel(this);
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
		int _startState = 48;
		enterRecursionRule(_localctx, 48, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				_localctx = new VariableReferenceLabelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(288);
				variableReference();
				}
				break;
			case 2:
				{
				_localctx = new ValueLabelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(289);
				value();
				}
				break;
			case 3:
				{
				_localctx = new FunctionCallLabelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(290);
				functionCall();
				}
				break;
			case 4:
				{
				_localctx = new MultiplyContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(291);
				match(T__3);
				setState(292);
				expression(0);
				setState(293);
				match(T__25);
				setState(294);
				expression(0);
				setState(295);
				match(T__5);
				}
				break;
			case 5:
				{
				_localctx = new DivideContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(297);
				match(T__3);
				setState(298);
				expression(0);
				setState(299);
				match(T__26);
				setState(300);
				expression(0);
				setState(301);
				match(T__5);
				}
				break;
			case 6:
				{
				_localctx = new AddContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(303);
				match(T__3);
				setState(304);
				expression(0);
				setState(305);
				match(T__27);
				setState(306);
				expression(0);
				setState(307);
				match(T__5);
				}
				break;
			case 7:
				{
				_localctx = new SubtractContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(309);
				match(T__3);
				setState(310);
				expression(0);
				setState(311);
				match(T__28);
				setState(312);
				expression(0);
				setState(313);
				match(T__5);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(349);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(347);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplyContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(317);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(318);
						match(T__25);
						setState(319);
						expression(14);
						}
						break;
					case 2:
						{
						_localctx = new DivideContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(320);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(321);
						match(T__26);
						setState(322);
						expression(12);
						}
						break;
					case 3:
						{
						_localctx = new AddContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(323);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(324);
						match(T__27);
						setState(325);
						expression(10);
						}
						break;
					case 4:
						{
						_localctx = new SubtractContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(326);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(327);
						match(T__28);
						setState(328);
						expression(8);
						}
						break;
					case 5:
						{
						_localctx = new ConditionalExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(329);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(330);
						((ConditionalExpressionContext)_localctx).cmp = match(T__29);
						setState(331);
						expression(7);
						}
						break;
					case 6:
						{
						_localctx = new ConditionalExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(332);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(333);
						((ConditionalExpressionContext)_localctx).cmp = match(T__30);
						setState(334);
						expression(6);
						}
						break;
					case 7:
						{
						_localctx = new ConditionalExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(335);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(336);
						((ConditionalExpressionContext)_localctx).cmp = match(T__31);
						setState(337);
						expression(5);
						}
						break;
					case 8:
						{
						_localctx = new ConditionalExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(338);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(339);
						((ConditionalExpressionContext)_localctx).cmp = match(T__32);
						setState(340);
						expression(4);
						}
						break;
					case 9:
						{
						_localctx = new ConditionalExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(341);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(342);
						((ConditionalExpressionContext)_localctx).cmp = match(T__33);
						setState(343);
						expression(3);
						}
						break;
					case 10:
						{
						_localctx = new ConditionalExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(344);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(345);
						((ConditionalExpressionContext)_localctx).cmp = match(T__34);
						setState(346);
						expression(2);
						}
						break;
					}
					} 
				}
				setState(351);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
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
		enterRule(_localctx, 50, RULE_variableReference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(352);
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
		enterRule(_localctx, 52, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
			_la = _input.LA(1);
			if ( !(_la==NUMBER || _la==STRING) ) {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 24:
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
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3-\u0167\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4"+
		"\3\4\3\5\7\5E\n\5\f\5\16\5H\13\5\3\6\3\6\3\6\3\7\5\7N\n\7\3\7\3\7\5\7"+
		"R\n\7\3\7\3\7\3\7\7\7W\n\7\f\7\16\7Z\13\7\5\7\\\n\7\3\7\5\7_\n\7\3\b\3"+
		"\b\3\t\3\t\3\t\5\tf\n\t\3\n\3\n\3\n\3\13\3\13\3\f\3\f\5\fo\n\f\3\r\3\r"+
		"\3\r\7\rt\n\r\f\r\16\rw\13\r\3\r\3\r\3\r\7\r|\n\r\f\r\16\r\177\13\r\3"+
		"\r\3\r\3\r\7\r\u0084\n\r\f\r\16\r\u0087\13\r\3\r\3\r\3\r\7\r\u008c\n\r"+
		"\f\r\16\r\u008f\13\r\3\r\3\r\3\r\7\r\u0094\n\r\f\r\16\r\u0097\13\r\3\r"+
		"\3\r\3\r\7\r\u009c\n\r\f\r\16\r\u009f\13\r\3\r\3\r\3\r\7\r\u00a4\n\r\f"+
		"\r\16\r\u00a7\13\r\3\r\3\r\3\r\7\r\u00ac\n\r\f\r\16\r\u00af\13\r\3\r\3"+
		"\r\3\r\7\r\u00b4\n\r\f\r\16\r\u00b7\13\r\3\r\3\r\3\r\7\r\u00bc\n\r\f\r"+
		"\16\r\u00bf\13\r\5\r\u00c1\n\r\3\16\3\16\3\16\7\16\u00c6\n\16\f\16\16"+
		"\16\u00c9\13\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00d2\n\17\3\20"+
		"\3\20\7\20\u00d6\n\20\f\20\16\20\u00d9\13\20\3\20\3\20\3\21\3\21\3\21"+
		"\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\5\23\u00ea\n\23\3\23"+
		"\3\23\7\23\u00ee\n\23\f\23\16\23\u00f1\13\23\3\23\3\23\3\24\3\24\5\24"+
		"\u00f7\n\24\3\24\5\24\u00fa\n\24\3\25\3\25\5\25\u00fe\n\25\3\25\3\25\5"+
		"\25\u0102\n\25\3\25\3\25\3\25\5\25\u0107\n\25\3\26\3\26\5\26\u010b\n\26"+
		"\3\26\3\26\5\26\u010f\n\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\30"+
		"\3\30\3\31\3\31\3\31\3\31\3\31\5\31\u0120\n\31\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u013e\n\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\7\32\u015e\n\32\f\32\16\32\u0161\13\32\3\33\3\33\3\34\3\34\3\34\2\3\62"+
		"\35\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\66\2\3\3"+
		"\2)*\2\u0188\28\3\2\2\2\4;\3\2\2\2\6A\3\2\2\2\bF\3\2\2\2\nI\3\2\2\2\f"+
		"M\3\2\2\2\16`\3\2\2\2\20b\3\2\2\2\22g\3\2\2\2\24j\3\2\2\2\26n\3\2\2\2"+
		"\30\u00c0\3\2\2\2\32\u00c2\3\2\2\2\34\u00d1\3\2\2\2\36\u00d3\3\2\2\2 "+
		"\u00dc\3\2\2\2\"\u00e1\3\2\2\2$\u00e6\3\2\2\2&\u00f9\3\2\2\2(\u00fb\3"+
		"\2\2\2*\u0108\3\2\2\2,\u0112\3\2\2\2.\u0118\3\2\2\2\60\u011f\3\2\2\2\62"+
		"\u013d\3\2\2\2\64\u0162\3\2\2\2\66\u0164\3\2\2\289\5\4\3\29:\7\2\2\3:"+
		"\3\3\2\2\2;<\7\3\2\2<=\5\6\4\2=>\7\4\2\2>?\5\b\5\2?@\7\5\2\2@\5\3\2\2"+
		"\2AB\7+\2\2B\7\3\2\2\2CE\5\n\6\2DC\3\2\2\2EH\3\2\2\2FD\3\2\2\2FG\3\2\2"+
		"\2G\t\3\2\2\2HF\3\2\2\2IJ\5\f\7\2JK\5\24\13\2K\13\3\2\2\2LN\5\26\f\2M"+
		"L\3\2\2\2MN\3\2\2\2NO\3\2\2\2OQ\5\16\b\2PR\7\6\2\2QP\3\2\2\2QR\3\2\2\2"+
		"R[\3\2\2\2SX\5\20\t\2TU\7\7\2\2UW\5\20\t\2VT\3\2\2\2WZ\3\2\2\2XV\3\2\2"+
		"\2XY\3\2\2\2Y\\\3\2\2\2ZX\3\2\2\2[S\3\2\2\2[\\\3\2\2\2\\^\3\2\2\2]_\7"+
		"\b\2\2^]\3\2\2\2^_\3\2\2\2_\r\3\2\2\2`a\7+\2\2a\17\3\2\2\2bc\5\26\f\2"+
		"ce\7+\2\2df\5\22\n\2ed\3\2\2\2ef\3\2\2\2f\21\3\2\2\2gh\7(\2\2hi\5\62\32"+
		"\2i\23\3\2\2\2jk\5\36\20\2k\25\3\2\2\2lo\5\30\r\2mo\5\32\16\2nl\3\2\2"+
		"\2nm\3\2\2\2o\27\3\2\2\2pu\7\t\2\2qr\7\n\2\2rt\7\13\2\2sq\3\2\2\2tw\3"+
		"\2\2\2us\3\2\2\2uv\3\2\2\2v\u00c1\3\2\2\2wu\3\2\2\2x}\7\f\2\2yz\7\n\2"+
		"\2z|\7\13\2\2{y\3\2\2\2|\177\3\2\2\2}{\3\2\2\2}~\3\2\2\2~\u00c1\3\2\2"+
		"\2\177}\3\2\2\2\u0080\u0085\7\r\2\2\u0081\u0082\7\n\2\2\u0082\u0084\7"+
		"\13\2\2\u0083\u0081\3\2\2\2\u0084\u0087\3\2\2\2\u0085\u0083\3\2\2\2\u0085"+
		"\u0086\3\2\2\2\u0086\u00c1\3\2\2\2\u0087\u0085\3\2\2\2\u0088\u008d\7\16"+
		"\2\2\u0089\u008a\7\n\2\2\u008a\u008c\7\13\2\2\u008b\u0089\3\2\2\2\u008c"+
		"\u008f\3\2\2\2\u008d\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u00c1\3\2"+
		"\2\2\u008f\u008d\3\2\2\2\u0090\u0095\7\17\2\2\u0091\u0092\7\n\2\2\u0092"+
		"\u0094\7\13\2\2\u0093\u0091\3\2\2\2\u0094\u0097\3\2\2\2\u0095\u0093\3"+
		"\2\2\2\u0095\u0096\3\2\2\2\u0096\u00c1\3\2\2\2\u0097\u0095\3\2\2\2\u0098"+
		"\u009d\7\20\2\2\u0099\u009a\7\n\2\2\u009a\u009c\7\13\2\2\u009b\u0099\3"+
		"\2\2\2\u009c\u009f\3\2\2\2\u009d\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e"+
		"\u00c1\3\2\2\2\u009f\u009d\3\2\2\2\u00a0\u00a5\7\21\2\2\u00a1\u00a2\7"+
		"\n\2\2\u00a2\u00a4\7\13\2\2\u00a3\u00a1\3\2\2\2\u00a4\u00a7\3\2\2\2\u00a5"+
		"\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00c1\3\2\2\2\u00a7\u00a5\3\2"+
		"\2\2\u00a8\u00ad\7\22\2\2\u00a9\u00aa\7\n\2\2\u00aa\u00ac\7\13\2\2\u00ab"+
		"\u00a9\3\2\2\2\u00ac\u00af\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ad\u00ae\3\2"+
		"\2\2\u00ae\u00c1\3\2\2\2\u00af\u00ad\3\2\2\2\u00b0\u00b5\7\23\2\2\u00b1"+
		"\u00b2\7\n\2\2\u00b2\u00b4\7\13\2\2\u00b3\u00b1\3\2\2\2\u00b4\u00b7\3"+
		"\2\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00c1\3\2\2\2\u00b7"+
		"\u00b5\3\2\2\2\u00b8\u00bd\7\24\2\2\u00b9\u00ba\7\n\2\2\u00ba\u00bc\7"+
		"\13\2\2\u00bb\u00b9\3\2\2\2\u00bc\u00bf\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd"+
		"\u00be\3\2\2\2\u00be\u00c1\3\2\2\2\u00bf\u00bd\3\2\2\2\u00c0p\3\2\2\2"+
		"\u00c0x\3\2\2\2\u00c0\u0080\3\2\2\2\u00c0\u0088\3\2\2\2\u00c0\u0090\3"+
		"\2\2\2\u00c0\u0098\3\2\2\2\u00c0\u00a0\3\2\2\2\u00c0\u00a8\3\2\2\2\u00c0"+
		"\u00b0\3\2\2\2\u00c0\u00b8\3\2\2\2\u00c1\31\3\2\2\2\u00c2\u00c7\7,\2\2"+
		"\u00c3\u00c4\7\n\2\2\u00c4\u00c6\7\13\2\2\u00c5\u00c3\3\2\2\2\u00c6\u00c9"+
		"\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\33\3\2\2\2\u00c9"+
		"\u00c7\3\2\2\2\u00ca\u00d2\5\36\20\2\u00cb\u00d2\5 \21\2\u00cc\u00d2\5"+
		"\"\22\2\u00cd\u00d2\5$\23\2\u00ce\u00d2\5&\24\2\u00cf\u00d2\5(\25\2\u00d0"+
		"\u00d2\5*\26\2\u00d1\u00ca\3\2\2\2\u00d1\u00cb\3\2\2\2\u00d1\u00cc\3\2"+
		"\2\2\u00d1\u00cd\3\2\2\2\u00d1\u00ce\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d1"+
		"\u00d0\3\2\2\2\u00d2\35\3\2\2\2\u00d3\u00d7\7\4\2\2\u00d4\u00d6\5\34\17"+
		"\2\u00d5\u00d4\3\2\2\2\u00d6\u00d9\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d7\u00d8"+
		"\3\2\2\2\u00d8\u00da\3\2\2\2\u00d9\u00d7\3\2\2\2\u00da\u00db\7\5\2\2\u00db"+
		"\37\3\2\2\2\u00dc\u00dd\7&\2\2\u00dd\u00de\5.\30\2\u00de\u00df\7(\2\2"+
		"\u00df\u00e0\5\62\32\2\u00e0!\3\2\2\2\u00e1\u00e2\7\'\2\2\u00e2\u00e3"+
		"\7\6\2\2\u00e3\u00e4\5\62\32\2\u00e4\u00e5\7\b\2\2\u00e5#\3\2\2\2\u00e6"+
		"\u00e7\5\16\b\2\u00e7\u00e9\7\6\2\2\u00e8\u00ea\5\60\31\2\u00e9\u00e8"+
		"\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00ef\3\2\2\2\u00eb\u00ec\7\7\2\2\u00ec"+
		"\u00ee\5\60\31\2\u00ed\u00eb\3\2\2\2\u00ee\u00f1\3\2\2\2\u00ef\u00ed\3"+
		"\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f2\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f2"+
		"\u00f3\7\b\2\2\u00f3%\3\2\2\2\u00f4\u00fa\7\25\2\2\u00f5\u00f7\7\25\2"+
		"\2\u00f6\u00f5\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00fa"+
		"\5\62\32\2\u00f9\u00f4\3\2\2\2\u00f9\u00f6\3\2\2\2\u00fa\'\3\2\2\2\u00fb"+
		"\u00fd\7\26\2\2\u00fc\u00fe\7\6\2\2\u00fd\u00fc\3\2\2\2\u00fd\u00fe\3"+
		"\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u0101\5\62\32\2\u0100\u0102\7\b\2\2\u0101"+
		"\u0100\3\2\2\2\u0101\u0102\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u0106\5\34"+
		"\17\2\u0104\u0105\7\27\2\2\u0105\u0107\5\34\17\2\u0106\u0104\3\2\2\2\u0106"+
		"\u0107\3\2\2\2\u0107)\3\2\2\2\u0108\u010a\7\30\2\2\u0109\u010b\7\6\2\2"+
		"\u010a\u0109\3\2\2\2\u010a\u010b\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u010e"+
		"\5,\27\2\u010d\u010f\7\b\2\2\u010e\u010d\3\2\2\2\u010e\u010f\3\2\2\2\u010f"+
		"\u0110\3\2\2\2\u0110\u0111\5\34\17\2\u0111+\3\2\2\2\u0112\u0113\5\64\33"+
		"\2\u0113\u0114\7\31\2\2\u0114\u0115\5\62\32\2\u0115\u0116\7\32\2\2\u0116"+
		"\u0117\5\62\32\2\u0117-\3\2\2\2\u0118\u0119\7+\2\2\u0119/\3\2\2\2\u011a"+
		"\u0120\5\62\32\2\u011b\u011c\5.\30\2\u011c\u011d\7\33\2\2\u011d\u011e"+
		"\5\62\32\2\u011e\u0120\3\2\2\2\u011f\u011a\3\2\2\2\u011f\u011b\3\2\2\2"+
		"\u0120\61\3\2\2\2\u0121\u0122\b\32\1\2\u0122\u013e\5\64\33\2\u0123\u013e"+
		"\5\66\34\2\u0124\u013e\5$\23\2\u0125\u0126\7\6\2\2\u0126\u0127\5\62\32"+
		"\2\u0127\u0128\7\34\2\2\u0128\u0129\5\62\32\2\u0129\u012a\7\b\2\2\u012a"+
		"\u013e\3\2\2\2\u012b\u012c\7\6\2\2\u012c\u012d\5\62\32\2\u012d\u012e\7"+
		"\35\2\2\u012e\u012f\5\62\32\2\u012f\u0130\7\b\2\2\u0130\u013e\3\2\2\2"+
		"\u0131\u0132\7\6\2\2\u0132\u0133\5\62\32\2\u0133\u0134\7\36\2\2\u0134"+
		"\u0135\5\62\32\2\u0135\u0136\7\b\2\2\u0136\u013e\3\2\2\2\u0137\u0138\7"+
		"\6\2\2\u0138\u0139\5\62\32\2\u0139\u013a\7\37\2\2\u013a\u013b\5\62\32"+
		"\2\u013b\u013c\7\b\2\2\u013c\u013e\3\2\2\2\u013d\u0121\3\2\2\2\u013d\u0123"+
		"\3\2\2\2\u013d\u0124\3\2\2\2\u013d\u0125\3\2\2\2\u013d\u012b\3\2\2\2\u013d"+
		"\u0131\3\2\2\2\u013d\u0137\3\2\2\2\u013e\u015f\3\2\2\2\u013f\u0140\f\17"+
		"\2\2\u0140\u0141\7\34\2\2\u0141\u015e\5\62\32\20\u0142\u0143\f\r\2\2\u0143"+
		"\u0144\7\35\2\2\u0144\u015e\5\62\32\16\u0145\u0146\f\13\2\2\u0146\u0147"+
		"\7\36\2\2\u0147\u015e\5\62\32\f\u0148\u0149\f\t\2\2\u0149\u014a\7\37\2"+
		"\2\u014a\u015e\5\62\32\n\u014b\u014c\f\b\2\2\u014c\u014d\7 \2\2\u014d"+
		"\u015e\5\62\32\t\u014e\u014f\f\7\2\2\u014f\u0150\7!\2\2\u0150\u015e\5"+
		"\62\32\b\u0151\u0152\f\6\2\2\u0152\u0153\7\"\2\2\u0153\u015e\5\62\32\7"+
		"\u0154\u0155\f\5\2\2\u0155\u0156\7#\2\2\u0156\u015e\5\62\32\6\u0157\u0158"+
		"\f\4\2\2\u0158\u0159\7$\2\2\u0159\u015e\5\62\32\5\u015a\u015b\f\3\2\2"+
		"\u015b\u015c\7%\2\2\u015c\u015e\5\62\32\4\u015d\u013f\3\2\2\2\u015d\u0142"+
		"\3\2\2\2\u015d\u0145\3\2\2\2\u015d\u0148\3\2\2\2\u015d\u014b\3\2\2\2\u015d"+
		"\u014e\3\2\2\2\u015d\u0151\3\2\2\2\u015d\u0154\3\2\2\2\u015d\u0157\3\2"+
		"\2\2\u015d\u015a\3\2\2\2\u015e\u0161\3\2\2\2\u015f\u015d\3\2\2\2\u015f"+
		"\u0160\3\2\2\2\u0160\63\3\2\2\2\u0161\u015f\3\2\2\2\u0162\u0163\7+\2\2"+
		"\u0163\65\3\2\2\2\u0164\u0165\t\2\2\2\u0165\67\3\2\2\2%FMQX[^enu}\u0085"+
		"\u008d\u0095\u009d\u00a5\u00ad\u00b5\u00bd\u00c0\u00c7\u00d1\u00d7\u00e9"+
		"\u00ef\u00f6\u00f9\u00fd\u0101\u0106\u010a\u010e\u011f\u013d\u015d\u015f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}