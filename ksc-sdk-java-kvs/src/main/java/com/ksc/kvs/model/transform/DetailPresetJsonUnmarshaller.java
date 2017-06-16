package com.ksc.kvs.model.transform;

import static com.fasterxml.jackson.core.JsonToken.END_ARRAY;
import static com.fasterxml.jackson.core.JsonToken.END_OBJECT;
import static com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
import static com.fasterxml.jackson.core.JsonToken.START_OBJECT;
import static com.fasterxml.jackson.core.JsonToken.VALUE_NULL;

import com.fasterxml.jackson.core.JsonToken;
import com.ksc.kvs.model.DetailPreset;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

public class DetailPresetJsonUnmarshaller implements Unmarshaller<DetailPreset, JsonUnmarshallerContext>{
	
	public DetailPreset unmarshall(JsonUnmarshallerContext context) throws Exception {
		DetailPreset detailPreset= new DetailPreset();
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
				
				if (context.testExpression("PresetType", targetDepth) || context.testExpression("Presettype", targetDepth)) {
					context.nextToken();
					detailPreset.setPresetType(context.getUnmarshaller(String.class).unmarshall(context));
				} else if (context.testExpression("Param", targetDepth)) {
					context.nextToken();
					detailPreset.setParam(ParamJsonUnmarshaller.getInstance().unmarshall(context));
				} 
				else if (context.testExpression("Description", targetDepth)) {
					context.nextToken();
					detailPreset.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
				} else if (context.testExpression("CreateTime", targetDepth)) {
					context.nextToken();
					detailPreset.setCreateTime(context.getUnmarshaller(String.class).unmarshall(context));
				} else if (context.testExpression("UpdateTime", targetDepth)) {
					context.nextToken();
					detailPreset.setUpdateTime(context.getUnmarshaller(String.class).unmarshall(context));
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
		return detailPreset;
	}

	private static DetailPresetJsonUnmarshaller instance;

	public static DetailPresetJsonUnmarshaller getInstance() {
		if (instance == null)
			instance = new DetailPresetJsonUnmarshaller();
		return instance;
	}
}
