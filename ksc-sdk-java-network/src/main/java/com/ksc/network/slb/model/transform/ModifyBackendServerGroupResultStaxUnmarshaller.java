package com.ksc.network.slb.model.transform;

import com.ksc.network.slb.model.ModifyBackendServerGroupResult;
import com.ksc.transform.SimpleTypeStaxUnmarshallers;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import javax.xml.stream.events.XMLEvent;

/**
 * ModifyBackendServerGroupResult StAX Unmarshaller
 */
public class ModifyBackendServerGroupResultStaxUnmarshaller implements Unmarshaller<ModifyBackendServerGroupResult, StaxUnmarshallerContext> {
    @Override
    public ModifyBackendServerGroupResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        ModifyBackendServerGroupResult modifyBackendServerGroupResult = new ModifyBackendServerGroupResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return modifyBackendServerGroupResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {
                if (context.testExpression("RequestId", targetDepth)) {
                    modifyBackendServerGroupResult.setRequestId(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("BackendServerGroup", targetDepth)) {
                    modifyBackendServerGroupResult.setBackendServerGroup(BackendServerGroupStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return modifyBackendServerGroupResult;
                }
            }
        }
    }

    private static ModifyBackendServerGroupResultStaxUnmarshaller instance;

    public static ModifyBackendServerGroupResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new ModifyBackendServerGroupResultStaxUnmarshaller();
        return instance;
    }
}
