package apron.acl;

public class OFMatch {

		int ipSrc,ipSrcMask,ipSrcMaskLen;
		int ipDst,ipDstMask,ipDstMaskLen;
		int tcpSrcPort,tcpDstPort;
		int vlanId;
		short inputPort;

		int getTransportSource(){
			return tcpSrcPort;
		}
		int getTransportDestination(){
			return tcpDstPort;
		}
		int getDataLayerVirtualLan(){
			return vlanId;
		}
		int getNetworkSource(){
			return ipSrc;
		}
		int getNetworkSourceMaskLen(){
			return ipSrcMaskLen;
		}
		int getNetworkDestination(){
			return ipDst;
		}
		int getNetworkDestinationMaskLen(){
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
