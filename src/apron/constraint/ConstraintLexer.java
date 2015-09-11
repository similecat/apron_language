package apron.constraint;
// Generated from Constraint.g4 by ANTLR 4.0
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ConstraintLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__11=1, T__10=2, T__9=3, T__8=4, T__7=5, T__6=6, T__5=7, T__4=8, T__3=9, 
		T__2=10, T__1=11, T__0=12, LET=13, APP=14, UNION=15, ASSERT=16, EITHER=17, 
		PERM=18, LIMITING=19, ACTION=20, OWN_FLOWS=21, OTHERS_FLOWS=22, ALL_FLOWS=23, 
		MAX_PRIORITY=24, MIN_PRIORITY=25, EVENT_INTERCEPTION=26, MODIFY_EVENT_ORDER=27, 
		FLOW_LEVEL=28, PORT_LEVEL=29, SWITCH_LEVEL=30, IP_SRC=31, IP_DST=32, TCP_SRC=33, 
		TCP_DST=34, VLAN_ID=35, WILDCARD=36, INT=37, FLOAT=38, IP=39, WITH=40, 
		MASK=41, IP_FORMAT=42, SWITCH=43, LINK=44, ALL_SWITCHES=45, BORDER_SWITCHES=46, 
		ALL_DIRECT_LINKS=47, ALL_PATHS_AS_LINKS=48, VIRTUAL=49, SINGLE_BIG_SWITCH=50, 
		DROP=51, FORWARD=52, MODIFY=53, FIELD=54, AND=55, OR=56, NOT=57, AS=58, 
		RULE_COUNT_PER_SWITCH=59, SIZE_PERCENTAGE_PER_SWITCH=60, FROM_PKT_IN=61, 
		ARBITRARY=62, AllowNetworkAccess=63, DenyNetworkAccess=64, AllowFileSystem=65, 
		DenyFileSystem=66, AllowProcessRuntime=67, DenyProcessRuntime=68, STRING=69, 
		WS=70;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'{'", "'>'", "')'", "','", "'('", "':'", "'<'", "'='", "'}'", "'>='", 
		"';'", "'<='", "'LET'", "'APP'", "'UNION'", "'ASSERT'", "'EITHER'", "'PERM'", 
		"'LIMITING'", "'ACTION'", "'OWN_FLOWS'", "'OTHERS_FLOWS'", "'ALL_FLOWS'", 
		"'MAX_PRIORITY'", "'MIN_PRIORITY'", "'EVENT_INTERCEPTION'", "'MODIFY_EVENT_ORDER'", 
		"'FLOW_LEVEL'", "'PORT_LEVEL'", "'SWITCH_LEVEL'", "'IP_SRC'", "'IP_DST'", 
		"'TCP_SRC'", "'TCP_DST'", "'VLAN_ID'", "'WILDCARD'", "INT", "FLOAT", "'IP'", 
		"'WITH'", "'MASK'", "IP_FORMAT", "'SWITCH'", "'LINK'", "'ALL_SWITCHES'", 
		"'BORDER_SWITCHES'", "'ALL_DIRECT_LINKS'", "'ALL_PATHS_AS_LINKS'", "'VIRTUAL'", 
		"'SINGLE_BIG_SWITCH'", "'DROP'", "'FORWARD'", "'MODIFY'", "'FIELD'", "'AND'", 
		"'OR'", "'NOT'", "'AS'", "'RULE_COUNT_PER_SWITCH'", "'SIZE_PERCENTAGE_PER_SWITCH'", 
		"'FROM_PKT_IN'", "'ARBITRARY'", "'AllowNetworkAccess'", "'DenyNetworkAccess'", 
		"'AllowFileSystem'", "'DenyFileSystem'", "'AllowProcessRuntime'", "'DenyProcessRuntime'", 
		"STRING", "WS"
	};
	public static final String[] ruleNames = {
		"T__11", "T__10", "T__9", "T__8", "T__7", "T__6", "T__5", "T__4", "T__3", 
		"T__2", "T__1", "T__0", "LET", "APP", "UNION", "ASSERT", "EITHER", "PERM", 
		"LIMITING", "ACTION", "OWN_FLOWS", "OTHERS_FLOWS", "ALL_FLOWS", "MAX_PRIORITY", 
		"MIN_PRIORITY", "EVENT_INTERCEPTION", "MODIFY_EVENT_ORDER", "FLOW_LEVEL", 
		"PORT_LEVEL", "SWITCH_LEVEL", "IP_SRC", "IP_DST", "TCP_SRC", "TCP_DST", 
		"VLAN_ID", "WILDCARD", "INT", "FLOAT", "IP", "WITH", "MASK", "IP_FORMAT", 
		"SWITCH", "LINK", "ALL_SWITCHES", "BORDER_SWITCHES", "ALL_DIRECT_LINKS", 
		"ALL_PATHS_AS_LINKS", "VIRTUAL", "SINGLE_BIG_SWITCH", "DROP", "FORWARD", 
		"MODIFY", "FIELD", "AND", "OR", "NOT", "AS", "RULE_COUNT_PER_SWITCH", 
		"SIZE_PERCENTAGE_PER_SWITCH", "FROM_PKT_IN", "ARBITRARY", "AllowNetworkAccess", 
		"DenyNetworkAccess", "AllowFileSystem", "DenyFileSystem", "AllowProcessRuntime", 
		"DenyProcessRuntime", "STRING", "WS"
	};


	public ConstraintLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Constraint.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 69: WS_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\2\4H\u030e\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t"+
		"\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20"+
		"\t\20\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27"+
		"\t\27\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36"+
		"\t\36\4\37\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4"+
		"(\t(\4)\t)\4*\t*\4+\t+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62"+
		"\t\62\4\63\t\63\4\64\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4"+
		":\t:\4;\t;\4<\t<\4=\t=\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\t"+
		"E\4F\tF\4G\tG\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b"+
		"\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16"+
		"\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23"+
		"\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3!"+
		"\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3"+
		"#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3%\3%\3&\6&\u018f\n"+
		"&\r&\16&\u0190\3\'\6\'\u0194\n\'\r\'\16\'\u0195\3\'\3\'\6\'\u019a\n\'"+
		"\r\'\16\'\u019b\3(\3(\3(\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3+\6+\u01ac\n+"+
		"\r+\16+\u01ad\3+\3+\6+\u01b2\n+\r+\16+\u01b3\3+\3+\6+\u01b8\n+\r+\16+"+
		"\u01b9\3+\3+\6+\u01be\n+\r+\16+\u01bf\3,\3,\3,\3,\3,\3,\3,\3-\3-\3-\3"+
		"-\3-\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/\3/\3/\3"+
		"/\3/\3/\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3"+
		"\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\61\3"+
		"\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\62\3"+
		"\62\3\62\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3"+
		"\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3"+
		"\64\3\64\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3"+
		"\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67\3\67\38\38\38\38\39\39\39\3:\3"+
		":\3:\3:\3;\3;\3;\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3"+
		"<\3<\3<\3<\3<\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3"+
		"=\3=\3=\3=\3=\3=\3=\3=\3=\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3?\3?\3"+
		"?\3?\3?\3?\3?\3?\3?\3?\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3"+
		"@\3@\3@\3@\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3B\3"+
		"B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3C\3C\3C\3C\3C\3C\3C\3C\3"+
		"C\3C\3C\3C\3C\3C\3C\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3"+
		"D\3D\3D\3D\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3"+
		"F\6F\u0304\nF\rF\16F\u0305\3G\6G\u0309\nG\rG\16G\u030a\3G\3G\2H\3\3\1"+
		"\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23\13\1\25\f\1\27\r\1\31"+
		"\16\1\33\17\1\35\20\1\37\21\1!\22\1#\23\1%\24\1\'\25\1)\26\1+\27\1-\30"+
		"\1/\31\1\61\32\1\63\33\1\65\34\1\67\35\19\36\1;\37\1= \1?!\1A\"\1C#\1"+
		"E$\1G%\1I&\1K\'\1M(\1O)\1Q*\1S+\1U,\1W-\1Y.\1[/\1]\60\1_\61\1a\62\1c\63"+
		"\1e\64\1g\65\1i\66\1k\67\1m8\1o9\1q:\1s;\1u<\1w=\1y>\1{?\1}@\1\177A\1"+
		"\u0081B\1\u0083C\1\u0085D\1\u0087E\1\u0089F\1\u008bG\1\u008dH\2\3\2\13"+
		"\3\62;\3\62;\3\62;\3\62;\3\62;\3\62;\3\62;\5C\\aac|\5\13\f\17\17\"\"\u0316"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
		"\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2"+
		"U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3"+
		"\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2"+
		"\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2"+
		"{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085"+
		"\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2"+
		"\2\3\u008f\3\2\2\2\5\u0091\3\2\2\2\7\u0093\3\2\2\2\t\u0095\3\2\2\2\13"+
		"\u0097\3\2\2\2\r\u0099\3\2\2\2\17\u009b\3\2\2\2\21\u009d\3\2\2\2\23\u009f"+
		"\3\2\2\2\25\u00a1\3\2\2\2\27\u00a4\3\2\2\2\31\u00a6\3\2\2\2\33\u00a9\3"+
		"\2\2\2\35\u00ad\3\2\2\2\37\u00b1\3\2\2\2!\u00b7\3\2\2\2#\u00be\3\2\2\2"+
		"%\u00c5\3\2\2\2\'\u00ca\3\2\2\2)\u00d3\3\2\2\2+\u00da\3\2\2\2-\u00e4\3"+
		"\2\2\2/\u00f1\3\2\2\2\61\u00fb\3\2\2\2\63\u0108\3\2\2\2\65\u0115\3\2\2"+
		"\2\67\u0128\3\2\2\29\u013b\3\2\2\2;\u0146\3\2\2\2=\u0151\3\2\2\2?\u015e"+
		"\3\2\2\2A\u0165\3\2\2\2C\u016c\3\2\2\2E\u0174\3\2\2\2G\u017c\3\2\2\2I"+
		"\u0184\3\2\2\2K\u018e\3\2\2\2M\u0193\3\2\2\2O\u019d\3\2\2\2Q\u01a0\3\2"+
		"\2\2S\u01a5\3\2\2\2U\u01ab\3\2\2\2W\u01c1\3\2\2\2Y\u01c8\3\2\2\2[\u01cd"+
		"\3\2\2\2]\u01da\3\2\2\2_\u01ea\3\2\2\2a\u01fb\3\2\2\2c\u020e\3\2\2\2e"+
		"\u0216\3\2\2\2g\u0228\3\2\2\2i\u022d\3\2\2\2k\u0235\3\2\2\2m\u023c\3\2"+
		"\2\2o\u0242\3\2\2\2q\u0246\3\2\2\2s\u0249\3\2\2\2u\u024d\3\2\2\2w\u0250"+
		"\3\2\2\2y\u0266\3\2\2\2{\u0281\3\2\2\2}\u028d\3\2\2\2\177\u0297\3\2\2"+
		"\2\u0081\u02aa\3\2\2\2\u0083\u02bc\3\2\2\2\u0085\u02cc\3\2\2\2\u0087\u02db"+
		"\3\2\2\2\u0089\u02ef\3\2\2\2\u008b\u0303\3\2\2\2\u008d\u0308\3\2\2\2\u008f"+
		"\u0090\7}\2\2\u0090\4\3\2\2\2\u0091\u0092\7@\2\2\u0092\6\3\2\2\2\u0093"+
		"\u0094\7+\2\2\u0094\b\3\2\2\2\u0095\u0096\7.\2\2\u0096\n\3\2\2\2\u0097"+
		"\u0098\7*\2\2\u0098\f\3\2\2\2\u0099\u009a\7<\2\2\u009a\16\3\2\2\2\u009b"+
		"\u009c\7>\2\2\u009c\20\3\2\2\2\u009d\u009e\7?\2\2\u009e\22\3\2\2\2\u009f"+
		"\u00a0\7\177\2\2\u00a0\24\3\2\2\2\u00a1\u00a2\7@\2\2\u00a2\u00a3\7?\2"+
		"\2\u00a3\26\3\2\2\2\u00a4\u00a5\7=\2\2\u00a5\30\3\2\2\2\u00a6\u00a7\7"+
		">\2\2\u00a7\u00a8\7?\2\2\u00a8\32\3\2\2\2\u00a9\u00aa\7N\2\2\u00aa\u00ab"+
		"\7G\2\2\u00ab\u00ac\7V\2\2\u00ac\34\3\2\2\2\u00ad\u00ae\7C\2\2\u00ae\u00af"+
		"\7R\2\2\u00af\u00b0\7R\2\2\u00b0\36\3\2\2\2\u00b1\u00b2\7W\2\2\u00b2\u00b3"+
		"\7P\2\2\u00b3\u00b4\7K\2\2\u00b4\u00b5\7Q\2\2\u00b5\u00b6\7P\2\2\u00b6"+
		" \3\2\2\2\u00b7\u00b8\7C\2\2\u00b8\u00b9\7U\2\2\u00b9\u00ba\7U\2\2\u00ba"+
		"\u00bb\7G\2\2\u00bb\u00bc\7T\2\2\u00bc\u00bd\7V\2\2\u00bd\"\3\2\2\2\u00be"+
		"\u00bf\7G\2\2\u00bf\u00c0\7K\2\2\u00c0\u00c1\7V\2\2\u00c1\u00c2\7J\2\2"+
		"\u00c2\u00c3\7G\2\2\u00c3\u00c4\7T\2\2\u00c4$\3\2\2\2\u00c5\u00c6\7R\2"+
		"\2\u00c6\u00c7\7G\2\2\u00c7\u00c8\7T\2\2\u00c8\u00c9\7O\2\2\u00c9&\3\2"+
		"\2\2\u00ca\u00cb\7N\2\2\u00cb\u00cc\7K\2\2\u00cc\u00cd\7O\2\2\u00cd\u00ce"+
		"\7K\2\2\u00ce\u00cf\7V\2\2\u00cf\u00d0\7K\2\2\u00d0\u00d1\7P\2\2\u00d1"+
		"\u00d2\7I\2\2\u00d2(\3\2\2\2\u00d3\u00d4\7C\2\2\u00d4\u00d5\7E\2\2\u00d5"+
		"\u00d6\7V\2\2\u00d6\u00d7\7K\2\2\u00d7\u00d8\7Q\2\2\u00d8\u00d9\7P\2\2"+
		"\u00d9*\3\2\2\2\u00da\u00db\7Q\2\2\u00db\u00dc\7Y\2\2\u00dc\u00dd\7P\2"+
		"\2\u00dd\u00de\7a\2\2\u00de\u00df\7H\2\2\u00df\u00e0\7N\2\2\u00e0\u00e1"+
		"\7Q\2\2\u00e1\u00e2\7Y\2\2\u00e2\u00e3\7U\2\2\u00e3,\3\2\2\2\u00e4\u00e5"+
		"\7Q\2\2\u00e5\u00e6\7V\2\2\u00e6\u00e7\7J\2\2\u00e7\u00e8\7G\2\2\u00e8"+
		"\u00e9\7T\2\2\u00e9\u00ea\7U\2\2\u00ea\u00eb\7a\2\2\u00eb\u00ec\7H\2\2"+
		"\u00ec\u00ed\7N\2\2\u00ed\u00ee\7Q\2\2\u00ee\u00ef\7Y\2\2\u00ef\u00f0"+
		"\7U\2\2\u00f0.\3\2\2\2\u00f1\u00f2\7C\2\2\u00f2\u00f3\7N\2\2\u00f3\u00f4"+
		"\7N\2\2\u00f4\u00f5\7a\2\2\u00f5\u00f6\7H\2\2\u00f6\u00f7\7N\2\2\u00f7"+
		"\u00f8\7Q\2\2\u00f8\u00f9\7Y\2\2\u00f9\u00fa\7U\2\2\u00fa\60\3\2\2\2\u00fb"+
		"\u00fc\7O\2\2\u00fc\u00fd\7C\2\2\u00fd\u00fe\7Z\2\2\u00fe\u00ff\7a\2\2"+
		"\u00ff\u0100\7R\2\2\u0100\u0101\7T\2\2\u0101\u0102\7K\2\2\u0102\u0103"+
		"\7Q\2\2\u0103\u0104\7T\2\2\u0104\u0105\7K\2\2\u0105\u0106\7V\2\2\u0106"+
		"\u0107\7[\2\2\u0107\62\3\2\2\2\u0108\u0109\7O\2\2\u0109\u010a\7K\2\2\u010a"+
		"\u010b\7P\2\2\u010b\u010c\7a\2\2\u010c\u010d\7R\2\2\u010d\u010e\7T\2\2"+
		"\u010e\u010f\7K\2\2\u010f\u0110\7Q\2\2\u0110\u0111\7T\2\2\u0111\u0112"+
		"\7K\2\2\u0112\u0113\7V\2\2\u0113\u0114\7[\2\2\u0114\64\3\2\2\2\u0115\u0116"+
		"\7G\2\2\u0116\u0117\7X\2\2\u0117\u0118\7G\2\2\u0118\u0119\7P\2\2\u0119"+
		"\u011a\7V\2\2\u011a\u011b\7a\2\2\u011b\u011c\7K\2\2\u011c\u011d\7P\2\2"+
		"\u011d\u011e\7V\2\2\u011e\u011f\7G\2\2\u011f\u0120\7T\2\2\u0120\u0121"+
		"\7E\2\2\u0121\u0122\7G\2\2\u0122\u0123\7R\2\2\u0123\u0124\7V\2\2\u0124"+
		"\u0125\7K\2\2\u0125\u0126\7Q\2\2\u0126\u0127\7P\2\2\u0127\66\3\2\2\2\u0128"+
		"\u0129\7O\2\2\u0129\u012a\7Q\2\2\u012a\u012b\7F\2\2\u012b\u012c\7K\2\2"+
		"\u012c\u012d\7H\2\2\u012d\u012e\7[\2\2\u012e\u012f\7a\2\2\u012f\u0130"+
		"\7G\2\2\u0130\u0131\7X\2\2\u0131\u0132\7G\2\2\u0132\u0133\7P\2\2\u0133"+
		"\u0134\7V\2\2\u0134\u0135\7a\2\2\u0135\u0136\7Q\2\2\u0136\u0137\7T\2\2"+
		"\u0137\u0138\7F\2\2\u0138\u0139\7G\2\2\u0139\u013a\7T\2\2\u013a8\3\2\2"+
		"\2\u013b\u013c\7H\2\2\u013c\u013d\7N\2\2\u013d\u013e\7Q\2\2\u013e\u013f"+
		"\7Y\2\2\u013f\u0140\7a\2\2\u0140\u0141\7N\2\2\u0141\u0142\7G\2\2\u0142"+
		"\u0143\7X\2\2\u0143\u0144\7G\2\2\u0144\u0145\7N\2\2\u0145:\3\2\2\2\u0146"+
		"\u0147\7R\2\2\u0147\u0148\7Q\2\2\u0148\u0149\7T\2\2\u0149\u014a\7V\2\2"+
		"\u014a\u014b\7a\2\2\u014b\u014c\7N\2\2\u014c\u014d\7G\2\2\u014d\u014e"+
		"\7X\2\2\u014e\u014f\7G\2\2\u014f\u0150\7N\2\2\u0150<\3\2\2\2\u0151\u0152"+
		"\7U\2\2\u0152\u0153\7Y\2\2\u0153\u0154\7K\2\2\u0154\u0155\7V\2\2\u0155"+
		"\u0156\7E\2\2\u0156\u0157\7J\2\2\u0157\u0158\7a\2\2\u0158\u0159\7N\2\2"+
		"\u0159\u015a\7G\2\2\u015a\u015b\7X\2\2\u015b\u015c\7G\2\2\u015c\u015d"+
		"\7N\2\2\u015d>\3\2\2\2\u015e\u015f\7K\2\2\u015f\u0160\7R\2\2\u0160\u0161"+
		"\7a\2\2\u0161\u0162\7U\2\2\u0162\u0163\7T\2\2\u0163\u0164\7E\2\2\u0164"+
		"@\3\2\2\2\u0165\u0166\7K\2\2\u0166\u0167\7R\2\2\u0167\u0168\7a\2\2\u0168"+
		"\u0169\7F\2\2\u0169\u016a\7U\2\2\u016a\u016b\7V\2\2\u016bB\3\2\2\2\u016c"+
		"\u016d\7V\2\2\u016d\u016e\7E\2\2\u016e\u016f\7R\2\2\u016f\u0170\7a\2\2"+
		"\u0170\u0171\7U\2\2\u0171\u0172\7T\2\2\u0172\u0173\7E\2\2\u0173D\3\2\2"+
		"\2\u0174\u0175\7V\2\2\u0175\u0176\7E\2\2\u0176\u0177\7R\2\2\u0177\u0178"+
		"\7a\2\2\u0178\u0179\7F\2\2\u0179\u017a\7U\2\2\u017a\u017b\7V\2\2\u017b"+
		"F\3\2\2\2\u017c\u017d\7X\2\2\u017d\u017e\7N\2\2\u017e\u017f\7C\2\2\u017f"+
		"\u0180\7P\2\2\u0180\u0181\7a\2\2\u0181\u0182\7K\2\2\u0182\u0183\7F\2\2"+
		"\u0183H\3\2\2\2\u0184\u0185\7Y\2\2\u0185\u0186\7K\2\2\u0186\u0187\7N\2"+
		"\2\u0187\u0188\7F\2\2\u0188\u0189\7E\2\2\u0189\u018a\7C\2\2\u018a\u018b"+
		"\7T\2\2\u018b\u018c\7F\2\2\u018cJ\3\2\2\2\u018d\u018f\t\2\2\2\u018e\u018d"+
		"\3\2\2\2\u018f\u0190\3\2\2\2\u0190\u018e\3\2\2\2\u0190\u0191\3\2\2\2\u0191"+
		"L\3\2\2\2\u0192\u0194\t\3\2\2\u0193\u0192\3\2\2\2\u0194\u0195\3\2\2\2"+
		"\u0195\u0193\3\2\2\2\u0195\u0196\3\2\2\2\u0196\u0197\3\2\2\2\u0197\u0199"+
		"\13\2\2\2\u0198\u019a\t\4\2\2\u0199\u0198\3\2\2\2\u019a\u019b\3\2\2\2"+
		"\u019b\u0199\3\2\2\2\u019b\u019c\3\2\2\2\u019cN\3\2\2\2\u019d\u019e\7"+
		"K\2\2\u019e\u019f\7R\2\2\u019fP\3\2\2\2\u01a0\u01a1\7Y\2\2\u01a1\u01a2"+
		"\7K\2\2\u01a2\u01a3\7V\2\2\u01a3\u01a4\7J\2\2\u01a4R\3\2\2\2\u01a5\u01a6"+
		"\7O\2\2\u01a6\u01a7\7C\2\2\u01a7\u01a8\7U\2\2\u01a8\u01a9\7M\2\2\u01a9"+
		"T\3\2\2\2\u01aa\u01ac\t\5\2\2\u01ab\u01aa\3\2\2\2\u01ac\u01ad\3\2\2\2"+
		"\u01ad\u01ab\3\2\2\2\u01ad\u01ae\3\2\2\2\u01ae\u01af\3\2\2\2\u01af\u01b1"+
		"\13\2\2\2\u01b0\u01b2\t\6\2\2\u01b1\u01b0\3\2\2\2\u01b2\u01b3\3\2\2\2"+
		"\u01b3\u01b1\3\2\2\2\u01b3\u01b4\3\2\2\2\u01b4\u01b5\3\2\2\2\u01b5\u01b7"+
		"\13\2\2\2\u01b6\u01b8\t\7\2\2\u01b7\u01b6\3\2\2\2\u01b8\u01b9\3\2\2\2"+
		"\u01b9\u01b7\3\2\2\2\u01b9\u01ba\3\2\2\2\u01ba\u01bb\3\2\2\2\u01bb\u01bd"+
		"\13\2\2\2\u01bc\u01be\t\b\2\2\u01bd\u01bc\3\2\2\2\u01be\u01bf\3\2\2\2"+
		"\u01bf\u01bd\3\2\2\2\u01bf\u01c0\3\2\2\2\u01c0V\3\2\2\2\u01c1\u01c2\7"+
		"U\2\2\u01c2\u01c3\7Y\2\2\u01c3\u01c4\7K\2\2\u01c4\u01c5\7V\2\2\u01c5\u01c6"+
		"\7E\2\2\u01c6\u01c7\7J\2\2\u01c7X\3\2\2\2\u01c8\u01c9\7N\2\2\u01c9\u01ca"+
		"\7K\2\2\u01ca\u01cb\7P\2\2\u01cb\u01cc\7M\2\2\u01ccZ\3\2\2\2\u01cd\u01ce"+
		"\7C\2\2\u01ce\u01cf\7N\2\2\u01cf\u01d0\7N\2\2\u01d0\u01d1\7a\2\2\u01d1"+
		"\u01d2\7U\2\2\u01d2\u01d3\7Y\2\2\u01d3\u01d4\7K\2\2\u01d4\u01d5\7V\2\2"+
		"\u01d5\u01d6\7E\2\2\u01d6\u01d7\7J\2\2\u01d7\u01d8\7G\2\2\u01d8\u01d9"+
		"\7U\2\2\u01d9\\\3\2\2\2\u01da\u01db\7D\2\2\u01db\u01dc\7Q\2\2\u01dc\u01dd"+
		"\7T\2\2\u01dd\u01de\7F\2\2\u01de\u01df\7G\2\2\u01df\u01e0\7T\2\2\u01e0"+
		"\u01e1\7a\2\2\u01e1\u01e2\7U\2\2\u01e2\u01e3\7Y\2\2\u01e3\u01e4\7K\2\2"+
		"\u01e4\u01e5\7V\2\2\u01e5\u01e6\7E\2\2\u01e6\u01e7\7J\2\2\u01e7\u01e8"+
		"\7G\2\2\u01e8\u01e9\7U\2\2\u01e9^\3\2\2\2\u01ea\u01eb\7C\2\2\u01eb\u01ec"+
		"\7N\2\2\u01ec\u01ed\7N\2\2\u01ed\u01ee\7a\2\2\u01ee\u01ef\7F\2\2\u01ef"+
		"\u01f0\7K\2\2\u01f0\u01f1\7T\2\2\u01f1\u01f2\7G\2\2\u01f2\u01f3\7E\2\2"+
		"\u01f3\u01f4\7V\2\2\u01f4\u01f5\7a\2\2\u01f5\u01f6\7N\2\2\u01f6\u01f7"+
		"\7K\2\2\u01f7\u01f8\7P\2\2\u01f8\u01f9\7M\2\2\u01f9\u01fa\7U\2\2\u01fa"+
		"`\3\2\2\2\u01fb\u01fc\7C\2\2\u01fc\u01fd\7N\2\2\u01fd\u01fe\7N\2\2\u01fe"+
		"\u01ff\7a\2\2\u01ff\u0200\7R\2\2\u0200\u0201\7C\2\2\u0201\u0202\7V\2\2"+
		"\u0202\u0203\7J\2\2\u0203\u0204\7U\2\2\u0204\u0205\7a\2\2\u0205\u0206"+
		"\7C\2\2\u0206\u0207\7U\2\2\u0207\u0208\7a\2\2\u0208\u0209\7N\2\2\u0209"+
		"\u020a\7K\2\2\u020a\u020b\7P\2\2\u020b\u020c\7M\2\2\u020c\u020d\7U\2\2"+
		"\u020db\3\2\2\2\u020e\u020f\7X\2\2\u020f\u0210\7K\2\2\u0210\u0211\7T\2"+
		"\2\u0211\u0212\7V\2\2\u0212\u0213\7W\2\2\u0213\u0214\7C\2\2\u0214\u0215"+
		"\7N\2\2\u0215d\3\2\2\2\u0216\u0217\7U\2\2\u0217\u0218\7K\2\2\u0218\u0219"+
		"\7P\2\2\u0219\u021a\7I\2\2\u021a\u021b\7N\2\2\u021b\u021c\7G\2\2\u021c"+
		"\u021d\7a\2\2\u021d\u021e\7D\2\2\u021e\u021f\7K\2\2\u021f\u0220\7I\2\2"+
		"\u0220\u0221\7a\2\2\u0221\u0222\7U\2\2\u0222\u0223\7Y\2\2\u0223\u0224"+
		"\7K\2\2\u0224\u0225\7V\2\2\u0225\u0226\7E\2\2\u0226\u0227\7J\2\2\u0227"+
		"f\3\2\2\2\u0228\u0229\7F\2\2\u0229\u022a\7T\2\2\u022a\u022b\7Q\2\2\u022b"+
		"\u022c\7R\2\2\u022ch\3\2\2\2\u022d\u022e\7H\2\2\u022e\u022f\7Q\2\2\u022f"+
		"\u0230\7T\2\2\u0230\u0231\7Y\2\2\u0231\u0232\7C\2\2\u0232\u0233\7T\2\2"+
		"\u0233\u0234\7F\2\2\u0234j\3\2\2\2\u0235\u0236\7O\2\2\u0236\u0237\7Q\2"+
		"\2\u0237\u0238\7F\2\2\u0238\u0239\7K\2\2\u0239\u023a\7H\2\2\u023a\u023b"+
		"\7[\2\2\u023bl\3\2\2\2\u023c\u023d\7H\2\2\u023d\u023e\7K\2\2\u023e\u023f"+
		"\7G\2\2\u023f\u0240\7N\2\2\u0240\u0241\7F\2\2\u0241n\3\2\2\2\u0242\u0243"+
		"\7C\2\2\u0243\u0244\7P\2\2\u0244\u0245\7F\2\2\u0245p\3\2\2\2\u0246\u0247"+
		"\7Q\2\2\u0247\u0248\7T\2\2\u0248r\3\2\2\2\u0249\u024a\7P\2\2\u024a\u024b"+
		"\7Q\2\2\u024b\u024c\7V\2\2\u024ct\3\2\2\2\u024d\u024e\7C\2\2\u024e\u024f"+
		"\7U\2\2\u024fv\3\2\2\2\u0250\u0251\7T\2\2\u0251\u0252\7W\2\2\u0252\u0253"+
		"\7N\2\2\u0253\u0254\7G\2\2\u0254\u0255\7a\2\2\u0255\u0256\7E\2\2\u0256"+
		"\u0257\7Q\2\2\u0257\u0258\7W\2\2\u0258\u0259\7P\2\2\u0259\u025a\7V\2\2"+
		"\u025a\u025b\7a\2\2\u025b\u025c\7R\2\2\u025c\u025d\7G\2\2\u025d\u025e"+
		"\7T\2\2\u025e\u025f\7a\2\2\u025f\u0260\7U\2\2\u0260\u0261\7Y\2\2\u0261"+
		"\u0262\7K\2\2\u0262\u0263\7V\2\2\u0263\u0264\7E\2\2\u0264\u0265\7J\2\2"+
		"\u0265x\3\2\2\2\u0266\u0267\7U\2\2\u0267\u0268\7K\2\2\u0268\u0269\7\\"+
		"\2\2\u0269\u026a\7G\2\2\u026a\u026b\7a\2\2\u026b\u026c\7R\2\2\u026c\u026d"+
		"\7G\2\2\u026d\u026e\7T\2\2\u026e\u026f\7E\2\2\u026f\u0270\7G\2\2\u0270"+
		"\u0271\7P\2\2\u0271\u0272\7V\2\2\u0272\u0273\7C\2\2\u0273\u0274\7I\2\2"+
		"\u0274\u0275\7G\2\2\u0275\u0276\7a\2\2\u0276\u0277\7R\2\2\u0277\u0278"+
		"\7G\2\2\u0278\u0279\7T\2\2\u0279\u027a\7a\2\2\u027a\u027b\7U\2\2\u027b"+
		"\u027c\7Y\2\2\u027c\u027d\7K\2\2\u027d\u027e\7V\2\2\u027e\u027f\7E\2\2"+
		"\u027f\u0280\7J\2\2\u0280z\3\2\2\2\u0281\u0282\7H\2\2\u0282\u0283\7T\2"+
		"\2\u0283\u0284\7Q\2\2\u0284\u0285\7O\2\2\u0285\u0286\7a\2\2\u0286\u0287"+
		"\7R\2\2\u0287\u0288\7M\2\2\u0288\u0289\7V\2\2\u0289\u028a\7a\2\2\u028a"+
		"\u028b\7K\2\2\u028b\u028c\7P\2\2\u028c|\3\2\2\2\u028d\u028e\7C\2\2\u028e"+
		"\u028f\7T\2\2\u028f\u0290\7D\2\2\u0290\u0291\7K\2\2\u0291\u0292\7V\2\2"+
		"\u0292\u0293\7T\2\2\u0293\u0294\7C\2\2\u0294\u0295\7T\2\2\u0295\u0296"+
		"\7[\2\2\u0296~\3\2\2\2\u0297\u0298\7C\2\2\u0298\u0299\7n\2\2\u0299\u029a"+
		"\7n\2\2\u029a\u029b\7q\2\2\u029b\u029c\7y\2\2\u029c\u029d\7P\2\2\u029d"+
		"\u029e\7g\2\2\u029e\u029f\7v\2\2\u029f\u02a0\7y\2\2\u02a0\u02a1\7q\2\2"+
		"\u02a1\u02a2\7t\2\2\u02a2\u02a3\7m\2\2\u02a3\u02a4\7C\2\2\u02a4\u02a5"+
		"\7e\2\2\u02a5\u02a6\7e\2\2\u02a6\u02a7\7g\2\2\u02a7\u02a8\7u\2\2\u02a8"+
		"\u02a9\7u\2\2\u02a9\u0080\3\2\2\2\u02aa\u02ab\7F\2\2\u02ab\u02ac\7g\2"+
		"\2\u02ac\u02ad\7p\2\2\u02ad\u02ae\7{\2\2\u02ae\u02af\7P\2\2\u02af\u02b0"+
		"\7g\2\2\u02b0\u02b1\7v\2\2\u02b1\u02b2\7y\2\2\u02b2\u02b3\7q\2\2\u02b3"+
		"\u02b4\7t\2\2\u02b4\u02b5\7m\2\2\u02b5\u02b6\7C\2\2\u02b6\u02b7\7e\2\2"+
		"\u02b7\u02b8\7e\2\2\u02b8\u02b9\7g\2\2\u02b9\u02ba\7u\2\2\u02ba\u02bb"+
		"\7u\2\2\u02bb\u0082\3\2\2\2\u02bc\u02bd\7C\2\2\u02bd\u02be\7n\2\2\u02be"+
		"\u02bf\7n\2\2\u02bf\u02c0\7q\2\2\u02c0\u02c1\7y\2\2\u02c1\u02c2\7H\2\2"+
		"\u02c2\u02c3\7k\2\2\u02c3\u02c4\7n\2\2\u02c4\u02c5\7g\2\2\u02c5\u02c6"+
		"\7U\2\2\u02c6\u02c7\7{\2\2\u02c7\u02c8\7u\2\2\u02c8\u02c9\7v\2\2\u02c9"+
		"\u02ca\7g\2\2\u02ca\u02cb\7o\2\2\u02cb\u0084\3\2\2\2\u02cc\u02cd\7F\2"+
		"\2\u02cd\u02ce\7g\2\2\u02ce\u02cf\7p\2\2\u02cf\u02d0\7{\2\2\u02d0\u02d1"+
		"\7H\2\2\u02d1\u02d2\7k\2\2\u02d2\u02d3\7n\2\2\u02d3\u02d4\7g\2\2\u02d4"+
		"\u02d5\7U\2\2\u02d5\u02d6\7{\2\2\u02d6\u02d7\7u\2\2\u02d7\u02d8\7v\2\2"+
		"\u02d8\u02d9\7g\2\2\u02d9\u02da\7o\2\2\u02da\u0086\3\2\2\2\u02db\u02dc"+
		"\7C\2\2\u02dc\u02dd\7n\2\2\u02dd\u02de\7n\2\2\u02de\u02df\7q\2\2\u02df"+
		"\u02e0\7y\2\2\u02e0\u02e1\7R\2\2\u02e1\u02e2\7t\2\2\u02e2\u02e3\7q\2\2"+
		"\u02e3\u02e4\7e\2\2\u02e4\u02e5\7g\2\2\u02e5\u02e6\7u\2\2\u02e6\u02e7"+
		"\7u\2\2\u02e7\u02e8\7T\2\2\u02e8\u02e9\7w\2\2\u02e9\u02ea\7p\2\2\u02ea"+
		"\u02eb\7v\2\2\u02eb\u02ec\7k\2\2\u02ec\u02ed\7o\2\2\u02ed\u02ee\7g\2\2"+
		"\u02ee\u0088\3\2\2\2\u02ef\u02f0\7F\2\2\u02f0\u02f1\7g\2\2\u02f1\u02f2"+
		"\7p\2\2\u02f2\u02f3\7{\2\2\u02f3\u02f4\7R\2\2\u02f4\u02f5\7t\2\2\u02f5"+
		"\u02f6\7q\2\2\u02f6\u02f7\7e\2\2\u02f7\u02f8\7g\2\2\u02f8\u02f9\7u\2\2"+
		"\u02f9\u02fa\7u\2\2\u02fa\u02fb\7T\2\2\u02fb\u02fc\7w\2\2\u02fc\u02fd"+
		"\7p\2\2\u02fd\u02fe\7v\2\2\u02fe\u02ff\7k\2\2\u02ff\u0300\7o\2\2\u0300"+
		"\u0301\7g\2\2\u0301\u008a\3\2\2\2\u0302\u0304\t\t\2\2\u0303\u0302\3\2"+
		"\2\2\u0304\u0305\3\2\2\2\u0305\u0303\3\2\2\2\u0305\u0306\3\2\2\2\u0306"+
		"\u008c\3\2\2\2\u0307\u0309\t\n\2\2\u0308\u0307\3\2\2\2\u0309\u030a\3\2"+
		"\2\2\u030a\u0308\3\2\2\2\u030a\u030b\3\2\2\2\u030b\u030c\3\2\2\2\u030c"+
		"\u030d\bG\2\2\u030d\u008e\3\2\2\2\f\2\u0190\u0195\u019b\u01ad\u01b3\u01b9"+
		"\u01bf\u0305\u030a";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}