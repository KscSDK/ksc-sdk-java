package com.ksc.network.slb.model.transform;

import com.ksc.network.slb.model.LoadBalancerAclEntry;
import com.ksc.transform.SimpleTypeStaxUnmarshallers;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import javax.xml.stream.events.XMLEvent;

public class LoadBalancerAclEntryStaxUnmarshaller implements Unmarshaller<LoadBalancerAclEntry, StaxUnmarshallerContext> {
    private static LoadBalancerAclEntryStaxUnmarshaller instance;

    public static LoadBalancerAclEntryStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new LoadBalancerAclEntryStaxUnmarshaller();
        return instance;
    }

    @Override
    public LoadBalancerAclEntry unmarshall(StaxUnmarshallerContext context) throws Exception {
        LoadBalancerAclEntry LoadBalancerAclEntry = new LoadBalancerAclEntry();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;
        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return LoadBalancerAclEntry;
            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("LoadBalancerAclEntryId", targetDepth)) {
                    LoadBalancerAclEntry.setLoadBalancerAclEntryId(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("CidrBlock", targetDepth)) {
                    LoadBalancerAclEntry.setCidrBlock(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("LoadBalancerAclId", targetDepth)) {
                    LoadBalancerAclEntry.setLoadBalancerAclId(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("RuleNumber", targetDepth)) {
                    LoadBalancerAclEntry.setRuleNumber(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("RuleAction", targetDepth)) {
                    LoadBalancerAclEntry.setRuleAction(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("Protocol", targetDepth)) {
                    LoadBalancerAclEntry.setProtocol(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return LoadBalancerAclEntry;
                }
            }
        }
    }
}
