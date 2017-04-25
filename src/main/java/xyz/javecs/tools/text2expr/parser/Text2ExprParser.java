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
		T__9=10, T__10=11, PREFIX=12, JAPANESE=13, NUMBER=14, ID=15, NEWLINE=16, 
		WS=17;
	public static final int
		RULE_text2expr = 0, RULE_text = 1, RULE_word = 2, RULE_expr = 3;
	public static final String[] ruleNames = {
		"text2expr", "text", "word", "expr"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'='", "':'", "'^'", "'+'", "'-'", "'*'", "'/'", "'%'", "'('", "')'", 
		"','"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		"PREFIX", "JAPANESE", "NUMBER", "ID", "NEWLINE", "WS"
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
			setState(9); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(8);
				text();
				}
				}
				setState(11); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==PREFIX || _la==ID );
			setState(13);
			match(NEWLINE);
			setState(15); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(14);
				expr();
				}
				}
				setState(17); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << NUMBER) | (1L << ID))) != 0) );
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
		public WordContext word() {
			return getRuleContext(WordContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(Text2ExprParser.NEWLINE, 0); }
		public TerminalNode ID() { return getToken(Text2ExprParser.ID, 0); }
		public TextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_text; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Text2ExprVisitor ) return ((Text2ExprVisitor<? extends T>)visitor).visitText(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextContext text() throws RecognitionException {
		TextContext _localctx = new TextContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_text);
		try {
			setState(27);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PREFIX:
				enterOuterAlt(_localctx, 1);
				{
				setState(19);
				word();
				setState(20);
				match(NEWLINE);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(22);
				match(ID);
				setState(23);
				match(T__0);
				setState(24);
				word();
				setState(25);
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
		public TerminalNode PREFIX() { return getToken(Text2ExprParser.PREFIX, 0); }
		public TerminalNode JAPANESE() { return getToken(Text2ExprParser.JAPANESE, 0); }
		public WordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_word; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Text2ExprVisitor ) return ((Text2ExprVisitor<? extends T>)visitor).visitWord(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WordContext word() throws RecognitionException {
		WordContext _localctx = new WordContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_word);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			match(PREFIX);
			setState(30);
			match(T__1);
			setState(31);
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
		enterRule(_localctx, 6, RULE_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << NUMBER) | (1L << ID))) != 0)) ) {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\23&\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\3\2\6\2\f\n\2\r\2\16\2\r\3\2\3\2\6\2\22\n\2\r\2\16"+
		"\2\23\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\36\n\3\3\4\3\4\3\4\3\4\3\5\3"+
		"\5\3\5\2\2\6\2\4\6\b\2\3\5\2\3\3\5\r\20\21\2$\2\13\3\2\2\2\4\35\3\2\2"+
		"\2\6\37\3\2\2\2\b#\3\2\2\2\n\f\5\4\3\2\13\n\3\2\2\2\f\r\3\2\2\2\r\13\3"+
		"\2\2\2\r\16\3\2\2\2\16\17\3\2\2\2\17\21\7\22\2\2\20\22\5\b\5\2\21\20\3"+
		"\2\2\2\22\23\3\2\2\2\23\21\3\2\2\2\23\24\3\2\2\2\24\3\3\2\2\2\25\26\5"+
		"\6\4\2\26\27\7\22\2\2\27\36\3\2\2\2\30\31\7\21\2\2\31\32\7\3\2\2\32\33"+
		"\5\6\4\2\33\34\7\22\2\2\34\36\3\2\2\2\35\25\3\2\2\2\35\30\3\2\2\2\36\5"+
		"\3\2\2\2\37 \7\16\2\2 !\7\4\2\2!\"\7\17\2\2\"\7\3\2\2\2#$\t\2\2\2$\t\3"+
		"\2\2\2\5\r\23\35";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}