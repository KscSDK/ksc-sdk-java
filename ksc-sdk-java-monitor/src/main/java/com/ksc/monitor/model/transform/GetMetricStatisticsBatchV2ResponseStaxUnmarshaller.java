package com.ksc.monitor.model.transform;

import javax.xml.stream.events.XMLEvent;

import com.ksc.monitor.model.GetMetricStatisticsBatchV2Response;
import com.ksc.monitor.model.Metadata;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

public class GetMetricStatisticsBatchV2ResponseStaxUnmarshaller
		implements Unmarshaller<GetMetricStatisticsBatchV2Response, StaxUnmarshallerContext> {

	@Override
	public GetMetricStatisticsBatchV2Response unmarshall(StaxUnmarshallerContext context) throws Exception {
		// TODO Auto-generated method stub
		GetMetricStatisticsBatchV2Response response = new GetMetricStatisticsBatchV2Response();
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
				if (context.testExpression("GetMetricStatisticsBatchResults/GetMetricStatisticsBatchResult", targetDepth)) {
					response.withGetMetricStatisticsBatchResults(GetMetricStatisticsBatchResultStaxUnmarshaller.getInstance().unmarshall(context));
					continue;
				} else if (context.testExpression("ResponseMetadata/RequestId", targetDepth)) {
					Metadata metadata = new Metadata();
					metadata.setRequestId(StringStaxUnmarshaller.getInstance().unmarshall(context));
					response.setResponseMetadata(metadata);
					continue;
				} else if (context.testExpression("ErrorMessages/ErrorMessage", targetDepth)) {
					response.withErrorMessages((StringStaxUnmarshaller.getInstance().unmarshall(context)));
					continue;
				} 
			} else if (xmlEvent.isEndElement()) {
				if (context.getCurrentDepth() < originalDepth) {
					return response;
				}
			}
		}
	}
}
