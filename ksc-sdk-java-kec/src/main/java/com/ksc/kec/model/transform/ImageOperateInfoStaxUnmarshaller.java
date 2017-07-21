package com.ksc.kec.model.transform;

import javax.xml.stream.events.XMLEvent;

import com.ksc.kec.model.ImageOperateInfo;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.BooleanStaxUnmarshaller;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

public class ImageOperateInfoStaxUnmarshaller implements Unmarshaller<ImageOperateInfo, StaxUnmarshallerContext> {
	private static ImageOperateInfoStaxUnmarshaller instance;

	public static ImageOperateInfoStaxUnmarshaller getInstance() {
		if (instance == null)
			instance = new ImageOperateInfoStaxUnmarshaller();
		return instance;
	}

	@Override
	public ImageOperateInfo unmarshall(StaxUnmarshallerContext context) throws Exception {
		// TODO Auto-generated method stub
		ImageOperateInfo info = new ImageOperateInfo();
		int originalDepth = context.getCurrentDepth();
		int targetDepth = originalDepth + 1;
		while (true) {
			XMLEvent xmlEvent = context.nextEvent();
			if (xmlEvent.isEndDocument())
				return info;
			if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {
				if (context.testExpression("ImageId", targetDepth)) {
					info.setImageId(StringStaxUnmarshaller.getInstance().unmarshall(context));
				} else if (context.testExpression("Return", targetDepth)) {
					info.setReturn(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
				}
			} else if (xmlEvent.isEndElement()) {
				if (context.getCurrentDepth() < originalDepth) {
					return info;
				}
			}
		}
	}

}
