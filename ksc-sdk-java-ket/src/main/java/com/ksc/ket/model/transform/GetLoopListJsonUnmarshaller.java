package com.ksc.ket.model.transform;

import static com.fasterxml.jackson.core.JsonToken.END_ARRAY;
import static com.fasterxml.jackson.core.JsonToken.END_OBJECT;
import static com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
import static com.fasterxml.jackson.core.JsonToken.START_OBJECT;
import static com.fasterxml.jackson.core.JsonToken.VALUE_NULL;

import com.fasterxml.jackson.core.JsonToken;
import com.ksc.ket.model.GetLoopList;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.ListUnmarshaller;
import com.ksc.transform.SimpleTypeJsonUnmarshallers;
import com.ksc.transform.Unmarshaller;

public class GetLoopListJsonUnmarshaller implements Unmarshaller<GetLoopList, JsonUnmarshallerContext> {

	public GetLoopList unmarshall(JsonUnmarshallerContext context) throws Exception {
		GetLoopList result = new GetLoopList();
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

				if (context.testExpression("SrcInfo", targetDepth)) {
					context.nextToken();
					result.setSrcInfo(new ListUnmarshaller<String>(
							SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance()).unmarshall(context));
				} else if (context.testExpression("OutputFormat", targetDepth)) {
					context.nextToken();
					result.setOutputFormat((context.getUnmarshaller(String.class).unmarshall(context)));
				} else if (context.testExpression("App", targetDepth)) {
					context.nextToken();
					result.setApp((context.getUnmarshaller(String.class).unmarshall(context)));
				} else if (context.testExpression("PubDomain", targetDepth)) {
					context.nextToken();
					result.setPubDomain((context.getUnmarshaller(String.class).unmarshall(context)));
				} else if (context.testExpression("Preset", targetDepth)) {
					context.nextToken();
					result.setPreset((context.getUnmarshaller(String.class).unmarshall(context)));
				} else if (context.testExpression("ContinueHour", targetDepth)) {
					context.nextToken();
					result.setContinueHour((context.getUnmarshaller(String.class).unmarshall(context)));
				} else if (context.testExpression("TaskID", targetDepth)) {
					context.nextToken();
					result.setTaskID((context.getUnmarshaller(String.class).unmarshall(context)));
				} else if (context.testExpression("StreamID", targetDepth)) {
					context.nextToken();
					result.setStreamID((context.getUnmarshaller(String.class).unmarshall(context)));
				} else if (context.testExpression("CreateTime", targetDepth)) {
					context.nextToken();
					result.setCreateTime((context.getUnmarshaller(String.class).unmarshall(context)));
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
		return result;
	}

	private static GetLoopListJsonUnmarshaller instance;

	public static GetLoopListJsonUnmarshaller getInstance() {
		if (instance == null)
			instance = new GetLoopListJsonUnmarshaller();
		return instance;
	}
}