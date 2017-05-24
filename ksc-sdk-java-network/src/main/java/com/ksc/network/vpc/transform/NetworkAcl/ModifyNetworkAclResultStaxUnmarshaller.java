package com.ksc.network.vpc.transform.NetworkAcl;

import com.ksc.network.vpc.model.NetworkAcl.ModifyNetworkAclResult;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import javax.xml.stream.events.XMLEvent;

/**
 * ModifyNetworkAclResult StAX Unmarshaller
 */
public class ModifyNetworkAclResultStaxUnmarshaller implements
		Unmarshaller<ModifyNetworkAclResult, StaxUnmarshallerContext> {

	public ModifyNetworkAclResult unmarshall(StaxUnmarshallerContext context)
			throws Exception {
		ModifyNetworkAclResult ModifyNetworkAclResult = new ModifyNetworkAclResult();
		int originalDepth = context.getCurrentDepth();
		int targetDepth = originalDepth + 1;

		if (context.isStartOfDocument())
			targetDepth += 1;

		while (true) {
			XMLEvent xmlEvent = context.nextEvent();
			if (xmlEvent.isEndDocument())
				return ModifyNetworkAclResult;

			if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

				if (context.testExpression("NetworkAclId", targetDepth)) {
					ModifyNetworkAclResult.setNetworkAclId(StringStaxUnmarshaller
							.getInstance().unmarshall(context));
					continue;
				}if (context.testExpression("CreateTime", targetDepth)) {
                    ModifyNetworkAclResult.setCreateTime(StringStaxUnmarshaller.getInstance()
							.unmarshall(context));
					continue;
				}if (context.testExpression("VpcId", targetDepth)) {
                    ModifyNetworkAclResult.setVpcId(StringStaxUnmarshaller.getInstance()
							.unmarshall(context));
					continue;
				}if (context.testExpression("NetworkAclName", targetDepth)) {
                    ModifyNetworkAclResult.setNetworkAclName(StringStaxUnmarshaller.getInstance()
							.unmarshall(context));
					continue;

				}if (context.testExpression("Description", targetDepth)) {
                    ModifyNetworkAclResult.setDescription(StringStaxUnmarshaller.getInstance()
							.unmarshall(context));
					continue;
				}if (context.testExpression("NetworkAclEntrySet", targetDepth)) {
                    ModifyNetworkAclResult.withNetworkAclEntrySet(NetworkAclEntryStaxUnmarshaller.getInstance()
							.unmarshall(context));
					continue;

				}else if(context.testExpression("RequestId", targetDepth)){
                    ModifyNetworkAclResult.setRequestId(StringStaxUnmarshaller.getInstance()
							.unmarshall(context));
					continue;
				}
			} else if (xmlEvent.isEndElement()) {
				if (context.getCurrentDepth() < originalDepth) {
					return ModifyNetworkAclResult;
				}
			}
		}
	}

	private static ModifyNetworkAclResultStaxUnmarshaller instance;

	public static ModifyNetworkAclResultStaxUnmarshaller getInstance() {
		if (instance == null)
			instance = new ModifyNetworkAclResultStaxUnmarshaller();
		return instance;
	}
}
