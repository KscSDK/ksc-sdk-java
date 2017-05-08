package com.ksc.network.vpc.transform.subnet;

import com.ksc.network.vpc.model.subnet.AssociateNetworkAclResult;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import javax.xml.stream.events.XMLEvent;

/**
 * AssociateNetworkAclResult StAX Unmarshaller
 */
public class AssociateNetworkAclResultStaxUnmarshaller implements
		Unmarshaller<AssociateNetworkAclResult, StaxUnmarshallerContext> {


	public AssociateNetworkAclResult unmarshall(StaxUnmarshallerContext context)
			throws Exception {
		AssociateNetworkAclResult AssociateNetworkAclResult = new AssociateNetworkAclResult();
		int originalDepth = context.getCurrentDepth();
		int targetDepth = originalDepth + 1;

		if (context.isStartOfDocument())
			targetDepth += 1;

		while (true) {
			XMLEvent xmlEvent = context.nextEvent();
			if (xmlEvent.isEndDocument())
				return AssociateNetworkAclResult;

			if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

				if (context.testExpression("Return", targetDepth)) {
					AssociateNetworkAclResult.setReturn(Boolean.parseBoolean(StringStaxUnmarshaller.getInstance()
							.unmarshall(context)));
					continue;
				}else if(context.testExpression("RequestId", targetDepth)){
					AssociateNetworkAclResult.setRequestId(StringStaxUnmarshaller.getInstance()
							.unmarshall(context));
					continue;
				}

			} else if (xmlEvent.isEndElement()) {
				if (context.getCurrentDepth() < originalDepth) {
					return AssociateNetworkAclResult;
				}
			}
		}
	}

	private static AssociateNetworkAclResultStaxUnmarshaller instance;

	public static AssociateNetworkAclResultStaxUnmarshaller getInstance() {
		if (instance == null)
			instance = new AssociateNetworkAclResultStaxUnmarshaller();
		return instance;
	}
}
