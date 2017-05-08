package com.ksc.network.vpc.transform.Nat;

import com.ksc.network.vpc.model.Nat.ModifyNatResult;
import com.ksc.transform.SimpleTypeStaxUnmarshallers;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import javax.xml.stream.events.XMLEvent;

/**
 * ModifyNatResult StAX Unmarshaller
 */
public class ModifyNatResultStaxUnmarshaller implements
		Unmarshaller<ModifyNatResult, StaxUnmarshallerContext> {

	public ModifyNatResult unmarshall(StaxUnmarshallerContext context)
			throws Exception {
		ModifyNatResult ModifyNatResult = new ModifyNatResult();
		int originalDepth = context.getCurrentDepth();
		int targetDepth = originalDepth + 1;

		if (context.isStartOfDocument())
			targetDepth += 1;

		while (true) {
			XMLEvent xmlEvent = context.nextEvent();
			if (xmlEvent.isEndDocument())
				return ModifyNatResult;

			if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

				if (context.testExpression("CreateTime", targetDepth)) {
					ModifyNatResult.setCreateTime(StringStaxUnmarshaller
							.getInstance().unmarshall(context));
					continue;
                }

                if (context.testExpression("VpcId", targetDepth)) {
					ModifyNatResult.setVpcId(StringStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("NatId", targetDepth)) {
					ModifyNatResult.setNatId(StringStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("NatName", targetDepth)) {
					ModifyNatResult.setNatName(StringStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("NatMode", targetDepth)) {
					ModifyNatResult.setNatMode(StringStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("NatType", targetDepth)) {
					ModifyNatResult.setNatType(StringStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }

				if (context.testExpression("NatIpSet/item", targetDepth)) {
					ModifyNatResult.withNatIpSet(NatIpStaxUnmarshaller.getInstance()
							.unmarshall(context));
					continue;
				}

                if (context.testExpression("NatIpNumber", targetDepth)) {
					ModifyNatResult.setNatIpNumber(SimpleTypeStaxUnmarshallers.IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("BandWidth", targetDepth)) {
					ModifyNatResult.setBandWidth(SimpleTypeStaxUnmarshallers.IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

				if (context.testExpression("AssociateNatSet/item", targetDepth)) {
					ModifyNatResult.withAssociateNatSet(AssociateNatStaxUnmarshaller.getInstance()
							.unmarshall(context));

				}

				else if(context.testExpression("RequestId", targetDepth)){
					ModifyNatResult.setRequestId(StringStaxUnmarshaller.getInstance()
							.unmarshall(context));
					continue;
				}

			} else if (xmlEvent.isEndElement()) {
				if (context.getCurrentDepth() < originalDepth) {
					return ModifyNatResult;
				}
			}
		}
	}

	private static ModifyNatResultStaxUnmarshaller instance;

	public static ModifyNatResultStaxUnmarshaller getInstance() {
		if (instance == null)
			instance = new ModifyNatResultStaxUnmarshaller();
		return instance;
	}
}
