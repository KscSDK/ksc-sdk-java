package com.ksc.network.vpc.transform.vpn;

import com.ksc.network.vpc.model.vpn.ModifyVpnTunnelResult;
import com.ksc.transform.SimpleTypeStaxUnmarshallers;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import javax.xml.stream.events.XMLEvent;

/**
 * ModifyVpnTunnelResult StAX Unmarshaller
 */
public class ModifyVpnTunnelResultStaxUnmarshaller implements Unmarshaller<ModifyVpnTunnelResult, StaxUnmarshallerContext> {
    @Override
    public ModifyVpnTunnelResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        ModifyVpnTunnelResult modifyVpnTunnelResult = new ModifyVpnTunnelResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return modifyVpnTunnelResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {
                if (context.testExpression("RequestId", targetDepth)) {
                    modifyVpnTunnelResult.setRequestId(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("VpnTunnel", targetDepth)) {
                    modifyVpnTunnelResult.setVpnTunnel(VpnTunnelStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return modifyVpnTunnelResult;
                }
            }
        }
    }

    private static ModifyVpnTunnelResultStaxUnmarshaller instance;

    public static ModifyVpnTunnelResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new ModifyVpnTunnelResultStaxUnmarshaller();
        return instance;
    }
}
