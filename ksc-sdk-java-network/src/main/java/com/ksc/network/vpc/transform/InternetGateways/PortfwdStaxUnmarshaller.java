package com.ksc.network.vpc.transform.InternetGateways;

import javax.xml.stream.events.XMLEvent;

import com.ksc.network.vpc.model.InternetGateways.Portfwd;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

/**
 * Portfwd StAX Unmarshaller
 */
public class PortfwdStaxUnmarshaller implements Unmarshaller<Portfwd, StaxUnmarshallerContext> {

	public Portfwd unmarshall(StaxUnmarshallerContext context) throws Exception {
		Portfwd portfwd = new Portfwd();
		int originalDepth = context.getCurrentDepth();
		int targetDepth = originalDepth + 1;

		if (context.isStartOfDocument())
			targetDepth += 1;

		while (true) {
			XMLEvent xmlEvent = context.nextEvent();
			if (xmlEvent.isEndDocument())
				return portfwd;

			if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

				if (context.testExpression("PortfwdId", targetDepth)) {
					portfwd.setPortfwdId(StringStaxUnmarshaller.getInstance().unmarshall(context));
				}

			} else if (xmlEvent.isEndElement()) {
				if (context.getCurrentDepth() < originalDepth) {
					return portfwd;
				}
			}
		}
	}

	private static PortfwdStaxUnmarshaller instance;

	public static PortfwdStaxUnmarshaller getInstance() {
		if (instance == null)
			instance = new PortfwdStaxUnmarshaller();
		return instance;
	}
}
