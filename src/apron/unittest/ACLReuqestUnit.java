/**
 * 
 */
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
import apron.data.OFMatch;
import apron.data.OFType;
import apron.permissionlanguage.ApronLexer;
import apron.permissionlanguage.ApronParser;
import apron.permissionlanguage.Evaluator;
import apron.permissionlanguage.SyntaxGenerator;

/**
 * @author Jack
 *
 */
public class ACLReuqestUnit {
	
	private static String lan = "PERM ltwoswitch_s LIMITING IP_SRC 10.10.10.10 "
			+ "PERM ltwoswitch_s LIMITING IP_DST 20.20.20.20 "
			+ "PERM ltwoswitch_s LIMITING TCP_SRC 8080 "
			+ "PERM ltwoswitch_s LIMITING TCP_DST 22 "
			+ "PERM ltwoswitch_s LIMITING ETH_SRC 1f:1f:1f:1f:1f:1f "
			+ "PERM ltwoswitch_s LIMITING ETH_DST ff:ff:ff:ff:ff:ff "
			+ "PERM ltwoswitch_s LIMITING UDP_SRC 8080 "
			+ "PERM ltwoswitch_s LIMITING UDP_DST 22 "
			+ "PERM ltwoswitch_s LIMITING ACTION PUSH_MPLS "
			+ "PERM ltwoswitch_s LIMITING ACTION POP_MPLS "
			+ "PERM ltwoswitch_s LIMITING ACTION PUSH_VLAN "
			+ "PERM ltwoswitch_s LIMITING ACTION POP_VLAN "
			+ "PERM ltwoswitch_s LIMITING ACTION SET_NW_TTL "
			+ "PERM ltwoswitch_s LIMITING ACTION DEC_NW_TTL "
			+ "PERM ltwoswitch_s LIMITING OWN_FLOWS "
			+ "PERM ltwoswitch_s LIMITING EVENT_INTERCEPTION "
			+ "PERM ltwoswitch_s LIMITING FLOW_LEVEL "
			+ "PERM ltwoswitch_s LIMITING ARBITRARY OR FROM_PKT_IN "
			+ "PERM ltwoswitch_s LIMITING MAX_PRIORITY 60000 "
			+ "PERM ltwoswitch_s LIMITING RULE_COUNT_PER_SWITCH 250";
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

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		executor = CreateEvaluator(lan);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link apron.acl.ACLRequest#getApp()}.
	 */
	@Test
	public final void testGetApp() {
		ACLRequest req = new ACLRequest();
		String appName = "test";
		req.setApp(appName);
		if(req.getApp().equals(appName) == false)
			fail("get the wrong app name.");
	}

	/**
	 * Test method for {@link apron.acl.ACLRequest#setApp(java.lang.String)}.
	 */
	@Test
	public final void testSetApp() {
		this.testGetApp();
	}

	/**
	 * Test method for {@link apron.acl.ACLRequest#getSwitchID()}.
	 */
	@Test
	public final void testGetSwitchID() {
		ACLRequest req = new ACLRequest();
		long sid = 1234;
		req.setSwitchID(sid);
		if(req.getSwitchID() != sid)
			fail("");
	}

	/**
	 * Test method for {@link apron.acl.ACLRequest#setSwitchID(long)}.
	 */
	@Test
	public final void testSetSwitchID() {
		ACLRequest req = new ACLRequest();
		long sid = 1234;
		req.setSwitchID(sid);
		if(req.getSwitchID() != sid)
			fail("");
	}

	/**
	 * Test method for {@link apron.acl.ACLRequest#getType()}.
	 */
	@Test
	public final void testGetType() {
		ACLRequest req = new ACLRequest();
		req.setType(OFType.FLOW_ADD);
		if(req.getType() != OFType.FLOW_ADD)
			fail("");
	}

	/**
	 * Test method for {@link apron.acl.ACLRequest#setType(apron.data.OFType)}.
	 */
	@Test
	public final void testSetType() {
		this.testGetType();
	}

	/**
	 * Test method for {@link apron.acl.ACLRequest#setMatch(apron.data.OFMatch)}.
	 */
	@Test
	public final void testSetMatch() {
		ACLRequest req = new ACLRequest();
		req.setMatch(new OFMatch());
		if(req.getMatch().equals(new OFMatch()) == false)
			fail("");
	}

	/**
	 * Test method for {@link apron.acl.ACLRequest#getMatch()}.
	 */
	@Test
	public final void testGetMatch() {
		this.testSetMatch();
	}

