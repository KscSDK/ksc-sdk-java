package com.ksc.monitor.model.transform;

import javax.xml.stream.events.XMLEvent;

import com.ksc.monitor.model.GetMetricStatisticsResult;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

public class GetMetricStatisticsResultStaxUnmarshaller implements Unmarshaller<GetMetricStatisticsResult, StaxUnmarshallerContext> {

	@Override
	public GetMetricStatisticsResult unmarshall(StaxUnmarshallerContext context) throws Exception {
		// TODO Auto-generated method stub
		GetMetricStatisticsResult result=new GetMetricStatisticsResult();
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
				}else if (context.testExpression("Label", targetDepth)) {
					result.setLabel(StringStaxUnmarshaller.getInstance().unmarshall(context));
					continue;
				}
			}else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return result;
                }
            }
		}
	}
	private static GetMetricStatisticsResultStaxUnmarshaller instance;

	public static GetMetricStatisticsResultStaxUnmarshaller getInstance() {
		if (instance == null)
			instance = new GetMetricStatisticsResultStaxUnmarshaller();
		return instance;
	}
}
