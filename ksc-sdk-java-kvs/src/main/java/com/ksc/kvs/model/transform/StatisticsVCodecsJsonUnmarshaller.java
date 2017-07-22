package com.ksc.kvs.model.transform;

import static com.fasterxml.jackson.core.JsonToken.END_ARRAY;
import static com.fasterxml.jackson.core.JsonToken.END_OBJECT;
import static com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
import static com.fasterxml.jackson.core.JsonToken.START_OBJECT;
import static com.fasterxml.jackson.core.JsonToken.VALUE_NULL;

import com.fasterxml.jackson.core.JsonToken;
import com.ksc.kvs.model.StatisticsDatas;
import com.ksc.kvs.model.StatisticsResolutions;
import com.ksc.kvs.model.StatisticsTypes;
import com.ksc.kvs.model.StatisticsVCodecs;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.ListUnmarshaller;
import com.ksc.transform.Unmarshaller;

public class StatisticsVCodecsJsonUnmarshaller 
implements Unmarshaller<StatisticsVCodecs, JsonUnmarshallerContext> {

public StatisticsVCodecs unmarshall(JsonUnmarshallerContext context) throws Exception {
	StatisticsVCodecs statisticsVCodecs = new StatisticsVCodecs();
		int originalDepth = context.getCurrentDepth();
		String currentParentElement = context.getCurrentParentElement();
		int targetDepth = originalDepth + 1;
		System.out.println(context);
		JsonToken token = context.getCurrentToken();
		if (token == null)
			token = context.nextToken();
		if (token == VALUE_NULL)
			return null;

		while (true) {
			if (token == null)
				break;

			if (token == FIELD_NAME || token == START_OBJECT) {

				if (context.testExpression("Resolutions", targetDepth)) {
					context.nextToken();
					statisticsVCodecs.setResolutions(
							new ListUnmarshaller<StatisticsResolutions>(StatisticsResolutionsJsonUnmarshaller.getInstance())
									.unmarshall(context));
			
				} else if (context.testExpression("VCodec", targetDepth)) {
					context.nextToken();
					statisticsVCodecs.setVCodec((context.getUnmarshaller(String.class).unmarshall(context)));
				} else if (context.testExpression("Duration", targetDepth)) {
					context.nextToken();
					statisticsVCodecs.setDuration((context.getUnmarshaller(Integer.class).unmarshall(context)));
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
		return statisticsVCodecs;
	}

	private static StatisticsVCodecsJsonUnmarshaller instance;

	public static StatisticsVCodecsJsonUnmarshaller getInstance() {
		if (instance == null)
			instance = new StatisticsVCodecsJsonUnmarshaller();
		return instance;
	}


}
