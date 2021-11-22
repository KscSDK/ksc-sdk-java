package com.ksc.network.vpc.transform.havip;

import com.ksc.network.vpc.model.havip.DescribeHaVipResult;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import javax.xml.stream.events.XMLEvent;

/**
 * DescribeHaVipResult StAX Unmarshaller
 */
public class DescribeHaVipResultStaxUnmarshaller
		implements Unmarshaller<DescribeHaVipResult, StaxUnmarshallerContext> {

    @Override
	public DescribeHaVipResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        DescribeHaVipResult describeHaVipResult = new DescribeHaVipResult();
		int originalDepth = context.getCurrentDepth();
		int targetDepth = originalDepth + 1;

		if (context.isStartOfDocument())
			targetDepth += 1;

		while (true) {
			XMLEvent xmlEvent = context.nextEvent();
			if (xmlEvent.isEndDocument())
				return describeHaVipResult;

			if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

				if (context.testExpression("HaVipSet/item", targetDepth)) {
                    describeHaVipResult.withHaVips(HaVipStaxUnmarshaller.getInstance().unmarshall(context));
					continue;
				} else if (context.testExpression("RequestId", targetDepth)) {
                    describeHaVipResult.setRequestId(StringStaxUnmarshaller.getInstance().unmarshall(context));
					continue;
				} else if (context.testExpression("NextToken", targetDepth)) {
                    describeHaVipResult.setNextToken(StringStaxUnmarshaller.getInstance().unmarshall(context));
					continue;
				}

			} else if (xmlEvent.isEndElement()) {
				if (context.getCurrentDepth() < originalDepth) {
					return describeHaVipResult;
				}
			}
		}
	}

	private static DescribeHaVipResultStaxUnmarshaller instance;

	public static DescribeHaVipResultStaxUnmarshaller getInstance() {
		if (instance == null)
			instance = new DescribeHaVipResultStaxUnmarshaller();
		return instance;
	}
}
