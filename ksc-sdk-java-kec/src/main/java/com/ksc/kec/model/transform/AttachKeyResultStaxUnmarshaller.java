package com.ksc.kec.model.transform;

import com.ksc.kec.model.AttachKeyResult;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import javax.xml.stream.events.XMLEvent;

public class AttachKeyResultStaxUnmarshaller implements
        Unmarshaller<AttachKeyResult, StaxUnmarshallerContext> {

    public AttachKeyResult unmarshall(StaxUnmarshallerContext context)
            throws Exception {
        AttachKeyResult attachKeyResult = new AttachKeyResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return attachKeyResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {
                // no use reservation
                if (context.testExpression("InstancesSet/Item", targetDepth)) {
                    attachKeyResult.withInstancesSet(KeyItemStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("RequestId", targetDepth)) {
                    attachKeyResult.setRequestId(StringStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return attachKeyResult;
                }
            }
        }
    }

    private static AttachKeyResultStaxUnmarshaller instance;

    public static AttachKeyResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new AttachKeyResultStaxUnmarshaller();
        return instance;
    }
}
