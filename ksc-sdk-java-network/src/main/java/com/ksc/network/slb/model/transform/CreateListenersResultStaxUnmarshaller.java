package com.ksc.network.slb.model.transform;

import com.ksc.network.slb.model.CreateListenersResult;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import javax.xml.stream.events.XMLEvent;

/**
 * CreateListenersResult StAX Unmarshaller
 */
public class CreateListenersResultStaxUnmarshaller implements
		Unmarshaller<CreateListenersResult, StaxUnmarshallerContext> {

	public CreateListenersResult unmarshall(StaxUnmarshallerContext context)
			throws Exception {
		CreateListenersResult CreateListenersResult = new CreateListenersResult();
		int originalDepth = context.getCurrentDepth();
		int targetDepth = originalDepth + 1;

		if (context.isStartOfDocument())
			targetDepth += 1;

		while (true) {
			XMLEvent xmlEvent = context.nextEvent();
			if (xmlEvent.isEndDocument())
				return CreateListenersResult;

			if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

				if (context.testExpression("CreateTime", targetDepth)) {
					CreateListenersResult.setCreateTime(StringStaxUnmarshaller
							.getInstance().unmarshall(context));
					continue;
                }

                if (context.testExpression("ListenerId", targetDepth)) {
                    CreateListenersResult.setListenerId(StringStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Method", targetDepth)) {
                    CreateListenersResult.setMethod(StringStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ListenerName", targetDepth)) {
                    CreateListenersResult.setListenerName(StringStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("LoadBalancerId", targetDepth)) {
                    CreateListenersResult.setLoadBalancerId(StringStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ListenerProtocol", targetDepth)) {
                    CreateListenersResult.setListenerProtocol(StringStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ListenerPort", targetDepth)) {
                    CreateListenersResult.setListenerPort(StringStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Session", targetDepth)) {
                    CreateListenersResult.setSession(SessionStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ListenerState", targetDepth)) {
                    CreateListenersResult.setListenerState(StringStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }


				else if(context.testExpression("RequestId", targetDepth)){
					CreateListenersResult.setRequestId(StringStaxUnmarshaller.getInstance()
							.unmarshall(context));
					continue;
				}

			} else if (xmlEvent.isEndElement()) {
				if (context.getCurrentDepth() < originalDepth) {
					return CreateListenersResult;
				}
			}
		}
	}

	private static CreateListenersResultStaxUnmarshaller instance;

	public static CreateListenersResultStaxUnmarshaller getInstance() {
		if (instance == null)
			instance = new CreateListenersResultStaxUnmarshaller();
		return instance;
	}
}
