package com.ksc.network.vpc.transform.vpn;

import com.ksc.network.vpc.model.vpn.CreateVpnTunnelResult;
import com.ksc.transform.SimpleTypeStaxUnmarshallers;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import javax.xml.stream.events.XMLEvent;

/**
 * CreateVpnTunnelResult StAX Unmarshaller
 */
public class CreateVpnTunnelResultStaxUnmarshaller implements Unmarshaller<CreateVpnTunnelResult, StaxUnmarshallerContext> {
    @Override
    public CreateVpnTunnelResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        CreateVpnTunnelResult createVpnTunnelResult = new CreateVpnTunnelResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return createVpnTunnelResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {
                if (context.testExpression("RequestId", targetDepth)) {
                    createVpnTunnelResult.setRequestId(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("VpnTunnel", targetDepth)) {
                    createVpnTunnelResult.setVpnTunnel(VpnTunnelStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return createVpnTunnelResult;
                }
            }
        }
    }

    private static CreateVpnTunnelResultStaxUnmarshaller instance;

    public static CreateVpnTunnelResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new CreateVpnTunnelResultStaxUnmarshaller();
        return instance;
    }
}
