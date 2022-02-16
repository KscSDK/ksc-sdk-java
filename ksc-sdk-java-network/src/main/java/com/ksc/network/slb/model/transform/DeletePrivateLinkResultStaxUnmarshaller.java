package com.ksc.network.slb.model.transform;

import com.ksc.network.slb.model.DeletePrivateLinkResult;
import com.ksc.transform.SimpleTypeStaxUnmarshallers;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import javax.xml.stream.events.XMLEvent;

/**
 * DeletePrivateLink StAX Unmarshaller
 */
public class DeletePrivateLinkResultStaxUnmarshaller implements Unmarshaller<DeletePrivateLinkResult, StaxUnmarshallerContext> {
    @Override
    public DeletePrivateLinkResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        DeletePrivateLinkResult deletePrivateLinkResult = new DeletePrivateLinkResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return deletePrivateLinkResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {
                if (context.testExpression("RequestId", targetDepth)) {
                    deletePrivateLinkResult.setRequestId(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("Return", targetDepth)) {
                    deletePrivateLinkResult.setReturn(SimpleTypeStaxUnmarshallers.BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return deletePrivateLinkResult;
                }
            }
        }
    }

    private static DeletePrivateLinkResultStaxUnmarshaller instance;

    public static DeletePrivateLinkResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new DeletePrivateLinkResultStaxUnmarshaller();
        return instance;
    }
}
