package com.ksc.network.slb.model.transform;

import com.ksc.network.slb.model.DeleteHostHeaderResult;
import com.ksc.transform.SimpleTypeStaxUnmarshallers;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import javax.xml.stream.events.XMLEvent;

/**
 * DeleteHostHeaderResult StAX Unmarshaller
 */
public class DeleteHostHeaderResultStaxUnmarshaller implements Unmarshaller<DeleteHostHeaderResult, StaxUnmarshallerContext> {
    @Override
    public DeleteHostHeaderResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        DeleteHostHeaderResult DeleteHostHeaderResult = new DeleteHostHeaderResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return DeleteHostHeaderResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {
                if (context.testExpression("RequestId", targetDepth)) {
                    DeleteHostHeaderResult.setRequestId(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("Return", targetDepth)) {
                    DeleteHostHeaderResult.setReturn(SimpleTypeStaxUnmarshallers.BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return DeleteHostHeaderResult;
                }
            }
        }
    }

    private static DeleteHostHeaderResultStaxUnmarshaller instance;

    public static DeleteHostHeaderResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new DeleteHostHeaderResultStaxUnmarshaller();
        return instance;
    }
}
