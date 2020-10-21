package com.ksc.network.bws.model.transform;

import com.ksc.network.bws.model.BandWidthShare;
import com.ksc.transform.SimpleTypeStaxUnmarshallers;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import javax.xml.stream.events.XMLEvent;

public class BandWidthShareStaxUnmarshaller implements Unmarshaller<BandWidthShare, StaxUnmarshallerContext> {
    private static BandWidthShareStaxUnmarshaller instance;

    public static BandWidthShareStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new BandWidthShareStaxUnmarshaller();
        return instance;
    }

    @Override
    public BandWidthShare unmarshall(StaxUnmarshallerContext context) throws Exception {
        BandWidthShare BandWidthShare = new BandWidthShare();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;
        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return BandWidthShare;
            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("CreateTime", targetDepth)) {
                    BandWidthShare.setCreateTime(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("ProjectId", targetDepth)) {
                    BandWidthShare.setProjectId(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("BandWidthShareName", targetDepth)) {
                    BandWidthShare.setBandWidthShareName(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("BandWidthShareId", targetDepth)) {
                    BandWidthShare.setBandWidthShareId(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("LineId", targetDepth)) {
                    BandWidthShare.setLineId(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("BandWidth", targetDepth)) {
                    BandWidthShare.setBandWidth(SimpleTypeStaxUnmarshallers.IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                    if (context.testExpression("AssociateBandWidthShareInfoSet", targetDepth)) {
                    BandWidthShare.addAssociateBandWidthShareInfoSet(AssociateBandWidthShareInfoStaxUnmarshaller.getInstance().unmarshall(context));
					continue;
				}
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return BandWidthShare;
                }
            }
        }
    }
}
