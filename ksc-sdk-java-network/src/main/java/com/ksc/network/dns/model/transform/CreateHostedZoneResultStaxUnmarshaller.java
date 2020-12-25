package com.ksc.network.dns.model.transform;

import com.ksc.network.dns.model.CreateHostedZoneResult;
import com.ksc.transform.SimpleTypeStaxUnmarshallers;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import javax.xml.stream.events.XMLEvent;

/**
 * CreateHostedZoneResult StAX Unmarshaller
 */
public class CreateHostedZoneResultStaxUnmarshaller implements Unmarshaller<CreateHostedZoneResult, StaxUnmarshallerContext> {
    @Override
    public CreateHostedZoneResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        CreateHostedZoneResult createHostedZoneResult = new CreateHostedZoneResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return createHostedZoneResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {
                if (context.testExpression("RequestId", targetDepth)) {
                    createHostedZoneResult.setRequestId(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("HostedZone", targetDepth)) {
                    createHostedZoneResult.setHostedZone(HostedZoneStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return createHostedZoneResult;
                }
            }
        }
    }

    private static CreateHostedZoneResultStaxUnmarshaller instance;

    public static CreateHostedZoneResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new CreateHostedZoneResultStaxUnmarshaller();
        return instance;
    }
}
