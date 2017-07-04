package com.ksc.monitor.model.transform;

import com.ksc.monitor.model.CustomDataPoint;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.DoubleStaxUnmarshaller;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import javax.xml.stream.events.XMLEvent;

public class CustomDatapointStaxUnmarshaller implements Unmarshaller<CustomDataPoint, StaxUnmarshallerContext> {

	@Override
	public CustomDataPoint unmarshall(StaxUnmarshallerContext context) throws Exception {
		CustomDataPoint point = new CustomDataPoint();
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
				if (context.testExpression("Value", targetDepth)) {
					point.setValue(DoubleStaxUnmarshaller.getInstance().unmarshall(context));
					continue;
				} else if (context.testExpression("Timestamp", targetDepth)) {
					point.setTimestamp(StringStaxUnmarshaller.getInstance().unmarshall(context));
					continue;
				}
			} else if (xmlEvent.isEndElement()) {
				if (context.getCurrentDepth() < originalDepth) {
					return point;
				}
			}
		}
	}

	private static CustomDatapointStaxUnmarshaller instance;

	public static CustomDatapointStaxUnmarshaller getInstance() {
		if (instance == null)
			instance = new CustomDatapointStaxUnmarshaller();
		return instance;
	}
}
