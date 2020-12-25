package com.ksc.network.slb.model.transform;

import com.ksc.network.slb.model.CreateHostHeaderResult;
import com.ksc.transform.SimpleTypeStaxUnmarshallers;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import javax.xml.stream.events.XMLEvent;

/**
 * CreateHostHeaderResult StAX Unmarshaller
 */
public class CreateHostHeaderResultStaxUnMarshaller implements Unmarshaller<CreateHostHeaderResult, StaxUnmarshallerContext> {
    @Override
    public CreateHostHeaderResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        CreateHostHeaderResult createHostHeaderResult = new CreateHostHeaderResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return createHostHeaderResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {
                if (context.testExpression("HostHeader", targetDepth)) {
                    createHostHeaderResult
                            .setHostHeader(HostHeaderStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                } else if (context.testExpression("RequestId", targetDepth)) {
                    createHostHeaderResult.setRequestId(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return createHostHeaderResult;
                }
            }
        }
    }

    private static CreateHostHeaderResultStaxUnMarshaller instance;

    public static CreateHostHeaderResultStaxUnMarshaller getInstance() {
        if (instance == null)
            instance = new CreateHostHeaderResultStaxUnMarshaller();
        return instance;
    }
}
