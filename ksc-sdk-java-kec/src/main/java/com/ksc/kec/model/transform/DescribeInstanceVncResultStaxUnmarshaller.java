package com.ksc.kec.model.transform;

import javax.xml.stream.events.XMLEvent;

import com.ksc.kec.model.DescribeInstanceVncResult;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

public class DescribeInstanceVncResultStaxUnmarshaller implements
       Unmarshaller<DescribeInstanceVncResult, StaxUnmarshallerContext>{

	public DescribeInstanceVncResult unmarshall(StaxUnmarshallerContext context)
			throws Exception {
		DescribeInstanceVncResult describeInstanceVncResult = new DescribeInstanceVncResult();
		int originalDepth = context.getCurrentDepth();
		int targetDepth = originalDepth + 1;

		if (context.isStartOfDocument())
			targetDepth += 1;

		while (true) {
			XMLEvent xmlEvent = context.nextEvent();
			if (xmlEvent.isEndDocument())
				return describeInstanceVncResult;

			if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {
				// no use reservation
				if (context.testExpression("vncUrl", targetDepth)) {
					describeInstanceVncResult.setVncUrl(StringStaxUnmarshaller
							.getInstance().unmarshall(context));
					continue;
				}

				if (context.testExpression("RequestId", targetDepth) || context.testExpression("requestId", targetDepth)) {
					describeInstanceVncResult.setRequestId(StringStaxUnmarshaller
							.getInstance().unmarshall(context));
					continue;
				}
			} else if (xmlEvent.isEndElement()) {
				if (context.getCurrentDepth() < originalDepth) {
					return describeInstanceVncResult;
				}
			}
		}
	}

	private static DescribeInstanceVncResultStaxUnmarshaller instance;

	public static DescribeInstanceVncResultStaxUnmarshaller getInstance() {
		if (instance == null)
			instance = new DescribeInstanceVncResultStaxUnmarshaller();
		return instance;
	}
}
