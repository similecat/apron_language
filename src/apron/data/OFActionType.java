package apron.data;

public enum OFActionType {
	// forwarding related
	Drop,FORWARD,MODIFY,SET_TP_SRC,SET_TP_DST,SET_NW_SRC,SET_NW_DST
	// TTL related
	,COPY_TTL_OUT, COPY_TTL_IN
	// MPLS related
	,SET_MPLS_TTL, DEC_MPLS_TTL, PUSH_MPLS, POP_MPLS
	// VLAN related
	,PUSH_VLAN,POP_VLAN
	// Others
	,SET_QUEUE,GROUP,SET_NW_TTL,DEC_NW_TTL,PUSH_PBB,POP_PBB,EXPERIMENTER
}
