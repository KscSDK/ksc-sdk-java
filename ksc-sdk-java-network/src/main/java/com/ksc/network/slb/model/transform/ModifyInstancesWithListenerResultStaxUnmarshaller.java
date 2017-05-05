package com.ksc.network.slb.model.transform;

import com.ksc.network.slb.model.ModifyInstancesWithListenerResult;
import com.ksc.transform.SimpleTypeStaxUnmarshallers;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import javax.xml.stream.events.XMLEvent;

/**
 * ModifyInstancesWithListenerResult StAX Unmarshaller
 */
public class ModifyInstancesWithListenerResultStaxUnmarshaller implements
		Unmarshaller<ModifyInstancesWithListenerResult, StaxUnmarshallerContext> {

	public ModifyInstancesWithListenerResult unmarshall(StaxUnmarshallerContext context)
			throws Exception {
		ModifyInstancesWithListenerResult ModifyInstancesWithListenerResult = new ModifyInstancesWithListenerResult();
		int originalDepth = context.getCurrentDepth();
		int targetDepth = originalDepth + 1;

		if (context.isStartOfDocument())
			targetDepth += 1;

		while (true) {
			XMLEvent xmlEvent = context.nextEvent();
			if (xmlEvent.isEndDocument())
				return ModifyInstancesWithListenerResult;

			if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

				if (context.testExpression("RealServerIp", targetDepth)) {
					ModifyInstancesWithListenerResult.setRealServerIp(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller
							.getInstance().unmarshall(context));
					continue;
				}

				if (context.testExpression("RealServerPort", targetDepth)) {
					ModifyInstancesWithListenerResult.setRealServerPort(SimpleTypeStaxUnmarshallers.IntegerStaxUnmarshaller
							.getInstance().unmarshall(context));
					continue;
				}

				if (context.testExpression("RealServerState", targetDepth)) {
					ModifyInstancesWithListenerResult.setRealServerState(StringStaxUnmarshaller
							.getInstance().unmarshall(context));
					continue;
				}

				if (context.testExpression("RealServerType", targetDepth)) {
					ModifyInstancesWithListenerResult.setRealServerType(StringStaxUnmarshaller
							.getInstance().unmarshall(context));
					continue;
				}

				if (context.testExpression("RegisterId", targetDepth)) {
					ModifyInstancesWithListenerResult.setRegisterId(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller
							.getInstance().unmarshall(context));
					continue;
				}

				if (context.testExpression("ListenerId", targetDepth)) {
					ModifyInstancesWithListenerResult.setListenerId(SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller
							.getInstance().unmarshall(context));
					continue;
				}

				if (context.testExpression("Weight", targetDepth)) {
					ModifyInstancesWithListenerResult.setWeight(SimpleTypeStaxUnmarshallers.IntegerStaxUnmarshaller
							.getInstance().unmarshall(context));
					continue;
				}

				else if(context.testExpression("RequestId", targetDepth)){
					ModifyInstancesWithListenerResult.setRequestId(StringStaxUnmarshaller.getInstance()
							.unmarshall(context));
					continue;
				}

			} else if (xmlEvent.isEndElement()) {
				if (context.getCurrentDepth() < originalDepth) {
					return ModifyInstancesWithListenerResult;
				}
			}
		}
	}

	private static ModifyInstancesWithListenerResultStaxUnmarshaller instance;

	public static ModifyInstancesWithListenerResultStaxUnmarshaller getInstance() {
		if (instance == null)
			instance = new ModifyInstancesWithListenerResultStaxUnmarshaller();
		return instance;
	}
}
