package com.ksc.offline.model.transform;

import static com.fasterxml.jackson.core.JsonToken.END_ARRAY;
import static com.fasterxml.jackson.core.JsonToken.END_OBJECT;
import static com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
import static com.fasterxml.jackson.core.JsonToken.START_OBJECT;
import static com.fasterxml.jackson.core.JsonToken.VALUE_NULL;

import com.fasterxml.jackson.core.JsonToken;
import com.ksc.offline.model.Image;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

public class ImageJsonUnmarshaller implements Unmarshaller<Image, JsonUnmarshallerContext>{
	
	public Image unmarshall(JsonUnmarshallerContext context) throws Exception {
		Image image= new Image();
		int originalDepth = context.getCurrentDepth();
		String currentParentElement = context.getCurrentParentElement();
		int targetDepth = originalDepth + 1;

		JsonToken token = context.getCurrentToken();
		if (token == null)
			token = context.nextToken();
		if (token == VALUE_NULL)
			return null;

		while (true) {
			if (token == null)
				break;

			if (token == FIELD_NAME || token == START_OBJECT) {
				
				if (context.testExpression("logoUrl", targetDepth)) {
					context.nextToken();
					image.setLogoUrl(context.getUnmarshaller(String.class).unmarshall(context));
				} else if (context.testExpression("offsetX", targetDepth)) {
					context.nextToken();
					image.setOffsetX(context.getUnmarshaller(Double.class).unmarshall(context));
				} else if (context.testExpression("offsetY", targetDepth)) {
					context.nextToken();
					image.setOffsetY(context.getUnmarshaller(Double.class).unmarshall(context));
				} 
			} else if (token == END_ARRAY || token == END_OBJECT) {
				if (context.getLastParsedParentElement() == null
						|| context.getLastParsedParentElement().equals(currentParentElement)) {
					if (context.getCurrentDepth() <= originalDepth)
						break;
				}
			}
			token = context.nextToken();
		}
		return image;
	}

	private static ImageJsonUnmarshaller instance;

	public static ImageJsonUnmarshaller getInstance() {
		if (instance == null)
			instance = new ImageJsonUnmarshaller();
		return instance;
	}

}
