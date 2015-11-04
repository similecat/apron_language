package apron.data;

import java.util.HashMap;
import java.util.Map;

public class Table {
	Map<Flow, String> table = new HashMap<Flow, String>();
	private int capacity = 0;
	
	private synchronized Map<Flow, String> getTable(){
		return table;
	}
	
	public void insert(Flow flow, String owner){
		getTable().put(flow, owner);
	}
	public void remove(Flow flow){
		getTable().remove(flow);
	}
	public boolean exists(Flow flow){
		return getTable().containsKey(flow);
	}
	public void modify(Flow srcFlow, Flow dstFlow){
		String owner = (String) getTable().get(srcFlow);
		this.insert(dstFlow, owner);
		this.remove(srcFlow);
	}
	public String getOwner(Flow flow){
		if(!getTable().containsKey(flow)){
			return "";
		}
		return table.get(flow);
	}
	public synchronized void setCapacity(int capacity){
		this.capacity = capacity;
	}
	public synchronized int getCapacity(){
		return this.capacity;
	}
	public int size(){
		return getTable().size();
	}
	public float fullness(){
		return (float) (getTable().size()*1.0/this.capacity);
	}
}
