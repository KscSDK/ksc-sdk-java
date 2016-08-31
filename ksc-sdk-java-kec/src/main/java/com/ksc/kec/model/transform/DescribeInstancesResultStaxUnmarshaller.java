package com.ksc.kec.model.transform;

import javax.xml.stream.events.XMLEvent;

import com.ksc.kec.model.DescribeInstancesResult;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.IntegerStaxUnmarshaller;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

/**
 * DescribeInstancesResult StAX Unmarshaller
 */
public class DescribeInstancesResultStaxUnmarshaller implements
		Unmarshaller<DescribeInstancesResult, StaxUnmarshallerContext> {

	public DescribeInstancesResult unmarshall(StaxUnmarshallerContext context)
			throws Exception {
		DescribeInstancesResult describeInstancesResult = new DescribeInstancesResult();
		int originalDepth = context.getCurrentDepth();
		int targetDepth = originalDepth + 1;

		if (context.isStartOfDocument())
			targetDepth += 1;

		while (true) {
			XMLEvent xmlEvent = context.nextEvent();
			if (xmlEvent.isEndDocument())
				return describeInstancesResult;

			if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {
				// no use reservation
				if (context.testExpression("InstancesSet/Item", targetDepth)) {
					describeInstancesResult
							.withInstancesSet(InstanceDetailStaxUnmarshaller
									.getInstance().unmarshall(context));
					continue;
				}

				if (context.testExpression("Marker", targetDepth)) {
					describeInstancesResult.setMarker(IntegerStaxUnmarshaller
							.getInstance().unmarshall(context));
					continue;
				}

				if (context.testExpression("InstanceCount", targetDepth)) {
					describeInstancesResult
							.setInstanceCount(IntegerStaxUnmarshaller
									.getInstance().unmarshall(context));
					continue;
				}

				if (context.testExpression("RequestId", targetDepth)) {
					describeInstancesResult.setRequestId(StringStaxUnmarshaller
							.getInstance().unmarshall(context));
					continue;
				}
			} else if (xmlEvent.isEndElement()) {
				if (context.getCurrentDepth() < originalDepth) {
					return describeInstancesResult;
				}
			}
		}
	}

	private static DescribeInstancesResultStaxUnmarshaller instance;

	public static DescribeInstancesResultStaxUnmarshaller getInstance() {
		if (instance == null)
			instance = new DescribeInstancesResultStaxUnmarshaller();
		return instance;
	}
}
