package com.ksc.epc.model.transform;

import static com.fasterxml.jackson.core.JsonToken.END_ARRAY;
import static com.fasterxml.jackson.core.JsonToken.END_OBJECT;
import static com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
import static com.fasterxml.jackson.core.JsonToken.START_OBJECT;
import static com.fasterxml.jackson.core.JsonToken.VALUE_NULL;

import com.ksc.transform.ListUnmarshaller;
import com.fasterxml.jackson.core.JsonToken;
import com.ksc.epc.model.EpcHost;
import com.ksc.epc.model.ListEpcsResult;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

/**
 * ListEpcResult JSON Unmarshaller
 */
public class ListEpcsResultJsonUnmarshaller implements Unmarshaller<ListEpcsResult, JsonUnmarshallerContext> {

	public ListEpcsResult unmarshall(JsonUnmarshallerContext context) throws Exception {
		ListEpcsResult result = new ListEpcsResult();
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
				if (context.testExpression("EpcHostSet", targetDepth)) {
					context.nextToken();
					result.setEpcHostSet(
							new ListUnmarshaller<EpcHost>(EpcHostJsonUnmarshaller.getInstance()).unmarshall(context));
				} else if (context.testExpression("RequestId", targetDepth)) {
					context.nextToken();
					result.setRequestId(context.getUnmarshaller(String.class).unmarshall(context));
				} else if (context.testExpression("TotalCount", targetDepth)) {
					context.nextToken();
					result.setTotalCount(context.getUnmarshaller(Integer.class).unmarshall(context));
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

	private static ListEpcsResultJsonUnmarshaller instance;

	public static ListEpcsResultJsonUnmarshaller getInstance() {
		if (instance == null)
			instance = new ListEpcsResultJsonUnmarshaller();
		return instance;
	}
}
