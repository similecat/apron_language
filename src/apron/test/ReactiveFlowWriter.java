/*
 * Copyright (c) 2014 Cisco Systems, Inc. and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package apron.test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.opendaylight.l2switch.inventory.InventoryReader;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev100924.MacAddress;
import org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeConnectorRef;
import org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.nodes.Node;
import org.opendaylight.yang.gen.v1.urn.opendaylight.packet.arp.rev140528.ArpPacketListener;
import org.opendaylight.yang.gen.v1.urn.opendaylight.packet.arp.rev140528.ArpPacketReceived;
import org.opendaylight.yang.gen.v1.urn.opendaylight.packet.arp.rev140528.arp.packet.received.packet.chain.packet.ArpPacket;
import org.opendaylight.yang.gen.v1.urn.opendaylight.packet.basepacket.rev140528.packet.chain.grp.PacketChain;
import org.opendaylight.yang.gen.v1.urn.opendaylight.packet.basepacket.rev140528.packet.chain.grp.packet.chain.packet.RawPacket;
import org.opendaylight.yang.gen.v1.urn.opendaylight.packet.ethernet.rev140528.ethernet.packet.received.packet.chain.packet.EthernetPacket;

import apron.permissionlanguage.ApronLexer;
import apron.permissionlanguage.ApronParser;
import apron.permissionlanguage.Evaluator;
import apron.permissionlanguage.SyntaxGenerator;

/**
 * This class listens to certain type of packets and writes
 * a mac to mac flows.
 */
public class ReactiveFlowWriter implements ArpPacketListener {
  private InventoryReader inventoryReader;
  private FlowWriterService flowWriterService;

  public ReactiveFlowWriter(InventoryReader inventoryReader, FlowWriterService flowWriterService) {
    this.inventoryReader = inventoryReader;
    this.flowWriterService = flowWriterService;
  }

  /**
   * Checks if a MAC should be considered for flow creation
   *
   * @param macToCheck MacAddress to consider
   * @return true if a MacAddess is broadcast or multicast, false if
   * the MacAddress is unicast (and thus legible for flow creation).
   */

  private boolean ignoreThisMac(MacAddress macToCheck) {
    if (macToCheck == null) return true;
    String [] octets = macToCheck.getValue().split(":");
    short first_byte = Short.parseShort(octets[0]);

    /* First bit in first byte for unicast and multicast is 1
     * Unicast and multicast are handled by flooding, they are
     * not legible for flow creation
     */

    return ((first_byte & 1) == 1);
  }

  @Override
  public void onArpPacketReceived(ArpPacketReceived packetReceived) {
    if(packetReceived == null || packetReceived.getPacketChain() == null) {
      return;
    }

    RawPacket rawPacket = null;
    EthernetPacket ethernetPacket = null;
    ArpPacket arpPacket = null;
    for(PacketChain packetChain : packetReceived.getPacketChain()) {
      if(packetChain.getPacket() instanceof RawPacket) {
        rawPacket = (RawPacket) packetChain.getPacket();
      } else if(packetChain.getPacket() instanceof EthernetPacket) {
        ethernetPacket = (EthernetPacket) packetChain.getPacket();
      } else if(packetChain.getPacket() instanceof ArpPacket) {
        arpPacket = (ArpPacket) packetChain.getPacket();
      }
    }
    if(rawPacket == null || ethernetPacket == null || arpPacket == null) {
      return;
    }
    MacAddress destMac = ethernetPacket.getDestinationMac();
    if(!ignoreThisMac(destMac)) {
      writeFlows(rawPacket.getIngress(),
          ethernetPacket.getSourceMac(),
          ethernetPacket.getDestinationMac());
    }
  }

  /**
   * Invokes flow writer service to write  bidirectional mac-mac flows on a switch.
   *
   * @param ingress The NodeConnector where the payload came from.
   * @param srcMac  The source MacAddress of the packet.
   * @param destMac The destination MacAddress of the packet.
   */
  public void writeFlows(NodeConnectorRef ingress, MacAddress srcMac, MacAddress destMac) {
    NodeConnectorRef destNodeConnector = inventoryReader.getNodeConnector(ingress.getValue().firstIdentifierOf(Node.class), destMac);
    if(destNodeConnector != null) {
      /**
       * actaully addBidirectionalMacToMacFlows was implemented in https://github.com/opendaylight/l2switch/blob/master/l2switch-main/implementation/src/main/java/org/opendaylight/l2switch/flow/FlowWriterServiceImpl.java
       * it would add two flows (srcMac,destMac)=>destNodeConnector, (destMac,srcMac)=>ingress;
       * 
       * it would be better to add following checking permission code inside addBidirectionalMacToMacFlows;
       * try addMacToMacFlow;
       * 
       * following is sample code for ...:
       * 
       *    //this should be the language script, take this as sample, replace it later.
       * 	public String lan = new String("PERM flow LIMITING IP_SRC 165.124.184.0");
       * 
       *    //create a evaluator from language script.
       * 	InputStream is = new ByteArrayInputStream(lan.getBytes());
	   *	ANTLRInputStream input = new ANTLRInputStream(is);
	   *	ApronLexer lexer = new ApronLexer(input);
	   *	CommonTokenStream tokens = new CommonTokenStream(lexer);
	   *	ApronParser parser = new ApronParser(tokens);
	   *	ParseTree tree = parser.program(); // parse
	   *	SyntaxGenerator syn = new SyntaxGenerator();
	   *	evaluator =  new Evaluator(syn.visit(tree));
	   *
	   *	// transfer parameters to aclrequest.
	   *	// it is a flow_mod type, adding flows here.
	   *	
	   *	ACLRequest req = new ACLRequest();
	   *	req.type = OFType.FLOW_MOD;
	   *	req.switchID = ingress.?;
	   *	req.actions.add(new OFAction(OFActionType.FORWARD));
	   *	req.priority = ; // this is not specified here.
	   *
	   *	//
	   *	if(false == evaluator.execute(req)){
	   *		throws "";
	   *		//or return;
	   *	}
       * 
       */
      flowWriterService.addBidirectionalMacToMacFlows(srcMac, ingress, destMac, destNodeConnector);
    }
  }
}
