package com.ksc.kec.model.transform;

import javax.xml.stream.events.XMLEvent;

import com.ksc.kec.model.Instance;
import com.ksc.transform.SimpleTypeStaxUnmarshallers;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

/**
 * Reservation StAX Unmarshaller
 */
public class InstanceDetailStaxUnmarshaller implements
		Unmarshaller<Instance, StaxUnmarshallerContext> {

	public Instance unmarshall(StaxUnmarshallerContext context)
			throws Exception {
		Instance vm = new Instance();
		int originalDepth = context.getCurrentDepth();
		int targetDepth = originalDepth + 1;

		if (context.isStartOfDocument())
			targetDepth += 1;

		while (true) {
			XMLEvent xmlEvent = context.nextEvent();
			if (xmlEvent.isEndDocument())
				return vm;

			if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

				if (context.testExpression("InstanceId", targetDepth)) {
					vm.setInstanceId(StringStaxUnmarshaller.getInstance()
							.unmarshall(context));
					continue;
				}

				if (context.testExpression("InstanceName", targetDepth)) {
					vm.setInstanceName(StringStaxUnmarshaller.getInstance()
							.unmarshall(context));
					continue;
				}

				if (context.testExpression("InstanceType", targetDepth)) {
					vm.setInstanceType(StringStaxUnmarshaller.getInstance()
							.unmarshall(context));
					continue;
				}

				if (context.testExpression("InstanceConfigure", targetDepth)) {
					vm.setInstanceConfigure(InstanceConfigureStaxUnmarshaller
							.getInstance().unmarshall(context));
					continue;
				}

				if (context.testExpression("ImageId", targetDepth)) {
					vm.setImageId(StringStaxUnmarshaller.getInstance()
							.unmarshall(context));
					continue;
				}

				if (context.testExpression("SubnetId", targetDepth)) {
					vm.setSubnetId(StringStaxUnmarshaller.getInstance()
							.unmarshall(context));
					continue;
				}

				if (context.testExpression("PrivateIpAddress", targetDepth)) {
					vm.setPrivateIpAddress(StringStaxUnmarshaller.getInstance()
							.unmarshall(context));
					continue;
				}

				if (context.testExpression("InstanceState", targetDepth)) {
					vm.setInstanceState(InstanceStateStaxUnmarshaller
							.getInstance().unmarshall(context));
					continue;
				}

				if (context.testExpression("NetworkInterfaceSet/Item", targetDepth)) {
					vm.withNetworkSet(InstanceNetworkStaxUnmarshaller
							.getInstance().unmarshall(context));
					continue;
				}

				if (context.testExpression("SriovNetSupport", targetDepth)) {
					vm.setSriovNetSupport(StringStaxUnmarshaller.getInstance()
							.unmarshall(context));
					continue;
				}

				if (context.testExpression("CreationDate", targetDepth)) {
					vm.setCreationDate(StringStaxUnmarshaller.getInstance()
							.unmarshall(context));
					continue;
				}

				if (context.testExpression("Monitoring", targetDepth)) {
					vm.setMonitoring(InstanceMonitoringStaxUnmarshaller
							.getInstance().unmarshall(context));
					continue;
				}

				if (context.testExpression("AvailabilityZone", targetDepth)) {
					vm.setAvailabilityZone(StringStaxUnmarshaller
							.getInstance().unmarshall(context));
					continue;
				}

				if (context.testExpression("ProjectId", targetDepth)) {
					vm.setProjectId(StringStaxUnmarshaller
							.getInstance().unmarshall(context));
					continue;
				}
				if (context.testExpression("ServiceEndTime", targetDepth)) {
					vm.setServiceEndTime(StringStaxUnmarshaller
							.getInstance().unmarshall(context));
					continue;
				}
				if (context.testExpression("ChargeType", targetDepth)) {
					vm.setChargeType(StringStaxUnmarshaller
							.getInstance().unmarshall(context));
					continue;
				}
				if (context.testExpression("ProductType", targetDepth)) {
					vm.setProductType(SimpleTypeStaxUnmarshallers.IntegerStaxUnmarshaller
							.getInstance().unmarshall(context));
					continue;
				}
			} else if (xmlEvent.isEndElement()) {
				if (context.getCurrentDepth() < originalDepth) {
					return vm;
				}
			}
		}
	}

	private static InstanceDetailStaxUnmarshaller instance;

	public static InstanceDetailStaxUnmarshaller getInstance() {
		if (instance == null)
			instance = new InstanceDetailStaxUnmarshaller();
		return instance;
	}
}