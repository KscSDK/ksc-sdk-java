package com.ksc.network.vpc.transform.Routes;

import javax.xml.stream.events.XMLEvent;

import com.ksc.network.vpc.model.Route.NextHop;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

/**
 * NextHop StAX Unmarshaller
 */
public class NextHopStaxUnmarshaller implements Unmarshaller<NextHop, StaxUnmarshallerContext> {

	public NextHop unmarshall(StaxUnmarshallerContext context) throws Exception {
		NextHop hop = new NextHop();
		int originalDepth = context.getCurrentDepth();
		int targetDepth = originalDepth + 1;

		if (context.isStartOfDocument())
			targetDepth += 1;
		
		while (true) {
			XMLEvent xmlEvent = context.nextEvent();
			if (xmlEvent.isEndDocument())
				return hop;
			if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

				if (context.testExpression("GatewayId", targetDepth)) {
					hop.setGatewayId(StringStaxUnmarshaller.getInstance().unmarshall(context));
					continue;
				}

				if (context.testExpression("GatewayName", targetDepth)) {
					hop.setGatewayName(StringStaxUnmarshaller.getInstance().unmarshall(context));
					continue;
				}

			} else if (xmlEvent.isEndElement()) {
				if (context.getCurrentDepth() < originalDepth) {
					return hop;
				}
			}
		}
	}

	private static NextHopStaxUnmarshaller instance;

	public static NextHopStaxUnmarshaller getInstance() {
		if (instance == null)
			instance = new NextHopStaxUnmarshaller();
		return instance;
	}
}
