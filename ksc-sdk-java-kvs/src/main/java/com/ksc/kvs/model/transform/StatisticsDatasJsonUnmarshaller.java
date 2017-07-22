package com.ksc.kvs.model.transform;

import static com.fasterxml.jackson.core.JsonToken.END_ARRAY;
import static com.fasterxml.jackson.core.JsonToken.END_OBJECT;
import static com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
import static com.fasterxml.jackson.core.JsonToken.START_OBJECT;
import static com.fasterxml.jackson.core.JsonToken.VALUE_NULL;

import com.fasterxml.jackson.core.JsonToken;
import com.ksc.kvs.model.StatisticsDatas;
import com.ksc.kvs.model.StatisticsTypes;
import com.ksc.kvs.model.StatisticsVCodecs;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.ListUnmarshaller;
import com.ksc.transform.Unmarshaller;

public class StatisticsDatasJsonUnmarshaller 
	implements Unmarshaller<StatisticsDatas, JsonUnmarshallerContext> {

	public StatisticsDatas unmarshall(JsonUnmarshallerContext context) throws Exception {
			StatisticsDatas statisticsDatas = new StatisticsDatas();
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

					if (context.testExpression("VCodecs", targetDepth)) {
						context.nextToken();
						statisticsDatas.setVCodecs(
								new ListUnmarshaller<StatisticsVCodecs>(StatisticsVCodecsJsonUnmarshaller.getInstance())
										.unmarshall(context));
					} else if (context.testExpression("Types", targetDepth)) {
						context.nextToken();
						statisticsDatas.setTypes(
								new ListUnmarshaller<StatisticsTypes>(StatisticsTypesJsonUnmarshaller.getInstance())
										.unmarshall(context));
					} else if (context.testExpression("Number", targetDepth)) {
						context.nextToken();
						statisticsDatas.setNumber((context.getUnmarshaller(Integer.class).unmarshall(context)));
					} else if (context.testExpression("TimeStamp", targetDepth)) {
						context.nextToken();
						statisticsDatas.setTimeStamp((context.getUnmarshaller(String.class).unmarshall(context)));
					} else if (context.testExpression("Duration", targetDepth)) {
						context.nextToken();
						statisticsDatas.setDuration((context.getUnmarshaller(Integer.class).unmarshall(context)));
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
			return statisticsDatas;
		}

		private static StatisticsDatasJsonUnmarshaller instance;

		public static StatisticsDatasJsonUnmarshaller getInstance() {
			if (instance == null)
				instance = new StatisticsDatasJsonUnmarshaller();
			return instance;
		}


}
