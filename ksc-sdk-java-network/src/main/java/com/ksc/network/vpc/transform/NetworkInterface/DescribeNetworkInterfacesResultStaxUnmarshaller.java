package com.ksc.network.vpc.transform.NetworkInterface;

import javax.xml.stream.events.XMLEvent;

import com.ksc.network.vpc.model.NetworkInterface.DescribeNetworkInterfacesResult;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

/**
 * DescribeNetworkInterfacesResult StAX Unmarshaller
 */
public class DescribeNetworkInterfacesResultStaxUnmarshaller
		implements Unmarshaller<DescribeNetworkInterfacesResult, StaxUnmarshallerContext> {

	public DescribeNetworkInterfacesResult unmarshall(StaxUnmarshallerContext context) throws Exception {
		DescribeNetworkInterfacesResult describeNetworkInterfacesResult = new DescribeNetworkInterfacesResult();
		int originalDepth = context.getCurrentDepth();
		int targetDepth = originalDepth + 1;

		if (context.isStartOfDocument())
			targetDepth += 1;

		while (true) {
			XMLEvent xmlEvent = context.nextEvent();
			if (xmlEvent.isEndDocument())
				return describeNetworkInterfacesResult;

			if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

				if (context.testExpression("NetworkInterfaceSet/item", targetDepth)) {
					describeNetworkInterfacesResult
							.addNetworkInterfaces(NetworkInterfaceStaxUnmarshaller.getInstance().unmarshall(context));
					continue;
				} else if (context.testExpression("RequestId", targetDepth)) {
					describeNetworkInterfacesResult
							.setRequestId(StringStaxUnmarshaller.getInstance().unmarshall(context));
					continue;
				}

			} else if (xmlEvent.isEndElement()) {
				if (context.getCurrentDepth() < originalDepth) {
					return describeNetworkInterfacesResult;
				}
			}
		}
	}

	private static DescribeNetworkInterfacesResultStaxUnmarshaller instance;

	public static DescribeNetworkInterfacesResultStaxUnmarshaller getInstance() {
		if (instance == null)
			instance = new DescribeNetworkInterfacesResultStaxUnmarshaller();
		return instance;
	}
}
