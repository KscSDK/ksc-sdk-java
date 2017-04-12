package com.ksc.network.vpc.transform.SecurityGroups;

import com.ksc.network.vpc.model.SecurityGroups.CreateSecurityGroupResult;
import com.ksc.network.vpc.model.SecurityGroups.ModifySecurityGroupResult;
import com.ksc.network.vpc.model.vpc.CreateVpcResult;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import javax.xml.stream.events.XMLEvent;

/**
 * ModifySecurityGroupResult StAX Unmarshaller
 */
public class ModifySecurityGroupResultStaxUnmarshaller implements
		Unmarshaller<ModifySecurityGroupResult, StaxUnmarshallerContext> {

	public ModifySecurityGroupResult unmarshall(StaxUnmarshallerContext context)
			throws Exception {
		ModifySecurityGroupResult ModifySecurityGroupResult = new ModifySecurityGroupResult();
		int originalDepth = context.getCurrentDepth();
		int targetDepth = originalDepth + 1;

		if (context.isStartOfDocument())
			targetDepth += 1;

		while (true) {
			XMLEvent xmlEvent = context.nextEvent();
			if (xmlEvent.isEndDocument())
				return ModifySecurityGroupResult;

			if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

				if (context.testExpression("SecurityGroupType", targetDepth)) {
					ModifySecurityGroupResult.setSecurityGroupType(StringStaxUnmarshaller
							.getInstance().unmarshall(context));
					continue;
				}if (context.testExpression("CreateTime", targetDepth)) {
					ModifySecurityGroupResult.setCreateTime(StringStaxUnmarshaller.getInstance()
							.unmarshall(context));
					continue;
				}if (context.testExpression("VpcId", targetDepth)) {
					ModifySecurityGroupResult.setVpcId(StringStaxUnmarshaller.getInstance()
							.unmarshall(context));
					continue;
				}if (context.testExpression("SecurityGroupId", targetDepth)) {
					ModifySecurityGroupResult.setSecurityGroupId(StringStaxUnmarshaller.getInstance()
							.unmarshall(context));
					continue;
				}if (context.testExpression("SecurityGroupName", targetDepth)) {
					ModifySecurityGroupResult.setSecurityGroupName(StringStaxUnmarshaller.getInstance()
							.unmarshall(context));
					continue;
				}if (context.testExpression("Description", targetDepth)) {
					ModifySecurityGroupResult.setDescription(StringStaxUnmarshaller.getInstance()
							.unmarshall(context));
					continue;
				}if (context.testExpression("SecurityGroupEntrySet/item", targetDepth)) {
					ModifySecurityGroupResult.withSecurityGroupEntrySet(SecurityGroupRuleStaxUnmarshaller.getInstance()
							.unmarshall(context));
					continue;
				}else if(context.testExpression("RequestId", targetDepth)){
					ModifySecurityGroupResult.setRequestId(StringStaxUnmarshaller.getInstance()
							.unmarshall(context));
					continue;
				}

			} else if (xmlEvent.isEndElement()) {
				if (context.getCurrentDepth() < originalDepth) {
					return ModifySecurityGroupResult;
				}
			}
		}
	}

	private static ModifySecurityGroupResultStaxUnmarshaller instance;

	public static ModifySecurityGroupResultStaxUnmarshaller getInstance() {
		if (instance == null)
			instance = new ModifySecurityGroupResultStaxUnmarshaller();
		return instance;
	}
}
