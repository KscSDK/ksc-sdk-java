package com.ksc.network.vpc.transform.SecurityGroups;

import com.ksc.network.vpc.model.SecurityGroups.ModifySecurityGroupEntryResult;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import javax.xml.stream.events.XMLEvent;

/**
 * ModifySecurityGroupEntryResult StAX Unmarshaller
 */
public class ModifySecurityGroupEntryResultStaxUnmarshaller implements
		Unmarshaller<ModifySecurityGroupEntryResult, StaxUnmarshallerContext> {

	public ModifySecurityGroupEntryResult unmarshall(StaxUnmarshallerContext context)
			throws Exception {
		ModifySecurityGroupEntryResult ModifySecurityGroupEntryResult = new ModifySecurityGroupEntryResult();
		int originalDepth = context.getCurrentDepth();
		int targetDepth = originalDepth + 1;

		if (context.isStartOfDocument())
			targetDepth += 1;

		while (true) {
			XMLEvent xmlEvent = context.nextEvent();
			if (xmlEvent.isEndDocument())
				return ModifySecurityGroupEntryResult;

			if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

				if (context.testExpression("SecurityGroupEntry", targetDepth)) {
                    ModifySecurityGroupEntryResult.setSecurityGroupEntry(SecurityGroupRuleStaxUnmarshaller.getInstance()
							.unmarshall(context));
					continue;

				}else if(context.testExpression("RequestId", targetDepth)){
                    ModifySecurityGroupEntryResult.setRequestId(StringStaxUnmarshaller.getInstance()
							.unmarshall(context));
					continue;
				}
			} else if (xmlEvent.isEndElement()) {
				if (context.getCurrentDepth() < originalDepth) {
					return ModifySecurityGroupEntryResult;
				}
			}
		}
	}

	private static ModifySecurityGroupEntryResultStaxUnmarshaller instance;

	public static ModifySecurityGroupEntryResultStaxUnmarshaller getInstance() {
		if (instance == null)
			instance = new ModifySecurityGroupEntryResultStaxUnmarshaller();
		return instance;
	}
}
