package com.ksc.network.vpc.transform.vpn;

import com.ksc.network.vpc.model.vpn.DeleteVpnGatewayResult;
import com.ksc.transform.SimpleTypeStaxUnmarshallers;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import javax.xml.stream.events.XMLEvent;

/**
 * DeleteVpnGatewayResult StAX Unmarshaller
 */
public class DeleteVpnGatewayResultStaxUnmarshaller implements Unmarshaller<DeleteVpnGatewayResult, StaxUnmarshallerContext> {
    @Override
    public DeleteVpnGatewayResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        DeleteVpnGatewayResult deleteVpnGatewayResult = new DeleteVpnGatewayResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return deleteVpnGatewayResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {
                if (context.testExpression("RequestId", targetDepth)) {
                    deleteVpnGatewayResult.setRequestId(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("Return", targetDepth)) {
                    deleteVpnGatewayResult.setReturn(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return deleteVpnGatewayResult;
                }
            }
        }
    }

    private static DeleteVpnGatewayResultStaxUnmarshaller instance;

    public static DeleteVpnGatewayResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new DeleteVpnGatewayResultStaxUnmarshaller();
        return instance;
    }
}
