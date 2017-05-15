package com.ksc.network.eip.model.transform;

import com.ksc.network.eip.model.AssociateAddressResult;
import com.ksc.network.eip.model.ReleaseAddressResult;
import com.ksc.network.vpc.model.vpc.DeleteVpcResult;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import javax.xml.stream.events.XMLEvent;

/**
<<<<<<< HEAD
 * DeleteVpcResult StAX Unmarshaller
=======
 * AssociateAddressResul StAX Unmarshaller
>>>>>>> v4.0.0
 */
public class AssociateAddressResultStaxUnmarshaller implements
		Unmarshaller<AssociateAddressResult, StaxUnmarshallerContext> {

	public AssociateAddressResult unmarshall(StaxUnmarshallerContext context)
			throws Exception {
		AssociateAddressResult AssociateAddressResult = new AssociateAddressResult();
		int originalDepth = context.getCurrentDepth();
		int targetDepth = originalDepth + 1;

		if (context.isStartOfDocument())
			targetDepth += 1;

		while (true) {
			XMLEvent xmlEvent = context.nextEvent();
			if (xmlEvent.isEndDocument())
				return AssociateAddressResult;

			if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

				if (context.testExpression("Return", targetDepth)) {
					AssociateAddressResult.setReturn(Boolean.parseBoolean(StringStaxUnmarshaller.getInstance()
							.unmarshall(context)));
					continue;
				}else if(context.testExpression("RequestId", targetDepth)){
					AssociateAddressResult.setRequestId(StringStaxUnmarshaller.getInstance()
							.unmarshall(context));
					continue;
				}

			} else if (xmlEvent.isEndElement()) {
				if (context.getCurrentDepth() < originalDepth) {
					return AssociateAddressResult;
				}
			}
		}
	}

	private static AssociateAddressResultStaxUnmarshaller instance;

	public static AssociateAddressResultStaxUnmarshaller getInstance() {
		if (instance == null)
			instance = new AssociateAddressResultStaxUnmarshaller();
		return instance;
	}
}
