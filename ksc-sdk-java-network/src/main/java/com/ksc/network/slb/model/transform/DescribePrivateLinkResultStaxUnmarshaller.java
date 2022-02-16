package com.ksc.network.slb.model.transform;

import com.ksc.network.slb.model.DescribePrivateLinkResult;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import javax.xml.stream.events.XMLEvent;

public class DescribePrivateLinkResultStaxUnmarshaller
        implements Unmarshaller<DescribePrivateLinkResult, StaxUnmarshallerContext> {

    @Override
    public DescribePrivateLinkResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        DescribePrivateLinkResult describePrivateLinkResult = new DescribePrivateLinkResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return describePrivateLinkResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("PrivateLinkSet/item", targetDepth)) {
                    describePrivateLinkResult
                            .addPrivateLinks(PrivateLinkStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                } else if (context.testExpression("RequestId", targetDepth)) {
                    describePrivateLinkResult.setRequestId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                } else if (context.testExpression("NextToken", targetDepth)) {
                    describePrivateLinkResult.setNextToken(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return describePrivateLinkResult;
                }
            }
        }
    }

    private static DescribePrivateLinkResultStaxUnmarshaller instance;

    public static DescribePrivateLinkResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribePrivateLinkResultStaxUnmarshaller();
        return instance;
    }

}
