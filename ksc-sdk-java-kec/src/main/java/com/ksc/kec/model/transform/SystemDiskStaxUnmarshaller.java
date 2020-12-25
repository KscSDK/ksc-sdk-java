package com.ksc.kec.model.transform;

import com.ksc.kec.model.SystemDisk;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.IntegerStaxUnmarshaller;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import javax.xml.stream.events.XMLEvent;

/**
 * Reservation StAX Unmarshaller
 */
public class SystemDiskStaxUnmarshaller implements
        Unmarshaller<SystemDisk, StaxUnmarshallerContext> {

    public SystemDisk unmarshall(StaxUnmarshallerContext context)
            throws Exception {
        SystemDisk ic = new SystemDisk();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return ic;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("DiskType", targetDepth)) {
                    ic.setDiskType(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }

                if (context.testExpression("DiskSize", targetDepth)) {
                    ic.setDiskSize(IntegerStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }

            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return ic;
                }
            }
        }
    }

    private static SystemDiskStaxUnmarshaller instance;

    public static SystemDiskStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new SystemDiskStaxUnmarshaller();
        return instance;
    }
}
