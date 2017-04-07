package com.ksc.network.vpc.transform.subnet;

import javax.xml.stream.events.XMLEvent;

import com.ksc.network.vpc.model.subnet.DescribeSubnetAvailableAddressesResult;
import com.ksc.network.vpc.model.subnet.DescribeSubnetsResult;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

/**
 * DescribeSubnetsResult StAX Unmarshaller
 */
public class DescribeSubnetAvailableAddressesResultStaxUnmarshaller
		implements Unmarshaller<DescribeSubnetAvailableAddressesResult, StaxUnmarshallerContext> {

	public DescribeSubnetAvailableAddressesResult unmarshall(StaxUnmarshallerContext context) throws Exception {
		DescribeSubnetAvailableAddressesResult describeSubnetAvailableAddressesResult = new DescribeSubnetAvailableAddressesResult();
		int originalDepth = context.getCurrentDepth();
		int targetDepth = originalDepth + 1;

		if (context.isStartOfDocument())
			targetDepth += 1;

		while (true) {
			XMLEvent xmlEvent = context.nextEvent();
			if (xmlEvent.isEndDocument())
				return describeSubnetAvailableAddressesResult;

			if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

				if (context.testExpression("AvailableIpAddress", targetDepth)) {
					describeSubnetAvailableAddressesResult.setAvailableIpAddress(StringStaxUnmarshaller.getInstance()
							.unmarshall(context));
					continue;
				} else if (context.testExpression("RequestId", targetDepth)) {
					describeSubnetAvailableAddressesResult
							.setRequestId(StringStaxUnmarshaller.getInstance().unmarshall(context));
					continue;
				}

			} else if (xmlEvent.isEndElement()) {
				if (context.getCurrentDepth() < originalDepth) {
					return describeSubnetAvailableAddressesResult;
				}
			}
		}
	}

	private static DescribeSubnetAvailableAddressesResultStaxUnmarshaller instance;

	public static DescribeSubnetAvailableAddressesResultStaxUnmarshaller getInstance() {
		if (instance == null)
			instance = new DescribeSubnetAvailableAddressesResultStaxUnmarshaller();
		return instance;
	}
}
