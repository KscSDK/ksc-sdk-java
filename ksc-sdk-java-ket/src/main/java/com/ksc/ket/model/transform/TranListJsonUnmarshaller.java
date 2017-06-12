package com.ksc.ket.model.transform;

import static com.fasterxml.jackson.core.JsonToken.END_ARRAY;
import static com.fasterxml.jackson.core.JsonToken.END_OBJECT;
import static com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
import static com.fasterxml.jackson.core.JsonToken.START_OBJECT;
import static com.fasterxml.jackson.core.JsonToken.VALUE_NULL;

import com.fasterxml.jackson.core.JsonToken;
import com.ksc.ket.model.TranList;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

public class TranListJsonUnmarshaller implements Unmarshaller<TranList, JsonUnmarshallerContext> {
	public TranList unmarshall(JsonUnmarshallerContext context) throws Exception {
		TranList tranList = new TranList();
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

				if (context.testExpression("Preset", targetDepth)) {
					context.nextToken();
					tranList.setPreset(context.getUnmarshaller(String.class).unmarshall(context));
				} else if (context.testExpression("OutputFormat", targetDepth)) {
					context.nextToken();
					tranList.setOutputFormat(context.getUnmarshaller(String.class).unmarshall(context));
				} else if (context.testExpression("TaskID", targetDepth)) {
					context.nextToken();
					tranList.setTaskID(context.getUnmarshaller(String.class).unmarshall(context));
				} else if (context.testExpression("CreateTime", targetDepth)) {
					context.nextToken();
					tranList.setCreateTime(context.getUnmarshaller(String.class).unmarshall(context));
				} else if (context.testExpression("TranStatus", targetDepth)) {
					context.nextToken();
					tranList.setTranStatus(context.getUnmarshaller(String.class).unmarshall(context));
				} else if (context.testExpression("StreamName", targetDepth)) {
					context.nextToken();
					tranList.setStreamName(context.getUnmarshaller(String.class).unmarshall(context));
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
		return tranList;
	}

	private static TranListJsonUnmarshaller instance;

	public static TranListJsonUnmarshaller getInstance() {
		if (instance == null)
			instance = new TranListJsonUnmarshaller();
		return instance;
	}
}
