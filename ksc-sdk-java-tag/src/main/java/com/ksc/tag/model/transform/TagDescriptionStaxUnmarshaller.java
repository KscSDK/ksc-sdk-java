package com.ksc.tag.model.transform;

import javax.xml.stream.events.XMLEvent;

import com.ksc.tag.model.TagDescription;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;

public class TagDescriptionStaxUnmarshaller
		implements Unmarshaller<TagDescription, StaxUnmarshallerContext> {

	private static TagDescriptionStaxUnmarshaller instance;

	public static TagDescriptionStaxUnmarshaller getInstance() {
		if (instance == null)
			instance = new TagDescriptionStaxUnmarshaller();
		return instance;
	}

	@Override
	public TagDescription unmarshall(StaxUnmarshallerContext context)
			throws Exception {
		TagDescription tagDescription = new TagDescription();
		int originalDepth = context.getCurrentDepth();
		int targetDepth = originalDepth + 1;

		if (context.isStartOfDocument())
			targetDepth += 1;

		while (true) {
			XMLEvent xmlEvent = context.nextEvent();
			if (xmlEvent.isEndDocument())
				return tagDescription;

			if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {
				if (context.testExpression("Key", targetDepth)) {
					tagDescription.setKey(StringStaxUnmarshaller.getInstance()
							.unmarshall(context));
					continue;
				} else if (context.testExpression("Value", targetDepth)) {
					tagDescription.setValue(StringStaxUnmarshaller.getInstance()
							.unmarshall(context));
					continue;
				} else if (context.testExpression("ResourceType",
						targetDepth)) {
					tagDescription.setResourceType(StringStaxUnmarshaller
							.getInstance().unmarshall(context));
					continue;
				} else if (context.testExpression("ResourceId", targetDepth)) {
					tagDescription.setResourceId(StringStaxUnmarshaller
							.getInstance().unmarshall(context));
					continue;
				}
			} else if (xmlEvent.isEndElement()) {
				if (context.getCurrentDepth() < originalDepth) {
					return tagDescription;
				}
			}
		}
	}

}
