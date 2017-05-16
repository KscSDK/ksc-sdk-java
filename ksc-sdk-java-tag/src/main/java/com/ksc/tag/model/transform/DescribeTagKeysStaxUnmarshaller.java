package com.ksc.tag.model.transform;

import javax.xml.stream.events.XMLEvent;

import com.ksc.tag.model.DescribeTagKeysResult;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.IntegerStaxUnmarshaller;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

public class DescribeTagKeysStaxUnmarshaller implements
		Unmarshaller<DescribeTagKeysResult, StaxUnmarshallerContext> {

	private static DescribeTagKeysStaxUnmarshaller instance;

	public static DescribeTagKeysStaxUnmarshaller getInstance() {
		if (instance == null)
			instance = new DescribeTagKeysStaxUnmarshaller();
		return instance;
	}

	@Override
	public DescribeTagKeysResult unmarshall(StaxUnmarshallerContext context)
			throws Exception {
		DescribeTagKeysResult describeTagKeysResult = new DescribeTagKeysResult();
		int originalDepth = context.getCurrentDepth();
		int targetDepth = originalDepth + 1;

		if (context.isStartOfDocument())
			targetDepth += 1;

		while (true) {
			XMLEvent xmlEvent = context.nextEvent();
			if (xmlEvent.isEndDocument()) {
				return describeTagKeysResult;
			}
			if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {
				if (context.testExpression("TagKeySet/member/Key",
						targetDepth)) {
					describeTagKeysResult.withTagKeySet(StringStaxUnmarshaller
							.getInstance().unmarshall(context));
					continue;
				} else if (context.testExpression("RequestId", targetDepth)) {
					describeTagKeysResult.setRequestId(StringStaxUnmarshaller
							.getInstance().unmarshall(context));
					continue;
				} else if (context.testExpression("NextToken", targetDepth)) {
					describeTagKeysResult.setNextToken(StringStaxUnmarshaller
							.getInstance().unmarshall(context));
					continue;
				} else if (context.testExpression("TagKeySum", targetDepth)) {
					describeTagKeysResult.setTagKeySum(IntegerStaxUnmarshaller
							.getInstance().unmarshall(context));
					continue;
				}
			} else if (xmlEvent.isEndElement()) {
				if (context.getCurrentDepth() < originalDepth) {
					return describeTagKeysResult;
				}
			}
		}
	}

}
