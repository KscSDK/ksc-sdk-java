package com.ksc.monitor.model.transform;

import javax.xml.stream.events.XMLEvent;

import com.ksc.monitor.model.DataPointV1;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.DoubleStaxUnmarshaller;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

public class DatapointV1StaxUnmarshaller implements Unmarshaller<DataPointV1, StaxUnmarshallerContext> {

	@Override
	public DataPointV1 unmarshall(StaxUnmarshallerContext context) throws Exception {
		DataPointV1 point = new DataPointV1();
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

	private static DatapointV1StaxUnmarshaller instance;

	public static DatapointV1StaxUnmarshaller getInstance() {
		if (instance == null)
			instance = new DatapointV1StaxUnmarshaller();
		return instance;
	}
}
