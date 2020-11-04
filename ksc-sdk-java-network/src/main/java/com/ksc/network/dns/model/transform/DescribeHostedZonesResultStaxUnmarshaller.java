package com.ksc.network.dns.model.transform;

import com.ksc.network.dns.model.DescribeHostedZonesResult;
import com.ksc.transform.SimpleTypeStaxUnmarshallers;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import javax.xml.stream.events.XMLEvent;

/**
 * DescribeHostedZonesResult StAX Unmarshaller
 */
public class DescribeHostedZonesResultStaxUnmarshaller implements Unmarshaller<DescribeHostedZonesResult, StaxUnmarshallerContext> {
    @Override
    public DescribeHostedZonesResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        DescribeHostedZonesResult describeHostedZonesResult = new DescribeHostedZonesResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return describeHostedZonesResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {
                if (context.testExpression("RequestId", targetDepth)) {
                    describeHostedZonesResult.setRequestId(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("HostedZoneSet/HostedZone", targetDepth)) {
                    describeHostedZonesResult.addHostedZoneSet(HostedZoneStaxUnmarshaller.getInstance().unmarshall(context));
					continue;
				}
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return describeHostedZonesResult;
                }
            }
        }
    }

    private static DescribeHostedZonesResultStaxUnmarshaller instance;

    public static DescribeHostedZonesResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeHostedZonesResultStaxUnmarshaller();
        return instance;
    }
}
