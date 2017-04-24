package com.ksc.network.vpc.transform.Tunnels;

import javax.xml.stream.events.XMLEvent;

import com.ksc.network.vpc.model.Nat.NatIp;
import com.ksc.network.vpc.model.Tunnels.AssociateSubnet;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

/**
 * SecurityGroupRule StAX Unmarshaller
 */
public class AssociateSubnetStaxUnmarshaller implements Unmarshaller<AssociateSubnet, StaxUnmarshallerContext> {

	public AssociateSubnet unmarshall(StaxUnmarshallerContext context) throws Exception {
		AssociateSubnet tunnel = new AssociateSubnet();
		int originalDepth = context.getCurrentDepth();
		int targetDepth = originalDepth + 1;

		if (context.isStartOfDocument())
			targetDepth += 1;
		
		while (true) {
			XMLEvent xmlEvent = context.nextEvent();
			if (xmlEvent.isEndDocument())
				return tunnel;
			if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

				if (context.testExpression("SubnetId", targetDepth)) {
					tunnel.setSubnetId(StringStaxUnmarshaller.getInstance().unmarshall(context));
					continue;
				}

			} else if (xmlEvent.isEndElement()) {
				if (context.getCurrentDepth() < originalDepth) {
					return tunnel;
				}
			}
		}
	}

	private static AssociateSubnetStaxUnmarshaller instance;

	public static AssociateSubnetStaxUnmarshaller getInstance() {
		if (instance == null)
			instance = new AssociateSubnetStaxUnmarshaller();
		return instance;
	}
}
