package com.ksc.network.vpc.transform.NetworkAcl;

import com.ksc.network.vpc.model.NetworkAcl.DescribeNetworkAclsResult;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import javax.xml.stream.events.XMLEvent;

/**
 * DescribeNetworkAclsResult StAX Unmarshaller
 */
public class DescribeNetworkAclsResultStaxUnmarshaller
		implements Unmarshaller<DescribeNetworkAclsResult, StaxUnmarshallerContext> {

	public DescribeNetworkAclsResult unmarshall(StaxUnmarshallerContext context) throws Exception {
		DescribeNetworkAclsResult describeNetworkAclsResult = new DescribeNetworkAclsResult();
		int originalDepth = context.getCurrentDepth();
		int targetDepth = originalDepth + 1;

		if (context.isStartOfDocument())
			targetDepth += 1;

		while (true) {
			XMLEvent xmlEvent = context.nextEvent();
			if (xmlEvent.isEndDocument())
				return describeNetworkAclsResult;

			if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

				if (context.testExpression("NetworkAclSet/item", targetDepth)) {
					describeNetworkAclsResult
							.withNetworkAcls(NetworkAclStaxUnmarshaller.getInstance().unmarshall(context));
					continue;
				} else if (context.testExpression("RequestId", targetDepth)) {
					describeNetworkAclsResult.setRequestId(StringStaxUnmarshaller.getInstance().unmarshall(context));
					continue;
				} else if (context.testExpression("NextToken", targetDepth)) {
					describeNetworkAclsResult.setNextToken(StringStaxUnmarshaller.getInstance().unmarshall(context));
					continue;
				}

			} else if (xmlEvent.isEndElement()) {
				if (context.getCurrentDepth() < originalDepth) {
					return describeNetworkAclsResult;
				}
			}
		}
	}

	private static DescribeNetworkAclsResultStaxUnmarshaller instance;

	public static DescribeNetworkAclsResultStaxUnmarshaller getInstance() {
		if (instance == null)
			instance = new DescribeNetworkAclsResultStaxUnmarshaller();
		return instance;
	}
}
