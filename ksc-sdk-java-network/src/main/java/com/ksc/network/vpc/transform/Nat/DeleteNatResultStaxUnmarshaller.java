package com.ksc.network.vpc.transform.Nat;

import javax.xml.stream.events.XMLEvent;

import com.ksc.network.vpc.model.Nat.DeleteNatResult;
import com.ksc.network.vpc.model.Route.DeleteRouteResult;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

/**
 * DeleteSubnetResult StAX Unmarshaller
 */
public class DeleteNatResultStaxUnmarshaller implements
		Unmarshaller<DeleteNatResult, StaxUnmarshallerContext> {


	public DeleteNatResult unmarshall(StaxUnmarshallerContext context)
			throws Exception {
		DeleteNatResult DeleteNatResult = new DeleteNatResult();
		int originalDepth = context.getCurrentDepth();
		int targetDepth = originalDepth + 1;

		if (context.isStartOfDocument())
			targetDepth += 1;

		while (true) {
			XMLEvent xmlEvent = context.nextEvent();
			if (xmlEvent.isEndDocument())
				return DeleteNatResult;

			if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

				if (context.testExpression("Return", targetDepth)) {
					DeleteNatResult.setReturn(Boolean.parseBoolean(StringStaxUnmarshaller.getInstance()
							.unmarshall(context)));
					continue;
				}else if(context.testExpression("RequestId", targetDepth)){
					DeleteNatResult.setRequestId(StringStaxUnmarshaller.getInstance()
							.unmarshall(context));
					continue;
				}

			} else if (xmlEvent.isEndElement()) {
				if (context.getCurrentDepth() < originalDepth) {
					return DeleteNatResult;
				}
			}
		}
	}

	private static DeleteNatResultStaxUnmarshaller instance;

	public static DeleteNatResultStaxUnmarshaller getInstance() {
		if (instance == null)
			instance = new DeleteNatResultStaxUnmarshaller();
		return instance;
	}
}
