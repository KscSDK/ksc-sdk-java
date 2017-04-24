package com.ksc.network.vpc.transform.VpcPeeringConnection;

import javax.xml.stream.events.XMLEvent;

import com.ksc.network.vpc.model.VpcPeeringConnection.AcceptVpcPeeringConnectionResult;
import com.ksc.network.vpc.model.VpcPeeringConnection.CreateVpcPeeringConnectionResult;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

/**
 * CreateVpcResult StAX Unmarshaller
 */
public class AcceptVpcPeeringConnectionResultStaxUnmarshaller implements
		Unmarshaller<AcceptVpcPeeringConnectionResult, StaxUnmarshallerContext> {

	public AcceptVpcPeeringConnectionResult unmarshall(StaxUnmarshallerContext context)
			throws Exception {
		AcceptVpcPeeringConnectionResult AcceptVpcPeeringConnectionResult = new AcceptVpcPeeringConnectionResult();
		int originalDepth = context.getCurrentDepth();
		int targetDepth = originalDepth + 1;

		if (context.isStartOfDocument())
			targetDepth += 1;

		while (true) {
			XMLEvent xmlEvent = context.nextEvent();
			if (xmlEvent.isEndDocument())
				return AcceptVpcPeeringConnectionResult;

			if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

				if (context.testExpression("VpcPeeringConnection", targetDepth)) {
					AcceptVpcPeeringConnectionResult.setVpcPeeringConnection(VpcPeeringConnectionStaxUnmarshaller
							.getInstance().unmarshall(context));
					continue;
				}else if(context.testExpression("RequestId", targetDepth)){
					AcceptVpcPeeringConnectionResult.setRequestId(StringStaxUnmarshaller.getInstance()
							.unmarshall(context));
					continue;
				}

			} else if (xmlEvent.isEndElement()) {
				if (context.getCurrentDepth() < originalDepth) {
					return AcceptVpcPeeringConnectionResult;
				}
			}
		}
	}

	private static AcceptVpcPeeringConnectionResultStaxUnmarshaller instance;

	public static AcceptVpcPeeringConnectionResultStaxUnmarshaller getInstance() {
		if (instance == null)
			instance = new AcceptVpcPeeringConnectionResultStaxUnmarshaller();
		return instance;
	}
}
