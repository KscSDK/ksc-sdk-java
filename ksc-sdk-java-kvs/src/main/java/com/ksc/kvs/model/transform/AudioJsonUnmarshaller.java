package com.ksc.kvs.model.transform;

import static com.fasterxml.jackson.core.JsonToken.END_ARRAY;
import static com.fasterxml.jackson.core.JsonToken.END_OBJECT;
import static com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
import static com.fasterxml.jackson.core.JsonToken.START_OBJECT;
import static com.fasterxml.jackson.core.JsonToken.VALUE_NULL;

import com.fasterxml.jackson.core.JsonToken;
import com.ksc.kvs.model.Audio;
import com.ksc.kvs.model.Param;
import com.ksc.kvs.model.Video;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.ListUnmarshaller;
import com.ksc.transform.Unmarshaller;

public class AudioJsonUnmarshaller implements Unmarshaller<Audio, JsonUnmarshallerContext>{
	public Audio unmarshall(JsonUnmarshallerContext context) throws Exception {
		Audio audio = new Audio();
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
				
				if (context.testExpression("ar", targetDepth)) {
					context.nextToken();
					audio.setAr(context.getUnmarshaller(String.class).unmarshall(context));
				} else if (context.testExpression("ab", targetDepth)) {
					context.nextToken();
					audio.setAb(context.getUnmarshaller(String.class).unmarshall(context));
				} else if (context.testExpression("acodec", targetDepth)) {
					context.nextToken();
					audio.setAcodec(context.getUnmarshaller(String.class).unmarshall(context));
				} else if (context.testExpression("an", targetDepth)) {
					context.nextToken();
					audio.setAn(context.getUnmarshaller(Integer.class).unmarshall(context));
				} else if (context.testExpression("channels", targetDepth)) {
					context.nextToken();
					audio.setChannels(context.getUnmarshaller(Integer.class).unmarshall(context));
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
		return audio;
	}

	private static AudioJsonUnmarshaller instance;

	public static AudioJsonUnmarshaller getInstance() {
		if (instance == null)
			instance = new AudioJsonUnmarshaller();
		return instance;
	}
}
