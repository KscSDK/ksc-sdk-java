package com.ksc.network.vpc.transform.subnet;

import javax.xml.stream.events.XMLEvent;

import com.ksc.network.vpc.model.subnet.Subnet;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

/**
 * Subnet StAX Unmarshaller
 */
public class SubnetStaxUnmarshaller implements Unmarshaller<Subnet, StaxUnmarshallerContext> {

	public Subnet unmarshall(StaxUnmarshallerContext context) throws Exception {
		Subnet subnet = new Subnet();
		int originalDepth = context.getCurrentDepth();
		int targetDepth = originalDepth + 1;

		if (context.isStartOfDocument())
			targetDepth += 1;

		while (true) {
			XMLEvent xmlEvent = context.nextEvent();
			if (xmlEvent.isEndDocument())
				return subnet;
			if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

				if (context.testExpression("VpcId", targetDepth)) {
					subnet.setVpcId(StringStaxUnmarshaller.getInstance().unmarshall(context));
					continue;
				}

				if (context.testExpression("SubnetId", targetDepth)) {
					subnet.setSubnetId(StringStaxUnmarshaller.getInstance().unmarshall(context));
					continue;
				}

				if (context.testExpression("CidrBlock", targetDepth)) {
					subnet.setCidrBlock(StringStaxUnmarshaller.getInstance().unmarshall(context));
					continue;
				}

				if (context.testExpression("CreateTime", targetDepth)) {
					subnet.setCreateTime(StringStaxUnmarshaller.getInstance().unmarshall(context));
					continue;
				}

				if (context.testExpression("SubnetType", targetDepth)) {
					subnet.setSubnetType(StringStaxUnmarshaller.getInstance().unmarshall(context));
					continue;
				}
				if (context.testExpression("SubnetName", targetDepth)) {
					subnet.setSubnetName(StringStaxUnmarshaller.getInstance().unmarshall(context));
					continue;
				}
				if (context.testExpression("DhcpIpFrom", targetDepth)) {
					subnet.setDhcpIpFrom(StringStaxUnmarshaller.getInstance().unmarshall(context));
					continue;
				}
				if (context.testExpression("DhcpIpTo", targetDepth)) {
					subnet.setDhcpIpTo(StringStaxUnmarshaller.getInstance().unmarshall(context));
					continue;
				}
				if (context.testExpression("NetworkAclId", targetDepth)) {
					subnet.setNetworkAclId(StringStaxUnmarshaller.getInstance().unmarshall(context));
					continue;
				}
				if (context.testExpression("Dns1", targetDepth)) {
					subnet.setDns1(StringStaxUnmarshaller.getInstance().unmarshall(context));
					continue;
				}
				if (context.testExpression("Dns2", targetDepth)) {
					subnet.setDns2(StringStaxUnmarshaller.getInstance().unmarshall(context));
					continue;
				}
				if (context.testExpression("GatewayIp", targetDepth)) {
					subnet.setGatewayIp(StringStaxUnmarshaller.getInstance().unmarshall(context));
					continue;
				}
				if (context.testExpression("NatId", targetDepth)) {
					subnet.setNatId(StringStaxUnmarshaller.getInstance().unmarshall(context));
					continue;
				}
				if (context.testExpression("AvailbleIPNumber", targetDepth)) {
					subnet.setAvailbleIPNumber(StringStaxUnmarshaller.getInstance().unmarshall(context));
					continue;
				}
				if (context.testExpression("AvailabilityZoneName", targetDepth)) {
					subnet.setAvailabilityZoneName(StringStaxUnmarshaller.getInstance().unmarshall(context));
					continue;
				}
			} else if (xmlEvent.isEndElement()) {
				if (context.getCurrentDepth() < originalDepth) {
					return subnet;
				}
			}
		}
	}

	private static SubnetStaxUnmarshaller instance;

	public static SubnetStaxUnmarshaller getInstance() {
		if (instance == null)
			instance = new SubnetStaxUnmarshaller();
		return instance;
	}
}
