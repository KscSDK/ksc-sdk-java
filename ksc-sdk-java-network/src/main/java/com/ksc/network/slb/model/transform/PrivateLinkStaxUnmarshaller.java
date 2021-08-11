package com.ksc.network.slb.model.transform;

import com.ksc.network.slb.model.PrivateLink;
import com.ksc.transform.SimpleTypeStaxUnmarshallers;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import javax.xml.stream.events.XMLEvent;

public class PrivateLinkStaxUnmarshaller implements Unmarshaller<PrivateLink, StaxUnmarshallerContext> {
    private static PrivateLinkStaxUnmarshaller instance;

    public static PrivateLinkStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new PrivateLinkStaxUnmarshaller();
        return instance;
    }

    @Override
    public PrivateLink unmarshall(StaxUnmarshallerContext context) throws Exception {
        PrivateLink privateLink = new PrivateLink();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;
        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return privateLink;
            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("CreateTime", targetDepth)) {
                    privateLink.setCreateTime(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("PrivateLinkId", targetDepth)) {
                    privateLink.setPrivateLinkId(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("PrivateLinkServerId", targetDepth)) {
                    privateLink.setPrivateLinkServerId(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("ListenerId", targetDepth)) {
                    privateLink.setListenerId(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("AccountId", targetDepth)) {
                    privateLink.setAccountId(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("UpdateTime", targetDepth)) {
                    privateLink.setUpdateTime(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("ConnectionStatus", targetDepth)) {
                    privateLink.setConnectionStatus(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return privateLink;
                }
            }
        }
    }
}
