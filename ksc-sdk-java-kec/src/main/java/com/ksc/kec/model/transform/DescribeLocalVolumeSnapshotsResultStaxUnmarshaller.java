package com.ksc.kec.model.transform;

import javax.xml.stream.events.XMLEvent;

import com.ksc.kec.model.DescribeLocalVolumeSnapshotsResult;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.IntegerStaxUnmarshaller;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

public class DescribeLocalVolumeSnapshotsResultStaxUnmarshaller implements
             Unmarshaller<DescribeLocalVolumeSnapshotsResult, StaxUnmarshallerContext>{

	public DescribeLocalVolumeSnapshotsResult unmarshall(StaxUnmarshallerContext context)
			throws Exception {
		DescribeLocalVolumeSnapshotsResult describeLocalVolumeSnapshotsResult = new DescribeLocalVolumeSnapshotsResult();
		int originalDepth = context.getCurrentDepth();
		int targetDepth = originalDepth + 1;

		if (context.isStartOfDocument())
			targetDepth += 1;

		while (true) {
			XMLEvent xmlEvent = context.nextEvent();
			if (xmlEvent.isEndDocument())
				return describeLocalVolumeSnapshotsResult;

			if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {
				// no use reservation
				if (context.testExpression("LocalVolumeSnapshotSet/Item", targetDepth)) {
					describeLocalVolumeSnapshotsResult
							.withLLocalVolumeSnapshot(LocalVolumeSnapshotDetailStaxUnmarshaller
									.getInstance().unmarshall(context));
					continue;
				}

				if (context.testExpression("Marker", targetDepth)) {
					describeLocalVolumeSnapshotsResult.setMarker(IntegerStaxUnmarshaller
							.getInstance().unmarshall(context));
					continue;
				}

				if (context.testExpression("LocalVolumeSnapshotCount", targetDepth)) {
					describeLocalVolumeSnapshotsResult
							.setLocalVolumeSnapshotCount(IntegerStaxUnmarshaller
									.getInstance().unmarshall(context));
					continue;
				}

				if (context.testExpression("RequestId", targetDepth)) {
					describeLocalVolumeSnapshotsResult.setRequestId(StringStaxUnmarshaller
							.getInstance().unmarshall(context));
					continue;
				}
			} else if (xmlEvent.isEndElement()) {
				if (context.getCurrentDepth() < originalDepth) {
					return describeLocalVolumeSnapshotsResult;
				}
			}
		}
	}

	private static DescribeLocalVolumeSnapshotsResultStaxUnmarshaller instance;

	public static DescribeLocalVolumeSnapshotsResultStaxUnmarshaller getInstance() {
		if (instance == null)
			instance = new DescribeLocalVolumeSnapshotsResultStaxUnmarshaller();
		return instance;
	}
}
