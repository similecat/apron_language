package apron.data;

public class OFMatch {

	public int ipSrc,ipSrcMask,ipSrcMaskLen;
	public int ipDst,ipDstMask,ipDstMaskLen;
	public int tcpSrcPort,tcpDstPort;
	public int vlanId;
	public short inputPort;

		public int getTransportSource(){
			return tcpSrcPort;
		}
		public int getTransportDestination(){
			return tcpDstPort;
		}
		public int getDataLayerVirtualLan(){
			return vlanId;
		}
		public int getNetworkSource(){
			return ipSrc;
		}
		public int getNetworkSourceMaskLen(){
			return ipSrcMaskLen;
		}
		public int getNetworkDestination(){
			return ipDst;
		}
		public int getNetworkDestinationMaskLen(){
			return ipDstMaskLen;
		}
		public short getInputPort(){
			return inputPort;
		}
		public void setNetworkSource(int ip) {
			// TODO Auto-generated method stub
			ipSrc = ip;
		}
	
}
