package com.ksc.kec.model.transform;

import javax.xml.stream.events.XMLEvent;

import com.ksc.kec.model.LocalVolume;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.IntegerStaxUnmarshaller;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

public class LocalVolumeDetailStaxUnmarshaller implements
       Unmarshaller<LocalVolume, StaxUnmarshallerContext> {

	public LocalVolume unmarshall(StaxUnmarshallerContext context)
			throws Exception {
		LocalVolume localVolume = new LocalVolume();
		int originalDepth = context.getCurrentDepth();
		int targetDepth = originalDepth + 1;

		if (context.isStartOfDocument())
			targetDepth += 1;

		while (true) {
			XMLEvent xmlEvent = context.nextEvent();
			if (xmlEvent.isEndDocument())
				return localVolume;

			if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

				if (context.testExpression("CreationDate", targetDepth)) {
					localVolume.setCreationDate(StringStaxUnmarshaller.getInstance()
							.unmarshall(context));
					continue;
				}
				
				if (context.testExpression("InstanceId", targetDepth)) {
					localVolume.setInstanceId(StringStaxUnmarshaller.getInstance()
							.unmarshall(context));
					continue;
				}

				if (context.testExpression("InstanceName", targetDepth)) {
					localVolume.setInstanceName(StringStaxUnmarshaller.getInstance()
							.unmarshall(context));
					continue;
				}


				if (context.testExpression("InstanceState", targetDepth)) {
					localVolume.setInstanceState(StringStaxUnmarshaller
							.getInstance().unmarshall(context));
					continue;
				}

				if (context.testExpression("LocalVolumeCategory", targetDepth)) {
					localVolume.setLocalVolumeCategory(StringStaxUnmarshaller.getInstance()
							.unmarshall(context));
					continue;
				}

				if (context.testExpression("LocalVolumeId", targetDepth)) {
					localVolume.setLocalVolumeId(StringStaxUnmarshaller.getInstance()
							.unmarshall(context));
					continue;
				}

				if (context.testExpression("LocalVolumeName", targetDepth)) {
					localVolume.setLocalVolumeName(StringStaxUnmarshaller.getInstance()
							.unmarshall(context));
					continue;
				}

				if (context.testExpression("LocalVolumeSize", targetDepth)) {
					localVolume.setLocalVolumeSize(IntegerStaxUnmarshaller
							.getInstance().unmarshall(context));
					continue;
				}

				if (context.testExpression("LocalVolumeState", targetDepth)) {
					localVolume.setLocalVolumeState(StringStaxUnmarshaller
							.getInstance().unmarshall(context));
					continue;
				}

				if (context.testExpression("LocalVolumeType", targetDepth)) {
					localVolume.setLocalVolumeType(StringStaxUnmarshaller.getInstance()
							.unmarshall(context));
					continue;
				}

			} else if (xmlEvent.isEndElement()) {
				if (context.getCurrentDepth() < originalDepth) {
					return localVolume;
				}
			}
		}
	}

	private static LocalVolumeDetailStaxUnmarshaller instance;

	public static LocalVolumeDetailStaxUnmarshaller getInstance() {
		if (instance == null)
			instance = new LocalVolumeDetailStaxUnmarshaller();
		return instance;
	}
}
