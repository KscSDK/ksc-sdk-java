package com.ksc.kec.model.transform;

import javax.xml.stream.events.XMLEvent;

import com.ksc.kec.model.ModifyImageAttributeResult;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.BooleanStaxUnmarshaller;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

public class ModifyImageAttributeResultStaxUnmarshaller implements
             Unmarshaller<ModifyImageAttributeResult, StaxUnmarshallerContext> {

	@Override
	public ModifyImageAttributeResult unmarshall(StaxUnmarshallerContext context) throws Exception {
		ModifyImageAttributeResult modifyImageAttributeResult = new ModifyImageAttributeResult();
		int originalDepth = context.getCurrentDepth();
		int targetDepth = originalDepth + 1;

		if (context.isStartOfDocument())
			targetDepth += 1;

		while (true) {
			XMLEvent xmlEvent = context.nextEvent();
			if (xmlEvent.isEndDocument())
				return modifyImageAttributeResult;

			if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {
				// no use reservation
				if (context.testExpression("Return", targetDepth)) {
					modifyImageAttributeResult.setReturn(BooleanStaxUnmarshaller
							.getInstance().unmarshall(context));
					continue;
				}

				if (context.testExpression("RequestId", targetDepth)) {
					modifyImageAttributeResult.setRequestId(StringStaxUnmarshaller
							.getInstance().unmarshall(context));
					continue;
				}
			} else if (xmlEvent.isEndElement()) {
				if (context.getCurrentDepth() < originalDepth) {
					return modifyImageAttributeResult;
				}
			}
		}
	}

	private static ModifyImageAttributeResultStaxUnmarshaller instance;

	public static ModifyImageAttributeResultStaxUnmarshaller getInstance() {
		if (instance == null)
			instance = new ModifyImageAttributeResultStaxUnmarshaller();
		return instance;
	}
}
