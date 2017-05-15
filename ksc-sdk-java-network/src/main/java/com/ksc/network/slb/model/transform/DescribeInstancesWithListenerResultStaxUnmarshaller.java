package com.ksc.network.slb.model.transform;

import com.ksc.network.slb.model.DescribeInstancesWithListenerResult;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import javax.xml.stream.events.XMLEvent;

public class DescribeInstancesWithListenerResultStaxUnmarshaller
		implements Unmarshaller<DescribeInstancesWithListenerResult, StaxUnmarshallerContext> {

	@Override
	public DescribeInstancesWithListenerResult unmarshall(StaxUnmarshallerContext context) throws Exception {
		DescribeInstancesWithListenerResult describeInstancesWithListenerResult = new DescribeInstancesWithListenerResult();
		int originalDepth = context.getCurrentDepth();
		int targetDepth = originalDepth + 1;

		if (context.isStartOfDocument())
			targetDepth += 1;

		while (true) {
			XMLEvent xmlEvent = context.nextEvent();
			if (xmlEvent.isEndDocument())
				return describeInstancesWithListenerResult;

			if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

				if (context.testExpression("RealServerSet/Item", targetDepth)) {
					describeInstancesWithListenerResult
							.addRealServerSet(RealServerStaxUnmarshaller.getInstance().unmarshall(context));
					continue;
				} else if (context.testExpression("RequestId", targetDepth)) {
					describeInstancesWithListenerResult.setRequestId(StringStaxUnmarshaller.getInstance().unmarshall(context));
					continue;
				}

			} else if (xmlEvent.isEndElement()) {
				if (context.getCurrentDepth() < originalDepth) {
					return describeInstancesWithListenerResult;
				}
			}
		}
	}

	private static DescribeInstancesWithListenerResultStaxUnmarshaller instance;

	public static DescribeInstancesWithListenerResultStaxUnmarshaller getInstance() {
		if (instance == null)
			instance = new DescribeInstancesWithListenerResultStaxUnmarshaller();
		return instance;
	}

}
