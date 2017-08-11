package com.ksc.ket.model.transform;

import static com.fasterxml.jackson.core.JsonToken.END_ARRAY;
import static com.fasterxml.jackson.core.JsonToken.END_OBJECT;
import static com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
import static com.fasterxml.jackson.core.JsonToken.START_OBJECT;
import static com.fasterxml.jackson.core.JsonToken.VALUE_NULL;

import com.fasterxml.jackson.core.JsonToken;
import com.ksc.ket.model.DstInfo;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

public class DstInfoJsonUnmarshaller implements Unmarshaller<DstInfo, JsonUnmarshallerContext> {
	public DstInfo unmarshall(JsonUnmarshallerContext context) throws Exception {
		DstInfo dstInfo = new DstInfo();
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

				if (context.testExpression("DstUrl", targetDepth)) {
					context.nextToken();
					dstInfo.setDstUrl(context.getUnmarshaller(String.class).unmarshall(context));
				} else if (context.testExpression("UniqName", targetDepth)) {
					context.nextToken();
					dstInfo.setUniqName(context.getUnmarshaller(String.class).unmarshall(context));
				} else if (context.testExpression("App", targetDepth)) {
					context.nextToken();
					dstInfo.setApp(context.getUnmarshaller(String.class).unmarshall(context));
				} else if (context.testExpression("StreamID", targetDepth)) {
					context.nextToken();
					dstInfo.setStreamID(context.getUnmarshaller(String.class).unmarshall(context));
				} else if (context.testExpression("Mainly", targetDepth)) {
					context.nextToken();
					dstInfo.setMainly(context.getUnmarshaller(Integer.class).unmarshall(context));
				} else if (context.testExpression("Index", targetDepth)) {
					context.nextToken();
					dstInfo.setIndex(context.getUnmarshaller(Integer.class).unmarshall(context));
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
		return dstInfo;
	}

	private static DstInfoJsonUnmarshaller instance;

	public static DstInfoJsonUnmarshaller getInstance() {
		if (instance == null)
			instance = new DstInfoJsonUnmarshaller();
		return instance;
	}
}
