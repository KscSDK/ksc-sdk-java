package com.ksc.network.vpc.transform.vpn;

import com.ksc.network.vpc.model.vpn.ModifyVpnGatewayResult;
import com.ksc.transform.SimpleTypeStaxUnmarshallers;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import javax.xml.stream.events.XMLEvent;

/**
 * ModifyVpnGatewayResult StAX Unmarshaller
 */
public class ModifyVpnGatewayResultStaxUnmarshaller implements Unmarshaller<ModifyVpnGatewayResult, StaxUnmarshallerContext> {
    @Override
    public ModifyVpnGatewayResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        ModifyVpnGatewayResult modifyVpnGatewayResult = new ModifyVpnGatewayResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return modifyVpnGatewayResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {
                if (context.testExpression("RequestId", targetDepth)) {
                    modifyVpnGatewayResult.setRequestId(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("VpnGateway", targetDepth)) {
                    modifyVpnGatewayResult.setVpnGateway(VpnGatewayStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return modifyVpnGatewayResult;
                }
            }
        }
    }

    private static ModifyVpnGatewayResultStaxUnmarshaller instance;

    public static ModifyVpnGatewayResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new ModifyVpnGatewayResultStaxUnmarshaller();
        return instance;
    }
}
