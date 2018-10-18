package com.ksc.monitor.model.transform;
import com.ksc.monitor.model.GetMetricStatisticsBatchResult;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import javax.xml.stream.events.XMLEvent;

public class GetMetricStatisticsBatchResultStaxUnmarshaller
		implements Unmarshaller<GetMetricStatisticsBatchResult, StaxUnmarshallerContext> {

	@Override
	public GetMetricStatisticsBatchResult unmarshall(StaxUnmarshallerContext context) throws Exception {
		// TODO Auto-generated method stub
		GetMetricStatisticsBatchResult result = new GetMetricStatisticsBatchResult();
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
				if (context.testExpression("Datapoints/member", targetDepth)) {
					result.withDatapoints(DatapointStaxUnmarshaller.getInstance().unmarshall(context));
					continue;
				} else if (context.testExpression("Label", targetDepth)) {
					result.setLabel(StringStaxUnmarshaller.getInstance().unmarshall(context));
					continue;
				} else if (context.testExpression("Instance", targetDepth)) {
					result.setInstance(StringStaxUnmarshaller.getInstance().unmarshall(context));
					continue;
				}
			} else if (xmlEvent.isEndElement()) {
				if (context.getCurrentDepth() < originalDepth) {
					return result;
				}
			}
		}
	}

	private static GetMetricStatisticsBatchResultStaxUnmarshaller instance;

	public static GetMetricStatisticsBatchResultStaxUnmarshaller getInstance() {
		if (instance == null)
			instance = new GetMetricStatisticsBatchResultStaxUnmarshaller();
		return instance;
	}
}
