package com.ksc.network.slb.model.transform;

import com.ksc.network.slb.model.CreateLoadBalancerAclEntryResult;
import com.ksc.transform.SimpleTypeStaxUnmarshallers;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import javax.xml.stream.events.XMLEvent;

/**
 * CreateLoadBalancerAclEntryResult StAX Unmarshaller
 */
public class CreateLoadBalancerAclEntryResultStaxUnmarshaller implements Unmarshaller<CreateLoadBalancerAclEntryResult, StaxUnmarshallerContext> {
    @Override
    public CreateLoadBalancerAclEntryResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        CreateLoadBalancerAclEntryResult createLoadBalancerAclEntryResult = new CreateLoadBalancerAclEntryResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return createLoadBalancerAclEntryResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {
                if (context.testExpression("RequestId", targetDepth)) {
                    createLoadBalancerAclEntryResult.setRequestId(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("LoadBalancerAclEntry", targetDepth)) {
                    createLoadBalancerAclEntryResult.setLoadBalancerAclEntry(LoadBalancerAclEntryStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return createLoadBalancerAclEntryResult;
                }
            }
        }
    }

    private static CreateLoadBalancerAclEntryResultStaxUnmarshaller instance;

    public static CreateLoadBalancerAclEntryResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new CreateLoadBalancerAclEntryResultStaxUnmarshaller();
        return instance;
    }
}
