package com.ksc.kec.model.transform;

import javax.xml.stream.events.XMLEvent;

import com.ksc.kec.model.Image;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.BooleanStaxUnmarshaller;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

/**
 * 
 * Image StAX Unmarshaller
 *
 */
public class ImageStaxUnmarshaller implements Unmarshaller<Image, StaxUnmarshallerContext> {
	private static ImageStaxUnmarshaller instance;

	public static ImageStaxUnmarshaller getInstance() {
		if (instance == null)
			instance = new ImageStaxUnmarshaller();
		return instance;
	}

	@Override
	public Image unmarshall(StaxUnmarshallerContext context) throws Exception {
		// TODO Auto-generated method stub
		Image info = new Image();
		int originalDepth = context.getCurrentDepth();
		int targetDepth = originalDepth + 1;
		while (true) {
			XMLEvent xmlEvent = context.nextEvent();
			if (xmlEvent.isEndDocument())
				return info;
			if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {
				if (context.testExpression("InstanceId", targetDepth)) {
					info.setInstanceId(StringStaxUnmarshaller.getInstance().unmarshall(context));
				} else if (context.testExpression("Name", targetDepth)) {
					info.setName(StringStaxUnmarshaller.getInstance().unmarshall(context));
				}else if (context.testExpression("ImageId", targetDepth)) {
					info.setImageId(StringStaxUnmarshaller.getInstance().unmarshall(context));
				}else if (context.testExpression("CreationDate", targetDepth)) {
					info.setCreationDate(StringStaxUnmarshaller.getInstance().unmarshall(context));
				}else if (context.testExpression("IsPublic", targetDepth)) {
					info.setIsPublic(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
				}else if (context.testExpression("Platform", targetDepth)) {
					info.setPlatform(StringStaxUnmarshaller.getInstance().unmarshall(context));
				}else if (context.testExpression("ImageState", targetDepth)) {
					info.setImageState(StringStaxUnmarshaller.getInstance().unmarshall(context));
				}else if (context.testExpression("IsNpe", targetDepth)) {
					info.setIsNpe(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
				}else if (context.testExpression("UserCategory", targetDepth)) {
					info.setUserCategory(StringStaxUnmarshaller.getInstance().unmarshall(context));
				}else if (context.testExpression("SysDisk", targetDepth)) {
					info.setSysDisk(StringStaxUnmarshaller.getInstance().unmarshall(context));
				}else if (context.testExpression("Progress", targetDepth)) {
					info.setProgress(StringStaxUnmarshaller.getInstance().unmarshall(context));
				}else if (context.testExpression("ImageSource", targetDepth)) {
					info.setImageSource(StringStaxUnmarshaller.getInstance().unmarshall(context));
				}
			} else if (xmlEvent.isEndElement()) {
				if (context.getCurrentDepth() < originalDepth) {
					return info;
				}
			}
		}
	}

}
