package com.ksc.network.eip.model.transform;

import com.ksc.network.eip.model.DisassociateAddressResult;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import javax.xml.stream.events.XMLEvent;

/**
 * DisassociateAddressResult StAX Unmarshaller
 */
public class DisassociateAddressResultStaxUnmarshaller implements
		Unmarshaller<DisassociateAddressResult, StaxUnmarshallerContext> {

	public DisassociateAddressResult unmarshall(StaxUnmarshallerContext context)
			throws Exception {
		DisassociateAddressResult DisassociateAddressResult = new DisassociateAddressResult();
		int originalDepth = context.getCurrentDepth();
		int targetDepth = originalDepth + 1;

		if (context.isStartOfDocument())
			targetDepth += 1;

		while (true) {
			XMLEvent xmlEvent = context.nextEvent();
			if (xmlEvent.isEndDocument())
				return DisassociateAddressResult;

			if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

				if (context.testExpression("Return", targetDepth)) {
					DisassociateAddressResult.setReturn(Boolean.parseBoolean(StringStaxUnmarshaller.getInstance()
							.unmarshall(context)));
					continue;
				}else if(context.testExpression("RequestId", targetDepth)){
					DisassociateAddressResult.setRequestId(StringStaxUnmarshaller.getInstance()
							.unmarshall(context));
					continue;
				}

			} else if (xmlEvent.isEndElement()) {
				if (context.getCurrentDepth() < originalDepth) {
					return DisassociateAddressResult;
				}
			}
		}
	}

	private static DisassociateAddressResultStaxUnmarshaller instance;

	public static DisassociateAddressResultStaxUnmarshaller getInstance() {
		if (instance == null)
			instance = new DisassociateAddressResultStaxUnmarshaller();
		return instance;
	}
}
