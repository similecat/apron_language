package apron.permissionlanguage;


import java.util.HashSet;
import java.util.Set;

import apron.acl.ACLRequest;
import apron.acl.ITopologyManager;
import apron.syntaxtree.Operation;
import apron.syntaxtree.SyntaxTree;

public class Evaluator{
	public SyntaxTree syn = null;
    //public ACLRequest permReq = new ACLRequest();
    public ITopologyManager topo;
    

    public Evaluator(){
    	//this.syn = st;
    }
    public Evaluator(SyntaxTree st){
    	this.syn = st;
    }
    
    public boolean execute(ACLRequest permReq){
    	return this.execute(permReq, this.syn);
    }
    public boolean execute(ACLRequest permReq, ACLRequest permissionRequest){
    	;
    	return this.execute(permReq);
    }
	public int stringToIp(String ipAddr){
    	int ret = 0;
    	String[] ipArr = ipAddr.split("\\.");
        ret |= (Integer.parseInt(ipArr[0]) & 0xFF)<<24;
        ret |= (Integer.parseInt(ipArr[1]) & 0xFF)<<16;
        ret |= (Integer.parseInt(ipArr[2]) & 0xFF)<<8;
        ret |= (Integer.parseInt(ipArr[3]) & 0xFF)<<0;
        return ret;
    }
	public void setTopologyManager(ITopologyManager topo)
	{
		this.topo = topo;
	}
    public boolean execute(ACLRequest permReq, SyntaxTree st){
    	
    	if(st == null)
    		return true;
    	
    	switch(st.Type){
    	case program:
    		return this.execute(permReq, st.child(0));
    	case perm_list:
    		for(int i = 0; i < st.childs(); ++i){
    			if(this.execute(permReq, st.child(i)) == false){
    				return false;
    			}
    		}
    		return true;
    	case perm:
    		if(st.childs() == 1){
				return true;
			}
    		if(this.execute(permReq, st.child(0))){
    			return this.execute(permReq, st.child(1));
    		}
    		else{
    			return true;
    		}
    	case perm_name:
    		//if(st._string.equals(permReq.app)){
    		//	return true;
    		//}
    		return true;
    	case filter_expr:
    		//operation and
    		for(int i = 0; i < st.childs(); ++i){
    			if(this.execute(permReq, st.child(i)) == false){
    				return false;
    			}
    		}
    		return true;

    	case filter_term:
    		//operation or
    		for(int i = 0; i < st.childs(); ++i){
    			if(this.execute(permReq, st.child(i))){
    				return true;
    			}
    		}
    		return false;
    	case filter_factor:
    		if(st.op.equals(Operation.NOT)&&
    				this.execute(permReq, st.child(0))){
    			return false;
    		}
    		return true;
    	case filter_not_factor:
    		return this.execute(permReq, st.child(0));
    	case flow_predicate:
    		//TODO
    		String field = st.child(0)._string;
    		int ip,mask,ipReq,maskReq;
    		switch(st._int){
    		case 1:
        		ip = stringToIp(st.child(1)._string);
        		mask = -1;
    	    	ipReq = permReq.getFieldIP(field);
    	    	maskReq = permReq.getFieldMask(field);
        		return (ip&mask) == (ipReq&maskReq);
    		case 2:
        		ip = stringToIp(st.child(1)._string);
        		mask = stringToIp(st.child(2)._string);
    	    	ipReq = permReq.getFieldIP(field);
    	    	maskReq = permReq.getFieldMask(field);
        		return (ip&mask) == (ipReq&maskReq);
    		case 3:
        		mask = stringToIp(st.child(1)._string);
    	    	maskReq = permReq.getFieldMask(field);
        		return (mask) == (maskReq);
        	default:
        		return true;
    		}
    	case physical_topo:
    		Set <Long> switchSet = new HashSet<Long>();
    		if("ALL_SWITCHES".equals(st.child(0)._string)){
    			switchSet = topo.getAllSwitch();
    		}
    		else if("BORDER_SWITCHES".equals(st.child(0)._string)){
    			switchSet = topo.getBorderSwitch();
    		}
    		/*
    		if("ALL_SWITCHES".equals(st.child(0)._string)){
    			sws = topo.getSwitchPorts().keySet();
    		}
    		else if("BORDER_SWITCHES".equals(st.child(0)._string)){
    			Map<Long, Set<Short>> switchPorts = topo.getSwitchPorts();
    			Set<NodePortTuple> switchTuple = new HashSet<NodePortTuple>();
    			for(Iterator<Long> it = switchPorts.keySet().iterator(); it.hasNext();){
    				Long sw = (Long) it.next();
    				for(Iterator<Short> its = switchPorts.get(sw).iterator(); its.hasNext();){
    					switchTuple.add(new NodePortTuple(sw,(Short)its.next()));
    				}
    			}
    			for(Iterator<NodePortTuple> it = topo.getSwitchPortLinks().keySet().iterator(); it.hasNext();){
    				switchTuple.remove(it.next());
    			}
    			for(Iterator<NodePortTuple> it = switchTuple.iterator(); it.hasNext();){
    				sws.add(it.next().getNodeId());
    			}
    		}*/
    		else if("".equals(st.child(0)._string)){
    			SyntaxTree ch = st.child(0).child(0);
    			switch(ch.Type){
    			case sw_idx:
    				switchSet.add(ch._long);
    				break;
    			case sw_idx_list:
    				for(int i = 0; i < ch.childs(); ++i){
    					switchSet.add(ch.child(i)._long);
    				}
    				break;
				default:
					break;
    			}
    		}
    		long swID = permReq.switchID;
    		short port = permReq.getMatch().getInputPort();
    		if(!switchSet.contains(swID)){
    			return false;
    		}
    		if(!topo.getSwitchPorts(swID).contains(port)){
    			return false;
    		}

    		if("ALL_DIRECT_LINKS".equals(st.child(1)._string)){
    			return true;
    		}
    		else if("ALL_PATHS_AS_LINKS".equals(st.child(1)._string)){
    			return true;
    		}
    		else if("".equals(st.child(0)._string)){
    			;
    		}   		
    		return true;
    	case virtual_topo:
    		return true;
    	case action:
    		if(st.childs()>0){
    			return this.execute(permReq, st.child(0));
    		}
    		String actionSingle = "";
    		for(int i = 0; i < permReq.getActionSize(); ++i){
        		switch(permReq.actions.get(i).getType()){
        		case MODIFY:
        			actionSingle = "MODIFY";
        		case FORWARD:
        			actionSingle = "FORWARD";
				default:
					if(!actionSingle.equals(st._string)){
						return false;						
					}
        		}
    		}
    		return true;
    	case field_list:
    		String actionModify = "";
    		for(int i = 0; i < permReq.getActionSize(); ++i){
    			switch(permReq.actions.get(i).getType()){
    			case SET_TP_SRC:
    				actionModify = "TCP_SRC";
    			case SET_TP_DST:
    				actionModify = "TCP_DST";
    			case SET_NW_SRC:
    				actionModify = "IP_SRC";
    			case SET_NW_DST:
    				actionModify = "IP_DST";
				default:
					Boolean isInAction = false;
					for(int j = 0; j < st.childs(); ++j){
						if(st.child(j)._string.equals(actionModify)){
							isInAction = true;
							break;
						}
					}
					if(isInAction)
						continue;
					return false;
    			}
    		}
    		return true;
    	case ownership:
    		return permReq.ownership.equals(st._string);
    	case max_priority:
    		return permReq.getPriority() <= st._int;
    	case min_priority:
    		return permReq.getPriority() >= st._int;
    	case RULE_COUNT_PER_SWITCH:
    		//TODO
    		break;
    	case SIZE_PERCENTAGE_PER_SWITCH:
    		//TODO
    		break;
    	case notification:
    		return permReq.checkNotification(st._string);
    	case statistics:
    		return permReq.cmpStatistics(st._string);
    	case pktout:
    		return !(permReq.isPktOut() && st._int == 0);
    	case network:
    		return permReq.network<=st._int;
    	case filesystem:
    		return permReq.filesystem<=st._int;
    	case processruntime:
    		return permReq.processruntime<=st._int;
		default:
			return true;
    	}
		return true;
    }
}
