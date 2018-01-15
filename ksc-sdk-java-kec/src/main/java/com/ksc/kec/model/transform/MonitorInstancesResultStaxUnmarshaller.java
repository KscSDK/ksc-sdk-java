package com.ksc.kec.model.transform;

import javax.xml.stream.events.XMLEvent;

import com.ksc.kec.model.MonitorInstancesResult;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

/**
 * MonitorInstancesResult StAX Unmarshaller
 */
public class MonitorInstancesResultStaxUnmarshaller implements
		Unmarshaller<MonitorInstancesResult, StaxUnmarshallerContext> {

	public MonitorInstancesResult unmarshall(StaxUnmarshallerContext context)
			throws Exception {
		MonitorInstancesResult monitorInstancesResult = new MonitorInstancesResult();
		int originalDepth = context.getCurrentDepth();
		int targetDepth = originalDepth + 1;

		if (context.isStartOfDocument())
			targetDepth += 1;

		while (true) {
			XMLEvent xmlEvent = context.nextEvent();
			if (xmlEvent.isEndDocument())
				return monitorInstancesResult;

			if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {
				// no use reservation
				if (context.testExpression("InstancesSet/Item", targetDepth)) {
					monitorInstancesResult
							.withInstancesSet(InstanceDetailStaxUnmarshaller
									.getInstance().unmarshall(context));
					continue;
				}

				if (context.testExpression("RequestId", targetDepth)) {
					monitorInstancesResult.setRequestId(StringStaxUnmarshaller
							.getInstance().unmarshall(context));
					continue;
				}
			} else if (xmlEvent.isEndElement()) {
				if (context.getCurrentDepth() < originalDepth) {
					return monitorInstancesResult;
				}
			}
		}
	}

	private static MonitorInstancesResultStaxUnmarshaller instance;

	public static MonitorInstancesResultStaxUnmarshaller getInstance() {
		if (instance == null)
			instance = new MonitorInstancesResultStaxUnmarshaller();
		return instance;
	}
}
