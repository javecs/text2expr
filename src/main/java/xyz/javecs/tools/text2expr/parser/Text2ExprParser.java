// Generated from Text2Expr.g4 by ANTLR 4.7
package xyz.javecs.tools.text2expr.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Text2ExprParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, PREFIX=14, LEVEL=15, JAPANESE=16, 
		NUMBER=17, ID=18, NEWLINE=19, WS=20;
	public static final int
		RULE_text2expr = 0, RULE_text = 1, RULE_word = 2, RULE_field = 3, RULE_expr = 4;
	public static final String[] ruleNames = {
		"text2expr", "text", "word", "field", "expr"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'='", "'|'", "'&'", "':'", "'^'", "'+'", "'-'", "'*'", "'/'", "'%'", 
		"'('", "')'", "','"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, "PREFIX", "LEVEL", "JAPANESE", "NUMBER", "ID", "NEWLINE", 
		"WS"
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
	public String getGrammarFileName() { return "Text2Expr.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Text2ExprParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class Text2exprContext extends ParserRuleContext {
		public TerminalNode NEWLINE() { return getToken(Text2ExprParser.NEWLINE, 0); }
		public List<TextContext> text() {
			return getRuleContexts(TextContext.class);
		}
		public TextContext text(int i) {
			return getRuleContext(TextContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Text2exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_text2expr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Text2ExprVisitor ) return ((Text2ExprVisitor<? extends T>)visitor).visitText2expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Text2exprContext text2expr() throws RecognitionException {
		Text2exprContext _localctx = new Text2exprContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_text2expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(11); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(10);
				text();
				}
				}
				setState(13); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==PREFIX || _la==ID );
			setState(15);
			match(NEWLINE);
			setState(17); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(16);
				expr();
				}
				}
				setState(19); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << NUMBER) | (1L << ID) | (1L << NEWLINE))) != 0) );
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

	public static class TextContext extends ParserRuleContext {
		public TextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_text; }
	 
		public TextContext() { }
		public void copyFrom(TextContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class WordAssignContext extends TextContext {
		public TerminalNode ID() { return getToken(Text2ExprParser.ID, 0); }
		public WordContext word() {
			return getRuleContext(WordContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(Text2ExprParser.NEWLINE, 0); }
		public WordAssignContext(TextContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Text2ExprVisitor ) return ((Text2ExprVisitor<? extends T>)visitor).visitWordAssign(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WordDefineContext extends TextContext {
		public WordContext word() {
			return getRuleContext(WordContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(Text2ExprParser.NEWLINE, 0); }
		public WordDefineContext(TextContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Text2ExprVisitor ) return ((Text2ExprVisitor<? extends T>)visitor).visitWordDefine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextContext text() throws RecognitionException {
		TextContext _localctx = new TextContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_text);
		try {
			setState(29);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PREFIX:
				_localctx = new WordDefineContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(21);
				word();
				setState(22);
				match(NEWLINE);
				}
				break;
			case ID:
				_localctx = new WordAssignContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(24);
				match(ID);
				setState(25);
				match(T__0);
				setState(26);
				word();
				setState(27);
				match(NEWLINE);
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

	public static class WordContext extends ParserRuleContext {
		public WordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_word; }
	 
		public WordContext() { }
		public void copyFrom(WordContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FieldAndContext extends WordContext {
		public List<FieldContext> field() {
			return getRuleContexts(FieldContext.class);
		}
		public FieldContext field(int i) {
			return getRuleContext(FieldContext.class,i);
		}
		public FieldAndContext(WordContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Text2ExprVisitor ) return ((Text2ExprVisitor<? extends T>)visitor).visitFieldAnd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FieldSingularContext extends WordContext {
		public FieldContext field() {
			return getRuleContext(FieldContext.class,0);
		}
		public FieldSingularContext(WordContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Text2ExprVisitor ) return ((Text2ExprVisitor<? extends T>)visitor).visitFieldSingular(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FieldOrContext extends WordContext {
		public List<FieldContext> field() {
			return getRuleContexts(FieldContext.class);
		}
		public FieldContext field(int i) {
			return getRuleContext(FieldContext.class,i);
		}
		public FieldOrContext(WordContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Text2ExprVisitor ) return ((Text2ExprVisitor<? extends T>)visitor).visitFieldOr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WordContext word() throws RecognitionException {
		WordContext _localctx = new WordContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_word);
		try {
			setState(40);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new FieldOrContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(31);
				field();
				setState(32);
				match(T__1);
				setState(33);
				field();
				}
				break;
			case 2:
				_localctx = new FieldAndContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(35);
				field();
				setState(36);
				match(T__2);
				setState(37);
				field();
				}
				break;
			case 3:
				_localctx = new FieldSingularContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(39);
				field();
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

	public static class FieldContext extends ParserRuleContext {
		public TerminalNode PREFIX() { return getToken(Text2ExprParser.PREFIX, 0); }
		public TerminalNode JAPANESE() { return getToken(Text2ExprParser.JAPANESE, 0); }
		public FieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Text2ExprVisitor ) return ((Text2ExprVisitor<? extends T>)visitor).visitField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldContext field() throws RecognitionException {
		FieldContext _localctx = new FieldContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_field);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			match(PREFIX);
			setState(43);
			match(T__3);
			setState(44);
			match(JAPANESE);
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

	public static class ExprContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(Text2ExprParser.NUMBER, 0); }
		public TerminalNode ID() { return getToken(Text2ExprParser.ID, 0); }
		public TerminalNode NEWLINE() { return getToken(Text2ExprParser.NEWLINE, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Text2ExprVisitor ) return ((Text2ExprVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << NUMBER) | (1L << ID) | (1L << NEWLINE))) != 0)) ) {
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\26\63\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\6\2\16\n\2\r\2\16\2\17\3\2\3\2\6\2\24"+
		"\n\2\r\2\16\2\25\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3 \n\3\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\5\4+\n\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\2\2\7\2"+
		"\4\6\b\n\2\3\5\2\3\3\7\17\23\25\2\62\2\r\3\2\2\2\4\37\3\2\2\2\6*\3\2\2"+
		"\2\b,\3\2\2\2\n\60\3\2\2\2\f\16\5\4\3\2\r\f\3\2\2\2\16\17\3\2\2\2\17\r"+
		"\3\2\2\2\17\20\3\2\2\2\20\21\3\2\2\2\21\23\7\25\2\2\22\24\5\n\6\2\23\22"+
		"\3\2\2\2\24\25\3\2\2\2\25\23\3\2\2\2\25\26\3\2\2\2\26\3\3\2\2\2\27\30"+
		"\5\6\4\2\30\31\7\25\2\2\31 \3\2\2\2\32\33\7\24\2\2\33\34\7\3\2\2\34\35"+
		"\5\6\4\2\35\36\7\25\2\2\36 \3\2\2\2\37\27\3\2\2\2\37\32\3\2\2\2 \5\3\2"+
		"\2\2!\"\5\b\5\2\"#\7\4\2\2#$\5\b\5\2$+\3\2\2\2%&\5\b\5\2&\'\7\5\2\2\'"+
		"(\5\b\5\2(+\3\2\2\2)+\5\b\5\2*!\3\2\2\2*%\3\2\2\2*)\3\2\2\2+\7\3\2\2\2"+
		",-\7\20\2\2-.\7\6\2\2./\7\22\2\2/\t\3\2\2\2\60\61\t\2\2\2\61\13\3\2\2"+
		"\2\6\17\25\37*";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}