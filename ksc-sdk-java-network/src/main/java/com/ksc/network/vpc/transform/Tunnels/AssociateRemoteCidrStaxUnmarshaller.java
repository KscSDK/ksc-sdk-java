package com.ksc.network.vpc.transform.Tunnels;

import javax.xml.stream.events.XMLEvent;

import com.ksc.network.vpc.model.Tunnels.AssociateRemoteCidr;
import com.ksc.network.vpc.model.Tunnels.AssociateSubnet;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

/**
 * SecurityGroupRule StAX Unmarshaller
 */
public class AssociateRemoteCidrStaxUnmarshaller implements Unmarshaller<AssociateRemoteCidr, StaxUnmarshallerContext> {

	public AssociateRemoteCidr unmarshall(StaxUnmarshallerContext context) throws Exception {
		AssociateRemoteCidr tunnel = new AssociateRemoteCidr();
		int originalDepth = context.getCurrentDepth();
		int targetDepth = originalDepth + 1;

		if (context.isStartOfDocument())
			targetDepth += 1;
		
		while (true) {
			XMLEvent xmlEvent = context.nextEvent();
			if (xmlEvent.isEndDocument())
				return tunnel;
			if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

				if (context.testExpression("CidrBlock", targetDepth)) {
					tunnel.setCidrBlock(StringStaxUnmarshaller.getInstance().unmarshall(context));
					continue;
				}

			} else if (xmlEvent.isEndElement()) {
				if (context.getCurrentDepth() < originalDepth) {
					return tunnel;
				}
			}
		}
	}

	private static AssociateRemoteCidrStaxUnmarshaller instance;

	public static AssociateRemoteCidrStaxUnmarshaller getInstance() {
		if (instance == null)
			instance = new AssociateRemoteCidrStaxUnmarshaller();
		return instance;
	}
}
