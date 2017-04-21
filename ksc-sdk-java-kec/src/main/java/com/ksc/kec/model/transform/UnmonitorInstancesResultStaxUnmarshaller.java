package com.ksc.kec.model.transform;

import com.ksc.kec.model.UnmonitorInstancesResult;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import javax.xml.stream.events.XMLEvent;

/**
 * DescribeInstancesResult StAX Unmarshaller
 */
public class UnmonitorInstancesResultStaxUnmarshaller implements
		Unmarshaller<UnmonitorInstancesResult, StaxUnmarshallerContext> {

	public UnmonitorInstancesResult unmarshall(StaxUnmarshallerContext context)
			throws Exception {
		UnmonitorInstancesResult unmonitorInstancesResult = new UnmonitorInstancesResult();
		int originalDepth = context.getCurrentDepth();
		int targetDepth = originalDepth + 1;

		if (context.isStartOfDocument())
			targetDepth += 1;

		while (true) {
			XMLEvent xmlEvent = context.nextEvent();
			if (xmlEvent.isEndDocument())
				return unmonitorInstancesResult;

			if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {
				// no use reservation
				if (context.testExpression("InstancesSet/Item", targetDepth)) {
					unmonitorInstancesResult
							.withInstancesSet(InstanceDetailStaxUnmarshaller
									.getInstance().unmarshall(context));
					continue;
				}

				if (context.testExpression("RequestId", targetDepth)) {
					unmonitorInstancesResult.setRequestId(StringStaxUnmarshaller
							.getInstance().unmarshall(context));
					continue;
				}
			} else if (xmlEvent.isEndElement()) {
				if (context.getCurrentDepth() < originalDepth) {
					return unmonitorInstancesResult;
				}
			}
		}
	}

	private static UnmonitorInstancesResultStaxUnmarshaller instance;

	public static UnmonitorInstancesResultStaxUnmarshaller getInstance() {
		if (instance == null)
			instance = new UnmonitorInstancesResultStaxUnmarshaller();
		return instance;
	}
}
