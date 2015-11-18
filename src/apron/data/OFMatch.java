package apron.data;

public class OFMatch {

	// eth level
	private long ethType;
	private long ethSrc, ethDst;
	
	// arp
	private int arpOp; // 16 bits
	private long arpIpSrc, arpIpDst; // 32 bits
	private long arpEthSrc, arpEthDst; // 64 bits
	
	// icmp
	private short icmpType; // 8 bits
	private short icmpCode; // 8 bits
	
	// ip level
	private short ipProto; // 8 bits
	private long ipSrc, ipSrcMask; // 32 bits
	private long ipDst, ipDstMask; // 32 bits
	
	// transport level
	private int tcpSrcPort,tcpDstPort; // 16 bits
	private int udpSrcPort, udpDstPort; // 16 bits
	private int sctpSrcPort, sctpDstPort; // 16 bits
	
	// other
	private int vlanId;
	private long inputPort;
	private long phyPort;
	public static final int INF = -1;
	
	// initialization
	public OFMatch(){
		this.ethType = INF;
		this.ethSrc = INF;
		this.ethDst = INF;
		this.arpOp = INF;
		this.arpIpSrc = INF;
		this.arpIpDst = INF;
		this.arpEthSrc = INF;
		this.arpEthDst = INF;
		this.icmpType = INF;
		this.icmpCode = INF;
		this.ipProto = INF;
		this.ipSrc = INF;
		this.ipSrcMask = INF;
		this.ipDst = INF;
		this.ipDstMask = INF;
		this.tcpSrcPort = INF;
		this.tcpDstPort = INF;
		this.udpSrcPort = INF;
		this.udpDstPort = INF;
		this.sctpSrcPort = INF;
		this.sctpDstPort = INF;
		this.vlanId = INF;
		this.inputPort = INF;
		this.phyPort = INF;
	
	}

	public OFMatch(long ethType, long ethSrc, long ethDst, int arpOp, long arpIpSrc, long arpIpDst, long arpEthSrc,
			long arpEthDst, short icmpType, short icmpCode, short ipProto, long ipSrc, long ipSrcMask, long ipDst,
			long ipDstMask, int tcpSrcPort, int tcpDstPort, int udpSrcPort, int udpDstPort, int sctpSrcPort,
			int sctpDstPort, int vlanId, long inputPort, long phyPort) {
		this.ethType = ethType;
		this.ethSrc = ethSrc;
		this.ethDst = ethDst;
		this.arpOp = arpOp;
		this.arpIpSrc = arpIpSrc;
		this.arpIpDst = arpIpDst;
		this.arpEthSrc = arpEthSrc;
		this.arpEthDst = arpEthDst;
		this.icmpType = icmpType;
		this.icmpCode = icmpCode;
		this.ipProto = ipProto;
		this.ipSrc = ipSrc;
		this.ipSrcMask = ipSrcMask;
		this.ipDst = ipDst;
		this.ipDstMask = ipDstMask;
		this.tcpSrcPort = tcpSrcPort;
		this.tcpDstPort = tcpDstPort;
		this.udpSrcPort = udpSrcPort;
		this.udpDstPort = udpDstPort;
		this.sctpSrcPort = sctpSrcPort;
		this.sctpDstPort = sctpDstPort;
		this.vlanId = vlanId;
		this.inputPort = inputPort;
		this.phyPort = phyPort;
	}

	public long getEthType() {
		return ethType;
	}

	public void setEthType(long ethType) {
		this.ethType = ethType;
	}

	public long getEthSrc() {
		return ethSrc;
	}

	public void setEthSrc(long ethSrc) {
		this.ethSrc = ethSrc;
	}

	public long getEthDst() {
		return ethDst;
	}

	public void setEthDst(long ethDst) {
		this.ethDst = ethDst;
	}

	public int getArpOp() {
		return arpOp;
	}

	public void setArpOp(int arpOp) {
		this.arpOp = arpOp;
	}

	public long getArpIpSrc() {
		return arpIpSrc;
	}

	public void setArpIpSrc(long arpIpSrc) {
		this.arpIpSrc = arpIpSrc;
	}

	public long getArpIpDst() {
		return arpIpDst;
	}

	public void setArpIpDst(long arpIpDst) {
		this.arpIpDst = arpIpDst;
	}

	public long getArpEthSrc() {
		return arpEthSrc;
	}

	public void setArpEthSrc(long arpEthSrc) {
		this.arpEthSrc = arpEthSrc;
	}

	public long getArpEthDst() {
		return arpEthDst;
	}

	public void setArpEthDst(long arpEthDst) {
		this.arpEthDst = arpEthDst;
	}

	public short getIcmpType() {
		return icmpType;
	}

	public void setIcmpType(short icmpType) {
		this.icmpType = icmpType;
	}

	public short getIcmpCode() {
		return icmpCode;
	}

	public void setIcmpCode(short icmpCode) {
		this.icmpCode = icmpCode;
	}

	public short getIpProto() {
		return ipProto;
	}

	public void setIpProto(short ipProto) {
		this.ipProto = ipProto;
	}

	public long getIpSrc() {
		return ipSrc;
	}

	public void setIpSrc(long ipSrc) {
		this.ipSrc = ipSrc;
	}

	public long getIpSrcMask() {
		return ipSrcMask;
	}

	public void setIpSrcMask(long ipSrcMask) {
		this.ipSrcMask = ipSrcMask;
	}

	public long getIpDst() {
		return ipDst;
	}

	public void setIpDst(long ipDst) {
		this.ipDst = ipDst;
	}

	public long getIpDstMask() {
		return ipDstMask;
	}

	public void setIpDstMask(long ipDstMask) {
		this.ipDstMask = ipDstMask;
	}

	public int getTcpSrcPort() {
		return tcpSrcPort;
	}

	public void setTcpSrcPort(int tcpSrcPort) {
		this.tcpSrcPort = tcpSrcPort;
	}

	public int getTcpDstPort() {
		return tcpDstPort;
	}

	public void setTcpDstPort(int tcpDstPort) {
		this.tcpDstPort = tcpDstPort;
	}

	public int getUdpSrcPort() {
		return udpSrcPort;
	}

	public void setUdpSrcPort(int udpSrcPort) {
		this.udpSrcPort = udpSrcPort;
	}

	public int getUdpDstPort() {
		return udpDstPort;
	}

	public void setUdpDstPort(int udpDstPort) {
		this.udpDstPort = udpDstPort;
	}

	public int getSctpSrcPort() {
		return sctpSrcPort;
	}

	public void setSctpSrcPort(int sctpSrcPort) {
		this.sctpSrcPort = sctpSrcPort;
	}

	public int getSctpDstPort() {
		return sctpDstPort;
	}

	public void setSctpDstPort(int sctpDstPort) {
		this.sctpDstPort = sctpDstPort;
	}

	public int getVlanId() {
		return vlanId;
	}

	public void setVlanId(int vlanId) {
		this.vlanId = vlanId;
	}

	public long getInputPort() {
		return inputPort;
	}

	public void setInputPort(long inputPort) {
		this.inputPort = inputPort;
	}

	public long getPhyPort() {
		return phyPort;
	}

	public void setPhyPort(long phyPort) {
		this.phyPort = phyPort;
	}
	
}
