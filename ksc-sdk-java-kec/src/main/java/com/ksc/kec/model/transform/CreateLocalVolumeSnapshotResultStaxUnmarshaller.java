package com.ksc.kec.model.transform;

import javax.xml.stream.events.XMLEvent;

import com.ksc.kec.model.CreateLocalVolumeSnapshotResult;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

public class CreateLocalVolumeSnapshotResultStaxUnmarshaller implements
        Unmarshaller<CreateLocalVolumeSnapshotResult, StaxUnmarshallerContext> {

	@Override
	public CreateLocalVolumeSnapshotResult unmarshall(StaxUnmarshallerContext context) throws Exception {
		CreateLocalVolumeSnapshotResult createLocalVolumeSnapshotResult = new CreateLocalVolumeSnapshotResult();
		int originalDepth = context.getCurrentDepth();
		int targetDepth = originalDepth + 1;

		if (context.isStartOfDocument())
			targetDepth += 1;

		while (true) {
			XMLEvent xmlEvent = context.nextEvent();
			if (xmlEvent.isEndDocument())
				return createLocalVolumeSnapshotResult;

			if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {
				// no use reservation
				if (context.testExpression("LocalVolumeId", targetDepth)) {
					createLocalVolumeSnapshotResult.setLocalVolumeSnapshotId(StringStaxUnmarshaller
							.getInstance().unmarshall(context));
					continue;
				}

				if (context.testExpression("RequestId", targetDepth)) {
					createLocalVolumeSnapshotResult.setRequestId(StringStaxUnmarshaller
							.getInstance().unmarshall(context));
					continue;
				}
			} else if (xmlEvent.isEndElement()) {
				if (context.getCurrentDepth() < originalDepth) {
					return createLocalVolumeSnapshotResult;
				}
			}
		}
	}

	private static CreateLocalVolumeSnapshotResultStaxUnmarshaller instance;

	public static CreateLocalVolumeSnapshotResultStaxUnmarshaller getInstance() {
		if (instance == null)
			instance = new CreateLocalVolumeSnapshotResultStaxUnmarshaller();
		return instance;
	}

}
