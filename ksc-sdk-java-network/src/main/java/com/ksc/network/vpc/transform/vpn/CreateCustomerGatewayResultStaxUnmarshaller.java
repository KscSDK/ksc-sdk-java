package com.ksc.network.vpc.transform.vpn;

import com.ksc.network.vpc.model.vpn.CreateCustomerGatewayResult;
import com.ksc.transform.SimpleTypeStaxUnmarshallers;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import javax.xml.stream.events.XMLEvent;

/**
 * CreateCustomerGatewayResult StAX Unmarshaller
 */
public class CreateCustomerGatewayResultStaxUnmarshaller implements Unmarshaller<CreateCustomerGatewayResult, StaxUnmarshallerContext> {
    @Override
    public CreateCustomerGatewayResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        CreateCustomerGatewayResult createCustomerGatewayResult = new CreateCustomerGatewayResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return createCustomerGatewayResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {
                if (context.testExpression("RequestId", targetDepth)) {
                    createCustomerGatewayResult.setRequestId(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("CustomerGateway", targetDepth)) {
                    createCustomerGatewayResult.setCustomerGateway(CustomerGatewayStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return createCustomerGatewayResult;
                }
            }
        }
    }

    private static CreateCustomerGatewayResultStaxUnmarshaller instance;

    public static CreateCustomerGatewayResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new CreateCustomerGatewayResultStaxUnmarshaller();
        return instance;
    }
}
