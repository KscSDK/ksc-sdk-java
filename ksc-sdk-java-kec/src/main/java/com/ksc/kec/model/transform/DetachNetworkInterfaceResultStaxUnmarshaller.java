package com.ksc.kec.model.transform;

import javax.xml.stream.events.XMLEvent;

import com.ksc.kec.model.DetachNetworkInterfaceResult;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.BooleanStaxUnmarshaller;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

public class DetachNetworkInterfaceResultStaxUnmarshaller implements
       Unmarshaller<DetachNetworkInterfaceResult, StaxUnmarshallerContext>{

	public DetachNetworkInterfaceResult unmarshall(StaxUnmarshallerContext context)
			throws Exception {
		DetachNetworkInterfaceResult detachNetworkInterfaceResult = new DetachNetworkInterfaceResult();
		int originalDepth = context.getCurrentDepth();
		int targetDepth = originalDepth + 1;

		if (context.isStartOfDocument())
			targetDepth += 1;

		while (true) {
			XMLEvent xmlEvent = context.nextEvent();
			if (xmlEvent.isEndDocument())
				return detachNetworkInterfaceResult;

			if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {
				// no use reservation
				if (context.testExpression("Return", targetDepth)) {
					detachNetworkInterfaceResult.setReturn(BooleanStaxUnmarshaller
							.getInstance().unmarshall(context));
					continue;
				}

				if (context.testExpression("RequestId", targetDepth)) {
					detachNetworkInterfaceResult.setRequestId(StringStaxUnmarshaller
							.getInstance().unmarshall(context));
					continue;
				}
			} else if (xmlEvent.isEndElement()) {
				if (context.getCurrentDepth() < originalDepth) {
					return detachNetworkInterfaceResult;
				}
			}
		}
	}

	private static DetachNetworkInterfaceResultStaxUnmarshaller instance;

	public static DetachNetworkInterfaceResultStaxUnmarshaller getInstance() {
		if (instance == null)
			instance = new DetachNetworkInterfaceResultStaxUnmarshaller();
		return instance;
	}
}
