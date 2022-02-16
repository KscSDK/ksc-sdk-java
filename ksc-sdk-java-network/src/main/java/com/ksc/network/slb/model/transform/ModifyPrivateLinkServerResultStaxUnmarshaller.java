package com.ksc.network.slb.model.transform;

import com.ksc.network.slb.model.ModifyPrivateLinkServerResult;
import com.ksc.transform.SimpleTypeStaxUnmarshallers;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import javax.xml.stream.events.XMLEvent;

/**
 * ModifyPrivateLinkServerResult StAX Unmarshaller
 */
public class ModifyPrivateLinkServerResultStaxUnmarshaller implements Unmarshaller<ModifyPrivateLinkServerResult, StaxUnmarshallerContext> {
    @Override
    public ModifyPrivateLinkServerResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        ModifyPrivateLinkServerResult modifyPrivateLinkServerResult = new ModifyPrivateLinkServerResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return modifyPrivateLinkServerResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {
                if (context.testExpression("RequestId", targetDepth)) {
                    modifyPrivateLinkServerResult.setRequestId(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("PrivateLinkServer", targetDepth)) {
                    modifyPrivateLinkServerResult.setPrivateLinkServer(PrivateLinkServerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return modifyPrivateLinkServerResult;
                }
            }
        }
    }

    private static ModifyPrivateLinkServerResultStaxUnmarshaller instance;

    public static ModifyPrivateLinkServerResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new ModifyPrivateLinkServerResultStaxUnmarshaller();
        return instance;
    }
}
