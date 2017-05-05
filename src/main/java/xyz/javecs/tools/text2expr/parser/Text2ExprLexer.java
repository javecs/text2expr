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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, PREFIX=8, LEVEL=9, 
		JAPANESE=10, SYMBOL=11, OPERATOR=12, NUMBER=13, ID=14, NEWLINE=15, WS=16;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "PREFIX", "LEVEL", 
		"JAPANESE", "SYMBOL", "OPERATOR", "NUMBER", "ID", "NEWLINE", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'='", "','", "':'", "'?'", "'|'", "'('", "')'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, "PREFIX", "LEVEL", "JAPANESE", 
		"SYMBOL", "OPERATOR", "NUMBER", "ID", "NEWLINE", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\22n\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2\3"+
		"\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\5\t<\n\t\3\n\3\n\3\13\6\13A\n\13\r\13\16\13B\3\f\3\f"+
		"\6\fG\n\f\r\f\16\fH\3\f\3\f\3\r\3\r\3\16\6\16P\n\16\r\16\16\16Q\3\16\3"+
		"\16\6\16V\n\16\r\16\16\16W\5\16Z\n\16\3\17\3\17\7\17^\n\17\f\17\16\17"+
		"a\13\17\3\20\5\20d\n\20\3\20\3\20\3\21\6\21i\n\21\r\21\16\21j\3\21\3\21"+
		"\2\2\22\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17"+
		"\35\20\37\21!\22\3\2\t\3\2\63\66\4\2\u3042\u3101\u4e02\ua001\7\2\'\'*"+
		"/\61\61??``\3\2\62;\4\2C\\c|\5\2\62;C\\c|\4\2\13\13\"\"\2y\2\3\3\2\2\2"+
		"\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2"+
		"\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2"+
		"\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\3#\3\2\2\2\5%\3\2\2"+
		"\2\7\'\3\2\2\2\t)\3\2\2\2\13+\3\2\2\2\r-\3\2\2\2\17/\3\2\2\2\21;\3\2\2"+
		"\2\23=\3\2\2\2\25@\3\2\2\2\27D\3\2\2\2\31L\3\2\2\2\33O\3\2\2\2\35[\3\2"+
		"\2\2\37c\3\2\2\2!h\3\2\2\2#$\7?\2\2$\4\3\2\2\2%&\7.\2\2&\6\3\2\2\2\'("+
		"\7<\2\2(\b\3\2\2\2)*\7A\2\2*\n\3\2\2\2+,\7~\2\2,\f\3\2\2\2-.\7*\2\2.\16"+
		"\3\2\2\2/\60\7+\2\2\60\20\3\2\2\2\61\62\7U\2\2\62<\7H\2\2\63\64\7R\2\2"+
		"\64<\5\23\n\2\65\66\7D\2\2\66<\7H\2\2\678\7T\2\28<\7F\2\29:\7R\2\2:<\7"+
		"T\2\2;\61\3\2\2\2;\63\3\2\2\2;\65\3\2\2\2;\67\3\2\2\2;9\3\2\2\2<\22\3"+
		"\2\2\2=>\t\2\2\2>\24\3\2\2\2?A\t\3\2\2@?\3\2\2\2AB\3\2\2\2B@\3\2\2\2B"+
		"C\3\2\2\2C\26\3\2\2\2DF\7$\2\2EG\4#\u0080\2FE\3\2\2\2GH\3\2\2\2HF\3\2"+
		"\2\2HI\3\2\2\2IJ\3\2\2\2JK\7$\2\2K\30\3\2\2\2LM\t\4\2\2M\32\3\2\2\2NP"+
		"\t\5\2\2ON\3\2\2\2PQ\3\2\2\2QO\3\2\2\2QR\3\2\2\2RY\3\2\2\2SU\7\60\2\2"+
		"TV\t\5\2\2UT\3\2\2\2VW\3\2\2\2WU\3\2\2\2WX\3\2\2\2XZ\3\2\2\2YS\3\2\2\2"+
		"YZ\3\2\2\2Z\34\3\2\2\2[_\t\6\2\2\\^\t\7\2\2]\\\3\2\2\2^a\3\2\2\2_]\3\2"+
		"\2\2_`\3\2\2\2`\36\3\2\2\2a_\3\2\2\2bd\7\17\2\2cb\3\2\2\2cd\3\2\2\2de"+
		"\3\2\2\2ef\7\f\2\2f \3\2\2\2gi\t\b\2\2hg\3\2\2\2ij\3\2\2\2jh\3\2\2\2j"+
		"k\3\2\2\2kl\3\2\2\2lm\b\21\2\2m\"\3\2\2\2\f\2;BHQWY_cj\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}