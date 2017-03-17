package com.ksc.network.vpc.transform.SecurityGroups;

import javax.xml.stream.events.XMLEvent;

import com.ksc.network.vpc.model.SecurityGroups.DescribeSecurityGroupsResult;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

/**
 * DescribeSecurityGroupsResult StAX Unmarshaller
 */
public class DescribeSecurityGroupsResultStaxUnmarshaller
		implements Unmarshaller<DescribeSecurityGroupsResult, StaxUnmarshallerContext> {

	public DescribeSecurityGroupsResult unmarshall(StaxUnmarshallerContext context) throws Exception {
		DescribeSecurityGroupsResult describeSecurityGroupsResult = new DescribeSecurityGroupsResult();
		int originalDepth = context.getCurrentDepth();
		int targetDepth = originalDepth + 1;

		if (context.isStartOfDocument())
			targetDepth += 1;

		while (true) {
			XMLEvent xmlEvent = context.nextEvent();
			if (xmlEvent.isEndDocument())
				return describeSecurityGroupsResult;

			if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

				if (context.testExpression("SecurityGroupSet/item", targetDepth)) {
					describeSecurityGroupsResult
							.withSecurityGroups(SecurityGroupStaxUnmarshaller.getInstance().unmarshall(context));
					continue;
				} else if (context.testExpression("RequestId", targetDepth)) {
					describeSecurityGroupsResult.setRequestId(StringStaxUnmarshaller.getInstance().unmarshall(context));
					continue;
				}

			} else if (xmlEvent.isEndElement()) {
				if (context.getCurrentDepth() < originalDepth) {
					return describeSecurityGroupsResult;
				}
			}
		}
	}

	private static DescribeSecurityGroupsResultStaxUnmarshaller instance;

	public static DescribeSecurityGroupsResultStaxUnmarshaller getInstance() {
		if (instance == null)
			instance = new DescribeSecurityGroupsResultStaxUnmarshaller();
		return instance;
	}
}
