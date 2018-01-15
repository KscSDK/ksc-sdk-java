package com.ksc.ket.model.transform;

import static com.fasterxml.jackson.core.JsonToken.END_ARRAY;
import static com.fasterxml.jackson.core.JsonToken.END_OBJECT;
import static com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
import static com.fasterxml.jackson.core.JsonToken.START_OBJECT;
import static com.fasterxml.jackson.core.JsonToken.VALUE_NULL;

import com.fasterxml.jackson.core.JsonToken;
import com.ksc.ket.model.PresetList;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

public class PresetListJsonUnmarshaller implements Unmarshaller<PresetList, JsonUnmarshallerContext> {
	public PresetList unmarshall(JsonUnmarshallerContext context) throws Exception {
		PresetList presetList = new PresetList();
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

				if (context.testExpression("Preset", targetDepth)) {
					context.nextToken();
					presetList.setPreset(context.getUnmarshaller(String.class).unmarshall(context));
				} else if (context.testExpression("FmtNum", targetDepth)) {
					context.nextToken();
					presetList.setFmtNum(context.getUnmarshaller(String.class).unmarshall(context));
				} else if (context.testExpression("Description", targetDepth)) {
					context.nextToken();
					presetList.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
				} else if (context.testExpression("CreateTime", targetDepth)) {
					context.nextToken();
					presetList.setCreateTime(context.getUnmarshaller(String.class).unmarshall(context));
				} else if (context.testExpression("App", targetDepth)) {
					context.nextToken();
					presetList.setApp(context.getUnmarshaller(String.class).unmarshall(context));
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
		return presetList;
	}

	private static PresetListJsonUnmarshaller instance;

	public static PresetListJsonUnmarshaller getInstance() {
		if (instance == null)
			instance = new PresetListJsonUnmarshaller();
		return instance;
	}
}
