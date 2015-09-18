package apron.acl;

import java.util.ArrayList;
import java.util.List;

import apron.acl.OFMatch;

public class ACLRequest{
	
	//Field
	//private enum OFField{TCP_SRC,TCP_DST,VLAN_ID,IP_SRC,IP_DST};
	
	// OFAction
	public enum OFActionType{FORWARD,MODIFY,SET_TP_SRC,SET_TP_DST,SET_NW_SRC,SET_NW_DST};
	public class OFAction
	{
		private OFActionType type;
		//public List<OFField> fields;
		public OFActionType getType()
		{
			return type;
		}
	}
	
	// LEVEL
	private enum OFNotificationLevel{DEFAULT,EVENT_INTERCEPTION, MODIFY_EVENT_ORDER};
	private enum OFStatisticsLevel{FLOW_LEVEL,PORT_LEVEL,SWITCH_LEVEL};
	
	// OF
	public enum OFType{FLOW_MOD, PACKET_OUT};
	
	// switch id;
	public Long switchID;
	
	// type of the detail message: packet_out, flow_mod
	OFType type;
	
	// details of the flow match: ip, port, mask, vlan.
	OFMatch match;
	
	// priority
	int priority;
	
	// action list if it's flow_mod.
    public List<OFAction> actions = new ArrayList<OFAction>();

	// app name
    public String app = new String("");
    
    public String ownership = new String("");
    
    public Integer rules_per_switch = new Integer(0);
    public Float size_per_switch = new Float(0.0);
    
    // notification level
    public OFNotificationLevel notification;
    
    // statistics level
    public OFStatisticsLevel statistics = null;
    
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
    //TODO:Topo
    
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
    
    //TODO:Flowtable
    
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
    //Statistics
    public Boolean cmpStatistics(String perm){
    	return this.levelStatistics(getStatistics()) >= 
    			this.levelStatistics(perm);
    }
    public int levelStatistics(String s){
    	if(s.equals("FLOW_LEVEL")){
    		return 1;
    	}
    	else if(s.equals("PORT_LEVEL")){
    		return 2;
    	}
    	else if(s.equals("SWITCH_LEVEL")){
    		return 3;
    	}
    	else
    		return 0;
    }
    public String getStatistics(){
    	switch(this.statistics){
    	case SWITCH_LEVEL:
    		return "SWITCH_LEVEL";
    	case FLOW_LEVEL:
    		return "FLOW_LEVEL";
    	case PORT_LEVEL:
    		return "PORT_LEVEL";
    	default:
    		return "";
    	}
    }
    //pkt_out
    public boolean isPktOut(){
    	if(this.match != null && this.getType().equals(OFType.PACKET_OUT)){
    		return true;
    	}
    	return false;
    }
	public void setMatch(OFMatch mt) {
		// TODO Auto-generated method stub
		this.match = mt;
	}
	public void setActions(List<OFAction> actions) {
		// TODO Auto-generated method stub
		this.actions = actions;
	}
};
