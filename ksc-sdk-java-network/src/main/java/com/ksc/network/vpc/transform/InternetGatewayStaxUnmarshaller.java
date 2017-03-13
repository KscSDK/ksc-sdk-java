package com.ksc.network.vpc.transform;

import javax.xml.stream.events.XMLEvent;

import com.ksc.network.vpc.model.InternetGateway;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

/**
 * InternetGateway StAX Unmarshaller
 */
public class InternetGatewayStaxUnmarshaller implements Unmarshaller<InternetGateway, StaxUnmarshallerContext> {

	public InternetGateway unmarshall(StaxUnmarshallerContext context) throws Exception {
		InternetGateway internetGateway = new InternetGateway();
		int originalDepth = context.getCurrentDepth();
		int targetDepth = originalDepth + 1;

		if (context.isStartOfDocument())
			targetDepth += 1;

		while (true) {
			XMLEvent xmlEvent = context.nextEvent();
			if (xmlEvent.isEndDocument())
				return internetGateway;

			if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

				if (context.testExpression("VpcId", targetDepth)) {
					internetGateway.setVpcId(StringStaxUnmarshaller.getInstance().unmarshall(context));
					continue;
				}

				if (context.testExpression("InternetGatewayName", targetDepth)) {
					internetGateway.setInternetGatewayName(StringStaxUnmarshaller.getInstance().unmarshall(context));
					continue;
				}

				if (context.testExpression("InternetGatewayId", targetDepth)) {
					internetGateway.setInternetGatewayId(StringStaxUnmarshaller.getInstance().unmarshall(context));
					continue;
				}

				if (context.testExpression("CreateTime", targetDepth)) {
					internetGateway.setCreateTime(StringStaxUnmarshaller.getInstance().unmarshall(context));
					continue;
				}
				if (context.testExpression("PortfwdSet", targetDepth)) {
					internetGateway.addPortfwds(PortfwdStaxUnmarshaller.getInstance().unmarshall(context));
					continue;
				}

			} else if (xmlEvent.isEndElement()) {
				if (context.getCurrentDepth() < originalDepth) {
					return internetGateway;
				}
			}
		}
	}

	private static InternetGatewayStaxUnmarshaller instance;

	public static InternetGatewayStaxUnmarshaller getInstance() {
		if (instance == null)
			instance = new InternetGatewayStaxUnmarshaller();
		return instance;
	}
}
