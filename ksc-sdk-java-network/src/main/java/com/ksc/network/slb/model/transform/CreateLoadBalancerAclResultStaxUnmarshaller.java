package com.ksc.network.slb.model.transform;

import com.ksc.network.slb.model.CreateLoadBalancerAclResult;
import com.ksc.transform.SimpleTypeStaxUnmarshallers;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import javax.xml.stream.events.XMLEvent;

/**
 * CreateLoadBalancerAclResult StAX Unmarshaller
 */
public class CreateLoadBalancerAclResultStaxUnmarshaller implements Unmarshaller<CreateLoadBalancerAclResult, StaxUnmarshallerContext> {
    @Override
    public CreateLoadBalancerAclResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        CreateLoadBalancerAclResult createLoadBalancerAclResult = new CreateLoadBalancerAclResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return createLoadBalancerAclResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {
                if (context.testExpression("RequestId", targetDepth)) {
                            createLoadBalancerAclResult.setRequestId(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("LoadBalancerAcl", targetDepth)) {
                        createLoadBalancerAclResult.setLoadBalancerAcl(LoadBalancerAclStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return createLoadBalancerAclResult;
                }
            }
        }
    }

    private static CreateLoadBalancerAclResultStaxUnmarshaller instance;

    public static CreateLoadBalancerAclResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new CreateLoadBalancerAclResultStaxUnmarshaller();
        return instance;
    }
}
