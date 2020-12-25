package com.ksc.network.vpc.transform.vpn;

import com.ksc.network.vpc.model.vpn.DescribeVpnGatewaysResult;
import com.ksc.transform.SimpleTypeStaxUnmarshallers;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import javax.xml.stream.events.XMLEvent;

/**
 * DescribeVpnGatewaysResult StAX Unmarshaller
 */
public class DescribeVpnGatewaysResultStaxUnmarshaller implements Unmarshaller<DescribeVpnGatewaysResult, StaxUnmarshallerContext> {
    @Override
    public DescribeVpnGatewaysResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        DescribeVpnGatewaysResult describeVpnGatewaysResult = new DescribeVpnGatewaysResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return describeVpnGatewaysResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {
                if (context.testExpression("RequestId", targetDepth)) {
                    describeVpnGatewaysResult.setRequestId(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("VpnGatewaySet/item", targetDepth)) {
                    describeVpnGatewaysResult.addVpnGatewaySet(VpnGatewayStaxUnmarshaller.getInstance().unmarshall(context));
					continue;
				}
                if (context.testExpression("NextToken", targetDepth)) {
                    describeVpnGatewaysResult.setNextToken(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return describeVpnGatewaysResult;
                }
            }
        }
    }

    private static DescribeVpnGatewaysResultStaxUnmarshaller instance;

    public static DescribeVpnGatewaysResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeVpnGatewaysResultStaxUnmarshaller();
        return instance;
    }
}
