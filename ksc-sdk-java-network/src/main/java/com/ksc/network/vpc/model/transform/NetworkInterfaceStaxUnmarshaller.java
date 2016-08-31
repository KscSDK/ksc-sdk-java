package com.ksc.network.vpc.model.transform;

import javax.xml.stream.events.XMLEvent;

import com.ksc.network.vpc.model.NetworkInterface;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

/**
 * NetworkInterface StAX Unmarshaller
 */
public class NetworkInterfaceStaxUnmarshaller implements Unmarshaller<NetworkInterface, StaxUnmarshallerContext> {

	public NetworkInterface unmarshall(StaxUnmarshallerContext context) throws Exception {
		NetworkInterface networkInterface = new NetworkInterface();
		int originalDepth = context.getCurrentDepth();
		int targetDepth = originalDepth + 1;

		if (context.isStartOfDocument())
			targetDepth += 1;

		while (true) {
			XMLEvent xmlEvent = context.nextEvent();
			if (xmlEvent.isEndDocument())
				return networkInterface;

			if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

				if (context.testExpression("VpcId", targetDepth)) {
					networkInterface.setVpcId(StringStaxUnmarshaller.getInstance().unmarshall(context));
					continue;
				}

				if (context.testExpression("VpcName", targetDepth)) {
					networkInterface.setVpcName(StringStaxUnmarshaller.getInstance().unmarshall(context));
					continue;
				}

				if (context.testExpression("CidrBlock", targetDepth)) {
					networkInterface.setCidrBlock(StringStaxUnmarshaller.getInstance().unmarshall(context));
					continue;
				}

				if (context.testExpression("SubnetId", targetDepth)) {
					networkInterface.setSubnetId(StringStaxUnmarshaller.getInstance().unmarshall(context));
					continue;
				}

				if (context.testExpression("SubnetName", targetDepth)) {
					networkInterface.setSubnetName(StringStaxUnmarshaller.getInstance().unmarshall(context));
					continue;
				}
				if (context.testExpression("SecurityGroupId", targetDepth)) {
					networkInterface.setSecurityGroupId(StringStaxUnmarshaller.getInstance().unmarshall(context));
					continue;
				}
				if (context.testExpression("SecurityGroupName", targetDepth)) {
					networkInterface.setSecurityGroupName(StringStaxUnmarshaller.getInstance().unmarshall(context));
					continue;
				}
				if (context.testExpression("InstanceId", targetDepth)) {
					networkInterface.setInstanceId(StringStaxUnmarshaller.getInstance().unmarshall(context));
					continue;
				}
				if (context.testExpression("PrivateIpAddress", targetDepth)) {
					networkInterface.setPrivateIpAddress(StringStaxUnmarshaller.getInstance().unmarshall(context));
					continue;
				}
				if (context.testExpression("InstanceType", targetDepth)) {
					networkInterface.setInstanceType(StringStaxUnmarshaller.getInstance().unmarshall(context));
					continue;
				}
				if (context.testExpression("DNS1", targetDepth)) {
					networkInterface.setDNS1(StringStaxUnmarshaller.getInstance().unmarshall(context));
					continue;
				}
				if (context.testExpression("DNS2", targetDepth)) {
					networkInterface.setDNS2(StringStaxUnmarshaller.getInstance().unmarshall(context));
					continue;
				}
				if (context.testExpression("NetworkInterfaceId", targetDepth)) {
					networkInterface.setNetworkInterfaceId(StringStaxUnmarshaller.getInstance().unmarshall(context));
					continue;
				}
			} else if (xmlEvent.isEndElement()) {
				if (context.getCurrentDepth() < originalDepth) {
					return networkInterface;
				}
			}
		}
	}

	private static NetworkInterfaceStaxUnmarshaller instance;

	public static NetworkInterfaceStaxUnmarshaller getInstance() {
		if (instance == null)
			instance = new NetworkInterfaceStaxUnmarshaller();
		return instance;
	}
}
