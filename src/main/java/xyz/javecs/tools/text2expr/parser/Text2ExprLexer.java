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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, PREFIX=8, JAPANESE=9, 
		SYMBOL=10, OPERATOR=11, NUMBER=12, ID=13, NEWLINE=14, WS=15;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "PREFIX", "JAPANESE", 
		"SYMBOL", "OPERATOR", "NUMBER", "ID", "NEWLINE", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'='", "','", "':'", "'?'", "'|'", "'('", "')'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, "PREFIX", "JAPANESE", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\21p\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\3\3\3\3\4"+
		"\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t@\n\t\3\n\6\nC\n\n\r\n\16\nD\3\13\3"+
		"\13\6\13I\n\13\r\13\16\13J\3\13\3\13\3\f\3\f\3\r\6\rR\n\r\r\r\16\rS\3"+
		"\r\3\r\6\rX\n\r\r\r\16\rY\5\r\\\n\r\3\16\3\16\7\16`\n\16\f\16\16\16c\13"+
		"\16\3\17\5\17f\n\17\3\17\3\17\3\20\6\20k\n\20\r\20\16\20l\3\20\3\20\2"+
		"\2\21\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21\3\2\b\4\2\u3042\u3101\u4e02\ua001\7\2\'\'*/\61\61??``\3\2\62"+
		";\4\2C\\c|\5\2\62;C\\c|\4\2\13\13\"\"\2~\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3"+
		"\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2"+
		"\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35"+
		"\3\2\2\2\2\37\3\2\2\2\3!\3\2\2\2\5#\3\2\2\2\7%\3\2\2\2\t\'\3\2\2\2\13"+
		")\3\2\2\2\r+\3\2\2\2\17-\3\2\2\2\21?\3\2\2\2\23B\3\2\2\2\25F\3\2\2\2\27"+
		"N\3\2\2\2\31Q\3\2\2\2\33]\3\2\2\2\35e\3\2\2\2\37j\3\2\2\2!\"\7?\2\2\""+
		"\4\3\2\2\2#$\7.\2\2$\6\3\2\2\2%&\7<\2\2&\b\3\2\2\2\'(\7A\2\2(\n\3\2\2"+
		"\2)*\7~\2\2*\f\3\2\2\2+,\7*\2\2,\16\3\2\2\2-.\7+\2\2.\20\3\2\2\2/\60\7"+
		"U\2\2\60@\7H\2\2\61\62\7R\2\2\62@\7\63\2\2\63\64\7R\2\2\64@\7\64\2\2\65"+
		"\66\7R\2\2\66@\7\65\2\2\678\7R\2\28@\7\66\2\29:\7D\2\2:@\7H\2\2;<\7T\2"+
		"\2<@\7F\2\2=>\7R\2\2>@\7T\2\2?/\3\2\2\2?\61\3\2\2\2?\63\3\2\2\2?\65\3"+
		"\2\2\2?\67\3\2\2\2?9\3\2\2\2?;\3\2\2\2?=\3\2\2\2@\22\3\2\2\2AC\t\2\2\2"+
		"BA\3\2\2\2CD\3\2\2\2DB\3\2\2\2DE\3\2\2\2E\24\3\2\2\2FH\7$\2\2GI\4#\u0080"+
		"\2HG\3\2\2\2IJ\3\2\2\2JH\3\2\2\2JK\3\2\2\2KL\3\2\2\2LM\7$\2\2M\26\3\2"+
		"\2\2NO\t\3\2\2O\30\3\2\2\2PR\t\4\2\2QP\3\2\2\2RS\3\2\2\2SQ\3\2\2\2ST\3"+
		"\2\2\2T[\3\2\2\2UW\7\60\2\2VX\t\4\2\2WV\3\2\2\2XY\3\2\2\2YW\3\2\2\2YZ"+
		"\3\2\2\2Z\\\3\2\2\2[U\3\2\2\2[\\\3\2\2\2\\\32\3\2\2\2]a\t\5\2\2^`\t\6"+
		"\2\2_^\3\2\2\2`c\3\2\2\2a_\3\2\2\2ab\3\2\2\2b\34\3\2\2\2ca\3\2\2\2df\7"+
		"\17\2\2ed\3\2\2\2ef\3\2\2\2fg\3\2\2\2gh\7\f\2\2h\36\3\2\2\2ik\t\7\2\2"+
		"ji\3\2\2\2kl\3\2\2\2lj\3\2\2\2lm\3\2\2\2mn\3\2\2\2no\b\20\2\2o \3\2\2"+
		"\2\f\2?DJSY[ael\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}