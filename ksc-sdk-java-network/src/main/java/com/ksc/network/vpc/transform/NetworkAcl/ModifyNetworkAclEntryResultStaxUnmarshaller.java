package com.ksc.network.vpc.transform.NetworkAcl;

import javax.xml.stream.events.XMLEvent;

import com.ksc.network.vpc.model.NetworkAcl.ModifyNetworkAclEntryResult;
import com.ksc.network.vpc.model.NetworkAcl.ModifyNetworkAclResult;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

/**
 * ModifySecurityGroupResult StAX Unmarshaller
 */
public class ModifyNetworkAclEntryResultStaxUnmarshaller implements
		Unmarshaller<ModifyNetworkAclEntryResult, StaxUnmarshallerContext> {

	public ModifyNetworkAclEntryResult unmarshall(StaxUnmarshallerContext context)
			throws Exception {
		ModifyNetworkAclEntryResult ModifyNetworkAclEntryResult = new ModifyNetworkAclEntryResult();
		int originalDepth = context.getCurrentDepth();
		int targetDepth = originalDepth + 1;

		if (context.isStartOfDocument())
			targetDepth += 1;

		while (true) {
			XMLEvent xmlEvent = context.nextEvent();
			if (xmlEvent.isEndDocument())
				return ModifyNetworkAclEntryResult;

			if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

				if (context.testExpression("NetworkAclEntry", targetDepth)) {
                    ModifyNetworkAclEntryResult.setNetworkAclEntry(NetworkAclEntryStaxUnmarshaller.getInstance()
							.unmarshall(context));
					continue;

				}else if(context.testExpression("RequestId", targetDepth)){
                    ModifyNetworkAclEntryResult.setRequestId(StringStaxUnmarshaller.getInstance()
							.unmarshall(context));
					continue;
				}
			} else if (xmlEvent.isEndElement()) {
				if (context.getCurrentDepth() < originalDepth) {
					return ModifyNetworkAclEntryResult;
				}
			}
		}
	}

	private static ModifyNetworkAclEntryResultStaxUnmarshaller instance;

	public static ModifyNetworkAclEntryResultStaxUnmarshaller getInstance() {
		if (instance == null)
			instance = new ModifyNetworkAclEntryResultStaxUnmarshaller();
		return instance;
	}
}
