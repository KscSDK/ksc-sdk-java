package com.ksc.network.slb.model.transform;

import com.ksc.network.slb.model.ModifyHealthCheckResult;
import com.ksc.transform.SimpleTypeStaxUnmarshallers;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import javax.xml.stream.events.XMLEvent;

/**
 * ModifyHealthCheckResult StAX Unmarshaller
 */
public class ModifyHealthCheckResultStaxUnmarshaller implements
		Unmarshaller<ModifyHealthCheckResult, StaxUnmarshallerContext> {

	public ModifyHealthCheckResult unmarshall(StaxUnmarshallerContext context)
			throws Exception {
		ModifyHealthCheckResult ModifyHealthCheckResult = new ModifyHealthCheckResult();
		int originalDepth = context.getCurrentDepth();
		int targetDepth = originalDepth + 1;

		if (context.isStartOfDocument())
			targetDepth += 1;

		while (true) {
			XMLEvent xmlEvent = context.nextEvent();
			if (xmlEvent.isEndDocument())
				return ModifyHealthCheckResult;

			if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

				if (context.testExpression("Interval", targetDepth)) {
					ModifyHealthCheckResult.setInterval(SimpleTypeStaxUnmarshallers.IntegerStaxUnmarshaller
							.getInstance().unmarshall(context));
					continue;
				}

				if (context.testExpression("UnhealthyThreshold", targetDepth)) {
					ModifyHealthCheckResult.setUnhealthyThreshold(SimpleTypeStaxUnmarshallers.IntegerStaxUnmarshaller
							.getInstance().unmarshall(context));
					continue;
				}

				if (context.testExpression("HealthCheckState", targetDepth)) {
					ModifyHealthCheckResult.setHealthCheckState(StringStaxUnmarshaller
							.getInstance().unmarshall(context));
					continue;
				}

				if (context.testExpression("HealthCheckId", targetDepth)) {
					ModifyHealthCheckResult.setHealthCheckId(StringStaxUnmarshaller
							.getInstance().unmarshall(context));
					continue;
				}

				if (context.testExpression("HealthyThreshold", targetDepth)) {
					ModifyHealthCheckResult.setHealthyThreshold(SimpleTypeStaxUnmarshallers.IntegerStaxUnmarshaller
							.getInstance().unmarshall(context));
					continue;
				}

				if (context.testExpression("Timeout", targetDepth)) {
					ModifyHealthCheckResult.setTimeout(SimpleTypeStaxUnmarshallers.IntegerStaxUnmarshaller
							.getInstance().unmarshall(context));
					continue;
				}

				else if(context.testExpression("RequestId", targetDepth)){
					ModifyHealthCheckResult.setRequestId(StringStaxUnmarshaller.getInstance()
							.unmarshall(context));
					continue;
				}

			} else if (xmlEvent.isEndElement()) {
				if (context.getCurrentDepth() < originalDepth) {
					return ModifyHealthCheckResult;
				}
			}
		}
	}

	private static ModifyHealthCheckResultStaxUnmarshaller instance;

	public static ModifyHealthCheckResultStaxUnmarshaller getInstance() {
		if (instance == null)
			instance = new ModifyHealthCheckResultStaxUnmarshaller();
		return instance;
	}
}
