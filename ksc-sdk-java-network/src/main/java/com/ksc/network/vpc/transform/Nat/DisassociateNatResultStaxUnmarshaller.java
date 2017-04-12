package com.ksc.network.vpc.transform.Nat;

import javax.xml.stream.events.XMLEvent;

import com.ksc.network.vpc.model.Nat.DisassociateNatResult;
import com.ksc.network.vpc.model.subnet.DisassociateNetworkAclResult;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

/**
 * DeleteSubnetResult StAX Unmarshaller
 */
public class DisassociateNatResultStaxUnmarshaller implements
		Unmarshaller<DisassociateNatResult, StaxUnmarshallerContext> {


	public DisassociateNatResult unmarshall(StaxUnmarshallerContext context)
			throws Exception {
		DisassociateNatResult DisassociateNatResult = new DisassociateNatResult();
		int originalDepth = context.getCurrentDepth();
		int targetDepth = originalDepth + 1;

		if (context.isStartOfDocument())
			targetDepth += 1;

		while (true) {
			XMLEvent xmlEvent = context.nextEvent();
			if (xmlEvent.isEndDocument())
				return DisassociateNatResult;

			if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

				if (context.testExpression("Return", targetDepth)) {
					DisassociateNatResult.setReturn(Boolean.parseBoolean(StringStaxUnmarshaller.getInstance()
							.unmarshall(context)));
					continue;
				}else if(context.testExpression("RequestId", targetDepth)){
					DisassociateNatResult.setRequestId(StringStaxUnmarshaller.getInstance()
							.unmarshall(context));
					continue;
				}

			} else if (xmlEvent.isEndElement()) {
				if (context.getCurrentDepth() < originalDepth) {
					return DisassociateNatResult;
				}
			}
		}
	}

	private static DisassociateNatResultStaxUnmarshaller instance;

	public static DisassociateNatResultStaxUnmarshaller getInstance() {
		if (instance == null)
			instance = new DisassociateNatResultStaxUnmarshaller();
		return instance;
	}
}
