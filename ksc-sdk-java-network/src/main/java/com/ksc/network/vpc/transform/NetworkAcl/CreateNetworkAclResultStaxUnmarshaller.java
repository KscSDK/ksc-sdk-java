package com.ksc.network.vpc.transform.NetworkAcl;

import javax.xml.stream.events.XMLEvent;

import com.ksc.network.vpc.model.NetworkAcl.CreateNetworkAclResult;
import com.ksc.network.vpc.model.vpc.CreateVpcResult;
import com.ksc.network.vpc.transform.SecurityGroups.SecurityGroupRuleStaxUnmarshaller;
import com.ksc.network.vpc.transform.vpc.VpcStaxUnmarshaller;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;

/**
 * CreateVpcResult StAX Unmarshaller
 */
public class CreateNetworkAclResultStaxUnmarshaller implements
		Unmarshaller<CreateNetworkAclResult, StaxUnmarshallerContext> {

	public CreateNetworkAclResult unmarshall(StaxUnmarshallerContext context)
			throws Exception {
		CreateNetworkAclResult CreateNetworkAclResult = new CreateNetworkAclResult();
		int originalDepth = context.getCurrentDepth();
		int targetDepth = originalDepth + 1;

		if (context.isStartOfDocument())
			targetDepth += 1;

		while (true) {
			XMLEvent xmlEvent = context.nextEvent();
			if (xmlEvent.isEndDocument())
				return CreateNetworkAclResult;

			if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

				if (context.testExpression("CreateTime", targetDepth)) {
					CreateNetworkAclResult.setCreateTime(StringStaxUnmarshaller
							.getInstance().unmarshall(context));
					continue;
				}if (context.testExpression("VpcId", targetDepth)) {
					CreateNetworkAclResult.setVpcId(StringStaxUnmarshaller.getInstance()
							.unmarshall(context));
					continue;
				}if (context.testExpression("NetworkAclName", targetDepth)) {
					CreateNetworkAclResult.setNetworkAclName(StringStaxUnmarshaller.getInstance()
							.unmarshall(context));
					continue;
				}if (context.testExpression("NetworkAclId", targetDepth)) {
					CreateNetworkAclResult.setNetworkAclId(StringStaxUnmarshaller.getInstance()
							.unmarshall(context));
					continue;
				}else if(context.testExpression("RequestId", targetDepth)){
					CreateNetworkAclResult.setRequestId(StringStaxUnmarshaller.getInstance()
							.unmarshall(context));
					continue;
				}

			} else if (xmlEvent.isEndElement()) {
				if (context.getCurrentDepth() < originalDepth) {
					return CreateNetworkAclResult;
				}
			}
		}
	}

	private static CreateNetworkAclResultStaxUnmarshaller instance;

	public static CreateNetworkAclResultStaxUnmarshaller getInstance() {
		if (instance == null)
			instance = new CreateNetworkAclResultStaxUnmarshaller();
		return instance;
	}
}
