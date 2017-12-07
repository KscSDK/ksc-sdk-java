package com.ksc.kvs.model.transform;

import static com.fasterxml.jackson.core.JsonToken.END_ARRAY;
import static com.fasterxml.jackson.core.JsonToken.END_OBJECT;
import static com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
import static com.fasterxml.jackson.core.JsonToken.START_OBJECT;
import static com.fasterxml.jackson.core.JsonToken.VALUE_NULL;

import com.fasterxml.jackson.core.JsonToken;
import com.ksc.kvs.model.StatisticsTypes;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

public class StatisticsTypesJsonUnmarshaller implements Unmarshaller<StatisticsTypes, JsonUnmarshallerContext> {

	public StatisticsTypes unmarshall(JsonUnmarshallerContext context) throws Exception {
		StatisticsTypes statisticsTypes = new StatisticsTypes();
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

				if (context.testExpression("Type", targetDepth)) {
					context.nextToken();
					statisticsTypes.setType((context.getUnmarshaller(String.class).unmarshall(context)));
				} else if (context.testExpression("Number", targetDepth)) {
					context.nextToken();
					statisticsTypes.setNumber((context.getUnmarshaller(Integer.class).unmarshall(context)));
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
		return statisticsTypes;
	}

	private static StatisticsTypesJsonUnmarshaller instance;

	public static StatisticsTypesJsonUnmarshaller getInstance() {
		if (instance == null)
			instance = new StatisticsTypesJsonUnmarshaller();
		return instance;
	}

}
