package apron.unittest;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import apron.acl.ACLRequest;
import apron.data.FlowTables;
import apron.data.OFActionType;
import apron.data.OFMatch;
import apron.data.OFType;
import apron.permissionlanguage.ApronLexer;
import apron.permissionlanguage.ApronParser;
import apron.permissionlanguage.Evaluator;
import apron.permissionlanguage.SyntaxGenerator;

public class EvaluatorUnitTest {
	
	private static String lan = "PERM ltwoswitch_s LIMITING IP_SRC 10.10.10.10 "
			+ "PERM ltwoswitch_s LIMITING IP_DST 20.20.20.20 "
			+ "PERM ltwoswitch_s LIMITING TCP_SRC 8080 "
			+ "PERM ltwoswitch_s LIMITING TCP_DST 22 "
			+ "PERM ltwoswitch_s LIMITING ETH_SRC 1f:1f:1f:1f:1f:1f "
			+ "PERM ltwoswitch_s LIMITING ETH_DST ff:ff:ff:ff:ff:ff "
			+ "PERM ltwoswitch_s LIMITING UDP_SRC 8080 "
			+ "PERM ltwoswitch_s LIMITING UDP_DST 22 "
			+ "PERM ltwoswitch_s LIMITING ACTION PUSH_MPLS "
			+ "OR ACTION POP_MPLS "
			+ "OR ACTION PUSH_VLAN "
			+ "OR ACTION POP_VLAN "
			+ "OR ACTION SET_NW_TTL "
			+ "OR ACTION DEC_NW_TTL "
			+ "PERM ltwoswitch_s LIMITING OWN_FLOWS "
			+ "PERM ltwoswitch_s LIMITING EVENT_INTERCEPTION "
			+ "PERM ltwoswitch_s LIMITING FLOW_LEVEL OR PORT_LEVEL "
			+ "PERM ltwoswitch_s LIMITING ARBITRARY OR FROM_PKT_IN "
			+ "PERM ltwoswitch_s LIMITING MAX_PRIORITY 60000 "
			+ "PERM ltwoswitch_s LIMITING RULE_COUNT_PER_SWITCH 250 OR SIZE_PERCENTAGE_PER_SWITCH 0.7";
	private static Evaluator executor;
	
	private static Evaluator CreateEvaluator(String Lan) throws IOException{
		InputStream is = new ByteArrayInputStream(Lan.getBytes());
		ANTLRInputStream input = new ANTLRInputStream(is);
		ApronLexer lexer = new ApronLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		ApronParser parser = new ApronParser(tokens);
		ParseTree tree = parser.program(); // parse

        SyntaxGenerator syn = new SyntaxGenerator();
        return new Evaluator(syn.visit(tree));
	}
		
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		executor = CreateEvaluator(lan);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public final void testExecuteACLRequest() {
		ACLRequest req = new ACLRequest();
		// 0. set up b4 other operations.
		req.setApp("ltwoswitch_s");
		req.setSwitchID(1234);
		FlowTables virtTable = new FlowTables();
		req.setVirtTable(virtTable);
		
		if(executor.execute(req) == false)
			fail("empty request");
		
		// 1. set flow match.
		OFMatch match = new OFMatch();
		match.setArpIpSrc(Evaluator.stringToIp("10.10.10.10"));
		match.setArpIpDst(Evaluator.stringToIp("20.20.20.20"));
		match.setTcpSrcPort(8080);
		match.setTcpDstPort(22);
		match.setUdpSrcPort(8080);
		match.setUdpDstPort(22);
		match.setEthSrc(ACLRequest.mac2long("1f:1f:1f:1f:1f:1f"));
		match.setEthDst(ACLRequest.mac2long("ff:ff:ff:ff:ff:ff"));
		req.setMatch(match);
		if(executor.execute(req) != true)
			fail("flow match #01"); 
		
		match = new OFMatch();
		match.setArpIpSrc(Evaluator.stringToIp("10.10.10.10"));
		match.setArpIpDst(Evaluator.stringToIp("20.20.20.20"));
		match.setTcpSrcPort(8080);
		match.setTcpDstPort(22);
		match.setUdpSrcPort(8080);
		match.setUdpDstPort(22);
		match.setEthSrc(ACLRequest.mac2long("1f:1f:1f:1f:1f:1f"));
		match.setEthDst(ACLRequest.mac2long("ff:ff:ff:ff:ff:fd"));
		req.setMatch(match);
		if(executor.execute(req) != false)
			fail("flow match #02"); 

		match = new OFMatch();
		req.setMatch(match);
		
		// 1. set flow action.
		req.addAction(OFActionType.PUSH_MPLS);
		if(executor.execute(req) != true)
			fail("action #01");
		
		req.addAction(OFActionType.POP_MPLS);
		req.addAction(OFActionType.PUSH_VLAN);
		req.addAction(OFActionType.POP_VLAN);
		req.addAction(OFActionType.SET_NW_TTL);
		req.addAction(OFActionType.DEC_NW_TTL);
		if(executor.execute(req) != false)
			fail("action #02");

		req.addAction(OFActionType.PUSH_PBB);
		if(executor.execute(req) != false)
			fail("action #03");
		
		req = new ACLRequest();
		if(executor.execute(req) != true)
			fail("topo"); // TODO
		
		if(executor.execute(req) != true)
			fail("ownership"); // checked in match.

		req = new ACLRequest();
		req.setApp("ltwoswitch_s");
		req.setSwitchID(1234);
		req.setVirtTable(virtTable);
		req.eventInterception();
		if(executor.execute(req) != true)
			fail("notification #01"); 
		
		req = new ACLRequest();
		req.setApp("ltwoswitch_s");
		req.setSwitchID(1234);
		req.setVirtTable(virtTable);
		req.modifyEventOrder();
		if(executor.execute(req) != false)
			fail("notification #02"); 

		req = new ACLRequest();
		req.setApp("ltwoswitch_s");
		req.setSwitchID(1234);
		req.setVirtTable(virtTable);
		req.setStatisticsLevelFlow();
		if(executor.execute(req) != true)
			fail("statistics");
		
		req = new ACLRequest();
		req.setApp("ltwoswitch_s");
		req.setSwitchID(1234);
		req.setVirtTable(virtTable);
		req.setStatisticsLevelPort();
		if(executor.execute(req) != true)
			fail("statistics");
		
		req = new ACLRequest();
		req.setApp("ltwoswitch_s");
		req.setSwitchID(1234);
		req.setVirtTable(virtTable);
		req.setStatisticsLevelSwitch();
		if(executor.execute(req) != false)
			fail("statistics");

		req = new ACLRequest();
		req.setApp("ltwoswitch_s");
		req.setSwitchID(1234);
		req.setVirtTable(virtTable);
		req.setType(OFType.PACKET_OUT);
		if(executor.execute(req) != true)
			fail("pkt out"); // TODO
	}

}
