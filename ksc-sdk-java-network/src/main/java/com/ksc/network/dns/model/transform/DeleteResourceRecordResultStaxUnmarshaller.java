package com.ksc.network.dns.model.transform;

import com.ksc.network.dns.model.DeleteResourceRecordResult;
import com.ksc.transform.SimpleTypeStaxUnmarshallers;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import javax.xml.stream.events.XMLEvent;

/**
 * DeleteResourceRecordResult StAX Unmarshaller
 */
public class DeleteResourceRecordResultStaxUnmarshaller implements Unmarshaller<DeleteResourceRecordResult, StaxUnmarshallerContext> {
    @Override
    public DeleteResourceRecordResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        DeleteResourceRecordResult deleteResourceRecordResult = new DeleteResourceRecordResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return deleteResourceRecordResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {
                if (context.testExpression("RequestId", targetDepth)) {
                    deleteResourceRecordResult.setRequestId(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("Return", targetDepth)) {
                    deleteResourceRecordResult.setReturn(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return deleteResourceRecordResult;
                }
            }
        }
    }

    private static DeleteResourceRecordResultStaxUnmarshaller instance;

    public static DeleteResourceRecordResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new DeleteResourceRecordResultStaxUnmarshaller();
        return instance;
    }
}
