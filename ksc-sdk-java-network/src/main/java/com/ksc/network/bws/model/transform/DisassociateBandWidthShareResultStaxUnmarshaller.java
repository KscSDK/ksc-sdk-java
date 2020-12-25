package com.ksc.network.bws.model.transform;

import com.ksc.network.bws.model.DisassociateBandWidthShareResult;
import com.ksc.transform.SimpleTypeStaxUnmarshallers;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import javax.xml.stream.events.XMLEvent;

/**
 * DisassociateBandWidthShareResult StAX Unmarshaller
 */
public class DisassociateBandWidthShareResultStaxUnmarshaller implements Unmarshaller<DisassociateBandWidthShareResult, StaxUnmarshallerContext> {
    @Override
    public DisassociateBandWidthShareResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        DisassociateBandWidthShareResult disassociateBandWidthShareResult = new DisassociateBandWidthShareResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return disassociateBandWidthShareResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {
                if (context.testExpression("RequestId", targetDepth)) {
                    disassociateBandWidthShareResult.setRequestId(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("Return", targetDepth)) {
                    disassociateBandWidthShareResult.setReturn(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return disassociateBandWidthShareResult;
                }
            }
        }
    }

    private static DisassociateBandWidthShareResultStaxUnmarshaller instance;

    public static DisassociateBandWidthShareResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new DisassociateBandWidthShareResultStaxUnmarshaller();
        return instance;
    }
}
