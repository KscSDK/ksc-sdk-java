package com.ksc.network.vpc.transform;

import javax.xml.stream.events.XMLEvent;

import com.ksc.network.vpc.model.SecurityGroupRule;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.IntegerStaxUnmarshaller;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

/**
 * SecurityGroupRule StAX Unmarshaller
 */
public class SecurityGroupRuleStaxUnmarshaller implements Unmarshaller<SecurityGroupRule, StaxUnmarshallerContext> {

	public SecurityGroupRule unmarshall(StaxUnmarshallerContext context) throws Exception {
		SecurityGroupRule rule = new SecurityGroupRule();
		int originalDepth = context.getCurrentDepth();
		int targetDepth = originalDepth + 1;

		if (context.isStartOfDocument())
			targetDepth += 1;
		
		while (true) {
			XMLEvent xmlEvent = context.nextEvent();
			if (xmlEvent.isEndDocument())
				return rule;
			if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

				if (context.testExpression("SecurityGroupEntryId", targetDepth)) {
					rule.setSecurityGroupEntryId(StringStaxUnmarshaller.getInstance().unmarshall(context));
					continue;
				}

				if (context.testExpression("Direction", targetDepth)) {
					rule.setDirection(StringStaxUnmarshaller.getInstance().unmarshall(context));
					continue;
				}

				if (context.testExpression("CidrBlock", targetDepth)) {
					rule.setCidrBlock(StringStaxUnmarshaller.getInstance().unmarshall(context));
					continue;
				}

				if (context.testExpression("Protocol", targetDepth)) {
					rule.setProtocol(StringStaxUnmarshaller.getInstance().unmarshall(context));
					continue;
				}

				if (context.testExpression("IcmpType", targetDepth)) {
					rule.setIcmpType(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
					continue;
				}
				if (context.testExpression("IcmpCode", targetDepth)) {
					rule.setIcmpCode(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
					continue;
				}
				if (context.testExpression("PortRangeFrom", targetDepth)) {
					rule.setPortRangeFrom(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
					continue;
				}
				if (context.testExpression("PortRangeTo", targetDepth)) {
					rule.setPortRangeTo(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
					continue;
				}
			} else if (xmlEvent.isEndElement()) {
				if (context.getCurrentDepth() < originalDepth) {
					return rule;
				}
			}
		}
	}

	private static SecurityGroupRuleStaxUnmarshaller instance;

	public static SecurityGroupRuleStaxUnmarshaller getInstance() {
		if (instance == null)
			instance = new SecurityGroupRuleStaxUnmarshaller();
		return instance;
	}
}
