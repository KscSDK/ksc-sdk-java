package com.ksc.network.slb.model.transform;

import com.ksc.network.slb.model.DescribeRulesResult;
import com.ksc.transform.SimpleTypeStaxUnmarshallers;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import javax.xml.stream.events.XMLEvent;

/**
 * DescribeRulesResult StAX Unmarshaller
 */
public class DescribeRulesResultStaxUnmarshaller implements Unmarshaller<DescribeRulesResult, StaxUnmarshallerContext> {
    @Override
    public DescribeRulesResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        DescribeRulesResult describeRulesResult = new DescribeRulesResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return describeRulesResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {
                if (context.testExpression("RequestId", targetDepth)) {
                    describeRulesResult.setRequestId(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("RuleSet/Rule", targetDepth)) {
                    describeRulesResult.addRuleSet(RuleStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("NextToken", targetDepth)) {
                    describeRulesResult.setNextToken(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return describeRulesResult;
                }
            }
        }
    }

    private static DescribeRulesResultStaxUnmarshaller instance;

    public static DescribeRulesResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeRulesResultStaxUnmarshaller();
        return instance;
    }
}
