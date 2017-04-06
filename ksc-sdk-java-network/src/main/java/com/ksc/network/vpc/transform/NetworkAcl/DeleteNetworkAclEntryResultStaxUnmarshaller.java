package com.ksc.network.vpc.transform.NetworkAcl;

import javax.xml.stream.events.XMLEvent;

import com.ksc.network.vpc.model.NetworkAcl.DeleteNetworkAclEntryResult;
import com.ksc.network.vpc.model.SecurityGroups.RevokeSecurityGroupEntryResult;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

/**
 * DeleteSecurityGroupResult StAX Unmarshaller
 */
public class DeleteNetworkAclEntryResultStaxUnmarshaller implements
		Unmarshaller<DeleteNetworkAclEntryResult, StaxUnmarshallerContext> {

	public DeleteNetworkAclEntryResult unmarshall(StaxUnmarshallerContext context)
			throws Exception {
		DeleteNetworkAclEntryResult DeleteNetworkAclEntryResult = new DeleteNetworkAclEntryResult();
		int originalDepth = context.getCurrentDepth();
		int targetDepth = originalDepth + 1;

		if (context.isStartOfDocument())
			targetDepth += 1;

		while (true) {
			XMLEvent xmlEvent = context.nextEvent();
			if (xmlEvent.isEndDocument())
				return DeleteNetworkAclEntryResult;

			if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

				if (context.testExpression("Return", targetDepth)) {
					DeleteNetworkAclEntryResult.setReturn(Boolean.parseBoolean(StringStaxUnmarshaller.getInstance()
							.unmarshall(context)));
					continue;
				}else if(context.testExpression("RequestId", targetDepth)){
					DeleteNetworkAclEntryResult.setRequestId(StringStaxUnmarshaller.getInstance()
							.unmarshall(context));
					continue;
				}

			} else if (xmlEvent.isEndElement()) {
				if (context.getCurrentDepth() < originalDepth) {
					return DeleteNetworkAclEntryResult;
				}
			}
		}
	}

	private static DeleteNetworkAclEntryResultStaxUnmarshaller instance;

	public static DeleteNetworkAclEntryResultStaxUnmarshaller getInstance() {
		if (instance == null)
			instance = new DeleteNetworkAclEntryResultStaxUnmarshaller();
		return instance;
	}
}
