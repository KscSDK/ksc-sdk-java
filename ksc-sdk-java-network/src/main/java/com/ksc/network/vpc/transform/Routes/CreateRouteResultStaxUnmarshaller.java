package com.ksc.network.vpc.transform.Routes;

import com.ksc.network.vpc.model.Route.CreateRouteResult;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import javax.xml.stream.events.XMLEvent;

/**
 * CreateRouteResult StAX Unmarshaller
 */
public class CreateRouteResultStaxUnmarshaller implements
		Unmarshaller<CreateRouteResult, StaxUnmarshallerContext> {

	public CreateRouteResult unmarshall(StaxUnmarshallerContext context)
			throws Exception {
		CreateRouteResult CreateRouteResult = new CreateRouteResult();
		int originalDepth = context.getCurrentDepth();
		int targetDepth = originalDepth + 1;

		if (context.isStartOfDocument())
			targetDepth += 1;

		while (true) {
			XMLEvent xmlEvent = context.nextEvent();
			if (xmlEvent.isEndDocument())
				return CreateRouteResult;

			if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

				if (context.testExpression("RouteId", targetDepth)) {
					CreateRouteResult.setRouteId(StringStaxUnmarshaller.getInstance()
							.unmarshall(context));
					continue;
				}else if(context.testExpression("RequestId", targetDepth)){
					CreateRouteResult.setRequestId(StringStaxUnmarshaller.getInstance()
							.unmarshall(context));
					continue;
				}

			} else if (xmlEvent.isEndElement()) {
				if (context.getCurrentDepth() < originalDepth) {
					return CreateRouteResult;
				}
			}
		}
	}

	private static CreateRouteResultStaxUnmarshaller instance;

	public static CreateRouteResultStaxUnmarshaller getInstance() {
		if (instance == null)
			instance = new CreateRouteResultStaxUnmarshaller();
		return instance;
	}
}
