package com.ksc.monitor.model.transform;
import javax.xml.stream.events.XMLEvent;

import com.ksc.monitor.model.ListCustomMetricsResult;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

public class ListCustomMetricsResultStaxUnmarshaller implements Unmarshaller<ListCustomMetricsResult, StaxUnmarshallerContext> {

	@Override
	public ListCustomMetricsResult unmarshall(StaxUnmarshallerContext context) throws Exception {
		// TODO Auto-generated method stub
		ListCustomMetricsResult result=new ListCustomMetricsResult();
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
				if (context.testExpression("member", targetDepth)) {
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
	private static ListCustomMetricsResultStaxUnmarshaller instance;

	public static ListCustomMetricsResultStaxUnmarshaller getInstance() {
		if (instance == null)
			instance = new ListCustomMetricsResultStaxUnmarshaller();
		return instance;
	}
}
