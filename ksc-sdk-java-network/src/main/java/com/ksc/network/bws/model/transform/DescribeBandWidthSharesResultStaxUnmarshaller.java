package com.ksc.network.bws.model.transform;

import com.ksc.network.bws.model.DescribeBandWidthSharesResult;
import com.ksc.transform.SimpleTypeStaxUnmarshallers;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import javax.xml.stream.events.XMLEvent;

/**
 * DescribeBandWidthSharesResult StAX Unmarshaller
 */
public class DescribeBandWidthSharesResultStaxUnmarshaller implements Unmarshaller<DescribeBandWidthSharesResult, StaxUnmarshallerContext> {
    @Override
    public DescribeBandWidthSharesResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        DescribeBandWidthSharesResult describeBandWidthSharesResult = new DescribeBandWidthSharesResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return describeBandWidthSharesResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {
                if (context.testExpression("RequestId", targetDepth)) {
                    describeBandWidthSharesResult.setRequestId(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("BandWidthShareSet/item", targetDepth)) {
                    describeBandWidthSharesResult.addBandWidthShareSet(BandWidthShareStaxUnmarshaller.getInstance().unmarshall(context));
					continue;
				}
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return describeBandWidthSharesResult;
                }
            }
        }
    }

    private static DescribeBandWidthSharesResultStaxUnmarshaller instance;

    public static DescribeBandWidthSharesResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeBandWidthSharesResultStaxUnmarshaller();
        return instance;
    }
}
