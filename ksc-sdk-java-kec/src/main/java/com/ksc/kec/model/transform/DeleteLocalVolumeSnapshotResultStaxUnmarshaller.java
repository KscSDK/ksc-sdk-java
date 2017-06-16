package com.ksc.kec.model.transform;

import javax.xml.stream.events.XMLEvent;

import com.ksc.kec.model.DeleteLocalVolumeSnapshotResult;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

public class DeleteLocalVolumeSnapshotResultStaxUnmarshaller implements
       Unmarshaller<DeleteLocalVolumeSnapshotResult, StaxUnmarshallerContext>{

	@Override
	public DeleteLocalVolumeSnapshotResult unmarshall(StaxUnmarshallerContext context) throws Exception {
		DeleteLocalVolumeSnapshotResult deleteLocalVolumeSnapshotResult = new DeleteLocalVolumeSnapshotResult();
		int originalDepth = context.getCurrentDepth();
		int targetDepth = originalDepth + 1;

		if (context.isStartOfDocument())
			targetDepth += 1;

		while (true) {
			XMLEvent xmlEvent = context.nextEvent();
			if (xmlEvent.isEndDocument())
				return deleteLocalVolumeSnapshotResult;

			if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {
				// no use reservation
				if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {
					if (context.testExpression("ReturnSet/Item", targetDepth)) {
						deleteLocalVolumeSnapshotResult.addReturnSet(LocalVolumeSnapshotOperateInfoStaxUnmarshaller.getInstance().unmarshall(context));
					} else if (context.testExpression("RequestId", targetDepth)) {
						deleteLocalVolumeSnapshotResult.setRequestId(StringStaxUnmarshaller.getInstance().unmarshall(context));
					}
				} 
			} else if (xmlEvent.isEndElement()) {
				if (context.getCurrentDepth() < originalDepth) {
					return deleteLocalVolumeSnapshotResult;
				}
			}
		}
	}

	private static DeleteLocalVolumeSnapshotResultStaxUnmarshaller instance;

	public static DeleteLocalVolumeSnapshotResultStaxUnmarshaller getInstance() {
		if (instance == null)
			instance = new DeleteLocalVolumeSnapshotResultStaxUnmarshaller();
		return instance;
	}
}
