package com.ksc.kec.model.transform;

import com.ksc.kec.model.ModifyInstanceAutoDeleteTimeResult;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.BooleanStaxUnmarshaller;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import javax.xml.stream.events.XMLEvent;

/**
 * ModifyInstanceAutoDeleteTimeResult StAX Unmarshaller
 */
public class ModifyInstanceAutoDeleteTimeResultStaxUnmarshaller implements
        Unmarshaller<ModifyInstanceAutoDeleteTimeResult, StaxUnmarshallerContext> {

    public ModifyInstanceAutoDeleteTimeResult unmarshall(StaxUnmarshallerContext context)
            throws Exception {
        ModifyInstanceAutoDeleteTimeResult modifyInstanceAutoDeleteTimeResult = new ModifyInstanceAutoDeleteTimeResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return modifyInstanceAutoDeleteTimeResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {
                // no use reservation
                if (context.testExpression("Return", targetDepth)) {
                    modifyInstanceAutoDeleteTimeResult.setReturn(BooleanStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("RequestId", targetDepth)) {
                    modifyInstanceAutoDeleteTimeResult.setRequestId(StringStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return modifyInstanceAutoDeleteTimeResult;
                }
            }
        }
    }

    private static ModifyInstanceAutoDeleteTimeResultStaxUnmarshaller instance;

    public static ModifyInstanceAutoDeleteTimeResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new ModifyInstanceAutoDeleteTimeResultStaxUnmarshaller();
        return instance;
    }
}
