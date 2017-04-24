package com.ksc.network.vpc.transform.Tunnels;

import javax.xml.stream.events.XMLEvent;

import com.ksc.network.vpc.model.Nat.DisassociateNatResult;
import com.ksc.network.vpc.model.Tunnels.DisassociateSubnetResult;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

/**
 * DeleteSubnetResult StAX Unmarshaller
 */
public class DisassociateSubnetResultStaxUnmarshaller implements
		Unmarshaller<DisassociateSubnetResult, StaxUnmarshallerContext> {


	public DisassociateSubnetResult unmarshall(StaxUnmarshallerContext context)
			throws Exception {
		DisassociateSubnetResult DisassociateSubnetResult = new DisassociateSubnetResult();
		int originalDepth = context.getCurrentDepth();
		int targetDepth = originalDepth + 1;

		if (context.isStartOfDocument())
			targetDepth += 1;

		while (true) {
			XMLEvent xmlEvent = context.nextEvent();
			if (xmlEvent.isEndDocument())
				return DisassociateSubnetResult;

			if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

				if (context.testExpression("Return", targetDepth)) {
					DisassociateSubnetResult.setReturn(Boolean.parseBoolean(StringStaxUnmarshaller.getInstance()
							.unmarshall(context)));
					continue;
				}else if(context.testExpression("RequestId", targetDepth)){
					DisassociateSubnetResult.setRequestId(StringStaxUnmarshaller.getInstance()
							.unmarshall(context));
					continue;
				}

			} else if (xmlEvent.isEndElement()) {
				if (context.getCurrentDepth() < originalDepth) {
					return DisassociateSubnetResult;
				}
			}
		}
	}

	private static DisassociateSubnetResultStaxUnmarshaller instance;

	public static DisassociateSubnetResultStaxUnmarshaller getInstance() {
		if (instance == null)
			instance = new DisassociateSubnetResultStaxUnmarshaller();
		return instance;
	}
}
