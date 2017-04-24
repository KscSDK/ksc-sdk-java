package com.ksc.network.vpc.transform.VpcPeeringConnection;

import javax.xml.stream.events.XMLEvent;

import com.ksc.network.vpc.model.VpcPeeringConnection.AcceptVpcPeeringConnectionResult;
import com.ksc.network.vpc.model.VpcPeeringConnection.RejectVpcPeeringConnectionResult;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

/**
 * CreateVpcResult StAX Unmarshaller
 */
public class RejectVpcPeeringConnectionResultStaxUnmarshaller implements
		Unmarshaller<RejectVpcPeeringConnectionResult, StaxUnmarshallerContext> {

	public RejectVpcPeeringConnectionResult unmarshall(StaxUnmarshallerContext context)
			throws Exception {
		RejectVpcPeeringConnectionResult RejectVpcPeeringConnectionResult = new RejectVpcPeeringConnectionResult();
		int originalDepth = context.getCurrentDepth();
		int targetDepth = originalDepth + 1;

		if (context.isStartOfDocument())
			targetDepth += 1;

		while (true) {
			XMLEvent xmlEvent = context.nextEvent();
			if (xmlEvent.isEndDocument())
				return RejectVpcPeeringConnectionResult;

			if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

				if (context.testExpression("VpcPeeringConnection", targetDepth)) {
					RejectVpcPeeringConnectionResult.setVpcPeeringConnection(VpcPeeringConnectionStaxUnmarshaller
							.getInstance().unmarshall(context));
					continue;
				}else if(context.testExpression("RequestId", targetDepth)){
					RejectVpcPeeringConnectionResult.setRequestId(StringStaxUnmarshaller.getInstance()
							.unmarshall(context));
					continue;
				}

			} else if (xmlEvent.isEndElement()) {
				if (context.getCurrentDepth() < originalDepth) {
					return RejectVpcPeeringConnectionResult;
				}
			}
		}
	}

	private static RejectVpcPeeringConnectionResultStaxUnmarshaller instance;

	public static RejectVpcPeeringConnectionResultStaxUnmarshaller getInstance() {
		if (instance == null)
			instance = new RejectVpcPeeringConnectionResultStaxUnmarshaller();
		return instance;
	}
}
