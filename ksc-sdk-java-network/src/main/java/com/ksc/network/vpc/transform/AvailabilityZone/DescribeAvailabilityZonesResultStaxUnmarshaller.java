package com.ksc.network.vpc.transform.AvailabilityZone;

import javax.xml.stream.events.XMLEvent;

import com.ksc.network.vpc.model.AvailabilityZone.DescribeAvailabilityZonesResult;
import com.ksc.network.vpc.model.vpc.DescribeVpcsResult;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;

/**
 * DescribeVpcsResult StAX Unmarshaller
 */
public class DescribeAvailabilityZonesResultStaxUnmarshaller implements
		Unmarshaller<DescribeAvailabilityZonesResult, StaxUnmarshallerContext> {

	public DescribeAvailabilityZonesResult unmarshall(StaxUnmarshallerContext context)
			throws Exception {
		DescribeAvailabilityZonesResult describeAvailabilityZonesResult = new DescribeAvailabilityZonesResult();
		int originalDepth = context.getCurrentDepth();
		int targetDepth = originalDepth + 1;

		if (context.isStartOfDocument())
			targetDepth += 1;

		while (true) {
			XMLEvent xmlEvent = context.nextEvent();
			if (xmlEvent.isEndDocument())
				return describeAvailabilityZonesResult;

			if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

				if (context.testExpression("AvailabilityZoneInfo/item", targetDepth)) {
					describeAvailabilityZonesResult.withAvailabilityZones(AvailabilityZoneStaxUnmarshaller
							.getInstance().unmarshall(context));
					continue;
				}else if(context.testExpression("RequestId", targetDepth)){
					describeAvailabilityZonesResult.setRequestId(StringStaxUnmarshaller.getInstance()
							.unmarshall(context));
					continue;
				}

			} else if (xmlEvent.isEndElement()) {
				if (context.getCurrentDepth() < originalDepth) {
					return describeAvailabilityZonesResult;
				}
			}
		}
	}

	private static DescribeAvailabilityZonesResultStaxUnmarshaller instance;

	public static DescribeAvailabilityZonesResultStaxUnmarshaller getInstance() {
		if (instance == null)
			instance = new DescribeAvailabilityZonesResultStaxUnmarshaller();
		return instance;
	}
}
