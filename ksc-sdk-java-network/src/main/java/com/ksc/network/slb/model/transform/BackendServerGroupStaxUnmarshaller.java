package com.ksc.network.slb.model.transform;

import com.ksc.network.slb.model.BackendServerGroup;
import com.ksc.transform.SimpleTypeStaxUnmarshallers;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import javax.xml.stream.events.XMLEvent;

public class BackendServerGroupStaxUnmarshaller implements Unmarshaller<BackendServerGroup, StaxUnmarshallerContext> {
    private static BackendServerGroupStaxUnmarshaller instance;

    public static BackendServerGroupStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new BackendServerGroupStaxUnmarshaller();
        return instance;
    }

    @Override
    public BackendServerGroup unmarshall(StaxUnmarshallerContext context) throws Exception {
        BackendServerGroup BackendServerGroup = new BackendServerGroup();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;
        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return BackendServerGroup;
            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("CreateTime", targetDepth)) {
                    BackendServerGroup.setCreateTime(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("VpcId", targetDepth)) {
                    BackendServerGroup.setVpcId(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("BackendServerGroupId", targetDepth)) {
                    BackendServerGroup.setBackendServerGroupId(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("BackendServerGroupName", targetDepth)) {
                    BackendServerGroup.setBackendServerGroupName(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("BackendServerNumber", targetDepth)) {
                    BackendServerGroup.setBackendServerNumber(SimpleTypeStaxUnmarshallers.IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("HealthCheck", targetDepth)) {
                    BackendServerGroup.setHealthCheck(HealthCheckStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return BackendServerGroup;
                }
            }
        }
    }
}
