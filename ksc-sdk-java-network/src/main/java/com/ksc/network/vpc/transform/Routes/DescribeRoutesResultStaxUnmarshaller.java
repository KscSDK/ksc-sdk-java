package com.ksc.network.vpc.transform.Routes;

import com.ksc.network.vpc.model.Route.DescribeRoutesResult;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import javax.xml.stream.events.XMLEvent;

/**
 * DescribeRoutesResult StAX Unmarshaller
 */
public class DescribeRoutesResultStaxUnmarshaller
		implements Unmarshaller<DescribeRoutesResult, StaxUnmarshallerContext> {

	public DescribeRoutesResult unmarshall(StaxUnmarshallerContext context) throws Exception {
		DescribeRoutesResult describeRoutesResult = new DescribeRoutesResult();
		int originalDepth = context.getCurrentDepth();
		int targetDepth = originalDepth + 1;

		if (context.isStartOfDocument())
			targetDepth += 1;

		while (true) {
			XMLEvent xmlEvent = context.nextEvent();
			if (xmlEvent.isEndDocument())
				return describeRoutesResult;

			if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

				if (context.testExpression("RouteSet/item", targetDepth)) {
					describeRoutesResult
							.withRoutes(RouteStaxUnmarshaller.getInstance().unmarshall(context));
					continue;
				} else if (context.testExpression("RequestId", targetDepth)) {
					describeRoutesResult.setRequestId(StringStaxUnmarshaller.getInstance().unmarshall(context));
					continue;
				} else if (context.testExpression("NextToken", targetDepth)) {
					describeRoutesResult.setNextToken(StringStaxUnmarshaller.getInstance().unmarshall(context));
					continue;
				}

			} else if (xmlEvent.isEndElement()) {
				if (context.getCurrentDepth() < originalDepth) {
					return describeRoutesResult;
				}
			}
		}
	}

	private static DescribeRoutesResultStaxUnmarshaller instance;

	public static DescribeRoutesResultStaxUnmarshaller getInstance() {
		if (instance == null)
			instance = new DescribeRoutesResultStaxUnmarshaller();
		return instance;
	}
}
