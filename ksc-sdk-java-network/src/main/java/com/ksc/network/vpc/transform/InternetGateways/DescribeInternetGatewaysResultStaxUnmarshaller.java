package com.ksc.network.vpc.transform.InternetGateways;

import javax.xml.stream.events.XMLEvent;

import com.ksc.network.vpc.model.InternetGateways.DescribeInternetGatewaysResult;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

/**
 * DescribeInternetGatewaysResult StAX Unmarshaller
 */
public class DescribeInternetGatewaysResultStaxUnmarshaller implements
		Unmarshaller<DescribeInternetGatewaysResult, StaxUnmarshallerContext> {

	public DescribeInternetGatewaysResult unmarshall(StaxUnmarshallerContext context)
			throws Exception {
		DescribeInternetGatewaysResult describeInternetGatewaysResult = new DescribeInternetGatewaysResult();
		int originalDepth = context.getCurrentDepth();
		int targetDepth = originalDepth + 1;

		if (context.isStartOfDocument())
			targetDepth += 1;

		while (true) {
			XMLEvent xmlEvent = context.nextEvent();
			if (xmlEvent.isEndDocument())
				return describeInternetGatewaysResult;

			if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

				if (context.testExpression("InternetGatewaySet/item", targetDepth)) {
					describeInternetGatewaysResult.addInternetGateways(InternetGatewayStaxUnmarshaller
							.getInstance().unmarshall(context));
					continue;
				}else if(context.testExpression("RequestId", targetDepth)){
					describeInternetGatewaysResult.setRequestId(StringStaxUnmarshaller.getInstance()
							.unmarshall(context));
					continue;
				}

			} else if (xmlEvent.isEndElement()) {
				if (context.getCurrentDepth() < originalDepth) {
					return describeInternetGatewaysResult;
				}
			}
		}
	}

	private static DescribeInternetGatewaysResultStaxUnmarshaller instance;

	public static DescribeInternetGatewaysResultStaxUnmarshaller getInstance() {
		if (instance == null)
			instance = new DescribeInternetGatewaysResultStaxUnmarshaller();
		return instance;
	}
}
