package com.ksc.network.eip.model.transform;

import javax.xml.stream.events.XMLEvent;

import com.ksc.network.eip.model.GetLinesResult;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

public class GetLinesResultStaxUnmarshaller implements Unmarshaller<GetLinesResult, StaxUnmarshallerContext> {
	private static GetLinesResultStaxUnmarshaller instance;

	public static GetLinesResultStaxUnmarshaller getInstance() {
		if (instance == null)
			instance = new GetLinesResultStaxUnmarshaller();
		return instance;
	}

	@Override
	public GetLinesResult unmarshall(StaxUnmarshallerContext context) throws Exception {
		GetLinesResult result = new GetLinesResult();
		// TODO Auto-generated method stub
		int originalDepth = context.getCurrentDepth();
		int targetDepth = originalDepth + 1;

		if (context.isStartOfDocument())
			targetDepth += 1;
		while (true) {
			XMLEvent xmlEvent = context.nextEvent();
			if (xmlEvent.isEndDocument())
				return result;
			if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {
				if (context.testExpression("LineSet/item", targetDepth)) {
					result.addLines(LineStaxUnmarshaller.getInstance().unmarshall(context));
					continue;
				} else if (context.testExpression("RequestId", targetDepth)) {
					result.setRequestId(StringStaxUnmarshaller.getInstance().unmarshall(context));
					continue;
				}
			} else if (xmlEvent.isEndElement()) {
				if (context.getCurrentDepth() < originalDepth) {
					return result;
				}
			}
		}
	}
}
