package com.ksc.network.vpc.transform.peering;

import com.ksc.network.vpc.model.peering.ModifyVpcPeeringConnectionResult;
import com.ksc.transform.SimpleTypeStaxUnmarshallers;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import javax.xml.stream.events.XMLEvent;

/**
 * ModifyVpcPeeringConnectionResult StAX Unmarshaller
 */
public class ModifyVpcPeeringConnectionResultStaxUnmarshaller implements Unmarshaller<ModifyVpcPeeringConnectionResult, StaxUnmarshallerContext> {
    @Override
    public ModifyVpcPeeringConnectionResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        ModifyVpcPeeringConnectionResult modifyVpcPeeringConnectionResult = new ModifyVpcPeeringConnectionResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return modifyVpcPeeringConnectionResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {
                if (context.testExpression("RequestId", targetDepth)) {
                    modifyVpcPeeringConnectionResult.setRequestId(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("VpcPeeringConnection", targetDepth)) {
                    modifyVpcPeeringConnectionResult.setVpcPeeringConnection(VpcPeeringConnectionStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return modifyVpcPeeringConnectionResult;
                }
            }
        }
    }

    private static ModifyVpcPeeringConnectionResultStaxUnmarshaller instance;

    public static ModifyVpcPeeringConnectionResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new ModifyVpcPeeringConnectionResultStaxUnmarshaller();
        return instance;
    }
}
