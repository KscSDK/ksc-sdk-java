package com.ksc.kec.model.transform;

import com.ksc.kec.model.ImageCopyResult;
import com.ksc.kec.model.ModifyImageSharePermissionResult;
import com.ksc.transform.SimpleTypeStaxUnmarshallers;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import javax.xml.stream.events.XMLEvent;

/**
 * ModifyImageSharePermissionResult StAX Unmarshaller
 */
public class ModifyImageSharePermissionStaxUnmarshaller implements
		Unmarshaller<ModifyImageSharePermissionResult, StaxUnmarshallerContext> {

	public ModifyImageSharePermissionResult unmarshall(StaxUnmarshallerContext context)
			throws Exception {
        ModifyImageSharePermissionResult modifyImageSharePermissionResult = new ModifyImageSharePermissionResult();
		int originalDepth = context.getCurrentDepth();
		int targetDepth = originalDepth + 1;

		if (context.isStartOfDocument())
			targetDepth += 1;

		while (true) {
			XMLEvent xmlEvent = context.nextEvent();
			if (xmlEvent.isEndDocument())
				return modifyImageSharePermissionResult;

			if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

				if (context.testExpression("RequestId", targetDepth)) {
                    modifyImageSharePermissionResult.setRequestId(StringStaxUnmarshaller
							.getInstance().unmarshall(context));
					continue;
				}
				if (context.testExpression("Return", targetDepth)) {
                    modifyImageSharePermissionResult.setReturn(SimpleTypeStaxUnmarshallers.BooleanStaxUnmarshaller
							.getInstance().unmarshall(context));
					continue;
				}
				if (context.testExpression("Message", targetDepth)) {
                    modifyImageSharePermissionResult.setMessage(StringStaxUnmarshaller
							.getInstance().unmarshall(context));
					continue;
				}
			} else if (xmlEvent.isEndElement()) {
				if (context.getCurrentDepth() < originalDepth) {
					return modifyImageSharePermissionResult;
				}
			}
		}
	}

	private static ModifyImageSharePermissionStaxUnmarshaller instance;

	public static ModifyImageSharePermissionStaxUnmarshaller getInstance() {
		if (instance == null)
			instance = new ModifyImageSharePermissionStaxUnmarshaller();
		return instance;
	}
}
