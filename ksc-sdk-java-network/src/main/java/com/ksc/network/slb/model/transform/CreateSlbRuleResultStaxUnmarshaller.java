package com.ksc.network.slb.model.transform;

import com.ksc.network.slb.model.CreateSlbRuleResult;
import com.ksc.transform.SimpleTypeStaxUnmarshallers;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import javax.xml.stream.events.XMLEvent;

/**
 * CreateSlbRuleResult StAX Unmarshaller
 */
public class CreateSlbRuleResultStaxUnmarshaller implements Unmarshaller<CreateSlbRuleResult, StaxUnmarshallerContext> {
    @Override
    public CreateSlbRuleResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        CreateSlbRuleResult createSlbRuleResult = new CreateSlbRuleResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return createSlbRuleResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {
                if (context.testExpression("RequestId", targetDepth)) {
                    createSlbRuleResult.setRequestId(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("Rule", targetDepth)) {
                    createSlbRuleResult.setRule(RuleStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return createSlbRuleResult;
                }
            }
        }
    }

    private static CreateSlbRuleResultStaxUnmarshaller instance;

    public static CreateSlbRuleResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new CreateSlbRuleResultStaxUnmarshaller();
        return instance;
    }
}
