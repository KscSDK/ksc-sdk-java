package com.ksc.network.slb.model.transform;

import com.ksc.network.slb.model.BackendServer;
import com.ksc.transform.SimpleTypeStaxUnmarshallers;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import javax.xml.stream.events.XMLEvent;

public class BackendServerStaxUnmarshaller implements Unmarshaller<BackendServer, StaxUnmarshallerContext> {
    private static BackendServerStaxUnmarshaller instance;

    public static BackendServerStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new BackendServerStaxUnmarshaller();
        return instance;
    }

    @Override
    public BackendServer unmarshall(StaxUnmarshallerContext context) throws Exception {
        BackendServer BackendServer = new BackendServer();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;
        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return BackendServer;
            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("CreateTime", targetDepth)) {
                    BackendServer.setCreateTime(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("NetworkInterfaceId", targetDepth)) {
                    BackendServer.setNetworkInterfaceId(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("BackendServerIp", targetDepth)) {
                    BackendServer.setBackendServerIp(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("InstanceId", targetDepth)) {
                    BackendServer.setInstanceId(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("BackendServerGroupId", targetDepth)) {
                    BackendServer.setBackendServerGroupId(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("RegisterId", targetDepth)) {
                    BackendServer.setRegisterId(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("BackendServerPort", targetDepth)) {
                    BackendServer.setBackendServerPort(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("Weight", targetDepth)) {
                    BackendServer.setWeight(SimpleTypeStaxUnmarshallers.IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("BackendServerState", targetDepth)) {
                    BackendServer.setBackendServerState(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return BackendServer;
                }
            }
        }
    }
}
