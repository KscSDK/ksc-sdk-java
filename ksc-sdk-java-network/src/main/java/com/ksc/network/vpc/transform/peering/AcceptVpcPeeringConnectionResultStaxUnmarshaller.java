package com.ksc.network.vpc.transform.peering;

import com.ksc.network.vpc.model.peering.AcceptVpcPeeringConnectionResult;
import com.ksc.transform.SimpleTypeStaxUnmarshallers;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import javax.xml.stream.events.XMLEvent;

/**
 * AcceptVpcPeeringConnectionResult StAX Unmarshaller
 */
public class AcceptVpcPeeringConnectionResultStaxUnmarshaller implements Unmarshaller<AcceptVpcPeeringConnectionResult, StaxUnmarshallerContext> {
    @Override
    public AcceptVpcPeeringConnectionResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        AcceptVpcPeeringConnectionResult acceptVpcPeeringConnectionResult = new AcceptVpcPeeringConnectionResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return acceptVpcPeeringConnectionResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {
                if (context.testExpression("RequestId", targetDepth)) {
                    acceptVpcPeeringConnectionResult.setRequestId(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("VpcPeeringConnection", targetDepth)) {
                    acceptVpcPeeringConnectionResult.setVpcPeeringConnection(VpcPeeringConnectionStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return acceptVpcPeeringConnectionResult;
                }
            }
        }
    }

    private static AcceptVpcPeeringConnectionResultStaxUnmarshaller instance;

    public static AcceptVpcPeeringConnectionResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new AcceptVpcPeeringConnectionResultStaxUnmarshaller();
        return instance;
    }
}
