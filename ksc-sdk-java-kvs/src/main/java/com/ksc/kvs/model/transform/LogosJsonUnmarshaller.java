package com.ksc.kvs.model.transform;

import com.fasterxml.jackson.core.JsonToken;
import com.ksc.kvs.model.Logo;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.ListUnmarshaller;
import com.ksc.transform.Unmarshaller;

import java.util.ArrayList;
import java.util.List;

import static com.fasterxml.jackson.core.JsonToken.*;

public class LogosJsonUnmarshaller implements Unmarshaller<List<Logo>, JsonUnmarshallerContext> {
	public List<Logo> unmarshall(JsonUnmarshallerContext context) throws Exception {
		List<Logo> logoList = new ArrayList<Logo>();
		int originalDepth = context.getCurrentDepth();
		String currentParentElement = context.getCurrentParentElement();
		JsonToken token = context.getCurrentToken();
		if (token == null)
			token = context.nextToken();
		if (token == VALUE_NULL)
			return null;
		while (true) {
			if (token == null)
				break;
			if (token == START_ARRAY) {
				logoList = new ListUnmarshaller<Logo>(LogoJsonUnmarshaller.getInstance()).unmarshall(context);
				break;
			} else if (token == END_ARRAY || token == END_OBJECT) {
				if (context.getLastParsedParentElement() == null
						|| context.getLastParsedParentElement().equals(currentParentElement)) {
					if (context.getCurrentDepth() <= originalDepth)
						break;
				}
			}
			token = context.nextToken();
		}
		return logoList;
	}

	private static LogosJsonUnmarshaller instance;

	public static LogosJsonUnmarshaller getInstance() {
		if (instance == null)
			instance = new LogosJsonUnmarshaller();
		return instance;
	}
}
