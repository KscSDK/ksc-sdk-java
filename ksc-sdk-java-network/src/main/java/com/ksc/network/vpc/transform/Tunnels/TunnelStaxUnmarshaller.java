package com.ksc.network.vpc.transform.Tunnels;

import com.ksc.network.vpc.model.Tunnels.Tunnel;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import javax.xml.stream.events.XMLEvent;

/**
 * Tunnel StAX Unmarshaller
 */
public class TunnelStaxUnmarshaller implements Unmarshaller<Tunnel, StaxUnmarshallerContext> {

	public Tunnel unmarshall(StaxUnmarshallerContext context) throws Exception {
		Tunnel tunnel = new Tunnel();
		int originalDepth = context.getCurrentDepth();
		int targetDepth = originalDepth + 1;

		if (context.isStartOfDocument())
			targetDepth += 1;
		
		while (true) {
			XMLEvent xmlEvent = context.nextEvent();
			if (xmlEvent.isEndDocument())
				return tunnel;
			if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

				if (context.testExpression("CreateTime", targetDepth)) {
					tunnel.setCreateTime(StringStaxUnmarshaller.getInstance().unmarshall(context));
					continue;
				}

				if (context.testExpression("VpcId", targetDepth)) {
					tunnel.setVpcId(StringStaxUnmarshaller.getInstance().unmarshall(context));
					continue;
				}

                if (context.testExpression("TunnelName", targetDepth)) {
					tunnel.setTunnelName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("TunnelId", targetDepth)) {
					tunnel.setTunnelId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("TunnelIp", targetDepth)) {
					tunnel.setTunnelIp(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("TunnelMode", targetDepth)) {
					tunnel.setTunnelMode(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("AssociateRemoteCidrSet/item", targetDepth)) {
					tunnel.addAssociateRemoteCidrSet(AssociateRemoteCidrStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

				if (context.testExpression("DeviceName", targetDepth)) {
					tunnel.setDeviceName(StringStaxUnmarshaller.getInstance().unmarshall(context));
					continue;
				}

				if (context.testExpression("GatewayMac", targetDepth)) {
					tunnel.setGatewayMac(StringStaxUnmarshaller.getInstance().unmarshall(context));
					continue;
				}

                if (context.testExpression("GatewayIp", targetDepth)) {
					tunnel.setGatewayIp(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("AssociateSubnetSet/item", targetDepth)) {
					tunnel.addAssociateSubnetSet(AssociateSubnetStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

			} else if (xmlEvent.isEndElement()) {
				if (context.getCurrentDepth() < originalDepth) {
					return tunnel;
				}
			}
		}
	}

	private static TunnelStaxUnmarshaller instance;

	public static TunnelStaxUnmarshaller getInstance() {
		if (instance == null)
			instance = new TunnelStaxUnmarshaller();
		return instance;
	}
}
