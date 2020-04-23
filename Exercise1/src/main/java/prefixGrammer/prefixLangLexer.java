// Generated from /Users/courtneymiller/Desktop/P.O.P.L./Exercise1/src/main/antlr/prefixLang.g4 by ANTLR 4.8
package prefixGrammer;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class prefixLangLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, VARIABLE=11, INTVAL=12, STR=13, BOOLVAL=14, WS=15;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "VARIABLE", "INTVAL", "STR", "BOOLVAL", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "'Or'", "')'", "'Not'", "'And'", "'If'", "'Let'", "'Add'", 
			"'Lambda'", "'Call'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, "VARIABLE", 
			"INTVAL", "STR", "BOOLVAL", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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


	public prefixLangLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "prefixLang.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\21k\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\3\3\3\3\3"+
		"\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3"+
		"\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3"+
		"\f\3\f\3\f\7\fK\n\f\f\f\16\fN\13\f\3\r\6\rQ\n\r\r\r\16\rR\3\16\6\16V\n"+
		"\16\r\16\16\16W\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17c\n\17"+
		"\3\20\6\20f\n\20\r\20\16\20g\3\20\3\20\2\2\21\3\3\5\4\7\5\t\6\13\7\r\b"+
		"\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21\3\2\5\3\2\62;\4\2C"+
		"\\c|\5\2\13\f\17\17\"\"\2p\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2"+
		"\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2"+
		"\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3"+
		"\2\2\2\3!\3\2\2\2\5#\3\2\2\2\7&\3\2\2\2\t(\3\2\2\2\13,\3\2\2\2\r\60\3"+
		"\2\2\2\17\63\3\2\2\2\21\67\3\2\2\2\23;\3\2\2\2\25B\3\2\2\2\27G\3\2\2\2"+
		"\31P\3\2\2\2\33U\3\2\2\2\35b\3\2\2\2\37e\3\2\2\2!\"\7*\2\2\"\4\3\2\2\2"+
		"#$\7Q\2\2$%\7t\2\2%\6\3\2\2\2&\'\7+\2\2\'\b\3\2\2\2()\7P\2\2)*\7q\2\2"+
		"*+\7v\2\2+\n\3\2\2\2,-\7C\2\2-.\7p\2\2./\7f\2\2/\f\3\2\2\2\60\61\7K\2"+
		"\2\61\62\7h\2\2\62\16\3\2\2\2\63\64\7N\2\2\64\65\7g\2\2\65\66\7v\2\2\66"+
		"\20\3\2\2\2\678\7C\2\289\7f\2\29:\7f\2\2:\22\3\2\2\2;<\7N\2\2<=\7c\2\2"+
		"=>\7o\2\2>?\7d\2\2?@\7f\2\2@A\7c\2\2A\24\3\2\2\2BC\7E\2\2CD\7c\2\2DE\7"+
		"n\2\2EF\7n\2\2F\26\3\2\2\2GL\5\33\16\2HK\5\33\16\2IK\5\31\r\2JH\3\2\2"+
		"\2JI\3\2\2\2KN\3\2\2\2LJ\3\2\2\2LM\3\2\2\2M\30\3\2\2\2NL\3\2\2\2OQ\t\2"+
		"\2\2PO\3\2\2\2QR\3\2\2\2RP\3\2\2\2RS\3\2\2\2S\32\3\2\2\2TV\t\3\2\2UT\3"+
		"\2\2\2VW\3\2\2\2WU\3\2\2\2WX\3\2\2\2X\34\3\2\2\2YZ\7V\2\2Z[\7t\2\2[\\"+
		"\7w\2\2\\c\7g\2\2]^\7H\2\2^_\7c\2\2_`\7n\2\2`a\7u\2\2ac\7g\2\2bY\3\2\2"+
		"\2b]\3\2\2\2c\36\3\2\2\2df\t\4\2\2ed\3\2\2\2fg\3\2\2\2ge\3\2\2\2gh\3\2"+
		"\2\2hi\3\2\2\2ij\b\20\2\2j \3\2\2\2\t\2JLRWbg\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}