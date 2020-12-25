package com.ksc.network.dns.model.transform;

import com.ksc.network.dns.model.DescribeResourceRecordsResult;
import com.ksc.transform.SimpleTypeStaxUnmarshallers;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import javax.xml.stream.events.XMLEvent;

/**
 * DescribeResourceRecordsResult StAX Unmarshaller
 */
public class DescribeResourceRecordsResultStaxUnmarshaller implements Unmarshaller<DescribeResourceRecordsResult, StaxUnmarshallerContext> {
    @Override
    public DescribeResourceRecordsResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        DescribeResourceRecordsResult describeResourceRecordsResult = new DescribeResourceRecordsResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return describeResourceRecordsResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {
                if (context.testExpression("RequestId", targetDepth)) {
                    describeResourceRecordsResult.setRequestId(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("TotalCount", targetDepth)) {
                    describeResourceRecordsResult.setTotalCount(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("NextToken", targetDepth)) {
                    describeResourceRecordsResult.setNextToken(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("ResourceRecordSet/Item", targetDepth)) {
                    describeResourceRecordsResult.addResourceRecordSet(ResourceRecordStaxUnmarshaller.getInstance().unmarshall(context));
					continue;
				}
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return describeResourceRecordsResult;
                }
            }
        }
    }

    private static DescribeResourceRecordsResultStaxUnmarshaller instance;

    public static DescribeResourceRecordsResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeResourceRecordsResultStaxUnmarshaller();
        return instance;
    }
}
