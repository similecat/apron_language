package apron.permissionlanguage;


import java.util.HashSet;
import java.util.Set;

import apron.acl.ACLRequest;
import apron.syntaxtree.Operation;
import apron.syntaxtree.SyntaxTree;

public class Evaluator{
	public SyntaxTree syn = null;
    //public ACLRequest permReq = new ACLRequest();
    

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
	public static int stringToIp(String ipAddr){
    	int ret = 0;
    	String[] ipArr = ipAddr.split("\\.");
        ret |= (Integer.parseInt(ipArr[0]) & 0xFF)<<24;
        ret |= (Integer.parseInt(ipArr[1]) & 0xFF)<<16;
        ret |= (Integer.parseInt(ipArr[2]) & 0xFF)<<8;
        ret |= (Integer.parseInt(ipArr[3]) & 0xFF)<<0;
        return ret;
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
    		if(st._string.equals(permReq.getApp())){
    			return true;
    		}
    		return false;
    		
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
    		String field = st.child(0)._string;
    		long mac,macReq;
    		long Int,IntReq;
    		long value,mask,valueReq,maskReq;
    		switch(st._int){
    		case 1:
    			if(st.child(1)._string != null && st.child(1)._string.length() > 0){
            		value = stringToIp(st.child(1)._string);
    			}
    			else{
    				value = st.child(1)._int;
    			}
        		mask = -1;
    	    	valueReq = permReq.getFieldValue(field);
    	    	if(valueReq == -1)
    	    		return true;
    	    	maskReq = permReq.getFieldMask(field);
    	    	if(maskReq == -1){
    	    		return value == valueReq;
    	    	}
        		return (value&mask) == (valueReq&maskReq);
    		case 2:
        		value = stringToIp(st.child(1)._string);
        		mask = stringToIp(st.child(2)._string);
    	    	valueReq = permReq.getFieldValue(field);
    	    	if(valueReq == -1)
    	    		return true;
    	    	maskReq = permReq.getFieldMask(field);
    	    	if(maskReq == -1)
    	    		return true;
        		return (value&mask) == (valueReq&maskReq);
    		case 3:
        		mask = stringToIp(st.child(1)._string);
    	    	maskReq = permReq.getFieldMask(field);
    	    	if(maskReq == -1)
    	    		return true;
        		return (mask) == (maskReq);
    		case 4:
    			mac = permReq.mac2long(st.child(1)._string);
    			macReq = permReq.getFieldValue(field);
    			if(macReq == -1)
    				return true;
        		return (mac) == macReq;
    		case 5:
    			Int = (st.child(1)._int);
    			IntReq = permReq.getFieldValue(field);
    			if(IntReq == -1)
    				return true;
        		return (Int) == (IntReq);
        	default:
        		return true;
    		}
    	case physical_topo:
    		if(permReq.getTopo() == null)
    			return true;
    		Set <Long> switchSet = new HashSet<Long>();
    		if("ALL_SWITCHES".equals(st.child(0)._string)){
    			switchSet = permReq.getTopo().getAllSwitch();
    		}
    		else if("BORDER_SWITCHES".equals(st.child(0)._string)){
    			switchSet = permReq.getTopo().getBorderSwitch();
    		}
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
    		long swID = permReq.getSwitchID();
    		long port = permReq.getMatch().getInputPort();
    		if(!switchSet.contains(swID)){
    			return false;
    		}
    		if(!permReq.getTopo().getSwitchPorts(swID).contains(port)){
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
    		// TODO: for future use.
    		return true;
    		
    	case action:
    		// TODO: modify as an action set operation.
    		if(st.childs() > 1){
    			return this.execute(permReq, st.child(0));
    		}
    		String actionSingle = "";
    		for(int i = 0; i < permReq.getActionSize(); ++i){
        		actionSingle = permReq.actions.get(i).getType().toString();
        		if(!actionSingle.equals(st._string)){
					return false;						
				}
    		}
    		return true;
    		
    	case field_list:
    		
    		String actionModify = "";
    		for(int i = 0; i < permReq.getActionSize(); ++i){
    			actionModify = permReq.actions.get(i).getType().toString();
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
    		return true;
    		
    	case ownership:
    		if(st._string.equals("OTHERS_FLOWS")){
    			return permReq.checkOtherRule();
    		}
    		else if(st._string.equals("OWN_FLOWS")){
    			return permReq.checkOwnRule();
    		}
    		else{
    			return permReq.checkAllRule();
    		}
    	
    	case max_priority:
    		return permReq.getPriority() <= st._int;
    	case min_priority:
    		return permReq.getPriority() >= st._int;
    	
    	case RULE_COUNT_PER_SWITCH:
    		return permReq.checkRuleCount(st._int);
    		
    	case SIZE_PERCENTAGE_PER_SWITCH:
    		return permReq.checkRulePercentage(st._float);

    	case notification:
    		return permReq.checkNotification(st._string);
    		
    	case statistics:
    		return permReq.checkStatistics(st._string);
    		
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
    }
}
