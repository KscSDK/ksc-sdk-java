package com.ksc.network.vpc.transform.NetworkAcl;

import javax.xml.stream.events.XMLEvent;

import com.ksc.network.vpc.model.NetworkAcl.CreateNetworkAclEntryResult;
import com.ksc.network.vpc.model.SecurityGroups.AuthorizeSecurityGroupEntryResult;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

/**
 * DeleteSecurityGroupResult StAX Unmarshaller
 */
public class CreateNetworkAclEntryResultStaxUnmarshaller implements
		Unmarshaller<CreateNetworkAclEntryResult, StaxUnmarshallerContext> {

	public CreateNetworkAclEntryResult unmarshall(StaxUnmarshallerContext context)
			throws Exception {
		CreateNetworkAclEntryResult CreateNetworkAclEntryResult = new CreateNetworkAclEntryResult();
		int originalDepth = context.getCurrentDepth();
		int targetDepth = originalDepth + 1;

		if (context.isStartOfDocument())
			targetDepth += 1;

		while (true) {
			XMLEvent xmlEvent = context.nextEvent();
			if (xmlEvent.isEndDocument())
				return CreateNetworkAclEntryResult;

			if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

				if (context.testExpression("Return", targetDepth)) {
					CreateNetworkAclEntryResult.setReturn(Boolean.parseBoolean(StringStaxUnmarshaller.getInstance()
							.unmarshall(context)));
					continue;
				}else if(context.testExpression("RequestId", targetDepth)){
					CreateNetworkAclEntryResult.setRequestId(StringStaxUnmarshaller.getInstance()
							.unmarshall(context));
					continue;
				}

			} else if (xmlEvent.isEndElement()) {
				if (context.getCurrentDepth() < originalDepth) {
					return CreateNetworkAclEntryResult;
				}
			}
		}
	}

	private static CreateNetworkAclEntryResultStaxUnmarshaller instance;

	public static CreateNetworkAclEntryResultStaxUnmarshaller getInstance() {
		if (instance == null)
			instance = new CreateNetworkAclEntryResultStaxUnmarshaller();
		return instance;
	}
}
