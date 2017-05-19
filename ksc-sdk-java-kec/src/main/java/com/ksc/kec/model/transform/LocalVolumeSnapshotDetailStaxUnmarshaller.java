package com.ksc.kec.model.transform;

import javax.xml.stream.events.XMLEvent;

import com.ksc.kec.model.LocalVolumeSnapshot;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

public class LocalVolumeSnapshotDetailStaxUnmarshaller implements
       Unmarshaller<LocalVolumeSnapshot, StaxUnmarshallerContext> {

	public LocalVolumeSnapshot unmarshall(StaxUnmarshallerContext context)
			throws Exception {
		LocalVolumeSnapshot localVolumeSnapshot = new LocalVolumeSnapshot();
		int originalDepth = context.getCurrentDepth();
		int targetDepth = originalDepth + 1;

		if (context.isStartOfDocument())
			targetDepth += 1;

		while (true) {
			XMLEvent xmlEvent = context.nextEvent();
			if (xmlEvent.isEndDocument())
				return localVolumeSnapshot;

			if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

				if (context.testExpression("CreationDate", targetDepth)) {
					localVolumeSnapshot.setCreationDate(StringStaxUnmarshaller.getInstance()
							.unmarshall(context));
					continue;
				}
				
				if (context.testExpression("InstanceId", targetDepth)) {
					localVolumeSnapshot.setInstanceId(StringStaxUnmarshaller.getInstance()
							.unmarshall(context));
					continue;
				}

				if (context.testExpression("State", targetDepth)) {
					localVolumeSnapshot.setState(StringStaxUnmarshaller.getInstance()
							.unmarshall(context));
					continue;
				}


				if (context.testExpression("LocalVolumeSnapshotId", targetDepth)) {
					localVolumeSnapshot.setLocalVolumeSnapshotId(StringStaxUnmarshaller
							.getInstance().unmarshall(context));
					continue;
				}

				if (context.testExpression("LocalVolumeSnapshotName", targetDepth)) {
					localVolumeSnapshot.setLocalVolumeSnapshotName(StringStaxUnmarshaller.getInstance()
							.unmarshall(context));
					continue;
				}

				if (context.testExpression("LocalVolumeSnapshotDesc", targetDepth)) {
					localVolumeSnapshot.setLocalVolumeSnapshotDesc(StringStaxUnmarshaller.getInstance()
							.unmarshall(context));
					continue;
				}

				if (context.testExpression("SourceLocalVolumeId", targetDepth)) {
					localVolumeSnapshot.setSourceLocalVolumeId(StringStaxUnmarshaller.getInstance()
							.unmarshall(context));
					continue;
				}

				if (context.testExpression("SourceLocalVolumeName", targetDepth)) {
					localVolumeSnapshot.setSourceLocalVolumeName(StringStaxUnmarshaller
							.getInstance().unmarshall(context));
					continue;
				}

				if (context.testExpression("SourceLocalVolumeCategory", targetDepth)) {
					localVolumeSnapshot.setSourceLocalVolumeCategory(StringStaxUnmarshaller
							.getInstance().unmarshall(context));
					continue;
				}

			} else if (xmlEvent.isEndElement()) {
				if (context.getCurrentDepth() < originalDepth) {
					return localVolumeSnapshot;
				}
			}
		}
	}

	private static LocalVolumeSnapshotDetailStaxUnmarshaller instance;

	public static LocalVolumeSnapshotDetailStaxUnmarshaller getInstance() {
		if (instance == null)
			instance = new LocalVolumeSnapshotDetailStaxUnmarshaller();
		return instance;
	}
}
