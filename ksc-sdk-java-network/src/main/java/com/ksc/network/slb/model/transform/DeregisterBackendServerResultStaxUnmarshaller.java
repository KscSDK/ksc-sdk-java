package com.ksc.network.slb.model.transform;

import com.ksc.network.slb.model.DeregisterBackendServerResult;
import com.ksc.transform.SimpleTypeStaxUnmarshallers;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import javax.xml.stream.events.XMLEvent;

/**
 * DeregisterBackendServerResult StAX Unmarshaller
 */
public class DeregisterBackendServerResultStaxUnmarshaller implements Unmarshaller<DeregisterBackendServerResult, StaxUnmarshallerContext> {
    @Override
    public DeregisterBackendServerResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        DeregisterBackendServerResult deregisterBackendServerResult = new DeregisterBackendServerResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return deregisterBackendServerResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {
                if (context.testExpression("RequestId", targetDepth)) {
                    deregisterBackendServerResult.setRequestId(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("Return", targetDepth)) {
                    deregisterBackendServerResult.setReturn(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return deregisterBackendServerResult;
                }
            }
        }
    }

    private static DeregisterBackendServerResultStaxUnmarshaller instance;

    public static DeregisterBackendServerResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new DeregisterBackendServerResultStaxUnmarshaller();
        return instance;
    }
}
