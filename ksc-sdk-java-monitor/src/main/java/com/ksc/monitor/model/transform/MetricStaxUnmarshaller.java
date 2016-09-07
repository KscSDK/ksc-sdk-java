package com.ksc.monitor.model.transform;

import javax.xml.stream.events.XMLEvent;

import com.ksc.monitor.model.Metric;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.IntegerStaxUnmarshaller;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

public class MetricStaxUnmarshaller implements Unmarshaller<Metric, StaxUnmarshallerContext> {

	@Override
	public Metric unmarshall(StaxUnmarshallerContext context) throws Exception {
		Metric metric = new Metric();
		// TODO Auto-generated method stub
		int originalDepth = context.getCurrentDepth();
		int targetDepth = originalDepth + 1;

		if (context.isStartOfDocument())
			targetDepth += 1;
		while (true) {
			XMLEvent xmlEvent = context.nextEvent();
			if (xmlEvent.isEndDocument())
				return metric;
			if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {
				if (context.testExpression("InstanceId", targetDepth)) {
					metric.setInstanceId(StringStaxUnmarshaller.getInstance().unmarshall(context));
					continue;
				} else if (context.testExpression("MetricName", targetDepth)) {
					metric.setMetricName(StringStaxUnmarshaller.getInstance().unmarshall(context));
					continue;
				} else if (context.testExpression("Namespace", targetDepth)) {
					metric.setNamespace(StringStaxUnmarshaller.getInstance().unmarshall(context));
					continue;
				} else if (context.testExpression("Interval", targetDepth)) {
					metric.setInterval(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
					continue;
				} else if (context.testExpression("Unit", targetDepth)) {
					metric.setUnit(StringStaxUnmarshaller.getInstance().unmarshall(context));
					continue;
				} else if (context.testExpression("Type", targetDepth)) {
					metric.setType(StringStaxUnmarshaller.getInstance().unmarshall(context));
					continue;
				}
			} else if (xmlEvent.isEndElement()) {
				if (context.getCurrentDepth() < originalDepth) {
					return metric;
				}
			}
		}
	}

	private static MetricStaxUnmarshaller instance;

	public static MetricStaxUnmarshaller getInstance() {
		if (instance == null)
			instance = new MetricStaxUnmarshaller();
		return instance;
	}
}
