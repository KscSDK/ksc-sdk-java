package com.ksc.network.vpc.transform.SecurityGroups;

import com.ksc.network.vpc.model.SecurityGroups.CreateSecurityGroupResult;
import com.ksc.network.vpc.model.vpc.CreateVpcResult;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import javax.xml.stream.events.XMLEvent;

/**
 * CreateSecurityGroupResult StAX Unmarshaller
 */
public class CreateSecurityGroupResultStaxUnmarshaller implements
		Unmarshaller<CreateSecurityGroupResult, StaxUnmarshallerContext> {

	public CreateSecurityGroupResult unmarshall(StaxUnmarshallerContext context)
			throws Exception {
		CreateSecurityGroupResult CreateSecurityGroupResult = new CreateSecurityGroupResult();
		int originalDepth = context.getCurrentDepth();
		int targetDepth = originalDepth + 1;

		if (context.isStartOfDocument())
			targetDepth += 1;

		while (true) {
			XMLEvent xmlEvent = context.nextEvent();
			if (xmlEvent.isEndDocument())
				return CreateSecurityGroupResult;

			if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

				if (context.testExpression("SecurityGroup", targetDepth)) {
					CreateSecurityGroupResult.setSecurityGroup(SecurityGroupStaxUnmarshaller
							.getInstance().unmarshall(context));
					continue;
				}else if(context.testExpression("RequestId", targetDepth)){
					CreateSecurityGroupResult.setRequestId(StringStaxUnmarshaller.getInstance()
							.unmarshall(context));
					continue;
				}

			} else if (xmlEvent.isEndElement()) {
				if (context.getCurrentDepth() < originalDepth) {
					return CreateSecurityGroupResult;
				}
			}
		}
	}

	private static CreateSecurityGroupResultStaxUnmarshaller instance;

	public static CreateSecurityGroupResultStaxUnmarshaller getInstance() {
		if (instance == null)
			instance = new CreateSecurityGroupResultStaxUnmarshaller();
		return instance;
	}
}
