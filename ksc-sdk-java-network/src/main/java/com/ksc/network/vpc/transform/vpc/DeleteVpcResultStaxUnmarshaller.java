package com.ksc.network.vpc.transform.vpc;

import com.ksc.network.vpc.model.vpc.DeleteVpcResult;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import javax.xml.stream.events.XMLEvent;

/**
 * DeleteVpcResult StAX Unmarshaller
 */
public class DeleteVpcResultStaxUnmarshaller implements
		Unmarshaller<DeleteVpcResult, StaxUnmarshallerContext> {

	public DeleteVpcResult unmarshall(StaxUnmarshallerContext context)
			throws Exception {
		DeleteVpcResult DeleteVpcResult = new DeleteVpcResult();
		int originalDepth = context.getCurrentDepth();
		int targetDepth = originalDepth + 1;

		if (context.isStartOfDocument())
			targetDepth += 1;

		while (true) {
			XMLEvent xmlEvent = context.nextEvent();
			if (xmlEvent.isEndDocument())
				return DeleteVpcResult;

			if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

				if (context.testExpression("Return", targetDepth)) {
					DeleteVpcResult.setReturn(Boolean.parseBoolean(StringStaxUnmarshaller.getInstance()
							.unmarshall(context)));
					continue;
				}else if(context.testExpression("RequestId", targetDepth)){
					DeleteVpcResult.setRequestId(StringStaxUnmarshaller.getInstance()
							.unmarshall(context));
					continue;
				}

			} else if (xmlEvent.isEndElement()) {
				if (context.getCurrentDepth() < originalDepth) {
					return DeleteVpcResult;
				}
			}
		}
	}

	private static DeleteVpcResultStaxUnmarshaller instance;

	public static DeleteVpcResultStaxUnmarshaller getInstance() {
		if (instance == null)
			instance = new DeleteVpcResultStaxUnmarshaller();
		return instance;
	}
}
