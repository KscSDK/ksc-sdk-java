package com.ksc.network.vpc.transform.VpcPeeringConnection;

import com.ksc.network.vpc.model.VpcPeeringConnection.ModifyVpcPeeringConnectionResult;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import javax.xml.stream.events.XMLEvent;

/**
 * ModifyVpcPeeringConnectionResult StAX Unmarshaller
 */
public class ModifyVpcPeeringConnectionResultStaxUnmarshaller implements
		Unmarshaller<ModifyVpcPeeringConnectionResult, StaxUnmarshallerContext> {

	public ModifyVpcPeeringConnectionResult unmarshall(StaxUnmarshallerContext context)
			throws Exception {
		ModifyVpcPeeringConnectionResult ModifyVpcPeeringConnectionResult = new ModifyVpcPeeringConnectionResult();
		int originalDepth = context.getCurrentDepth();
		int targetDepth = originalDepth + 1;

		if (context.isStartOfDocument())
			targetDepth += 1;

		while (true) {
			XMLEvent xmlEvent = context.nextEvent();
			if (xmlEvent.isEndDocument())
				return ModifyVpcPeeringConnectionResult;

			if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

				if (context.testExpression("VpcPeeringConnection", targetDepth)) {
					ModifyVpcPeeringConnectionResult.setVpcPeeringConnection(VpcPeeringConnectionStaxUnmarshaller.getInstance()
							.unmarshall(context));
					continue;

				}else if(context.testExpression("RequestId", targetDepth)){
					ModifyVpcPeeringConnectionResult.setRequestId(StringStaxUnmarshaller.getInstance()
							.unmarshall(context));
					continue;
				}
			} else if (xmlEvent.isEndElement()) {
				if (context.getCurrentDepth() < originalDepth) {
					return ModifyVpcPeeringConnectionResult;
				}
			}
		}
	}

	private static ModifyVpcPeeringConnectionResultStaxUnmarshaller instance;

	public static ModifyVpcPeeringConnectionResultStaxUnmarshaller getInstance() {
		if (instance == null)
			instance = new ModifyVpcPeeringConnectionResultStaxUnmarshaller();
		return instance;
	}
}
