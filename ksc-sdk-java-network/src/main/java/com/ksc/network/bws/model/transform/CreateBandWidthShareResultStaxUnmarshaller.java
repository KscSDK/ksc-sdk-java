package com.ksc.network.bws.model.transform;

import com.ksc.network.bws.model.CreateBandWidthShareResult;
import com.ksc.transform.SimpleTypeStaxUnmarshallers;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import javax.xml.stream.events.XMLEvent;

/**
 * CreateBandWidthShareResult StAX Unmarshaller
 */
public class CreateBandWidthShareResultStaxUnmarshaller implements Unmarshaller<CreateBandWidthShareResult, StaxUnmarshallerContext> {
    @Override
    public CreateBandWidthShareResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        CreateBandWidthShareResult createBandWidthShareResult = new CreateBandWidthShareResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return createBandWidthShareResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {
                if (context.testExpression("RequestId", targetDepth)) {
                    createBandWidthShareResult.setRequestId(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("BandWidthShareId", targetDepth)) {
                    createBandWidthShareResult.setBandWidthShareId(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return createBandWidthShareResult;
                }
            }
        }
    }

    private static CreateBandWidthShareResultStaxUnmarshaller instance;

    public static CreateBandWidthShareResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new CreateBandWidthShareResultStaxUnmarshaller();
        return instance;
    }
}
