package com.ksc.tag.model.transform;

import javax.xml.stream.events.XMLEvent;

import com.ksc.tag.model.DeleteTagsResult;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.BooleanStaxUnmarshaller;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

public class DeleteTagsStaxUnmarshaller
		implements Unmarshaller<DeleteTagsResult, StaxUnmarshallerContext> {

	private static DeleteTagsStaxUnmarshaller instance;

	public static DeleteTagsStaxUnmarshaller getInstance() {
		if (instance == null)
			instance = new DeleteTagsStaxUnmarshaller();
		return instance;
	}

	@Override
	public DeleteTagsResult unmarshall(StaxUnmarshallerContext context)
			throws Exception {
		DeleteTagsResult deleteTagsResult = new DeleteTagsResult();
		int originalDepth = context.getCurrentDepth();
		int targetDepth = originalDepth + 1;

		if (context.isStartOfDocument())
			targetDepth += 1;

		while (true) {
			XMLEvent xmlEvent = context.nextEvent();
			if (xmlEvent.isEndDocument()) {
				return deleteTagsResult;
			}
			if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {
				if (context.testExpression("RequestId", targetDepth)) {
					deleteTagsResult.setRequestId(StringStaxUnmarshaller
							.getInstance().unmarshall(context));
					continue;
				} else if (context.testExpression("Return", targetDepth)) {
					deleteTagsResult.setReturn(BooleanStaxUnmarshaller
							.getInstance().unmarshall(context));
					continue;
				}
			} else if (xmlEvent.isEndElement()) {
				if (context.getCurrentDepth() < originalDepth) {
					return deleteTagsResult;
				}
			}
		}
	}

}
