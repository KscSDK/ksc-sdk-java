package com.ksc.kec.model.transform;

import javax.xml.stream.events.XMLEvent;

import com.ksc.kec.model.InstanceState;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

/**
 * InstanceState StAX Unmarshaller
 */
public class InstanceStateStaxUnmarshaller implements
		Unmarshaller<InstanceState, StaxUnmarshallerContext> {

	public InstanceState unmarshall(StaxUnmarshallerContext context)
			throws Exception {
		InstanceState instanceState = new InstanceState();
		int originalDepth = context.getCurrentDepth();
		int targetDepth = originalDepth + 1;

		if (context.isStartOfDocument())
			targetDepth += 1;

		while (true) {
			XMLEvent xmlEvent = context.nextEvent();
			if (xmlEvent.isEndDocument())
				return instanceState;

			if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

				if (context.testExpression("Name", targetDepth)) {
					instanceState.setName(StringStaxUnmarshaller.getInstance()
							.unmarshall(context));
					continue;
				}
			} else if (xmlEvent.isEndElement()) {
				if (context.getCurrentDepth() < originalDepth) {
					return instanceState;
				}
			}
		}
	}

	private static InstanceStateStaxUnmarshaller instance;

	public static InstanceStateStaxUnmarshaller getInstance() {
		if (instance == null)
			instance = new InstanceStateStaxUnmarshaller();
		return instance;
	}
}
