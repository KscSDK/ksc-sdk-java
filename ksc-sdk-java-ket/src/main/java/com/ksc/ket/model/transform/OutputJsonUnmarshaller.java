package com.ksc.ket.model.transform;

import static com.fasterxml.jackson.core.JsonToken.END_ARRAY;
import static com.fasterxml.jackson.core.JsonToken.END_OBJECT;
import static com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
import static com.fasterxml.jackson.core.JsonToken.START_OBJECT;
import static com.fasterxml.jackson.core.JsonToken.VALUE_NULL;

import com.fasterxml.jackson.core.JsonToken;
import com.ksc.ket.model.Amix;
import com.ksc.ket.model.Output;
import com.ksc.ket.model.Overlay;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.ListUnmarshaller;
import com.ksc.transform.Unmarshaller;

public class OutputJsonUnmarshaller implements Unmarshaller<Output, JsonUnmarshallerContext> {
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
				} else if (context.testExpression("Video", targetDepth)) {
					context.nextToken();
					output.setVideo(VideoJsonUnmarshaller.getInstance().unmarshall(context));
				} else if (context.testExpression("Audio", targetDepth)) {
					context.nextToken();
					output.setAudio(AudioJsonUnmarshaller.getInstance().unmarshall(context));
				} else if (context.testExpression("Overlay", targetDepth)) {
					context.nextToken();
					output.setOverlay(
							new ListUnmarshaller<Overlay>(OverlayJsonUnmarshaller.getInstance()).unmarshall(context));
				} else if (context.testExpression("Amix", targetDepth)) {
					context.nextToken();
					output.setAmix(new ListUnmarshaller<Amix>(AmixJsonUnmarshaller.getInstance()).unmarshall(context));
				} else if (context.testExpression("Index", targetDepth)) {
					context.nextToken();
					output.setIndex(context.getUnmarshaller(Integer.class).unmarshall(context));
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

	private static OutputJsonUnmarshaller instance;

	public static OutputJsonUnmarshaller getInstance() {
		if (instance == null)
			instance = new OutputJsonUnmarshaller();
		return instance;
	}
}
