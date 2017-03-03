package com.ksc.kvs.model.transform;

import static com.fasterxml.jackson.core.JsonToken.END_ARRAY;
import static com.fasterxml.jackson.core.JsonToken.END_OBJECT;
import static com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
import static com.fasterxml.jackson.core.JsonToken.START_OBJECT;
import static com.fasterxml.jackson.core.JsonToken.VALUE_NULL;

import com.fasterxml.jackson.core.JsonToken;
import com.ksc.kvs.model.SrcInfo;
import com.ksc.kvs.model.TaskInfo;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.ListUnmarshaller;
import com.ksc.transform.Unmarshaller;

public class SrcInfoListJsonUnmarshaller implements Unmarshaller<SrcInfo, JsonUnmarshallerContext>{
	
	public SrcInfo unmarshall(JsonUnmarshallerContext context) throws Exception {
		SrcInfo srcinfo = new SrcInfo();
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
				
				if (context.testExpression("path", targetDepth)) {
					context.nextToken();
					srcinfo.setPath(context.getUnmarshaller(String.class).unmarshall(context));
				} else if (context.testExpression("index", targetDepth)) {
					context.nextToken();
					srcinfo.setIndex(context.getUnmarshaller(Integer.class).unmarshall(context));
				} else if (context.testExpression("type", targetDepth)) {
					context.nextToken();
					srcinfo.setType(context.getUnmarshaller(String.class).unmarshall(context));
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
		return srcinfo;
	}

	private static SrcInfoListJsonUnmarshaller instance;

	public static SrcInfoListJsonUnmarshaller getInstance() {
		if (instance == null)
			instance = new SrcInfoListJsonUnmarshaller();
		return instance;
	}
}
