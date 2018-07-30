package com.ksc.kec.model.transform;

import javax.xml.stream.events.XMLEvent;

import com.ksc.kec.model.AvailabilityZone;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

public class AvailabilityZoneDetailStaxUnmarshaller implements
       Unmarshaller<AvailabilityZone, StaxUnmarshallerContext> {

	public AvailabilityZone unmarshall(StaxUnmarshallerContext context)
			throws Exception {
		AvailabilityZone availabilityZone = new AvailabilityZone();
		int originalDepth = context.getCurrentDepth();
		int targetDepth = originalDepth + 1;

		if (context.isStartOfDocument())
			targetDepth += 1;

		while (true) {
			XMLEvent xmlEvent = context.nextEvent();
			if (xmlEvent.isEndDocument())
				return availabilityZone;

			if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

				if (context.testExpression("AvailabilityZone", targetDepth)) {
					availabilityZone.setAvailabilityZone(StringStaxUnmarshaller.getInstance()
							.unmarshall(context));
					continue;
				}
				
				if (context.testExpression("Region", targetDepth)) {
					availabilityZone.setRegion(StringStaxUnmarshaller.getInstance()
							.unmarshall(context));
					continue;
				}

			} else if (xmlEvent.isEndElement()) {
				if (context.getCurrentDepth() < originalDepth) {
					return availabilityZone;
				}
			}
		}
	}

	private static AvailabilityZoneDetailStaxUnmarshaller instance;

	public static AvailabilityZoneDetailStaxUnmarshaller getInstance() {
		if (instance == null)
			instance = new AvailabilityZoneDetailStaxUnmarshaller();
		return instance;
	}
}
