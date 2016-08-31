package com.ksc.network.eip.model.transform;

import javax.xml.stream.events.XMLEvent;

import com.ksc.network.eip.model.Line;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;
/**
 * Line StAX Unmarshaller
 */
public class LineStaxUnmarshaller implements Unmarshaller<Line, StaxUnmarshallerContext> {

	@Override
	public Line unmarshall(StaxUnmarshallerContext context) throws Exception {
		// TODO Auto-generated method stub
		Line line = new Line();
		int originalDepth = context.getCurrentDepth();
		int targetDepth = originalDepth + 1;
		while (true) {
			XMLEvent xmlEvent = context.nextEvent();
			if (xmlEvent.isEndDocument())
				return line;
			if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {
				if (context.testExpression("LineId", targetDepth)) {
					line.setLineId(StringStaxUnmarshaller.getInstance().unmarshall(context));
					continue;
				} else if (context.testExpression("LineName", targetDepth)) {
					line.setLineName(StringStaxUnmarshaller.getInstance().unmarshall(context));
					continue;
				}else if (context.testExpression("LineType", targetDepth)) {
					line.setLineType(StringStaxUnmarshaller.getInstance().unmarshall(context));
					continue;
				}
			} else if (xmlEvent.isEndElement()) {
				if (context.getCurrentDepth() < originalDepth) {
					return line;
				}
			}
		}
	}

	private static LineStaxUnmarshaller instance;

	public static LineStaxUnmarshaller getInstance() {
		if (instance == null)
			instance = new LineStaxUnmarshaller();
		return instance;
	}
}
