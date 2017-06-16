package com.ksc.network.slb.model.transform;

import com.ksc.network.slb.model.ModifyListenersResult;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import javax.xml.stream.events.XMLEvent;

/**
 * ModifyListenersResult StAX Unmarshaller
 */
public class ModifyListenersResultStaxUnmarshaller implements
		Unmarshaller<ModifyListenersResult, StaxUnmarshallerContext> {

	public ModifyListenersResult unmarshall(StaxUnmarshallerContext context)
			throws Exception {
		ModifyListenersResult ModifyListenersResult = new ModifyListenersResult();
		int originalDepth = context.getCurrentDepth();
		int targetDepth = originalDepth + 1;

		if (context.isStartOfDocument())
			targetDepth += 1;

		while (true) {
			XMLEvent xmlEvent = context.nextEvent();
			if (xmlEvent.isEndDocument())
				return ModifyListenersResult;

			if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

				if (context.testExpression("CreateTime", targetDepth)) {
					ModifyListenersResult.setCreateTime(StringStaxUnmarshaller
							.getInstance().unmarshall(context));
					continue;
				}

				if (context.testExpression("HealthCheck", targetDepth)) {
                    ModifyListenersResult.setHealthCheck(HealthCheckStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ListenerId", targetDepth)) {
                    ModifyListenersResult.setListenerId(StringStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Method", targetDepth)) {
                    ModifyListenersResult.setMethod(StringStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("RealServer", targetDepth)) {
                    ModifyListenersResult.setRealServer(RealServerStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ListenerName", targetDepth)) {
                    ModifyListenersResult.setListenerName(StringStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("LoadBalancerId", targetDepth)) {
                    ModifyListenersResult.setLoadBalancerId(StringStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ListenerProtocol", targetDepth)) {
                    ModifyListenersResult.setListenerProtocol(StringStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ListenerPort", targetDepth)) {
                    ModifyListenersResult.setListenerPort(StringStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Session", targetDepth)) {
                    ModifyListenersResult.setSession(SessionStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ListenerState", targetDepth)) {
                    ModifyListenersResult.setListenerState(StringStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }

                else if(context.testExpression("RequestId", targetDepth)){
					ModifyListenersResult.setRequestId(StringStaxUnmarshaller.getInstance()
							.unmarshall(context));
					continue;
				}

			} else if (xmlEvent.isEndElement()) {
				if (context.getCurrentDepth() < originalDepth) {
					return ModifyListenersResult;
				}
			}
		}
	}

	private static ModifyListenersResultStaxUnmarshaller instance;

	public static ModifyListenersResultStaxUnmarshaller getInstance() {
		if (instance == null)
			instance = new ModifyListenersResultStaxUnmarshaller();
		return instance;
	}
}
