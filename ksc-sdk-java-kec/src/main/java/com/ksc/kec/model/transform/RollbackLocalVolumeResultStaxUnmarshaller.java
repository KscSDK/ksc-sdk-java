package com.ksc.kec.model.transform;

import javax.xml.stream.events.XMLEvent;

import com.ksc.kec.model.RollbackLocalVolumeResult;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.BooleanStaxUnmarshaller;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

public class RollbackLocalVolumeResultStaxUnmarshaller implements
       Unmarshaller<RollbackLocalVolumeResult, StaxUnmarshallerContext>{

	@Override
	public RollbackLocalVolumeResult unmarshall(StaxUnmarshallerContext context) throws Exception {
		RollbackLocalVolumeResult rollbackLocalVolumeResult = new RollbackLocalVolumeResult();
		int originalDepth = context.getCurrentDepth();
		int targetDepth = originalDepth + 1;

		if (context.isStartOfDocument())
			targetDepth += 1;

		while (true) {
			XMLEvent xmlEvent = context.nextEvent();
			if (xmlEvent.isEndDocument())
				return rollbackLocalVolumeResult;

			if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {
				// no use reservation
				if (context.testExpression("Return", targetDepth)) {
					rollbackLocalVolumeResult.setReturn(BooleanStaxUnmarshaller
							.getInstance().unmarshall(context));
					continue;
				}

				if (context.testExpression("RequestId", targetDepth)) {
					rollbackLocalVolumeResult.setRequestId(StringStaxUnmarshaller
							.getInstance().unmarshall(context));
					continue;
				}
			} else if (xmlEvent.isEndElement()) {
				if (context.getCurrentDepth() < originalDepth) {
					return rollbackLocalVolumeResult;
				}
			}
		}
	}

	private static RollbackLocalVolumeResultStaxUnmarshaller instance;

	public static RollbackLocalVolumeResultStaxUnmarshaller getInstance() {
		if (instance == null)
			instance = new RollbackLocalVolumeResultStaxUnmarshaller();
		return instance;
	}
}
