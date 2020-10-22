package com.ksc.network.vpc.transform.peering;

import com.ksc.network.vpc.model.peering.RequesterVpcInfo;
import com.ksc.transform.SimpleTypeStaxUnmarshallers;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import javax.xml.stream.events.XMLEvent;

public class RequesterVpcInfoStaxUnmarshaller implements Unmarshaller<RequesterVpcInfo, StaxUnmarshallerContext> {
    private static RequesterVpcInfoStaxUnmarshaller instance;

    public static RequesterVpcInfoStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new RequesterVpcInfoStaxUnmarshaller();
        return instance;
    }

    @Override
    public RequesterVpcInfo unmarshall(StaxUnmarshallerContext context) throws Exception {
        RequesterVpcInfo RequesterVpcInfo = new RequesterVpcInfo();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;
        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return RequesterVpcInfo;
            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("AccountId", targetDepth)) {
                    RequesterVpcInfo.setAccountId(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("Region", targetDepth)) {
                    RequesterVpcInfo.setRegion(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("VpcId", targetDepth)) {
                    RequesterVpcInfo.setVpcId(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("VpcName", targetDepth)) {
                    RequesterVpcInfo.setVpcName(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("VpcPeeringConnectionId", targetDepth)) {
                    RequesterVpcInfo.setVpcPeeringConnectionId(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("CidrBlock", targetDepth)) {
                    RequesterVpcInfo.setCidrBlock(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return RequesterVpcInfo;
                }
            }
        }
    }
}
