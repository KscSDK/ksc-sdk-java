package com.ksc.kvs.model.transform;

import com.fasterxml.jackson.core.JsonToken;
import com.ksc.kvs.model.PlayInfo;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import static com.fasterxml.jackson.core.JsonToken.*;

public class PlayInfoListJsonUnmarshaller
		implements Unmarshaller<PlayInfo, JsonUnmarshallerContext> {

	public PlayInfo unmarshall(JsonUnmarshallerContext context) throws Exception {
		// TODO Auto-generated method stub
		PlayInfo playInfo = new PlayInfo();
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

				if (context.testExpression("Format", targetDepth)) {
					context.nextToken();
					playInfo.setFormat((context.getUnmarshaller(String.class).unmarshall(context)));
				} else if (context.testExpression("PlayURL", targetDepth)) {
					context.nextToken();
					playInfo.setPlayURL((context.getUnmarshaller(String.class).unmarshall(context)));
				} else if (context.testExpression("Duration", targetDepth)) {
					context.nextToken();
					playInfo.setDuration((context.getUnmarshaller(Long.class).unmarshall(context)));
				} else if (context.testExpression("Size", targetDepth)) {
					context.nextToken();
					playInfo.setSize((context.getUnmarshaller(Float.class).unmarshall(context)));
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
		return playInfo;
	}

	private static PlayInfoListJsonUnmarshaller instance;

	public static PlayInfoListJsonUnmarshaller getInstance() {
		if (instance == null)
			instance = new PlayInfoListJsonUnmarshaller();
		return instance;
	}

}
