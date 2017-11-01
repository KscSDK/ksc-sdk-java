package com.ksc.kvs.model.transform;

import static com.fasterxml.jackson.core.JsonToken.END_ARRAY;
import static com.fasterxml.jackson.core.JsonToken.END_OBJECT;
import static com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
import static com.fasterxml.jackson.core.JsonToken.START_OBJECT;
import static com.fasterxml.jackson.core.JsonToken.VALUE_NULL;

import com.fasterxml.jackson.core.JsonToken;
import com.ksc.kvs.model.FlowDataInfo;
import com.ksc.kvs.model.SrcInfo;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.ListUnmarshaller;
import com.ksc.transform.Unmarshaller;

public class FlowDataInfoListJsonUnmarshaller implements Unmarshaller<FlowDataInfo, JsonUnmarshallerContext> {

	public FlowDataInfo unmarshall(JsonUnmarshallerContext context) throws Exception {
		FlowDataInfo flowDataInfo = new FlowDataInfo();
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
					flowDataInfo.setPreset(context.getUnmarshaller(String.class).unmarshall(context));
				} else if (context.testExpression("DstBucket", targetDepth)) {
					context.nextToken();
					flowDataInfo.setDstBucket(context.getUnmarshaller(String.class).unmarshall(context));
				} else if (context.testExpression("DstDir", targetDepth)) {
					context.nextToken();
					flowDataInfo.setDstDir(context.getUnmarshaller(String.class).unmarshall(context));
				} else if (context.testExpression("DstObjectKey", targetDepth)) {
					context.nextToken();
					flowDataInfo.setDstObjectKey(context.getUnmarshaller(String.class).unmarshall(context));
				} else if (context.testExpression("SrcInfo", targetDepth)) {
					context.nextToken();
					flowDataInfo.setSrcInfoList(new ListUnmarshaller<SrcInfo>(SrcInfoListJsonUnmarshaller.getInstance())
							.unmarshall(context));
				} else if (context.testExpression("DstAcl", targetDepth)) {
					context.nextToken();
					flowDataInfo.setDstAcl(context.getUnmarshaller(String.class).unmarshall(context));
				} else if (context.testExpression("ExtParam", targetDepth)) {
					context.nextToken();
					flowDataInfo.setExtParam(context.getUnmarshaller(String.class).unmarshall(context));
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
		return flowDataInfo;
	}

	private static FlowDataInfoListJsonUnmarshaller instance;

	public static FlowDataInfoListJsonUnmarshaller getInstance() {
		if (instance == null)
			instance = new FlowDataInfoListJsonUnmarshaller();
		return instance;
	}
}
