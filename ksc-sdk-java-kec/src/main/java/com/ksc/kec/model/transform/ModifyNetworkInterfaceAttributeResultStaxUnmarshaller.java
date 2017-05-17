package com.ksc.kec.model.transform;

import javax.xml.stream.events.XMLEvent;

import com.ksc.kec.model.ModifyNetworkInterfaceAttributeResult;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.BooleanStaxUnmarshaller;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

public class ModifyNetworkInterfaceAttributeResultStaxUnmarshaller implements
       Unmarshaller<ModifyNetworkInterfaceAttributeResult, StaxUnmarshallerContext>{

	public ModifyNetworkInterfaceAttributeResult unmarshall(StaxUnmarshallerContext context)
			throws Exception {
		ModifyNetworkInterfaceAttributeResult modifyNetworkInterfaceAttributeResult = new ModifyNetworkInterfaceAttributeResult();
		int originalDepth = context.getCurrentDepth();
		int targetDepth = originalDepth + 1;

		if (context.isStartOfDocument())
			targetDepth += 1;

		while (true) {
			XMLEvent xmlEvent = context.nextEvent();
			if (xmlEvent.isEndDocument())
				return modifyNetworkInterfaceAttributeResult;

			if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {
				// no use reservation
				if (context.testExpression("Return", targetDepth)) {
					modifyNetworkInterfaceAttributeResult.setReturn(BooleanStaxUnmarshaller
							.getInstance().unmarshall(context));
					continue;
				}

				if (context.testExpression("RequestId", targetDepth)) {
					modifyNetworkInterfaceAttributeResult.setRequestId(StringStaxUnmarshaller
							.getInstance().unmarshall(context));
					continue;
				}
			} else if (xmlEvent.isEndElement()) {
				if (context.getCurrentDepth() < originalDepth) {
					return modifyNetworkInterfaceAttributeResult;
				}
			}
		}
	}

	private static ModifyNetworkInterfaceAttributeResultStaxUnmarshaller instance;

	public static ModifyNetworkInterfaceAttributeResultStaxUnmarshaller getInstance() {
		if (instance == null)
			instance = new ModifyNetworkInterfaceAttributeResultStaxUnmarshaller();
		return instance;
	}
}
