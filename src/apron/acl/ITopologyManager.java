package apron.acl;

import java.util.Set;

public interface ITopologyManager {
	
	// get all the switch ids.
	public Set<Long> getAllSwitch();
	
	// get all the border switch ids.
	public Set<Long> getBorderSwitch();
	
	// get all the ports the switch had.
	public Set<Long> getSwitchPorts(Long switchID);
}
