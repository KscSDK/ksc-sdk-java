package com.ksc.monitor.model.transform;

import javax.xml.stream.events.XMLEvent;

import com.ksc.monitor.model.ListMetricsResult;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.IntegerStaxUnmarshaller;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

public class ListMetricsResultStaxUnmarshaller implements Unmarshaller<ListMetricsResult, StaxUnmarshallerContext> {

	@Override
	public ListMetricsResult unmarshall(StaxUnmarshallerContext context) throws Exception {
		// TODO Auto-generated method stub
		ListMetricsResult result=new ListMetricsResult();
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
				if (context.testExpression("Metrics/member", targetDepth)) {
					result.withMetrics(MetricStaxUnmarshaller.getInstance().unmarshall(context));
					continue;
				}else if (context.testExpression("PageIndex", targetDepth)) {
					result.setPageIndex(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
					continue;
				}else if (context.testExpression("PageSize", targetDepth)) {
					result.setPageSize(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
					continue;
				}
			}else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return result;
                }
            }
		}
	}
	private static ListMetricsResultStaxUnmarshaller instance;

	public static ListMetricsResultStaxUnmarshaller getInstance() {
		if (instance == null)
			instance = new ListMetricsResultStaxUnmarshaller();
		return instance;
	}
}
