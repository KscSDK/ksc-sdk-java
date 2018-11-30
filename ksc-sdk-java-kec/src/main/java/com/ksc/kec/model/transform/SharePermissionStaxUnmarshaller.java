package com.ksc.kec.model.transform;

import com.ksc.kec.model.SharePermission;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import javax.xml.stream.events.XMLEvent;

/**
 * ModifyImageSharePermissionResult StAX Unmarshaller
 */
public class SharePermissionStaxUnmarshaller implements
		Unmarshaller<SharePermission, StaxUnmarshallerContext> {

	public SharePermission unmarshall(StaxUnmarshallerContext context)
			throws Exception {
		SharePermission sharePermission = new SharePermission();
		int originalDepth = context.getCurrentDepth();
		int targetDepth = originalDepth + 1;

		if (context.isStartOfDocument())
			targetDepth += 1;

		while (true) {
			XMLEvent xmlEvent = context.nextEvent();
			if (xmlEvent.isEndDocument())
				return sharePermission;

			if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

				if (context.testExpression("AccountId", targetDepth)) {
					sharePermission.setAccountId(StringStaxUnmarshaller
							.getInstance().unmarshall(context));
					continue;
				}
			} else if (xmlEvent.isEndElement()) {
				if (context.getCurrentDepth() < originalDepth) {
					return sharePermission;
				}
			}
		}
	}

	private static SharePermissionStaxUnmarshaller instance;

	public static SharePermissionStaxUnmarshaller getInstance() {
		if (instance == null)
			instance = new SharePermissionStaxUnmarshaller();
		return instance;
	}
}
