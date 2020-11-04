package com.ksc.network.dns.model.transform;

import com.ksc.network.dns.model.HostedZone;
import com.ksc.transform.SimpleTypeStaxUnmarshallers;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import javax.xml.stream.events.XMLEvent;

public class HostedZoneStaxUnmarshaller implements Unmarshaller<HostedZone, StaxUnmarshallerContext> {
    private static HostedZoneStaxUnmarshaller instance;

    public static HostedZoneStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new HostedZoneStaxUnmarshaller();
        return instance;
    }

    @Override
    public HostedZone unmarshall(StaxUnmarshallerContext context) throws Exception {
        HostedZone HostedZone = new HostedZone();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;
        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return HostedZone;
            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("CreateTime", targetDepth)) {
                    HostedZone.setCreateTime(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("HostedZoneId", targetDepth)) {
                    HostedZone.setHostedZoneId(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("HostedZoneName", targetDepth)) {
                    HostedZone.setHostedZoneName(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("Status", targetDepth)) {
                    HostedZone.setStatus(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return HostedZone;
                }
            }
        }
    }
}
