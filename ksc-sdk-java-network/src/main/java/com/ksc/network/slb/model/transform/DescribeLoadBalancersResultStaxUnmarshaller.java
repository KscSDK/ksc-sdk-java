package com.ksc.network.slb.model.transform;

import com.ksc.network.slb.model.DescribeLoadBalancersResult;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import javax.xml.stream.events.XMLEvent;

public class DescribeLoadBalancersResultStaxUnmarshaller
		implements Unmarshaller<DescribeLoadBalancersResult, StaxUnmarshallerContext> {

	@Override
	public DescribeLoadBalancersResult unmarshall(StaxUnmarshallerContext context) throws Exception {
		DescribeLoadBalancersResult describeLoadBalancersResult = new DescribeLoadBalancersResult();
		int originalDepth = context.getCurrentDepth();
		int targetDepth = originalDepth + 1;

		if (context.isStartOfDocument())
			targetDepth += 1;

		while (true) {
			XMLEvent xmlEvent = context.nextEvent();
			if (xmlEvent.isEndDocument())
				return describeLoadBalancersResult;

			if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

				if (context.testExpression("LoadBalancerDescriptions/Item", targetDepth)) {
					describeLoadBalancersResult
							.addLoadBalancerDescriptions(LoadBalanceStaxUnmarshaller.getInstance().unmarshall(context));
					continue;
				} else if (context.testExpression("RequestId", targetDepth)) {
					describeLoadBalancersResult.setRequestId(StringStaxUnmarshaller.getInstance().unmarshall(context));
					continue;
				}

			} else if (xmlEvent.isEndElement()) {
				if (context.getCurrentDepth() < originalDepth) {
					return describeLoadBalancersResult;
				}
			}
		}
	}

	private static DescribeLoadBalancersResultStaxUnmarshaller instance;

	public static DescribeLoadBalancersResultStaxUnmarshaller getInstance() {
		if (instance == null)
			instance = new DescribeLoadBalancersResultStaxUnmarshaller();
		return instance;
	}

}
