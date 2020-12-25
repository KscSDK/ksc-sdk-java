package com.ksc.kec.model.transform;

import com.ksc.kec.model.Instance;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import javax.xml.stream.events.XMLEvent;

public class InstanceDataGuardStaxUnmarshaller implements
       Unmarshaller<Instance.DataGuard, StaxUnmarshallerContext> {

	public Instance.DataGuard unmarshall(StaxUnmarshallerContext context)
			throws Exception {
		Instance.DataGuard dataGuard = new Instance.DataGuard();
		int originalDepth = context.getCurrentDepth();
		int targetDepth = originalDepth + 1;

		if (context.isStartOfDocument())
			targetDepth += 1;

		while (true) {
			XMLEvent xmlEvent = context.nextEvent();
			if (xmlEvent.isEndDocument())
				return dataGuard;

			if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

				if (context.testExpression("DataGuardId", targetDepth)) {
					dataGuard.setDataGuardId(StringStaxUnmarshaller.getInstance()
							.unmarshall(context));
					continue;
				}

				if (context.testExpression("DataGuardName", targetDepth)) {
					dataGuard.setDataGuardName(StringStaxUnmarshaller.getInstance()
							.unmarshall(context));
					continue;
				}
				
			} else if (xmlEvent.isEndElement()) {
				if (context.getCurrentDepth() < originalDepth) {
					return dataGuard;
				}
			}
		}
	}

	private static InstanceDataGuardStaxUnmarshaller instance;

	public static InstanceDataGuardStaxUnmarshaller getInstance() {
		if (instance == null)
			instance = new InstanceDataGuardStaxUnmarshaller();
		return instance;
	}
}
