package com.ksc.kvs.model.transform;

import static com.fasterxml.jackson.core.JsonToken.END_ARRAY;
import static com.fasterxml.jackson.core.JsonToken.END_OBJECT;
import static com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
import static com.fasterxml.jackson.core.JsonToken.START_OBJECT;
import static com.fasterxml.jackson.core.JsonToken.VALUE_NULL;

import com.fasterxml.jackson.core.JsonToken;
import com.ksc.kvs.model.TaskStatus;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

public class TaskStatusJsonUnmarshaller implements Unmarshaller<TaskStatus, JsonUnmarshallerContext> {

	public TaskStatus unmarshall(JsonUnmarshallerContext context) throws Exception {
		TaskStatus taskStatus = new TaskStatus();
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

				if (context.testExpression("Total", targetDepth)) {
					context.nextToken();
					taskStatus.setTotal(context.getUnmarshaller(Integer.class).unmarshall(context));
				} else if (context.testExpression("Running", targetDepth)) {
					context.nextToken();
					taskStatus.setRunning(context.getUnmarshaller(Integer.class).unmarshall(context));
				} else if (context.testExpression("Pending", targetDepth)) {
					context.nextToken();
					taskStatus.setPending(context.getUnmarshaller(Integer.class).unmarshall(context));
				} else if (context.testExpression("Success", targetDepth)) {
					context.nextToken();
					taskStatus.setSuccess(context.getUnmarshaller(Integer.class).unmarshall(context));
				} else if (context.testExpression("Failed", targetDepth)) {
					context.nextToken();
					taskStatus.setFailed(context.getUnmarshaller(Integer.class).unmarshall(context));
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
		return taskStatus;
	}

	private static TaskStatusJsonUnmarshaller instance;

	public static TaskStatusJsonUnmarshaller getInstance() {
		if (instance == null)
			instance = new TaskStatusJsonUnmarshaller();
		return instance;
	}
}
