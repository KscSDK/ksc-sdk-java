package com.ksc.network.eip.model.transform;

import com.ksc.network.eip.model.ReleaseAddressResult;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import javax.xml.stream.events.XMLEvent;

/**
 * ReleaseAddressResult StAX Unmarshaller
 */
public class ReleaseAddressResultStaxUnmarshaller implements
		Unmarshaller<ReleaseAddressResult, StaxUnmarshallerContext> {

	public ReleaseAddressResult unmarshall(StaxUnmarshallerContext context)
			throws Exception {
		ReleaseAddressResult ReleaseAddressResult = new ReleaseAddressResult();
		int originalDepth = context.getCurrentDepth();
		int targetDepth = originalDepth + 1;

		if (context.isStartOfDocument())
			targetDepth += 1;

		while (true) {
			XMLEvent xmlEvent = context.nextEvent();
			if (xmlEvent.isEndDocument())
				return ReleaseAddressResult;

			if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

				if (context.testExpression("Return", targetDepth)) {
					ReleaseAddressResult.setReturn(Boolean.parseBoolean(StringStaxUnmarshaller.getInstance()
							.unmarshall(context)));
					continue;
				}else if(context.testExpression("RequestId", targetDepth)){
					ReleaseAddressResult.setRequestId(StringStaxUnmarshaller.getInstance()
							.unmarshall(context));
					continue;
				}

			} else if (xmlEvent.isEndElement()) {
				if (context.getCurrentDepth() < originalDepth) {
					return ReleaseAddressResult;
				}
			}
		}
	}

	private static ReleaseAddressResultStaxUnmarshaller instance;

	public static ReleaseAddressResultStaxUnmarshaller getInstance() {
		if (instance == null)
			instance = new ReleaseAddressResultStaxUnmarshaller();
		return instance;
	}
}
