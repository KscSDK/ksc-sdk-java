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

public class LogoListJsonUnmarshaller implements Unmarshaller<Logo, JsonUnmarshallerContext> {
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
				} else if (context.testExpression("offsetX", targetDepth)) {
					context.nextToken();
					logo.setOffsetX(context.getUnmarshaller(Integer.class).unmarshall(context));
				} else if (context.testExpression("offsetY", targetDepth)) {
					context.nextToken();
					logo.setOffsetY(context.getUnmarshaller(Integer.class).unmarshall(context));
				} else if (context.testExpression("logotype", targetDepth)) {
					context.nextToken();
					logo.setLogotype(context.getUnmarshaller(String.class).unmarshall(context));
				} else if (context.testExpression("usage_scenario", targetDepth)) {
					context.nextToken();
					logo.setUsage_scenario(context.getUnmarshaller(String.class).unmarshall(context));
				} else if (context.testExpression("effect_objects", targetDepth)) {
					context.nextToken();
					logo.setEffect_objects(context.getUnmarshaller(String.class).unmarshall(context));
				} else if (context.testExpression("shortSide", targetDepth)) {
					context.nextToken();
					logo.setShortSide(context.getUnmarshaller(Integer.class).unmarshall(context));
				} else if (context.testExpression("disable_scale", targetDepth)) {
					context.nextToken();
					logo.setDisable_scale(context.getUnmarshaller(Integer.class).unmarshall(context));
				} else if (context.testExpression("ss", targetDepth)) {
					context.nextToken();
					logo.setSs(context.getUnmarshaller(Integer.class).unmarshall(context));
				} else if (context.testExpression("duration", targetDepth)) {
					context.nextToken();
					logo.setDuration(context.getUnmarshaller(Integer.class).unmarshall(context));
				} else if (context.testExpression("optimal_w", targetDepth)) {
					context.nextToken();
					logo.setOptimal_w(context.getUnmarshaller(Integer.class).unmarshall(context));
				} else if (context.testExpression("optimal_h", targetDepth)) {
					context.nextToken();
					logo.setOptimal_h(context.getUnmarshaller(Integer.class).unmarshall(context));
				} else if (context.testExpression("loop", targetDepth)) {
					context.nextToken();
					logo.setLoop(context.getUnmarshaller(Integer.class).unmarshall(context));
				} else if (context.testExpression("referPos", targetDepth)) {
					context.nextToken();
					logo.setReferPos(context.getUnmarshaller(String.class).unmarshall(context));
				} else if (context.testExpression("width", targetDepth)) {
					context.nextToken();
					logo.setWidth(context.getUnmarshaller(String.class).unmarshall(context));
				} else if (context.testExpression("height", targetDepth)) {
					context.nextToken();
					logo.setHeight(context.getUnmarshaller(String.class).unmarshall(context));
				} else if (context.testExpression("dx", targetDepth)) {
					context.nextToken();
					logo.setDx(context.getUnmarshaller(String.class).unmarshall(context));
				} else if (context.testExpression("dy", targetDepth)) {
					context.nextToken();
					logo.setDy(context.getUnmarshaller(String.class).unmarshall(context));
				} else if (context.testExpression("opacity", targetDepth)) {
					context.nextToken();
					logo.setOpacity(context.getUnmarshaller(String.class).unmarshall(context));
				} else if (context.testExpression("pic_url", targetDepth)) {
					context.nextToken();
					logo.setPic_url(context.getUnmarshaller(String.class).unmarshall(context));
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
