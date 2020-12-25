package com.ksc.network.slb.model.transform;

import com.ksc.network.slb.model.RuleHealthCheck;
import com.ksc.transform.SimpleTypeStaxUnmarshallers;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import javax.xml.stream.events.XMLEvent;

public class RuleHealthCheckStaxUnmarshaller implements Unmarshaller<RuleHealthCheck, StaxUnmarshallerContext> {
    private static RuleHealthCheckStaxUnmarshaller instance;

    public static RuleHealthCheckStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new RuleHealthCheckStaxUnmarshaller();
        return instance;
    }

    @Override
    public RuleHealthCheck unmarshall(StaxUnmarshallerContext context) throws Exception {
        RuleHealthCheck RuleHealthCheck = new RuleHealthCheck();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;
        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return RuleHealthCheck;
            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("Timeout", targetDepth)) {
                    RuleHealthCheck.setTimeout(SimpleTypeStaxUnmarshallers.IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("Interval", targetDepth)) {
                    RuleHealthCheck.setInterval(SimpleTypeStaxUnmarshallers.IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("HealthyThreshold", targetDepth)) {
                    RuleHealthCheck.setHealthyThreshold(SimpleTypeStaxUnmarshallers.IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("UnhealthyThreshold", targetDepth)) {
                    RuleHealthCheck.setUnhealthyThreshold(SimpleTypeStaxUnmarshallers.IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("HealthCheckId", targetDepth)) {
                    RuleHealthCheck.setHealthCheckId(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("HealthCheckState", targetDepth)) {
                    RuleHealthCheck.setHealthCheckState(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("HostName", targetDepth)) {
                    RuleHealthCheck.setHostName(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("UrlPath", targetDepth)) {
                    RuleHealthCheck.setUrlPath(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return RuleHealthCheck;
                }
            }
        }
    }
}
