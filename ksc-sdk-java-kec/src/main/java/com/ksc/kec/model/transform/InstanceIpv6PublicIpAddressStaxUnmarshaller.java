package com.ksc.kec.model.transform;

import com.ksc.kec.model.InstanceNetwork;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import javax.xml.stream.events.XMLEvent;

public class InstanceIpv6PublicIpAddressStaxUnmarshaller implements
       Unmarshaller<InstanceNetwork.Ipv6PublicIpAddress, StaxUnmarshallerContext> {

	public InstanceNetwork.Ipv6PublicIpAddress unmarshall(StaxUnmarshallerContext context)
			throws Exception {
		InstanceNetwork.Ipv6PublicIpAddress ipv6PublicIpAddress = new InstanceNetwork.Ipv6PublicIpAddress();
		int originalDepth = context.getCurrentDepth();
		int targetDepth = originalDepth + 1;

		if (context.isStartOfDocument())
			targetDepth += 1;

		while (true) {
			XMLEvent xmlEvent = context.nextEvent();
			if (xmlEvent.isEndDocument())
				return ipv6PublicIpAddress;

			if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

				if (context.testExpression("Ipv6PublicIpAddress", targetDepth)) {
					ipv6PublicIpAddress.setIpv6PublicIpAddress(StringStaxUnmarshaller.getInstance()
							.unmarshall(context));
					continue;
				}
				
			} else if (xmlEvent.isEndElement()) {
				if (context.getCurrentDepth() < originalDepth) {
					return ipv6PublicIpAddress;
				}
			}
		}
	}

	private static InstanceIpv6PublicIpAddressStaxUnmarshaller instance;

	public static InstanceIpv6PublicIpAddressStaxUnmarshaller getInstance() {
		if (instance == null)
			instance = new InstanceIpv6PublicIpAddressStaxUnmarshaller();
		return instance;
	}
}
