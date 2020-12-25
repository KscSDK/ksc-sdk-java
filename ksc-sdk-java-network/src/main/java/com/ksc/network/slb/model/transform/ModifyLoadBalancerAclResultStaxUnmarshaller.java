package com.ksc.network.slb.model.transform;

import com.ksc.network.slb.model.ModifyLoadBalancerAclResult;
import com.ksc.transform.SimpleTypeStaxUnmarshallers;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import javax.xml.stream.events.XMLEvent;

/**
 * ModifyLoadBalancerAclResult StAX Unmarshaller
 */
public class ModifyLoadBalancerAclResultStaxUnmarshaller implements Unmarshaller<ModifyLoadBalancerAclResult, StaxUnmarshallerContext> {
    @Override
    public ModifyLoadBalancerAclResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        ModifyLoadBalancerAclResult modifyLoadBalancerAclResult = new ModifyLoadBalancerAclResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return modifyLoadBalancerAclResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {
                if (context.testExpression("RequestId", targetDepth)) {
                            modifyLoadBalancerAclResult.setRequestId(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("LoadBalancerAcl", targetDepth)) {
                        modifyLoadBalancerAclResult.setLoadBalancerAcl(LoadBalancerAclStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return modifyLoadBalancerAclResult;
                }
            }
        }
    }

    private static ModifyLoadBalancerAclResultStaxUnmarshaller instance;

    public static ModifyLoadBalancerAclResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new ModifyLoadBalancerAclResultStaxUnmarshaller();
        return instance;
    }
}
