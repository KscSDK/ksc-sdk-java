package com.ksc.network.slb.model.transform;

import com.ksc.network.slb.model.DeregisterInstancesFromListenerResult;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import javax.xml.stream.events.XMLEvent;

/**
 * DeregisterInstancesFromListenerResult StAX Unmarshaller
 */
public class DeregisterInstancesFromListenerResultStaxUnmarshaller implements
		Unmarshaller<DeregisterInstancesFromListenerResult, StaxUnmarshallerContext> {

	public DeregisterInstancesFromListenerResult unmarshall(StaxUnmarshallerContext context)
			throws Exception {
		DeregisterInstancesFromListenerResult DeregisterInstancesFromListenerResult = new DeregisterInstancesFromListenerResult();
		int originalDepth = context.getCurrentDepth();
		int targetDepth = originalDepth + 1;

		if (context.isStartOfDocument())
			targetDepth += 1;

		while (true) {
			XMLEvent xmlEvent = context.nextEvent();
			if (xmlEvent.isEndDocument())
				return DeregisterInstancesFromListenerResult;

			if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

				if (context.testExpression("Return", targetDepth)) {
					DeregisterInstancesFromListenerResult.setReturn(Boolean.parseBoolean(StringStaxUnmarshaller.getInstance()
							.unmarshall(context)));
					continue;
				}else if(context.testExpression("RequestId", targetDepth)){
					DeregisterInstancesFromListenerResult.setRequestId(StringStaxUnmarshaller.getInstance()
							.unmarshall(context));
					continue;
				}

			} else if (xmlEvent.isEndElement()) {
				if (context.getCurrentDepth() < originalDepth) {
					return DeregisterInstancesFromListenerResult;
				}
			}
		}
	}

	private static DeregisterInstancesFromListenerResultStaxUnmarshaller instance;

	public static DeregisterInstancesFromListenerResultStaxUnmarshaller getInstance() {
		if (instance == null)
			instance = new DeregisterInstancesFromListenerResultStaxUnmarshaller();
		return instance;
	}
}
