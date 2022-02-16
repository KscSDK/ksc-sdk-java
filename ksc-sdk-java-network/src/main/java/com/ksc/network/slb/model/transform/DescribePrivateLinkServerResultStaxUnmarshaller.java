package com.ksc.network.slb.model.transform;

import com.ksc.network.slb.model.DescribePrivateLinkServerResult;
import com.ksc.transform.SimpleTypeStaxUnmarshallers;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import javax.xml.stream.events.XMLEvent;

public class DescribePrivateLinkServerResultStaxUnmarshaller
        implements Unmarshaller<DescribePrivateLinkServerResult, StaxUnmarshallerContext> {

    @Override
    public DescribePrivateLinkServerResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        DescribePrivateLinkServerResult describePrivateLinkServerResult = new DescribePrivateLinkServerResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return describePrivateLinkServerResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("PrivateLinkServerSet/item", targetDepth)) {
                    describePrivateLinkServerResult
                            .addPrivateLinkServers(PrivateLinkServerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                } else if (context.testExpression("RequestId", targetDepth)) {
                    describePrivateLinkServerResult.setRequestId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                } else if (context.testExpression("NextToken", targetDepth)) {
                    describePrivateLinkServerResult.setNextToken(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return describePrivateLinkServerResult;
                }
            }
        }
    }

    private static DescribePrivateLinkServerResultStaxUnmarshaller instance;

    public static DescribePrivateLinkServerResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribePrivateLinkServerResultStaxUnmarshaller();
        return instance;
    }

}
