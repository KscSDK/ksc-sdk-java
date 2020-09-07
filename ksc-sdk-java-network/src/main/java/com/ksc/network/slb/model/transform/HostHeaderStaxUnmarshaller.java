package com.ksc.network.slb.model.transform;

import com.ksc.network.slb.model.HostHeader;
import com.ksc.transform.SimpleTypeStaxUnmarshallers;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import javax.xml.stream.events.XMLEvent;

public class HostHeaderStaxUnmarshaller implements Unmarshaller<HostHeader, StaxUnmarshallerContext> {
    private static HostHeaderStaxUnmarshaller instance;

    public static HostHeaderStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new HostHeaderStaxUnmarshaller();
        return instance;
    }

    @Override
    public HostHeader unmarshall(StaxUnmarshallerContext context) throws Exception {
        HostHeader HostHeader = new HostHeader();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;
        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return HostHeader;
            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("HostHeaderId", targetDepth)) {
                        HostHeader.setHostHeaderId(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("CreateTime", targetDepth)) {
                        HostHeader.setCreateTime(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("HostHeader", targetDepth)) {
                        HostHeader.setHostHeader(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("ListenerId", targetDepth)) {
                        HostHeader.setListenerId(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("CertificateId", targetDepth)) {
                        HostHeader.setCertificateId(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return HostHeader;
                }
            }
        }
    }
}
