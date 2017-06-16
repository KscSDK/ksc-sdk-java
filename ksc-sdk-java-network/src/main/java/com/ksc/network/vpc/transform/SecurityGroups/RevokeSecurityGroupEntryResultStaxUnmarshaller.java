package com.ksc.network.vpc.transform.SecurityGroups;

import com.ksc.network.vpc.model.SecurityGroups.RevokeSecurityGroupEntryResult;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import javax.xml.stream.events.XMLEvent;

/**
 * RevokeSecurityGroupEntryResult StAX Unmarshaller
 */
public class RevokeSecurityGroupEntryResultStaxUnmarshaller implements
		Unmarshaller<RevokeSecurityGroupEntryResult, StaxUnmarshallerContext> {

	public RevokeSecurityGroupEntryResult unmarshall(StaxUnmarshallerContext context)
			throws Exception {
		RevokeSecurityGroupEntryResult RevokeSecurityGroupEntryResult = new RevokeSecurityGroupEntryResult();
		int originalDepth = context.getCurrentDepth();
		int targetDepth = originalDepth + 1;

		if (context.isStartOfDocument())
			targetDepth += 1;

		while (true) {
			XMLEvent xmlEvent = context.nextEvent();
			if (xmlEvent.isEndDocument())
				return RevokeSecurityGroupEntryResult;

			if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

				if (context.testExpression("Return", targetDepth)) {
					RevokeSecurityGroupEntryResult.setReturn(Boolean.parseBoolean(StringStaxUnmarshaller.getInstance()
							.unmarshall(context)));
					continue;
				}else if(context.testExpression("RequestId", targetDepth)){
					RevokeSecurityGroupEntryResult.setRequestId(StringStaxUnmarshaller.getInstance()
							.unmarshall(context));
					continue;
				}

			} else if (xmlEvent.isEndElement()) {
				if (context.getCurrentDepth() < originalDepth) {
					return RevokeSecurityGroupEntryResult;
				}
			}
		}
	}

	private static RevokeSecurityGroupEntryResultStaxUnmarshaller instance;

	public static RevokeSecurityGroupEntryResultStaxUnmarshaller getInstance() {
		if (instance == null)
			instance = new RevokeSecurityGroupEntryResultStaxUnmarshaller();
		return instance;
	}
}
