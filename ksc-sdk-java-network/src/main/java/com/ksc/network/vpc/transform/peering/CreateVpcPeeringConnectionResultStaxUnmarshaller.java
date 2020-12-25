package com.ksc.network.vpc.transform.peering;

import com.ksc.network.vpc.model.peering.CreateVpcPeeringConnectionResult;
import com.ksc.transform.SimpleTypeStaxUnmarshallers;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import javax.xml.stream.events.XMLEvent;

/**
 * CreateVpcPeeringConnectionResult StAX Unmarshaller
 */
public class CreateVpcPeeringConnectionResultStaxUnmarshaller implements Unmarshaller<CreateVpcPeeringConnectionResult, StaxUnmarshallerContext> {
    @Override
    public CreateVpcPeeringConnectionResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        CreateVpcPeeringConnectionResult createVpcPeeringConnectionResult = new CreateVpcPeeringConnectionResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return createVpcPeeringConnectionResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {
                if (context.testExpression("RequestId", targetDepth)) {
                    createVpcPeeringConnectionResult.setRequestId(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("VpcPeeringConnection", targetDepth)) {
                    createVpcPeeringConnectionResult.setVpcPeeringConnection(VpcPeeringConnectionStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return createVpcPeeringConnectionResult;
                }
            }
        }
    }

    private static CreateVpcPeeringConnectionResultStaxUnmarshaller instance;

    public static CreateVpcPeeringConnectionResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new CreateVpcPeeringConnectionResultStaxUnmarshaller();
        return instance;
    }
}
