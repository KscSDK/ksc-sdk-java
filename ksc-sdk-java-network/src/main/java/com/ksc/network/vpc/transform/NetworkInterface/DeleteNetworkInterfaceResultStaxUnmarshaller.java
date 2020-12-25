package com.ksc.network.vpc.transform.NetworkInterface;

import com.ksc.network.vpc.model.NetworkInterface.DeleteNetworkInterfaceResult;
import com.ksc.transform.SimpleTypeStaxUnmarshallers;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import javax.xml.stream.events.XMLEvent;

/**
 * DeleteNetworkInterfaceResult StAX Unmarshaller
 */
public class DeleteNetworkInterfaceResultStaxUnmarshaller implements Unmarshaller<DeleteNetworkInterfaceResult, StaxUnmarshallerContext> {
    @Override
    public DeleteNetworkInterfaceResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        DeleteNetworkInterfaceResult deleteNetworkInterfaceResult = new DeleteNetworkInterfaceResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return deleteNetworkInterfaceResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {
                if (context.testExpression("RequestId", targetDepth)) {
                    deleteNetworkInterfaceResult.setRequestId(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("Return", targetDepth)) {
                    deleteNetworkInterfaceResult.setReturn(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return deleteNetworkInterfaceResult;
                }
            }
        }
    }

    private static DeleteNetworkInterfaceResultStaxUnmarshaller instance;

    public static DeleteNetworkInterfaceResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new DeleteNetworkInterfaceResultStaxUnmarshaller();
        return instance;
    }
}
