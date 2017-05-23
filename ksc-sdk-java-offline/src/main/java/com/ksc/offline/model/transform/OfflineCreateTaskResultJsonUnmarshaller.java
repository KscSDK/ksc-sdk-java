package com.ksc.offline.model.transform;

import static com.fasterxml.jackson.core.JsonToken.END_ARRAY;
import static com.fasterxml.jackson.core.JsonToken.END_OBJECT;
import static com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
import static com.fasterxml.jackson.core.JsonToken.START_OBJECT;
import static com.fasterxml.jackson.core.JsonToken.VALUE_NULL;

import com.fasterxml.jackson.core.JsonToken;
import com.ksc.offline.model.CreateTasklResult;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

public class OfflineCreateTaskResultJsonUnmarshaller
		implements Unmarshaller<CreateTasklResult, JsonUnmarshallerContext> {

	public CreateTasklResult unmarshall(JsonUnmarshallerContext context) throws Exception {
		// TODO Auto-generated method stub
		CreateTasklResult createTasklResult = new CreateTasklResult();
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
				if (context.testExpression("taskid", targetDepth)) {
					context.nextToken();
					createTasklResult.setTaskid((context.getUnmarshaller(String.class).unmarshall(context)));
				} else if (context.testExpression("errNum", targetDepth)) {
					context.nextToken();
					createTasklResult.setErrNum((context.getUnmarshaller(Integer.class).unmarshall(context)));
				} else if (context.testExpression("errMsg", targetDepth)) {
					context.nextToken();
					createTasklResult.setErrMsg((context.getUnmarshaller(String.class).unmarshall(context)));
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
		return createTasklResult;
	}

	private static OfflineCreateTaskResultJsonUnmarshaller instance;

	public static OfflineCreateTaskResultJsonUnmarshaller getInstance() {
		if (instance == null)
			instance = new OfflineCreateTaskResultJsonUnmarshaller();
		return instance;
	}

}
