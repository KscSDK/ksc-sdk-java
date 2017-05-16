package com.ksc.tag.model.transform;

import javax.xml.stream.events.XMLEvent;

import com.ksc.tag.model.Tag;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

public class TagStaxUnmarshaller
		implements Unmarshaller<Tag, StaxUnmarshallerContext> {

	private static TagStaxUnmarshaller instance;

	public static TagStaxUnmarshaller getInstance() {
		if (instance == null)
			instance = new TagStaxUnmarshaller();
		return instance;
	}

	@Override
	public Tag unmarshall(StaxUnmarshallerContext context) throws Exception {
		Tag tag = new Tag();
		int originalDepth = context.getCurrentDepth();
		int targetDepth = originalDepth + 1;

		if (context.isStartOfDocument())
			targetDepth += 1;

		while (true) {
			XMLEvent xmlEvent = context.nextEvent();
			if (xmlEvent.isEndDocument())
				return tag;

			if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {
				if (context.testExpression("Key", targetDepth)) {
					tag.setKey(StringStaxUnmarshaller.getInstance()
							.unmarshall(context));
					continue;
				} else if (context.testExpression("Value", targetDepth)) {
					tag.setValue(StringStaxUnmarshaller.getInstance()
							.unmarshall(context));
					continue;
				}
			} else if (xmlEvent.isEndElement()) {
				if (context.getCurrentDepth() < originalDepth) {
					return tag;
				}
			}
		}
	}

}
