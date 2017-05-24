package com.ksc.network.vpc.transform.Nat;

import com.ksc.network.vpc.model.Nat.AssociateNat;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import javax.xml.stream.events.XMLEvent;

/**
 * AssociateNat StAX Unmarshaller
 */
public class AssociateNatStaxUnmarshaller implements Unmarshaller<AssociateNat, StaxUnmarshallerContext> {

	public AssociateNat unmarshall(StaxUnmarshallerContext context) throws Exception {
		AssociateNat nat = new AssociateNat();
		int originalDepth = context.getCurrentDepth();
		int targetDepth = originalDepth + 1;

		if (context.isStartOfDocument())
			targetDepth += 1;
		
		while (true) {
			XMLEvent xmlEvent = context.nextEvent();
			if (xmlEvent.isEndDocument())
				return nat;
			if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

				if (context.testExpression("SubnetId", targetDepth)) {
					nat.setSubnetId(StringStaxUnmarshaller.getInstance().unmarshall(context));
					continue;
				}

			} else if (xmlEvent.isEndElement()) {
				if (context.getCurrentDepth() < originalDepth) {
					return nat;
				}
			}
		}
	}

	private static AssociateNatStaxUnmarshaller instance;

	public static AssociateNatStaxUnmarshaller getInstance() {
		if (instance == null)
			instance = new AssociateNatStaxUnmarshaller();
		return instance;
	}
}
