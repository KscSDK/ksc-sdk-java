package com.ksc.ket.model.transform;

import static com.fasterxml.jackson.core.JsonToken.END_ARRAY;
import static com.fasterxml.jackson.core.JsonToken.END_OBJECT;
import static com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
import static com.fasterxml.jackson.core.JsonToken.START_OBJECT;
import static com.fasterxml.jackson.core.JsonToken.VALUE_NULL;

import java.util.List;

import com.fasterxml.jackson.core.JsonToken;
import com.ksc.ket.model.Logo;
import com.ksc.ket.model.Video;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.ListUnmarshaller;
import com.ksc.transform.NestListUnmarshaller;
import com.ksc.transform.Unmarshaller;

public class VideoJsonUnmarshaller implements Unmarshaller<Video, JsonUnmarshallerContext> {
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

				if (context.testExpression("orientationAdapt", targetDepth)) {
					context.nextToken();
					video.setOrientationAdapt(context.getUnmarshaller(Integer.class).unmarshall(context));
				} else if (context.testExpression("codec", targetDepth)) {
					context.nextToken();
					video.setCodec(context.getUnmarshaller(String.class).unmarshall(context));
				} else if (context.testExpression("logo", targetDepth)) {
					context.nextToken();
					video.setLogoList(
							new ListUnmarshaller<Logo>(LogoListJsonUnmarshaller.getInstance()).unmarshall(context));
				} else if (context.testExpression("MultiImage", targetDepth)) {
					context.nextToken();
					List<List<Logo>> list = new NestListUnmarshaller<Logo>(LogoListJsonUnmarshaller.getInstance())
							.unmarshall(context);
					video.setMultiImage(list);
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
