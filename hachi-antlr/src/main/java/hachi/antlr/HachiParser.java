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
		QUALIFIED_NAME=46, WHITE_SPACE=47;
	public static final int
		RULE_compilationUnit = 0, RULE_classDeclaration = 1, RULE_className = 2, 
		RULE_classBody = 3, RULE_function = 4, RULE_functionDeclaration = 5, RULE_functionName = 6, 
		RULE_functionParameter = 7, RULE_functionParameterDefaultValue = 8, RULE_functionBody = 9, 
		RULE_type = 10, RULE_primitiveType = 11, RULE_classType = 12, RULE_statement = 13, 
		RULE_blockStatement = 14, RULE_variableDeclaration = 15, RULE_printStatement = 16, 
		RULE_returnStatement = 17, RULE_ifStatement = 18, RULE_forStatement = 19, 
		RULE_forCondition = 20, RULE_name = 21, RULE_argument = 22, RULE_expression = 23, 
		RULE_variableReference = 24, RULE_value = 25;
	public static final String[] ruleNames = {
		"compilationUnit", "classDeclaration", "className", "classBody", "function", 
		"functionDeclaration", "functionName", "functionParameter", "functionParameterDefaultValue", 
		"functionBody", "type", "primitiveType", "classType", "statement", "blockStatement", 
		"variableDeclaration", "printStatement", "returnStatement", "ifStatement", 
		"forStatement", "forCondition", "name", "argument", "expression", "variableReference", 
		"value"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'class'", "'{'", "'}'", "'('", "','", "')'", "'boolean'", "'['", 
		"']'", "'string'", "'char'", "'byte'", "'short'", "'int'", "'long'", "'float'", 
		"'double'", "'void'", "'return'", "'if'", "'else'", "'for'", "'from'", 
		"'to'", "'->'", "'.'", "'super'", "'new'", "'*'", "'/'", "'+'", "'-'", 
		"'>'", "'<'", "'=='", "'!='", "'>='", "'<='", "'var'", "'print'", "'='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, "VARIABLE", "PRINT", "EQUALS", "NUMBER", "STRING", "BOOLEAN", 
		"ID", "QUALIFIED_NAME", "WHITE_SPACE"
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
			setState(52);
			classDeclaration();
			setState(53);
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
			setState(55);
			match(T__0);
			setState(56);
			className();
			setState(57);
			match(T__1);
			setState(58);
			classBody();
			setState(59);
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
			setState(61);
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
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << ID) | (1L << QUALIFIED_NAME))) != 0)) {
				{
				{
				setState(63);
				function();
				}
				}
				setState(68);
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
			setState(69);
			functionDeclaration();
			setState(70);
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
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << QUALIFIED_NAME))) != 0)) {
				{
				setState(72);
				type();
				}
			}

			setState(75);
			functionName();
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(76);
				match(T__3);
				}
			}

			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << QUALIFIED_NAME))) != 0)) {
				{
				setState(79);
				functionParameter();
				setState(84);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(80);
					match(T__4);
					setState(81);
					functionParameter();
					}
					}
					setState(86);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(89);
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
			setState(92);
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
			setState(94);
			type();
			setState(95);
			match(ID);
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUALS) {
				{
				setState(96);
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
			setState(99);
			match(EQUALS);
			setState(100);
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
			setState(102);
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
			setState(106);
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
				setState(104);
				primitiveType();
				}
				break;
			case QUALIFIED_NAME:
				enterOuterAlt(_localctx, 2);
				{
				setState(105);
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
			setState(188);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(108);
				match(T__6);
				setState(113);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(109);
					match(T__7);
					setState(110);
					match(T__8);
					}
					}
					setState(115);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				setState(116);
				match(T__9);
				setState(121);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(117);
					match(T__7);
					setState(118);
					match(T__8);
					}
					}
					setState(123);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 3);
				{
				setState(124);
				match(T__10);
				setState(129);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(125);
					match(T__7);
					setState(126);
					match(T__8);
					}
					}
					setState(131);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 4);
				{
				setState(132);
				match(T__11);
				setState(137);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(133);
					match(T__7);
					setState(134);
					match(T__8);
					}
					}
					setState(139);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 5);
				{
				setState(140);
				match(T__12);
				setState(145);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(141);
					match(T__7);
					setState(142);
					match(T__8);
					}
					}
					setState(147);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 6);
				{
				setState(148);
				match(T__13);
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
			case T__14:
				enterOuterAlt(_localctx, 7);
				{
				setState(156);
				match(T__14);
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
			case T__15:
				enterOuterAlt(_localctx, 8);
				{
				setState(164);
				match(T__15);
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
			case T__16:
				enterOuterAlt(_localctx, 9);
				{
				setState(172);
				match(T__16);
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
			case T__17:
				enterOuterAlt(_localctx, 10);
				{
				setState(180);
				match(T__17);
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
			setState(190);
			match(QUALIFIED_NAME);
			setState(195);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(191);
				match(T__7);
				setState(192);
				match(T__8);
				}
				}
				setState(197);
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
		enterRule(_localctx, 26, RULE_statement);
		try {
			setState(205);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(198);
				blockStatement();
				}
				break;
			case VARIABLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(199);
				variableDeclaration();
				}
				break;
			case PRINT:
				enterOuterAlt(_localctx, 3);
				{
				setState(200);
				printStatement();
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 4);
				{
				setState(201);
				forStatement();
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 5);
				{
				setState(202);
				returnStatement();
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 6);
				{
				setState(203);
				ifStatement();
				}
				break;
			case T__3:
			case T__26:
			case T__27:
			case NUMBER:
			case STRING:
			case BOOLEAN:
			case ID:
				enterOuterAlt(_localctx, 7);
				{
				setState(204);
				expression(0);
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
			setState(207);
			match(T__1);
			setState(211);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__3) | (1L << T__18) | (1L << T__19) | (1L << T__21) | (1L << T__26) | (1L << T__27) | (1L << VARIABLE) | (1L << PRINT) | (1L << NUMBER) | (1L << STRING) | (1L << BOOLEAN) | (1L << ID))) != 0)) {
				{
				{
				setState(208);
				statement();
				}
				}
				setState(213);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(214);
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
			setState(216);
			match(VARIABLE);
			setState(217);
			name();
			setState(218);
			match(EQUALS);
			setState(219);
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
			setState(221);
			match(PRINT);
			setState(222);
			match(T__3);
			setState(223);
			expression(0);
			setState(224);
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
		enterRule(_localctx, 34, RULE_returnStatement);
		try {
			setState(229);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				_localctx = new ReturnVoidContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(226);
				match(T__18);
				}
				break;
			case 2:
				_localctx = new ReturnWithValueContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(227);
				match(T__18);
				setState(228);
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
		enterRule(_localctx, 36, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			match(T__19);
			setState(233);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(232);
				match(T__3);
				}
				break;
			}
			setState(235);
			expression(0);
			setState(237);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(236);
				match(T__5);
				}
			}

			setState(239);
			((IfStatementContext)_localctx).trueStatement = statement();
			setState(242);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(240);
				match(T__20);
				setState(241);
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
		enterRule(_localctx, 38, RULE_forStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			match(T__21);
			setState(246);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(245);
				match(T__3);
				}
			}

			setState(248);
			forCondition();
			setState(250);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(249);
				match(T__5);
				}
			}

			setState(252);
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
		enterRule(_localctx, 40, RULE_forCondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			((ForConditionContext)_localctx).iterator = variableReference();
			setState(255);
			match(T__22);
			setState(256);
			((ForConditionContext)_localctx).startExpression = expression(0);
			setState(257);
			((ForConditionContext)_localctx).range = match(T__23);
			setState(258);
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
		enterRule(_localctx, 42, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
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
		enterRule(_localctx, 44, RULE_argument);
		try {
			setState(267);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(262);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(263);
				name();
				setState(264);
				match(T__24);
				setState(265);
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
		public List<ArgumentContext> argument() {
			return getRuleContexts(ArgumentContext.class);
		}
		public ArgumentContext argument(int i) {
			return getRuleContext(ArgumentContext.class,i);
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
		public List<ArgumentContext> argument() {
			return getRuleContexts(ArgumentContext.class);
		}
		public ArgumentContext argument(int i) {
			return getRuleContext(ArgumentContext.class,i);
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
		public List<ArgumentContext> argument() {
			return getRuleContexts(ArgumentContext.class);
		}
		public ArgumentContext argument(int i) {
			return getRuleContext(ArgumentContext.class,i);
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
		int _startState = 46;
		enterRecursionRule(_localctx, 46, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(338);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				_localctx = new VariableReferenceLabelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(270);
				variableReference();
				}
				break;
			case 2:
				{
				_localctx = new FunctionCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(271);
				functionName();
				setState(272);
				match(T__3);
				setState(274);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__26) | (1L << T__27) | (1L << NUMBER) | (1L << STRING) | (1L << BOOLEAN) | (1L << ID))) != 0)) {
					{
					setState(273);
					argument();
					}
				}

				setState(280);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(276);
					match(T__4);
					setState(277);
					argument();
					}
					}
					setState(282);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(283);
				match(T__5);
				}
				break;
			case 3:
				{
				_localctx = new SupercallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(285);
				((SupercallContext)_localctx).superCall = match(T__26);
				setState(286);
				match(T__3);
				setState(288);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__26) | (1L << T__27) | (1L << NUMBER) | (1L << STRING) | (1L << BOOLEAN) | (1L << ID))) != 0)) {
					{
					setState(287);
					argument();
					}
				}

				setState(294);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(290);
					match(T__4);
					setState(291);
					argument();
					}
					}
					setState(296);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(297);
				match(T__5);
				}
				break;
			case 4:
				{
				_localctx = new ConstructorCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(298);
				((ConstructorCallContext)_localctx).newCall = match(T__27);
				setState(299);
				className();
				setState(300);
				match(T__3);
				setState(302);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__26) | (1L << T__27) | (1L << NUMBER) | (1L << STRING) | (1L << BOOLEAN) | (1L << ID))) != 0)) {
					{
					setState(301);
					argument();
					}
				}

				setState(308);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(304);
					match(T__4);
					setState(305);
					argument();
					}
					}
					setState(310);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(311);
				match(T__5);
				}
				break;
			case 5:
				{
				_localctx = new ValueLabelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(313);
				value();
				}
				break;
			case 6:
				{
				_localctx = new MultiplyContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(314);
				match(T__3);
				setState(315);
				expression(0);
				setState(316);
				match(T__28);
				setState(317);
				expression(0);
				setState(318);
				match(T__5);
				}
				break;
			case 7:
				{
				_localctx = new DivideContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(320);
				match(T__3);
				setState(321);
				expression(0);
				setState(322);
				match(T__29);
				setState(323);
				expression(0);
				setState(324);
				match(T__5);
				}
				break;
			case 8:
				{
				_localctx = new AddContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(326);
				match(T__3);
				setState(327);
				expression(0);
				setState(328);
				match(T__30);
				setState(329);
				expression(0);
				setState(330);
				match(T__5);
				}
				break;
			case 9:
				{
				_localctx = new SubtractContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(332);
				match(T__3);
				setState(333);
				expression(0);
				setState(334);
				match(T__31);
				setState(335);
				expression(0);
				setState(336);
				match(T__5);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(388);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(386);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplyContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(340);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(341);
						match(T__28);
						setState(342);
						expression(14);
						}
						break;
					case 2:
						{
						_localctx = new DivideContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(343);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(344);
						match(T__29);
						setState(345);
						expression(12);
						}
						break;
					case 3:
						{
						_localctx = new AddContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(346);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(347);
						match(T__30);
						setState(348);
						expression(10);
						}
						break;
					case 4:
						{
						_localctx = new SubtractContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(349);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(350);
						match(T__31);
						setState(351);
						expression(8);
						}
						break;
					case 5:
						{
						_localctx = new ConditionalExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(352);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(353);
						((ConditionalExpressionContext)_localctx).cmp = match(T__32);
						setState(354);
						expression(7);
						}
						break;
					case 6:
						{
						_localctx = new ConditionalExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(355);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(356);
						((ConditionalExpressionContext)_localctx).cmp = match(T__33);
						setState(357);
						expression(6);
						}
						break;
					case 7:
						{
						_localctx = new ConditionalExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(358);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(359);
						((ConditionalExpressionContext)_localctx).cmp = match(T__34);
						setState(360);
						expression(5);
						}
						break;
					case 8:
						{
						_localctx = new ConditionalExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(361);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(362);
						((ConditionalExpressionContext)_localctx).cmp = match(T__35);
						setState(363);
						expression(4);
						}
						break;
					case 9:
						{
						_localctx = new ConditionalExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(364);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(365);
						((ConditionalExpressionContext)_localctx).cmp = match(T__36);
						setState(366);
						expression(3);
						}
						break;
					case 10:
						{
						_localctx = new ConditionalExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(367);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(368);
						((ConditionalExpressionContext)_localctx).cmp = match(T__37);
						setState(369);
						expression(2);
						}
						break;
					case 11:
						{
						_localctx = new FunctionCallContext(new ExpressionContext(_parentctx, _parentState));
						((FunctionCallContext)_localctx).owner = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(370);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(371);
						match(T__25);
						setState(372);
						functionName();
						setState(373);
						match(T__3);
						setState(375);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__26) | (1L << T__27) | (1L << NUMBER) | (1L << STRING) | (1L << BOOLEAN) | (1L << ID))) != 0)) {
							{
							setState(374);
							argument();
							}
						}

						setState(381);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==T__4) {
							{
							{
							setState(377);
							match(T__4);
							setState(378);
							argument();
							}
							}
							setState(383);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(384);
						match(T__5);
						}
						break;
					}
					} 
				}
				setState(390);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
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
		enterRule(_localctx, 48, RULE_variableReference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(391);
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
		enterRule(_localctx, 50, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(393);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 23:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\61\u018e\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\7"+
		"\5C\n\5\f\5\16\5F\13\5\3\6\3\6\3\6\3\7\5\7L\n\7\3\7\3\7\5\7P\n\7\3\7\3"+
		"\7\3\7\7\7U\n\7\f\7\16\7X\13\7\5\7Z\n\7\3\7\5\7]\n\7\3\b\3\b\3\t\3\t\3"+
		"\t\5\td\n\t\3\n\3\n\3\n\3\13\3\13\3\f\3\f\5\fm\n\f\3\r\3\r\3\r\7\rr\n"+
		"\r\f\r\16\ru\13\r\3\r\3\r\3\r\7\rz\n\r\f\r\16\r}\13\r\3\r\3\r\3\r\7\r"+
		"\u0082\n\r\f\r\16\r\u0085\13\r\3\r\3\r\3\r\7\r\u008a\n\r\f\r\16\r\u008d"+
		"\13\r\3\r\3\r\3\r\7\r\u0092\n\r\f\r\16\r\u0095\13\r\3\r\3\r\3\r\7\r\u009a"+
		"\n\r\f\r\16\r\u009d\13\r\3\r\3\r\3\r\7\r\u00a2\n\r\f\r\16\r\u00a5\13\r"+
		"\3\r\3\r\3\r\7\r\u00aa\n\r\f\r\16\r\u00ad\13\r\3\r\3\r\3\r\7\r\u00b2\n"+
		"\r\f\r\16\r\u00b5\13\r\3\r\3\r\3\r\7\r\u00ba\n\r\f\r\16\r\u00bd\13\r\5"+
		"\r\u00bf\n\r\3\16\3\16\3\16\7\16\u00c4\n\16\f\16\16\16\u00c7\13\16\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00d0\n\17\3\20\3\20\7\20\u00d4\n"+
		"\20\f\20\16\20\u00d7\13\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22"+
		"\3\22\3\22\3\22\3\23\3\23\3\23\5\23\u00e8\n\23\3\24\3\24\5\24\u00ec\n"+
		"\24\3\24\3\24\5\24\u00f0\n\24\3\24\3\24\3\24\5\24\u00f5\n\24\3\25\3\25"+
		"\5\25\u00f9\n\25\3\25\3\25\5\25\u00fd\n\25\3\25\3\25\3\26\3\26\3\26\3"+
		"\26\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\30\3\30\5\30\u010e\n\30\3\31"+
		"\3\31\3\31\3\31\3\31\5\31\u0115\n\31\3\31\3\31\7\31\u0119\n\31\f\31\16"+
		"\31\u011c\13\31\3\31\3\31\3\31\3\31\3\31\5\31\u0123\n\31\3\31\3\31\7\31"+
		"\u0127\n\31\f\31\16\31\u012a\13\31\3\31\3\31\3\31\3\31\3\31\5\31\u0131"+
		"\n\31\3\31\3\31\7\31\u0135\n\31\f\31\16\31\u0138\13\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u0155\n\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u017a\n\31\3\31\3\31\7\31\u017e\n"+
		"\31\f\31\16\31\u0181\13\31\3\31\3\31\7\31\u0185\n\31\f\31\16\31\u0188"+
		"\13\31\3\32\3\32\3\33\3\33\3\33\2\3\60\34\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&(*,.\60\62\64\2\3\3\2,.\2\u01b8\2\66\3\2\2\2\49\3\2\2\2"+
		"\6?\3\2\2\2\bD\3\2\2\2\nG\3\2\2\2\fK\3\2\2\2\16^\3\2\2\2\20`\3\2\2\2\22"+
		"e\3\2\2\2\24h\3\2\2\2\26l\3\2\2\2\30\u00be\3\2\2\2\32\u00c0\3\2\2\2\34"+
		"\u00cf\3\2\2\2\36\u00d1\3\2\2\2 \u00da\3\2\2\2\"\u00df\3\2\2\2$\u00e7"+
		"\3\2\2\2&\u00e9\3\2\2\2(\u00f6\3\2\2\2*\u0100\3\2\2\2,\u0106\3\2\2\2."+
		"\u010d\3\2\2\2\60\u0154\3\2\2\2\62\u0189\3\2\2\2\64\u018b\3\2\2\2\66\67"+
		"\5\4\3\2\678\7\2\2\38\3\3\2\2\29:\7\3\2\2:;\5\6\4\2;<\7\4\2\2<=\5\b\5"+
		"\2=>\7\5\2\2>\5\3\2\2\2?@\7/\2\2@\7\3\2\2\2AC\5\n\6\2BA\3\2\2\2CF\3\2"+
		"\2\2DB\3\2\2\2DE\3\2\2\2E\t\3\2\2\2FD\3\2\2\2GH\5\f\7\2HI\5\24\13\2I\13"+
		"\3\2\2\2JL\5\26\f\2KJ\3\2\2\2KL\3\2\2\2LM\3\2\2\2MO\5\16\b\2NP\7\6\2\2"+
		"ON\3\2\2\2OP\3\2\2\2PY\3\2\2\2QV\5\20\t\2RS\7\7\2\2SU\5\20\t\2TR\3\2\2"+
		"\2UX\3\2\2\2VT\3\2\2\2VW\3\2\2\2WZ\3\2\2\2XV\3\2\2\2YQ\3\2\2\2YZ\3\2\2"+
		"\2Z\\\3\2\2\2[]\7\b\2\2\\[\3\2\2\2\\]\3\2\2\2]\r\3\2\2\2^_\7/\2\2_\17"+
		"\3\2\2\2`a\5\26\f\2ac\7/\2\2bd\5\22\n\2cb\3\2\2\2cd\3\2\2\2d\21\3\2\2"+
		"\2ef\7+\2\2fg\5\60\31\2g\23\3\2\2\2hi\5\36\20\2i\25\3\2\2\2jm\5\30\r\2"+
		"km\5\32\16\2lj\3\2\2\2lk\3\2\2\2m\27\3\2\2\2ns\7\t\2\2op\7\n\2\2pr\7\13"+
		"\2\2qo\3\2\2\2ru\3\2\2\2sq\3\2\2\2st\3\2\2\2t\u00bf\3\2\2\2us\3\2\2\2"+
		"v{\7\f\2\2wx\7\n\2\2xz\7\13\2\2yw\3\2\2\2z}\3\2\2\2{y\3\2\2\2{|\3\2\2"+
		"\2|\u00bf\3\2\2\2}{\3\2\2\2~\u0083\7\r\2\2\177\u0080\7\n\2\2\u0080\u0082"+
		"\7\13\2\2\u0081\177\3\2\2\2\u0082\u0085\3\2\2\2\u0083\u0081\3\2\2\2\u0083"+
		"\u0084\3\2\2\2\u0084\u00bf\3\2\2\2\u0085\u0083\3\2\2\2\u0086\u008b\7\16"+
		"\2\2\u0087\u0088\7\n\2\2\u0088\u008a\7\13\2\2\u0089\u0087\3\2\2\2\u008a"+
		"\u008d\3\2\2\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u00bf\3\2"+
		"\2\2\u008d\u008b\3\2\2\2\u008e\u0093\7\17\2\2\u008f\u0090\7\n\2\2\u0090"+
		"\u0092\7\13\2\2\u0091\u008f\3\2\2\2\u0092\u0095\3\2\2\2\u0093\u0091\3"+
		"\2\2\2\u0093\u0094\3\2\2\2\u0094\u00bf\3\2\2\2\u0095\u0093\3\2\2\2\u0096"+
		"\u009b\7\20\2\2\u0097\u0098\7\n\2\2\u0098\u009a\7\13\2\2\u0099\u0097\3"+
		"\2\2\2\u009a\u009d\3\2\2\2\u009b\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c"+
		"\u00bf\3\2\2\2\u009d\u009b\3\2\2\2\u009e\u00a3\7\21\2\2\u009f\u00a0\7"+
		"\n\2\2\u00a0\u00a2\7\13\2\2\u00a1\u009f\3\2\2\2\u00a2\u00a5\3\2\2\2\u00a3"+
		"\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00bf\3\2\2\2\u00a5\u00a3\3\2"+
		"\2\2\u00a6\u00ab\7\22\2\2\u00a7\u00a8\7\n\2\2\u00a8\u00aa\7\13\2\2\u00a9"+
		"\u00a7\3\2\2\2\u00aa\u00ad\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3\2"+
		"\2\2\u00ac\u00bf\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ae\u00b3\7\23\2\2\u00af"+
		"\u00b0\7\n\2\2\u00b0\u00b2\7\13\2\2\u00b1\u00af\3\2\2\2\u00b2\u00b5\3"+
		"\2\2\2\u00b3\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00bf\3\2\2\2\u00b5"+
		"\u00b3\3\2\2\2\u00b6\u00bb\7\24\2\2\u00b7\u00b8\7\n\2\2\u00b8\u00ba\7"+
		"\13\2\2\u00b9\u00b7\3\2\2\2\u00ba\u00bd\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb"+
		"\u00bc\3\2\2\2\u00bc\u00bf\3\2\2\2\u00bd\u00bb\3\2\2\2\u00ben\3\2\2\2"+
		"\u00bev\3\2\2\2\u00be~\3\2\2\2\u00be\u0086\3\2\2\2\u00be\u008e\3\2\2\2"+
		"\u00be\u0096\3\2\2\2\u00be\u009e\3\2\2\2\u00be\u00a6\3\2\2\2\u00be\u00ae"+
		"\3\2\2\2\u00be\u00b6\3\2\2\2\u00bf\31\3\2\2\2\u00c0\u00c5\7\60\2\2\u00c1"+
		"\u00c2\7\n\2\2\u00c2\u00c4\7\13\2\2\u00c3\u00c1\3\2\2\2\u00c4\u00c7\3"+
		"\2\2\2\u00c5\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\33\3\2\2\2\u00c7"+
		"\u00c5\3\2\2\2\u00c8\u00d0\5\36\20\2\u00c9\u00d0\5 \21\2\u00ca\u00d0\5"+
		"\"\22\2\u00cb\u00d0\5(\25\2\u00cc\u00d0\5$\23\2\u00cd\u00d0\5&\24\2\u00ce"+
		"\u00d0\5\60\31\2\u00cf\u00c8\3\2\2\2\u00cf\u00c9\3\2\2\2\u00cf\u00ca\3"+
		"\2\2\2\u00cf\u00cb\3\2\2\2\u00cf\u00cc\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf"+
		"\u00ce\3\2\2\2\u00d0\35\3\2\2\2\u00d1\u00d5\7\4\2\2\u00d2\u00d4\5\34\17"+
		"\2\u00d3\u00d2\3\2\2\2\u00d4\u00d7\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d5\u00d6"+
		"\3\2\2\2\u00d6\u00d8\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d8\u00d9\7\5\2\2\u00d9"+
		"\37\3\2\2\2\u00da\u00db\7)\2\2\u00db\u00dc\5,\27\2\u00dc\u00dd\7+\2\2"+
		"\u00dd\u00de\5\60\31\2\u00de!\3\2\2\2\u00df\u00e0\7*\2\2\u00e0\u00e1\7"+
		"\6\2\2\u00e1\u00e2\5\60\31\2\u00e2\u00e3\7\b\2\2\u00e3#\3\2\2\2\u00e4"+
		"\u00e8\7\25\2\2\u00e5\u00e6\7\25\2\2\u00e6\u00e8\5\60\31\2\u00e7\u00e4"+
		"\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e8%\3\2\2\2\u00e9\u00eb\7\26\2\2\u00ea"+
		"\u00ec\7\6\2\2\u00eb\u00ea\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ed\3\2"+
		"\2\2\u00ed\u00ef\5\60\31\2\u00ee\u00f0\7\b\2\2\u00ef\u00ee\3\2\2\2\u00ef"+
		"\u00f0\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f4\5\34\17\2\u00f2\u00f3\7"+
		"\27\2\2\u00f3\u00f5\5\34\17\2\u00f4\u00f2\3\2\2\2\u00f4\u00f5\3\2\2\2"+
		"\u00f5\'\3\2\2\2\u00f6\u00f8\7\30\2\2\u00f7\u00f9\7\6\2\2\u00f8\u00f7"+
		"\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00fc\5*\26\2\u00fb"+
		"\u00fd\7\b\2\2\u00fc\u00fb\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00fe\3\2"+
		"\2\2\u00fe\u00ff\5\34\17\2\u00ff)\3\2\2\2\u0100\u0101\5\62\32\2\u0101"+
		"\u0102\7\31\2\2\u0102\u0103\5\60\31\2\u0103\u0104\7\32\2\2\u0104\u0105"+
		"\5\60\31\2\u0105+\3\2\2\2\u0106\u0107\7/\2\2\u0107-\3\2\2\2\u0108\u010e"+
		"\5\60\31\2\u0109\u010a\5,\27\2\u010a\u010b\7\33\2\2\u010b\u010c\5\60\31"+
		"\2\u010c\u010e\3\2\2\2\u010d\u0108\3\2\2\2\u010d\u0109\3\2\2\2\u010e/"+
		"\3\2\2\2\u010f\u0110\b\31\1\2\u0110\u0155\5\62\32\2\u0111\u0112\5\16\b"+
		"\2\u0112\u0114\7\6\2\2\u0113\u0115\5.\30\2\u0114\u0113\3\2\2\2\u0114\u0115"+
		"\3\2\2\2\u0115\u011a\3\2\2\2\u0116\u0117\7\7\2\2\u0117\u0119\5.\30\2\u0118"+
		"\u0116\3\2\2\2\u0119\u011c\3\2\2\2\u011a\u0118\3\2\2\2\u011a\u011b\3\2"+
		"\2\2\u011b\u011d\3\2\2\2\u011c\u011a\3\2\2\2\u011d\u011e\7\b\2\2\u011e"+
		"\u0155\3\2\2\2\u011f\u0120\7\35\2\2\u0120\u0122\7\6\2\2\u0121\u0123\5"+
		".\30\2\u0122\u0121\3\2\2\2\u0122\u0123\3\2\2\2\u0123\u0128\3\2\2\2\u0124"+
		"\u0125\7\7\2\2\u0125\u0127\5.\30\2\u0126\u0124\3\2\2\2\u0127\u012a\3\2"+
		"\2\2\u0128\u0126\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u012b\3\2\2\2\u012a"+
		"\u0128\3\2\2\2\u012b\u0155\7\b\2\2\u012c\u012d\7\36\2\2\u012d\u012e\5"+
		"\6\4\2\u012e\u0130\7\6\2\2\u012f\u0131\5.\30\2\u0130\u012f\3\2\2\2\u0130"+
		"\u0131\3\2\2\2\u0131\u0136\3\2\2\2\u0132\u0133\7\7\2\2\u0133\u0135\5."+
		"\30\2\u0134\u0132\3\2\2\2\u0135\u0138\3\2\2\2\u0136\u0134\3\2\2\2\u0136"+
		"\u0137\3\2\2\2\u0137\u0139\3\2\2\2\u0138\u0136\3\2\2\2\u0139\u013a\7\b"+
		"\2\2\u013a\u0155\3\2\2\2\u013b\u0155\5\64\33\2\u013c\u013d\7\6\2\2\u013d"+
		"\u013e\5\60\31\2\u013e\u013f\7\37\2\2\u013f\u0140\5\60\31\2\u0140\u0141"+
		"\7\b\2\2\u0141\u0155\3\2\2\2\u0142\u0143\7\6\2\2\u0143\u0144\5\60\31\2"+
		"\u0144\u0145\7 \2\2\u0145\u0146\5\60\31\2\u0146\u0147\7\b\2\2\u0147\u0155"+
		"\3\2\2\2\u0148\u0149\7\6\2\2\u0149\u014a\5\60\31\2\u014a\u014b\7!\2\2"+
		"\u014b\u014c\5\60\31\2\u014c\u014d\7\b\2\2\u014d\u0155\3\2\2\2\u014e\u014f"+
		"\7\6\2\2\u014f\u0150\5\60\31\2\u0150\u0151\7\"\2\2\u0151\u0152\5\60\31"+
		"\2\u0152\u0153\7\b\2\2\u0153\u0155\3\2\2\2\u0154\u010f\3\2\2\2\u0154\u0111"+
		"\3\2\2\2\u0154\u011f\3\2\2\2\u0154\u012c\3\2\2\2\u0154\u013b\3\2\2\2\u0154"+
		"\u013c\3\2\2\2\u0154\u0142\3\2\2\2\u0154\u0148\3\2\2\2\u0154\u014e\3\2"+
		"\2\2\u0155\u0186\3\2\2\2\u0156\u0157\f\17\2\2\u0157\u0158\7\37\2\2\u0158"+
		"\u0185\5\60\31\20\u0159\u015a\f\r\2\2\u015a\u015b\7 \2\2\u015b\u0185\5"+
		"\60\31\16\u015c\u015d\f\13\2\2\u015d\u015e\7!\2\2\u015e\u0185\5\60\31"+
		"\f\u015f\u0160\f\t\2\2\u0160\u0161\7\"\2\2\u0161\u0185\5\60\31\n\u0162"+
		"\u0163\f\b\2\2\u0163\u0164\7#\2\2\u0164\u0185\5\60\31\t\u0165\u0166\f"+
		"\7\2\2\u0166\u0167\7$\2\2\u0167\u0185\5\60\31\b\u0168\u0169\f\6\2\2\u0169"+
		"\u016a\7%\2\2\u016a\u0185\5\60\31\7\u016b\u016c\f\5\2\2\u016c\u016d\7"+
		"&\2\2\u016d\u0185\5\60\31\6\u016e\u016f\f\4\2\2\u016f\u0170\7\'\2\2\u0170"+
		"\u0185\5\60\31\5\u0171\u0172\f\3\2\2\u0172\u0173\7(\2\2\u0173\u0185\5"+
		"\60\31\4\u0174\u0175\f\25\2\2\u0175\u0176\7\34\2\2\u0176\u0177\5\16\b"+
		"\2\u0177\u0179\7\6\2\2\u0178\u017a\5.\30\2\u0179\u0178\3\2\2\2\u0179\u017a"+
		"\3\2\2\2\u017a\u017f\3\2\2\2\u017b\u017c\7\7\2\2\u017c\u017e\5.\30\2\u017d"+
		"\u017b\3\2\2\2\u017e\u0181\3\2\2\2\u017f\u017d\3\2\2\2\u017f\u0180\3\2"+
		"\2\2\u0180\u0182\3\2\2\2\u0181\u017f\3\2\2\2\u0182\u0183\7\b\2\2\u0183"+
		"\u0185\3\2\2\2\u0184\u0156\3\2\2\2\u0184\u0159\3\2\2\2\u0184\u015c\3\2"+
		"\2\2\u0184\u015f\3\2\2\2\u0184\u0162\3\2\2\2\u0184\u0165\3\2\2\2\u0184"+
		"\u0168\3\2\2\2\u0184\u016b\3\2\2\2\u0184\u016e\3\2\2\2\u0184\u0171\3\2"+
		"\2\2\u0184\u0174\3\2\2\2\u0185\u0188\3\2\2\2\u0186\u0184\3\2\2\2\u0186"+
		"\u0187\3\2\2\2\u0187\61\3\2\2\2\u0188\u0186\3\2\2\2\u0189\u018a\7/\2\2"+
		"\u018a\63\3\2\2\2\u018b\u018c\t\2\2\2\u018c\65\3\2\2\2*DKOVY\\cls{\u0083"+
		"\u008b\u0093\u009b\u00a3\u00ab\u00b3\u00bb\u00be\u00c5\u00cf\u00d5\u00e7"+
		"\u00eb\u00ef\u00f4\u00f8\u00fc\u010d\u0114\u011a\u0122\u0128\u0130\u0136"+
		"\u0154\u0179\u017f\u0184\u0186";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}