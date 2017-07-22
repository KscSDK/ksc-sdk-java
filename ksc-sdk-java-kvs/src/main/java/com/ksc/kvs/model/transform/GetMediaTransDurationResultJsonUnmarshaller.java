package com.ksc.kvs.model.transform;

import static com.fasterxml.jackson.core.JsonToken.END_ARRAY;
import static com.fasterxml.jackson.core.JsonToken.END_OBJECT;
import static com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
import static com.fasterxml.jackson.core.JsonToken.START_OBJECT;
import static com.fasterxml.jackson.core.JsonToken.VALUE_NULL;

import com.fasterxml.jackson.core.JsonToken;
import com.ksc.kvs.model.GetMediaTransDurationResult;
import com.ksc.kvs.model.StatisticsDatas;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.ListUnmarshaller;
import com.ksc.transform.Unmarshaller;

public class GetMediaTransDurationResultJsonUnmarshaller
		implements Unmarshaller<GetMediaTransDurationResult, JsonUnmarshallerContext> {

	public GetMediaTransDurationResult unmarshall(JsonUnmarshallerContext context) throws Exception {
		GetMediaTransDurationResult statisticsRequest = new GetMediaTransDurationResult();
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

				if (context.testExpression("Datas", targetDepth)) {
					context.nextToken();
					statisticsRequest.setDatas(
							new ListUnmarshaller<StatisticsDatas>(StatisticsDatasJsonUnmarshaller.getInstance())
									.unmarshall(context));
				} else if (context.testExpression("ErrNum", targetDepth)) {
					context.nextToken();
					statisticsRequest.setErrNum((context.getUnmarshaller(Integer.class).unmarshall(context)));
				} else if (context.testExpression("ErrMsg", targetDepth)) {
					context.nextToken();
					statisticsRequest.setErrMsg((context.getUnmarshaller(String.class).unmarshall(context)));
				} else if (context.testExpression("StartUnixTime", targetDepth)) {
					context.nextToken();
					statisticsRequest.setStartUnixTime((context.getUnmarshaller(String.class).unmarshall(context)));
				} else if (context.testExpression("EndUnixTime", targetDepth)) {
					context.nextToken();
					statisticsRequest.setEndUnixTime((context.getUnmarshaller(String.class).unmarshall(context)));
				} else if (context.testExpression("Granularity", targetDepth)) {
					context.nextToken();
					statisticsRequest.setGranularity((context.getUnmarshaller(String.class).unmarshall(context)));
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
		return statisticsRequest;
	}

	private static GetMediaTransDurationResultJsonUnmarshaller instance;

	public static GetMediaTransDurationResultJsonUnmarshaller getInstance() {
		if (instance == null)
			instance = new GetMediaTransDurationResultJsonUnmarshaller();
		return instance;
	}
}
