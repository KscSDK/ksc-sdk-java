package com.ksc.kec.model.transform;

import javax.xml.stream.events.XMLEvent;

import com.ksc.kec.model.DescribeInstanceFamilysResult;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

/**
 * DescribeInstanceFamilysResult StAX Unmarshaller
 */
public class DescribeInstanceFamilysResultStaxUnmarshaller implements
		Unmarshaller<DescribeInstanceFamilysResult, StaxUnmarshallerContext> {

	public DescribeInstanceFamilysResult unmarshall(StaxUnmarshallerContext context)
			throws Exception {
		DescribeInstanceFamilysResult describeInstanceFamilysResult = new DescribeInstanceFamilysResult();
		int originalDepth = context.getCurrentDepth();
		int targetDepth = originalDepth + 1;

		if (context.isStartOfDocument())
			targetDepth += 1;

		while (true) {
			XMLEvent xmlEvent = context.nextEvent();
			if (xmlEvent.isEndDocument())
				return describeInstanceFamilysResult;

			if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {
				// no use reservation
				if (context.testExpression("InstanceFamilySet/InstanceFamily", targetDepth)) {
					describeInstanceFamilysResult.withInstanceFamilysSet(InstanceFamilyStaxUnmarshaller
									.getInstance().unmarshall(context));
					continue;
				}

				if (context.testExpression("RequestId", targetDepth)) {
					describeInstanceFamilysResult.setRequestId(StringStaxUnmarshaller
							.getInstance().unmarshall(context));
					continue;
				}
			} else if (xmlEvent.isEndElement()) {
				if (context.getCurrentDepth() < originalDepth) {
					return describeInstanceFamilysResult;
				}
			}
		}
	}

	private static DescribeInstanceFamilysResultStaxUnmarshaller instance;

	public static DescribeInstanceFamilysResultStaxUnmarshaller getInstance() {
		if (instance == null)
			instance = new DescribeInstanceFamilysResultStaxUnmarshaller();
		return instance;
	}
}
