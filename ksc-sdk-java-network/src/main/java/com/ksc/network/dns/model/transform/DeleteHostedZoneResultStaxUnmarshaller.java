package com.ksc.network.dns.model.transform;

import com.ksc.network.dns.model.DeleteHostedZoneResult;
import com.ksc.transform.SimpleTypeStaxUnmarshallers;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import javax.xml.stream.events.XMLEvent;

/**
 * DeleteHostedZoneResult StAX Unmarshaller
 */
public class DeleteHostedZoneResultStaxUnmarshaller implements Unmarshaller<DeleteHostedZoneResult, StaxUnmarshallerContext> {
    @Override
    public DeleteHostedZoneResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        DeleteHostedZoneResult deleteHostedZoneResult = new DeleteHostedZoneResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return deleteHostedZoneResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {
                if (context.testExpression("RequestId", targetDepth)) {
                    deleteHostedZoneResult.setRequestId(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("Return", targetDepth)) {
                    deleteHostedZoneResult.setReturn(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return deleteHostedZoneResult;
                }
            }
        }
    }

    private static DeleteHostedZoneResultStaxUnmarshaller instance;

    public static DeleteHostedZoneResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new DeleteHostedZoneResultStaxUnmarshaller();
        return instance;
    }
}
