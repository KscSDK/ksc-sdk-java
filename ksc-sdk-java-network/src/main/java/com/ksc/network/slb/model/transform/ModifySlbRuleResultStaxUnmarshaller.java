package com.ksc.network.slb.model.transform;

import com.ksc.network.slb.model.ModifySlbRuleResult;
import com.ksc.transform.SimpleTypeStaxUnmarshallers;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import javax.xml.stream.events.XMLEvent;

/**
 * ModifySlbRuleResult StAX Unmarshaller
 */
public class ModifySlbRuleResultStaxUnmarshaller implements Unmarshaller<ModifySlbRuleResult, StaxUnmarshallerContext> {
    @Override
    public ModifySlbRuleResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        ModifySlbRuleResult modifySlbRuleResult = new ModifySlbRuleResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return modifySlbRuleResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {
                if (context.testExpression("RequestId", targetDepth)) {
                    modifySlbRuleResult.setRequestId(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("Rule", targetDepth)) {
                    modifySlbRuleResult.setRule(RuleStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return modifySlbRuleResult;
                }
            }
        }
    }

    private static ModifySlbRuleResultStaxUnmarshaller instance;

    public static ModifySlbRuleResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new ModifySlbRuleResultStaxUnmarshaller();
        return instance;
    }
}
