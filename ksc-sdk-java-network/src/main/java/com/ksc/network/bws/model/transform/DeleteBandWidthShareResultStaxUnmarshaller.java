package com.ksc.network.bws.model.transform;

import com.ksc.network.bws.model.DeleteBandWidthShareResult;
import com.ksc.transform.SimpleTypeStaxUnmarshallers;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import javax.xml.stream.events.XMLEvent;

/**
 * DeleteBandWidthShareResult StAX Unmarshaller
 */
public class DeleteBandWidthShareResultStaxUnmarshaller implements Unmarshaller<DeleteBandWidthShareResult, StaxUnmarshallerContext> {
    @Override
    public DeleteBandWidthShareResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        DeleteBandWidthShareResult deleteBandWidthShareResult = new DeleteBandWidthShareResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return deleteBandWidthShareResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {
                if (context.testExpression("RequestId", targetDepth)) {
                    deleteBandWidthShareResult.setRequestId(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("Return", targetDepth)) {
                    deleteBandWidthShareResult.setReturn(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return deleteBandWidthShareResult;
                }
            }
        }
    }

    private static DeleteBandWidthShareResultStaxUnmarshaller instance;

    public static DeleteBandWidthShareResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new DeleteBandWidthShareResultStaxUnmarshaller();
        return instance;
    }
}
