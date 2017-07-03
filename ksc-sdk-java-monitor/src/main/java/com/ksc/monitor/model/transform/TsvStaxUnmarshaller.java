package com.ksc.monitor.model.transform;
import javax.xml.stream.events.XMLEvent;
import com.ksc.monitor.model.Tsv;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.DateStaxUnmarshaller;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.DoubleStaxUnmarshaller;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

public class TsvStaxUnmarshaller implements Unmarshaller<Tsv, StaxUnmarshallerContext> {

	@Override
	public Tsv unmarshall(StaxUnmarshallerContext context) throws Exception {
		Tsv point = new Tsv();
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

	private static TsvStaxUnmarshaller instance;

	public static TsvStaxUnmarshaller getInstance() {
		if (instance == null)
			instance = new TsvStaxUnmarshaller();
		return instance;
	}
}
