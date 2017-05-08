package com.ksc.network.vpc.transform.Tunnels;

import com.ksc.network.vpc.model.Tunnels.DescribeTunnelsResult;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import javax.xml.stream.events.XMLEvent;

/**
 * DescribeTunnelsResult StAX Unmarshaller
 */
public class DescribeTunnelsResultStaxUnmarshaller
		implements Unmarshaller<DescribeTunnelsResult, StaxUnmarshallerContext> {

	public DescribeTunnelsResult unmarshall(StaxUnmarshallerContext context) throws Exception {
		DescribeTunnelsResult describeTunnelsResult = new DescribeTunnelsResult();
		int originalDepth = context.getCurrentDepth();
		int targetDepth = originalDepth + 1;

		if (context.isStartOfDocument())
			targetDepth += 1;

		while (true) {
			XMLEvent xmlEvent = context.nextEvent();
			if (xmlEvent.isEndDocument())
				return describeTunnelsResult;

			if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

				if (context.testExpression("TunnelSet/item", targetDepth)) {
					describeTunnelsResult
							.withTunnels(TunnelStaxUnmarshaller.getInstance().unmarshall(context));
					continue;
				} else if (context.testExpression("RequestId", targetDepth)) {
					describeTunnelsResult.setRequestId(StringStaxUnmarshaller.getInstance().unmarshall(context));
					continue;
				}

			} else if (xmlEvent.isEndElement()) {
				if (context.getCurrentDepth() < originalDepth) {
					return describeTunnelsResult;
				}
			}
		}
	}

	private static DescribeTunnelsResultStaxUnmarshaller instance;

	public static DescribeTunnelsResultStaxUnmarshaller getInstance() {
		if (instance == null)
			instance = new DescribeTunnelsResultStaxUnmarshaller();
		return instance;
	}
}
