package com.ksc.network.slb.model.transform;

import com.ksc.network.slb.model.ModifyHostHeaderResult;
import com.ksc.transform.SimpleTypeStaxUnmarshallers;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import javax.xml.stream.events.XMLEvent;

/**
 * ModifyHostHeaderResult StAX Unmarshaller
 */
public class ModifyHostHeaderResultStaxUnmarshaller implements Unmarshaller<ModifyHostHeaderResult, StaxUnmarshallerContext> {
    @Override
    public ModifyHostHeaderResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        ModifyHostHeaderResult ModifyHostHeaderResult = new ModifyHostHeaderResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return ModifyHostHeaderResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {
                if (context.testExpression("RequestId", targetDepth)) {
                    ModifyHostHeaderResult.setRequestId(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("HostHeader", targetDepth)) {
                    ModifyHostHeaderResult.setHostHeader(HostHeaderStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return ModifyHostHeaderResult;
                }
            }
        }
    }

    private static ModifyHostHeaderResultStaxUnmarshaller instance;

    public static ModifyHostHeaderResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new ModifyHostHeaderResultStaxUnmarshaller();
        return instance;
    }
}
