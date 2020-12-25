package com.ksc.network.vpc.transform.vpc;

import javax.xml.stream.events.XMLEvent;

import com.ksc.network.vpc.model.vpc.DescribeVpcsResult;
import com.ksc.transform.SimpleTypeStaxUnmarshallers;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;

/**
 * DescribeVpcsResult StAX Unmarshaller
 */
public class DescribeVpcsResultStaxUnmarshaller implements
		Unmarshaller<DescribeVpcsResult, StaxUnmarshallerContext> {

	public DescribeVpcsResult unmarshall(StaxUnmarshallerContext context)
			throws Exception {
		DescribeVpcsResult describeVpcsResult = new DescribeVpcsResult();
		int originalDepth = context.getCurrentDepth();
		int targetDepth = originalDepth + 1;

		if (context.isStartOfDocument())
			targetDepth += 1;

		while (true) {
			XMLEvent xmlEvent = context.nextEvent();
			if (xmlEvent.isEndDocument())
				return describeVpcsResult;

			if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

				if (context.testExpression("VpcSet/item", targetDepth)) {
					describeVpcsResult.withVpcs(VpcStaxUnmarshaller
							.getInstance().unmarshall(context));
					continue;
				}else if(context.testExpression("RequestId", targetDepth)){
					describeVpcsResult.setRequestId(StringStaxUnmarshaller.getInstance()
							.unmarshall(context));
					continue;
				}else if (context.testExpression("NextToken", targetDepth)) {
					describeVpcsResult.setNextToken(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller.getInstance().unmarshall(context));
					continue;
				}

			} else if (xmlEvent.isEndElement()) {
				if (context.getCurrentDepth() < originalDepth) {
					return describeVpcsResult;
				}
			}
		}
	}

	private static DescribeVpcsResultStaxUnmarshaller instance;

	public static DescribeVpcsResultStaxUnmarshaller getInstance() {
		if (instance == null)
			instance = new DescribeVpcsResultStaxUnmarshaller();
		return instance;
	}
}
