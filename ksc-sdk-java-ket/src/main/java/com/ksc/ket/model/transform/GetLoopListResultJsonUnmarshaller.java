package com.ksc.ket.model.transform;

import static com.fasterxml.jackson.core.JsonToken.END_ARRAY;
import static com.fasterxml.jackson.core.JsonToken.END_OBJECT;
import static com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
import static com.fasterxml.jackson.core.JsonToken.START_OBJECT;
import static com.fasterxml.jackson.core.JsonToken.VALUE_NULL;

import com.fasterxml.jackson.core.JsonToken;
import com.ksc.ket.model.GetLoopList;
import com.ksc.ket.model.GetLoopListResult;
import com.ksc.ket.model.PresetList;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.ListUnmarshaller;
import com.ksc.transform.Unmarshaller;

public class GetLoopListResultJsonUnmarshaller implements Unmarshaller<GetLoopListResult, JsonUnmarshallerContext> {

	public GetLoopListResult unmarshall(JsonUnmarshallerContext context) throws Exception {
		GetLoopListResult result = new GetLoopListResult();
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

				if (context.testExpression("List", targetDepth)) {
					context.nextToken();
					result.setList(new ListUnmarshaller<GetLoopList>(GetLoopListJsonUnmarshaller.getInstance())
									.unmarshall(context));
				} else if (context.testExpression("ErrNum", targetDepth)) {
					context.nextToken();
					result.setErrNum((context.getUnmarshaller(Integer.class).unmarshall(context)));
				} else if (context.testExpression("ErrMsg", targetDepth)) {
					context.nextToken();
					result.setErrMsg((context.getUnmarshaller(String.class).unmarshall(context)));
				} else if (context.testExpression("Total", targetDepth)) {
					context.nextToken();
					result.setTotal((context.getUnmarshaller(Integer.class).unmarshall(context)));
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

	private static GetLoopListResultJsonUnmarshaller instance;

	public static GetLoopListResultJsonUnmarshaller getInstance() {
		if (instance == null)
			instance = new GetLoopListResultJsonUnmarshaller();
		return instance;
	}
}
