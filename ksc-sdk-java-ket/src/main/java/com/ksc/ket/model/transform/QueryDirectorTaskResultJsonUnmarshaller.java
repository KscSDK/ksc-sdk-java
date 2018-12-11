package com.ksc.ket.model.transform;

import static com.fasterxml.jackson.core.JsonToken.END_ARRAY;
import static com.fasterxml.jackson.core.JsonToken.END_OBJECT;
import static com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
import static com.fasterxml.jackson.core.JsonToken.START_OBJECT;
import static com.fasterxml.jackson.core.JsonToken.VALUE_NULL;

import com.fasterxml.jackson.core.JsonToken;
import com.ksc.ket.model.DstInfo;
import com.ksc.ket.model.Output;
import com.ksc.ket.model.QueryDirectorTaskResult;
import com.ksc.ket.model.SrcInfo;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.ListUnmarshaller;
import com.ksc.transform.Unmarshaller;

public class QueryDirectorTaskResultJsonUnmarshaller
		implements Unmarshaller<QueryDirectorTaskResult, JsonUnmarshallerContext> {

	public QueryDirectorTaskResult unmarshall(JsonUnmarshallerContext context) throws Exception {
		QueryDirectorTaskResult result = new QueryDirectorTaskResult();
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
					result.setSrcInfo(
							new ListUnmarshaller<SrcInfo>(SrcInfoJsonUnmarshaller.getInstance()).unmarshall(context));
				} else if (context.testExpression("DstInfo", targetDepth)) {
					context.nextToken();
					result.setDstInfo(
							new ListUnmarshaller<DstInfo>(DstInfoJsonUnmarshaller.getInstance()).unmarshall(context));
				} else if (context.testExpression("Output", targetDepth)) {
					context.nextToken();
					result.setOutput(
							new ListUnmarshaller<Output>(OutputJsonUnmarshaller.getInstance()).unmarshall(context));
				} else if (context.testExpression("ErrNum", targetDepth)) {
					context.nextToken();
					result.setErrNum((context.getUnmarshaller(Integer.class).unmarshall(context)));
				} else if (context.testExpression("ErrMsg", targetDepth)) {
					context.nextToken();
					result.setErrMsg((context.getUnmarshaller(String.class).unmarshall(context)));
				} else if (context.testExpression("TaskStatus", targetDepth)) {
					context.nextToken();
					result.setTaskStatus((context.getUnmarshaller(String.class).unmarshall(context)));
				} else if (context.testExpression("Preset", targetDepth)) {
					context.nextToken();
					result.setPreset((context.getUnmarshaller(String.class).unmarshall(context)));
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

	private static QueryDirectorTaskResultJsonUnmarshaller instance;

	public static QueryDirectorTaskResultJsonUnmarshaller getInstance() {
		if (instance == null)
			instance = new QueryDirectorTaskResultJsonUnmarshaller();
		return instance;
	}
}
