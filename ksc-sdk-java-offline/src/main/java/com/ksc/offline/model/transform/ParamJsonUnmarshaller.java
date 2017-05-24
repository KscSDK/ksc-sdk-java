package com.ksc.offline.model.transform;

import static com.fasterxml.jackson.core.JsonToken.END_ARRAY;
import static com.fasterxml.jackson.core.JsonToken.END_OBJECT;
import static com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
import static com.fasterxml.jackson.core.JsonToken.START_OBJECT;
import static com.fasterxml.jackson.core.JsonToken.VALUE_NULL;

import com.fasterxml.jackson.core.JsonToken;
import com.ksc.offline.model.Audio;
import com.ksc.offline.model.DetailPreset;
import com.ksc.offline.model.Image;
import com.ksc.offline.model.Param;
import com.ksc.offline.model.Preset;
import com.ksc.offline.model.Video;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.ListUnmarshaller;
import com.ksc.transform.Unmarshaller;

public class ParamJsonUnmarshaller implements Unmarshaller<Param, JsonUnmarshallerContext>{
	
	public Param unmarshall(JsonUnmarshallerContext context) throws Exception {
		Param param= new Param();
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
				
				if (context.testExpression("f", targetDepth)) {
					context.nextToken();
					param.setF(context.getUnmarshaller(String.class).unmarshall(context));
				} else if (context.testExpression("VIDEO", targetDepth)) {
					context.nextToken();
					param.setVideo(VideoJsonUnmarshaller.getInstance().unmarshall(context));
				} else if (context.testExpression("AUDIO", targetDepth)) {
					context.nextToken();
					param.setAudio(AudioJsonUnmarshaller.getInstance().unmarshall(context));
				} else if (context.testExpression("IMAGE", targetDepth)){
					context.nextToken();
					param.setImage(new ListUnmarshaller<Image>(ImageJsonUnmarshaller.getInstance()).unmarshall(context));
				} else if (context.testExpression("width", targetDepth)){
					context.nextToken();
					param.setWidth(context.getUnmarshaller(Integer.class).unmarshall(context));
				} else if (context.testExpression("height", targetDepth)){
					context.nextToken();
					param.setHeight(context.getUnmarshaller(Integer.class).unmarshall(context));
				} else if (context.testExpression("interval", targetDepth)){
					context.nextToken();
					param.setInterval(context.getUnmarshaller(Integer.class).unmarshall(context));
				} else if (context.testExpression("hlsTime", targetDepth)){
					context.nextToken();
					param.setHlsTime(context.getUnmarshaller(Integer.class).unmarshall(context));
				} else if (context.testExpression("clearmeta", targetDepth)){
					context.nextToken();
					param.setClearmeta(context.getUnmarshaller(Integer.class).unmarshall(context));
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
		return param;
	}

	private static ParamJsonUnmarshaller instance;

	public static ParamJsonUnmarshaller getInstance() {
		if (instance == null)
			instance = new ParamJsonUnmarshaller();
		return instance;
	}

}
