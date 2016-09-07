package com.ksc.kec.model.transform;

import javax.xml.stream.events.XMLEvent;

import com.ksc.kec.model.InstanceSecurityGroup;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

/**
 * InstanceState StAX Unmarshaller
 */
public class InstanceSecurityGroupStaxUnmarshaller implements
		Unmarshaller<InstanceSecurityGroup, StaxUnmarshallerContext> {

	public InstanceSecurityGroup unmarshall(StaxUnmarshallerContext context)
			throws Exception {
		InstanceSecurityGroup sg = new InstanceSecurityGroup();
		int originalDepth = context.getCurrentDepth();
		int targetDepth = originalDepth + 1;

		if (context.isStartOfDocument())
			targetDepth += 1;

		while (true) {
			XMLEvent xmlEvent = context.nextEvent();
			if (xmlEvent.isEndDocument())
				return sg;

			if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

				if (context.testExpression("GroupId", targetDepth)) {
					sg.setGroupId(StringStaxUnmarshaller.getInstance()
							.unmarshall(context));
					continue;
				}
			} else if (xmlEvent.isEndElement()) {
				if (context.getCurrentDepth() < originalDepth) {
					return sg;
				}
			}
		}
	}

	private static InstanceSecurityGroupStaxUnmarshaller instance;

	public static InstanceSecurityGroupStaxUnmarshaller getInstance() {
		if (instance == null)
			instance = new InstanceSecurityGroupStaxUnmarshaller();
		return instance;
	}
}
