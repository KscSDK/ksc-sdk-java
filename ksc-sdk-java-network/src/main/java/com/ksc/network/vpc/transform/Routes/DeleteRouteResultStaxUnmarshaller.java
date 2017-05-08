package com.ksc.network.vpc.transform.Routes;

import com.ksc.network.vpc.model.Route.DeleteRouteResult;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import javax.xml.stream.events.XMLEvent;

/**
 * DeleteRouteResult StAX Unmarshaller
 */
public class DeleteRouteResultStaxUnmarshaller implements
		Unmarshaller<DeleteRouteResult, StaxUnmarshallerContext> {


	public DeleteRouteResult unmarshall(StaxUnmarshallerContext context)
			throws Exception {
		DeleteRouteResult DeleteRouteResult = new DeleteRouteResult();
		int originalDepth = context.getCurrentDepth();
		int targetDepth = originalDepth + 1;

		if (context.isStartOfDocument())
			targetDepth += 1;

		while (true) {
			XMLEvent xmlEvent = context.nextEvent();
			if (xmlEvent.isEndDocument())
				return DeleteRouteResult;

			if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

				if (context.testExpression("Return", targetDepth)) {
					DeleteRouteResult.setReturn(Boolean.parseBoolean(StringStaxUnmarshaller.getInstance()
							.unmarshall(context)));
					continue;
				}else if(context.testExpression("RequestId", targetDepth)){
					DeleteRouteResult.setRequestId(StringStaxUnmarshaller.getInstance()
							.unmarshall(context));
					continue;
				}

			} else if (xmlEvent.isEndElement()) {
				if (context.getCurrentDepth() < originalDepth) {
					return DeleteRouteResult;
				}
			}
		}
	}

	private static DeleteRouteResultStaxUnmarshaller instance;

	public static DeleteRouteResultStaxUnmarshaller getInstance() {
		if (instance == null)
			instance = new DeleteRouteResultStaxUnmarshaller();
		return instance;
	}
}