	/**
	 * Test method for {@link apron.acl.ACLRequest#getFieldMask(java.lang.String)}.
	 */
	@Test
	public final void testGetFieldMask() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link apron.acl.ACLRequest#getFieldValue(java.lang.String)}.
	 */
	@Test
	public final void testGetFieldValue() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link apron.acl.ACLRequest#mac2long(java.lang.String)}.
	 */
	@Test
	public final void testMac2long() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link apron.acl.ACLRequest#getMACField(java.lang.String)}.
	 */
	@Test
	public final void testGetMACField() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link apron.acl.ACLRequest#getIntField(java.lang.String)}.
	 */
	@Test
	public final void testGetIntField() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link apron.acl.ACLRequest#addAction(apron.data.OFActionType)}.
	 */
	@Test
	public final void testAddActionOFActionType() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link apron.acl.ACLRequest#addAction(apron.data.OFActionType, long)}.
	 */
	@Test
	public final void testAddActionOFActionTypeLong() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link apron.acl.ACLRequest#getActionSize()}.
	 */
	@Test
	public final void testGetActionSize() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link apron.acl.ACLRequest#checkNotification(java.lang.String)}.
	 */
	@Test
	public final void testCheckNotification() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link apron.acl.ACLRequest#eventInterception()}.
	 */
	@Test
	public final void testEventInterception() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link apron.acl.ACLRequest#modifyEventOrder()}.
	 */
	@Test
	public final void testModifyEventOrder() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link apron.acl.ACLRequest#setStatisticsLevelFlow()}.
	 */
	@Test
	public final void testSetStatisticsLevelFlow() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link apron.acl.ACLRequest#setStatisticsLevelPort()}.
	 */
	@Test
	public final void testSetStatisticsLevelPort() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link apron.acl.ACLRequest#setStatisticsLevelSwitch()}.
	 */
	@Test
	public final void testSetStatisticsLevelSwitch() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link apron.acl.ACLRequest#isFlowLevel()}.
	 */
	@Test
	public final void testIsFlowLevel() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link apron.acl.ACLRequest#isPortLevel()}.
	 */
	@Test
	public final void testIsPortLevel() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link apron.acl.ACLRequest#isSwitchLevel()}.
	 */
	@Test
	public final void testIsSwitchLevel() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link apron.acl.ACLRequest#isStatisticsTrue(apron.acl.ACLRequest.OFStatisticsLevel)}.
	 */
	@Test
	public final void testIsStatisticsTrue() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link apron.acl.ACLRequest#checkStatistics(java.lang.String)}.
	 */
	@Test
	public final void testCheckStatistics() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link apron.acl.ACLRequest#getVirtTable()}.
	 */
	@Test
	public final void testGetVirtTable() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link apron.acl.ACLRequest#setVirtTable(apron.data.FlowTables)}.
	 */
	@Test
	public final void testSetVirtTable() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link apron.acl.ACLRequest#createHandler()}.
	 */
	@Test
	public final void testCreateHandler() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link apron.acl.ACLRequest#createHandler(apron.data.Flow)}.
	 */
	@Test
	public final void testCreateHandlerFlow() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link apron.acl.ACLRequest#ownFlows()}.
	 */
	@Test
	public final void testOwnFlows() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link apron.acl.ACLRequest#othersFlows()}.
	 */
	@Test
	public final void testOthersFlows() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link apron.acl.ACLRequest#allFlows()}.
	 */
	@Test
	public final void testAllFlows() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link apron.acl.ACLRequest#checkOwnRule()}.
	 */
	@Test
	public final void testCheckOwnRule() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link apron.acl.ACLRequest#checkOtherRule()}.
	 */
	@Test
	public final void testCheckOtherRule() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link apron.acl.ACLRequest#checkAllRule()}.
	 */
	@Test
	public final void testCheckAllRule() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link apron.acl.ACLRequest#checkRuleCount(int)}.
	 */
	@Test
	public final void testCheckRuleCount() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link apron.acl.ACLRequest#checkRulePercentage(float)}.
	 */
	@Test
	public final void testCheckRulePercentage() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link apron.acl.ACLRequest#getPriority()}.
	 */
	@Test
	public final void testGetPriority() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link apron.acl.ACLRequest#setPriority(long)}.
	 */
	@Test
	public final void testSetPriority() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link apron.acl.ACLRequest#isPktOut()}.
	 */
	@Test
	public final void testIsPktOut() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link apron.acl.ACLRequest#setActions(java.util.List)}.
	 */
	@Test
	public final void testSetActions() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link apron.acl.ACLRequest#getTopo()}.
	 */
	@Test
	public final void testGetTopo() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link apron.acl.ACLRequest#setTopo(apron.acl.ITopologyManager)}.
	 */
	@Test
	public final void testSetTopo() {
		fail("Not yet implemented"); // TODO
	}

}
