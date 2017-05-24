package com.ksc.ket.model.transform;

import static com.fasterxml.jackson.core.JsonToken.END_ARRAY;
import static com.fasterxml.jackson.core.JsonToken.END_OBJECT;
import static com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
import static com.fasterxml.jackson.core.JsonToken.START_OBJECT;
import static com.fasterxml.jackson.core.JsonToken.VALUE_NULL;

import com.fasterxml.jackson.core.JsonToken;
import com.ksc.ket.model.StartLoopList;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

public class StartLoopListJsonUnmarshaller implements Unmarshaller<StartLoopList, JsonUnmarshallerContext> {
	public StartLoopList unmarshall(JsonUnmarshallerContext context) throws Exception {
		StartLoopList startLoopList = new StartLoopList();
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
					startLoopList.setFormat(context.getUnmarshaller(String.class).unmarshall(context));
				} else if (context.testExpression("TaskID", targetDepth)) {
					context.nextToken();
					startLoopList.setTaskID(context.getUnmarshaller(String.class).unmarshall(context));
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
		return startLoopList;
	}

	private static StartLoopListJsonUnmarshaller instance;

	public static StartLoopListJsonUnmarshaller getInstance() {
		if (instance == null)
			instance = new StartLoopListJsonUnmarshaller();
		return instance;
	}
}

