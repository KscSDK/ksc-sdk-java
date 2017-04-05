package com.ksc.network.vpc.transform.NetworkAcl;

import javax.xml.stream.events.XMLEvent;

import com.ksc.network.vpc.model.NetworkAcl.NetworkAclEntry;
import com.ksc.network.vpc.model.SecurityGroups.SecurityGroupRule;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.IntegerStaxUnmarshaller;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;

/**
 * SecurityGroupRule StAX Unmarshaller
 */
public class NetworkAclEntryStaxUnmarshaller implements Unmarshaller<NetworkAclEntry, StaxUnmarshallerContext> {

	public NetworkAclEntry unmarshall(StaxUnmarshallerContext context) throws Exception {
		NetworkAclEntry acl = new NetworkAclEntry();
		int originalDepth = context.getCurrentDepth();
		int targetDepth = originalDepth + 1;

		if (context.isStartOfDocument())
			targetDepth += 1;
		
		while (true) {
			XMLEvent xmlEvent = context.nextEvent();
			if (xmlEvent.isEndDocument())
				return acl;
			if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

				if (context.testExpression("Description", targetDepth)) {
					acl.setDescription(StringStaxUnmarshaller.getInstance().unmarshall(context));
					continue;
				}

				if (context.testExpression("NetworkAclId", targetDepth)) {
					acl.setNetworkAclId(StringStaxUnmarshaller.getInstance().unmarshall(context));
					continue;
				}

				if (context.testExpression("NetworkAclEntryId", targetDepth)) {
					acl.setNetworkAclEntryId(StringStaxUnmarshaller.getInstance().unmarshall(context));
					continue;
				}

				if (context.testExpression("CidrBlock", targetDepth)) {
					acl.setCidrBlock(StringStaxUnmarshaller.getInstance().unmarshall(context));
					continue;
				}

				if (context.testExpression("RuleNumber", targetDepth)) {
					acl.setRuleNumber(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
					continue;
				}
				if (context.testExpression("Direction", targetDepth)) {
					acl.setDirection(StringStaxUnmarshaller.getInstance().unmarshall(context));
					continue;
				}
				if (context.testExpression("RuleAction", targetDepth)) {
					acl.setRuleAction(StringStaxUnmarshaller.getInstance().unmarshall(context));
					continue;
				}
				if (context.testExpression("Protocol", targetDepth)) {
					acl.setProtocol(StringStaxUnmarshaller.getInstance().unmarshall(context));
					continue;
				}

				if (context.testExpression("IcmpType", targetDepth)) {
					acl.setIcmpType(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
					continue;
				}
				if (context.testExpression("IcmpCode", targetDepth)) {
					acl.setIcmpCode(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
					continue;
				}
				if (context.testExpression("PortRangeFrom", targetDepth)) {
					acl.setPortRangeFrom(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
					continue;
				}
				if (context.testExpression("PortRangeTo", targetDepth)) {
					acl.setPortRangeTo(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
					continue;
				}
			} else if (xmlEvent.isEndElement()) {
				if (context.getCurrentDepth() < originalDepth) {
					return acl;
				}
			}
		}
	}

	private static NetworkAclEntryStaxUnmarshaller instance;

	public static NetworkAclEntryStaxUnmarshaller getInstance() {
		if (instance == null)
			instance = new NetworkAclEntryStaxUnmarshaller();
		return instance;
	}
}
