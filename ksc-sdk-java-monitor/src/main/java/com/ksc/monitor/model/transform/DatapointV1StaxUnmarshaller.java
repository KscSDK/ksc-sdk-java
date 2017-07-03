package com.ksc.monitor.model.transform;

import javax.xml.stream.events.XMLEvent;

import com.ksc.monitor.model.DatapointV1;
import com.ksc.monitor.model.GetMetricStatisticsResultV1;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

public class DatapointV1StaxUnmarshaller implements Unmarshaller<DatapointV1, StaxUnmarshallerContext> {

	@Override
	public DatapointV1 unmarshall(StaxUnmarshallerContext context) throws Exception {
		// TODO Auto-generated method stub
		DatapointV1 result=new DatapointV1();
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
					result.withMembers(TsvStaxUnmarshaller.getInstance().unmarshall(context));				
					continue;
				}
			}else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return result;
                }
            }
		}
	}
	private static DatapointV1StaxUnmarshaller instance;

	public static DatapointV1StaxUnmarshaller getInstance() {
		if (instance == null)
			instance = new DatapointV1StaxUnmarshaller();
		return instance;
	}
}
