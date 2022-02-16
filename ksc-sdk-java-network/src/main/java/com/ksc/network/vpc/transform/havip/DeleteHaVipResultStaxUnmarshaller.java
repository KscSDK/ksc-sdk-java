package com.ksc.network.vpc.transform.havip;

import com.ksc.network.vpc.model.havip.DeleteHaVipResult;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import javax.xml.stream.events.XMLEvent;

/**
 * DeleteHaVipResult StAX Unmarshaller
 */
public class DeleteHaVipResultStaxUnmarshaller implements
		Unmarshaller<DeleteHaVipResult, StaxUnmarshallerContext> {

    @Override
	public DeleteHaVipResult unmarshall(StaxUnmarshallerContext context)
			throws Exception {
        DeleteHaVipResult deleteHaVipResult = new DeleteHaVipResult();
		int originalDepth = context.getCurrentDepth();
		int targetDepth = originalDepth + 1;

		if (context.isStartOfDocument())
			targetDepth += 1;

		while (true) {
			XMLEvent xmlEvent = context.nextEvent();
			if (xmlEvent.isEndDocument())
				return deleteHaVipResult;

			if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("Return", targetDepth)) {
                    deleteHaVipResult.setReturn(Boolean.parseBoolean(StringStaxUnmarshaller.getInstance()
                            .unmarshall(context)));
                    continue;
                }else if(context.testExpression("RequestId", targetDepth)){
                    deleteHaVipResult.setRequestId(StringStaxUnmarshaller.getInstance().unmarshall(context));
					continue;
				}

			} else if (xmlEvent.isEndElement()) {
				if (context.getCurrentDepth() < originalDepth) {
					return deleteHaVipResult;
				}
			}
		}
	}

	private static DeleteHaVipResultStaxUnmarshaller instance;

	public static DeleteHaVipResultStaxUnmarshaller getInstance() {
		if (instance == null)
			instance = new DeleteHaVipResultStaxUnmarshaller();
		return instance;
	}
}
