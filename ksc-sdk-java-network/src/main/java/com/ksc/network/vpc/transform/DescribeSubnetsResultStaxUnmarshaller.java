package com.ksc.network.vpc.transform;

import javax.xml.stream.events.XMLEvent;

import com.ksc.network.vpc.model.DescribeSubnetsResult;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

/**
 * DescribeSubnetsResult StAX Unmarshaller
 */
public class DescribeSubnetsResultStaxUnmarshaller
		implements Unmarshaller<DescribeSubnetsResult, StaxUnmarshallerContext> {

	public DescribeSubnetsResult unmarshall(StaxUnmarshallerContext context) throws Exception {
		DescribeSubnetsResult describeSubnetsResult = new DescribeSubnetsResult();
		int originalDepth = context.getCurrentDepth();
		int targetDepth = originalDepth + 1;

		if (context.isStartOfDocument())
			targetDepth += 1;

		while (true) {
			XMLEvent xmlEvent = context.nextEvent();
			if (xmlEvent.isEndDocument())
				return describeSubnetsResult;

			if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

				if (context.testExpression("SubnetSet/item", targetDepth)) {
					describeSubnetsResult.withSubnets(SubnetStaxUnmarshaller.getInstance().unmarshall(context));
					continue;
				} else if (context.testExpression("RequestId", targetDepth)) {
					describeSubnetsResult
							.setRequestId(StringStaxUnmarshaller.getInstance().unmarshall(context));
					continue;
				}

			} else if (xmlEvent.isEndElement()) {
				if (context.getCurrentDepth() < originalDepth) {
					return describeSubnetsResult;
				}
			}
		}
	}

	private static DescribeSubnetsResultStaxUnmarshaller instance;

	public static DescribeSubnetsResultStaxUnmarshaller getInstance() {
		if (instance == null)
			instance = new DescribeSubnetsResultStaxUnmarshaller();
		return instance;
	}
}
