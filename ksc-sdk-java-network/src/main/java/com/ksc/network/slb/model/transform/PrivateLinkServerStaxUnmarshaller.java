package com.ksc.network.slb.model.transform;

import com.ksc.network.slb.model.PrivateLinkServer;
import com.ksc.transform.SimpleTypeStaxUnmarshallers;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import javax.xml.stream.events.XMLEvent;

public class PrivateLinkServerStaxUnmarshaller implements Unmarshaller<PrivateLinkServer, StaxUnmarshallerContext> {
    private static PrivateLinkServerStaxUnmarshaller instance;

    public static PrivateLinkServerStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new PrivateLinkServerStaxUnmarshaller();
        return instance;
    }

    @Override
    public PrivateLinkServer unmarshall(StaxUnmarshallerContext context) throws Exception {
        PrivateLinkServer privateLinkServer = new PrivateLinkServer();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;
        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return privateLinkServer;
            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("CreateTime", targetDepth)) {
                    privateLinkServer.setCreateTime(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("PrivateLinkServerName", targetDepth)) {
                    privateLinkServer.setPrivateLinkServerName(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("PrivateLinkServerId", targetDepth)) {
                    privateLinkServer.setPrivateLinkServerId(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("ListenerId", targetDepth)) {
                    privateLinkServer.setListenerId(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("Description", targetDepth)) {
                    privateLinkServer.setDescription(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("PrivateLinkNum", targetDepth)) {
                    privateLinkServer.setPrivateLinkNum(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return privateLinkServer;
                }
            }
        }
    }
}
