package com.ksc.kec.model.transform;

import javax.xml.stream.events.XMLEvent;

import com.ksc.kec.model.DescribeInstanceTypeConfigsResult;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

/**
 * DescribeInstanceTypeConfigsResult StAX Unmarshaller
 */
public class DescribeInstanceTypeConfigsResultStaxUnmarshaller implements
		Unmarshaller<DescribeInstanceTypeConfigsResult, StaxUnmarshallerContext> {

	public DescribeInstanceTypeConfigsResult unmarshall(StaxUnmarshallerContext context)
			throws Exception {
		DescribeInstanceTypeConfigsResult describeInstanceTypeConfigsResult = new DescribeInstanceTypeConfigsResult();
		int originalDepth = context.getCurrentDepth();
		int targetDepth = originalDepth + 1;

		if (context.isStartOfDocument())
			targetDepth += 1;

		while (true) {
			XMLEvent xmlEvent = context.nextEvent();
			if (xmlEvent.isEndDocument())
				return describeInstanceTypeConfigsResult;

			if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {
				// no use reservation
				if (context.testExpression("InstanceTypeConfigSet/InstanceTypeConfig", targetDepth)) {
					describeInstanceTypeConfigsResult
							.withInstanceTypeConfigsSet(InstanceTypeConfigStaxUnmarshaller
									.getInstance().unmarshall(context));
					continue;
				}

				if (context.testExpression("RequestId", targetDepth)) {
					describeInstanceTypeConfigsResult.setRequestId(StringStaxUnmarshaller
							.getInstance().unmarshall(context));
					continue;
				}
			} else if (xmlEvent.isEndElement()) {
				if (context.getCurrentDepth() < originalDepth) {
					return describeInstanceTypeConfigsResult;
				}
			}
		}
	}

	private static DescribeInstanceTypeConfigsResultStaxUnmarshaller instance;

	public static DescribeInstanceTypeConfigsResultStaxUnmarshaller getInstance() {
		if (instance == null)
			instance = new DescribeInstanceTypeConfigsResultStaxUnmarshaller();
		return instance;
	}
}
