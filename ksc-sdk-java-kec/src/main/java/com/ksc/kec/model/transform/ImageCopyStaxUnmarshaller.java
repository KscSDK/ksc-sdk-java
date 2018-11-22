package com.ksc.kec.model.transform;

import com.ksc.kec.model.ImageCopyResult;
import com.ksc.transform.SimpleTypeStaxUnmarshallers;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import javax.xml.stream.events.XMLEvent;

/**
 * ImageImportResult StAX Unmarshaller
 */
public class ImageCopyStaxUnmarshaller implements
		Unmarshaller<ImageCopyResult, StaxUnmarshallerContext> {

	public ImageCopyResult unmarshall(StaxUnmarshallerContext context)
			throws Exception {
		ImageCopyResult imageCopyResult = new ImageCopyResult();
		int originalDepth = context.getCurrentDepth();
		int targetDepth = originalDepth + 1;

		if (context.isStartOfDocument())
			targetDepth += 1;

		while (true) {
			XMLEvent xmlEvent = context.nextEvent();
			if (xmlEvent.isEndDocument())
				return imageCopyResult;

			if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

				if (context.testExpression("RequestId", targetDepth)) {
					imageCopyResult.setRequestId(StringStaxUnmarshaller
							.getInstance().unmarshall(context));
					continue;
				}
				if (context.testExpression("Return", targetDepth)) {
					imageCopyResult.setReturn(SimpleTypeStaxUnmarshallers.BooleanStaxUnmarshaller
							.getInstance().unmarshall(context));
					continue;
				}
				if (context.testExpression("Message", targetDepth)) {
					imageCopyResult.setMessage(StringStaxUnmarshaller
							.getInstance().unmarshall(context));
					continue;
				}
			} else if (xmlEvent.isEndElement()) {
				if (context.getCurrentDepth() < originalDepth) {
					return imageCopyResult;
				}
			}
		}
	}

	private static ImageCopyStaxUnmarshaller instance;

	public static ImageCopyStaxUnmarshaller getInstance() {
		if (instance == null)
			instance = new ImageCopyStaxUnmarshaller();
		return instance;
	}
}
