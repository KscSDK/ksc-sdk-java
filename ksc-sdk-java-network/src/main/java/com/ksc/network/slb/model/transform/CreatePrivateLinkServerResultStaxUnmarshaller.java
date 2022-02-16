package com.ksc.network.slb.model.transform;

import com.ksc.network.slb.model.CreatePrivateLinkServerResult;
import com.ksc.transform.SimpleTypeStaxUnmarshallers;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import javax.xml.stream.events.XMLEvent;

/**
 * CreatePrivateLinkServerResult StAX Unmarshaller
 */
public class CreatePrivateLinkServerResultStaxUnmarshaller implements Unmarshaller<CreatePrivateLinkServerResult, StaxUnmarshallerContext> {
    @Override
    public CreatePrivateLinkServerResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        CreatePrivateLinkServerResult createPrivateLinkServerResult = new CreatePrivateLinkServerResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return createPrivateLinkServerResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {
                if (context.testExpression("RequestId", targetDepth)) {
                    createPrivateLinkServerResult.setRequestId(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("PrivateLinkServer", targetDepth)) {
                    createPrivateLinkServerResult.setPrivateLinkServer(PrivateLinkServerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return createPrivateLinkServerResult;
                }
            }
        }
    }

    private static CreatePrivateLinkServerResultStaxUnmarshaller instance;

    public static CreatePrivateLinkServerResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new CreatePrivateLinkServerResultStaxUnmarshaller();
        return instance;
    }
}
