package com.ksc.network.slb.model.transform;

import com.ksc.network.slb.model.DescribeBackendServerGroupsResult;
import com.ksc.transform.SimpleTypeStaxUnmarshallers;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import javax.xml.stream.events.XMLEvent;

/**
 * DescribeBackendServerGroupsResult StAX Unmarshaller
 */
public class DescribeBackendServerGroupsResultStaxUnmarshaller implements Unmarshaller<DescribeBackendServerGroupsResult, StaxUnmarshallerContext> {
    @Override
    public DescribeBackendServerGroupsResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        DescribeBackendServerGroupsResult describeBackendServerGroupsResult = new DescribeBackendServerGroupsResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return describeBackendServerGroupsResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {
                if (context.testExpression("RequestId", targetDepth)) {
                    describeBackendServerGroupsResult.setRequestId(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("BackendServerGroupSet/BackendServerGroup", targetDepth)) {
                    describeBackendServerGroupsResult.addBackendServerGroupSet(BackendServerGroupStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("NextToken", targetDepth)) {
                    describeBackendServerGroupsResult.setNextToken(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return describeBackendServerGroupsResult;
                }
            }
        }
    }

    private static DescribeBackendServerGroupsResultStaxUnmarshaller instance;

    public static DescribeBackendServerGroupsResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeBackendServerGroupsResultStaxUnmarshaller();
        return instance;
    }
}
