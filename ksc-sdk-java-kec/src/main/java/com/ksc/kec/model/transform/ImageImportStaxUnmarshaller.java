package com.ksc.kec.model.transform;

import com.ksc.kec.model.ImageImportResult;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import javax.xml.stream.events.XMLEvent;

/**
 * ImageImportResult StAX Unmarshaller
 */
public class ImageImportStaxUnmarshaller implements
		Unmarshaller<ImageImportResult, StaxUnmarshallerContext> {

	public ImageImportResult unmarshall(StaxUnmarshallerContext context)
			throws Exception {
		ImageImportResult imageImportResult = new ImageImportResult();
		int originalDepth = context.getCurrentDepth();
		int targetDepth = originalDepth + 1;

		if (context.isStartOfDocument())
			targetDepth += 1;

		while (true) {
			XMLEvent xmlEvent = context.nextEvent();
			if (xmlEvent.isEndDocument())
				return imageImportResult;

			if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

				if (context.testExpression("RequestId", targetDepth)) {
					imageImportResult.setRequestId(StringStaxUnmarshaller
							.getInstance().unmarshall(context));
					continue;
				}
				if (context.testExpression("ImageId", targetDepth)) {
					imageImportResult.setImageId(StringStaxUnmarshaller
							.getInstance().unmarshall(context));
					continue;
				}
			} else if (xmlEvent.isEndElement()) {
				if (context.getCurrentDepth() < originalDepth) {
					return imageImportResult;
				}
			}
		}
	}

	private static ImageImportStaxUnmarshaller instance;

	public static ImageImportStaxUnmarshaller getInstance() {
		if (instance == null)
			instance = new ImageImportStaxUnmarshaller();
		return instance;
	}
}
