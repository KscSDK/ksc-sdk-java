package com.ksc.ket.model.transform;

import static com.fasterxml.jackson.core.JsonToken.END_ARRAY;
import static com.fasterxml.jackson.core.JsonToken.END_OBJECT;
import static com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
import static com.fasterxml.jackson.core.JsonToken.START_OBJECT;
import static com.fasterxml.jackson.core.JsonToken.VALUE_NULL;

import com.fasterxml.jackson.core.JsonToken;
import com.ksc.ket.model.Amix;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

public class AmixJsonUnmarshaller implements Unmarshaller<Amix, JsonUnmarshallerContext> {
	public Amix unmarshall(JsonUnmarshallerContext context) throws Exception {
		Amix amix = new Amix();
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

				if (context.testExpression("inputIdx", targetDepth)) {
					context.nextToken();
					amix.setInputIdx(context.getUnmarshaller(Integer.class).unmarshall(context));
				} else if (context.testExpression("trackIdx", targetDepth)) {
					context.nextToken();
					amix.setTrackIdx(context.getUnmarshaller(Integer.class).unmarshall(context));
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
		return amix;
	}

	private static AmixJsonUnmarshaller instance;

	public static AmixJsonUnmarshaller getInstance() {
		if (instance == null)
			instance = new AmixJsonUnmarshaller();
		return instance;
	}
}
