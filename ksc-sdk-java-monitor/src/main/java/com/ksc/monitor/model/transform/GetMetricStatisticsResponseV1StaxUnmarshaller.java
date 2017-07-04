package com.ksc.monitor.model.transform;

import javax.xml.stream.events.XMLEvent;

import com.ksc.monitor.model.GetCustomMetricStatisticsResponse;
import com.ksc.monitor.model.Metadata;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

public class GetMetricStatisticsResponseV1StaxUnmarshaller implements Unmarshaller<GetCustomMetricStatisticsResponse, StaxUnmarshallerContext> {

	@Override
	public GetCustomMetricStatisticsResponse unmarshall(StaxUnmarshallerContext context) throws Exception {
		// TODO Auto-generated method stub
		GetCustomMetricStatisticsResponse response=new GetCustomMetricStatisticsResponse();
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
					response.setGetMetricStatisticsResult(GetMetricStatisticsResultV1StaxUnmarshaller.getInstance().unmarshall(context));
					continue;
				}else if (context.testExpression("ResponseMetadata/RequestId", targetDepth)) {
					Metadata metadata=new Metadata();
					metadata.setRequestId(StringStaxUnmarshaller.getInstance().unmarshall(context));
					response.setResponseMetadata(metadata);
					continue;
				}
			}else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return response;
                }
            }
		}
	}
	private static GetMetricStatisticsResponseV1StaxUnmarshaller instance;

	public static GetMetricStatisticsResponseV1StaxUnmarshaller getInstance() {
		if (instance == null)
			instance = new GetMetricStatisticsResponseV1StaxUnmarshaller();
		return instance;
	}
}
