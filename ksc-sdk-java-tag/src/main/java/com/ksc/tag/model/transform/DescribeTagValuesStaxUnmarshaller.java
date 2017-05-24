package com.ksc.tag.model.transform;

import javax.xml.stream.events.XMLEvent;

import com.ksc.tag.model.DescribeTagValuesResult;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.IntegerStaxUnmarshaller;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

public class DescribeTagValuesStaxUnmarshaller implements
		Unmarshaller<DescribeTagValuesResult, StaxUnmarshallerContext> {

	private static DescribeTagValuesStaxUnmarshaller instance;

	public static DescribeTagValuesStaxUnmarshaller getInstance() {
		if (instance == null)
			instance = new DescribeTagValuesStaxUnmarshaller();
		return instance;
	}

	@Override
	public DescribeTagValuesResult unmarshall(StaxUnmarshallerContext context)
			throws Exception {
		DescribeTagValuesResult describeTagValuesResult = new DescribeTagValuesResult();
		int originalDepth = context.getCurrentDepth();
		int targetDepth = originalDepth + 1;

		if (context.isStartOfDocument())
			targetDepth += 1;

		while (true) {
			XMLEvent xmlEvent = context.nextEvent();
			if (xmlEvent.isEndDocument()) {
				return describeTagValuesResult;
			}
			if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {
				if (context.testExpression("TagValueSet/member", targetDepth)) {
					describeTagValuesResult.withTagSet(TagStaxUnmarshaller
							.getInstance().unmarshall(context));
					continue;
				} else if (context.testExpression("RequestId", targetDepth)) {
					describeTagValuesResult.setRequestId(StringStaxUnmarshaller
							.getInstance().unmarshall(context));
					continue;
				} else if (context.testExpression("NextToken", targetDepth)) {
					describeTagValuesResult.setNextToken(StringStaxUnmarshaller
							.getInstance().unmarshall(context));
					continue;
				} else if (context.testExpression("TagValueSum", targetDepth)) {
					describeTagValuesResult
							.setTagValueSum(IntegerStaxUnmarshaller
									.getInstance().unmarshall(context));
					continue;
				}
			} else if (xmlEvent.isEndElement()) {
				if (context.getCurrentDepth() < originalDepth) {
					return describeTagValuesResult;
				}
			}
		}
	}

}
