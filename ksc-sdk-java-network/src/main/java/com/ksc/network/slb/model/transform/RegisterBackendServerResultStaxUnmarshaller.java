package com.ksc.network.slb.model.transform;

import com.ksc.network.slb.model.RegisterBackendServerResult;
import com.ksc.transform.SimpleTypeStaxUnmarshallers;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import javax.xml.stream.events.XMLEvent;

/**
 * RegisterBackendServerResult StAX Unmarshaller
 */
public class RegisterBackendServerResultStaxUnmarshaller implements Unmarshaller<RegisterBackendServerResult, StaxUnmarshallerContext> {
    @Override
    public RegisterBackendServerResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        RegisterBackendServerResult registerBackendServerResult = new RegisterBackendServerResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return registerBackendServerResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {
                if (context.testExpression("RequestId", targetDepth)) {
                    registerBackendServerResult.setRequestId(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("BackendServer", targetDepth)) {
                    registerBackendServerResult.setBackendServer(BackendServerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return registerBackendServerResult;
                }
            }
        }
    }

    private static RegisterBackendServerResultStaxUnmarshaller instance;

    public static RegisterBackendServerResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new RegisterBackendServerResultStaxUnmarshaller();
        return instance;
    }
}
