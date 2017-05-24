package com.ksc.tag.model.transform;

import javax.xml.stream.events.XMLEvent;

import com.ksc.tag.model.DescribeTagsResult;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.IntegerStaxUnmarshaller;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

public class DescribeTagsStaxUnmarshaller
		implements Unmarshaller<DescribeTagsResult, StaxUnmarshallerContext> {

	private static DescribeTagsStaxUnmarshaller instance;

	public static DescribeTagsStaxUnmarshaller getInstance() {
		if (instance == null)
			instance = new DescribeTagsStaxUnmarshaller();
		return instance;
	}

	@Override
	public DescribeTagsResult unmarshall(StaxUnmarshallerContext context)
			throws Exception {
		DescribeTagsResult describeTagsResult = new DescribeTagsResult();
		int originalDepth = context.getCurrentDepth();
		int targetDepth = originalDepth + 1;

		if (context.isStartOfDocument())
			targetDepth += 1;

		while (true) {
			XMLEvent xmlEvent = context.nextEvent();
			if (xmlEvent.isEndDocument()) {
				return describeTagsResult;
			}
			if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {
				if (context.testExpression("TagSet/member", targetDepth)) {
					describeTagsResult.withTagSet(TagDescriptionStaxUnmarshaller
							.getInstance().unmarshall(context));
					continue;
				} else if (context.testExpression("RequestId", targetDepth)) {
					describeTagsResult.setRequestId(StringStaxUnmarshaller
							.getInstance().unmarshall(context));
					continue;
				} else if (context.testExpression("NextToken", targetDepth)) {
					describeTagsResult.setNextToken(StringStaxUnmarshaller
							.getInstance().unmarshall(context));
					continue;
				} else if (context.testExpression("TagSum", targetDepth)) {
					describeTagsResult.setTagSum(IntegerStaxUnmarshaller
							.getInstance().unmarshall(context));
					continue;
				}
			} else if (xmlEvent.isEndElement()) {
				if (context.getCurrentDepth() < originalDepth) {
					return describeTagsResult;
				}
			}
		}
	}

}
