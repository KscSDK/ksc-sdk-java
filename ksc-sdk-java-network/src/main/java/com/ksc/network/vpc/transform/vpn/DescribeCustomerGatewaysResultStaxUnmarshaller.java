package com.ksc.network.vpc.transform.vpn;

import com.ksc.network.vpc.model.vpn.DescribeCustomerGatewaysResult;
import com.ksc.transform.SimpleTypeStaxUnmarshallers;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import javax.xml.stream.events.XMLEvent;

/**
 * DescribeCustomerGatewaysResult StAX Unmarshaller
 */
public class DescribeCustomerGatewaysResultStaxUnmarshaller implements Unmarshaller<DescribeCustomerGatewaysResult, StaxUnmarshallerContext> {
    @Override
    public DescribeCustomerGatewaysResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        DescribeCustomerGatewaysResult describeCustomerGatewaysResult = new DescribeCustomerGatewaysResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return describeCustomerGatewaysResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {
                if (context.testExpression("RequestId", targetDepth)) {
                    describeCustomerGatewaysResult.setRequestId(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("CustomerGatewaySet/item", targetDepth)) {
                    describeCustomerGatewaysResult.addCustomerGatewaySet(CustomerGatewayStaxUnmarshaller.getInstance().unmarshall(context));
					continue;
				}
                if (context.testExpression("NextToken", targetDepth)) {
                    describeCustomerGatewaysResult.setNextToken(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return describeCustomerGatewaysResult;
                }
            }
        }
    }

    private static DescribeCustomerGatewaysResultStaxUnmarshaller instance;

    public static DescribeCustomerGatewaysResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeCustomerGatewaysResultStaxUnmarshaller();
        return instance;
    }
}
