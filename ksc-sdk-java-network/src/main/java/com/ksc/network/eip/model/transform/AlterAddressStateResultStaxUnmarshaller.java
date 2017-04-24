package com.ksc.network.eip.model.transform;

import javax.xml.stream.events.XMLEvent;

import com.ksc.network.eip.model.AlterAddressStateResult;
import com.ksc.network.eip.model.DisassociateAddressResult;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

/**
 * DeleteVpcResult StAX Unmarshaller
 */
public class AlterAddressStateResultStaxUnmarshaller implements
		Unmarshaller<AlterAddressStateResult, StaxUnmarshallerContext> {

	public AlterAddressStateResult unmarshall(StaxUnmarshallerContext context)
			throws Exception {
		AlterAddressStateResult alterAddressStateResult = new AlterAddressStateResult();
		int originalDepth = context.getCurrentDepth();
		int targetDepth = originalDepth + 1;

		if (context.isStartOfDocument())
			targetDepth += 1;

		while (true) {
			XMLEvent xmlEvent = context.nextEvent();
			if (xmlEvent.isEndDocument())
				return alterAddressStateResult;

			if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

				if (context.testExpression("Return", targetDepth)) {
					alterAddressStateResult.setReturn(Boolean.parseBoolean(StringStaxUnmarshaller.getInstance()
							.unmarshall(context)));
					continue;
				}else if(context.testExpression("RequestId", targetDepth)){
					alterAddressStateResult.setRequestId(StringStaxUnmarshaller.getInstance()
							.unmarshall(context));
					continue;
				}

			} else if (xmlEvent.isEndElement()) {
				if (context.getCurrentDepth() < originalDepth) {
					return alterAddressStateResult;
				}
			}
		}
	}

	private static AlterAddressStateResultStaxUnmarshaller instance;

	public static AlterAddressStateResultStaxUnmarshaller getInstance() {
		if (instance == null)
			instance = new AlterAddressStateResultStaxUnmarshaller();
		return instance;
	}
}
