package com.ksc.kec.model.transform;

import javax.xml.stream.events.XMLEvent;

import com.ksc.kec.model.InstanceMonitor;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

/**
 * InstanceMonitoring StAX Unmarshaller
 */
public class InstanceMonitoringStaxUnmarshaller implements
		Unmarshaller<InstanceMonitor, StaxUnmarshallerContext> {

	public InstanceMonitor unmarshall(StaxUnmarshallerContext context)
			throws Exception {
		InstanceMonitor instanceMonitor = new InstanceMonitor();
		int originalDepth = context.getCurrentDepth();
		int targetDepth = originalDepth + 1;

		if (context.isStartOfDocument())
			targetDepth += 1;

		while (true) {
			XMLEvent xmlEvent = context.nextEvent();
			if (xmlEvent.isEndDocument())
				return instanceMonitor;

			if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

				if (context.testExpression("State", targetDepth)) {
					instanceMonitor.setState(StringStaxUnmarshaller
							.getInstance().unmarshall(context));
					continue;
				}

			} else if (xmlEvent.isEndElement()) {
				if (context.getCurrentDepth() < originalDepth) {
					return instanceMonitor;
				}
			}
		}
	}

	private static InstanceMonitoringStaxUnmarshaller instance;

	public static InstanceMonitoringStaxUnmarshaller getInstance() {
		if (instance == null)
			instance = new InstanceMonitoringStaxUnmarshaller();
		return instance;
	}
}
