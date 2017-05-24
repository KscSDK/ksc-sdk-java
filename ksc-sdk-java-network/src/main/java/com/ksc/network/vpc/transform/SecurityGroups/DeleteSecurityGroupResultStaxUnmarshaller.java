package com.ksc.network.vpc.transform.SecurityGroups;

import com.ksc.network.vpc.model.SecurityGroups.DeleteSecurityGroupResult;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import javax.xml.stream.events.XMLEvent;

/**
 * DeleteSecurityGroupResult StAX Unmarshaller
 */
public class DeleteSecurityGroupResultStaxUnmarshaller implements
		Unmarshaller<DeleteSecurityGroupResult, StaxUnmarshallerContext> {

	public DeleteSecurityGroupResult unmarshall(StaxUnmarshallerContext context)
			throws Exception {
		DeleteSecurityGroupResult DeleteSecurityGroupResult = new DeleteSecurityGroupResult();
		int originalDepth = context.getCurrentDepth();
		int targetDepth = originalDepth + 1;

		if (context.isStartOfDocument())
			targetDepth += 1;

		while (true) {
			XMLEvent xmlEvent = context.nextEvent();
			if (xmlEvent.isEndDocument())
				return DeleteSecurityGroupResult;

			if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

				if (context.testExpression("Return", targetDepth)) {
					DeleteSecurityGroupResult.setReturn(Boolean.parseBoolean(StringStaxUnmarshaller.getInstance()
							.unmarshall(context)));
					continue;
				}else if(context.testExpression("RequestId", targetDepth)){
					DeleteSecurityGroupResult.setRequestId(StringStaxUnmarshaller.getInstance()
							.unmarshall(context));
					continue;
				}

			} else if (xmlEvent.isEndElement()) {
				if (context.getCurrentDepth() < originalDepth) {
					return DeleteSecurityGroupResult;
				}
			}
		}
	}

	private static DeleteSecurityGroupResultStaxUnmarshaller instance;

	public static DeleteSecurityGroupResultStaxUnmarshaller getInstance() {
		if (instance == null)
			instance = new DeleteSecurityGroupResultStaxUnmarshaller();
		return instance;
	}
}
