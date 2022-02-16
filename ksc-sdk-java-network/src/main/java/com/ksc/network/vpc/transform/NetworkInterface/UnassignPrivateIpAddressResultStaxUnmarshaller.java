package com.ksc.network.vpc.transform.NetworkInterface;

import com.ksc.network.vpc.model.NetworkInterface.UnassignPrivateIpAddressResult;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import javax.xml.stream.events.XMLEvent;

/**
 * UnassignPrivateIpAddressResult StAX Unmarshaller
 */
public class UnassignPrivateIpAddressResultStaxUnmarshaller implements
		Unmarshaller<UnassignPrivateIpAddressResult, StaxUnmarshallerContext> {

    @Override
	public UnassignPrivateIpAddressResult unmarshall(StaxUnmarshallerContext context)
			throws Exception {
        UnassignPrivateIpAddressResult unassignPrivateIpAddressResult = new UnassignPrivateIpAddressResult();
		int originalDepth = context.getCurrentDepth();
		int targetDepth = originalDepth + 1;

		if (context.isStartOfDocument())
			targetDepth += 1;

		while (true) {
			XMLEvent xmlEvent = context.nextEvent();
			if (xmlEvent.isEndDocument())
				return unassignPrivateIpAddressResult;

			if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

				if (context.testExpression("Return", targetDepth)) {
                    unassignPrivateIpAddressResult.setReturn(Boolean.parseBoolean(StringStaxUnmarshaller.getInstance()
							.unmarshall(context)));
					continue;
				}else if(context.testExpression("RequestId", targetDepth)){
                    unassignPrivateIpAddressResult.setRequestId(StringStaxUnmarshaller.getInstance()
							.unmarshall(context));
					continue;
				}

			} else if (xmlEvent.isEndElement()) {
				if (context.getCurrentDepth() < originalDepth) {
					return unassignPrivateIpAddressResult;
				}
			}
		}
	}

	private static UnassignPrivateIpAddressResultStaxUnmarshaller instance;

	public static UnassignPrivateIpAddressResultStaxUnmarshaller getInstance() {
		if (instance == null)
			instance = new UnassignPrivateIpAddressResultStaxUnmarshaller();
		return instance;
	}
}
