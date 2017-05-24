package com.ksc.kec.model.transform;

import javax.xml.stream.events.XMLEvent;

import com.ksc.kec.model.ModifyInstanceImageResult;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.BooleanStaxUnmarshaller;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

public class ModifyInstanceImageResultStaxUnmarshaller implements
       Unmarshaller<ModifyInstanceImageResult, StaxUnmarshallerContext>{

	public ModifyInstanceImageResult unmarshall(StaxUnmarshallerContext context)
			throws Exception {
		ModifyInstanceImageResult modifyInstanceImageResult = new ModifyInstanceImageResult();
		int originalDepth = context.getCurrentDepth();
		int targetDepth = originalDepth + 1;

		if (context.isStartOfDocument())
			targetDepth += 1;

		while (true) {
			XMLEvent xmlEvent = context.nextEvent();
			if (xmlEvent.isEndDocument())
				return modifyInstanceImageResult;

			if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {
				// no use reservation
				if (context.testExpression("Return", targetDepth)) {
					modifyInstanceImageResult.setReturn(BooleanStaxUnmarshaller
							.getInstance().unmarshall(context));
					continue;
				}

				if (context.testExpression("RequestId", targetDepth)) {
					modifyInstanceImageResult.setRequestId(StringStaxUnmarshaller
							.getInstance().unmarshall(context));
					continue;
				}
			} else if (xmlEvent.isEndElement()) {
				if (context.getCurrentDepth() < originalDepth) {
					return modifyInstanceImageResult;
				}
			}
		}
	}

	private static ModifyInstanceImageResultStaxUnmarshaller instance;

	public static ModifyInstanceImageResultStaxUnmarshaller getInstance() {
		if (instance == null)
			instance = new ModifyInstanceImageResultStaxUnmarshaller();
		return instance;
	}
}
