package com.ksc.kec.model.transform;

import javax.xml.stream.events.XMLEvent;

import com.ksc.kec.model.InstanceTypeConfig;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.IntegerStaxUnmarshaller;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

/**
 * Reservation StAX Unmarshaller
 */
public class InstanceTypeConfigStaxUnmarshaller implements
		Unmarshaller<InstanceTypeConfig, StaxUnmarshallerContext> {

	public InstanceTypeConfig unmarshall(StaxUnmarshallerContext context)
			throws Exception {
		InstanceTypeConfig instanceTypeConfig = new InstanceTypeConfig();
		int originalDepth = context.getCurrentDepth();
		int targetDepth = originalDepth + 1;

		if (context.isStartOfDocument())
			targetDepth += 1;

		while (true) {
			XMLEvent xmlEvent = context.nextEvent();
			if (xmlEvent.isEndDocument())
				return instanceTypeConfig;

			if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

				if (context.testExpression("InstanceType", targetDepth)) {
					instanceTypeConfig.setInstanceType(StringStaxUnmarshaller.getInstance()
							.unmarshall(context));
					continue;
				}

				if (context.testExpression("InstanceFamily", targetDepth)) {
					instanceTypeConfig.setInstanceFamily(StringStaxUnmarshaller.getInstance()
							.unmarshall(context));
					continue;
				}

				if (context.testExpression("instanceFamilyName", targetDepth)) {
					instanceTypeConfig.setInstanceFamilyName(StringStaxUnmarshaller.getInstance()
							.unmarshall(context));
					continue;
				}

				if (context.testExpression("CPU", targetDepth)) {
					instanceTypeConfig.setCPU(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
					continue;
				}

				if (context.testExpression("Memory", targetDepth)) {
					instanceTypeConfig.setMemory(IntegerStaxUnmarshaller.getInstance()
							.unmarshall(context));
					continue;
				}

				if (context.testExpression("AvailabilityZoneSet/AvailabilityZone", targetDepth)) {
					instanceTypeConfig.withAvailabilityZoneSet(AvailabilityZoneInfoStaxUnmarshaller.getInstance()
							.unmarshall(context));
					continue;
				}

				if (context.testExpression("systemDiskQuotaList", targetDepth)) {
					instanceTypeConfig.withSystemDiskQuotaSet(SystemDiskQuotaInfoStaxUnmarshaller.getInstance()
							.unmarshall(context));
					continue;
				}

				if (context.testExpression("dataDiskQuotaList", targetDepth)) {
					instanceTypeConfig.withDataDiskQuotaSet(DataDiskQuotaInfoStaxUnmarshaller.getInstance()
							.unmarshall(context));
					continue;
				}

			} else if (xmlEvent.isEndElement()) {
				if (context.getCurrentDepth() < originalDepth) {
					return instanceTypeConfig;
				}
			}
		}
	}

	private static InstanceTypeConfigStaxUnmarshaller instance;

	public static InstanceTypeConfigStaxUnmarshaller getInstance() {
		if (instance == null)
			instance = new InstanceTypeConfigStaxUnmarshaller();
		return instance;
	}
}