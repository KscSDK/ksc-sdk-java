package com.ksc.network.slb.model.transform;

import com.ksc.network.slb.model.DescribeLoadBalancerAclsResult;
import com.ksc.transform.SimpleTypeStaxUnmarshallers;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import javax.xml.stream.events.XMLEvent;

/**
 * DescribeLoadBalancerAclsResult StAX Unmarshaller
 */
public class DescribeLoadBalancerAclsResultStaxUnmarshaller implements Unmarshaller<DescribeLoadBalancerAclsResult, StaxUnmarshallerContext> {
    @Override
    public DescribeLoadBalancerAclsResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        DescribeLoadBalancerAclsResult describeLoadBalancerAclsResult = new DescribeLoadBalancerAclsResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return describeLoadBalancerAclsResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {
                if (context.testExpression("RequestId", targetDepth)) {
                    describeLoadBalancerAclsResult.setRequestId(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("LoadBalancerAclSet/item", targetDepth)) {
                    describeLoadBalancerAclsResult.addLoadBalancerAclSet(LoadBalancerAclStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("NextToken", targetDepth)) {
                    describeLoadBalancerAclsResult.setNextToken(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return describeLoadBalancerAclsResult;
                }
            }
        }
    }

    private static DescribeLoadBalancerAclsResultStaxUnmarshaller instance;

    public static DescribeLoadBalancerAclsResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeLoadBalancerAclsResultStaxUnmarshaller();
        return instance;
    }
}
