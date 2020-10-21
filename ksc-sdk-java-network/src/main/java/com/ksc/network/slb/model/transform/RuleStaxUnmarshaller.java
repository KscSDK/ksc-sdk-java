package com.ksc.network.slb.model.transform;

import com.ksc.network.slb.model.Rule;
import com.ksc.transform.SimpleTypeStaxUnmarshallers;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import javax.xml.stream.events.XMLEvent;

public class RuleStaxUnmarshaller implements Unmarshaller<Rule, StaxUnmarshallerContext> {
    private static RuleStaxUnmarshaller instance;

    public static RuleStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new RuleStaxUnmarshaller();
        return instance;
    }

    @Override
    public Rule unmarshall(StaxUnmarshallerContext context) throws Exception {
        Rule Rule = new Rule();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;
        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return Rule;
            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("CreateTime", targetDepth)) {
                    Rule.setCreateTime(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("RuleId", targetDepth)) {
                    Rule.setRuleId(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("Path", targetDepth)) {
                    Rule.setPath(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("HostHeaderId", targetDepth)) {
                    Rule.setHostHeaderId(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("BackendServerGroupId", targetDepth)) {
                    Rule.setBackendServerGroupId(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("Method", targetDepth)) {
                    Rule.setMethod(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("ListenerSync", targetDepth)) {
                    Rule.setListenerSync(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("HealthCheck", targetDepth)) {
                    Rule.setHealthCheck(RuleHealthCheckStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("Session", targetDepth)) {
                    Rule.setSession(RuleSessionStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("BackendServerSet/BackendServer", targetDepth)) {
                    Rule.addBackendServerSet(BackendServerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return Rule;
                }
            }
        }
    }
}
