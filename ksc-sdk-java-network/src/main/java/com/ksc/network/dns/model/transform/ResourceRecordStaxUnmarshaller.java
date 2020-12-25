package com.ksc.network.dns.model.transform;

import com.ksc.network.dns.model.ResourceRecord;
import com.ksc.transform.SimpleTypeStaxUnmarshallers;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import javax.xml.stream.events.XMLEvent;

public class ResourceRecordStaxUnmarshaller implements Unmarshaller<ResourceRecord, StaxUnmarshallerContext> {
    private static ResourceRecordStaxUnmarshaller instance;

    public static ResourceRecordStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new ResourceRecordStaxUnmarshaller();
        return instance;
    }

    @Override
    public ResourceRecord unmarshall(StaxUnmarshallerContext context) throws Exception {
        ResourceRecord ResourceRecord = new ResourceRecord();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;
        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return ResourceRecord;
            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("CreateTime", targetDepth)) {
                    ResourceRecord.setCreateTime(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("HostedZoneId", targetDepth)) {
                    ResourceRecord.setHostedZoneId(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("ResourceRecordId", targetDepth)) {
                    ResourceRecord.setResourceRecordId(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("UpdateTime", targetDepth)) {
                    ResourceRecord.setUpdateTime(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("ResourceRecordName", targetDepth)) {
                    ResourceRecord.setResourceRecordName(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("ResourceRecordType", targetDepth)) {
                    ResourceRecord.setResourceRecordType(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("GeoLocationId", targetDepth)) {
                    ResourceRecord.setGeoLocationId(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("TTL", targetDepth)) {
                    ResourceRecord.setTTL(SimpleTypeStaxUnmarshallers.IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("Value", targetDepth)) {
                    ResourceRecord.setValue(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("Weight", targetDepth)) {
                    ResourceRecord.setWeight(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("Status", targetDepth)) {
                    ResourceRecord.setStatus(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return ResourceRecord;
                }
            }
        }
    }
}
