package com.ksc.network.vpc.transform.vpn;

import com.ksc.network.vpc.model.vpn.CreateVpnGatewayResult;
import com.ksc.transform.SimpleTypeStaxUnmarshallers;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import javax.xml.stream.events.XMLEvent;

/**
 * CreateVpnGatewayResult StAX Unmarshaller
 */
public class CreateVpnGatewayResultStaxUnmarshaller implements Unmarshaller<CreateVpnGatewayResult, StaxUnmarshallerContext> {
    @Override
    public CreateVpnGatewayResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        CreateVpnGatewayResult createVpnGatewayResult = new CreateVpnGatewayResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return createVpnGatewayResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {
                if (context.testExpression("RequestId", targetDepth)) {
                    createVpnGatewayResult.setRequestId(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("VpnGateway", targetDepth)) {
                    createVpnGatewayResult.setVpnGateway(VpnGatewayStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return createVpnGatewayResult;
                }
            }
        }
    }

    private static CreateVpnGatewayResultStaxUnmarshaller instance;

    public static CreateVpnGatewayResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new CreateVpnGatewayResultStaxUnmarshaller();
        return instance;
    }
}
