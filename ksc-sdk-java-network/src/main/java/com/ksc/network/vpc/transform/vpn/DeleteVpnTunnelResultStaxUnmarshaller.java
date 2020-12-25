package com.ksc.network.vpc.transform.vpn;

import com.ksc.network.vpc.model.vpn.DeleteVpnTunnelResult;
import com.ksc.transform.SimpleTypeStaxUnmarshallers;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import javax.xml.stream.events.XMLEvent;

/**
 * DeleteVpnTunnelResult StAX Unmarshaller
 */
public class DeleteVpnTunnelResultStaxUnmarshaller implements Unmarshaller<DeleteVpnTunnelResult, StaxUnmarshallerContext> {
    @Override
    public DeleteVpnTunnelResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        DeleteVpnTunnelResult deleteVpnTunnelResult = new DeleteVpnTunnelResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return deleteVpnTunnelResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {
                if (context.testExpression("RequestId", targetDepth)) {
                    deleteVpnTunnelResult.setRequestId(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("Return", targetDepth)) {
                    deleteVpnTunnelResult.setReturn(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return deleteVpnTunnelResult;
                }
            }
        }
    }

    private static DeleteVpnTunnelResultStaxUnmarshaller instance;

    public static DeleteVpnTunnelResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new DeleteVpnTunnelResultStaxUnmarshaller();
        return instance;
    }
}
