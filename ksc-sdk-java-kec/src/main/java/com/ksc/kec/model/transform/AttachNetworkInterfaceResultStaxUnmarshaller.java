package com.ksc.kec.model.transform;

import javax.xml.stream.events.XMLEvent;

import com.ksc.kec.model.AttachNetworkInterfaceResult;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.BooleanStaxUnmarshaller;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

public class AttachNetworkInterfaceResultStaxUnmarshaller implements
       Unmarshaller<AttachNetworkInterfaceResult, StaxUnmarshallerContext>{

	public AttachNetworkInterfaceResult unmarshall(StaxUnmarshallerContext context)
			throws Exception {
		AttachNetworkInterfaceResult attachNetworkInterfaceResult = new AttachNetworkInterfaceResult();
		int originalDepth = context.getCurrentDepth();
		int targetDepth = originalDepth + 1;

		if (context.isStartOfDocument())
			targetDepth += 1;

		while (true) {
			XMLEvent xmlEvent = context.nextEvent();
			if (xmlEvent.isEndDocument())
				return attachNetworkInterfaceResult;

			if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {
				// no use reservation
				if (context.testExpression("Return", targetDepth)) {
					attachNetworkInterfaceResult.setReturn(BooleanStaxUnmarshaller
							.getInstance().unmarshall(context));
					continue;
				}

				if (context.testExpression("RequestId", targetDepth)) {
					attachNetworkInterfaceResult.setRequestId(StringStaxUnmarshaller
							.getInstance().unmarshall(context));
					continue;
				}
			} else if (xmlEvent.isEndElement()) {
				if (context.getCurrentDepth() < originalDepth) {
					return attachNetworkInterfaceResult;
				}
			}
		}
	}

	private static AttachNetworkInterfaceResultStaxUnmarshaller instance;

	public static AttachNetworkInterfaceResultStaxUnmarshaller getInstance() {
		if (instance == null)
			instance = new AttachNetworkInterfaceResultStaxUnmarshaller();
		return instance;
	}
}
