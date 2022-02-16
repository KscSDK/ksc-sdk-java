package com.ksc.network.slb.model.transform;

import com.ksc.network.slb.model.AcceptPrivateLinkResult;
import com.ksc.transform.SimpleTypeStaxUnmarshallers;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import javax.xml.stream.events.XMLEvent;

/**
 * AcceptPrivateLink StAX Unmarshaller
 */
public class AcceptPrivateLinkResultStaxUnmarshaller implements Unmarshaller<AcceptPrivateLinkResult, StaxUnmarshallerContext> {
    @Override
    public AcceptPrivateLinkResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        AcceptPrivateLinkResult acceptPrivateLinkResult = new AcceptPrivateLinkResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return acceptPrivateLinkResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {
                if (context.testExpression("RequestId", targetDepth)) {
                    acceptPrivateLinkResult.setRequestId(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("Return", targetDepth)) {
                    acceptPrivateLinkResult.setReturn(SimpleTypeStaxUnmarshallers.BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return acceptPrivateLinkResult;
                }
            }
        }
    }

    private static AcceptPrivateLinkResultStaxUnmarshaller instance;

    public static AcceptPrivateLinkResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new AcceptPrivateLinkResultStaxUnmarshaller();
        return instance;
    }
}
