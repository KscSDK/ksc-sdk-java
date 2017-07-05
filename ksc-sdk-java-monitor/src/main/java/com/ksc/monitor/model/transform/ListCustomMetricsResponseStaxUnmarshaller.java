package com.ksc.monitor.model.transform;

import com.ksc.monitor.model.ListCustomMetricsResponse;
import com.ksc.monitor.model.Metadata;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import javax.xml.stream.events.XMLEvent;

public class ListCustomMetricsResponseStaxUnmarshaller implements Unmarshaller<ListCustomMetricsResponse, StaxUnmarshallerContext> {

	@Override
	public ListCustomMetricsResponse unmarshall(StaxUnmarshallerContext context) throws Exception {
		// TODO Auto-generated method stub
		ListCustomMetricsResponse response=new ListCustomMetricsResponse();
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
				if (context.testExpression("ListMetricsResult/Metrics", targetDepth)) {
					response.setListMetricsResult(ListCustomMetricsResultStaxUnmarshaller.getInstance().unmarshall(context));
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
	private static ListMetricsResponseStaxUnmarshaller instance;

	public static ListMetricsResponseStaxUnmarshaller getInstance() {
		if (instance == null)
			instance = new ListMetricsResponseStaxUnmarshaller();
		return instance;
	}
}
