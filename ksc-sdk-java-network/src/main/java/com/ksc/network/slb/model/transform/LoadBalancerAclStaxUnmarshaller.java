package com.ksc.network.slb.model.transform;

import com.ksc.network.slb.model.LoadBalancerAcl;
import com.ksc.transform.SimpleTypeStaxUnmarshallers;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import javax.xml.stream.events.XMLEvent;

public class LoadBalancerAclStaxUnmarshaller implements Unmarshaller<LoadBalancerAcl, StaxUnmarshallerContext> {
    private static LoadBalancerAclStaxUnmarshaller instance;

    public static LoadBalancerAclStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new LoadBalancerAclStaxUnmarshaller();
        return instance;
    }

    @Override
    public LoadBalancerAcl unmarshall(StaxUnmarshallerContext context) throws Exception {
        LoadBalancerAcl LoadBalancerAcl = new LoadBalancerAcl();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;
        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return LoadBalancerAcl;
            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("CreateTime", targetDepth)) {
                    LoadBalancerAcl.setCreateTime(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("LoadBalancerAclName", targetDepth)) {
                    LoadBalancerAcl.setLoadBalancerAclName(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("LoadBalancerAclId", targetDepth)) {
                    LoadBalancerAcl.setLoadBalancerAclId(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("IpVersion", targetDepth)) {
                    LoadBalancerAcl.setIpVersion(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("loadBalancerAclEntrySet", targetDepth)) {
                    LoadBalancerAcl.addLoadBalancerAclEntrySet(LoadBalancerAclEntryStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return LoadBalancerAcl;
                }
            }
        }
    }
}
