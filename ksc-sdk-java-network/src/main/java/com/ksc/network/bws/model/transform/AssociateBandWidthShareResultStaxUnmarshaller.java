package com.ksc.network.bws.model.transform;

import com.ksc.network.bws.model.AssociateBandWidthShareResult;
import com.ksc.transform.SimpleTypeStaxUnmarshallers;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import javax.xml.stream.events.XMLEvent;

/**
 * AssociateBandWidthShareResult StAX Unmarshaller
 */
public class AssociateBandWidthShareResultStaxUnmarshaller implements Unmarshaller<AssociateBandWidthShareResult, StaxUnmarshallerContext> {
    @Override
    public AssociateBandWidthShareResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        AssociateBandWidthShareResult associateBandWidthShareResult = new AssociateBandWidthShareResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return associateBandWidthShareResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {
                if (context.testExpression("RequestId", targetDepth)) {
                    associateBandWidthShareResult.setRequestId(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("Return", targetDepth)) {
                    associateBandWidthShareResult.setReturn(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return associateBandWidthShareResult;
                }
            }
        }
    }

    private static AssociateBandWidthShareResultStaxUnmarshaller instance;

    public static AssociateBandWidthShareResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new AssociateBandWidthShareResultStaxUnmarshaller();
        return instance;
    }
}
