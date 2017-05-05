package com.ksc.network.vpc.transform.Nat;

import javax.xml.stream.events.XMLEvent;

import com.ksc.network.vpc.model.Nat.NatIp;
import com.ksc.network.vpc.model.Route.NextHop;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

/**
 * SecurityGroupRule StAX Unmarshaller
 */
public class NatIpStaxUnmarshaller implements Unmarshaller<NatIp, StaxUnmarshallerContext> {

	public NatIp unmarshall(StaxUnmarshallerContext context) throws Exception {
		NatIp nat = new NatIp();
		int originalDepth = context.getCurrentDepth();
		int targetDepth = originalDepth + 1;

		if (context.isStartOfDocument())
			targetDepth += 1;
		
		while (true) {
			XMLEvent xmlEvent = context.nextEvent();
			if (xmlEvent.isEndDocument())
				return nat;
			if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

				if (context.testExpression("NatIp", targetDepth)) {
					nat.setNatIp(StringStaxUnmarshaller.getInstance().unmarshall(context));
					continue;
				}

			} else if (xmlEvent.isEndElement()) {
				if (context.getCurrentDepth() < originalDepth) {
					return nat;
				}
			}
		}
	}

	private static NatIpStaxUnmarshaller instance;

	public static NatIpStaxUnmarshaller getInstance() {
		if (instance == null)
			instance = new NatIpStaxUnmarshaller();
		return instance;
	}
}
