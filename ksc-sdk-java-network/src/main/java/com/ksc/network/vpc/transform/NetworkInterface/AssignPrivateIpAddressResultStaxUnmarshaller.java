package com.ksc.network.vpc.transform.NetworkInterface;

import com.ksc.network.vpc.model.NetworkInterface.AssignPrivateIpAddressResult;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import javax.xml.stream.events.XMLEvent;

/**
 * AssignPrivateIpAddress StAX Unmarshaller
 */
public class AssignPrivateIpAddressResultStaxUnmarshaller implements
		Unmarshaller<AssignPrivateIpAddressResult, StaxUnmarshallerContext> {

    @Override
	public AssignPrivateIpAddressResult unmarshall(StaxUnmarshallerContext context)
			throws Exception {
        AssignPrivateIpAddressResult assignPrivateIpAddressResult = new AssignPrivateIpAddressResult();
		int originalDepth = context.getCurrentDepth();
		int targetDepth = originalDepth + 1;

		if (context.isStartOfDocument())
			targetDepth += 1;

		while (true) {
			XMLEvent xmlEvent = context.nextEvent();
			if (xmlEvent.isEndDocument())
				return assignPrivateIpAddressResult;

			if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

				if (context.testExpression("NetworkInterface", targetDepth)) {
                    assignPrivateIpAddressResult.setNetworkInterface(NetworkInterfaceStaxUnmarshaller
							.getInstance().unmarshall(context));
					continue;
				}else if(context.testExpression("RequestId", targetDepth)){
                    assignPrivateIpAddressResult.setRequestId(StringStaxUnmarshaller.getInstance()
							.unmarshall(context));
					continue;
				}

			} else if (xmlEvent.isEndElement()) {
				if (context.getCurrentDepth() < originalDepth) {
					return assignPrivateIpAddressResult;
				}
			}
		}
	}

	private static AssignPrivateIpAddressResultStaxUnmarshaller instance;

	public static AssignPrivateIpAddressResultStaxUnmarshaller getInstance() {
		if (instance == null)
			instance = new AssignPrivateIpAddressResultStaxUnmarshaller();
		return instance;
	}
}
