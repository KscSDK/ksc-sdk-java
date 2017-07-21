package com.ksc.kec.model.transform;

import com.ksc.kec.model.ModifyInstanceAttributeResult;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.BooleanStaxUnmarshaller;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import javax.xml.stream.events.XMLEvent;

/**
 * ModifyInstanceAttributeResult StAX Unmarshaller
 */
public class ModifyInstanceAttributeResultStaxUnmarshaller implements
		Unmarshaller<ModifyInstanceAttributeResult, StaxUnmarshallerContext> {

	public ModifyInstanceAttributeResult unmarshall(StaxUnmarshallerContext context)
			throws Exception {
		ModifyInstanceAttributeResult modifyInstanceAttributeResult = new ModifyInstanceAttributeResult();
		int originalDepth = context.getCurrentDepth();
		int targetDepth = originalDepth + 1;

		if (context.isStartOfDocument())
			targetDepth += 1;

		while (true) {
			XMLEvent xmlEvent = context.nextEvent();
			if (xmlEvent.isEndDocument())
				return modifyInstanceAttributeResult;

			if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {
				// no use reservation
				if (context.testExpression("Return", targetDepth)) {
					modifyInstanceAttributeResult.setReturn(BooleanStaxUnmarshaller
							.getInstance().unmarshall(context));
					continue;
				}

				if (context.testExpression("RequestId", targetDepth)) {
					modifyInstanceAttributeResult.setRequestId(StringStaxUnmarshaller
							.getInstance().unmarshall(context));
					continue;
				}
			} else if (xmlEvent.isEndElement()) {
				if (context.getCurrentDepth() < originalDepth) {
					return modifyInstanceAttributeResult;
				}
			}
		}
	}

	private static ModifyInstanceAttributeResultStaxUnmarshaller instance;

	public static ModifyInstanceAttributeResultStaxUnmarshaller getInstance() {
		if (instance == null)
			instance = new ModifyInstanceAttributeResultStaxUnmarshaller();
		return instance;
	}
}
