package com.ksc.network.slb.model.transform;

import com.ksc.network.slb.model.DeleteHealthCheckResult;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import javax.xml.stream.events.XMLEvent;

/**
 * DeleteHealthCheckResult StAX Unmarshaller
 */
public class DeleteHealthCheckResultStaxUnmarshaller implements
		Unmarshaller<DeleteHealthCheckResult, StaxUnmarshallerContext> {

	public DeleteHealthCheckResult unmarshall(StaxUnmarshallerContext context)
			throws Exception {
		DeleteHealthCheckResult DeleteHealthCheckResult = new DeleteHealthCheckResult();
		int originalDepth = context.getCurrentDepth();
		int targetDepth = originalDepth + 1;

		if (context.isStartOfDocument())
			targetDepth += 1;

		while (true) {
			XMLEvent xmlEvent = context.nextEvent();
			if (xmlEvent.isEndDocument())
				return DeleteHealthCheckResult;

			if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

				if (context.testExpression("Return", targetDepth)) {
					DeleteHealthCheckResult.setReturn(Boolean.parseBoolean(StringStaxUnmarshaller.getInstance()
							.unmarshall(context)));
					continue;
				}else if(context.testExpression("RequestId", targetDepth)){
					DeleteHealthCheckResult.setRequestId(StringStaxUnmarshaller.getInstance()
							.unmarshall(context));
					continue;
				}

			} else if (xmlEvent.isEndElement()) {
				if (context.getCurrentDepth() < originalDepth) {
					return DeleteHealthCheckResult;
				}
			}
		}
	}

	private static DeleteHealthCheckResultStaxUnmarshaller instance;

	public static DeleteHealthCheckResultStaxUnmarshaller getInstance() {
		if (instance == null)
			instance = new DeleteHealthCheckResultStaxUnmarshaller();
		return instance;
	}
}
