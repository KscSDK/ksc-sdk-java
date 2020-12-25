package com.ksc.network.vpc.transform.vpn;

import com.ksc.network.vpc.model.vpn.DeleteCustomerGatewayResult;
import com.ksc.transform.SimpleTypeStaxUnmarshallers;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import javax.xml.stream.events.XMLEvent;

/**
 * DeleteCustomerGatewayResult StAX Unmarshaller
 */
public class DeleteCustomerGatewayResultStaxUnmarshaller implements Unmarshaller<DeleteCustomerGatewayResult, StaxUnmarshallerContext> {
    @Override
    public DeleteCustomerGatewayResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        DeleteCustomerGatewayResult deleteCustomerGatewayResult = new DeleteCustomerGatewayResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return deleteCustomerGatewayResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {
                if (context.testExpression("RequestId", targetDepth)) {
                    deleteCustomerGatewayResult.setRequestId(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("Return", targetDepth)) {
                    deleteCustomerGatewayResult.setReturn(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return deleteCustomerGatewayResult;
                }
            }
        }
    }

    private static DeleteCustomerGatewayResultStaxUnmarshaller instance;

    public static DeleteCustomerGatewayResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new DeleteCustomerGatewayResultStaxUnmarshaller();
        return instance;
    }
}
