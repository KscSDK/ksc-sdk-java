package com.ksc.network.vpc.transform.vpn;

import com.ksc.network.vpc.model.vpn.ModifyCustomerGatewayResult;
import com.ksc.transform.SimpleTypeStaxUnmarshallers;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import javax.xml.stream.events.XMLEvent;

/**
 * ModifyCustomerGatewayResult StAX Unmarshaller
 */
public class ModifyCustomerGatewayResultStaxUnmarshaller implements Unmarshaller<ModifyCustomerGatewayResult, StaxUnmarshallerContext> {
    @Override
    public ModifyCustomerGatewayResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        ModifyCustomerGatewayResult modifyCustomerGatewayResult = new ModifyCustomerGatewayResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return modifyCustomerGatewayResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {
                if (context.testExpression("RequestId", targetDepth)) {
                    modifyCustomerGatewayResult.setRequestId(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("CustomerGateway", targetDepth)) {
                    modifyCustomerGatewayResult.setCustomerGateway(CustomerGatewayStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return modifyCustomerGatewayResult;
                }
            }
        }
    }

    private static ModifyCustomerGatewayResultStaxUnmarshaller instance;

    public static ModifyCustomerGatewayResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new ModifyCustomerGatewayResultStaxUnmarshaller();
        return instance;
    }
}
