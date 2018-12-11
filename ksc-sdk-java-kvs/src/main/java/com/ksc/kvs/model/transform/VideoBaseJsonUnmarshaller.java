package com.ksc.kvs.model.transform;

import com.fasterxml.jackson.core.JsonToken;
import com.ksc.kvs.model.GetPlayInfoResult;
import com.ksc.kvs.model.VideoBase;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import static com.fasterxml.jackson.core.JsonToken.*;

public class VideoBaseJsonUnmarshaller
		implements Unmarshaller<VideoBase, JsonUnmarshallerContext> {

	public VideoBase unmarshall(JsonUnmarshallerContext context) throws Exception {
		// TODO Auto-generated method stub
		VideoBase videoBase = new VideoBase();
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

				if (context.testExpression("VideoId", targetDepth)) {
					context.nextToken();
					videoBase.setVideoId((context.getUnmarshaller(Long.class).unmarshall(context)));
				} else if (context.testExpression("VideoTitle", targetDepth)) {
					context.nextToken();
					videoBase.setVideoTitle((context.getUnmarshaller(String.class).unmarshall(context)));
				} else if (context.testExpression("CreateTime", targetDepth)) {
					context.nextToken();
					videoBase.setCreateTime((context.getUnmarshaller(Long.class).unmarshall(context)));
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
		return videoBase;
	}

	private static VideoBaseJsonUnmarshaller instance;

	public static VideoBaseJsonUnmarshaller getInstance() {
		if (instance == null)
			instance = new VideoBaseJsonUnmarshaller();
		return instance;
	}

}
