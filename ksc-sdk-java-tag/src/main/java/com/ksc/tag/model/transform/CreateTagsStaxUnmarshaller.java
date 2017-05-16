package com.ksc.tag.model.transform;

import javax.xml.stream.events.XMLEvent;

import com.ksc.tag.model.CreateTagsResult;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.BooleanStaxUnmarshaller;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

public class CreateTagsStaxUnmarshaller
		implements Unmarshaller<CreateTagsResult, StaxUnmarshallerContext> {

	private static CreateTagsStaxUnmarshaller instance;

	public static CreateTagsStaxUnmarshaller getInstance() {
		if (instance == null)
			instance = new CreateTagsStaxUnmarshaller();
		return instance;
	}

	@Override
	public CreateTagsResult unmarshall(StaxUnmarshallerContext context)
			throws Exception {
		CreateTagsResult createTagsResult = new CreateTagsResult();
		int originalDepth = context.getCurrentDepth();
		int targetDepth = originalDepth + 1;

		if (context.isStartOfDocument())
			targetDepth += 1;

		while (true) {
			XMLEvent xmlEvent = context.nextEvent();
			if (xmlEvent.isEndDocument()) {
				return createTagsResult;
			}
			if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {
				if (context.testExpression("RequestId", targetDepth)) {
					createTagsResult.setRequestId(StringStaxUnmarshaller
							.getInstance().unmarshall(context));
					continue;
				} else if (context.testExpression("Return", targetDepth)) {
					createTagsResult.setReturn(BooleanStaxUnmarshaller
							.getInstance().unmarshall(context));
					continue;
				}
			} else if (xmlEvent.isEndElement()) {
				if (context.getCurrentDepth() < originalDepth) {
					return createTagsResult;
				}
			}
		}
	}

}
