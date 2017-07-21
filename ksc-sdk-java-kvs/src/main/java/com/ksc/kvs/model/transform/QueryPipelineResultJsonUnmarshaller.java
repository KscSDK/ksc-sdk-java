package com.ksc.kvs.model.transform;

import static com.fasterxml.jackson.core.JsonToken.END_ARRAY;
import static com.fasterxml.jackson.core.JsonToken.END_OBJECT;
import static com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
import static com.fasterxml.jackson.core.JsonToken.START_OBJECT;
import static com.fasterxml.jackson.core.JsonToken.VALUE_NULL;

import com.fasterxml.jackson.core.JsonToken;
import com.ksc.kvs.model.QueryPipelineResult;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

public class QueryPipelineResultJsonUnmarshaller implements Unmarshaller<QueryPipelineResult, JsonUnmarshallerContext> {

	public QueryPipelineResult unmarshall(JsonUnmarshallerContext context) throws Exception {
		// TODO Auto-generated method stub
		QueryPipelineResult queryPipelineResult = new QueryPipelineResult();
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

				if (context.testExpression("TaskStatus", targetDepth)) {
					context.nextToken();
					queryPipelineResult.setTaskStatus(TaskStatusJsonUnmarshaller.getInstance().unmarshall(context));
				} else if (context.testExpression("ErrNum", targetDepth)) {
					context.nextToken();
					queryPipelineResult.setErrNum((context.getUnmarshaller(Integer.class).unmarshall(context)));
				} else if (context.testExpression("ErrMsg", targetDepth)) {
					context.nextToken();
					queryPipelineResult.setErrMsg((context.getUnmarshaller(String.class).unmarshall(context)));
				} else if (context.testExpression("Description", targetDepth)) {
					context.nextToken();
					queryPipelineResult.setDescription((context.getUnmarshaller(String.class).unmarshall(context)));
				} else if (context.testExpression("State", targetDepth)) {
					context.nextToken();
					queryPipelineResult.setState((context.getUnmarshaller(String.class).unmarshall(context)));
				} else if (context.testExpression("RegularStart", targetDepth)) {
					context.nextToken();
					queryPipelineResult.setRegularStart((context.getUnmarshaller(String.class).unmarshall(context)));
				} else if (context.testExpression("RegularDuration", targetDepth)) {
					context.nextToken();
					queryPipelineResult
							.setRegularDuration((context.getUnmarshaller(Integer.class).unmarshall(context)));
				} else if (context.testExpression("Quota", targetDepth)) {
					context.nextToken();
					queryPipelineResult.setQuota((context.getUnmarshaller(Integer.class).unmarshall(context)));
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
		return queryPipelineResult;
	}

	private static QueryPipelineResultJsonUnmarshaller instance;

	public static QueryPipelineResultJsonUnmarshaller getInstance() {
		if (instance == null)
			instance = new QueryPipelineResultJsonUnmarshaller();
		return instance;
	}

}
