package apron.permissionlanguage;
// Generated from Apron.g4 by ANTLR 4.0
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ApronParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__6=1, T__5=2, T__4=3, T__3=4, T__2=5, T__1=6, T__0=7, MACFields=8, INTFields=9, 
		ETHField=10, ARPIPfield=11, ARPMACfield=12, ICMPfield=13, SCTPfield=14, 
		UDPfield=15, OtherIntField=16, OperateAction=17, PERM=18, LIMITING=19, 
		ACTION=20, OWN_FLOWS=21, OTHERS_FLOWS=22, ALL_FLOWS=23, MAX_PRIORITY=24, 
		MIN_PRIORITY=25, EVENT_INTERCEPTION=26, MODIFY_EVENT_ORDER=27, FLOW_LEVEL=28, 
		PORT_LEVEL=29, SWITCH_LEVEL=30, IP_SRC=31, IP_DST=32, TCP_SRC=33, TCP_DST=34, 
		VLAN_ID=35, WILDCARD=36, ETH_SRC=37, ETH_DST=38, ARP_OP=39, ARP_IP_SRC=40, 
		ARP_IP_DST=41, ARP_MAC_SRC=42, ARP_MAC_DST=43, ICMP_TYPE=44, ICMP_CODE=45, 
		SCTP_SRC=46, SCTP_DST=47, UDP_SRC=48, UDP_DST=49, IN_PORT=50, PHY_PORT=51, 
		ETH_TYPE=52, IP_PROTO=53, COPY_TTL_OUT=54, COPY_TTL_IN=55, SET_MPLS_TTL=56, 
		DEC_MPLS_TTL=57, PUSH_MPLS=58, POP_MPLS=59, PUSH_VLAN=60, POP_VLAN=61, 
		SET_QUEUE=62, GROUP=63, SET_NW_TTL=64, DEC_NW_TTL=65, PUSH_PBB=66, POP_PBB=67, 
		EXPERIMENTER=68, INT=69, FLOAT=70, IP=71, NUM16=72, WITH=73, MASK=74, 
		IP_FORMAT=75, SWITCH=76, LINK=77, ALL_SWITCHES=78, BORDER_SWITCHES=79, 
		ALL_DIRECT_LINKS=80, ALL_PATHS_AS_LINKS=81, VIRTUAL=82, SINGLE_BIG_SWITCH=83, 
		DROP=84, FORWARD=85, MODIFY=86, FIELD=87, AND=88, OR=89, NOT=90, AS=91, 
		RULE_COUNT_PER_SWITCH=92, SIZE_PERCENTAGE_PER_SWITCH=93, FROM_PKT_IN=94, 
		ARBITRARY=95, AllowNetworkAccess=96, DenyNetworkAccess=97, AllowFileSystem=98, 
		DenyFileSystem=99, AllowProcessRuntime=100, DenyProcessRuntime=101, STRING=102, 
		WS=103;
	public static final String[] tokenNames = {
		"<INVALID>", "'{'", "')'", "','", "'('", "':'", "'}'", "';'", "MACFields", 
		"INTFields", "ETHField", "ARPIPfield", "ARPMACfield", "ICMPfield", "SCTPfield", 
		"UDPfield", "OtherIntField", "OperateAction", "'PERM'", "'LIMITING'", 
		"'ACTION'", "'OWN_FLOWS'", "'OTHERS_FLOWS'", "'ALL_FLOWS'", "'MAX_PRIORITY'", 
		"'MIN_PRIORITY'", "'EVENT_INTERCEPTION'", "'MODIFY_EVENT_ORDER'", "'FLOW_LEVEL'", 
		"'PORT_LEVEL'", "'SWITCH_LEVEL'", "'IP_SRC'", "'IP_DST'", "'TCP_SRC'", 
		"'TCP_DST'", "'VLAN_ID'", "'WILDCARD'", "'ETH_SRC'", "'ETH_DST'", "'ARP_OP'", 
		"'ARP_IP_SRC'", "'ARP_IP_DST'", "'ARP_MAC_SRC'", "'ARP_MAC_DST'", "'ICMP_TYPE'", 
		"'ICMP_CODE'", "'SCTP_SRC'", "'SCTP_DST'", "'UDP_SRC'", "'UDP_DST'", "'IN_PORT'", 
		"'PHY_PORT'", "'ETH_TYPE'", "'IP_PROTO'", "'COPY_TTL_OUT'", "'COPY_TTL_IN'", 
		"'SET_MPLS_TTL'", "'DEC_MPLS_TTL'", "'PUSH_MPLS'", "'POP_MPLS'", "'PUSH_VLAN'", 
		"'POP_VLAN'", "'SET_QUEUE'", "'GROUP'", "'SET_NW_TTL'", "'DEC_NW_TTL'", 
		"'PUSH_PBB'", "'POP_PBB'", "'EXPERIMENTER'", "INT", "FLOAT", "'IP'", "NUM16", 
		"'WITH'", "'MASK'", "IP_FORMAT", "'SWITCH'", "'LINK'", "'ALL_SWITCHES'", 
		"'BORDER_SWITCHES'", "'ALL_DIRECT_LINKS'", "'ALL_PATHS_AS_LINKS'", "'VIRTUAL'", 
		"'SINGLE_BIG_SWITCH'", "'DROP'", "'FORWARD'", "'MODIFY'", "'FIELD'", "'AND'", 
		"'OR'", "'NOT'", "'AS'", "'RULE_COUNT_PER_SWITCH'", "'SIZE_PERCENTAGE_PER_SWITCH'", 
		"'FROM_PKT_IN'", "'ARBITRARY'", "'AllowNetworkAccess'", "'DenyNetworkAccess'", 
		"'AllowFileSystem'", "'DenyFileSystem'", "'AllowProcessRuntime'", "'DenyProcessRuntime'", 
		"STRING", "WS"
	};
	public static final int
		RULE_program = 0, RULE_perm_list = 1, RULE_perm = 2, RULE_filter_expr = 3, 
		RULE_filter_term = 4, RULE_filter_factor = 5, RULE_filter_not_factor = 6, 
		RULE_flow_predicate = 7, RULE_field = 8, RULE_mac = 9, RULE_val = 10, 
		RULE_topo = 11, RULE_physical_topo = 12, RULE_switch_set = 13, RULE_sw_idx_list = 14, 
		RULE_sw_idx = 15, RULE_link_set = 16, RULE_link_list = 17, RULE_link = 18, 
		RULE_path = 19, RULE_link_idx = 20, RULE_virtual_topo = 21, RULE_switch_mapping = 22, 
		RULE_virtual_switch_set = 23, RULE_action = 24, RULE_field_list = 25, 
		RULE_ownership = 26, RULE_max_priority = 27, RULE_flow_table = 28, RULE_notification = 29, 
		RULE_statistics = 30, RULE_pkt_out = 31, RULE_perm_name = 32, RULE_system = 33;
	public static final String[] ruleNames = {
		"program", "perm_list", "perm", "filter_expr", "filter_term", "filter_factor", 
		"filter_not_factor", "flow_predicate", "field", "mac", "val", "topo", 
		"physical_topo", "switch_set", "sw_idx_list", "sw_idx", "link_set", "link_list", 
		"link", "path", "link_idx", "virtual_topo", "switch_mapping", "virtual_switch_set", 
		"action", "field_list", "ownership", "max_priority", "flow_table", "notification", 
		"statistics", "pkt_out", "perm_name", "system"
	};

	@Override
	public String getGrammarFileName() { return "Apron.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public ApronParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	 
		public ProgramContext() { }
		public void copyFrom(ProgramContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FinalContext extends ProgramContext {
		public Perm_listContext perm_list() {
			return getRuleContext(Perm_listContext.class,0);
		}
		public FinalContext(ProgramContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).enterFinal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).exitFinal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApronVisitor ) return ((ApronVisitor<? extends T>)visitor).visitFinal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			_localctx = new FinalContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(68); perm_list();
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

	public static class Perm_listContext extends ParserRuleContext {
		public Perm_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_perm_list; }
	 
		public Perm_listContext() { }
		public void copyFrom(Perm_listContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PermListSContext extends Perm_listContext {
		public PermContext perm() {
			return getRuleContext(PermContext.class,0);
		}
		public PermListSContext(Perm_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).enterPermListS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).exitPermListS(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApronVisitor ) return ((ApronVisitor<? extends T>)visitor).visitPermListS(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PermListMContext extends Perm_listContext {
		public Perm_listContext perm_list() {
			return getRuleContext(Perm_listContext.class,0);
		}
		public PermContext perm() {
			return getRuleContext(PermContext.class,0);
		}
		public PermListMContext(Perm_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).enterPermListM(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).exitPermListM(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApronVisitor ) return ((ApronVisitor<? extends T>)visitor).visitPermListM(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Perm_listContext perm_list() throws RecognitionException {
		Perm_listContext _localctx = new Perm_listContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_perm_list);
		try {
			setState(74);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				_localctx = new PermListSContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(70); perm();
				}
				break;

			case 2:
				_localctx = new PermListMContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(71); perm();
				setState(72); perm_list();
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

	public static class PermContext extends ParserRuleContext {
		public PermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_perm; }
	 
		public PermContext() { }
		public void copyFrom(PermContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PermSContext extends PermContext {
		public Perm_nameContext perm_name() {
			return getRuleContext(Perm_nameContext.class,0);
		}
		public TerminalNode PERM() { return getToken(ApronParser.PERM, 0); }
		public PermSContext(PermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).enterPermS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).exitPermS(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApronVisitor ) return ((ApronVisitor<? extends T>)visitor).visitPermS(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PermMContext extends PermContext {
		public Filter_exprContext filter_expr() {
			return getRuleContext(Filter_exprContext.class,0);
		}
		public TerminalNode LIMITING() { return getToken(ApronParser.LIMITING, 0); }
		public Perm_nameContext perm_name() {
			return getRuleContext(Perm_nameContext.class,0);
		}
		public TerminalNode PERM() { return getToken(ApronParser.PERM, 0); }
		public PermMContext(PermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).enterPermM(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).exitPermM(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApronVisitor ) return ((ApronVisitor<? extends T>)visitor).visitPermM(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PermContext perm() throws RecognitionException {
		PermContext _localctx = new PermContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_perm);
		try {
			setState(83);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new PermSContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(76); match(PERM);
				setState(77); perm_name();
				}
				break;

			case 2:
				_localctx = new PermMContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(78); match(PERM);
				setState(79); perm_name();
				setState(80); match(LIMITING);
				setState(81); filter_expr(0);
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

	public static class Filter_exprContext extends ParserRuleContext {
		public int _p;
		public Filter_exprContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Filter_exprContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_filter_expr; }
	 
		public Filter_exprContext() { }
		public void copyFrom(Filter_exprContext ctx) {
			super.copyFrom(ctx);
			this._p = ctx._p;
		}
	}
	public static class FilterExprAndTermContext extends Filter_exprContext {
		public Filter_exprContext filter_expr() {
			return getRuleContext(Filter_exprContext.class,0);
		}
		public Filter_termContext filter_term() {
			return getRuleContext(Filter_termContext.class,0);
		}
		public TerminalNode AND() { return getToken(ApronParser.AND, 0); }
		public FilterExprAndTermContext(Filter_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).enterFilterExprAndTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).exitFilterExprAndTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApronVisitor ) return ((ApronVisitor<? extends T>)visitor).visitFilterExprAndTerm(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FilterExprTermContext extends Filter_exprContext {
		public Filter_termContext filter_term() {
			return getRuleContext(Filter_termContext.class,0);
		}
		public FilterExprTermContext(Filter_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).enterFilterExprTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).exitFilterExprTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApronVisitor ) return ((ApronVisitor<? extends T>)visitor).visitFilterExprTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Filter_exprContext filter_expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Filter_exprContext _localctx = new Filter_exprContext(_ctx, _parentState, _p);
		Filter_exprContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, RULE_filter_expr);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new FilterExprTermContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(86); filter_term(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(93);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new FilterExprAndTermContext(new Filter_exprContext(_parentctx, _parentState, _p));
					pushNewRecursionContext(_localctx, _startState, RULE_filter_expr);
					setState(88);
					if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
					setState(89); match(AND);
					setState(90); filter_term(0);
					}
					} 
				}
				setState(95);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
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

	public static class Filter_termContext extends ParserRuleContext {
		public int _p;
		public Filter_termContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Filter_termContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_filter_term; }
	 
		public Filter_termContext() { }
		public void copyFrom(Filter_termContext ctx) {
			super.copyFrom(ctx);
			this._p = ctx._p;
		}
	}
	public static class FilterTermFactorContext extends Filter_termContext {
		public Filter_factorContext filter_factor() {
			return getRuleContext(Filter_factorContext.class,0);
		}
		public FilterTermFactorContext(Filter_termContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).enterFilterTermFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).exitFilterTermFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApronVisitor ) return ((ApronVisitor<? extends T>)visitor).visitFilterTermFactor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FilterTermOrFactorContext extends Filter_termContext {
		public Filter_termContext filter_term() {
			return getRuleContext(Filter_termContext.class,0);
		}
		public Filter_factorContext filter_factor() {
			return getRuleContext(Filter_factorContext.class,0);
		}
		public TerminalNode OR() { return getToken(ApronParser.OR, 0); }
		public FilterTermOrFactorContext(Filter_termContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).enterFilterTermOrFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).exitFilterTermOrFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApronVisitor ) return ((ApronVisitor<? extends T>)visitor).visitFilterTermOrFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Filter_termContext filter_term(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Filter_termContext _localctx = new Filter_termContext(_ctx, _parentState, _p);
		Filter_termContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, RULE_filter_term);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new FilterTermFactorContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(97); filter_factor();
			}
			_ctx.stop = _input.LT(-1);
			setState(104);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new FilterTermOrFactorContext(new Filter_termContext(_parentctx, _parentState, _p));
					pushNewRecursionContext(_localctx, _startState, RULE_filter_term);
					setState(99);
					if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
					setState(100); match(OR);
					setState(101); filter_factor();
					}
					} 
				}
				setState(106);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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

	public static class Filter_factorContext extends ParserRuleContext {
		public Filter_factorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filter_factor; }
	 
		public Filter_factorContext() { }
		public void copyFrom(Filter_factorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FilterFactorNotFactorContext extends Filter_factorContext {
		public Filter_not_factorContext filter_not_factor() {
			return getRuleContext(Filter_not_factorContext.class,0);
		}
		public FilterFactorNotFactorContext(Filter_factorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).enterFilterFactorNotFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).exitFilterFactorNotFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApronVisitor ) return ((ApronVisitor<? extends T>)visitor).visitFilterFactorNotFactor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FilterFactorNotContext extends Filter_factorContext {
		public TerminalNode NOT() { return getToken(ApronParser.NOT, 0); }
		public Filter_factorContext filter_factor() {
			return getRuleContext(Filter_factorContext.class,0);
		}
		public FilterFactorNotContext(Filter_factorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).enterFilterFactorNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).exitFilterFactorNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApronVisitor ) return ((ApronVisitor<? extends T>)visitor).visitFilterFactorNot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Filter_factorContext filter_factor() throws RecognitionException {
		Filter_factorContext _localctx = new Filter_factorContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_filter_factor);
		try {
			setState(110);
			switch (_input.LA(1)) {
			case 4:
			case MACFields:
			case INTFields:
			case ARPIPfield:
			case ACTION:
			case OWN_FLOWS:
			case OTHERS_FLOWS:
			case ALL_FLOWS:
			case MAX_PRIORITY:
			case MIN_PRIORITY:
			case EVENT_INTERCEPTION:
			case MODIFY_EVENT_ORDER:
			case FLOW_LEVEL:
			case PORT_LEVEL:
			case SWITCH_LEVEL:
			case IP_SRC:
			case IP_DST:
			case TCP_SRC:
			case TCP_DST:
			case VLAN_ID:
			case WILDCARD:
			case SWITCH:
			case VIRTUAL:
			case RULE_COUNT_PER_SWITCH:
			case SIZE_PERCENTAGE_PER_SWITCH:
			case FROM_PKT_IN:
			case ARBITRARY:
			case AllowNetworkAccess:
			case DenyNetworkAccess:
			case AllowFileSystem:
			case DenyFileSystem:
			case AllowProcessRuntime:
			case DenyProcessRuntime:
				_localctx = new FilterFactorNotFactorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(107); filter_not_factor();
				}
				break;
			case NOT:
				_localctx = new FilterFactorNotContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(108); match(NOT);
				setState(109); filter_factor();
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

	public static class Filter_not_factorContext extends ParserRuleContext {
		public Filter_not_factorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filter_not_factor; }
	 
		public Filter_not_factorContext() { }
		public void copyFrom(Filter_not_factorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class OwnershipSContext extends Filter_not_factorContext {
		public OwnershipContext ownership() {
			return getRuleContext(OwnershipContext.class,0);
		}
		public OwnershipSContext(Filter_not_factorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).enterOwnershipS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).exitOwnershipS(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApronVisitor ) return ((ApronVisitor<? extends T>)visitor).visitOwnershipS(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FlowTableContext extends Filter_not_factorContext {
		public Flow_tableContext flow_table() {
			return getRuleContext(Flow_tableContext.class,0);
		}
		public FlowTableContext(Filter_not_factorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).enterFlowTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).exitFlowTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApronVisitor ) return ((ApronVisitor<? extends T>)visitor).visitFlowTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FilterExprContext extends Filter_not_factorContext {
		public Filter_exprContext filter_expr() {
			return getRuleContext(Filter_exprContext.class,0);
		}
		public FilterExprContext(Filter_not_factorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).enterFilterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).exitFilterExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApronVisitor ) return ((ApronVisitor<? extends T>)visitor).visitFilterExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FlowPredicateContext extends Filter_not_factorContext {
		public Flow_predicateContext flow_predicate() {
			return getRuleContext(Flow_predicateContext.class,0);
		}
		public FlowPredicateContext(Filter_not_factorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).enterFlowPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).exitFlowPredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApronVisitor ) return ((ApronVisitor<? extends T>)visitor).visitFlowPredicate(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TopologyContext extends Filter_not_factorContext {
		public TopoContext topo() {
			return getRuleContext(TopoContext.class,0);
		}
		public TopologyContext(Filter_not_factorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).enterTopology(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).exitTopology(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApronVisitor ) return ((ApronVisitor<? extends T>)visitor).visitTopology(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ActionsContext extends Filter_not_factorContext {
		public ActionContext action() {
			return getRuleContext(ActionContext.class,0);
		}
		public TerminalNode ACTION() { return getToken(ApronParser.ACTION, 0); }
		public ActionsContext(Filter_not_factorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).enterActions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).exitActions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApronVisitor ) return ((ApronVisitor<? extends T>)visitor).visitActions(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PktOutContext extends Filter_not_factorContext {
		public Pkt_outContext pkt_out() {
			return getRuleContext(Pkt_outContext.class,0);
		}
		public PktOutContext(Filter_not_factorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).enterPktOut(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).exitPktOut(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApronVisitor ) return ((ApronVisitor<? extends T>)visitor).visitPktOut(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SystemSContext extends Filter_not_factorContext {
		public SystemContext system() {
			return getRuleContext(SystemContext.class,0);
		}
		public SystemSContext(Filter_not_factorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).enterSystemS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).exitSystemS(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApronVisitor ) return ((ApronVisitor<? extends T>)visitor).visitSystemS(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MaxPriorityContext extends Filter_not_factorContext {
		public Max_priorityContext max_priority() {
			return getRuleContext(Max_priorityContext.class,0);
		}
		public MaxPriorityContext(Filter_not_factorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).enterMaxPriority(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).exitMaxPriority(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApronVisitor ) return ((ApronVisitor<? extends T>)visitor).visitMaxPriority(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotificationSContext extends Filter_not_factorContext {
		public NotificationContext notification() {
			return getRuleContext(NotificationContext.class,0);
		}
		public NotificationSContext(Filter_not_factorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).enterNotificationS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).exitNotificationS(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApronVisitor ) return ((ApronVisitor<? extends T>)visitor).visitNotificationS(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StatisticsSContext extends Filter_not_factorContext {
		public StatisticsContext statistics() {
			return getRuleContext(StatisticsContext.class,0);
		}
		public StatisticsSContext(Filter_not_factorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).enterStatisticsS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).exitStatisticsS(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApronVisitor ) return ((ApronVisitor<? extends T>)visitor).visitStatisticsS(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Filter_not_factorContext filter_not_factor() throws RecognitionException {
		Filter_not_factorContext _localctx = new Filter_not_factorContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_filter_not_factor);
		try {
			setState(127);
			switch (_input.LA(1)) {
			case 4:
				_localctx = new FilterExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(112); match(4);
				setState(113); filter_expr(0);
				setState(114); match(2);
				}
				break;
			case MACFields:
			case INTFields:
			case ARPIPfield:
			case IP_SRC:
			case IP_DST:
			case TCP_SRC:
			case TCP_DST:
			case VLAN_ID:
			case WILDCARD:
				_localctx = new FlowPredicateContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(116); flow_predicate();
				}
				break;
			case SWITCH:
			case VIRTUAL:
				_localctx = new TopologyContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(117); topo();
				}
				break;
			case ACTION:
				_localctx = new ActionsContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(118); match(ACTION);
				setState(119); action();
				}
				break;
			case OWN_FLOWS:
			case OTHERS_FLOWS:
			case ALL_FLOWS:
				_localctx = new OwnershipSContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(120); ownership();
				}
				break;
			case MAX_PRIORITY:
			case MIN_PRIORITY:
				_localctx = new MaxPriorityContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(121); max_priority();
				}
				break;
			case RULE_COUNT_PER_SWITCH:
			case SIZE_PERCENTAGE_PER_SWITCH:
				_localctx = new FlowTableContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(122); flow_table();
				}
				break;
			case EVENT_INTERCEPTION:
			case MODIFY_EVENT_ORDER:
				_localctx = new NotificationSContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(123); notification();
				}
				break;
			case FLOW_LEVEL:
			case PORT_LEVEL:
			case SWITCH_LEVEL:
				_localctx = new StatisticsSContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(124); statistics();
				}
				break;
			case FROM_PKT_IN:
			case ARBITRARY:
				_localctx = new PktOutContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(125); pkt_out();
				}
				break;
			case AllowNetworkAccess:
			case DenyNetworkAccess:
			case AllowFileSystem:
			case DenyFileSystem:
			case AllowProcessRuntime:
			case DenyProcessRuntime:
				_localctx = new SystemSContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(126); system();
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

	public static class Flow_predicateContext extends ParserRuleContext {
		public Flow_predicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_flow_predicate; }
	 
		public Flow_predicateContext() { }
		public void copyFrom(Flow_predicateContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IntFieldPreContext extends Flow_predicateContext {
		public TerminalNode INT() { return getToken(ApronParser.INT, 0); }
		public TerminalNode INTFields() { return getToken(ApronParser.INTFields, 0); }
		public IntFieldPreContext(Flow_predicateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).enterIntFieldPre(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).exitIntFieldPre(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApronVisitor ) return ((ApronVisitor<? extends T>)visitor).visitIntFieldPre(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FieldMaskContext extends Flow_predicateContext {
		public List<ValContext> val() {
			return getRuleContexts(ValContext.class);
		}
		public FieldContext field() {
			return getRuleContext(FieldContext.class,0);
		}
		public TerminalNode MASK() { return getToken(ApronParser.MASK, 0); }
		public ValContext val(int i) {
			return getRuleContext(ValContext.class,i);
		}
		public FieldMaskContext(Flow_predicateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).enterFieldMask(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).exitFieldMask(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApronVisitor ) return ((ApronVisitor<? extends T>)visitor).visitFieldMask(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MacFieldPreContext extends Flow_predicateContext {
		public TerminalNode MACFields() { return getToken(ApronParser.MACFields, 0); }
		public MacContext mac() {
			return getRuleContext(MacContext.class,0);
		}
		public MacFieldPreContext(Flow_predicateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).enterMacFieldPre(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).exitMacFieldPre(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApronVisitor ) return ((ApronVisitor<? extends T>)visitor).visitMacFieldPre(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WildcardContext extends Flow_predicateContext {
		public ValContext val() {
			return getRuleContext(ValContext.class,0);
		}
		public FieldContext field() {
			return getRuleContext(FieldContext.class,0);
		}
		public TerminalNode WILDCARD() { return getToken(ApronParser.WILDCARD, 0); }
		public WildcardContext(Flow_predicateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).enterWildcard(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).exitWildcard(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApronVisitor ) return ((ApronVisitor<? extends T>)visitor).visitWildcard(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FieldValContext extends Flow_predicateContext {
		public ValContext val() {
			return getRuleContext(ValContext.class,0);
		}
		public FieldContext field() {
			return getRuleContext(FieldContext.class,0);
		}
		public FieldValContext(Flow_predicateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).enterFieldVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).exitFieldVal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApronVisitor ) return ((ApronVisitor<? extends T>)visitor).visitFieldVal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Flow_predicateContext flow_predicate() throws RecognitionException {
		Flow_predicateContext _localctx = new Flow_predicateContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_flow_predicate);
		try {
			setState(145);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new FieldValContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(129); field();
				setState(130); val();
				}
				break;

			case 2:
				_localctx = new FieldMaskContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(132); field();
				setState(133); val();
				setState(134); match(MASK);
				setState(135); val();
				}
				break;

			case 3:
				_localctx = new WildcardContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(137); match(WILDCARD);
				setState(138); field();
				setState(139); val();
				}
				break;

			case 4:
				_localctx = new MacFieldPreContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(141); match(MACFields);
				setState(142); mac();
				}
				break;

			case 5:
				_localctx = new IntFieldPreContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(143); match(INTFields);
				setState(144); match(INT);
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
		public TerminalNode ARPIPfield() { return getToken(ApronParser.ARPIPfield, 0); }
		public TerminalNode IP_SRC() { return getToken(ApronParser.IP_SRC, 0); }
		public TerminalNode TCP_DST() { return getToken(ApronParser.TCP_DST, 0); }
		public TerminalNode VLAN_ID() { return getToken(ApronParser.VLAN_ID, 0); }
		public TerminalNode TCP_SRC() { return getToken(ApronParser.TCP_SRC, 0); }
		public TerminalNode IP_DST() { return getToken(ApronParser.IP_DST, 0); }
		public FieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).enterField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).exitField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApronVisitor ) return ((ApronVisitor<? extends T>)visitor).visitField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldContext field() throws RecognitionException {
		FieldContext _localctx = new FieldContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_field);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ARPIPfield) | (1L << IP_SRC) | (1L << IP_DST) | (1L << TCP_SRC) | (1L << TCP_DST) | (1L << VLAN_ID))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class MacContext extends ParserRuleContext {
		public MacContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mac; }
	 
		public MacContext() { }
		public void copyFrom(MacContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MacValContext extends MacContext {
		public TerminalNode NUM16(int i) {
			return getToken(ApronParser.NUM16, i);
		}
		public List<TerminalNode> NUM16() { return getTokens(ApronParser.NUM16); }
		public MacValContext(MacContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).enterMacVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).exitMacVal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApronVisitor ) return ((ApronVisitor<? extends T>)visitor).visitMacVal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MacContext mac() throws RecognitionException {
		MacContext _localctx = new MacContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_mac);
		try {
			_localctx = new MacValContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(149); match(NUM16);
			setState(150); match(5);
			setState(151); match(NUM16);
			setState(152); match(5);
			setState(153); match(NUM16);
			setState(154); match(5);
			setState(155); match(NUM16);
			setState(156); match(5);
			setState(157); match(NUM16);
			setState(158); match(5);
			setState(159); match(NUM16);
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

	public static class ValContext extends ParserRuleContext {
		public ValContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_val; }
	 
		public ValContext() { }
		public void copyFrom(ValContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ValIntContext extends ValContext {
		public TerminalNode INT() { return getToken(ApronParser.INT, 0); }
		public ValIntContext(ValContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).enterValInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).exitValInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApronVisitor ) return ((ApronVisitor<? extends T>)visitor).visitValInt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ValIpContext extends ValContext {
		public TerminalNode IP_FORMAT() { return getToken(ApronParser.IP_FORMAT, 0); }
		public ValIpContext(ValContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).enterValIp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).exitValIp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApronVisitor ) return ((ApronVisitor<? extends T>)visitor).visitValIp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValContext val() throws RecognitionException {
		ValContext _localctx = new ValContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_val);
		try {
			setState(163);
			switch (_input.LA(1)) {
			case INT:
				_localctx = new ValIntContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(161); match(INT);
				}
				break;
			case IP_FORMAT:
				_localctx = new ValIpContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(162); match(IP_FORMAT);
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

	public static class TopoContext extends ParserRuleContext {
		public TopoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_topo; }
	 
		public TopoContext() { }
		public void copyFrom(TopoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VirtualTopoContext extends TopoContext {
		public Virtual_topoContext virtual_topo() {
			return getRuleContext(Virtual_topoContext.class,0);
		}
		public VirtualTopoContext(TopoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).enterVirtualTopo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).exitVirtualTopo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApronVisitor ) return ((ApronVisitor<? extends T>)visitor).visitVirtualTopo(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PhysicalTopoContext extends TopoContext {
		public Physical_topoContext physical_topo() {
			return getRuleContext(Physical_topoContext.class,0);
		}
		public PhysicalTopoContext(TopoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).enterPhysicalTopo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).exitPhysicalTopo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApronVisitor ) return ((ApronVisitor<? extends T>)visitor).visitPhysicalTopo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TopoContext topo() throws RecognitionException {
		TopoContext _localctx = new TopoContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_topo);
		try {
			setState(167);
			switch (_input.LA(1)) {
			case SWITCH:
				_localctx = new PhysicalTopoContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(165); physical_topo();
				}
				break;
			case VIRTUAL:
				_localctx = new VirtualTopoContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(166); virtual_topo();
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

	public static class Physical_topoContext extends ParserRuleContext {
		public Link_setContext link_set() {
			return getRuleContext(Link_setContext.class,0);
		}
		public TerminalNode LINK() { return getToken(ApronParser.LINK, 0); }
		public TerminalNode AND() { return getToken(ApronParser.AND, 0); }
		public TerminalNode SWITCH() { return getToken(ApronParser.SWITCH, 0); }
		public Switch_setContext switch_set() {
			return getRuleContext(Switch_setContext.class,0);
		}
		public Physical_topoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_physical_topo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).enterPhysical_topo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).exitPhysical_topo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApronVisitor ) return ((ApronVisitor<? extends T>)visitor).visitPhysical_topo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Physical_topoContext physical_topo() throws RecognitionException {
		Physical_topoContext _localctx = new Physical_topoContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_physical_topo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169); match(SWITCH);
			setState(170); switch_set();
			setState(171); match(AND);
			setState(172); match(LINK);
			setState(173); link_set();
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

	public static class Switch_setContext extends ParserRuleContext {
		public Switch_setContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_set; }
	 
		public Switch_setContext() { }
		public void copyFrom(Switch_setContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AllSwitchesContext extends Switch_setContext {
		public TerminalNode ALL_SWITCHES() { return getToken(ApronParser.ALL_SWITCHES, 0); }
		public AllSwitchesContext(Switch_setContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).enterAllSwitches(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).exitAllSwitches(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApronVisitor ) return ((ApronVisitor<? extends T>)visitor).visitAllSwitches(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SwIdxListContext extends Switch_setContext {
		public Sw_idx_listContext sw_idx_list() {
			return getRuleContext(Sw_idx_listContext.class,0);
		}
		public SwIdxListContext(Switch_setContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).enterSwIdxList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).exitSwIdxList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApronVisitor ) return ((ApronVisitor<? extends T>)visitor).visitSwIdxList(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BorderSwitchesContext extends Switch_setContext {
		public TerminalNode BORDER_SWITCHES() { return getToken(ApronParser.BORDER_SWITCHES, 0); }
		public BorderSwitchesContext(Switch_setContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).enterBorderSwitches(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).exitBorderSwitches(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApronVisitor ) return ((ApronVisitor<? extends T>)visitor).visitBorderSwitches(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Switch_setContext switch_set() throws RecognitionException {
		Switch_setContext _localctx = new Switch_setContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_switch_set);
		try {
			setState(181);
			switch (_input.LA(1)) {
			case ALL_SWITCHES:
				_localctx = new AllSwitchesContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(175); match(ALL_SWITCHES);
				}
				break;
			case BORDER_SWITCHES:
				_localctx = new BorderSwitchesContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(176); match(BORDER_SWITCHES);
				}
				break;
			case 1:
				_localctx = new SwIdxListContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(177); match(1);
				setState(178); sw_idx_list();
				setState(179); match(6);
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

	public static class Sw_idx_listContext extends ParserRuleContext {
		public Sw_idx_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sw_idx_list; }
	 
		public Sw_idx_listContext() { }
		public void copyFrom(Sw_idx_listContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SwIdxListSContext extends Sw_idx_listContext {
		public Sw_idxContext sw_idx() {
			return getRuleContext(Sw_idxContext.class,0);
		}
		public SwIdxListSContext(Sw_idx_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).enterSwIdxListS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).exitSwIdxListS(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApronVisitor ) return ((ApronVisitor<? extends T>)visitor).visitSwIdxListS(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SwIdxListMContext extends Sw_idx_listContext {
		public Sw_idx_listContext sw_idx_list() {
			return getRuleContext(Sw_idx_listContext.class,0);
		}
		public Sw_idxContext sw_idx() {
			return getRuleContext(Sw_idxContext.class,0);
		}
		public SwIdxListMContext(Sw_idx_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).enterSwIdxListM(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).exitSwIdxListM(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApronVisitor ) return ((ApronVisitor<? extends T>)visitor).visitSwIdxListM(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sw_idx_listContext sw_idx_list() throws RecognitionException {
		Sw_idx_listContext _localctx = new Sw_idx_listContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_sw_idx_list);
		try {
			setState(188);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				_localctx = new SwIdxListSContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(183); sw_idx();
				}
				break;

			case 2:
				_localctx = new SwIdxListMContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(184); sw_idx();
				setState(185); match(3);
				setState(186); sw_idx_list();
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

	public static class Sw_idxContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(ApronParser.INT, 0); }
		public Sw_idxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sw_idx; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).enterSw_idx(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).exitSw_idx(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApronVisitor ) return ((ApronVisitor<? extends T>)visitor).visitSw_idx(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sw_idxContext sw_idx() throws RecognitionException {
		Sw_idxContext _localctx = new Sw_idxContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_sw_idx);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190); match(INT);
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

	public static class Link_setContext extends ParserRuleContext {
		public Link_setContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_link_set; }
	 
		public Link_setContext() { }
		public void copyFrom(Link_setContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AllDriectLinksContext extends Link_setContext {
		public TerminalNode ALL_DIRECT_LINKS() { return getToken(ApronParser.ALL_DIRECT_LINKS, 0); }
		public AllDriectLinksContext(Link_setContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).enterAllDriectLinks(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).exitAllDriectLinks(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApronVisitor ) return ((ApronVisitor<? extends T>)visitor).visitAllDriectLinks(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AllPathsAsLinksContext extends Link_setContext {
		public TerminalNode ALL_PATHS_AS_LINKS() { return getToken(ApronParser.ALL_PATHS_AS_LINKS, 0); }
		public AllPathsAsLinksContext(Link_setContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).enterAllPathsAsLinks(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).exitAllPathsAsLinks(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApronVisitor ) return ((ApronVisitor<? extends T>)visitor).visitAllPathsAsLinks(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LinkListContext extends Link_setContext {
		public Link_listContext link_list() {
			return getRuleContext(Link_listContext.class,0);
		}
		public LinkListContext(Link_setContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).enterLinkList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).exitLinkList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApronVisitor ) return ((ApronVisitor<? extends T>)visitor).visitLinkList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Link_setContext link_set() throws RecognitionException {
		Link_setContext _localctx = new Link_setContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_link_set);
		try {
			setState(195);
			switch (_input.LA(1)) {
			case ALL_DIRECT_LINKS:
				_localctx = new AllDriectLinksContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(192); match(ALL_DIRECT_LINKS);
				}
				break;
			case ALL_PATHS_AS_LINKS:
				_localctx = new AllPathsAsLinksContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(193); match(ALL_PATHS_AS_LINKS);
				}
				break;
			case 4:
			case INT:
				_localctx = new LinkListContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(194); link_list();
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

	public static class Link_listContext extends ParserRuleContext {
		public Link_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_link_list; }
	 
		public Link_listContext() { }
		public void copyFrom(Link_listContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LinkListSContext extends Link_listContext {
		public LinkContext link() {
			return getRuleContext(LinkContext.class,0);
		}
		public LinkListSContext(Link_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).enterLinkListS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).exitLinkListS(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApronVisitor ) return ((ApronVisitor<? extends T>)visitor).visitLinkListS(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LinkListMContext extends Link_listContext {
		public LinkContext link() {
			return getRuleContext(LinkContext.class,0);
		}
		public Link_listContext link_list() {
			return getRuleContext(Link_listContext.class,0);
		}
		public LinkListMContext(Link_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).enterLinkListM(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).exitLinkListM(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApronVisitor ) return ((ApronVisitor<? extends T>)visitor).visitLinkListM(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Link_listContext link_list() throws RecognitionException {
		Link_listContext _localctx = new Link_listContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_link_list);
		try {
			setState(202);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				_localctx = new LinkListSContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(197); link();
				}
				break;

			case 2:
				_localctx = new LinkListMContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(198); link();
				setState(199); match(3);
				setState(200); link_list();
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

	public static class LinkContext extends ParserRuleContext {
		public LinkContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_link; }
	 
		public LinkContext() { }
		public void copyFrom(LinkContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LinkMContext extends LinkContext {
		public PathContext path() {
			return getRuleContext(PathContext.class,0);
		}
		public LinkMContext(LinkContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).enterLinkM(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).exitLinkM(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApronVisitor ) return ((ApronVisitor<? extends T>)visitor).visitLinkM(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LinkSContext extends LinkContext {
		public List<Link_idxContext> link_idx() {
			return getRuleContexts(Link_idxContext.class);
		}
		public Link_idxContext link_idx(int i) {
			return getRuleContext(Link_idxContext.class,i);
		}
		public LinkSContext(LinkContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).enterLinkS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).exitLinkS(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApronVisitor ) return ((ApronVisitor<? extends T>)visitor).visitLinkS(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LinkContext link() throws RecognitionException {
		LinkContext _localctx = new LinkContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_link);
		try {
			setState(213);
			switch (_input.LA(1)) {
			case INT:
				_localctx = new LinkSContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(204); link_idx();
				setState(205); match(5);
				setState(206); link_idx();
				setState(207); match(7);
				}
				break;
			case 4:
				_localctx = new LinkMContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(209); match(4);
				setState(210); path();
				setState(211); match(2);
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

	public static class PathContext extends ParserRuleContext {
		public PathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_path; }
	 
		public PathContext() { }
		public void copyFrom(PathContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PathMContext extends PathContext {
		public Link_idxContext link_idx() {
			return getRuleContext(Link_idxContext.class,0);
		}
		public PathContext path() {
			return getRuleContext(PathContext.class,0);
		}
		public PathMContext(PathContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).enterPathM(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).exitPathM(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApronVisitor ) return ((ApronVisitor<? extends T>)visitor).visitPathM(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PathSContext extends PathContext {
		public Link_idxContext link_idx() {
			return getRuleContext(Link_idxContext.class,0);
		}
		public PathSContext(PathContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).enterPathS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).exitPathS(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApronVisitor ) return ((ApronVisitor<? extends T>)visitor).visitPathS(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PathContext path() throws RecognitionException {
		PathContext _localctx = new PathContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_path);
		try {
			setState(220);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				_localctx = new PathSContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(215); link_idx();
				}
				break;

			case 2:
				_localctx = new PathMContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(216); link_idx();
				setState(217); match(5);
				setState(218); path();
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

	public static class Link_idxContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(ApronParser.INT, 0); }
		public Sw_idxContext sw_idx() {
			return getRuleContext(Sw_idxContext.class,0);
		}
		public Link_idxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_link_idx; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).enterLink_idx(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).exitLink_idx(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApronVisitor ) return ((ApronVisitor<? extends T>)visitor).visitLink_idx(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Link_idxContext link_idx() throws RecognitionException {
		Link_idxContext _localctx = new Link_idxContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_link_idx);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222); sw_idx();
			setState(223); match(3);
			setState(224); match(INT);
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

	public static class Virtual_topoContext extends ParserRuleContext {
		public Link_setContext link_set() {
			return getRuleContext(Link_setContext.class,0);
		}
		public TerminalNode LINK() { return getToken(ApronParser.LINK, 0); }
		public TerminalNode AND() { return getToken(ApronParser.AND, 0); }
		public Switch_mappingContext switch_mapping() {
			return getRuleContext(Switch_mappingContext.class,0);
		}
		public TerminalNode VIRTUAL() { return getToken(ApronParser.VIRTUAL, 0); }
		public TerminalNode SWITCH() { return getToken(ApronParser.SWITCH, 0); }
		public Virtual_topoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_virtual_topo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).enterVirtual_topo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).exitVirtual_topo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApronVisitor ) return ((ApronVisitor<? extends T>)visitor).visitVirtual_topo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Virtual_topoContext virtual_topo() throws RecognitionException {
		Virtual_topoContext _localctx = new Virtual_topoContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_virtual_topo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226); match(VIRTUAL);
			setState(227); match(SWITCH);
			setState(228); switch_mapping();
			setState(229); match(AND);
			setState(230); match(LINK);
			setState(231); link_set();
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

	public static class Switch_mappingContext extends ParserRuleContext {
		public Switch_mappingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_mapping; }
	 
		public Switch_mappingContext() { }
		public void copyFrom(Switch_mappingContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VirtualSwitchSetContext extends Switch_mappingContext {
		public Virtual_switch_setContext virtual_switch_set() {
			return getRuleContext(Virtual_switch_setContext.class,0);
		}
		public VirtualSwitchSetContext(Switch_mappingContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).enterVirtualSwitchSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).exitVirtualSwitchSet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApronVisitor ) return ((ApronVisitor<? extends T>)visitor).visitVirtualSwitchSet(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SingleBigSwitchContext extends Switch_mappingContext {
		public TerminalNode SINGLE_BIG_SWITCH() { return getToken(ApronParser.SINGLE_BIG_SWITCH, 0); }
		public SingleBigSwitchContext(Switch_mappingContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).enterSingleBigSwitch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).exitSingleBigSwitch(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApronVisitor ) return ((ApronVisitor<? extends T>)visitor).visitSingleBigSwitch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Switch_mappingContext switch_mapping() throws RecognitionException {
		Switch_mappingContext _localctx = new Switch_mappingContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_switch_mapping);
		try {
			setState(238);
			switch (_input.LA(1)) {
			case SINGLE_BIG_SWITCH:
				_localctx = new SingleBigSwitchContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(233); match(SINGLE_BIG_SWITCH);
				}
				break;
			case 1:
				_localctx = new VirtualSwitchSetContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(234); match(1);
				setState(235); virtual_switch_set();
				setState(236); match(6);
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

	public static class Virtual_switch_setContext extends ParserRuleContext {
		public Virtual_switch_setContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_virtual_switch_set; }
	 
		public Virtual_switch_setContext() { }
		public void copyFrom(Virtual_switch_setContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VirtualSwitchSetSContext extends Virtual_switch_setContext {
		public TerminalNode AS() { return getToken(ApronParser.AS, 0); }
		public Sw_idxContext sw_idx() {
			return getRuleContext(Sw_idxContext.class,0);
		}
		public Switch_setContext switch_set() {
			return getRuleContext(Switch_setContext.class,0);
		}
		public VirtualSwitchSetSContext(Virtual_switch_setContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).enterVirtualSwitchSetS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).exitVirtualSwitchSetS(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApronVisitor ) return ((ApronVisitor<? extends T>)visitor).visitVirtualSwitchSetS(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VirtualSwitchSetMContext extends Virtual_switch_setContext {
		public TerminalNode AS() { return getToken(ApronParser.AS, 0); }
		public Virtual_switch_setContext virtual_switch_set() {
			return getRuleContext(Virtual_switch_setContext.class,0);
		}
		public Sw_idxContext sw_idx() {
			return getRuleContext(Sw_idxContext.class,0);
		}
		public Switch_setContext switch_set() {
			return getRuleContext(Switch_setContext.class,0);
		}
		public VirtualSwitchSetMContext(Virtual_switch_setContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).enterVirtualSwitchSetM(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).exitVirtualSwitchSetM(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApronVisitor ) return ((ApronVisitor<? extends T>)visitor).visitVirtualSwitchSetM(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Virtual_switch_setContext virtual_switch_set() throws RecognitionException {
		Virtual_switch_setContext _localctx = new Virtual_switch_setContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_virtual_switch_set);
		try {
			setState(250);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				_localctx = new VirtualSwitchSetSContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(240); switch_set();
				setState(241); match(AS);
				setState(242); sw_idx();
				}
				break;

			case 2:
				_localctx = new VirtualSwitchSetMContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(244); switch_set();
				setState(245); match(AS);
				setState(246); sw_idx();
				setState(247); match(3);
				setState(248); virtual_switch_set();
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

	public static class ActionContext extends ParserRuleContext {
		public ActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_action; }
	 
		public ActionContext() { }
		public void copyFrom(ActionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ActionOpContext extends ActionContext {
		public TerminalNode OperateAction() { return getToken(ApronParser.OperateAction, 0); }
		public ActionOpContext(ActionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).enterActionOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).exitActionOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApronVisitor ) return ((ApronVisitor<? extends T>)visitor).visitActionOp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DropContext extends ActionContext {
		public TerminalNode DROP() { return getToken(ApronParser.DROP, 0); }
		public DropContext(ActionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).enterDrop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).exitDrop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApronVisitor ) return ((ApronVisitor<? extends T>)visitor).visitDrop(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ModifyFieldContext extends ActionContext {
		public TerminalNode MODIFY() { return getToken(ApronParser.MODIFY, 0); }
		public TerminalNode FIELD() { return getToken(ApronParser.FIELD, 0); }
		public Field_listContext field_list() {
			return getRuleContext(Field_listContext.class,0);
		}
		public ModifyFieldContext(ActionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).enterModifyField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).exitModifyField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApronVisitor ) return ((ApronVisitor<? extends T>)visitor).visitModifyField(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ModifyContext extends ActionContext {
		public TerminalNode MODIFY() { return getToken(ApronParser.MODIFY, 0); }
		public ModifyContext(ActionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).enterModify(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).exitModify(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApronVisitor ) return ((ApronVisitor<? extends T>)visitor).visitModify(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ForwardContext extends ActionContext {
		public TerminalNode FORWARD() { return getToken(ApronParser.FORWARD, 0); }
		public ForwardContext(ActionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).enterForward(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).exitForward(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApronVisitor ) return ((ApronVisitor<? extends T>)visitor).visitForward(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActionContext action() throws RecognitionException {
		ActionContext _localctx = new ActionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_action);
		try {
			setState(259);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				_localctx = new DropContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(252); match(DROP);
				}
				break;

			case 2:
				_localctx = new ForwardContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(253); match(FORWARD);
				}
				break;

			case 3:
				_localctx = new ModifyContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(254); match(MODIFY);
				}
				break;

			case 4:
				_localctx = new ModifyFieldContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(255); match(MODIFY);
				setState(256); match(FIELD);
				setState(257); field_list();
				}
				break;

			case 5:
				_localctx = new ActionOpContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(258); match(OperateAction);
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

	public static class Field_listContext extends ParserRuleContext {
		public Field_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_list; }
	 
		public Field_listContext() { }
		public void copyFrom(Field_listContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FieldM1Context extends Field_listContext {
		public FieldContext field() {
			return getRuleContext(FieldContext.class,0);
		}
		public Field_listContext field_list() {
			return getRuleContext(Field_listContext.class,0);
		}
		public FieldM1Context(Field_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).enterFieldM1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).exitFieldM1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApronVisitor ) return ((ApronVisitor<? extends T>)visitor).visitFieldM1(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FieldM2Context extends Field_listContext {
		public Field_listContext field_list() {
			return getRuleContext(Field_listContext.class,0);
		}
		public TerminalNode MACFields() { return getToken(ApronParser.MACFields, 0); }
		public FieldM2Context(Field_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).enterFieldM2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).exitFieldM2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApronVisitor ) return ((ApronVisitor<? extends T>)visitor).visitFieldM2(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FieldS1Context extends Field_listContext {
		public FieldContext field() {
			return getRuleContext(FieldContext.class,0);
		}
		public FieldS1Context(Field_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).enterFieldS1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).exitFieldS1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApronVisitor ) return ((ApronVisitor<? extends T>)visitor).visitFieldS1(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FieldS2Context extends Field_listContext {
		public TerminalNode MACFields() { return getToken(ApronParser.MACFields, 0); }
		public FieldS2Context(Field_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).enterFieldS2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).exitFieldS2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApronVisitor ) return ((ApronVisitor<? extends T>)visitor).visitFieldS2(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FieldM3Context extends Field_listContext {
		public Field_listContext field_list() {
			return getRuleContext(Field_listContext.class,0);
		}
		public TerminalNode INTFields() { return getToken(ApronParser.INTFields, 0); }
		public FieldM3Context(Field_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).enterFieldM3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).exitFieldM3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApronVisitor ) return ((ApronVisitor<? extends T>)visitor).visitFieldM3(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FieldS3Context extends Field_listContext {
		public TerminalNode INTFields() { return getToken(ApronParser.INTFields, 0); }
		public FieldS3Context(Field_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).enterFieldS3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).exitFieldS3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApronVisitor ) return ((ApronVisitor<? extends T>)visitor).visitFieldS3(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Field_listContext field_list() throws RecognitionException {
		Field_listContext _localctx = new Field_listContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_field_list);
		try {
			setState(274);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				_localctx = new FieldS1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(261); field();
				}
				break;

			case 2:
				_localctx = new FieldS2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(262); match(MACFields);
				}
				break;

			case 3:
				_localctx = new FieldS3Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(263); match(INTFields);
				}
				break;

			case 4:
				_localctx = new FieldM1Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(264); field();
				setState(265); match(3);
				setState(266); field_list();
				}
				break;

			case 5:
				_localctx = new FieldM2Context(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(268); match(MACFields);
				setState(269); match(3);
				setState(270); field_list();
				}
				break;

			case 6:
				_localctx = new FieldM3Context(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(271); match(INTFields);
				setState(272); match(3);
				setState(273); field_list();
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

	public static class OwnershipContext extends ParserRuleContext {
		public OwnershipContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ownership; }
	 
		public OwnershipContext() { }
		public void copyFrom(OwnershipContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AllFlowsContext extends OwnershipContext {
		public TerminalNode ALL_FLOWS() { return getToken(ApronParser.ALL_FLOWS, 0); }
		public AllFlowsContext(OwnershipContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).enterAllFlows(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).exitAllFlows(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApronVisitor ) return ((ApronVisitor<? extends T>)visitor).visitAllFlows(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OwnFlowsContext extends OwnershipContext {
		public TerminalNode OWN_FLOWS() { return getToken(ApronParser.OWN_FLOWS, 0); }
		public OwnFlowsContext(OwnershipContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).enterOwnFlows(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).exitOwnFlows(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApronVisitor ) return ((ApronVisitor<? extends T>)visitor).visitOwnFlows(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OthersFlowsContext extends OwnershipContext {
		public TerminalNode OTHERS_FLOWS() { return getToken(ApronParser.OTHERS_FLOWS, 0); }
		public OthersFlowsContext(OwnershipContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).enterOthersFlows(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).exitOthersFlows(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApronVisitor ) return ((ApronVisitor<? extends T>)visitor).visitOthersFlows(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OwnershipContext ownership() throws RecognitionException {
		OwnershipContext _localctx = new OwnershipContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_ownership);
		try {
			setState(279);
			switch (_input.LA(1)) {
			case OWN_FLOWS:
				_localctx = new OwnFlowsContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(276); match(OWN_FLOWS);
				}
				break;
			case OTHERS_FLOWS:
				_localctx = new OthersFlowsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(277); match(OTHERS_FLOWS);
				}
				break;
			case ALL_FLOWS:
				_localctx = new AllFlowsContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(278); match(ALL_FLOWS);
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

	public static class Max_priorityContext extends ParserRuleContext {
		public Max_priorityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_max_priority; }
	 
		public Max_priorityContext() { }
		public void copyFrom(Max_priorityContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PriorityMaxContext extends Max_priorityContext {
		public TerminalNode MAX_PRIORITY() { return getToken(ApronParser.MAX_PRIORITY, 0); }
		public TerminalNode INT() { return getToken(ApronParser.INT, 0); }
		public PriorityMaxContext(Max_priorityContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).enterPriorityMax(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).exitPriorityMax(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApronVisitor ) return ((ApronVisitor<? extends T>)visitor).visitPriorityMax(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PriorityMinContext extends Max_priorityContext {
		public TerminalNode INT() { return getToken(ApronParser.INT, 0); }
		public TerminalNode MIN_PRIORITY() { return getToken(ApronParser.MIN_PRIORITY, 0); }
		public PriorityMinContext(Max_priorityContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).enterPriorityMin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).exitPriorityMin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApronVisitor ) return ((ApronVisitor<? extends T>)visitor).visitPriorityMin(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Max_priorityContext max_priority() throws RecognitionException {
		Max_priorityContext _localctx = new Max_priorityContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_max_priority);
		try {
			setState(285);
			switch (_input.LA(1)) {
			case MAX_PRIORITY:
				_localctx = new PriorityMaxContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(281); match(MAX_PRIORITY);
				setState(282); match(INT);
				}
				break;
			case MIN_PRIORITY:
				_localctx = new PriorityMinContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(283); match(MIN_PRIORITY);
				setState(284); match(INT);
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

	public static class Flow_tableContext extends ParserRuleContext {
		public Flow_tableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_flow_table; }
	 
		public Flow_tableContext() { }
		public void copyFrom(Flow_tableContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FlowTableBContext extends Flow_tableContext {
		public TerminalNode SIZE_PERCENTAGE_PER_SWITCH() { return getToken(ApronParser.SIZE_PERCENTAGE_PER_SWITCH, 0); }
		public TerminalNode FLOAT() { return getToken(ApronParser.FLOAT, 0); }
		public FlowTableBContext(Flow_tableContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).enterFlowTableB(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).exitFlowTableB(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApronVisitor ) return ((ApronVisitor<? extends T>)visitor).visitFlowTableB(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FlowTableAContext extends Flow_tableContext {
		public TerminalNode INT() { return getToken(ApronParser.INT, 0); }
		public TerminalNode RULE_COUNT_PER_SWITCH() { return getToken(ApronParser.RULE_COUNT_PER_SWITCH, 0); }
		public FlowTableAContext(Flow_tableContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).enterFlowTableA(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).exitFlowTableA(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApronVisitor ) return ((ApronVisitor<? extends T>)visitor).visitFlowTableA(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Flow_tableContext flow_table() throws RecognitionException {
		Flow_tableContext _localctx = new Flow_tableContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_flow_table);
		try {
			setState(291);
			switch (_input.LA(1)) {
			case RULE_COUNT_PER_SWITCH:
				_localctx = new FlowTableAContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(287); match(RULE_COUNT_PER_SWITCH);
				setState(288); match(INT);
				}
				break;
			case SIZE_PERCENTAGE_PER_SWITCH:
				_localctx = new FlowTableBContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(289); match(SIZE_PERCENTAGE_PER_SWITCH);
				setState(290); match(FLOAT);
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

	public static class NotificationContext extends ParserRuleContext {
		public NotificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notification; }
	 
		public NotificationContext() { }
		public void copyFrom(NotificationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class EventInterceptionContext extends NotificationContext {
		public TerminalNode EVENT_INTERCEPTION() { return getToken(ApronParser.EVENT_INTERCEPTION, 0); }
		public EventInterceptionContext(NotificationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).enterEventInterception(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).exitEventInterception(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApronVisitor ) return ((ApronVisitor<? extends T>)visitor).visitEventInterception(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ModifyEventOrderContext extends NotificationContext {
		public TerminalNode MODIFY_EVENT_ORDER() { return getToken(ApronParser.MODIFY_EVENT_ORDER, 0); }
		public ModifyEventOrderContext(NotificationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).enterModifyEventOrder(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).exitModifyEventOrder(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApronVisitor ) return ((ApronVisitor<? extends T>)visitor).visitModifyEventOrder(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NotificationContext notification() throws RecognitionException {
		NotificationContext _localctx = new NotificationContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_notification);
		try {
			setState(295);
			switch (_input.LA(1)) {
			case EVENT_INTERCEPTION:
				_localctx = new EventInterceptionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(293); match(EVENT_INTERCEPTION);
				}
				break;
			case MODIFY_EVENT_ORDER:
				_localctx = new ModifyEventOrderContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(294); match(MODIFY_EVENT_ORDER);
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

	public static class StatisticsContext extends ParserRuleContext {
		public StatisticsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statistics; }
	 
		public StatisticsContext() { }
		public void copyFrom(StatisticsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PortLevelContext extends StatisticsContext {
		public TerminalNode PORT_LEVEL() { return getToken(ApronParser.PORT_LEVEL, 0); }
		public PortLevelContext(StatisticsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).enterPortLevel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).exitPortLevel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApronVisitor ) return ((ApronVisitor<? extends T>)visitor).visitPortLevel(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FlowLevelContext extends StatisticsContext {
		public TerminalNode FLOW_LEVEL() { return getToken(ApronParser.FLOW_LEVEL, 0); }
		public FlowLevelContext(StatisticsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).enterFlowLevel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).exitFlowLevel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApronVisitor ) return ((ApronVisitor<? extends T>)visitor).visitFlowLevel(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SwitchLevelContext extends StatisticsContext {
		public TerminalNode SWITCH_LEVEL() { return getToken(ApronParser.SWITCH_LEVEL, 0); }
		public SwitchLevelContext(StatisticsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).enterSwitchLevel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).exitSwitchLevel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApronVisitor ) return ((ApronVisitor<? extends T>)visitor).visitSwitchLevel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatisticsContext statistics() throws RecognitionException {
		StatisticsContext _localctx = new StatisticsContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_statistics);
		try {
			setState(300);
			switch (_input.LA(1)) {
			case FLOW_LEVEL:
				_localctx = new FlowLevelContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(297); match(FLOW_LEVEL);
				}
				break;
			case PORT_LEVEL:
				_localctx = new PortLevelContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(298); match(PORT_LEVEL);
				}
				break;
			case SWITCH_LEVEL:
				_localctx = new SwitchLevelContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(299); match(SWITCH_LEVEL);
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

	public static class Pkt_outContext extends ParserRuleContext {
		public Pkt_outContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pkt_out; }
	 
		public Pkt_outContext() { }
		public void copyFrom(Pkt_outContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PktOutDenyContext extends Pkt_outContext {
		public TerminalNode FROM_PKT_IN() { return getToken(ApronParser.FROM_PKT_IN, 0); }
		public PktOutDenyContext(Pkt_outContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).enterPktOutDeny(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).exitPktOutDeny(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApronVisitor ) return ((ApronVisitor<? extends T>)visitor).visitPktOutDeny(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PktOutAllowContext extends Pkt_outContext {
		public TerminalNode ARBITRARY() { return getToken(ApronParser.ARBITRARY, 0); }
		public PktOutAllowContext(Pkt_outContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).enterPktOutAllow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).exitPktOutAllow(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApronVisitor ) return ((ApronVisitor<? extends T>)visitor).visitPktOutAllow(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pkt_outContext pkt_out() throws RecognitionException {
		Pkt_outContext _localctx = new Pkt_outContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_pkt_out);
		try {
			setState(304);
			switch (_input.LA(1)) {
			case FROM_PKT_IN:
				_localctx = new PktOutDenyContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(302); match(FROM_PKT_IN);
				}
				break;
			case ARBITRARY:
				_localctx = new PktOutAllowContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(303); match(ARBITRARY);
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

	public static class Perm_nameContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(ApronParser.STRING, 0); }
		public Perm_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_perm_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).enterPerm_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).exitPerm_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApronVisitor ) return ((ApronVisitor<? extends T>)visitor).visitPerm_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Perm_nameContext perm_name() throws RecognitionException {
		Perm_nameContext _localctx = new Perm_nameContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_perm_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306); match(STRING);
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

	public static class SystemContext extends ParserRuleContext {
		public SystemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_system; }
	 
		public SystemContext() { }
		public void copyFrom(SystemContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NetworkDenyContext extends SystemContext {
		public TerminalNode DenyNetworkAccess() { return getToken(ApronParser.DenyNetworkAccess, 0); }
		public NetworkDenyContext(SystemContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).enterNetworkDeny(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).exitNetworkDeny(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApronVisitor ) return ((ApronVisitor<? extends T>)visitor).visitNetworkDeny(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FileDenyContext extends SystemContext {
		public TerminalNode DenyFileSystem() { return getToken(ApronParser.DenyFileSystem, 0); }
		public FileDenyContext(SystemContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).enterFileDeny(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).exitFileDeny(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApronVisitor ) return ((ApronVisitor<? extends T>)visitor).visitFileDeny(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NetworkAllowContext extends SystemContext {
		public TerminalNode AllowNetworkAccess() { return getToken(ApronParser.AllowNetworkAccess, 0); }
		public NetworkAllowContext(SystemContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).enterNetworkAllow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).exitNetworkAllow(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApronVisitor ) return ((ApronVisitor<? extends T>)visitor).visitNetworkAllow(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FileAllowContext extends SystemContext {
		public TerminalNode AllowFileSystem() { return getToken(ApronParser.AllowFileSystem, 0); }
		public FileAllowContext(SystemContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).enterFileAllow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).exitFileAllow(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApronVisitor ) return ((ApronVisitor<? extends T>)visitor).visitFileAllow(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ProcessDenyContext extends SystemContext {
		public TerminalNode DenyProcessRuntime() { return getToken(ApronParser.DenyProcessRuntime, 0); }
		public ProcessDenyContext(SystemContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).enterProcessDeny(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).exitProcessDeny(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApronVisitor ) return ((ApronVisitor<? extends T>)visitor).visitProcessDeny(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ProcessAllowContext extends SystemContext {
		public TerminalNode AllowProcessRuntime() { return getToken(ApronParser.AllowProcessRuntime, 0); }
		public ProcessAllowContext(SystemContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).enterProcessAllow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ApronListener ) ((ApronListener)listener).exitProcessAllow(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApronVisitor ) return ((ApronVisitor<? extends T>)visitor).visitProcessAllow(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SystemContext system() throws RecognitionException {
		SystemContext _localctx = new SystemContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_system);
		try {
			setState(314);
			switch (_input.LA(1)) {
			case AllowNetworkAccess:
				_localctx = new NetworkAllowContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(308); match(AllowNetworkAccess);
				}
				break;
			case DenyNetworkAccess:
				_localctx = new NetworkDenyContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(309); match(DenyNetworkAccess);
				}
				break;
			case AllowFileSystem:
				_localctx = new FileAllowContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(310); match(AllowFileSystem);
				}
				break;
			case DenyFileSystem:
				_localctx = new FileDenyContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(311); match(DenyFileSystem);
				}
				break;
			case AllowProcessRuntime:
				_localctx = new ProcessAllowContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(312); match(AllowProcessRuntime);
				}
				break;
			case DenyProcessRuntime:
				_localctx = new ProcessDenyContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(313); match(DenyProcessRuntime);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 3: return filter_expr_sempred((Filter_exprContext)_localctx, predIndex);

		case 4: return filter_term_sempred((Filter_termContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean filter_expr_sempred(Filter_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return 1 >= _localctx._p;
		}
		return true;
	}
	private boolean filter_term_sempred(Filter_termContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1: return 1 >= _localctx._p;
		}
		return true;
	}

	public static final String _serializedATN =
		"\2\3i\u013f\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4"+
		"\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20"+
		"\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27"+
		"\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36"+
		"\4\37\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\3\2\3\2\3\3\3\3\3\3\3\3\5\3M\n\3"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4V\n\4\3\5\3\5\3\5\3\5\3\5\3\5\7\5^\n\5"+
		"\f\5\16\5a\13\5\3\6\3\6\3\6\3\6\3\6\3\6\7\6i\n\6\f\6\16\6l\13\6\3\7\3"+
		"\7\3\7\5\7q\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\5\b\u0082\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\5\t\u0094\n\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\f\3\f\5\f\u00a6\n\f\3\r\3\r\5\r\u00aa\n\r"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00b8"+
		"\n\17\3\20\3\20\3\20\3\20\3\20\5\20\u00bf\n\20\3\21\3\21\3\22\3\22\3\22"+
		"\5\22\u00c6\n\22\3\23\3\23\3\23\3\23\3\23\5\23\u00cd\n\23\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00d8\n\24\3\25\3\25\3\25\3\25"+
		"\3\25\5\25\u00df\n\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\30\3\30\3\30\3\30\3\30\5\30\u00f1\n\30\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\5\31\u00fd\n\31\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\5\32\u0106\n\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\5\33\u0115\n\33\3\34\3\34\3\34\5\34\u011a\n\34\3\35\3"+
		"\35\3\35\3\35\5\35\u0120\n\35\3\36\3\36\3\36\3\36\5\36\u0126\n\36\3\37"+
		"\3\37\5\37\u012a\n\37\3 \3 \3 \5 \u012f\n \3!\3!\5!\u0133\n!\3\"\3\"\3"+
		"#\3#\3#\3#\3#\3#\5#\u013d\n#\3#\2$\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&(*,.\60\62\64\668:<>@BD\2\3\4\r\r!%\u0151\2F\3\2\2\2\4L\3\2\2"+
		"\2\6U\3\2\2\2\bW\3\2\2\2\nb\3\2\2\2\fp\3\2\2\2\16\u0081\3\2\2\2\20\u0093"+
		"\3\2\2\2\22\u0095\3\2\2\2\24\u0097\3\2\2\2\26\u00a5\3\2\2\2\30\u00a9\3"+
		"\2\2\2\32\u00ab\3\2\2\2\34\u00b7\3\2\2\2\36\u00be\3\2\2\2 \u00c0\3\2\2"+
		"\2\"\u00c5\3\2\2\2$\u00cc\3\2\2\2&\u00d7\3\2\2\2(\u00de\3\2\2\2*\u00e0"+
		"\3\2\2\2,\u00e4\3\2\2\2.\u00f0\3\2\2\2\60\u00fc\3\2\2\2\62\u0105\3\2\2"+
		"\2\64\u0114\3\2\2\2\66\u0119\3\2\2\28\u011f\3\2\2\2:\u0125\3\2\2\2<\u0129"+
		"\3\2\2\2>\u012e\3\2\2\2@\u0132\3\2\2\2B\u0134\3\2\2\2D\u013c\3\2\2\2F"+
		"G\5\4\3\2G\3\3\2\2\2HM\5\6\4\2IJ\5\6\4\2JK\5\4\3\2KM\3\2\2\2LH\3\2\2\2"+
		"LI\3\2\2\2M\5\3\2\2\2NO\7\24\2\2OV\5B\"\2PQ\7\24\2\2QR\5B\"\2RS\7\25\2"+
		"\2ST\5\b\5\2TV\3\2\2\2UN\3\2\2\2UP\3\2\2\2V\7\3\2\2\2WX\b\5\1\2XY\5\n"+
		"\6\2Y_\3\2\2\2Z[\6\5\2\3[\\\7Z\2\2\\^\5\n\6\2]Z\3\2\2\2^a\3\2\2\2_]\3"+
		"\2\2\2_`\3\2\2\2`\t\3\2\2\2a_\3\2\2\2bc\b\6\1\2cd\5\f\7\2dj\3\2\2\2ef"+
		"\6\6\3\3fg\7[\2\2gi\5\f\7\2he\3\2\2\2il\3\2\2\2jh\3\2\2\2jk\3\2\2\2k\13"+
		"\3\2\2\2lj\3\2\2\2mq\5\16\b\2no\7\\\2\2oq\5\f\7\2pm\3\2\2\2pn\3\2\2\2"+
		"q\r\3\2\2\2rs\7\6\2\2st\5\b\5\2tu\7\4\2\2u\u0082\3\2\2\2v\u0082\5\20\t"+
		"\2w\u0082\5\30\r\2xy\7\26\2\2y\u0082\5\62\32\2z\u0082\5\66\34\2{\u0082"+
		"\58\35\2|\u0082\5:\36\2}\u0082\5<\37\2~\u0082\5> \2\177\u0082\5@!\2\u0080"+
		"\u0082\5D#\2\u0081r\3\2\2\2\u0081v\3\2\2\2\u0081w\3\2\2\2\u0081x\3\2\2"+
		"\2\u0081z\3\2\2\2\u0081{\3\2\2\2\u0081|\3\2\2\2\u0081}\3\2\2\2\u0081~"+
		"\3\2\2\2\u0081\177\3\2\2\2\u0081\u0080\3\2\2\2\u0082\17\3\2\2\2\u0083"+
		"\u0084\5\22\n\2\u0084\u0085\5\26\f\2\u0085\u0094\3\2\2\2\u0086\u0087\5"+
		"\22\n\2\u0087\u0088\5\26\f\2\u0088\u0089\7L\2\2\u0089\u008a\5\26\f\2\u008a"+
		"\u0094\3\2\2\2\u008b\u008c\7&\2\2\u008c\u008d\5\22\n\2\u008d\u008e\5\26"+
		"\f\2\u008e\u0094\3\2\2\2\u008f\u0090\7\n\2\2\u0090\u0094\5\24\13\2\u0091"+
		"\u0092\7\13\2\2\u0092\u0094\7G\2\2\u0093\u0083\3\2\2\2\u0093\u0086\3\2"+
		"\2\2\u0093\u008b\3\2\2\2\u0093\u008f\3\2\2\2\u0093\u0091\3\2\2\2\u0094"+
		"\21\3\2\2\2\u0095\u0096\t\2\2\2\u0096\23\3\2\2\2\u0097\u0098\7J\2\2\u0098"+
		"\u0099\7\7\2\2\u0099\u009a\7J\2\2\u009a\u009b\7\7\2\2\u009b\u009c\7J\2"+
		"\2\u009c\u009d\7\7\2\2\u009d\u009e\7J\2\2\u009e\u009f\7\7\2\2\u009f\u00a0"+
		"\7J\2\2\u00a0\u00a1\7\7\2\2\u00a1\u00a2\7J\2\2\u00a2\25\3\2\2\2\u00a3"+
		"\u00a6\7G\2\2\u00a4\u00a6\7M\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a4\3\2\2"+
		"\2\u00a6\27\3\2\2\2\u00a7\u00aa\5\32\16\2\u00a8\u00aa\5,\27\2\u00a9\u00a7"+
		"\3\2\2\2\u00a9\u00a8\3\2\2\2\u00aa\31\3\2\2\2\u00ab\u00ac\7N\2\2\u00ac"+
		"\u00ad\5\34\17\2\u00ad\u00ae\7Z\2\2\u00ae\u00af\7O\2\2\u00af\u00b0\5\""+
		"\22\2\u00b0\33\3\2\2\2\u00b1\u00b8\7P\2\2\u00b2\u00b8\7Q\2\2\u00b3\u00b4"+
		"\7\3\2\2\u00b4\u00b5\5\36\20\2\u00b5\u00b6\7\b\2\2\u00b6\u00b8\3\2\2\2"+
		"\u00b7\u00b1\3\2\2\2\u00b7\u00b2\3\2\2\2\u00b7\u00b3\3\2\2\2\u00b8\35"+
		"\3\2\2\2\u00b9\u00bf\5 \21\2\u00ba\u00bb\5 \21\2\u00bb\u00bc\7\5\2\2\u00bc"+
		"\u00bd\5\36\20\2\u00bd\u00bf\3\2\2\2\u00be\u00b9\3\2\2\2\u00be\u00ba\3"+
		"\2\2\2\u00bf\37\3\2\2\2\u00c0\u00c1\7G\2\2\u00c1!\3\2\2\2\u00c2\u00c6"+
		"\7R\2\2\u00c3\u00c6\7S\2\2\u00c4\u00c6\5$\23\2\u00c5\u00c2\3\2\2\2\u00c5"+
		"\u00c3\3\2\2\2\u00c5\u00c4\3\2\2\2\u00c6#\3\2\2\2\u00c7\u00cd\5&\24\2"+
		"\u00c8\u00c9\5&\24\2\u00c9\u00ca\7\5\2\2\u00ca\u00cb\5$\23\2\u00cb\u00cd"+
		"\3\2\2\2\u00cc\u00c7\3\2\2\2\u00cc\u00c8\3\2\2\2\u00cd%\3\2\2\2\u00ce"+
		"\u00cf\5*\26\2\u00cf\u00d0\7\7\2\2\u00d0\u00d1\5*\26\2\u00d1\u00d2\7\t"+
		"\2\2\u00d2\u00d8\3\2\2\2\u00d3\u00d4\7\6\2\2\u00d4\u00d5\5(\25\2\u00d5"+
		"\u00d6\7\4\2\2\u00d6\u00d8\3\2\2\2\u00d7\u00ce\3\2\2\2\u00d7\u00d3\3\2"+
		"\2\2\u00d8\'\3\2\2\2\u00d9\u00df\5*\26\2\u00da\u00db\5*\26\2\u00db\u00dc"+
		"\7\7\2\2\u00dc\u00dd\5(\25\2\u00dd\u00df\3\2\2\2\u00de\u00d9\3\2\2\2\u00de"+
		"\u00da\3\2\2\2\u00df)\3\2\2\2\u00e0\u00e1\5 \21\2\u00e1\u00e2\7\5\2\2"+
		"\u00e2\u00e3\7G\2\2\u00e3+\3\2\2\2\u00e4\u00e5\7T\2\2\u00e5\u00e6\7N\2"+
		"\2\u00e6\u00e7\5.\30\2\u00e7\u00e8\7Z\2\2\u00e8\u00e9\7O\2\2\u00e9\u00ea"+
		"\5\"\22\2\u00ea-\3\2\2\2\u00eb\u00f1\7U\2\2\u00ec\u00ed\7\3\2\2\u00ed"+
		"\u00ee\5\60\31\2\u00ee\u00ef\7\b\2\2\u00ef\u00f1\3\2\2\2\u00f0\u00eb\3"+
		"\2\2\2\u00f0\u00ec\3\2\2\2\u00f1/\3\2\2\2\u00f2\u00f3\5\34\17\2\u00f3"+
		"\u00f4\7]\2\2\u00f4\u00f5\5 \21\2\u00f5\u00fd\3\2\2\2\u00f6\u00f7\5\34"+
		"\17\2\u00f7\u00f8\7]\2\2\u00f8\u00f9\5 \21\2\u00f9\u00fa\7\5\2\2\u00fa"+
		"\u00fb\5\60\31\2\u00fb\u00fd\3\2\2\2\u00fc\u00f2\3\2\2\2\u00fc\u00f6\3"+
		"\2\2\2\u00fd\61\3\2\2\2\u00fe\u0106\7V\2\2\u00ff\u0106\7W\2\2\u0100\u0106"+
		"\7X\2\2\u0101\u0102\7X\2\2\u0102\u0103\7Y\2\2\u0103\u0106\5\64\33\2\u0104"+
		"\u0106\7\23\2\2\u0105\u00fe\3\2\2\2\u0105\u00ff\3\2\2\2\u0105\u0100\3"+
		"\2\2\2\u0105\u0101\3\2\2\2\u0105\u0104\3\2\2\2\u0106\63\3\2\2\2\u0107"+
		"\u0115\5\22\n\2\u0108\u0115\7\n\2\2\u0109\u0115\7\13\2\2\u010a\u010b\5"+
		"\22\n\2\u010b\u010c\7\5\2\2\u010c\u010d\5\64\33\2\u010d\u0115\3\2\2\2"+
		"\u010e\u010f\7\n\2\2\u010f\u0110\7\5\2\2\u0110\u0115\5\64\33\2\u0111\u0112"+
		"\7\13\2\2\u0112\u0113\7\5\2\2\u0113\u0115\5\64\33\2\u0114\u0107\3\2\2"+
		"\2\u0114\u0108\3\2\2\2\u0114\u0109\3\2\2\2\u0114\u010a\3\2\2\2\u0114\u010e"+
		"\3\2\2\2\u0114\u0111\3\2\2\2\u0115\65\3\2\2\2\u0116\u011a\7\27\2\2\u0117"+
		"\u011a\7\30\2\2\u0118\u011a\7\31\2\2\u0119\u0116\3\2\2\2\u0119\u0117\3"+
		"\2\2\2\u0119\u0118\3\2\2\2\u011a\67\3\2\2\2\u011b\u011c\7\32\2\2\u011c"+
		"\u0120\7G\2\2\u011d\u011e\7\33\2\2\u011e\u0120\7G\2\2\u011f\u011b\3\2"+
		"\2\2\u011f\u011d\3\2\2\2\u01209\3\2\2\2\u0121\u0122\7^\2\2\u0122\u0126"+
		"\7G\2\2\u0123\u0124\7_\2\2\u0124\u0126\7H\2\2\u0125\u0121\3\2\2\2\u0125"+
		"\u0123\3\2\2\2\u0126;\3\2\2\2\u0127\u012a\7\34\2\2\u0128\u012a\7\35\2"+
		"\2\u0129\u0127\3\2\2\2\u0129\u0128\3\2\2\2\u012a=\3\2\2\2\u012b\u012f"+
		"\7\36\2\2\u012c\u012f\7\37\2\2\u012d\u012f\7 \2\2\u012e\u012b\3\2\2\2"+
		"\u012e\u012c\3\2\2\2\u012e\u012d\3\2\2\2\u012f?\3\2\2\2\u0130\u0133\7"+
		"`\2\2\u0131\u0133\7a\2\2\u0132\u0130\3\2\2\2\u0132\u0131\3\2\2\2\u0133"+
		"A\3\2\2\2\u0134\u0135\7h\2\2\u0135C\3\2\2\2\u0136\u013d\7b\2\2\u0137\u013d"+
		"\7c\2\2\u0138\u013d\7d\2\2\u0139\u013d\7e\2\2\u013a\u013d\7f\2\2\u013b"+
		"\u013d\7g\2\2\u013c\u0136\3\2\2\2\u013c\u0137\3\2\2\2\u013c\u0138\3\2"+
		"\2\2\u013c\u0139\3\2\2\2\u013c\u013a\3\2\2\2\u013c\u013b\3\2\2\2\u013d"+
		"E\3\2\2\2\34LU_jp\u0081\u0093\u00a5\u00a9\u00b7\u00be\u00c5\u00cc\u00d7"+
		"\u00de\u00f0\u00fc\u0105\u0114\u0119\u011f\u0125\u0129\u012e\u0132\u013c";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}