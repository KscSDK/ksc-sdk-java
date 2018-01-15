package com.ksc.network.slb.model.transform;

import com.ksc.network.slb.model.DescribeHealthChecksResult;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import javax.xml.stream.events.XMLEvent;

public class DescribeHealthChecksResultStaxUnmarshaller
		implements Unmarshaller<DescribeHealthChecksResult, StaxUnmarshallerContext> {

	@Override
	public DescribeHealthChecksResult unmarshall(StaxUnmarshallerContext context) throws Exception {
		DescribeHealthChecksResult describeHealthChecksResult = new DescribeHealthChecksResult();
		int originalDepth = context.getCurrentDepth();
		int targetDepth = originalDepth + 1;

		if (context.isStartOfDocument())
			targetDepth += 1;

		while (true) {
			XMLEvent xmlEvent = context.nextEvent();
			if (xmlEvent.isEndDocument())
				return describeHealthChecksResult;

			if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

				if (context.testExpression("HealthCheckSet/Item", targetDepth)) {
					describeHealthChecksResult
							.addHealthCheckSet(HealthCheckStaxUnmarshaller.getInstance().unmarshall(context));
					continue;
				} else if (context.testExpression("RequestId", targetDepth)) {
					describeHealthChecksResult.setRequestId(StringStaxUnmarshaller.getInstance().unmarshall(context));
					continue;
				}

			} else if (xmlEvent.isEndElement()) {
				if (context.getCurrentDepth() < originalDepth) {
					return describeHealthChecksResult;
				}
			}
		}
	}

	private static DescribeHealthChecksResultStaxUnmarshaller instance;

	public static DescribeHealthChecksResultStaxUnmarshaller getInstance() {
		if (instance == null)
			instance = new DescribeHealthChecksResultStaxUnmarshaller();
		return instance;
	}

}
