package com.ksc.ket.model.transform;

import static com.fasterxml.jackson.core.JsonToken.END_ARRAY;
import static com.fasterxml.jackson.core.JsonToken.END_OBJECT;
import static com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
import static com.fasterxml.jackson.core.JsonToken.START_OBJECT;
import static com.fasterxml.jackson.core.JsonToken.VALUE_NULL;

import com.fasterxml.jackson.core.JsonToken;
import com.ksc.ket.model.Switch;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

public class SwitchJsonUnmarshaller implements Unmarshaller<Switch, JsonUnmarshallerContext> {
	public Switch unmarshall(JsonUnmarshallerContext context) throws Exception {
		Switch _switch = new Switch();
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
				if (context.testExpression("sn", targetDepth)) {
					context.nextToken();
					_switch.setSn(context.getUnmarshaller(Integer.class).unmarshall(context));
				} else if (context.testExpression("sm", targetDepth)) {
					context.nextToken();
					_switch.setSm(context.getUnmarshaller(Integer.class).unmarshall(context));
				} else if (context.testExpression("hv", targetDepth)) {
					context.nextToken();
					_switch.setHv(context.getUnmarshaller(Integer.class).unmarshall(context));
				} else if (context.testExpression("mv", targetDepth)) {
					context.nextToken();
					_switch.setMv(context.getUnmarshaller(Integer.class).unmarshall(context));
				} else if (context.testExpression("un", targetDepth)) {
					context.nextToken();
					_switch.setUn(context.getUnmarshaller(Integer.class).unmarshall(context));
				} else if (context.testExpression("od", targetDepth)) {
					context.nextToken();
					_switch.setOd(context.getUnmarshaller(Integer.class).unmarshall(context));
				} else if (context.testExpression("bu", targetDepth)) {
					context.nextToken();
					_switch.setBu(context.getUnmarshaller(Integer.class).unmarshall(context));
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
		return _switch;
	}

	private static SwitchJsonUnmarshaller instance;

	public static SwitchJsonUnmarshaller getInstance() {
		if (instance == null)
			instance = new SwitchJsonUnmarshaller();
		return instance;
	}
}
