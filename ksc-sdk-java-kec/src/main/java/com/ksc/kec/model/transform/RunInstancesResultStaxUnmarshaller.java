package com.ksc.kec.model.transform;

import com.ksc.kec.model.RunInstancesResult;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import javax.xml.stream.events.XMLEvent;

/**
 * RunInstancesResult StAX Unmarshaller
 */
public class RunInstancesResultStaxUnmarshaller implements
		Unmarshaller<RunInstancesResult, StaxUnmarshallerContext> {

	public RunInstancesResult unmarshall(StaxUnmarshallerContext context)
			throws Exception {
		RunInstancesResult runInstancesResult = new RunInstancesResult();
		int originalDepth = context.getCurrentDepth();
		int targetDepth = originalDepth + 1;

		if (context.isStartOfDocument())
			targetDepth += 1;

		while (true) {
			XMLEvent xmlEvent = context.nextEvent();
			if (xmlEvent.isEndDocument())
				return runInstancesResult;

			if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {
				// no use reservation
				if (context.testExpression("InstancesSet/Item", targetDepth)) {
					runInstancesResult
							.withInstancesSet(InstanceDetailStaxUnmarshaller
									.getInstance().unmarshall(context));
					continue;
				}

				if (context.testExpression("RequestId", targetDepth)) {
					runInstancesResult.setRequestId(StringStaxUnmarshaller
							.getInstance().unmarshall(context));
					continue;
				}
			} else if (xmlEvent.isEndElement()) {
				if (context.getCurrentDepth() < originalDepth) {
					return runInstancesResult;
				}
			}
		}
	}

	private static RunInstancesResultStaxUnmarshaller instance;

	public static RunInstancesResultStaxUnmarshaller getInstance() {
		if (instance == null)
			instance = new RunInstancesResultStaxUnmarshaller();
		return instance;
	}
}
