package apron.acl;

import java.util.ArrayList;
import java.util.List;

import apron.data.Flow;
import apron.data.FlowTables;
import apron.data.OFActionType;
import apron.data.OFMatch;
import apron.data.OFType;

public class ACLRequest{

	// 0. App name, switch id
	
	// 0.1 the identify of each API caller.
    private String app = new String("");
    /**
	 * @return the app
	 */
	public String getApp() {
		return app;
	}
	/**
	 * @param app the app to set
	 */
	public void setApp(String app) {
		this.app = app;
	}

	// 0.2 switch id;
	private long switchID;
	/**
	 * @return the switchID
	 */
	public long getSwitchID() {
		return switchID;
	}
	/**
	 * @param switchID the switchID to set
	 */
	public void setSwitchID(long switchID) {
		this.switchID = switchID;
	}

	// 0.3 type of the detail message: packet_out, flow_mod
	private OFType type;
    
    /**
	 * @return the type
	 */
	public OFType getType() {
		return type;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(OFType type) {
		this.type = type;
	}
		
	// 1. flow predicate
	// private enum OFField{TCP_SRC,TCP_DST,VLAN_ID,IP_SRC,IP_DST};
    private Flow flow = new Flow();
    

	public void setMatch(OFMatch match) {
		this.flow.setMatch(match);
	}
    public OFMatch getMatch(){
    	return this.flow.getMatch();
    }
    public long getFieldMask(String field){
    	if(field.equals("IP_SRC")){
    		return this.getMatch().getIpSrcMask();
    	}
    	else if(field.equals("IP_DST")){
    		return this.getMatch().getIpDstMask();
    	}
    	return -1;
    }
    public long getFieldValue(String field){
    	if(field.equals("TCP_SRC")){
    		return this.getMatch().getTcpSrcPort();
    	}
    	else if(field.equals("TCP_DST")){
    		return this.getMatch().getTcpDstPort();
    	}
    	else if(field.equals("VLAN_ID")){
    		return this.getMatch().getVlanId();
    	}
    	else if(field.equals("IP_SRC")){
    		return this.getMatch().getIpSrc();
    	}
    	else if(field.equals("IP_DST")){
    		return this.getMatch().getIpDst();
    	}
    	else if(field.equals("ARP_OP")){
    		return this.getMatch().getArpOp();
    	}
    	else if(field.equals("ARP_IP_SRC")){
    		return this.getMatch().getArpIpSrc();
    	}
    	else if(field.equals("ARP_IP_DST")){
    		return this.getMatch().getArpIpDst();
    	}
    	else if(field.equals("ARP_MAC_SRC")){
    		return this.getMatch().getArpEthSrc();
    	}
    	else if(field.equals("ARP_MAC_DST")){
    		return this.getMatch().getArpEthDst();
    	}
    	else if(field.equals("ICMP_TYPE")){
    		return this.getMatch().getIcmpType();
    	}
    	else if(field.equals("ICMP_CODE")){
    		return this.getMatch().getIcmpCode();
    	}
    	else if(field.equals("SCTP_SRC")){
    		return this.getMatch().getSctpSrcPort();
    	}
    	else if(field.equals("SCTP_DST")){
    		return this.getMatch().getSctpDstPort();
    	}
    	else if(field.equals("UDP_SRC")){
    		return this.getMatch().getUdpSrcPort();
    	}
    	else if(field.equals("UDP_DST")){
    		return this.getMatch().getUdpDstPort();
    	}
    	else if(field.equals("IP_PROTO")){
    		return this.getMatch().getIpProto();
    	}
    	else if(field.equals("PHY_PORT")){
    		return this.getMatch().getPhyPort();
    	}
    	else if(field.equals("ETH_TYPE")){
    		return this.getMatch().getEthType();
    	}
    	else if(field.equals("IN_PORT")){
    		return this.getMatch().getInputPort();
    	}
    	else if(field.equals("ETH_SRC")){
    		return this.getMatch().getEthSrc();
    	}
    	else if(field.equals("ETH_DST")){
    		return this.getMatch().getEthDst();
    	}
    	return -1;
    }
    private long hex2longSingle(char c){
    	switch(c){
    	case '0':
    		return 0;
    	case '1':
    		return 1;
    	case '2':
    		return 2;
    	case '3':
    		return 3;
    	case '4':
    		return 4;
    	case '5':
    		return 5;
    	case '6':
    		return 6;
    	case '7':
    		return 7;
    	case '8':
    		return 8;
    	case '9':
    		return 9;
    	case 'a':
    		return 10;
    	case 'A':
    		return 10;
    	case 'b':
    		return 11;
    	case 'B':
    		return 11;
    	case 'c':
    		return 12;
    	case 'C':
    		return 12;
    	case 'd':
    		return 13;
    	case 'D':
    		return 13;
    	case 'e':
    		return 14;
    	case 'E':
    		return 14;
    	case 'f':
    		return 15;
    	case 'F':
    		return 15;
    	}
    	return 0;
    }
    private long hex2long(String hex){
    	long ret = 0;
    	for(int i = 0; i < hex.length(); ++i){
    		ret <<= 4;
    		ret += hex2longSingle(hex.charAt(i));
    	}
    	return ret;
    }
    public long mac2long(String mac){
    	long ret = 0;
    	String [] macs = mac.split(":");
    	for(int i = 0; i < macs.length; ++i){
    		ret <<= 8;
    		ret += hex2long(macs[i]);
    	}
    	return ret;
    }
    public String getMACField(String field){
    	// TODO:ARP_MAC_SRC, ARP_MAC_DST, ETH_SRC, ETH_DST
    	if(field == null)
    		return "";
    	
    	if(field.equals("")){
    		;
    	}
    	return "";
    }
    public int getIntField(String field){
    	// TODO:ICMP_TYPE, ICMP_CODE, SCTP_SRC, SCTP_DST, UDP_SRC, UDP_DST, IN_PORT, PHY_PORT, ETH_TYPE, IP_PROTO
    	return -1;
    }
	
	// 2. actions
	public class OFAction
	{
		private OFActionType type;
		private long value;
		public OFAction(OFActionType action) {
			this.type = action;
		}
		public OFAction(OFActionType action, long value) {
			this.type = action;
			this.setValue(value);
		}
		//public List<OFField> fields;
		public OFActionType getType()
		{
			return type;
		}
		/**
		 * @return the value
		 */
		public long getValue() {
			return value;
		}
		/**
		 * @param value the value to set
		 */
		public void setValue(long value) {
			this.value = value;
		}
	}

    public List<OFAction> actions = new ArrayList<OFAction>();

    public void addAction(OFActionType action){
    	this.actions.add(new OFAction(action));
    }
    
    public void addAction(OFActionType action, long value){
    	this.actions.add(new OFAction(action, value));
    }
    
    public int getActionSize(){
    	return actions.size();
    }
	
	// 3. Notification Level
	private enum OFNotificationLevel{DEFAULT,EVENT_INTERCEPTION, MODIFY_EVENT_ORDER};
    private OFNotificationLevel notification;
    
    public boolean checkNotification(String s){
    	OFNotificationLevel outer = OFNotificationLevel.DEFAULT;
    	if(s.equals("EVENT_INTERCEPTION")){
    		outer = OFNotificationLevel.EVENT_INTERCEPTION;
    	}
    	else if(s.equals("MODIFY_EVENT_ORDER")){
    		outer = OFNotificationLevel.MODIFY_EVENT_ORDER;
    	}
    	return outer == this.notification;
    }

	/**
	 * Set the notification level to Intercept events.
	 */
    public void eventInterception(){
    	this.notification = OFNotificationLevel.EVENT_INTERCEPTION;
    }

	/**
	 * Set the notification level to modify events' order.
	 */
    public void modifyEventOrder(){
    	this.notification = OFNotificationLevel.MODIFY_EVENT_ORDER;
    }
	
    // 4. statistics level
	/*
	 * There are 8 types of statistics in OpenFlow spec 1.3.0.
	 * The value is specified in page 52, or see as follows:
	 * 
	 * 
	 * FLOW_LEVEL <= flow stats, table stats
	 * PORT_LEVEL <= port stats, port blocked
	 * SWITCH_LEVEL <= other
	 */
	
	private enum OFStatisticsLevel{FLOW_LEVEL, PORT_LEVEL, SWITCH_LEVEL};
	
    public OFStatisticsLevel statistics = null;
	
    /**
	 * @author Jason Yang
	 * Set the statistics level to flow.
	 */
    public void setStatisticsLevelFlow()
    {
    	// set the value of statistics as FLOW_LEVEL.
    	statistics = OFStatisticsLevel.FLOW_LEVEL;
    }
    
    /**
	 * @author Jason Yang
	 * Set the statistics level to Port.
	 */
    public void setStatisticsLevelPort()
    {
    	statistics = OFStatisticsLevel.PORT_LEVEL;
    }
    
    /**
	 * @author Jason Yang
	 * Set the statistics level to switch.
	 */
    public void setStatisticsLevelSwitch()
    {
    	statistics = OFStatisticsLevel.SWITCH_LEVEL;
    }
    
    public boolean isFlowLevel()
    {
    	if( statistics == null || statistics != OFStatisticsLevel.FLOW_LEVEL)
    		return false;
    	return true;
    }
    public boolean isPortLevel()
    {
    	if( statistics == null || statistics != OFStatisticsLevel.PORT_LEVEL)
    		return false;
    	return true;
    }
    public boolean isSwitchLevel()
    {
    	if( statistics == null || statistics != OFStatisticsLevel.SWITCH_LEVEL)
    		return false;
    	return true;
    }
    public boolean isStatisticsTrue(OFStatisticsLevel val)
    {
    	return val == statistics;
    }
    
    public boolean checkStatistics(String stats){
    	if(stats.equals("FLOW_LEVEL")){
    		return isStatisticsTrue(OFStatisticsLevel.FLOW_LEVEL);
    	}
    	else if(stats.equals("PORT_LEVEL")){
    		return isStatisticsTrue(OFStatisticsLevel.PORT_LEVEL);
    	}
    	else if(stats.equals("SWITCH_LEVEL")){
    		return isStatisticsTrue(OFStatisticsLevel.SWITCH_LEVEL);
    	}
    	else{
    		return isStatisticsTrue(null);
    	}
    }
	
    // 5. virtual table
    private FlowTables virtTable;
    /**
	 * @return the virtTable
	 */
	public FlowTables getVirtTable() {
		return virtTable;
	}
	/**
	 * @param virtTable the virtTable to set
	 */
	public void setVirtTable(FlowTables virtTable) {
		this.virtTable = virtTable;
	}
	public Handler createHandler(){
    	return new Handler(virtTable,switchID,this.app,this.type,this.flow);
    }
    public Handler createHandler(Flow dstFlow){
    	return new Handler(virtTable,switchID,this.app,this.type,this.flow,dstFlow);
    }
    public class Handler{
    	
    	//default construct
    	public Handler(FlowTables virtTable, Long switchID, String owner, OFType type, Flow src){
    		this.virtTable = virtTable;
    		this.switchID = switchID;
    		this.owner = owner;
    		this.type = type;
    		this.srcFlow = src;
    		this.dstFlow = null;
    	}

    	public Handler(FlowTables virtTable, Long switchID, String owner, OFType type, Flow src, Flow dst){
    		this.virtTable = virtTable;
    		this.switchID = switchID;
    		this.owner = owner;
    		this.type = type;
    		this.srcFlow = src;
    		this.dstFlow = dst;
    	}
    	
    	// stored data
    	public OFType type;
    	public Flow srcFlow;
    	public Flow dstFlow;

    	public class Storage{
    		public OFType type;
    		public Flow flow;
    		public String owner;
    		public Storage(OFType type, Flow flow, String owner){
    			this.type = type;
    			this.flow = flow;
    			this.owner = owner;
    		}
    	}
    	
    	// ref data
    	FlowTables virtTable;
    	Long switchID;
    	String owner;
    	
    	public List<Storage> restore = new ArrayList<Storage>();
    	
    	public void updateWithRestore(){
    		if(type == OFType.FLOW_ADD){
    			if(!virtTable.get(switchID).exists(srcFlow)){
    				virtTable.get(switchID).insert(srcFlow, owner);
    				restore.add(new Storage(OFType.FLOW_DEL, srcFlow, owner));
    			}
    		}
    		else if(type == OFType.FLOW_DEL){
    			if(virtTable.get(switchID).exists(srcFlow)){
    				virtTable.get(switchID).remove(srcFlow);
    				restore.add(new Storage(OFType.FLOW_ADD, srcFlow, owner));
    			}
    		}
    		else if(type == OFType.FLOW_MOD){
    			if(!virtTable.get(switchID).exists(srcFlow)){
    				try{
    					virtTable.get(switchID).modify(srcFlow, dstFlow);
        				restore.add(new Storage(OFType.FLOW_DEL, dstFlow, owner));
        				restore.add(new Storage(OFType.FLOW_ADD, srcFlow, virtTable.get(switchID).getOwner(srcFlow)));
    				}
    				catch(Exception e){
    					;
    				}
    				
    			}
    		}
    	}

    	private void updateWithoutRestore(Storage sto){
    		if(sto.type == OFType.FLOW_ADD){
    			if(!virtTable.get(switchID).exists(sto.flow)){
    				virtTable.get(switchID).insert(sto.flow, sto.owner);
    			}
    		}
    		else if(sto.type == OFType.FLOW_DEL){
    			if(virtTable.get(switchID).exists(sto.flow)){
    				virtTable.get(switchID).remove(sto.flow);
    			}
    		}
    	}
    	
    	public void rollback(){
    		for(Storage sto : restore){
    			this.updateWithoutRestore(sto);
    		}
    	}
    }
    
    // 6. ownership permission
	public String ownership = new String("");
	
    public void ownFlows(){
    	this.ownership = "OWN_FLOWS";
    }
    public void othersFlows(){
    	this.ownership = "OTHERS_FLOWS";
    }
    public void allFlows(){
    	this.ownership = "ALL_FLOWS";
    }
    
    public boolean checkOwnRule(){
    	// a. check if this request access flows.
    	// it should be only del/modify.
    	if(this.flow == null){
    		// TODO: remove the scenario of add.
    		return true;
    	}
    	// b. check the owner.
    	if(virtTable.get(switchID).getOwner(this.flow).equals(app)){
    		return true;
    	}
    	return false;
    }

    public boolean checkOtherRule(){
    	// a. check if this request access flows.
    	if(this.flow == null){
        	// TODO: remove the scenario of add.
    		return true;
    	}
    	// b. check the owner.
    	if(!virtTable.get(switchID).getOwner(this.flow).equals(app)){
    		return true;
    	}
    	return false;
    }
    
    public boolean checkAllRule(){
    	return true;
    }
    
    // 7. size permission
    public boolean checkRuleCount(int maxRule){
    	if(maxRule <= virtTable.get(switchID).size()){
    		return false;
    	}
    	return true;
    }
    
    public boolean checkRulePercentage(float maxRulePer){
    	if(maxRulePer < virtTable.get(switchID).fullness()){
    		return false;
    	}
    	return true;
    }
    
	// 8.Priority
	private long priority;

	/**
	 * @return the priority
	 */
	public long getPriority() {
		if(this.getMatch() != null)
			return priority;
		return -1;
	}
	/**
	 * @param priority the priority to set
	 */
	public void setPriority(long priority) {
		this.priority = priority;
	}
	
	// 9.pkt_out
    public boolean isPktOut(){
    	if(this.getType().equals(OFType.PACKET_OUT)){
    		return true;
    	}
    	return false;
    }
	public void setActions(List<OFAction> actions) {
		this.actions = actions;
	}
    
	// 10. other
	private ITopologyManager topo = null;
	
    /**
	 * @return the topo
	 */
	public ITopologyManager getTopo() {
		return topo;
	}
	/**
	 * @param topo the topo to set
	 */
	public void setTopo(ITopologyManager topo) {
		this.topo = topo;
	}

	public int network = 0;
    public int filesystem = 0;
    public int processruntime = 0;
    
};
