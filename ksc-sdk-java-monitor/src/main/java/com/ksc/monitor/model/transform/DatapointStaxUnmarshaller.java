package com.ksc.monitor.model.transform;

import javax.xml.stream.events.XMLEvent;

import com.ksc.monitor.model.Datapoint;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.DateStaxUnmarshaller;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.DoubleStaxUnmarshaller;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

public class DatapointStaxUnmarshaller implements Unmarshaller<Datapoint, StaxUnmarshallerContext> {

	@Override
	public Datapoint unmarshall(StaxUnmarshallerContext context) throws Exception {
		Datapoint point = new Datapoint();
		// TODO Auto-generated method stub
		int originalDepth = context.getCurrentDepth();
		int targetDepth = originalDepth + 1;

		if (context.isStartOfDocument())
			targetDepth += 1;
		while (true) {
			XMLEvent xmlEvent = context.nextEvent();
			if (xmlEvent.isEndDocument())
				return point;
			if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {
				if (context.testExpression("Average", targetDepth)) {
					point.setAverage(DoubleStaxUnmarshaller.getInstance().unmarshall(context));
					continue;
				} else if (context.testExpression("Max", targetDepth)) {
					point.setMax(DoubleStaxUnmarshaller.getInstance().unmarshall(context));
					continue;
				} else if (context.testExpression("Min", targetDepth)) {
					point.setMin(DoubleStaxUnmarshaller.getInstance().unmarshall(context));
					continue;
				} else if (context.testExpression("Sum", targetDepth)) {
					point.setSum(DoubleStaxUnmarshaller.getInstance().unmarshall(context));
					continue;
				} else if (context.testExpression("SampleCount", targetDepth)) {
					point.setSampleCount(DoubleStaxUnmarshaller.getInstance().unmarshall(context));
					continue;
				} else if (context.testExpression("Timestamp", targetDepth)) {
					point.setTimestamp(DateStaxUnmarshaller.getInstance().unmarshall(context));
					continue;
				}
			} else if (xmlEvent.isEndElement()) {
				if (context.getCurrentDepth() < originalDepth) {
					return point;
				}
			}
		}
	}

	private static DatapointStaxUnmarshaller instance;

	public static DatapointStaxUnmarshaller getInstance() {
		if (instance == null)
			instance = new DatapointStaxUnmarshaller();
		return instance;
	}
}
