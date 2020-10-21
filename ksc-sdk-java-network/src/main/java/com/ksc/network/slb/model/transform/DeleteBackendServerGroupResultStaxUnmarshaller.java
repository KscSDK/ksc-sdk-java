package com.ksc.network.slb.model.transform;

import com.ksc.network.slb.model.DeleteBackendServerGroupResult;
import com.ksc.transform.SimpleTypeStaxUnmarshallers;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import javax.xml.stream.events.XMLEvent;

/**
 * DeleteBackendServerGroupResult StAX Unmarshaller
 */
public class DeleteBackendServerGroupResultStaxUnmarshaller implements Unmarshaller<DeleteBackendServerGroupResult, StaxUnmarshallerContext> {
    @Override
    public DeleteBackendServerGroupResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        DeleteBackendServerGroupResult deleteBackendServerGroupResult = new DeleteBackendServerGroupResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return deleteBackendServerGroupResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {
                if (context.testExpression("RequestId", targetDepth)) {
                    deleteBackendServerGroupResult.setRequestId(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("Return", targetDepth)) {
                    deleteBackendServerGroupResult.setReturn(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return deleteBackendServerGroupResult;
                }
            }
        }
    }

    private static DeleteBackendServerGroupResultStaxUnmarshaller instance;

    public static DeleteBackendServerGroupResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new DeleteBackendServerGroupResultStaxUnmarshaller();
        return instance;
    }
}
