package com.ksc.network.vpc.transform.peering;

import com.ksc.network.vpc.model.peering.RejectVpcPeeringConnectionResult;
import com.ksc.transform.SimpleTypeStaxUnmarshallers;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import javax.xml.stream.events.XMLEvent;

/**
 * RejectVpcPeeringConnectionResult StAX Unmarshaller
 */
public class RejectVpcPeeringConnectionResultStaxUnmarshaller implements Unmarshaller<RejectVpcPeeringConnectionResult, StaxUnmarshallerContext> {
    @Override
    public RejectVpcPeeringConnectionResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        RejectVpcPeeringConnectionResult rejectVpcPeeringConnectionResult = new RejectVpcPeeringConnectionResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return rejectVpcPeeringConnectionResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {
                if (context.testExpression("RequestId", targetDepth)) {
                    rejectVpcPeeringConnectionResult.setRequestId(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("VpcPeeringConnection", targetDepth)) {
                    rejectVpcPeeringConnectionResult.setVpcPeeringConnection(VpcPeeringConnectionStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return rejectVpcPeeringConnectionResult;
                }
            }
        }
    }

    private static RejectVpcPeeringConnectionResultStaxUnmarshaller instance;

    public static RejectVpcPeeringConnectionResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new RejectVpcPeeringConnectionResultStaxUnmarshaller();
        return instance;
    }
}
