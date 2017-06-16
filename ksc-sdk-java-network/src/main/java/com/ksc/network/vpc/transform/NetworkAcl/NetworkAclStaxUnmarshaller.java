package com.ksc.network.vpc.transform.NetworkAcl;

import com.ksc.network.vpc.model.NetworkAcl.NetworkAcl;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import javax.xml.stream.events.XMLEvent;

/**
 * NetworkAcl StAX Unmarshaller
 */
public class NetworkAclStaxUnmarshaller implements Unmarshaller<NetworkAcl, StaxUnmarshallerContext> {

	public NetworkAcl unmarshall(StaxUnmarshallerContext context) throws Exception {
		NetworkAcl acl = new NetworkAcl();
		int originalDepth = context.getCurrentDepth();
		int targetDepth = originalDepth + 1;

		if (context.isStartOfDocument())
			targetDepth += 1;
		
		while (true) {
			XMLEvent xmlEvent = context.nextEvent();
			if (xmlEvent.isEndDocument())
				return acl;
			if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

				if (context.testExpression("CreateTime", targetDepth)) {
					acl.setCreateTime(StringStaxUnmarshaller.getInstance().unmarshall(context));
					continue;
				}

				if (context.testExpression("VpcId", targetDepth)) {
					acl.setVpcId(StringStaxUnmarshaller.getInstance().unmarshall(context));
					continue;
				}

				if (context.testExpression("NetworkAclName", targetDepth)) {
					acl.setNetworkAclName(StringStaxUnmarshaller.getInstance().unmarshall(context));
					continue;
				}

				if (context.testExpression("NetworkAclId", targetDepth)) {
					acl.setNetworkAclId(StringStaxUnmarshaller.getInstance().unmarshall(context));
					continue;
				}

				if (context.testExpression("Description", targetDepth)) {
					acl.setDescription(StringStaxUnmarshaller.getInstance().unmarshall(context));
					continue;
				}
				if (context.testExpression("NetworkAclEntrySet/item", targetDepth)) {
					acl.addNetworkAclEntrySet(NetworkAclEntryStaxUnmarshaller.getInstance().unmarshall(context));
					continue;
				}
			} else if (xmlEvent.isEndElement()) {
				if (context.getCurrentDepth() < originalDepth) {
					return acl;
				}
			}
		}
	}

	private static NetworkAclStaxUnmarshaller instance;

	public static NetworkAclStaxUnmarshaller getInstance() {
		if (instance == null)
			instance = new NetworkAclStaxUnmarshaller();
		return instance;
	}
}
