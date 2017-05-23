package com.ksc.offline.model.transform;

import static com.fasterxml.jackson.core.JsonToken.END_ARRAY;
import static com.fasterxml.jackson.core.JsonToken.END_OBJECT;
import static com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
import static com.fasterxml.jackson.core.JsonToken.START_OBJECT;
import static com.fasterxml.jackson.core.JsonToken.VALUE_NULL;

import com.fasterxml.jackson.core.JsonToken;
import com.ksc.offline.model.GetTaskByTaskIDResult;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

public class GetTaskByTaskIDResultJsonUnmarshaller
		implements Unmarshaller<GetTaskByTaskIDResult, JsonUnmarshallerContext> {

	public GetTaskByTaskIDResult unmarshall(JsonUnmarshallerContext context) throws Exception {
		// TODO Auto-generated method stub
		GetTaskByTaskIDResult getTaskByTaskIDResult = new GetTaskByTaskIDResult();
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

				if (context.testExpression("taskInfo", targetDepth)) {
					context.nextToken();
					getTaskByTaskIDResult.setTaskInfo(TaskInfoListJsonUnmarshaller.getInstance().unmarshall(context));
				} else if (context.testExpression("errNum", targetDepth)) {
					context.nextToken();
					getTaskByTaskIDResult.setErrNum((context.getUnmarshaller(Integer.class).unmarshall(context)));
				} else if (context.testExpression("errMsg", targetDepth)) {
					context.nextToken();
					getTaskByTaskIDResult.setErrMsg((context.getUnmarshaller(String.class).unmarshall(context)));
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
		return getTaskByTaskIDResult;
	}

	private static GetTaskByTaskIDResultJsonUnmarshaller instance;

	public static GetTaskByTaskIDResultJsonUnmarshaller getInstance() {
		if (instance == null)
			instance = new GetTaskByTaskIDResultJsonUnmarshaller();
		return instance;
	}

}
