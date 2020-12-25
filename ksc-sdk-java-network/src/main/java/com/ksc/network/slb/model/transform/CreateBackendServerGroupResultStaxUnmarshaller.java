package com.ksc.network.slb.model.transform;

import com.ksc.network.slb.model.CreateBackendServerGroupResult;
import com.ksc.transform.SimpleTypeStaxUnmarshallers;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import javax.xml.stream.events.XMLEvent;

/**
 * CreateBackendServerGroupResult StAX Unmarshaller
 */
public class CreateBackendServerGroupResultStaxUnmarshaller implements Unmarshaller<CreateBackendServerGroupResult, StaxUnmarshallerContext> {
    @Override
    public CreateBackendServerGroupResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        CreateBackendServerGroupResult createBackendServerGroupResult = new CreateBackendServerGroupResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return createBackendServerGroupResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {
                if (context.testExpression("RequestId", targetDepth)) {
                    createBackendServerGroupResult.setRequestId(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("BackendServerGroup", targetDepth)) {
                    createBackendServerGroupResult.setBackendServerGroup(BackendServerGroupStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return createBackendServerGroupResult;
                }
            }
        }
    }

    private static CreateBackendServerGroupResultStaxUnmarshaller instance;

    public static CreateBackendServerGroupResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new CreateBackendServerGroupResultStaxUnmarshaller();
        return instance;
    }
}
