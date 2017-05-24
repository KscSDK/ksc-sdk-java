package com.ksc.network.vpc.transform.Nat;

import com.ksc.network.vpc.model.Nat.DescribeNatsResult;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import javax.xml.stream.events.XMLEvent;

/**
 * DescribeNatsResult StAX Unmarshaller
 */
public class DescribeNatsResultStaxUnmarshaller
		implements Unmarshaller<DescribeNatsResult, StaxUnmarshallerContext> {

	public DescribeNatsResult unmarshall(StaxUnmarshallerContext context) throws Exception {
		DescribeNatsResult describeNatsResult = new DescribeNatsResult();
		int originalDepth = context.getCurrentDepth();
		int targetDepth = originalDepth + 1;

		if (context.isStartOfDocument())
			targetDepth += 1;

		while (true) {
			XMLEvent xmlEvent = context.nextEvent();
			if (xmlEvent.isEndDocument())
				return describeNatsResult;

			if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

				if (context.testExpression("NatSet/item", targetDepth)) {
					describeNatsResult
							.withNats(NatStaxUnmarshaller.getInstance().unmarshall(context));
					continue;
				} else if (context.testExpression("RequestId", targetDepth)) {
					describeNatsResult.setRequestId(StringStaxUnmarshaller.getInstance().unmarshall(context));
					continue;
				}

			} else if (xmlEvent.isEndElement()) {
				if (context.getCurrentDepth() < originalDepth) {
					return describeNatsResult;
				}
			}
		}
	}

	private static DescribeNatsResultStaxUnmarshaller instance;

	public static DescribeNatsResultStaxUnmarshaller getInstance() {
		if (instance == null)
			instance = new DescribeNatsResultStaxUnmarshaller();
		return instance;
	}
}
