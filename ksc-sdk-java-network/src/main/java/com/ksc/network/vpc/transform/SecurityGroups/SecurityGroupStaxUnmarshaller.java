package com.ksc.network.vpc.transform.SecurityGroups;

import javax.xml.stream.events.XMLEvent;

import com.ksc.network.vpc.model.SecurityGroups.SecurityGroup;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

/**
 * SecurityGroup StAX Unmarshaller
 */
public class SecurityGroupStaxUnmarshaller implements Unmarshaller<SecurityGroup, StaxUnmarshallerContext> {

	public SecurityGroup unmarshall(StaxUnmarshallerContext context) throws Exception {
		SecurityGroup rule = new SecurityGroup();
		int originalDepth = context.getCurrentDepth();
		int targetDepth = originalDepth + 1;

		if (context.isStartOfDocument())
			targetDepth += 1;
		
		while (true) {
			XMLEvent xmlEvent = context.nextEvent();
			if (xmlEvent.isEndDocument())
				return rule;
			if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

				if (context.testExpression("CreateTime", targetDepth)) {
					rule.setCreateTime(StringStaxUnmarshaller.getInstance().unmarshall(context));
					continue;
				}
				


				if (context.testExpression("VpcId", targetDepth)) {
					rule.setVpcId(StringStaxUnmarshaller.getInstance().unmarshall(context));
					continue;
				}

				if (context.testExpression("SecurityGroupName", targetDepth)) {
					rule.setSecurityGroupName(StringStaxUnmarshaller.getInstance().unmarshall(context));
					continue;
				}

				if (context.testExpression("SecurityGroupId", targetDepth)) {
					rule.setSecurityGroupId(StringStaxUnmarshaller.getInstance().unmarshall(context));
					continue;
				}

				if (context.testExpression("SecurityGroupType", targetDepth)) {
					rule.setSecurityGroupType(StringStaxUnmarshaller.getInstance().unmarshall(context));
					continue;
				}
				if (context.testExpression("SecurityGroupEntrySet/item", targetDepth)) {
					rule.addSecurityGroupEntrySet(SecurityGroupRuleStaxUnmarshaller.getInstance().unmarshall(context));
					continue;
				}
			} else if (xmlEvent.isEndElement()) {
				if (context.getCurrentDepth() < originalDepth) {
					return rule;
				}
			}
		}
	}

	private static SecurityGroupStaxUnmarshaller instance;

	public static SecurityGroupStaxUnmarshaller getInstance() {
		if (instance == null)
			instance = new SecurityGroupStaxUnmarshaller();
		return instance;
	}
}
