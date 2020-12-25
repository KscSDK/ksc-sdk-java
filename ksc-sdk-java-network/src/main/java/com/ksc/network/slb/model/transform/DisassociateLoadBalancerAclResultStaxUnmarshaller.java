package com.ksc.network.slb.model.transform;

import com.ksc.network.slb.model.DisassociateLoadBalancerAclResult;
import com.ksc.transform.SimpleTypeStaxUnmarshallers;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import javax.xml.stream.events.XMLEvent;

/**
 * DisassociateLoadBalancerAclResult StAX Unmarshaller
 */
public class DisassociateLoadBalancerAclResultStaxUnmarshaller implements Unmarshaller<DisassociateLoadBalancerAclResult, StaxUnmarshallerContext> {
    @Override
    public DisassociateLoadBalancerAclResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        DisassociateLoadBalancerAclResult disassociateLoadBalancerAclResult = new DisassociateLoadBalancerAclResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return disassociateLoadBalancerAclResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {
                if (context.testExpression("RequestId", targetDepth)) {
                    disassociateLoadBalancerAclResult.setRequestId(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("Return", targetDepth)) {
                    disassociateLoadBalancerAclResult.setReturn(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return disassociateLoadBalancerAclResult;
                }
            }
        }
    }

    private static DisassociateLoadBalancerAclResultStaxUnmarshaller instance;

    public static DisassociateLoadBalancerAclResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new DisassociateLoadBalancerAclResultStaxUnmarshaller();
        return instance;
    }
}
