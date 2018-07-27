package com.ksc.kec.model.transform;

import javax.xml.stream.events.XMLEvent;

import com.ksc.kec.model.AvailabilityZoneInfo;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

public class AvailabilityZoneInfoStaxUnmarshaller implements
       Unmarshaller<AvailabilityZoneInfo, StaxUnmarshallerContext> {

	public AvailabilityZoneInfo unmarshall(StaxUnmarshallerContext context)
			throws Exception {
		AvailabilityZoneInfo availabilityZoneInfo = new AvailabilityZoneInfo();
		int originalDepth = context.getCurrentDepth();
		int targetDepth = originalDepth + 1;

		if (context.isStartOfDocument())
			targetDepth += 1;

		while (true) {
			XMLEvent xmlEvent = context.nextEvent();
			if (xmlEvent.isEndDocument())
				return availabilityZoneInfo;

			if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

				if (context.testExpression("AzCode", targetDepth)) {
					availabilityZoneInfo.setAzCode(StringStaxUnmarshaller.getInstance()
							.unmarshall(context));
					continue;
				}
				
			} else if (xmlEvent.isEndElement()) {
				if (context.getCurrentDepth() < originalDepth) {
					return availabilityZoneInfo;
				}
			}
		}
	}

	private static AvailabilityZoneInfoStaxUnmarshaller instance;

	public static AvailabilityZoneInfoStaxUnmarshaller getInstance() {
		if (instance == null)
			instance = new AvailabilityZoneInfoStaxUnmarshaller();
		return instance;
	}
}
