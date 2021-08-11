package com.ksc.network.slb.model.transform;

import com.ksc.network.slb.model.DeletePrivateLinkServerResult;
import com.ksc.transform.SimpleTypeStaxUnmarshallers;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import javax.xml.stream.events.XMLEvent;

/**
 * DeletePrivateLinkServer StAX Unmarshaller
 */
public class DeletePrivateLinkServerResultStaxUnmarshaller implements Unmarshaller<DeletePrivateLinkServerResult, StaxUnmarshallerContext> {
    @Override
    public DeletePrivateLinkServerResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        DeletePrivateLinkServerResult deletePrivateLinkServerResult = new DeletePrivateLinkServerResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return deletePrivateLinkServerResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {
                if (context.testExpression("RequestId", targetDepth)) {
                    deletePrivateLinkServerResult.setRequestId(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("Return", targetDepth)) {
                    deletePrivateLinkServerResult.setReturn(SimpleTypeStaxUnmarshallers.BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return deletePrivateLinkServerResult;
                }
            }
        }
    }

    private static DeletePrivateLinkServerResultStaxUnmarshaller instance;

    public static DeletePrivateLinkServerResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new DeletePrivateLinkServerResultStaxUnmarshaller();
        return instance;
    }
}
