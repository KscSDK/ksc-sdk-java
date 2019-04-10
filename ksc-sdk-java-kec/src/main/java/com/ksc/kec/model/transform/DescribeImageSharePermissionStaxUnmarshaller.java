package com.ksc.kec.model.transform;

import com.ksc.kec.model.DescribeImageSharePermissionResult;
import com.ksc.kec.model.ModifyImageSharePermissionResult;
import com.ksc.transform.SimpleTypeStaxUnmarshallers;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import javax.xml.stream.events.XMLEvent;

/**
 * ModifyImageSharePermissionResult StAX Unmarshaller
 */
public class DescribeImageSharePermissionStaxUnmarshaller implements
		Unmarshaller<DescribeImageSharePermissionResult, StaxUnmarshallerContext> {

	public DescribeImageSharePermissionResult unmarshall(StaxUnmarshallerContext context)
			throws Exception {
		DescribeImageSharePermissionResult describeImageSharePermissionResult = new DescribeImageSharePermissionResult();
		int originalDepth = context.getCurrentDepth();
		int targetDepth = originalDepth + 1;

		if (context.isStartOfDocument())
			targetDepth += 1;

		while (true) {
			XMLEvent xmlEvent = context.nextEvent();
			if (xmlEvent.isEndDocument())
				return describeImageSharePermissionResult;

			if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

				if (context.testExpression("RequestId", targetDepth)) {
					describeImageSharePermissionResult.setRequestId(StringStaxUnmarshaller
							.getInstance().unmarshall(context));
					continue;
				}
				if (context.testExpression("SharePermissionSet/SharePermission", targetDepth)) {
					describeImageSharePermissionResult.addSharePermissionSet(SharePermissionStaxUnmarshaller.getInstance().unmarshall(context));
				}
			} else if (xmlEvent.isEndElement()) {
				if (context.getCurrentDepth() < originalDepth) {
					return describeImageSharePermissionResult;
				}
			}
		}
	}

	private static DescribeImageSharePermissionStaxUnmarshaller instance;

	public static DescribeImageSharePermissionStaxUnmarshaller getInstance() {
		if (instance == null)
			instance = new DescribeImageSharePermissionStaxUnmarshaller();
		return instance;
	}
}
