package com.ksc.kec.model.transform;

import com.ksc.kec.model.Instance;
import com.ksc.transform.SimpleTypeStaxUnmarshallers;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import javax.xml.stream.events.XMLEvent;

public class InstanceDataDiskStaxUnmarshaller implements
       Unmarshaller<Instance.DataDisk, StaxUnmarshallerContext> {

	public Instance.DataDisk unmarshall(StaxUnmarshallerContext context)
			throws Exception {
		Instance.DataDisk dataDisk = new Instance.DataDisk();
		int originalDepth = context.getCurrentDepth();
		int targetDepth = originalDepth + 1;

		if (context.isStartOfDocument())
			targetDepth += 1;

		while (true) {
			XMLEvent xmlEvent = context.nextEvent();
			if (xmlEvent.isEndDocument())
				return dataDisk;

			if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

				if (context.testExpression("DiskId", targetDepth)) {
					dataDisk.setDiskId(StringStaxUnmarshaller.getInstance()
							.unmarshall(context));
					continue;
				}

				if (context.testExpression("DiskType", targetDepth)) {
					dataDisk.setDiskType(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance()
							.unmarshall(context));
					continue;
				}

				if (context.testExpression("DiskSize", targetDepth)) {
					dataDisk.setDiskSize(SimpleTypeStaxUnmarshallers.IntegerStaxUnmarshaller.getInstance()
							.unmarshall(context));
					continue;
				}

				if (context.testExpression("DeleteWithInstance", targetDepth)) {
					dataDisk.setDeleteWithInstance(SimpleTypeStaxUnmarshallers.BooleanStaxUnmarshaller.getInstance()
							.unmarshall(context));
					continue;
				}
				
			} else if (xmlEvent.isEndElement()) {
				if (context.getCurrentDepth() < originalDepth) {
					return dataDisk;
				}
			}
		}
	}

	private static InstanceDataDiskStaxUnmarshaller instance;

	public static InstanceDataDiskStaxUnmarshaller getInstance() {
		if (instance == null)
			instance = new InstanceDataDiskStaxUnmarshaller();
		return instance;
	}
}
