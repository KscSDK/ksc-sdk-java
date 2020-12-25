package com.ksc.kec.model.transform;

import com.ksc.kec.model.Image;
import com.ksc.transform.SimpleTypeStaxUnmarshallers;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import javax.xml.stream.events.XMLEvent;

/**
 * Image StAX Unmarshaller
 */
public class ImageSnapshotStaxUnmarshaller implements Unmarshaller<Image.SnapShot, StaxUnmarshallerContext> {
    private static ImageSnapshotStaxUnmarshaller instance;

    public static ImageSnapshotStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new ImageSnapshotStaxUnmarshaller();
        return instance;
    }

    @Override
    public Image.SnapShot unmarshall(StaxUnmarshallerContext context) throws Exception {
        Image.SnapShot snapShot = new Image.SnapShot();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;
        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return snapShot;
            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {
                if (context.testExpression("SnapshotId", targetDepth)) {
                    snapShot.setSnapshotId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                } else if (context.testExpression("DiskType", targetDepth)) {
                    snapShot.setDiskType(StringStaxUnmarshaller.getInstance().unmarshall(context));
                } else if (context.testExpression("DiskSize", targetDepth)) {
                    snapShot.setDiskSize(SimpleTypeStaxUnmarshallers.IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                } else if (context.testExpression("Type", targetDepth)) {
                    snapShot.setType(StringStaxUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return snapShot;
                }
            }
        }
    }

}
