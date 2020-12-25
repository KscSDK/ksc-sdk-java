package com.ksc.network.dns.model.transform;

import com.ksc.network.dns.model.ModifyResourceRecordResult;
import com.ksc.transform.SimpleTypeStaxUnmarshallers;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import javax.xml.stream.events.XMLEvent;

/**
 * ModifyResourceRecordResult StAX Unmarshaller
 */
public class ModifyResourceRecordResultStaxUnmarshaller implements Unmarshaller<ModifyResourceRecordResult, StaxUnmarshallerContext> {
    @Override
    public ModifyResourceRecordResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        ModifyResourceRecordResult modifyResourceRecordResult = new ModifyResourceRecordResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return modifyResourceRecordResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {
                if (context.testExpression("RequestId", targetDepth)) {
                    modifyResourceRecordResult.setRequestId(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("ResourceRecord", targetDepth)) {
                    modifyResourceRecordResult.setResourceRecord(ResourceRecordStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return modifyResourceRecordResult;
                }
            }
        }
    }

    private static ModifyResourceRecordResultStaxUnmarshaller instance;

    public static ModifyResourceRecordResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new ModifyResourceRecordResultStaxUnmarshaller();
        return instance;
    }
}
