package com.ksc.network.vpc.transform.havip;

import com.ksc.network.vpc.model.havip.CreateHaVipResult;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import javax.xml.stream.events.XMLEvent;

/**
 * CreateHaVipResult StAX Unmarshaller
 */
public class CreateHaVipResultStaxUnmarshaller implements
		Unmarshaller<CreateHaVipResult, StaxUnmarshallerContext> {

    @Override
	public CreateHaVipResult unmarshall(StaxUnmarshallerContext context)
			throws Exception {
        CreateHaVipResult createHaVipResult = new CreateHaVipResult();
		int originalDepth = context.getCurrentDepth();
		int targetDepth = originalDepth + 1;

		if (context.isStartOfDocument())
			targetDepth += 1;

		while (true) {
			XMLEvent xmlEvent = context.nextEvent();
			if (xmlEvent.isEndDocument())
				return createHaVipResult;

			if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

				if (context.testExpression("HaVip", targetDepth)) {
                    createHaVipResult.setHaVip(HaVipStaxUnmarshaller.getInstance().unmarshall(context));
					continue;
				}else if(context.testExpression("RequestId", targetDepth)){
                    createHaVipResult.setRequestId(StringStaxUnmarshaller.getInstance().unmarshall(context));
					continue;
				}

			} else if (xmlEvent.isEndElement()) {
				if (context.getCurrentDepth() < originalDepth) {
					return createHaVipResult;
				}
			}
		}
	}

	private static CreateHaVipResultStaxUnmarshaller instance;

	public static CreateHaVipResultStaxUnmarshaller getInstance() {
		if (instance == null)
			instance = new CreateHaVipResultStaxUnmarshaller();
		return instance;
	}
}
