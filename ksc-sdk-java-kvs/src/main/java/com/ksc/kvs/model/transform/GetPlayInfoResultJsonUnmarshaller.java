package com.ksc.kvs.model.transform;

import com.fasterxml.jackson.core.JsonToken;
import com.ksc.kvs.model.GetPlayInfoResult;
import com.ksc.kvs.model.PlayInfo;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.ListUnmarshaller;
import com.ksc.transform.Unmarshaller;

import static com.fasterxml.jackson.core.JsonToken.*;

public class GetPlayInfoResultJsonUnmarshaller
		implements Unmarshaller<GetPlayInfoResult, JsonUnmarshallerContext> {

	public GetPlayInfoResult unmarshall(JsonUnmarshallerContext context) throws Exception {
		// TODO Auto-generated method stub
		GetPlayInfoResult getPlayInfoResult = new GetPlayInfoResult();
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

				if (context.testExpression("RequestId", targetDepth)) {
					context.nextToken();
					getPlayInfoResult.setRequestId((context.getUnmarshaller(String.class).unmarshall(context)));
				} else if (context.testExpression("VideoBase", targetDepth)) {
					context.nextToken();
					getPlayInfoResult.setVideoBase(VideoBaseJsonUnmarshaller.getInstance().unmarshall(context));
				} else if (context.testExpression("PlayInfoList", targetDepth)) {
					context.nextToken();
					getPlayInfoResult.setPlayInfoList(new ListUnmarshaller<PlayInfo>(PlayInfoListJsonUnmarshaller.getInstance())
							.unmarshall(context));
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
		return getPlayInfoResult;
	}

	private static GetPlayInfoResultJsonUnmarshaller instance;

	public static GetPlayInfoResultJsonUnmarshaller getInstance() {
		if (instance == null)
			instance = new GetPlayInfoResultJsonUnmarshaller();
		return instance;
	}

}
