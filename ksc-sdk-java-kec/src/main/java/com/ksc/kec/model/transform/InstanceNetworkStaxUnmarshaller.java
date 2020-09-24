package com.ksc.kec.model.transform;

import javax.xml.stream.events.XMLEvent;

import com.ksc.kec.model.InstanceNetwork;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

/**
 * Reservation StAX Unmarshaller
 */
public class InstanceNetworkStaxUnmarshaller implements
		Unmarshaller<InstanceNetwork, StaxUnmarshallerContext> {

	public InstanceNetwork unmarshall(StaxUnmarshallerContext context)
			throws Exception {
		InstanceNetwork n = new InstanceNetwork();
		int originalDepth = context.getCurrentDepth();
		int targetDepth = originalDepth + 1;

		if (context.isStartOfDocument())
			targetDepth += 1;

		while (true) {
			XMLEvent xmlEvent = context.nextEvent();
			if (xmlEvent.isEndDocument())
				return n;

			if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

				if (context.testExpression("NetworkInterfaceId", targetDepth)) {
					n.setNetworkInterfaceId(StringStaxUnmarshaller
							.getInstance().unmarshall(context));
					continue;
				}

				if (context.testExpression("NetworkInterfaceType", targetDepth)) {
					n.setNetworkInterfaceType(StringStaxUnmarshaller
							.getInstance().unmarshall(context));
					continue;
				}

				if (context.testExpression("VpcId", targetDepth)) {
					n.setVpcId(StringStaxUnmarshaller.getInstance().unmarshall(
							context));
					continue;
				}

				if (context.testExpression("SubnetId", targetDepth)) {
					n.setSubnetId(StringStaxUnmarshaller.getInstance()
							.unmarshall(context));
					continue;
				}

				if (context.testExpression("MacAddress", targetDepth)) {
					n.setMacAddress(StringStaxUnmarshaller.getInstance()
							.unmarshall(context));
					continue;
				}

				if (context.testExpression("PrivateIpAddress", targetDepth)) {
					n.setPrivateIpAddress(StringStaxUnmarshaller.getInstance()
							.unmarshall(context));
					continue;
				}
				if (context.testExpression("GroupSet/Item", targetDepth)) {
					n.withNetworkSecurityGroup(InstanceSecurityGroupStaxUnmarshaller
							.getInstance().unmarshall(context));
					continue;
				}

				if (context.testExpression("SecurityGroupSet/Item", targetDepth)) {
					n.withInstanceNetworkSecurityGroup(InstanceNetworkSecurityGroupStaxUnmarshaller
							.getInstance().unmarshall(context));
					continue;
				}

				if (context.testExpression("PublicIp", targetDepth)) {
					n.setPublicIp(StringStaxUnmarshaller
							.getInstance().unmarshall(context));
					continue;
				}

				if (context.testExpression("AllocationId", targetDepth)) {
					n.setAllocationId(StringStaxUnmarshaller
							.getInstance().unmarshall(context));
					continue;
				}

			} else if (xmlEvent.isEndElement()) {
				if (context.getCurrentDepth() < originalDepth) {
					return n;
				}
			}
		}
	}

	private static InstanceNetworkStaxUnmarshaller instance;

	public static InstanceNetworkStaxUnmarshaller getInstance() {
		if (instance == null)
			instance = new InstanceNetworkStaxUnmarshaller();
		return instance;
	}
}
