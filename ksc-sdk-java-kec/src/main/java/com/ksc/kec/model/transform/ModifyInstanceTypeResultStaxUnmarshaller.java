package com.ksc.kec.model.transform;

import javax.xml.stream.events.XMLEvent;

import com.ksc.kec.model.ModifyInstanceTypeResult;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.BooleanStaxUnmarshaller;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

public class ModifyInstanceTypeResultStaxUnmarshaller implements
       Unmarshaller<ModifyInstanceTypeResult, StaxUnmarshallerContext>{

	public ModifyInstanceTypeResult unmarshall(StaxUnmarshallerContext context)
			throws Exception {
		ModifyInstanceTypeResult modifyInstanceTypeResult = new ModifyInstanceTypeResult();
		int originalDepth = context.getCurrentDepth();
		int targetDepth = originalDepth + 1;

		if (context.isStartOfDocument())
			targetDepth += 1;

		while (true) {
			XMLEvent xmlEvent = context.nextEvent();
			if (xmlEvent.isEndDocument())
				return modifyInstanceTypeResult;

			if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {
				// no use reservation
				if (context.testExpression("Return", targetDepth)) {
					modifyInstanceTypeResult.setReturn(BooleanStaxUnmarshaller
							.getInstance().unmarshall(context));
					continue;
				}

				if (context.testExpression("RequestId", targetDepth)) {
					modifyInstanceTypeResult.setRequestId(StringStaxUnmarshaller
							.getInstance().unmarshall(context));
					continue;
				}
			} else if (xmlEvent.isEndElement()) {
				if (context.getCurrentDepth() < originalDepth) {
					return modifyInstanceTypeResult;
				}
			}
		}
	}

	private static ModifyInstanceTypeResultStaxUnmarshaller instance;

	public static ModifyInstanceTypeResultStaxUnmarshaller getInstance() {
		if (instance == null)
			instance = new ModifyInstanceTypeResultStaxUnmarshaller();
		return instance;
	}
}
