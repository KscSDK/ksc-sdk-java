package com.ksc.kvs.model.transform;

import static com.fasterxml.jackson.core.JsonToken.END_ARRAY;
import static com.fasterxml.jackson.core.JsonToken.END_OBJECT;
import static com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
import static com.fasterxml.jackson.core.JsonToken.START_OBJECT;
import static com.fasterxml.jackson.core.JsonToken.VALUE_NULL;

import com.fasterxml.jackson.core.JsonToken;
import com.ksc.kvs.model.StatisticsResolutions;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

public class StatisticsResolutionsJsonUnmarshaller
		implements Unmarshaller<StatisticsResolutions, JsonUnmarshallerContext> {

	public StatisticsResolutions unmarshall(JsonUnmarshallerContext context) throws Exception {
		StatisticsResolutions statisticsResolutions = new StatisticsResolutions();
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

				if (context.testExpression("ResolutionType", targetDepth)) {
					context.nextToken();
					statisticsResolutions
							.setResolutionType((context.getUnmarshaller(String.class).unmarshall(context)));
				} else if (context.testExpression("Duration", targetDepth)) {
					context.nextToken();
					statisticsResolutions.setDuration((context.getUnmarshaller(Integer.class).unmarshall(context)));
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
		return statisticsResolutions;
	}

	private static StatisticsResolutionsJsonUnmarshaller instance;

	public static StatisticsResolutionsJsonUnmarshaller getInstance() {
		if (instance == null)
			instance = new StatisticsResolutionsJsonUnmarshaller();
		return instance;
	}

}
