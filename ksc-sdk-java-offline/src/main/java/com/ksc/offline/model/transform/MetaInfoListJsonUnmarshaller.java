package com.ksc.offline.model.transform;

import static com.fasterxml.jackson.core.JsonToken.END_ARRAY;
import static com.fasterxml.jackson.core.JsonToken.END_OBJECT;
import static com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
import static com.fasterxml.jackson.core.JsonToken.START_OBJECT;
import static com.fasterxml.jackson.core.JsonToken.VALUE_NULL;

import com.fasterxml.jackson.core.JsonToken;
import com.ksc.offline.model.MetaInfo;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

public class MetaInfoListJsonUnmarshaller implements Unmarshaller<MetaInfo, JsonUnmarshallerContext> {

	public MetaInfo unmarshall(JsonUnmarshallerContext context) throws Exception {
		MetaInfo metaInfo = new MetaInfo();
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

				if (context.testExpression("taskid", targetDepth)) {
					context.nextToken();
					metaInfo.setTaskid(context.getUnmarshaller(String.class).unmarshall(context));
				} else if (context.testExpression("metaInfo", targetDepth)) {
					context.nextToken();
					metaInfo.setMetaInfo(context.getUnmarshaller(String.class).unmarshall(context));
				} else if (context.testExpression("createTime", targetDepth)) {
					context.nextToken();
					metaInfo.setCreateTime(context.getUnmarshaller(String.class).unmarshall(context));
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
		return metaInfo;
	}

	private static MetaInfoListJsonUnmarshaller instance;

	public static MetaInfoListJsonUnmarshaller getInstance() {
		if (instance == null)
			instance = new MetaInfoListJsonUnmarshaller();
		return instance;
	}

}
