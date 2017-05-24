package com.ksc.network.vpc.transform.Nat;

import com.ksc.network.vpc.model.Nat.CreateNatResult;
import com.ksc.transform.SimpleTypeStaxUnmarshallers;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import javax.xml.stream.events.XMLEvent;

/**
 * CreateNatResult StAX Unmarshaller
 */
public class CreateNatResultStaxUnmarshaller implements
		Unmarshaller<CreateNatResult, StaxUnmarshallerContext> {

	public CreateNatResult unmarshall(StaxUnmarshallerContext context)
			throws Exception {
		CreateNatResult CreateNatResult = new CreateNatResult();
		int originalDepth = context.getCurrentDepth();
		int targetDepth = originalDepth + 1;

		if (context.isStartOfDocument())
			targetDepth += 1;

		while (true) {
			XMLEvent xmlEvent = context.nextEvent();
			if (xmlEvent.isEndDocument())
				return CreateNatResult;

			if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

				if (context.testExpression("CreateTime", targetDepth)) {
					CreateNatResult.setCreateTime(StringStaxUnmarshaller
							.getInstance().unmarshall(context));
					continue;
                }

                if (context.testExpression("VpcId", targetDepth)) {
                    CreateNatResult.setVpcId(StringStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("NatId", targetDepth)) {
                    CreateNatResult.setNatId(StringStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("NatName", targetDepth)) {
                    CreateNatResult.setNatName(StringStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("NatMode", targetDepth)) {
                    CreateNatResult.setNatMode(StringStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("NatType", targetDepth)) {
                    CreateNatResult.setNatType(StringStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("NatIpSet/item", targetDepth)) {
                    CreateNatResult.withNatIpSet(NatIpStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }

                if (context.testExpression("NatIpNumber", targetDepth)) {
                    CreateNatResult.setNatIpNumber(SimpleTypeStaxUnmarshallers.IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("BandWidth", targetDepth)) {
                    CreateNatResult.setBandWidth(SimpleTypeStaxUnmarshallers.IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

			    if (context.testExpression("AssociateNatSet/item", targetDepth)) {
                    CreateNatResult.withAssociateNatSet(AssociateNatStaxUnmarshaller.getInstance()
							.unmarshall(context));
					continue;

				}else if(context.testExpression("RequestId", targetDepth)){
					CreateNatResult.setRequestId(StringStaxUnmarshaller.getInstance()
							.unmarshall(context));
					continue;
				}

			} else if (xmlEvent.isEndElement()) {
				if (context.getCurrentDepth() < originalDepth) {
					return CreateNatResult;
				}
			}
		}
	}

	private static CreateNatResultStaxUnmarshaller instance;

	public static CreateNatResultStaxUnmarshaller getInstance() {
		if (instance == null)
			instance = new CreateNatResultStaxUnmarshaller();
		return instance;
	}
}
