package com.ksc.network.slb.model.transform;

import com.ksc.network.slb.model.RejectPrivateLinkResult;
import com.ksc.transform.SimpleTypeStaxUnmarshallers;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import javax.xml.stream.events.XMLEvent;

/**
 * RejectPrivateLink StAX Unmarshaller
 */
public class RejectPrivateLinkResultStaxUnmarshaller implements Unmarshaller<RejectPrivateLinkResult, StaxUnmarshallerContext> {
    @Override
    public RejectPrivateLinkResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        RejectPrivateLinkResult rejectPrivateLinkResult = new RejectPrivateLinkResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return rejectPrivateLinkResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {
                if (context.testExpression("RequestId", targetDepth)) {
                    rejectPrivateLinkResult.setRequestId(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("Return", targetDepth)) {
                    rejectPrivateLinkResult.setReturn(SimpleTypeStaxUnmarshallers.BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return rejectPrivateLinkResult;
                }
            }
        }
    }

    private static RejectPrivateLinkResultStaxUnmarshaller instance;

    public static RejectPrivateLinkResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new RejectPrivateLinkResultStaxUnmarshaller();
        return instance;
    }
}
