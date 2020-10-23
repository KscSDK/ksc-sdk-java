package com.ksc.network.vpc.transform.NetworkInterface;

import com.ksc.network.vpc.model.NetworkInterface.CreateNetworkInterfaceResult;
import com.ksc.transform.SimpleTypeStaxUnmarshallers;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import javax.xml.stream.events.XMLEvent;

/**
 * CreateNetworkInterfaceResult StAX Unmarshaller
 */
public class CreateNetworkInterfaceResultStaxUnmarshaller implements Unmarshaller<CreateNetworkInterfaceResult, StaxUnmarshallerContext> {
    @Override
    public CreateNetworkInterfaceResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        CreateNetworkInterfaceResult createNetworkInterfaceResult = new CreateNetworkInterfaceResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return createNetworkInterfaceResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {
                if (context.testExpression("RequestId", targetDepth)) {
                    createNetworkInterfaceResult.setRequestId(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("NetworkInterfaceId", targetDepth)) {
                    createNetworkInterfaceResult.setNetworkInterfaceId(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return createNetworkInterfaceResult;
                }
            }
        }
    }

    private static CreateNetworkInterfaceResultStaxUnmarshaller instance;

    public static CreateNetworkInterfaceResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new CreateNetworkInterfaceResultStaxUnmarshaller();
        return instance;
    }
}
