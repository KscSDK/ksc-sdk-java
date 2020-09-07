package com.ksc.network.slb.model.transform;

import com.ksc.network.slb.model.DescribeHostHeadersResult;
import com.ksc.transform.SimpleTypeStaxUnmarshallers;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import javax.xml.stream.events.XMLEvent;

/**
 * DescribeHostHeadersResult StAX Unmarshaller
 */
public class DescribeHostHeadersResultStaxUnmarshaller implements Unmarshaller<DescribeHostHeadersResult, StaxUnmarshallerContext> {
    @Override
    public DescribeHostHeadersResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        DescribeHostHeadersResult describeHostHeadersResult = new DescribeHostHeadersResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return describeHostHeadersResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {
                if (context.testExpression("RequestId", targetDepth)) {
                    describeHostHeadersResult.setRequestId(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("HostHeaderSet/HostHeader", targetDepth)) {
                    describeHostHeadersResult.addHostHeaderSet(HostHeaderStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return describeHostHeadersResult;
                }
            }
        }
    }

    private static DescribeHostHeadersResultStaxUnmarshaller instance;

    public static DescribeHostHeadersResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeHostHeadersResultStaxUnmarshaller();
        return instance;
    }
}
