package com.ksc.network.slb.model.transform;

import com.ksc.network.slb.model.ModifyBackendServerResult;
import com.ksc.transform.SimpleTypeStaxUnmarshallers;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import javax.xml.stream.events.XMLEvent;

/**
 * ModifyBackendServerResult StAX Unmarshaller
 */
public class ModifyBackendServerResultStaxUnmarshaller implements Unmarshaller<ModifyBackendServerResult, StaxUnmarshallerContext> {
    @Override
    public ModifyBackendServerResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        ModifyBackendServerResult modifyBackendServerResult = new ModifyBackendServerResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return modifyBackendServerResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {
                if (context.testExpression("RequestId", targetDepth)) {
                    modifyBackendServerResult.setRequestId(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("BackendServer", targetDepth)) {
                    modifyBackendServerResult.setBackendServer(BackendServerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return modifyBackendServerResult;
                }
            }
        }
    }

    private static ModifyBackendServerResultStaxUnmarshaller instance;

    public static ModifyBackendServerResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new ModifyBackendServerResultStaxUnmarshaller();
        return instance;
    }
}
