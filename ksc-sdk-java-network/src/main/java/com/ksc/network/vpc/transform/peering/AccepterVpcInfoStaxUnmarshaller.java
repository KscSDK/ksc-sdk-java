package com.ksc.network.vpc.transform.peering;

import com.ksc.network.vpc.model.peering.AccepterVpcInfo;
import com.ksc.transform.SimpleTypeStaxUnmarshallers;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import javax.xml.stream.events.XMLEvent;

public class AccepterVpcInfoStaxUnmarshaller implements Unmarshaller<AccepterVpcInfo, StaxUnmarshallerContext> {
    private static AccepterVpcInfoStaxUnmarshaller instance;

    public static AccepterVpcInfoStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new AccepterVpcInfoStaxUnmarshaller();
        return instance;
    }

    @Override
    public AccepterVpcInfo unmarshall(StaxUnmarshallerContext context) throws Exception {
        AccepterVpcInfo AccepterVpcInfo = new AccepterVpcInfo();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;
        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return AccepterVpcInfo;
            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("AccountId", targetDepth)) {
                    AccepterVpcInfo.setAccountId(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("Region", targetDepth)) {
                    AccepterVpcInfo.setRegion(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("VpcId", targetDepth)) {
                    AccepterVpcInfo.setVpcId(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("VpcName", targetDepth)) {
                    AccepterVpcInfo.setVpcName(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("VpcPeeringConnectionId", targetDepth)) {
                    AccepterVpcInfo.setVpcPeeringConnectionId(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("CidrBlock", targetDepth)) {
                    AccepterVpcInfo.setCidrBlock(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return AccepterVpcInfo;
                }
            }
        }
    }
}
