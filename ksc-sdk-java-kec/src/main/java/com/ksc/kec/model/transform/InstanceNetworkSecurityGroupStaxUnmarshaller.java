package com.ksc.kec.model.transform;

import com.ksc.kec.model.InstanceNetworkSecurityGroup;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import javax.xml.stream.events.XMLEvent;

/**
 * InstanceState StAX Unmarshaller
 */
public class InstanceNetworkSecurityGroupStaxUnmarshaller implements
		Unmarshaller<InstanceNetworkSecurityGroup, StaxUnmarshallerContext> {

	public InstanceNetworkSecurityGroup unmarshall(StaxUnmarshallerContext context)
			throws Exception {
		InstanceNetworkSecurityGroup nsg = new InstanceNetworkSecurityGroup();
		int originalDepth = context.getCurrentDepth();
		int targetDepth = originalDepth + 1;

		if (context.isStartOfDocument())
			targetDepth += 1;

		while (true) {
			XMLEvent xmlEvent = context.nextEvent();
			if (xmlEvent.isEndDocument())
				return nsg;

			if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

				if (context.testExpression("SecurityGroupId", targetDepth)) {
					nsg.setSecurityGroupId(StringStaxUnmarshaller.getInstance()
							.unmarshall(context));
					continue;
				}
			} else if (xmlEvent.isEndElement()) {
				if (context.getCurrentDepth() < originalDepth) {
					return nsg;
				}
			}
		}
	}

	private static InstanceNetworkSecurityGroupStaxUnmarshaller instance;

	public static InstanceNetworkSecurityGroupStaxUnmarshaller getInstance() {
		if (instance == null)
			instance = new InstanceNetworkSecurityGroupStaxUnmarshaller();
		return instance;
	}
}
