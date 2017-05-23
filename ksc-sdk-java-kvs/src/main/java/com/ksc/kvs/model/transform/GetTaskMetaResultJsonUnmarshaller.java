package com.ksc.kvs.model.transform;

import static com.fasterxml.jackson.core.JsonToken.END_ARRAY;
import static com.fasterxml.jackson.core.JsonToken.END_OBJECT;
import static com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
import static com.fasterxml.jackson.core.JsonToken.START_OBJECT;
import static com.fasterxml.jackson.core.JsonToken.VALUE_NULL;

import com.fasterxml.jackson.core.JsonToken;
import com.ksc.kvs.model.GetTaskMetaResult;
import com.ksc.kvs.model.MetaInfo;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.ListUnmarshaller;
import com.ksc.transform.Unmarshaller;

public class GetTaskMetaResultJsonUnmarshaller implements Unmarshaller<GetTaskMetaResult, JsonUnmarshallerContext> {

	public GetTaskMetaResult unmarshall(JsonUnmarshallerContext context) throws Exception {
		GetTaskMetaResult getTaskMetaResult = new GetTaskMetaResult();
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

				if (context.testExpression("MetaList", targetDepth)) {
					context.nextToken();
					getTaskMetaResult
							.setMetaInfo(new ListUnmarshaller<MetaInfo>(MetaInfoListJsonUnmarshaller.getInstance())
									.unmarshall(context));
				} else if (context.testExpression("ErrNum", targetDepth)) {
					context.nextToken();
					getTaskMetaResult.setErrNum((context.getUnmarshaller(Integer.class).unmarshall(context)));
				} else if (context.testExpression("ErrMsg", targetDepth)) {
					context.nextToken();
					getTaskMetaResult.setErrMsg((context.getUnmarshaller(String.class).unmarshall(context)));
				} else if (context.testExpression("StartDate", targetDepth)) {
					context.nextToken();
					getTaskMetaResult.setStartDate((context.getUnmarshaller(String.class).unmarshall(context)));
				} else if (context.testExpression("EndDate", targetDepth)) {
					context.nextToken();
					getTaskMetaResult.setEndDate((context.getUnmarshaller(String.class).unmarshall(context)));
				} else if (context.testExpression("Marker", targetDepth)) {
					context.nextToken();
					getTaskMetaResult.setMarker((context.getUnmarshaller(Integer.class).unmarshall(context)));
				} else if (context.testExpression("Count", targetDepth)) {
					context.nextToken();
					getTaskMetaResult.setCount((context.getUnmarshaller(Integer.class).unmarshall(context)));
				} else if (context.testExpression("Total", targetDepth)) {
					context.nextToken();
					getTaskMetaResult.setTotal((context.getUnmarshaller(Integer.class).unmarshall(context)));
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
		return getTaskMetaResult;
	}

	private static GetTaskMetaResultJsonUnmarshaller instance;

	public static GetTaskMetaResultJsonUnmarshaller getInstance() {
		if (instance == null)
			instance = new GetTaskMetaResultJsonUnmarshaller();
		return instance;
	}

}
