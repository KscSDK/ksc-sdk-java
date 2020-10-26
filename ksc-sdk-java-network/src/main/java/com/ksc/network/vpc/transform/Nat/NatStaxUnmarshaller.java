package com.ksc.network.vpc.transform.Nat;

import com.ksc.network.vpc.model.Nat.Nat;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.IntegerStaxUnmarshaller;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import javax.xml.stream.events.XMLEvent;

/**
 * Nat StAX Unmarshaller
 */
public class NatStaxUnmarshaller implements Unmarshaller<Nat, StaxUnmarshallerContext> {

	public Nat unmarshall(StaxUnmarshallerContext context) throws Exception {
		Nat nat = new Nat();
		int originalDepth = context.getCurrentDepth();
		int targetDepth = originalDepth + 1;

		if (context.isStartOfDocument())
			targetDepth += 1;
		
		while (true) {
			XMLEvent xmlEvent = context.nextEvent();
			if (xmlEvent.isEndDocument())
				return nat;
			if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

				if (context.testExpression("CreateTime", targetDepth)) {
					nat.setCreateTime(StringStaxUnmarshaller.getInstance().unmarshall(context));
					continue;
				}

				if (context.testExpression("VpcId", targetDepth)) {
					nat.setVpcId(StringStaxUnmarshaller.getInstance().unmarshall(context));
					continue;
				}

                if (context.testExpression("NatId", targetDepth)) {
                    nat.setNatId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("NatName", targetDepth)) {
                    nat.setNatName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("NatMode", targetDepth)) {
                    nat.setNatMode(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("NatType", targetDepth)) {
                    nat.setNatType(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("NatIpSet/item", targetDepth)) {
                    nat.addNatIpSet(NatIpStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

				if (context.testExpression("NatIpNumber", targetDepth)) {
					nat.setNatIpNumber(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
					continue;
				}

                if (context.testExpression("BandWidth", targetDepth)) {
                    nat.setBandWidth(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("AssociateNatSet/item", targetDepth)) {
                    nat.addAssociateNatSet(AssociateNatStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

				if (context.testExpression("ProjectId", targetDepth)) {
					nat.setProjectId(StringStaxUnmarshaller.getInstance().unmarshall(context));
					continue;
				}

			} else if (xmlEvent.isEndElement()) {
				if (context.getCurrentDepth() < originalDepth) {
					return nat;
				}
			}
		}
	}

	private static NatStaxUnmarshaller instance;

	public static NatStaxUnmarshaller getInstance() {
		if (instance == null)
			instance = new NatStaxUnmarshaller();
		return instance;
	}
}
