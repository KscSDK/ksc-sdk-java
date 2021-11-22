package com.ksc.network.vpc.transform.havip;

import com.ksc.network.vpc.model.havip.UnAssociateHaVipResult;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import javax.xml.stream.events.XMLEvent;

/**
 * UnAssociateHaVipResult StAX Unmarshaller
 */
public class UnAssociateHaVipResultStaxUnmarshaller implements
		Unmarshaller<UnAssociateHaVipResult, StaxUnmarshallerContext> {

    @Override
	public UnAssociateHaVipResult unmarshall(StaxUnmarshallerContext context)
			throws Exception {
        UnAssociateHaVipResult unAssociateHaVipResult = new UnAssociateHaVipResult();
		int originalDepth = context.getCurrentDepth();
		int targetDepth = originalDepth + 1;

		if (context.isStartOfDocument())
			targetDepth += 1;

		while (true) {
			XMLEvent xmlEvent = context.nextEvent();
			if (xmlEvent.isEndDocument())
				return unAssociateHaVipResult;

			if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("Return", targetDepth)) {
                    unAssociateHaVipResult.setReturn(Boolean.parseBoolean(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context)));
                    continue;
                }else if(context.testExpression("RequestId", targetDepth)){
                    unAssociateHaVipResult.setRequestId(StringStaxUnmarshaller.getInstance().unmarshall(context));
					continue;
				}

			} else if (xmlEvent.isEndElement()) {
				if (context.getCurrentDepth() < originalDepth) {
					return unAssociateHaVipResult;
				}
			}
		}
	}

	private static UnAssociateHaVipResultStaxUnmarshaller instance;

	public static UnAssociateHaVipResultStaxUnmarshaller getInstance() {
		if (instance == null)
			instance = new UnAssociateHaVipResultStaxUnmarshaller();
		return instance;
	}
}
