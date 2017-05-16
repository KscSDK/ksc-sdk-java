package com.ksc.kec.model.transform;

import javax.xml.stream.events.XMLEvent;

import com.ksc.kec.model.RemoveImagesResult;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

public class RemoveImagesResultStaxUnmarshaller implements
       Unmarshaller<RemoveImagesResult, StaxUnmarshallerContext> {

	@Override
	public RemoveImagesResult unmarshall(StaxUnmarshallerContext context) throws Exception {
		RemoveImagesResult removeImagesResult = new RemoveImagesResult();
		int originalDepth = context.getCurrentDepth();
		int targetDepth = originalDepth + 1;

		if (context.isStartOfDocument())
			targetDepth += 1;

		while (true) {
			XMLEvent xmlEvent = context.nextEvent();
			if (xmlEvent.isEndDocument())
				return removeImagesResult;

			if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {
				// no use reservation
				if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {
					if (context.testExpression("ReturnSet/Item", targetDepth)) {
						removeImagesResult.addReturnSet(ImageOperateInfoStaxUnmarshaller.getInstance().unmarshall(context));
					} else if (context.testExpression("RequestId", targetDepth)) {
						removeImagesResult.setRequestId(StringStaxUnmarshaller.getInstance().unmarshall(context));
					}
				} 
			} else if (xmlEvent.isEndElement()) {
				if (context.getCurrentDepth() < originalDepth) {
					return removeImagesResult;
				}
			}
		}
	}

	private static RemoveImagesResultStaxUnmarshaller instance;

	public static RemoveImagesResultStaxUnmarshaller getInstance() {
		if (instance == null)
			instance = new RemoveImagesResultStaxUnmarshaller();
		return instance;
	}

}

