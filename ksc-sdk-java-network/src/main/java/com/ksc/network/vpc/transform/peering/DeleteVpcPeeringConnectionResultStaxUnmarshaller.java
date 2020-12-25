package com.ksc.network.vpc.transform.peering;

import com.ksc.network.vpc.model.peering.DeleteVpcPeeringConnectionResult;
import com.ksc.transform.SimpleTypeStaxUnmarshallers;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import javax.xml.stream.events.XMLEvent;

/**
 * DeleteVpcPeeringConnectionResult StAX Unmarshaller
 */
public class DeleteVpcPeeringConnectionResultStaxUnmarshaller implements Unmarshaller<DeleteVpcPeeringConnectionResult, StaxUnmarshallerContext> {
    @Override
    public DeleteVpcPeeringConnectionResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        DeleteVpcPeeringConnectionResult deleteVpcPeeringConnectionResult = new DeleteVpcPeeringConnectionResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return deleteVpcPeeringConnectionResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {
                if (context.testExpression("RequestId", targetDepth)) {
                    deleteVpcPeeringConnectionResult.setRequestId(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("Return", targetDepth)) {
                    deleteVpcPeeringConnectionResult.setReturn(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return deleteVpcPeeringConnectionResult;
                }
            }
        }
    }

    private static DeleteVpcPeeringConnectionResultStaxUnmarshaller instance;

    public static DeleteVpcPeeringConnectionResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new DeleteVpcPeeringConnectionResultStaxUnmarshaller();
        return instance;
    }
}
