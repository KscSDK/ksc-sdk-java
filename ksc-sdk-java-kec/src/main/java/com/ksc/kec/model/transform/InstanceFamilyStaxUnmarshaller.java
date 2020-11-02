package com.ksc.kec.model.transform;

import javax.xml.stream.events.XMLEvent;

import com.ksc.kec.model.InstanceFamily;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

/**
 * Reservation StAX Unmarshaller
 */
public class InstanceFamilyStaxUnmarshaller implements
		Unmarshaller<InstanceFamily, StaxUnmarshallerContext> {

	public InstanceFamily unmarshall(StaxUnmarshallerContext context)
			throws Exception {
		InstanceFamily instanceFamily = new InstanceFamily();
		int originalDepth = context.getCurrentDepth();
		int targetDepth = originalDepth + 1;

		if (context.isStartOfDocument())
			targetDepth += 1;

		while (true) {
			XMLEvent xmlEvent = context.nextEvent();
			if (xmlEvent.isEndDocument())
				return instanceFamily;

			if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

				if (context.testExpression("InstanceFamilyName", targetDepth)) {
					instanceFamily.setInstanceFamilyName(StringStaxUnmarshaller.getInstance()
							.unmarshall(context));
					continue;
				}

				if (context.testExpression("InstanceFamily", targetDepth)) {
					instanceFamily.setInstanceFamily(StringStaxUnmarshaller.getInstance()
							.unmarshall(context));
					continue;
				}

				if (context.testExpression("AvailabilityZoneSet/AvailabilityZone", targetDepth)) {
					instanceFamily.withAvailabilityZoneSet(AvailabilityZoneInfoStaxUnmarshaller.getInstance()
							.unmarshall(context));
					continue;
				}

			} else if (xmlEvent.isEndElement()) {
				if (context.getCurrentDepth() < originalDepth) {
					return instanceFamily;
				}
			}
		}
	}

	private static InstanceFamilyStaxUnmarshaller instance;

	public static InstanceFamilyStaxUnmarshaller getInstance() {
		if (instance == null)
			instance = new InstanceFamilyStaxUnmarshaller();
		return instance;
	}
}