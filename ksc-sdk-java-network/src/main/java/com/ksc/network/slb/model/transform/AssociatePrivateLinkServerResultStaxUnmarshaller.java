package com.ksc.network.slb.model.transform;

import com.ksc.network.slb.model.AssociatePrivateLinkServerResult;
import com.ksc.transform.SimpleTypeStaxUnmarshallers;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import javax.xml.stream.events.XMLEvent;

/**
 * CreatePrivateLinkServerResult StAX Unmarshaller
 */
public class AssociatePrivateLinkServerResultStaxUnmarshaller implements Unmarshaller<AssociatePrivateLinkServerResult, StaxUnmarshallerContext> {
    @Override
    public AssociatePrivateLinkServerResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        AssociatePrivateLinkServerResult associatePrivateLinkServerResult = new AssociatePrivateLinkServerResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return associatePrivateLinkServerResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {
                if (context.testExpression("RequestId", targetDepth)) {
                    associatePrivateLinkServerResult.setRequestId(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("PrivateLink", targetDepth)) {
                    associatePrivateLinkServerResult.setPrivateLink(PrivateLinkStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return associatePrivateLinkServerResult;
                }
            }
        }
    }

    private static AssociatePrivateLinkServerResultStaxUnmarshaller instance;

    public static AssociatePrivateLinkServerResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new AssociatePrivateLinkServerResultStaxUnmarshaller();
        return instance;
    }
}
