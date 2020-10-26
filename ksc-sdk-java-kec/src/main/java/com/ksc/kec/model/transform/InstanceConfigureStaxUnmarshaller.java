package com.ksc.kec.model.transform;

import javax.xml.stream.events.XMLEvent;

import com.ksc.kec.model.InstanceConfigure;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.IntegerStaxUnmarshaller;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

/**
 * Reservation StAX Unmarshaller
 */
public class InstanceConfigureStaxUnmarshaller implements
		Unmarshaller<InstanceConfigure, StaxUnmarshallerContext> {

	public InstanceConfigure unmarshall(StaxUnmarshallerContext context)
			throws Exception {
		InstanceConfigure ic = new InstanceConfigure();
		int originalDepth = context.getCurrentDepth();
		int targetDepth = originalDepth + 1;

		if (context.isStartOfDocument())
			targetDepth += 1;

		while (true) {
			XMLEvent xmlEvent = context.nextEvent();
			if (xmlEvent.isEndDocument())
				return ic;

			if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

				if (context.testExpression("VCPU", targetDepth)) {
					ic.setVCPU(IntegerStaxUnmarshaller.getInstance()
							.unmarshall(context));
					continue;
				}

				if (context.testExpression("MemoryGb", targetDepth)) {
					ic.setMemoryGb(IntegerStaxUnmarshaller.getInstance()
							.unmarshall(context));
					continue;
				}

				if (context.testExpression("DataDiskGb", targetDepth)) {
					ic.setDataDiskGb(IntegerStaxUnmarshaller.getInstance()
							.unmarshall(context));
					continue;
				}

				if (context.testExpression("DataDiskType", targetDepth)) {
					ic.setDataDiskType(StringStaxUnmarshaller.getInstance()
							.unmarshall(context));
					continue;
				}

				if (context.testExpression("RootDiskGb", targetDepth)) {
					ic.setRootDiskGb(IntegerStaxUnmarshaller.getInstance()
							.unmarshall(context));
					continue;
				}

				if (context.testExpression("Spec", targetDepth)) {
					ic.setSpec(StringStaxUnmarshaller.getInstance()
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

	private static InstanceConfigureStaxUnmarshaller instance;

	public static InstanceConfigureStaxUnmarshaller getInstance() {
		if (instance == null)
			instance = new InstanceConfigureStaxUnmarshaller();
		return instance;
	}
}
