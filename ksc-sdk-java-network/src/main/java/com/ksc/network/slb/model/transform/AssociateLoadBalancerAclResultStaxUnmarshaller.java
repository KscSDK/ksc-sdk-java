package com.ksc.network.slb.model.transform;

import com.ksc.network.slb.model.AssociateLoadBalancerAclResult;
import com.ksc.transform.SimpleTypeStaxUnmarshallers;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import javax.xml.stream.events.XMLEvent;

/**
 * AssociateLoadBalancerAclResult StAX Unmarshaller
 */
public class AssociateLoadBalancerAclResultStaxUnmarshaller implements Unmarshaller<AssociateLoadBalancerAclResult, StaxUnmarshallerContext> {
    @Override
    public AssociateLoadBalancerAclResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        AssociateLoadBalancerAclResult associateLoadBalancerAclResult = new AssociateLoadBalancerAclResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return associateLoadBalancerAclResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {
                if (context.testExpression("RequestId", targetDepth)) {
                    associateLoadBalancerAclResult.setRequestId(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("Return", targetDepth)) {
                    associateLoadBalancerAclResult.setReturn(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return associateLoadBalancerAclResult;
                }
            }
        }
    }

    private static AssociateLoadBalancerAclResultStaxUnmarshaller instance;

    public static AssociateLoadBalancerAclResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new AssociateLoadBalancerAclResultStaxUnmarshaller();
        return instance;
    }
}
