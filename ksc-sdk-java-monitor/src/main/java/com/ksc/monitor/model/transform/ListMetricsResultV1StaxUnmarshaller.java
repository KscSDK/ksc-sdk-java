package com.ksc.monitor.model.transform;
import javax.xml.stream.events.XMLEvent;

import com.ksc.monitor.model.ListMetricsResultV1;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

public class ListMetricsResultV1StaxUnmarshaller implements Unmarshaller<ListMetricsResultV1, StaxUnmarshallerContext> {

	@Override
	public ListMetricsResultV1 unmarshall(StaxUnmarshallerContext context) throws Exception {
		// TODO Auto-generated method stub
		ListMetricsResultV1 result=new ListMetricsResultV1();
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
				if (context.testExpression("Metrics", targetDepth)) {
					result.withMetricInfos(MetricInfoStaxUnmarshaller.getInstance().unmarshall(context));
					continue;
				}
			}else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return result;
                }
            }
		}
	}
	private static ListMetricsResultV1StaxUnmarshaller instance;

	public static ListMetricsResultV1StaxUnmarshaller getInstance() {
		if (instance == null)
			instance = new ListMetricsResultV1StaxUnmarshaller();
		return instance;
	}
}
