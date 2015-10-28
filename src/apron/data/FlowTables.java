package apron.data;

import java.util.HashMap;
import java.util.Map;

public class FlowTables {

	Map<Long, Table> tables = new HashMap<Long, Table>(); // <switchID, table>
	private synchronized Map<Long, Table> getTables(){
		return tables;
	}
	public void insert(Long switchId, Table table){
		getTables().put(switchId, table);
	}	
	
	public void remove(Long switchId, Table table){
		getTables().remove(switchId);
	}
	
	public Table get(Long SwitchID){
		return getTables().get(SwitchID);
	}
	
}
