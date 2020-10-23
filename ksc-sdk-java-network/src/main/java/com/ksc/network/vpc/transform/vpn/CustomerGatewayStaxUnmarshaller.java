package com.ksc.network.vpc.transform.vpn;

import com.ksc.network.vpc.model.vpn.CustomerGateway;
import com.ksc.transform.SimpleTypeStaxUnmarshallers;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import javax.xml.stream.events.XMLEvent;

public class CustomerGatewayStaxUnmarshaller implements Unmarshaller<CustomerGateway, StaxUnmarshallerContext> {
    private static CustomerGatewayStaxUnmarshaller instance;

    public static CustomerGatewayStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new CustomerGatewayStaxUnmarshaller();
        return instance;
    }

    @Override
    public CustomerGateway unmarshall(StaxUnmarshallerContext context) throws Exception {
        CustomerGateway CustomerGateway = new CustomerGateway();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;
        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return CustomerGateway;
            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("CreateTime", targetDepth)) {
                    CustomerGateway.setCreateTime(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("CustomerGatewayId", targetDepth)) {
                    CustomerGateway.setCustomerGatewayId(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("CustomerGatewayAddress", targetDepth)) {
                    CustomerGateway.setCustomerGatewayAddress(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("HaCustomerGatewayAddress", targetDepth)) {
                    CustomerGateway.setHaCustomerGatewayAddress(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("CustomerGatewayName", targetDepth)) {
                    CustomerGateway.setCustomerGatewayName(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return CustomerGateway;
                }
            }
        }
    }
}
