package com.ksc.network.vpc.transform.Nat;

import javax.xml.stream.events.XMLEvent;

import com.ksc.network.vpc.model.Nat.AssociateNatResult;
import com.ksc.network.vpc.model.subnet.AssociateNetworkAclResult;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

/**
 * DeleteSubnetResult StAX Unmarshaller
 */
public class AssociateNatResultStaxUnmarshaller implements
		Unmarshaller<AssociateNatResult, StaxUnmarshallerContext> {


	public AssociateNatResult unmarshall(StaxUnmarshallerContext context)
			throws Exception {
		AssociateNatResult AssociateNatResult = new AssociateNatResult();
		int originalDepth = context.getCurrentDepth();
		int targetDepth = originalDepth + 1;

		if (context.isStartOfDocument())
			targetDepth += 1;

		while (true) {
			XMLEvent xmlEvent = context.nextEvent();
			if (xmlEvent.isEndDocument())
				return AssociateNatResult;

			if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

				if (context.testExpression("Return", targetDepth)) {
					AssociateNatResult.setReturn(Boolean.parseBoolean(StringStaxUnmarshaller.getInstance()
							.unmarshall(context)));
					continue;
				}else if(context.testExpression("RequestId", targetDepth)){
					AssociateNatResult.setRequestId(StringStaxUnmarshaller.getInstance()
							.unmarshall(context));
					continue;
				}

			} else if (xmlEvent.isEndElement()) {
				if (context.getCurrentDepth() < originalDepth) {
					return AssociateNatResult;
				}
			}
		}
	}

	private static AssociateNatResultStaxUnmarshaller instance;

	public static AssociateNatResultStaxUnmarshaller getInstance() {
		if (instance == null)
			instance = new AssociateNatResultStaxUnmarshaller();
		return instance;
	}
}
