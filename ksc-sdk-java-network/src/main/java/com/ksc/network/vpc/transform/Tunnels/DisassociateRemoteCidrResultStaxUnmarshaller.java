package com.ksc.network.vpc.transform.Tunnels;

import javax.xml.stream.events.XMLEvent;

import com.ksc.network.vpc.model.Tunnels.DisassociateRemoteCidrResult;
import com.ksc.network.vpc.model.Tunnels.DisassociateSubnetResult;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

/**
 * DeleteSubnetResult StAX Unmarshaller
 */
public class DisassociateRemoteCidrResultStaxUnmarshaller implements
		Unmarshaller<DisassociateRemoteCidrResult, StaxUnmarshallerContext> {


	public DisassociateRemoteCidrResult unmarshall(StaxUnmarshallerContext context)
			throws Exception {
		DisassociateRemoteCidrResult DisassociateRemoteCidrResult = new DisassociateRemoteCidrResult();
		int originalDepth = context.getCurrentDepth();
		int targetDepth = originalDepth + 1;

		if (context.isStartOfDocument())
			targetDepth += 1;

		while (true) {
			XMLEvent xmlEvent = context.nextEvent();
			if (xmlEvent.isEndDocument())
				return DisassociateRemoteCidrResult;

			if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

				if (context.testExpression("Return", targetDepth)) {
					DisassociateRemoteCidrResult.setReturn(Boolean.parseBoolean(StringStaxUnmarshaller.getInstance()
							.unmarshall(context)));
					continue;
				}else if(context.testExpression("RequestId", targetDepth)){
					DisassociateRemoteCidrResult.setRequestId(StringStaxUnmarshaller.getInstance()
							.unmarshall(context));
					continue;
				}

			} else if (xmlEvent.isEndElement()) {
				if (context.getCurrentDepth() < originalDepth) {
					return DisassociateRemoteCidrResult;
				}
			}
		}
	}

	private static DisassociateRemoteCidrResultStaxUnmarshaller instance;

	public static DisassociateRemoteCidrResultStaxUnmarshaller getInstance() {
		if (instance == null)
			instance = new DisassociateRemoteCidrResultStaxUnmarshaller();
		return instance;
	}
}
