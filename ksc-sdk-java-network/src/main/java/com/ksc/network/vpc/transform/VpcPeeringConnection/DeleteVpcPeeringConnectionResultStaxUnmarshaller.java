package com.ksc.network.vpc.transform.VpcPeeringConnection;

import javax.xml.stream.events.XMLEvent;

import com.ksc.network.vpc.model.VpcPeeringConnection.DeleteVpcPeeringConnectionResult;
import com.ksc.network.vpc.model.vpc.DeleteVpcResult;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

/**
 * DeleteVpcResult StAX Unmarshaller
 */
public class DeleteVpcPeeringConnectionResultStaxUnmarshaller implements
		Unmarshaller<DeleteVpcPeeringConnectionResult, StaxUnmarshallerContext> {

	public DeleteVpcPeeringConnectionResult unmarshall(StaxUnmarshallerContext context)
			throws Exception {
		DeleteVpcPeeringConnectionResult DeleteVpcPeeringConnectionResult = new DeleteVpcPeeringConnectionResult();
		int originalDepth = context.getCurrentDepth();
		int targetDepth = originalDepth + 1;

		if (context.isStartOfDocument())
			targetDepth += 1;

		while (true) {
			XMLEvent xmlEvent = context.nextEvent();
			if (xmlEvent.isEndDocument())
				return DeleteVpcPeeringConnectionResult;

			if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

				if (context.testExpression("Return", targetDepth)) {
					DeleteVpcPeeringConnectionResult.setReturn(Boolean.parseBoolean(StringStaxUnmarshaller.getInstance()
							.unmarshall(context)));
					continue;
				}else if(context.testExpression("RequestId", targetDepth)){
					DeleteVpcPeeringConnectionResult.setRequestId(StringStaxUnmarshaller.getInstance()
							.unmarshall(context));
					continue;
				}

			} else if (xmlEvent.isEndElement()) {
				if (context.getCurrentDepth() < originalDepth) {
					return DeleteVpcPeeringConnectionResult;
				}
			}
		}
	}

	private static DeleteVpcPeeringConnectionResultStaxUnmarshaller instance;

	public static DeleteVpcPeeringConnectionResultStaxUnmarshaller getInstance() {
		if (instance == null)
			instance = new DeleteVpcPeeringConnectionResultStaxUnmarshaller();
		return instance;
	}
}
