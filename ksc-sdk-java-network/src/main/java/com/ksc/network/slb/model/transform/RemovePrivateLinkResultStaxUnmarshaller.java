package com.ksc.network.slb.model.transform;

import com.ksc.network.slb.model.RemovePrivateLinkResult;
import com.ksc.transform.SimpleTypeStaxUnmarshallers;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import javax.xml.stream.events.XMLEvent;

/**
 * RemovePrivateLink StAX Unmarshaller
 */
public class RemovePrivateLinkResultStaxUnmarshaller implements Unmarshaller<RemovePrivateLinkResult, StaxUnmarshallerContext> {
    @Override
    public RemovePrivateLinkResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        RemovePrivateLinkResult removePrivateLinkResult = new RemovePrivateLinkResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return removePrivateLinkResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {
                if (context.testExpression("RequestId", targetDepth)) {
                    removePrivateLinkResult.setRequestId(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("Return", targetDepth)) {
                    removePrivateLinkResult.setReturn(SimpleTypeStaxUnmarshallers.BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return removePrivateLinkResult;
                }
            }
        }
    }

    private static RemovePrivateLinkResultStaxUnmarshaller instance;

    public static RemovePrivateLinkResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new RemovePrivateLinkResultStaxUnmarshaller();
        return instance;
    }
}
