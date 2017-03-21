package com.ksc.network.vpc.transform.SecurityGroups;

import com.ksc.network.vpc.model.SecurityGroups.AuthorizeSecurityGroupEntryResult;
import com.ksc.network.vpc.model.SecurityGroups.DeleteSecurityGroupResult;
import com.ksc.network.vpc.model.vpc.DeleteVpcResult;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import javax.xml.stream.events.XMLEvent;

/**
 * DeleteSecurityGroupResult StAX Unmarshaller
 */
public class AuthorizeSecurityGroupEntryResultStaxUnmarshaller implements
		Unmarshaller<AuthorizeSecurityGroupEntryResult, StaxUnmarshallerContext> {

	public AuthorizeSecurityGroupEntryResult unmarshall(StaxUnmarshallerContext context)
			throws Exception {
		AuthorizeSecurityGroupEntryResult AuthorizeSecurityGroupEntryResult = new AuthorizeSecurityGroupEntryResult();
		int originalDepth = context.getCurrentDepth();
		int targetDepth = originalDepth + 1;

		if (context.isStartOfDocument())
			targetDepth += 1;

		while (true) {
			XMLEvent xmlEvent = context.nextEvent();
			if (xmlEvent.isEndDocument())
				return AuthorizeSecurityGroupEntryResult;

			if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

				if (context.testExpression("Return", targetDepth)) {
					AuthorizeSecurityGroupEntryResult.setReturn(Boolean.parseBoolean(StringStaxUnmarshaller.getInstance()
							.unmarshall(context)));
					continue;
				}else if(context.testExpression("RequestId", targetDepth)){
					AuthorizeSecurityGroupEntryResult.setRequestId(StringStaxUnmarshaller.getInstance()
							.unmarshall(context));
					continue;
				}

			} else if (xmlEvent.isEndElement()) {
				if (context.getCurrentDepth() < originalDepth) {
					return AuthorizeSecurityGroupEntryResult;
				}
			}
		}
	}

	private static AuthorizeSecurityGroupEntryResultStaxUnmarshaller instance;

	public static AuthorizeSecurityGroupEntryResultStaxUnmarshaller getInstance() {
		if (instance == null)
			instance = new AuthorizeSecurityGroupEntryResultStaxUnmarshaller();
		return instance;
	}
}
