package com.ksc.network.vpc.transform.vpn;

import com.ksc.network.vpc.model.vpn.VpnTunnel;
import com.ksc.transform.SimpleTypeStaxUnmarshallers;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import javax.xml.stream.events.XMLEvent;

public class VpnTunnelStaxUnmarshaller implements Unmarshaller<VpnTunnel, StaxUnmarshallerContext> {
    private static VpnTunnelStaxUnmarshaller instance;

    public static VpnTunnelStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new VpnTunnelStaxUnmarshaller();
        return instance;
    }

    @Override
    public VpnTunnel unmarshall(StaxUnmarshallerContext context) throws Exception {
        VpnTunnel VpnTunnel = new VpnTunnel();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;
        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return VpnTunnel;
            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("CreateTime", targetDepth)) {
                    VpnTunnel.setCreateTime(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("VpnTunnelId", targetDepth)) {
                    VpnTunnel.setVpnTunnelId(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("State", targetDepth)) {
                    VpnTunnel.setState(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("Type", targetDepth)) {
                    VpnTunnel.setType(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("VpnTunnelName", targetDepth)) {
                    VpnTunnel.setVpnTunnelName(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("VpnGreIp", targetDepth)) {
                    VpnTunnel.setVpnGreIp(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("CustomerGreIp", targetDepth)) {
                    VpnTunnel.setCustomerGreIp(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("HaVpnGreIp", targetDepth)) {
                    VpnTunnel.setHaVpnGreIp(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("HaCustomerGreIp", targetDepth)) {
                    VpnTunnel.setHaCustomerGreIp(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("VpnGatewayId", targetDepth)) {
                    VpnTunnel.setVpnGatewayId(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("CustomerGatewayId", targetDepth)) {
                    VpnTunnel.setCustomerGatewayId(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("PreSharedKey", targetDepth)) {
                    VpnTunnel.setPreSharedKey(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("IkeAuthenAlgorithm", targetDepth)) {
                    VpnTunnel.setIkeAuthenAlgorithm(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("IkeDHGroup", targetDepth)) {
                    VpnTunnel.setIkeDHGroup(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("IkeEncryAlgorithm", targetDepth)) {
                    VpnTunnel.setIkeEncryAlgorithm(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("IpsecEncryAlgorithm", targetDepth)) {
                    VpnTunnel.setIpsecEncryAlgorithm(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("IpsecAuthenAlgorithm", targetDepth)) {
                    VpnTunnel.setIpsecAuthenAlgorithm(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("IpsecLifetimeTraffic", targetDepth)) {
                    VpnTunnel.setIpsecLifetimeTraffic(SimpleTypeStaxUnmarshallers.IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("IpsecLifetimeSecond", targetDepth)) {
                    VpnTunnel.setIpsecLifetimeSecond(SimpleTypeStaxUnmarshallers.IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("EnableNatTraversal", targetDepth)) {
                    VpnTunnel.setEnableNatTraversal(SimpleTypeStaxUnmarshallers.BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("NatId", targetDepth)) {
                    VpnTunnel.setNatId(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                    if (context.testExpression("ExtraCidrSet", targetDepth)) {
                    VpnTunnel.addExtraCidrSet(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
					continue;
				}
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return VpnTunnel;
                }
            }
        }
    }
}
