package com.ksc.kec.model.transform;

import com.ksc.kec.model.DetachKeyResult;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import javax.xml.stream.events.XMLEvent;

public class DetachKeyResultStaxUnmarshaller implements
        Unmarshaller<DetachKeyResult, StaxUnmarshallerContext> {

    public DetachKeyResult unmarshall(StaxUnmarshallerContext context)
            throws Exception {
        DetachKeyResult detachKeyResult = new DetachKeyResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return detachKeyResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {
                // no use reservation
                if (context.testExpression("InstancesSet/Item", targetDepth)) {
                    detachKeyResult.withInstancesSet(KeyItemStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("RequestId", targetDepth)) {
                    detachKeyResult.setRequestId(StringStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return detachKeyResult;
                }
            }
        }
    }

    private static DetachKeyResultStaxUnmarshaller instance;

    public static DetachKeyResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new DetachKeyResultStaxUnmarshaller();
        return instance;
    }
}
