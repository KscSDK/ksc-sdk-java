package com.ksc.kec.model.transform;

import com.ksc.kec.model.DescribeAvailabilityZonesResult;
import com.ksc.kec.model.DescribeRegionsResult;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import javax.xml.stream.events.XMLEvent;

public class DescribeRegionsResultStaxUnmarshaller implements
       Unmarshaller<DescribeRegionsResult, StaxUnmarshallerContext>{

	public DescribeRegionsResult unmarshall(StaxUnmarshallerContext context)
			throws Exception {
		DescribeRegionsResult describeRegionsResult = new DescribeRegionsResult();
		int originalDepth = context.getCurrentDepth();
		int targetDepth = originalDepth + 1;

		if (context.isStartOfDocument())
			targetDepth += 1;

		while (true) {
			XMLEvent xmlEvent = context.nextEvent();
			if (xmlEvent.isEndDocument())
				return describeRegionsResult;

			if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {
				if (context.testExpression("RegionSet/Region", targetDepth)) {
					describeRegionsResult.withRegion(RegionStaxUnmarshaller
							.getInstance().unmarshall(context));
					continue;
				}

				if (context.testExpression("RequestId", targetDepth)) {
					describeRegionsResult.setRequestId(StringStaxUnmarshaller
							.getInstance().unmarshall(context));
					continue;
				}
			} else if (xmlEvent.isEndElement()) {
				if (context.getCurrentDepth() < originalDepth) {
					return describeRegionsResult;
				}
			}
		}
	}

	private static DescribeRegionsResultStaxUnmarshaller instance;

	public static DescribeRegionsResultStaxUnmarshaller getInstance() {
		if (instance == null)
			instance = new DescribeRegionsResultStaxUnmarshaller();
		return instance;
	}
}
