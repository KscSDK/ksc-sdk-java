package com.ksc.network.slb.model.transform;

import com.ksc.network.slb.model.DeleteLoadBalancerAclResult;
import com.ksc.transform.SimpleTypeStaxUnmarshallers;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import javax.xml.stream.events.XMLEvent;

/**
 * DeleteLoadBalancerAclResult StAX Unmarshaller
 */
public class DeleteLoadBalancerAclResultStaxUnmarshaller implements Unmarshaller<DeleteLoadBalancerAclResult, StaxUnmarshallerContext> {
    @Override
    public DeleteLoadBalancerAclResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        DeleteLoadBalancerAclResult deleteLoadBalancerAclResult = new DeleteLoadBalancerAclResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return deleteLoadBalancerAclResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {
                if (context.testExpression("RequestId", targetDepth)) {
                            deleteLoadBalancerAclResult.setRequestId(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("Return", targetDepth)) {
                            deleteLoadBalancerAclResult.setReturn(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return deleteLoadBalancerAclResult;
                }
            }
        }
    }

    private static DeleteLoadBalancerAclResultStaxUnmarshaller instance;

    public static DeleteLoadBalancerAclResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new DeleteLoadBalancerAclResultStaxUnmarshaller();
        return instance;
    }
}
