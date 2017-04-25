// Generated from Text2Expr.g4 by ANTLR 4.7
package xyz.javecs.tools.text2expr.parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Text2ExprLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, PREFIX=14, LEVEL=15, JAPANESE=16, 
		NUMBER=17, ID=18, NEWLINE=19, WS=20;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "PREFIX", "LEVEL", "JAPANESE", "NUMBER", 
		"ID", "NEWLINE", "WS"
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


	public Text2ExprLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Text2Expr.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\26x\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6"+
		"\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17P\n\17\3\20\3\20"+
		"\3\21\6\21U\n\21\r\21\16\21V\3\22\6\22Z\n\22\r\22\16\22[\3\22\3\22\6\22"+
		"`\n\22\r\22\16\22a\5\22d\n\22\3\23\3\23\7\23h\n\23\f\23\16\23k\13\23\3"+
		"\24\5\24n\n\24\3\24\3\24\3\25\6\25s\n\25\r\25\16\25t\3\25\3\25\2\2\26"+
		"\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20"+
		"\37\21!\22#\23%\24\'\25)\26\3\2\b\3\2\63\66\4\2\u3042\u3101\u4e02\ua001"+
		"\3\2\62;\4\2C\\c|\5\2\62;C\\c|\4\2\13\13\"\"\2\u0082\2\3\3\2\2\2\2\5\3"+
		"\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2"+
		"\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3"+
		"\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'"+
		"\3\2\2\2\2)\3\2\2\2\3+\3\2\2\2\5-\3\2\2\2\7/\3\2\2\2\t\61\3\2\2\2\13\63"+
		"\3\2\2\2\r\65\3\2\2\2\17\67\3\2\2\2\219\3\2\2\2\23;\3\2\2\2\25=\3\2\2"+
		"\2\27?\3\2\2\2\31A\3\2\2\2\33C\3\2\2\2\35O\3\2\2\2\37Q\3\2\2\2!T\3\2\2"+
		"\2#Y\3\2\2\2%e\3\2\2\2\'m\3\2\2\2)r\3\2\2\2+,\7?\2\2,\4\3\2\2\2-.\7~\2"+
		"\2.\6\3\2\2\2/\60\7(\2\2\60\b\3\2\2\2\61\62\7<\2\2\62\n\3\2\2\2\63\64"+
		"\7`\2\2\64\f\3\2\2\2\65\66\7-\2\2\66\16\3\2\2\2\678\7/\2\28\20\3\2\2\2"+
		"9:\7,\2\2:\22\3\2\2\2;<\7\61\2\2<\24\3\2\2\2=>\7\'\2\2>\26\3\2\2\2?@\7"+
		"*\2\2@\30\3\2\2\2AB\7+\2\2B\32\3\2\2\2CD\7.\2\2D\34\3\2\2\2EF\7U\2\2F"+
		"P\7H\2\2GH\7R\2\2HP\5\37\20\2IJ\7D\2\2JP\7H\2\2KL\7T\2\2LP\7F\2\2MN\7"+
		"R\2\2NP\7T\2\2OE\3\2\2\2OG\3\2\2\2OI\3\2\2\2OK\3\2\2\2OM\3\2\2\2P\36\3"+
		"\2\2\2QR\t\2\2\2R \3\2\2\2SU\t\3\2\2TS\3\2\2\2UV\3\2\2\2VT\3\2\2\2VW\3"+
		"\2\2\2W\"\3\2\2\2XZ\t\4\2\2YX\3\2\2\2Z[\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\"+
		"c\3\2\2\2]_\7\60\2\2^`\t\4\2\2_^\3\2\2\2`a\3\2\2\2a_\3\2\2\2ab\3\2\2\2"+
		"bd\3\2\2\2c]\3\2\2\2cd\3\2\2\2d$\3\2\2\2ei\t\5\2\2fh\t\6\2\2gf\3\2\2\2"+
		"hk\3\2\2\2ig\3\2\2\2ij\3\2\2\2j&\3\2\2\2ki\3\2\2\2ln\7\17\2\2ml\3\2\2"+
		"\2mn\3\2\2\2no\3\2\2\2op\7\f\2\2p(\3\2\2\2qs\t\7\2\2rq\3\2\2\2st\3\2\2"+
		"\2tr\3\2\2\2tu\3\2\2\2uv\3\2\2\2vw\b\25\2\2w*\3\2\2\2\13\2OV[acimt\3\b"+
		"\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}