package com.ksc.offline.model.transform;

import static com.fasterxml.jackson.core.JsonToken.END_ARRAY;
import static com.fasterxml.jackson.core.JsonToken.END_OBJECT;
import static com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
import static com.fasterxml.jackson.core.JsonToken.START_OBJECT;
import static com.fasterxml.jackson.core.JsonToken.VALUE_NULL;

import com.fasterxml.jackson.core.JsonToken;
import com.ksc.offline.model.ExtParam;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

public class ExtParamJsonUnmarshaller implements Unmarshaller<ExtParam, JsonUnmarshallerContext> {
	public ExtParam unmarshall(JsonUnmarshallerContext context) throws Exception {
		ExtParam extParam = new ExtParam();
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

				if (context.testExpression("ss", targetDepth)) {
					context.nextToken();
					extParam.setSs(context.getUnmarshaller(String.class).unmarshall(context));
				} else if (context.testExpression("duration", targetDepth)) {
					context.nextToken();
					extParam.setDuration(context.getUnmarshaller(Integer.class).unmarshall(context));
				} else if (context.testExpression("hls_segment_filename", targetDepth)) {
					context.nextToken();
					extParam.setHlsSegmentFilename(context.getUnmarshaller(String.class).unmarshall(context));
				} else if (context.testExpression("pattern", targetDepth)) {
					context.nextToken();
					extParam.setPattern(context.getUnmarshaller(String.class).unmarshall(context));
				} else if (context.testExpression("ts_acl", targetDepth)) {
					context.nextToken();
					extParam.setTsAcl(context.getUnmarshaller(String.class).unmarshall(context));
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
		return extParam;
	}

	private static ExtParamJsonUnmarshaller instance;

	public static ExtParamJsonUnmarshaller getInstance() {
		if (instance == null)
			instance = new ExtParamJsonUnmarshaller();
		return instance;
	}
}
