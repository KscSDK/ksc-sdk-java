package com.ksc.network.bws.model.transform;

import com.ksc.network.bws.model.AssociateBandWidthShareInfo;
import com.ksc.transform.SimpleTypeStaxUnmarshallers;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import javax.xml.stream.events.XMLEvent;

public class AssociateBandWidthShareInfoStaxUnmarshaller implements Unmarshaller<AssociateBandWidthShareInfo, StaxUnmarshallerContext> {
    private static AssociateBandWidthShareInfoStaxUnmarshaller instance;

    public static AssociateBandWidthShareInfoStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new AssociateBandWidthShareInfoStaxUnmarshaller();
        return instance;
    }

    @Override
    public AssociateBandWidthShareInfo unmarshall(StaxUnmarshallerContext context) throws Exception {
        AssociateBandWidthShareInfo AssociateBandWidthShareInfo = new AssociateBandWidthShareInfo();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;
        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return AssociateBandWidthShareInfo;
            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("AllocationId", targetDepth)) {
                    AssociateBandWidthShareInfo.setAllocationId(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return AssociateBandWidthShareInfo;
                }
            }
        }
    }
}
