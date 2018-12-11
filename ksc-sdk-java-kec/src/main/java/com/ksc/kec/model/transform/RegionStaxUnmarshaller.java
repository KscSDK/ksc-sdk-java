package com.ksc.kec.model.transform;

import com.ksc.kec.model.Region;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import javax.xml.stream.events.XMLEvent;

public class RegionStaxUnmarshaller implements
       Unmarshaller<Region, StaxUnmarshallerContext> {

	public Region unmarshall(StaxUnmarshallerContext context)
			throws Exception {
		Region region = new Region();
		int originalDepth = context.getCurrentDepth();
		int targetDepth = originalDepth + 1;

		if (context.isStartOfDocument())
			targetDepth += 1;

		while (true) {
			XMLEvent xmlEvent = context.nextEvent();
			if (xmlEvent.isEndDocument())
				return region;

			if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

				if (context.testExpression("RegionName", targetDepth)) {
					region.setRegionName(StringStaxUnmarshaller.getInstance()
							.unmarshall(context));
					continue;
				}
				
				if (context.testExpression("Region", targetDepth)) {
					region.setRegion(StringStaxUnmarshaller.getInstance()
							.unmarshall(context));
					continue;
				}

			} else if (xmlEvent.isEndElement()) {
				if (context.getCurrentDepth() < originalDepth) {
					return region;
				}
			}
		}
	}

	private static RegionStaxUnmarshaller instance;

	public static RegionStaxUnmarshaller getInstance() {
		if (instance == null)
			instance = new RegionStaxUnmarshaller();
		return instance;
	}
}
