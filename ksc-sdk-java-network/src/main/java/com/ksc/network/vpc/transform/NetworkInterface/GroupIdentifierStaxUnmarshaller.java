package com.ksc.network.vpc.transform.NetworkInterface;

import com.ksc.network.vpc.model.NetworkInterface.GroupIdentifier;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import javax.xml.stream.events.XMLEvent;

/**
 * GroupIdentifier StAX Unmarshaller
 */
public class GroupIdentifierStaxUnmarshaller implements Unmarshaller<GroupIdentifier, StaxUnmarshallerContext> {

	public GroupIdentifier unmarshall(StaxUnmarshallerContext context) throws Exception {
		GroupIdentifier group = new GroupIdentifier();
		int originalDepth = context.getCurrentDepth();
		int targetDepth = originalDepth + 1;

		if (context.isStartOfDocument())
			targetDepth += 1;
		
		while (true) {
			XMLEvent xmlEvent = context.nextEvent();
			if (xmlEvent.isEndDocument())
				return group;
			if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

				if (context.testExpression("SecurityGroupId", targetDepth)) {
					group.setSecurityGroupId(StringStaxUnmarshaller.getInstance().unmarshall(context));
					continue;
				}

				if (context.testExpression("SecurityGroupName", targetDepth)) {
					group.setSecurityGroupName(StringStaxUnmarshaller.getInstance().unmarshall(context));
					continue;
				}

			} else if (xmlEvent.isEndElement()) {
				if (context.getCurrentDepth() < originalDepth) {
					return group;
				}
			}
		}
	}

	private static GroupIdentifierStaxUnmarshaller instance;

	public static GroupIdentifierStaxUnmarshaller getInstance() {
		if (instance == null)
			instance = new GroupIdentifierStaxUnmarshaller();
		return instance;
	}
}
