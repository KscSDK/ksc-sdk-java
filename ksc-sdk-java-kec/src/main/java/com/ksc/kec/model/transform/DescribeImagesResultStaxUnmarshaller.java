package com.ksc.kec.model.transform;

import javax.xml.stream.events.XMLEvent;

import com.ksc.kec.model.DescribeImagesResult;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

/**
 * 
 * DescribeImagesResult StAX Unmarshaller
 *
 */
public class DescribeImagesResultStaxUnmarshaller implements Unmarshaller<DescribeImagesResult, StaxUnmarshallerContext> {
	private static DescribeImagesResultStaxUnmarshaller instance;

	public static DescribeImagesResultStaxUnmarshaller getInstance() {
		if (instance == null)
			instance = new DescribeImagesResultStaxUnmarshaller();
		return instance;
	}

	@Override
	public DescribeImagesResult unmarshall(StaxUnmarshallerContext context) throws Exception {
		// TODO Auto-generated method stub
		DescribeImagesResult result = new DescribeImagesResult();
		int originalDepth = context.getCurrentDepth();
		int targetDepth = originalDepth + 1;
		
		if (context.isStartOfDocument())
			targetDepth += 1;
		
		while (true) {
			XMLEvent xmlEvent = context.nextEvent();
			if (xmlEvent.isEndDocument())
				return result;
			if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {
				if (context.testExpression("ImagesSet/Item", targetDepth)) {
					result.withImageSet(ImageStaxUnmarshaller.getInstance().unmarshall(context));
				} else if (context.testExpression("RequestId", targetDepth)) {
					result.setRequestId(StringStaxUnmarshaller.getInstance().unmarshall(context));
				}
			} else if (xmlEvent.isEndElement()) {
				if (context.getCurrentDepth() < originalDepth) {
					return result;
				}
			}
		}
	}

}
