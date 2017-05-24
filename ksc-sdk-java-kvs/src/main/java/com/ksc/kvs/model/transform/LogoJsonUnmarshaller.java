package com.ksc.kvs.model.transform;

import static com.fasterxml.jackson.core.JsonToken.END_ARRAY;
import static com.fasterxml.jackson.core.JsonToken.END_OBJECT;
import static com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
import static com.fasterxml.jackson.core.JsonToken.START_OBJECT;
import static com.fasterxml.jackson.core.JsonToken.VALUE_NULL;

import com.fasterxml.jackson.core.JsonToken;
import com.ksc.kvs.model.Logo;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

public class LogoJsonUnmarshaller implements Unmarshaller<Logo, JsonUnmarshallerContext> {
	public Logo unmarshall(JsonUnmarshallerContext context) throws Exception {
		Logo logoList = new Logo();
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

				if (context.testExpression("url", targetDepth)) {
					context.nextToken();
					logoList.setUrl(context.getUnmarshaller(String.class).unmarshall(context));
				} else if (context.testExpression("offsetX", targetDepth)) {
					context.nextToken();
					logoList.setOffsetX(context.getUnmarshaller(Integer.class).unmarshall(context));
				} else if (context.testExpression("offsetY", targetDepth)) {
					context.nextToken();
					logoList.setOffsetY(context.getUnmarshaller(Integer.class).unmarshall(context));
				} else if (context.testExpression("logotype", targetDepth)) {
					context.nextToken();
					logoList.setLogotype(context.getUnmarshaller(String.class).unmarshall(context));
				} else if (context.testExpression("usage_scenario", targetDepth)) {
					context.nextToken();
					logoList.setUsage_scenario(context.getUnmarshaller(String.class).unmarshall(context));
				} else if (context.testExpression("effect_objects", targetDepth)) {
					context.nextToken();
					logoList.setEffect_objects(context.getUnmarshaller(String.class).unmarshall(context));
				} else if (context.testExpression("shortSide", targetDepth)) {
					context.nextToken();
					logoList.setShortSide(context.getUnmarshaller(Integer.class).unmarshall(context));
				} else if (context.testExpression("disable_scale", targetDepth)) {
					context.nextToken();
					logoList.setDisable_scale(context.getUnmarshaller(Integer.class).unmarshall(context));
				} else if (context.testExpression("ss", targetDepth)) {
					context.nextToken();
					logoList.setSs(context.getUnmarshaller(Integer.class).unmarshall(context));
				} else if (context.testExpression("duration", targetDepth)) {
					context.nextToken();
					logoList.setDuration(context.getUnmarshaller(Integer.class).unmarshall(context));
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
		return logoList;
	}

	private static LogoJsonUnmarshaller instance;

	public static LogoJsonUnmarshaller getInstance() {
		if (instance == null)
			instance = new LogoJsonUnmarshaller();
		return instance;
	}
}
