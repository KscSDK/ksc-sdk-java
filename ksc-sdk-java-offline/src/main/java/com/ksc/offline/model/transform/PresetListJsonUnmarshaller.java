package com.ksc.offline.model.transform;

import static com.fasterxml.jackson.core.JsonToken.END_ARRAY;
import static com.fasterxml.jackson.core.JsonToken.END_OBJECT;
import static com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
import static com.fasterxml.jackson.core.JsonToken.START_OBJECT;
import static com.fasterxml.jackson.core.JsonToken.VALUE_NULL;

import com.fasterxml.jackson.core.JsonToken;
import com.ksc.offline.model.Preset;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

/**
 * PresetLiset JSON Preset
 */
public class PresetListJsonUnmarshaller implements Unmarshaller<Preset, JsonUnmarshallerContext> {

	public Preset unmarshall(JsonUnmarshallerContext context) throws Exception {
		Preset preset = new Preset();
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
				
				if (context.testExpression("preset", targetDepth)) {
					context.nextToken();
					preset.setPreset(context.getUnmarshaller(String.class).unmarshall(context));
				} else if (context.testExpression("presettype", targetDepth)) {
					context.nextToken();
					preset.setPresetType(context.getUnmarshaller(String.class).unmarshall(context));
				} else if (context.testExpression("description", targetDepth)) {
					context.nextToken();
					preset.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
				} else if (context.testExpression("createTime", targetDepth)) {
					context.nextToken();
					preset.setCreateTime(context.getUnmarshaller(String.class).unmarshall(context));
				} else if (context.testExpression("updateTime", targetDepth)) {
					context.nextToken();
					preset.setUpdateTime(context.getUnmarshaller(String.class).unmarshall(context));
				} else if (context.testExpression("param", targetDepth)) {
					context.nextToken();
					preset.setParam(ParamJsonUnmarshaller.getInstance().unmarshall(context));
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
		return preset;
	}

	private static PresetListJsonUnmarshaller instance;

	public static PresetListJsonUnmarshaller getInstance() {
		if (instance == null)
			instance = new PresetListJsonUnmarshaller();
		return instance;
	}
}
