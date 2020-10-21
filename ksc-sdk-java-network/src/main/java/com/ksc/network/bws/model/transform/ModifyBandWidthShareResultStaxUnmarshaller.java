package com.ksc.network.bws.model.transform;

import com.ksc.network.bws.model.ModifyBandWidthShareResult;
import com.ksc.transform.SimpleTypeStaxUnmarshallers;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import javax.xml.stream.events.XMLEvent;

/**
 * ModifyBandWidthShareResult StAX Unmarshaller
 */
public class ModifyBandWidthShareResultStaxUnmarshaller implements Unmarshaller<ModifyBandWidthShareResult, StaxUnmarshallerContext> {
    @Override
    public ModifyBandWidthShareResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        ModifyBandWidthShareResult modifyBandWidthShareResult = new ModifyBandWidthShareResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return modifyBandWidthShareResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {
                if (context.testExpression("RequestId", targetDepth)) {
                    modifyBandWidthShareResult.setRequestId(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("BandWidthShare", targetDepth)) {
                    modifyBandWidthShareResult.setBandWidthShare(BandWidthShareStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return modifyBandWidthShareResult;
                }
            }
        }
    }

    private static ModifyBandWidthShareResultStaxUnmarshaller instance;

    public static ModifyBandWidthShareResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new ModifyBandWidthShareResultStaxUnmarshaller();
        return instance;
    }
}
