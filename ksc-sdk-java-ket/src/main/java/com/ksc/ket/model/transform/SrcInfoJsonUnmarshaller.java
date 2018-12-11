package com.ksc.ket.model.transform;

import static com.fasterxml.jackson.core.JsonToken.END_ARRAY;
import static com.fasterxml.jackson.core.JsonToken.END_OBJECT;
import static com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
import static com.fasterxml.jackson.core.JsonToken.START_OBJECT;
import static com.fasterxml.jackson.core.JsonToken.VALUE_NULL;

import com.fasterxml.jackson.core.JsonToken;
import com.ksc.ket.model.SrcInfo;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

public class SrcInfoJsonUnmarshaller implements Unmarshaller<SrcInfo, JsonUnmarshallerContext> {
	public SrcInfo unmarshall(JsonUnmarshallerContext context) throws Exception {
		SrcInfo srcInfo = new SrcInfo();
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

				if (context.testExpression("SrcUrl", targetDepth)) {
					context.nextToken();
					srcInfo.setSrcUrl(context.getUnmarshaller(String.class).unmarshall(context));
				} else if (context.testExpression("UniqName", targetDepth)) {
					context.nextToken();
					srcInfo.setUniqName(context.getUnmarshaller(String.class).unmarshall(context));
				} else if (context.testExpression("App", targetDepth)) {
					context.nextToken();
					srcInfo.setApp(context.getUnmarshaller(String.class).unmarshall(context));
				} else if (context.testExpression("StreamID", targetDepth)) {
					context.nextToken();
					srcInfo.setStreamID(context.getUnmarshaller(String.class).unmarshall(context));
				} else if (context.testExpression("Bucket", targetDepth)) {
					context.nextToken();
					srcInfo.setBucket(context.getUnmarshaller(String.class).unmarshall(context));
				} else if (context.testExpression("ObjectKey", targetDepth)) {
					context.nextToken();
					srcInfo.setObjectKey(context.getUnmarshaller(String.class).unmarshall(context));
				} else if (context.testExpression("Index", targetDepth)) {
					context.nextToken();
					srcInfo.setIndex(context.getUnmarshaller(Integer.class).unmarshall(context));
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
		return srcInfo;
	}

	private static SrcInfoJsonUnmarshaller instance;

	public static SrcInfoJsonUnmarshaller getInstance() {
		if (instance == null)
			instance = new SrcInfoJsonUnmarshaller();
		return instance;
	}
}
