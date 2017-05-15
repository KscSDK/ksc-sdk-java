package com.ksc.network.slb.model.transform;

import com.ksc.network.slb.model.ConfigureHealthCheckResult;
import com.ksc.transform.SimpleTypeStaxUnmarshallers;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import javax.xml.stream.events.XMLEvent;

/**
 * ConfigureHealthCheckResult StAX Unmarshaller
 */
public class ConfigureHealthCheckResultStaxUnmarshaller implements
		Unmarshaller<ConfigureHealthCheckResult, StaxUnmarshallerContext> {

	public ConfigureHealthCheckResult unmarshall(StaxUnmarshallerContext context)
			throws Exception {
		ConfigureHealthCheckResult ConfigureHealthCheckResult = new ConfigureHealthCheckResult();
		int originalDepth = context.getCurrentDepth();
		int targetDepth = originalDepth + 1;

		if (context.isStartOfDocument())
			targetDepth += 1;

		while (true) {
			XMLEvent xmlEvent = context.nextEvent();
			if (xmlEvent.isEndDocument())
				return ConfigureHealthCheckResult;

			if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

				if (context.testExpression("Interval", targetDepth)) {
					ConfigureHealthCheckResult.setInterval(SimpleTypeStaxUnmarshallers.IntegerStaxUnmarshaller
							.getInstance().unmarshall(context));
					continue;
				}

				if (context.testExpression("UnhealthyThreshold", targetDepth)) {
					ConfigureHealthCheckResult.setUnhealthyThreshold(SimpleTypeStaxUnmarshallers.IntegerStaxUnmarshaller
							.getInstance().unmarshall(context));
					continue;
				}

				if (context.testExpression("HealthCheckState", targetDepth)) {
					ConfigureHealthCheckResult.setHealthCheckState(StringStaxUnmarshaller
							.getInstance().unmarshall(context));
					continue;
				}

				if (context.testExpression("HealthCheckId", targetDepth)) {
					ConfigureHealthCheckResult.setHealthCheckId(StringStaxUnmarshaller
							.getInstance().unmarshall(context));
					continue;
				}

				if (context.testExpression("HealthyThreshold", targetDepth)) {
					ConfigureHealthCheckResult.setHealthyThreshold(SimpleTypeStaxUnmarshallers.IntegerStaxUnmarshaller
							.getInstance().unmarshall(context));
					continue;
				}

				if (context.testExpression("Timeout", targetDepth)) {
					ConfigureHealthCheckResult.setTimeout(SimpleTypeStaxUnmarshallers.IntegerStaxUnmarshaller
							.getInstance().unmarshall(context));
					continue;
				}

				else if(context.testExpression("RequestId", targetDepth)){
					ConfigureHealthCheckResult.setRequestId(StringStaxUnmarshaller.getInstance()
							.unmarshall(context));
					continue;
				}

			} else if (xmlEvent.isEndElement()) {
				if (context.getCurrentDepth() < originalDepth) {
					return ConfigureHealthCheckResult;
				}
			}
		}
	}

	private static ConfigureHealthCheckResultStaxUnmarshaller instance;

	public static ConfigureHealthCheckResultStaxUnmarshaller getInstance() {
		if (instance == null)
			instance = new ConfigureHealthCheckResultStaxUnmarshaller();
		return instance;
	}
}
