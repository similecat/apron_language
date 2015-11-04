package apron.acl;

import java.util.ArrayList;
import java.util.List;

import apron.data.Flow;
import apron.data.FlowTables;
import apron.data.OFMatch;

public class ACLRequest{

	// 0. App name
	// the identify of each API caller.
    public String app = new String("");
    
	// 1. flow predicate
	//private enum OFField{TCP_SRC,TCP_DST,VLAN_ID,IP_SRC,IP_DST};
    Flow flow = null;
    

    public int getFieldMask(String field){
    	if(field.equals("TCP_SRC")){
    		return this.getIpSrcMask();
    	}
    	else if(field.equals("TCP_DST")){
    		return this.getIpDstMask();
    	}
    	else if(field.equals("VLAN_ID")){
    		return this.getVlanId();
    	}
    	else if(field.equals("IP_SRC")){
    		return this.getIpSrcMask();
    	}
    	else if(field.equals("IP_DST")){
    		return this.getIpDstMask();
    	}
    	return -1;
    }
    public int getFieldIP(String field){
    	// TODO:ARP_OP, ARP_IP_SRC, ARP_IP_DST
    	if(field.equals("TCP_SRC")){
    		return this.getTcpSrc();
    	}
    	else if(field.equals("TCP_DST")){
    		return this.getTcpDst();
    	}
    	else if(field.equals("VLAN_ID")){
    		return this.getVlanId();
    	}
    	else if(field.equals("IP_SRC")){
    		return this.getIpSrc();
    	}
    	else if(field.equals("IP_DST")){
    		return this.getIpDst();
    	}
    	return -1;
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
    
    
    public int getTcpSrc(){
    	if(this.match == null){
    		return -1;
    	}
    	return this.getMatch().getTransportSource();
    }
    public int getTcpDst(){
    	if(this.match == null){
    		return -1;
    	}
    	return this.getMatch().getTransportDestination();
    }
    public int getVlanId(){
    	if(this.match == null){
    		return -1;
    	}
    	return this.getMatch().getDataLayerVirtualLan();
    }
    public int getIpSrc(){
    	if(this.match == null){
    		return -1;
    	}
    	return this.getMatch().getNetworkSource();
    }
    public int getIpSrcMask(){
    	if(this.match == null){
    		return -1;
    	}
    	return ~((1<<this.getMatch().getNetworkSourceMaskLen())-1);
    }
    public int getIpDst(){
    	if(this.match == null){
    		return -1;
    	}
    	return this.getMatch().getNetworkDestination();
    }
    public int getIpDstMask(){
    	if(this.match == null){
    		return -1;
    	}
    	return ~((1<<this.getMatch().getNetworkDestinationMaskLen())-1);
    }
	
	// 2. actions
	public enum OFActionType{
		//forwarding related
		Drop,FORWARD,MODIFY,SET_TP_SRC,SET_TP_DST,SET_NW_SRC,SET_NW_DST
		//TTL related
		,COPY_TTL_OUT, COPY_TTL_IN
		//MPLS related
		,SET_MPLS_TTL, DEC_MPLS_TTL, PUSH_MPLS, POP_MPLS
		//VLAN related
		,PUSH_VLAN,POP_VLAN
		// Others
		,SET_QUEUE,GROUP,SET_NW_TTL,DEC_NW_TTL,PUSH_PBB,POP_PBB,EXPERIMENTER
		};
	public class OFAction
	{
		private OFActionType type;
		//public List<OFField> fields;
		public OFActionType getType()
		{
			return type;
		}
	}

    public List<OFAction> actions = new ArrayList<OFAction>();
	
	// 3. Notification Level
	private enum OFNotificationLevel{DEFAULT,EVENT_INTERCEPTION, MODIFY_EVENT_ORDER};
    public OFNotificationLevel notification;
	
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
	
	private enum OFStatisticsLevel{FLOW_LEVEL,PORT_LEVEL,SWITCH_LEVEL};
	
    public OFStatisticsLevel statistics = null;
    public void setStatisticsLevelFlow()
    {
    	// set the value of statistics as FLOW_LEVEL.
    	statistics = OFStatisticsLevel.FLOW_LEVEL;
    }
    public void setStatisticsLevelPort()
    {
    	statistics = OFStatisticsLevel.PORT_LEVEL;
    }
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
    FlowTables virtTable;
    public class Handler{
    	
    	//default constructore
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
    
    // 6. flow table permission
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
    
    
	// OF
	public enum OFType{FLOW_MOD, FLOW_ADD, FLOW_DEL, PACKET_OUT};
	
	// switch id;
	public Long switchID;
	
	// type of the detail message: packet_out, flow_mod
	OFType type;
	
	// details of the flow match: ip, port, mask, vlan.
	OFMatch match;
	
	// priority
	int priority;
	
    public String ownership = new String("");
    
    public Integer rules_per_switch = new Integer(0);
    public Float size_per_switch = new Float(0.0);
    
    
    
    public int network = 0;
    public int filesystem = 0;
    public int processruntime = 0;

    public void APP(String s){
    	this.app = s;
    }
    public OFType getType(){
    	return type;
    }
    public OFMatch getMatch(){
    	return match;
    }
    //flow_predicate
    
    //Ownership
    public void ownFlows(){
    	this.ownership = "OWN_FLOWS";
    }
    public void othersFlows(){
    	this.ownership = "OTHERS_FLOWS";
    }
    public void allFlows(){
    	this.ownership = "ALL_FLOWS";
    }
    
    // Max priority
    public int getPriority(){
    	if(match != null){
    		return this.priority;
    	}
    	return -1;
    }
    
    //action
    public int getActionSize(){
    	return actions.size();
    }
    //Notification
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
    public void eventInterception(){
    	this.notification = OFNotificationLevel.EVENT_INTERCEPTION;
    }
    public void modifyEventOrder(){
    	this.notification = OFNotificationLevel.MODIFY_EVENT_ORDER;
    }
    //pkt_out
    public boolean isPktOut(){
    	if(this.match != null && this.getType().equals(OFType.PACKET_OUT)){
    		return true;
    	}
    	return false;
    }
	public void setMatch(OFMatch mt) {
		this.match = mt;
	}
	public void setActions(List<OFAction> actions) {
		this.actions = actions;
	}
};
