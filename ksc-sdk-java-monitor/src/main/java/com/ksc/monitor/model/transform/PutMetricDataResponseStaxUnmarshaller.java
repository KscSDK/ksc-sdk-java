package com.ksc.monitor.model.transform;

import javax.xml.stream.events.XMLEvent;
import com.ksc.monitor.model.Metadata;
import com.ksc.monitor.model.PutMetricDataResponse;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

public class PutMetricDataResponseStaxUnmarshaller implements Unmarshaller<PutMetricDataResponse, StaxUnmarshallerContext> {

	@Override
	public PutMetricDataResponse unmarshall(StaxUnmarshallerContext context) throws Exception {
		// TODO Auto-generated method stub
		PutMetricDataResponse response=new PutMetricDataResponse();
		// TODO Auto-generated method stub
		int originalDepth = context.getCurrentDepth();
		int targetDepth = originalDepth + 1;

		if (context.isStartOfDocument())
			targetDepth += 1;
		while (true) {
			XMLEvent xmlEvent = context.nextEvent();
			if (xmlEvent.isEndDocument())
				return response;
			if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {
				if (context.testExpression("GetMetricStatisticsResult", targetDepth)) {
					response.setMessage(StringStaxUnmarshaller.getInstance().unmarshall(context));
					continue;
				}else if (context.testExpression("ResponseMetadata/RequestId", targetDepth)) {
					Metadata metadata=new Metadata();
					metadata.setRequestId(StringStaxUnmarshaller.getInstance().unmarshall(context));
					response.setResponseMetadata(metadata);
					continue;
				}else if (context.testExpression("Message", targetDepth)) {
					
					response.setMessage(StringStaxUnmarshaller.getInstance().unmarshall(context));
					continue;
				}
			}else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return response;
                }
            }
		}
	}
	private static GetMetricStatisticsResponseStaxUnmarshaller instance;

	public static GetMetricStatisticsResponseStaxUnmarshaller getInstance() {
		if (instance == null)
			instance = new GetMetricStatisticsResponseStaxUnmarshaller();
		return instance;
	}
}
