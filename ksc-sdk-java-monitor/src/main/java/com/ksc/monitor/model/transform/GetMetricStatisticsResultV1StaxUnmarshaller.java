package com.ksc.monitor.model.transform;

import javax.xml.stream.events.XMLEvent;
import com.ksc.monitor.model.GetMetricStatisticsResultV1;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

public class GetMetricStatisticsResultV1StaxUnmarshaller
		implements Unmarshaller<GetMetricStatisticsResultV1, StaxUnmarshallerContext> {

	@Override
	public GetMetricStatisticsResultV1 unmarshall(StaxUnmarshallerContext context) throws Exception {
		// TODO Auto-generated method stub
		GetMetricStatisticsResultV1 result = new GetMetricStatisticsResultV1();
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
				if (context.testExpression("Datapoints", targetDepth)) {
					result.setDatapoints(DatapointV1StaxUnmarshaller.getInstance().unmarshall(context));
					continue;
				} else if (context.testExpression("Label", targetDepth)) {
					result.setLabel(StringStaxUnmarshaller.getInstance().unmarshall(context));
					continue;
				}
			} else if (xmlEvent.isEndElement()) {
				if (context.getCurrentDepth() < originalDepth) {
					return result;
				}
			}
		}
	}

	private static GetMetricStatisticsResultV1StaxUnmarshaller instance;

	public static GetMetricStatisticsResultV1StaxUnmarshaller getInstance() {
		if (instance == null)
			instance = new GetMetricStatisticsResultV1StaxUnmarshaller();
		return instance;
	}
}
