package com.ksc.network.slb.model.transform;

import com.ksc.network.slb.model.DeleteLoadBalancerAclEntryResult;
import com.ksc.transform.SimpleTypeStaxUnmarshallers;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import javax.xml.stream.events.XMLEvent;

/**
 * DeleteLoadBalancerAclEntryResult StAX Unmarshaller
 */
public class DeleteLoadBalancerAclEntryResultStaxUnmarshaller implements Unmarshaller<DeleteLoadBalancerAclEntryResult, StaxUnmarshallerContext> {
    @Override
    public DeleteLoadBalancerAclEntryResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        DeleteLoadBalancerAclEntryResult deleteLoadBalancerAclEntryResult = new DeleteLoadBalancerAclEntryResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return deleteLoadBalancerAclEntryResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {
                if (context.testExpression("RequestId", targetDepth)) {
                    deleteLoadBalancerAclEntryResult.setRequestId(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("Return", targetDepth)) {
                    deleteLoadBalancerAclEntryResult.setReturn(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return deleteLoadBalancerAclEntryResult;
                }
            }
        }
    }

    private static DeleteLoadBalancerAclEntryResultStaxUnmarshaller instance;

    public static DeleteLoadBalancerAclEntryResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new DeleteLoadBalancerAclEntryResultStaxUnmarshaller();
        return instance;
    }
}
