package com.ksc.ket.model.transform;

import static com.fasterxml.jackson.core.JsonToken.END_ARRAY;
import static com.fasterxml.jackson.core.JsonToken.END_OBJECT;
import static com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
import static com.fasterxml.jackson.core.JsonToken.START_OBJECT;
import static com.fasterxml.jackson.core.JsonToken.VALUE_NULL;

import com.fasterxml.jackson.core.JsonToken;
import com.ksc.ket.model.Output;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

public class OutputListJsonUnmarshaller implements Unmarshaller<Output, JsonUnmarshallerContext> {

	public Output unmarshall(JsonUnmarshallerContext context) throws Exception {
		Output output = new Output();
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

				if (context.testExpression("format", targetDepth)) {
					context.nextToken();
					output.setFormat(FormatJsonUnmarshaller.getInstance().unmarshall(context));
				} else if (context.testExpression("switch", targetDepth)) {
					context.nextToken();
					output.setSwitch(SwitchJsonUnmarshaller.getInstance().unmarshall(context));
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
		return output;
	}

	private static OutputListJsonUnmarshaller instance;

	public static OutputListJsonUnmarshaller getInstance() {
		if (instance == null)
			instance = new OutputListJsonUnmarshaller();
		return instance;
	}
}
