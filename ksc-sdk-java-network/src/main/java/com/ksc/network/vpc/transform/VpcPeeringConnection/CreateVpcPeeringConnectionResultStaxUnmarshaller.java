package com.ksc.network.vpc.transform.VpcPeeringConnection;

import com.ksc.network.vpc.model.VpcPeeringConnection.CreateVpcPeeringConnectionResult;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import javax.xml.stream.events.XMLEvent;

/**
 * CreateVpcPeeringConnectionResult StAX Unmarshaller
 */
public class CreateVpcPeeringConnectionResultStaxUnmarshaller implements
		Unmarshaller<CreateVpcPeeringConnectionResult, StaxUnmarshallerContext> {

	public CreateVpcPeeringConnectionResult unmarshall(StaxUnmarshallerContext context)
			throws Exception {
		CreateVpcPeeringConnectionResult CreateVpcPeeringConnectionResult = new CreateVpcPeeringConnectionResult();
		int originalDepth = context.getCurrentDepth();
		int targetDepth = originalDepth + 1;

		if (context.isStartOfDocument())
			targetDepth += 1;

		while (true) {
			XMLEvent xmlEvent = context.nextEvent();
			if (xmlEvent.isEndDocument())
				return CreateVpcPeeringConnectionResult;

			if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

				if (context.testExpression("VpcPeeringConnection", targetDepth)) {
					CreateVpcPeeringConnectionResult.setVpcPeeringConnection(VpcPeeringConnectionStaxUnmarshaller
							.getInstance().unmarshall(context));
					continue;
				}else if(context.testExpression("RequestId", targetDepth)){
					CreateVpcPeeringConnectionResult.setRequestId(StringStaxUnmarshaller.getInstance()
							.unmarshall(context));
					continue;
				}

			} else if (xmlEvent.isEndElement()) {
				if (context.getCurrentDepth() < originalDepth) {
					return CreateVpcPeeringConnectionResult;
				}
			}
		}
	}

	private static CreateVpcPeeringConnectionResultStaxUnmarshaller instance;

	public static CreateVpcPeeringConnectionResultStaxUnmarshaller getInstance() {
		if (instance == null)
			instance = new CreateVpcPeeringConnectionResultStaxUnmarshaller();
		return instance;
	}
}
