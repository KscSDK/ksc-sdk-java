package com.ksc.monitor.model.transform;

import javax.xml.stream.events.XMLEvent;
import com.ksc.monitor.model.MetricInfo;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

public class MetricInfoStaxUnmarshaller implements Unmarshaller<MetricInfo, StaxUnmarshallerContext> {

	@Override
	public MetricInfo unmarshall(StaxUnmarshallerContext context) throws Exception {
		// TODO Auto-generated method stub
		MetricInfo result=new MetricInfo();
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
				 if (context.testExpression("Namespace", targetDepth)) {
					result.setNamespace(StringStaxUnmarshaller.getInstance().unmarshall(context));
					continue;
				}else if (context.testExpression("MetricName", targetDepth)) {
					result.setMetricName(StringStaxUnmarshaller.getInstance().unmarshall(context));
					continue;
				}else if (context.testExpression("Dimensions/Member", targetDepth)) {
					result.withDimensions(StringStaxUnmarshaller.getInstance().unmarshall(context));
					continue;
				}
			}else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return result;
                }
            }
		}
	}
	private static MetricInfoStaxUnmarshaller instance;

	public static MetricInfoStaxUnmarshaller getInstance() {
		if (instance == null)
			instance = new MetricInfoStaxUnmarshaller();
		return instance;
	}
}
