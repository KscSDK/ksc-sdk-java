package com.ksc.network.slb.model.transform;

import com.ksc.network.slb.model.RegisterInstancesWithListenerResult;
import com.ksc.transform.SimpleTypeStaxUnmarshallers;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import javax.xml.stream.events.XMLEvent;

/**
 * RegisterInstancesWithListenerResult StAX Unmarshaller
 */
public class RegisterInstancesWithListenerResultStaxUnmarshaller implements
		Unmarshaller<RegisterInstancesWithListenerResult, StaxUnmarshallerContext> {

	public RegisterInstancesWithListenerResult unmarshall(StaxUnmarshallerContext context)
			throws Exception {
		RegisterInstancesWithListenerResult RegisterInstancesWithListenerResult = new RegisterInstancesWithListenerResult();
		int originalDepth = context.getCurrentDepth();
		int targetDepth = originalDepth + 1;

		if (context.isStartOfDocument())
			targetDepth += 1;

		while (true) {
			XMLEvent xmlEvent = context.nextEvent();
			if (xmlEvent.isEndDocument())
				return RegisterInstancesWithListenerResult;

			if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

				if (context.testExpression("RealServerIp", targetDepth)) {
					RegisterInstancesWithListenerResult.setRealServerIp(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller
							.getInstance().unmarshall(context));
					continue;
				}

				if (context.testExpression("RealServerPort", targetDepth)) {
					RegisterInstancesWithListenerResult.setRealServerPort(SimpleTypeStaxUnmarshallers.IntegerStaxUnmarshaller
							.getInstance().unmarshall(context));
					continue;
				}

                if (context.testExpression("RealServerState", targetDepth)) {
                    RegisterInstancesWithListenerResult.setRealServerState(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("RealServerType", targetDepth)) {
                    RegisterInstancesWithListenerResult.setRealServerType(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("RegisterId", targetDepth)) {
                    RegisterInstancesWithListenerResult.setRegisterId(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ListenerId", targetDepth)) {
                    RegisterInstancesWithListenerResult.setListenerId(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Weight", targetDepth)) {
                    RegisterInstancesWithListenerResult.setWeight(SimpleTypeStaxUnmarshallers.IntegerStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }

				else if(context.testExpression("RequestId", targetDepth)){
					RegisterInstancesWithListenerResult.setRequestId(StringStaxUnmarshaller.getInstance()
							.unmarshall(context));
					continue;
				}

			} else if (xmlEvent.isEndElement()) {
				if (context.getCurrentDepth() < originalDepth) {
					return RegisterInstancesWithListenerResult;
				}
			}
		}
	}

	private static RegisterInstancesWithListenerResultStaxUnmarshaller instance;

	public static RegisterInstancesWithListenerResultStaxUnmarshaller getInstance() {
		if (instance == null)
			instance = new RegisterInstancesWithListenerResultStaxUnmarshaller();
		return instance;
	}
}
