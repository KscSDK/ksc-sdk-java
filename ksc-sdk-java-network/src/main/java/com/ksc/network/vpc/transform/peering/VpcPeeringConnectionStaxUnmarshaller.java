package com.ksc.network.vpc.transform.peering;

import com.ksc.network.vpc.model.peering.VpcPeeringConnection;
import com.ksc.transform.SimpleTypeStaxUnmarshallers;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import javax.xml.stream.events.XMLEvent;

public class VpcPeeringConnectionStaxUnmarshaller implements Unmarshaller<VpcPeeringConnection, StaxUnmarshallerContext> {
    private static VpcPeeringConnectionStaxUnmarshaller instance;

    public static VpcPeeringConnectionStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new VpcPeeringConnectionStaxUnmarshaller();
        return instance;
    }

    @Override
    public VpcPeeringConnection unmarshall(StaxUnmarshallerContext context) throws Exception {
        VpcPeeringConnection VpcPeeringConnection = new VpcPeeringConnection();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;
        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return VpcPeeringConnection;
            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("CreateTime", targetDepth)) {
                    VpcPeeringConnection.setCreateTime(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("VpcPeeringConnectionType", targetDepth)) {
                    VpcPeeringConnection.setVpcPeeringConnectionType(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("PeeringName", targetDepth)) {
                    VpcPeeringConnection.setPeeringName(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("State", targetDepth)) {
                    VpcPeeringConnection.setState(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("BandWidth", targetDepth)) {
                    VpcPeeringConnection.setBandWidth(SimpleTypeStaxUnmarshallers.IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("ProjectId", targetDepth)) {
                    VpcPeeringConnection.setProjectId(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("AccepterVpcInfo", targetDepth)) {
                    VpcPeeringConnection.setAccepterVpcInfo(AccepterVpcInfoStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("RequesterVpcInfo", targetDepth)) {
                    VpcPeeringConnection.setRequesterVpcInfo(RequesterVpcInfoStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return VpcPeeringConnection;
                }
            }
        }
    }
}
