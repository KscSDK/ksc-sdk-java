package com.ksc.network.vpc.transform.Tunnels;

import com.ksc.network.vpc.model.Tunnels.AssociateRemoteCidrResult;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import javax.xml.stream.events.XMLEvent;

/**
 * AssociateRemoteCidrResult StAX Unmarshaller
 */
public class AssociateRemoteCidrResultStaxUnmarshaller implements
		Unmarshaller<AssociateRemoteCidrResult, StaxUnmarshallerContext> {


	public AssociateRemoteCidrResult unmarshall(StaxUnmarshallerContext context)
			throws Exception {
		AssociateRemoteCidrResult AssociateRemoteCidrResult = new AssociateRemoteCidrResult();
		int originalDepth = context.getCurrentDepth();
		int targetDepth = originalDepth + 1;

		if (context.isStartOfDocument())
			targetDepth += 1;

		while (true) {
			XMLEvent xmlEvent = context.nextEvent();
			if (xmlEvent.isEndDocument())
				return AssociateRemoteCidrResult;

			if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

				if (context.testExpression("AssociateRemoteCidrSet/item", targetDepth)) {
					AssociateRemoteCidrResult.withAssociateRemoteCidrSet(AssociateRemoteCidrStaxUnmarshaller.getInstance()
							.unmarshall(context));
					continue;
				}else if(context.testExpression("RequestId", targetDepth)){
					AssociateRemoteCidrResult.setRequestId(StringStaxUnmarshaller.getInstance()
							.unmarshall(context));
					continue;
				}

			} else if (xmlEvent.isEndElement()) {
				if (context.getCurrentDepth() < originalDepth) {
					return AssociateRemoteCidrResult;
				}
			}
		}
	}

	private static AssociateRemoteCidrResultStaxUnmarshaller instance;

	public static AssociateRemoteCidrResultStaxUnmarshaller getInstance() {
		if (instance == null)
			instance = new AssociateRemoteCidrResultStaxUnmarshaller();
		return instance;
	}
}
