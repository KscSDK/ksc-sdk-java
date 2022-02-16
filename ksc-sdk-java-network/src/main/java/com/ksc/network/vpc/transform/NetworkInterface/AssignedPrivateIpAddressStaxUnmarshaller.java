package com.ksc.network.vpc.transform.NetworkInterface;

import com.ksc.network.vpc.model.NetworkInterface.AssignedPrivateIpAddress;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import javax.xml.stream.events.XMLEvent;

/**
 * AssignedPrivateIpAddress StAX Unmarshaller
 */
public class AssignedPrivateIpAddressStaxUnmarshaller implements Unmarshaller<AssignedPrivateIpAddress, StaxUnmarshallerContext> {

    @Override
	public AssignedPrivateIpAddress unmarshall(StaxUnmarshallerContext context) throws Exception {
        AssignedPrivateIpAddress ipAddress = new AssignedPrivateIpAddress();
		int originalDepth = context.getCurrentDepth();
		int targetDepth = originalDepth + 1;

		if (context.isStartOfDocument())
			targetDepth += 1;
		
		while (true) {
			XMLEvent xmlEvent = context.nextEvent();
			if (xmlEvent.isEndDocument())
				return ipAddress;
			if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

				if (context.testExpression("PrivateIpAddress", targetDepth)) {
                    ipAddress.setPrivateIpAddress(StringStaxUnmarshaller.getInstance().unmarshall(context));
					continue;
				}

			} else if (xmlEvent.isEndElement()) {
				if (context.getCurrentDepth() < originalDepth) {
					return ipAddress;
				}
			}
		}
	}

	private static AssignedPrivateIpAddressStaxUnmarshaller instance;

	public static AssignedPrivateIpAddressStaxUnmarshaller getInstance() {
		if (instance == null)
			instance = new AssignedPrivateIpAddressStaxUnmarshaller();
		return instance;
	}
}
