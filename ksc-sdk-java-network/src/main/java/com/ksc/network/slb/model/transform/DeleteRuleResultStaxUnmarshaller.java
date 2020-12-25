package com.ksc.network.slb.model.transform;

import com.ksc.network.slb.model.DeleteRuleResult;
import com.ksc.transform.SimpleTypeStaxUnmarshallers;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import javax.xml.stream.events.XMLEvent;

/**
 * DeleteRuleResult StAX Unmarshaller
 */
public class DeleteRuleResultStaxUnmarshaller implements Unmarshaller<DeleteRuleResult, StaxUnmarshallerContext> {
    @Override
    public DeleteRuleResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        DeleteRuleResult deleteRuleResult = new DeleteRuleResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return deleteRuleResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {
                if (context.testExpression("RequestId", targetDepth)) {
                    deleteRuleResult.setRequestId(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("Return", targetDepth)) {
                    deleteRuleResult.setReturn(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return deleteRuleResult;
                }
            }
        }
    }

    private static DeleteRuleResultStaxUnmarshaller instance;

    public static DeleteRuleResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new DeleteRuleResultStaxUnmarshaller();
        return instance;
    }
}
