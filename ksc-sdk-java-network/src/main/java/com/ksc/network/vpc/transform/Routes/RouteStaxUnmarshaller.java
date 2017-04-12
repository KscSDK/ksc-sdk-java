package com.ksc.network.vpc.transform.Routes;

import javax.xml.stream.events.XMLEvent;

import com.ksc.network.vpc.model.Route.Route;
import com.ksc.network.vpc.model.SecurityGroups.SecurityGroup;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

/**
 * SecurityGroup StAX Unmarshaller
 */
public class RouteStaxUnmarshaller implements Unmarshaller<Route, StaxUnmarshallerContext> {

	public Route unmarshall(StaxUnmarshallerContext context) throws Exception {
		Route hop = new Route();
		int originalDepth = context.getCurrentDepth();
		int targetDepth = originalDepth + 1;

		if (context.isStartOfDocument())
			targetDepth += 1;
		
		while (true) {
			XMLEvent xmlEvent = context.nextEvent();
			if (xmlEvent.isEndDocument())
				return hop;
			if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

				if (context.testExpression("CreateTime", targetDepth)) {
					hop.setCreateTime(StringStaxUnmarshaller.getInstance().unmarshall(context));
					continue;
				}

				if (context.testExpression("VpcId", targetDepth)) {
					hop.setVpcId(StringStaxUnmarshaller.getInstance().unmarshall(context));
					continue;
				}

				if (context.testExpression("RouteId", targetDepth)) {
					hop.setRouteId(StringStaxUnmarshaller.getInstance().unmarshall(context));
					continue;
				}

				if (context.testExpression("DestinationCidrBlock", targetDepth)) {
					hop.setDestinationCidrBlock(StringStaxUnmarshaller.getInstance().unmarshall(context));
					continue;
				}

				if (context.testExpression("RouteType", targetDepth)) {
					hop.setRouteType(StringStaxUnmarshaller.getInstance().unmarshall(context));
					continue;
				}
				if (context.testExpression("NextHopSet/item", targetDepth)) {
					hop.addNextHopSet(NextHopStaxUnmarshaller.getInstance().unmarshall(context));
					continue;
				}
			} else if (xmlEvent.isEndElement()) {
				if (context.getCurrentDepth() < originalDepth) {
					return hop;
				}
			}
		}
	}

	private static RouteStaxUnmarshaller instance;

	public static RouteStaxUnmarshaller getInstance() {
		if (instance == null)
			instance = new RouteStaxUnmarshaller();
		return instance;
	}
}
