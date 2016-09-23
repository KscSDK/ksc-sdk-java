package com.ksc.offline.model.transform;

import static com.fasterxml.jackson.core.JsonToken.END_ARRAY;
import static com.fasterxml.jackson.core.JsonToken.END_OBJECT;
import static com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
import static com.fasterxml.jackson.core.JsonToken.START_OBJECT;
import static com.fasterxml.jackson.core.JsonToken.VALUE_NULL;

import com.fasterxml.jackson.core.JsonToken;
import com.ksc.offline.model.Audio;
import com.ksc.offline.model.Param;
import com.ksc.offline.model.Video;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.ListUnmarshaller;
import com.ksc.transform.Unmarshaller;

public class VideoJsonUnmarshaller implements Unmarshaller<Video, JsonUnmarshallerContext>{
	public Video unmarshall(JsonUnmarshallerContext context) throws Exception {
		Video video = new Video();
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
				
				if (context.testExpression("vr", targetDepth)) {
					context.nextToken();
					video.setVr(context.getUnmarshaller(String.class).unmarshall(context));
				} else if (context.testExpression("vb", targetDepth)) {
					context.nextToken();
					video.setVb(context.getUnmarshaller(String.class).unmarshall(context));
				}  else if (context.testExpression("vcodec", targetDepth)) {
					context.nextToken();
					video.setVcodec(context.getUnmarshaller(String.class).unmarshall(context));
				} else if (context.testExpression("width", targetDepth)) {
					context.nextToken();
					video.setWidth(context.getUnmarshaller(Integer.class).unmarshall(context));
				} else if (context.testExpression("height", targetDepth)) {
					context.nextToken();
					video.setHeight(context.getUnmarshaller(Integer.class).unmarshall(context));
				} else if (context.testExpression("as", targetDepth)) {
					context.nextToken();
					video.setAs(context.getUnmarshaller(Integer.class).unmarshall(context));
				} else if (context.testExpression("rotate", targetDepth)) {
					context.nextToken();
					video.setRotate(context.getUnmarshaller(String.class).unmarshall(context));
				} else if (context.testExpression("vn", targetDepth)) {
					context.nextToken();
					video.setVn(context.getUnmarshaller(Integer.class).unmarshall(context));
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
		return video;
	}

	private static VideoJsonUnmarshaller instance;

	public static VideoJsonUnmarshaller getInstance() {
		if (instance == null)
			instance = new VideoJsonUnmarshaller();
		return instance;
	}
}
