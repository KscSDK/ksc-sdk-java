package com.ksc.network.slb.model.transform;

import javax.xml.stream.events.XMLEvent;

import com.ksc.network.slb.model.HealthCheck;
import com.ksc.network.slb.model.Listener;
import com.ksc.transform.SimpleTypeStaxUnmarshallers;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

/**
 * Created by LIUHONGMING on 2017/4/20.
 */
public class HealthCheckStaxUnmarshaller implements Unmarshaller<HealthCheck, StaxUnmarshallerContext>{
    private static HealthCheckStaxUnmarshaller instance;

    public static HealthCheckStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new HealthCheckStaxUnmarshaller();
        return instance;
    }

    @Override
    public HealthCheck unmarshall(StaxUnmarshallerContext context) throws Exception {
        HealthCheck healthCheck = new HealthCheck();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;
        while(true){
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return healthCheck;
            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {
                if (context.testExpression("ListenerId", targetDepth)) {
                    healthCheck.setListenerId(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("HealthCheckState", targetDepth)) {
                    healthCheck.setHealthCheckState(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("HealthCheckId", targetDepth)) {
                    healthCheck.setHealthCheckId(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("HealthyThreshold", targetDepth)) {
                    healthCheck.setHealthyThreshold(SimpleTypeStaxUnmarshallers.IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Interval", targetDepth)) {
                    healthCheck.setInterval(SimpleTypeStaxUnmarshallers.IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Timeout", targetDepth)) {
                    healthCheck.setTimeout(SimpleTypeStaxUnmarshallers.IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("UnhealthyThreshold", targetDepth)) {
                    healthCheck.setUnhealthyThreshold(SimpleTypeStaxUnmarshallers.IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("UrlPath", targetDepth)) {
                    healthCheck.setUrlPath(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("IsDefaultHostName", targetDepth)) {
                    healthCheck.setDefaultHostName(SimpleTypeStaxUnmarshallers.BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("HostName", targetDepth)) {
                    healthCheck.setHostName(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

            }else if (xmlEvent.isEndDocument()){
                if (context.getCurrentDepth() < originalDepth){
                    return healthCheck;
                }
            }
        }
    }
}
