package com.ksc.network.vpc.transform.havip;

import com.ksc.network.vpc.model.havip.AssociateHaVipResult;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import javax.xml.stream.events.XMLEvent;

/**
 * AssociateHaVipResult StAX Unmarshaller
 */
public class AssociateHaVipResultStaxUnmarshaller implements
		Unmarshaller<AssociateHaVipResult, StaxUnmarshallerContext> {

    @Override
	public AssociateHaVipResult unmarshall(StaxUnmarshallerContext context)
			throws Exception {
        AssociateHaVipResult associateHaVipResult = new AssociateHaVipResult();
		int originalDepth = context.getCurrentDepth();
		int targetDepth = originalDepth + 1;

		if (context.isStartOfDocument())
			targetDepth += 1;

		while (true) {
			XMLEvent xmlEvent = context.nextEvent();
			if (xmlEvent.isEndDocument())
				return associateHaVipResult;

			if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("Return", targetDepth)) {
                    associateHaVipResult.setReturn(Boolean.parseBoolean(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context)));
                    continue;
                }else if(context.testExpression("RequestId", targetDepth)){
                    associateHaVipResult.setRequestId(StringStaxUnmarshaller.getInstance().unmarshall(context));
					continue;
				}

			} else if (xmlEvent.isEndElement()) {
				if (context.getCurrentDepth() < originalDepth) {
					return associateHaVipResult;
				}
			}
		}
	}

	private static AssociateHaVipResultStaxUnmarshaller instance;

	public static AssociateHaVipResultStaxUnmarshaller getInstance() {
		if (instance == null)
			instance = new AssociateHaVipResultStaxUnmarshaller();
		return instance;
	}
}
