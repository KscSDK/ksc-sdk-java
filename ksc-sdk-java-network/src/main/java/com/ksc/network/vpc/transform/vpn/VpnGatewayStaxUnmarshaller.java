package com.ksc.network.vpc.transform.vpn;

import com.ksc.network.vpc.model.vpn.VpnGateway;
import com.ksc.transform.SimpleTypeStaxUnmarshallers;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import javax.xml.stream.events.XMLEvent;

public class VpnGatewayStaxUnmarshaller implements Unmarshaller<VpnGateway, StaxUnmarshallerContext> {
    private static VpnGatewayStaxUnmarshaller instance;

    public static VpnGatewayStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new VpnGatewayStaxUnmarshaller();
        return instance;
    }

    @Override
    public VpnGateway unmarshall(StaxUnmarshallerContext context) throws Exception {
        VpnGateway VpnGateway = new VpnGateway();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;
        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return VpnGateway;
            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("CreateTime", targetDepth)) {
                    VpnGateway.setCreateTime(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("VpcId", targetDepth)) {
                    VpnGateway.setVpcId(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("VpnGatewayId", targetDepth)) {
                    VpnGateway.setVpnGatewayId(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("VpnGatewayName", targetDepth)) {
                    VpnGateway.setVpnGatewayName(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("GatewayAddress", targetDepth)) {
                    VpnGateway.setGatewayAddress(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("BandWidth", targetDepth)) {
                    VpnGateway.setBandWidth(SimpleTypeStaxUnmarshallers.IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("HaGatewayAddress", targetDepth)) {
                    VpnGateway.setHaGatewayAddress(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("VpnSwitchType", targetDepth)) {
                    VpnGateway.setVpnSwitchType(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("ProjectId", targetDepth)) {
                    VpnGateway.setProjectId(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return VpnGateway;
                }
            }
        }
    }
}
