package com.ksc.ket.model.transform;

import static com.fasterxml.jackson.core.JsonToken.END_ARRAY;
import static com.fasterxml.jackson.core.JsonToken.END_OBJECT;
import static com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
import static com.fasterxml.jackson.core.JsonToken.START_OBJECT;
import static com.fasterxml.jackson.core.JsonToken.VALUE_NULL;
import com.fasterxml.jackson.core.JsonToken;
import com.ksc.ket.model.Output;
import com.ksc.ket.model.PresetDetail;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.ListUnmarshaller;
import com.ksc.transform.Unmarshaller;

public class PresetDetailJsonUnmarshaller implements Unmarshaller<PresetDetail, JsonUnmarshallerContext> {

	public PresetDetail unmarshall(JsonUnmarshallerContext context) throws Exception {
		PresetDetail presetDetail = new PresetDetail();
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

				if (context.testExpression("CreateTime", targetDepth)) {
					context.nextToken();
					presetDetail.setCreateTime(context.getUnmarshaller(String.class).unmarshall(context));
				} else if (context.testExpression("Description", targetDepth)) {
					context.nextToken();
					presetDetail.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
				} else if (context.testExpression("Output", targetDepth)) {
					context.nextToken();
					presetDetail.setOutputList(
							new ListUnmarshaller<Output>(OutputListJsonUnmarshaller.getInstance()).unmarshall(context));
				} else if (context.testExpression("Video", targetDepth)) {
					context.nextToken();
					presetDetail.setVideo(VideoJsonUnmarshaller.getInstance().unmarshall(context));
				} else if (context.testExpression("Audio", targetDepth)) {
					context.nextToken();
					presetDetail.setAudio(AudioJsonUnmarshaller.getInstance().unmarshall(context));
				} else if (context.testExpression("HlsMbr", targetDepth)) {
					context.nextToken();
					presetDetail.setHlsMbr(HlsMbrJsonUnmarshaller.getInstance().unmarshall(context));
				} else if (context.testExpression("IntelligentSwtich", targetDepth)) {
					context.nextToken();
					presetDetail.setIntelligentSwitch(context.getUnmarshaller(Integer.class).unmarshall(context));
				} else if (context.testExpression("IntelligentCburl", targetDepth)) {
					context.nextToken();
					presetDetail.setIntelligentCburl(context.getUnmarshaller(String.class).unmarshall(context));
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
		return presetDetail;
	}

	private static PresetDetailJsonUnmarshaller instance;

	public static PresetDetailJsonUnmarshaller getInstance() {
		if (instance == null)
			instance = new PresetDetailJsonUnmarshaller();
		return instance;
	}
}
