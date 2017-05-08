package com.ksc.network.vpc.transform.VpcPeeringConnection;

import com.ksc.network.vpc.model.VpcPeeringConnection.DescribeVpcPeeringConnectionsResult;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import javax.xml.stream.events.XMLEvent;

/**
 * DescribeVpcPeeringConnectionsResult StAX Unmarshaller
 */
public class DescribeVpcPeeringConnectionsResultStaxUnmarshaller
		implements Unmarshaller<DescribeVpcPeeringConnectionsResult, StaxUnmarshallerContext> {

	public DescribeVpcPeeringConnectionsResult unmarshall(StaxUnmarshallerContext context) throws Exception {
		DescribeVpcPeeringConnectionsResult describeVpcPeeringConnectionsResult = new DescribeVpcPeeringConnectionsResult();
		int originalDepth = context.getCurrentDepth();
		int targetDepth = originalDepth + 1;

		if (context.isStartOfDocument())
			targetDepth += 1;

		while (true) {
			XMLEvent xmlEvent = context.nextEvent();
			if (xmlEvent.isEndDocument())
				return describeVpcPeeringConnectionsResult;

			if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

				if (context.testExpression("VpcPeeringConnectionSet/item", targetDepth)) {
					describeVpcPeeringConnectionsResult
							.withVpcPeeringConnections(VpcPeeringConnectionStaxUnmarshaller.getInstance().unmarshall(context));
					continue;
				} else if (context.testExpression("RequestId", targetDepth)) {
					describeVpcPeeringConnectionsResult.setRequestId(StringStaxUnmarshaller.getInstance().unmarshall(context));
					continue;
				}

			} else if (xmlEvent.isEndElement()) {
				if (context.getCurrentDepth() < originalDepth) {
					return describeVpcPeeringConnectionsResult;
				}
			}
		}
	}

	private static DescribeVpcPeeringConnectionsResultStaxUnmarshaller instance;

	public static DescribeVpcPeeringConnectionsResultStaxUnmarshaller getInstance() {
		if (instance == null)
			instance = new DescribeVpcPeeringConnectionsResultStaxUnmarshaller();
		return instance;
	}
}
