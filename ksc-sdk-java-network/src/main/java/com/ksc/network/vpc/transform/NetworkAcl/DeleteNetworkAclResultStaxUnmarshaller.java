package com.ksc.network.vpc.transform.NetworkAcl;

import com.ksc.network.vpc.model.NetworkAcl.DeleteNetworkAclResult;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import javax.xml.stream.events.XMLEvent;

/**
 * DeleteNetworkAclResult StAX Unmarshaller
 */
public class DeleteNetworkAclResultStaxUnmarshaller implements
		Unmarshaller<DeleteNetworkAclResult, StaxUnmarshallerContext> {


	public DeleteNetworkAclResult unmarshall(StaxUnmarshallerContext context)
			throws Exception {
		DeleteNetworkAclResult DeleteNetworkAclResult = new DeleteNetworkAclResult();
		int originalDepth = context.getCurrentDepth();
		int targetDepth = originalDepth + 1;

		if (context.isStartOfDocument())
			targetDepth += 1;

		while (true) {
			XMLEvent xmlEvent = context.nextEvent();
			if (xmlEvent.isEndDocument())
				return DeleteNetworkAclResult;

			if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

				if (context.testExpression("Return", targetDepth)) {
					DeleteNetworkAclResult.setReturn(Boolean.parseBoolean(StringStaxUnmarshaller.getInstance()
							.unmarshall(context)));
					continue;
				}else if(context.testExpression("RequestId", targetDepth)){
					DeleteNetworkAclResult.setRequestId(StringStaxUnmarshaller.getInstance()
							.unmarshall(context));
					continue;
				}

			} else if (xmlEvent.isEndElement()) {
				if (context.getCurrentDepth() < originalDepth) {
					return DeleteNetworkAclResult;
				}
			}
		}
	}

	private static DeleteNetworkAclResultStaxUnmarshaller instance;

	public static DeleteNetworkAclResultStaxUnmarshaller getInstance() {
		if (instance == null)
			instance = new DeleteNetworkAclResultStaxUnmarshaller();
		return instance;
	}
}
