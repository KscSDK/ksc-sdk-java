package com.ksc.monitor.model.transform;

import com.ksc.monitor.model.GetCustomMetricStatisticsResult;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import javax.xml.stream.events.XMLEvent;

public class GetCustomMetricStatisticsResultStaxUnmarshaller
		implements Unmarshaller<GetCustomMetricStatisticsResult, StaxUnmarshallerContext> {

	@Override
	public GetCustomMetricStatisticsResult unmarshall(StaxUnmarshallerContext context) throws Exception {
		// TODO Auto-generated method stub
		GetCustomMetricStatisticsResult result = new GetCustomMetricStatisticsResult();
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
				if (context.testExpression("DataPoints/member", targetDepth)) {
					result.withDatapoints(CustomDatapointStaxUnmarshaller.getInstance().unmarshall(context));
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

	private static GetCustomMetricStatisticsResultStaxUnmarshaller instance;

	public static GetCustomMetricStatisticsResultStaxUnmarshaller getInstance() {
		if (instance == null)
			instance = new GetCustomMetricStatisticsResultStaxUnmarshaller();
		return instance;
	}
}
