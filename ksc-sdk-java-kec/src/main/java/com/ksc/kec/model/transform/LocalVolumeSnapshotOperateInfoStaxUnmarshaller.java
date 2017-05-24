package com.ksc.kec.model.transform;

import javax.xml.stream.events.XMLEvent;

import com.ksc.kec.model.LocalVolumeSnapshotOperateInfo;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.BooleanStaxUnmarshaller;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

public class LocalVolumeSnapshotOperateInfoStaxUnmarshaller implements Unmarshaller<LocalVolumeSnapshotOperateInfo, StaxUnmarshallerContext> {
	private static LocalVolumeSnapshotOperateInfoStaxUnmarshaller instance;

	public static LocalVolumeSnapshotOperateInfoStaxUnmarshaller getInstance() {
		if (instance == null)
			instance = new LocalVolumeSnapshotOperateInfoStaxUnmarshaller();
		return instance;
	}

	@Override
	public LocalVolumeSnapshotOperateInfo unmarshall(StaxUnmarshallerContext context) throws Exception {
		// TODO Auto-generated method stub
		LocalVolumeSnapshotOperateInfo info = new LocalVolumeSnapshotOperateInfo();
		int originalDepth = context.getCurrentDepth();
		int targetDepth = originalDepth + 1;
		while (true) {
			XMLEvent xmlEvent = context.nextEvent();
			if (xmlEvent.isEndDocument())
				return info;
			if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {
				if (context.testExpression("LocalVolumeSnapshotId", targetDepth)) {
					info.setLocalVolumeSnapshotId(StringStaxUnmarshaller.getInstance().unmarshall(context));
				} else if (context.testExpression("Return", targetDepth)) {
					info.setReturn(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
				}
			} else if (xmlEvent.isEndElement()) {
				if (context.getCurrentDepth() < originalDepth) {
					return info;
				}
			}
		}
	}

}
