package com.ksc.kec.model.transform;

import javax.xml.stream.events.XMLEvent;

import com.ksc.kec.model.CreateImageResult;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

public class CreateImageResultStaxUnmarshaller implements
             Unmarshaller<CreateImageResult, StaxUnmarshallerContext> {

	@Override
	public CreateImageResult unmarshall(StaxUnmarshallerContext context) throws Exception {
		CreateImageResult createImageResult = new CreateImageResult();
		int originalDepth = context.getCurrentDepth();
		int targetDepth = originalDepth + 1;

		if (context.isStartOfDocument())
			targetDepth += 1;

		while (true) {
			XMLEvent xmlEvent = context.nextEvent();
			if (xmlEvent.isEndDocument())
				return createImageResult;

			if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {
				// no use reservation
				if (context.testExpression("ImageId", targetDepth)) {
					createImageResult.setImageId(StringStaxUnmarshaller
							.getInstance().unmarshall(context));
					continue;
				}

				if (context.testExpression("RequestId", targetDepth)) {
					createImageResult.setRequestId(StringStaxUnmarshaller
							.getInstance().unmarshall(context));
					continue;
				}
			} else if (xmlEvent.isEndElement()) {
				if (context.getCurrentDepth() < originalDepth) {
					return createImageResult;
				}
			}
		}
	}

	private static CreateImageResultStaxUnmarshaller instance;

	public static CreateImageResultStaxUnmarshaller getInstance() {
		if (instance == null)
			instance = new CreateImageResultStaxUnmarshaller();
		return instance;
	}

}
