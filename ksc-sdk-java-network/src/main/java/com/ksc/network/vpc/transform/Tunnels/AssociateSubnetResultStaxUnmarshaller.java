package com.ksc.network.vpc.transform.Tunnels;

import com.ksc.network.vpc.model.Tunnels.AssociateSubnetResult;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import javax.xml.stream.events.XMLEvent;

/**
 * AssociateSubnetResult StAX Unmarshaller
 */
public class AssociateSubnetResultStaxUnmarshaller implements
		Unmarshaller<AssociateSubnetResult, StaxUnmarshallerContext> {


	public AssociateSubnetResult unmarshall(StaxUnmarshallerContext context)
			throws Exception {
		AssociateSubnetResult AssociateSubnetResult = new AssociateSubnetResult();
		int originalDepth = context.getCurrentDepth();
		int targetDepth = originalDepth + 1;

		if (context.isStartOfDocument())
			targetDepth += 1;

		while (true) {
			XMLEvent xmlEvent = context.nextEvent();
			if (xmlEvent.isEndDocument())
				return AssociateSubnetResult;

			if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

				if (context.testExpression("TunnelId", targetDepth)) {
					AssociateSubnetResult.setTunnelId(StringStaxUnmarshaller.getInstance()
							.unmarshall(context));
					continue;
				}else if(context.testExpression("RequestId", targetDepth)){
					AssociateSubnetResult.setRequestId(StringStaxUnmarshaller.getInstance()
							.unmarshall(context));
					continue;
				}

				if (context.testExpression("AssociateSubnetSet/item", targetDepth)) {
                    AssociateSubnetResult.withAssociateSubnetSet(AssociateSubnetStaxUnmarshaller.getInstance()
							.unmarshall(context));
					continue;
				}

			} else if (xmlEvent.isEndElement()) {
				if (context.getCurrentDepth() < originalDepth) {
					return AssociateSubnetResult;
				}
			}
		}
	}

	private static AssociateSubnetResultStaxUnmarshaller instance;

	public static AssociateSubnetResultStaxUnmarshaller getInstance() {
		if (instance == null)
			instance = new AssociateSubnetResultStaxUnmarshaller();
		return instance;
	}
}
