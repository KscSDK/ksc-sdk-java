package com.ksc.ket.model.transform;

import static com.fasterxml.jackson.core.JsonToken.END_ARRAY;
import static com.fasterxml.jackson.core.JsonToken.END_OBJECT;
import static com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
import static com.fasterxml.jackson.core.JsonToken.START_OBJECT;
import static com.fasterxml.jackson.core.JsonToken.VALUE_NULL;

import com.fasterxml.jackson.core.JsonToken;
import com.ksc.ket.model.GetStreamTranListResult;
import com.ksc.ket.model.TranList;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.ListUnmarshaller;
import com.ksc.transform.Unmarshaller;

public class GetStreamTranListResultJsonUnmarshaller
		implements Unmarshaller<GetStreamTranListResult, JsonUnmarshallerContext> {

	public GetStreamTranListResult unmarshall(JsonUnmarshallerContext context) throws Exception {
		GetStreamTranListResult getStreamTranListResult = new GetStreamTranListResult();
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

				if (context.testExpression("TranList", targetDepth)) {
					context.nextToken();
					getStreamTranListResult.setTranList(
							new ListUnmarshaller<TranList>(TranListJsonUnmarshaller.getInstance()).unmarshall(context));
				} else if (context.testExpression("ErrNum", targetDepth)) {
					context.nextToken();
					getStreamTranListResult.setErrNum((context.getUnmarshaller(Integer.class).unmarshall(context)));
				} else if (context.testExpression("ErrMsg", targetDepth)) {
					context.nextToken();
					getStreamTranListResult.setErrMsg((context.getUnmarshaller(String.class).unmarshall(context)));
				} else if (context.testExpression("ListCount", targetDepth)) {
					context.nextToken();
					getStreamTranListResult.setListCount((context.getUnmarshaller(Integer.class).unmarshall(context)));
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
		return getStreamTranListResult;
	}

	private static GetStreamTranListResultJsonUnmarshaller instance;

	public static GetStreamTranListResultJsonUnmarshaller getInstance() {
		if (instance == null)
			instance = new GetStreamTranListResultJsonUnmarshaller();
		return instance;
	}
}
