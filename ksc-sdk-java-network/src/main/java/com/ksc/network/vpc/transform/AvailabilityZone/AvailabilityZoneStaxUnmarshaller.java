package com.ksc.network.vpc.transform.AvailabilityZone;

import javax.xml.stream.events.XMLEvent;

import com.ksc.network.vpc.model.AvailabilityZone.AvailabilityZone;
import com.ksc.network.vpc.model.vpc.Vpc;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.BooleanStaxUnmarshaller;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

/**
 * Vpc StAX Unmarshaller
 */
public class AvailabilityZoneStaxUnmarshaller implements
		Unmarshaller<AvailabilityZone, StaxUnmarshallerContext> {

	public AvailabilityZone unmarshall(StaxUnmarshallerContext context) throws Exception {
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

				if (context.testExpression("ZoneName", targetDepth)) {
					availabilityZone.setZoneName(StringStaxUnmarshaller.getInstance()
							.unmarshall(context));
					continue;
				}

				if (context.testExpression("ZoneState", targetDepth)) {
					availabilityZone.setZoneState(StringStaxUnmarshaller.getInstance()
							.unmarshall(context));
					continue;
				}

				if (context.testExpression("RegionName", targetDepth)) {
					availabilityZone.setRegionName(StringStaxUnmarshaller.getInstance()
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

	private static AvailabilityZoneStaxUnmarshaller instance;

	public static AvailabilityZoneStaxUnmarshaller getInstance() {
		if (instance == null)
			instance = new AvailabilityZoneStaxUnmarshaller();
		return instance;
	}
}
