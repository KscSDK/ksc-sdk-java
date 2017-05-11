package com.ksc.ket.model.transform;

import static com.fasterxml.jackson.core.JsonToken.END_ARRAY;
import static com.fasterxml.jackson.core.JsonToken.END_OBJECT;
import static com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
import static com.fasterxml.jackson.core.JsonToken.START_OBJECT;
import static com.fasterxml.jackson.core.JsonToken.VALUE_NULL;

import com.fasterxml.jackson.core.JsonToken;
import com.ksc.ket.model.Format;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

public class FormatJsonUnmarshaller implements Unmarshaller<Format, JsonUnmarshallerContext> {
	public Format unmarshall(JsonUnmarshallerContext context) throws Exception {
		Format format = new Format();
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

				if (context.testExpression("stream_transform_tag", targetDepth)) {
					context.nextToken();
					format.setStream_transform_tag(context.getUnmarshaller(Integer.class).unmarshall(context));
				} else if (context.testExpression("output_format", targetDepth)) {
					context.nextToken();
					format.setOutput_format(context.getUnmarshaller(Integer.class).unmarshall(context));
				} else if (context.testExpression("vbr", targetDepth)) {
					context.nextToken();
					format.setVbr(context.getUnmarshaller(Integer.class).unmarshall(context));
				} else if (context.testExpression("abr", targetDepth)) {
					context.nextToken();
					format.setAbr(context.getUnmarshaller(Integer.class).unmarshall(context));
				} else if (context.testExpression("fr", targetDepth)) {
					context.nextToken();
					format.setFr(context.getUnmarshaller(Integer.class).unmarshall(context));
				} else if (context.testExpression("remuxflag", targetDepth)) {
					context.nextToken();
					format.setRemuxflag(context.getUnmarshaller(Integer.class).unmarshall(context));
				} else if (context.testExpression("exstream", targetDepth)) {
					context.nextToken();
					format.setExstream(context.getUnmarshaller(String.class).unmarshall(context));
				} else if (context.testExpression("logo_switch", targetDepth)) {
					context.nextToken();
					format.setLogo_switch(context.getUnmarshaller(Integer.class).unmarshall(context));
				} else if (context.testExpression("gop", targetDepth)) {
					context.nextToken();
					format.setGop(context.getUnmarshaller(Integer.class).unmarshall(context));
				} else if (context.testExpression("suffix", targetDepth)) {
					context.nextToken();
					format.setSuffix(context.getUnmarshaller(String.class).unmarshall(context));
				} else if (context.testExpression("hlsBandwidth", targetDepth)) {
					context.nextToken();
					format.setHlsBandwidth(context.getUnmarshaller(Integer.class).unmarshall(context));
				} else if (context.testExpression("disableScenecutSwitch", targetDepth)) {
					context.nextToken();
					format.setDisableScenecutSwitch(context.getUnmarshaller(Integer.class).unmarshall(context));
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
		return format;
	}

	private static FormatJsonUnmarshaller instance;

	public static FormatJsonUnmarshaller getInstance() {
		if (instance == null)
			instance = new FormatJsonUnmarshaller();
		return instance;
	}
}
