package com.ksc.network.vpc.transform.subnet;

import com.ksc.network.vpc.model.subnet.DisassociateNetworkAclResult;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import javax.xml.stream.events.XMLEvent;

/**
 * DisassociateNetworkAclResult StAX Unmarshaller
 */
public class DisassociateNetworkAclResultStaxUnmarshaller implements
		Unmarshaller<DisassociateNetworkAclResult, StaxUnmarshallerContext> {


	public DisassociateNetworkAclResult unmarshall(StaxUnmarshallerContext context)
			throws Exception {
		DisassociateNetworkAclResult DisassociateNetworkAclResult = new DisassociateNetworkAclResult();
		int originalDepth = context.getCurrentDepth();
		int targetDepth = originalDepth + 1;

		if (context.isStartOfDocument())
			targetDepth += 1;

		while (true) {
			XMLEvent xmlEvent = context.nextEvent();
			if (xmlEvent.isEndDocument())
				return DisassociateNetworkAclResult;

			if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

				if (context.testExpression("Return", targetDepth)) {
					DisassociateNetworkAclResult.setReturn(Boolean.parseBoolean(StringStaxUnmarshaller.getInstance()
							.unmarshall(context)));
					continue;
				}else if(context.testExpression("RequestId", targetDepth)){
					DisassociateNetworkAclResult.setRequestId(StringStaxUnmarshaller.getInstance()
							.unmarshall(context));
					continue;
				}

			} else if (xmlEvent.isEndElement()) {
				if (context.getCurrentDepth() < originalDepth) {
					return DisassociateNetworkAclResult;
				}
			}
		}
	}

	private static DisassociateNetworkAclResultStaxUnmarshaller instance;

	public static DisassociateNetworkAclResultStaxUnmarshaller getInstance() {
		if (instance == null)
			instance = new DisassociateNetworkAclResultStaxUnmarshaller();
		return instance;
	}
}
