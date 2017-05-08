package com.ksc.ket.model.transform;

import static com.fasterxml.jackson.core.JsonToken.END_ARRAY;
import static com.fasterxml.jackson.core.JsonToken.END_OBJECT;
import static com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
import static com.fasterxml.jackson.core.JsonToken.START_OBJECT;
import static com.fasterxml.jackson.core.JsonToken.VALUE_NULL;

import com.fasterxml.jackson.core.JsonToken;
import com.ksc.ket.model.Logo;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

public class LogoListJsonUnmarshaller implements Unmarshaller<Logo, JsonUnmarshallerContext>{
	public Logo unmarshall(JsonUnmarshallerContext context) throws Exception {
		Logo logo = new Logo();
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
				
				if (context.testExpression("pic", targetDepth)) {
					context.nextToken();
					logo.setPic(context.getUnmarshaller(String.class).unmarshall(context));
				} else if (context.testExpression("usage_scenario", targetDepth)) {
					context.nextToken();
					logo.setUsage_scenario(context.getUnmarshaller(String.class).unmarshall(context));
				}else if (context.testExpression("optimal_w", targetDepth)) {
					context.nextToken();
					logo.setOptimal_w(context.getUnmarshaller(Integer.class).unmarshall(context));
				}else if (context.testExpression("optimal_h", targetDepth)) {
					context.nextToken();
					logo.setOptimal_h(context.getUnmarshaller(Integer.class).unmarshall(context));
				} else if (context.testExpression("short_side", targetDepth)) {
					context.nextToken();
					logo.setShort_side(context.getUnmarshaller(int.class).unmarshall(context));
				} else if (context.testExpression("disable_scale", targetDepth)) {
					context.nextToken();
					logo.setDisable_scale(context.getUnmarshaller(int.class).unmarshall(context));
				} else if (context.testExpression("short_side", targetDepth)) {
					context.nextToken();
					logo.setShort_side(context.getUnmarshaller(int.class).unmarshall(context));
				} else if (context.testExpression("offsetX", targetDepth)) {
					context.nextToken();
					logo.setOffsetX(context.getUnmarshaller(int.class).unmarshall(context));
				} else if (context.testExpression("offsetY", targetDepth)) {
					context.nextToken();
					logo.setOffsetY(context.getUnmarshaller(int.class).unmarshall(context));
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
		return logo;
	}
	
	private static LogoListJsonUnmarshaller instance;

	public static LogoListJsonUnmarshaller getInstance() {
		if (instance == null)
			instance = new LogoListJsonUnmarshaller();
		return instance;
	}
}
