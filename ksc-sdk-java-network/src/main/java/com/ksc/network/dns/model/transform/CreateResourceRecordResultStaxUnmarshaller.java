package com.ksc.network.dns.model.transform;

import com.ksc.network.dns.model.CreateResourceRecordResult;
import com.ksc.transform.SimpleTypeStaxUnmarshallers;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import javax.xml.stream.events.XMLEvent;

/**
 * CreateResourceRecordResult StAX Unmarshaller
 */
public class CreateResourceRecordResultStaxUnmarshaller implements Unmarshaller<CreateResourceRecordResult, StaxUnmarshallerContext> {
    @Override
    public CreateResourceRecordResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        CreateResourceRecordResult createResourceRecordResult = new CreateResourceRecordResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return createResourceRecordResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {
                if (context.testExpression("RequestId", targetDepth)) {
                    createResourceRecordResult.setRequestId(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("ResourceRecord", targetDepth)) {
                    createResourceRecordResult.setResourceRecord(ResourceRecordStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return createResourceRecordResult;
                }
            }
        }
    }

    private static CreateResourceRecordResultStaxUnmarshaller instance;

    public static CreateResourceRecordResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new CreateResourceRecordResultStaxUnmarshaller();
        return instance;
    }
}
