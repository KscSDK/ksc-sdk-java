package com.ksc.network.slb.model.transform;

import com.ksc.network.slb.model.DescribeBackendServersResult;
import com.ksc.transform.SimpleTypeStaxUnmarshallers;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import javax.xml.stream.events.XMLEvent;

/**
 * DescribeBackendServersResult StAX Unmarshaller
 */
public class DescribeBackendServersResultStaxUnmarshaller implements Unmarshaller<DescribeBackendServersResult, StaxUnmarshallerContext> {
    @Override
    public DescribeBackendServersResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        DescribeBackendServersResult describeBackendServersResult = new DescribeBackendServersResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return describeBackendServersResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {
                if (context.testExpression("RequestId", targetDepth)) {
                    describeBackendServersResult.setRequestId(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("BackendServerSet/BackendServer", targetDepth)) {
                    describeBackendServersResult.addBackendServerSet(BackendServerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("NextToken", targetDepth)) {
                    describeBackendServersResult.setNextToken(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return describeBackendServersResult;
                }
            }
        }
    }

    private static DescribeBackendServersResultStaxUnmarshaller instance;

    public static DescribeBackendServersResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeBackendServersResultStaxUnmarshaller();
        return instance;
    }
}
