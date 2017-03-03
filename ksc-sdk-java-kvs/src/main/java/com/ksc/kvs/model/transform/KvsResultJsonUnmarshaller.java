package com.ksc.kvs.model.transform;

import static com.fasterxml.jackson.core.JsonToken.END_ARRAY;
import static com.fasterxml.jackson.core.JsonToken.END_OBJECT;
import static com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
import static com.fasterxml.jackson.core.JsonToken.START_OBJECT;
import static com.fasterxml.jackson.core.JsonToken.VALUE_NULL;

import com.fasterxml.jackson.core.JsonToken;
import com.ksc.kvs.model.KvsResult;
import com.ksc.kvs.model.Preset;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.ListUnmarshaller;
import com.ksc.transform.Unmarshaller;

/**
 * DescribeAddressesResult JSON Unmarshaller
 */
public class KvsResultJsonUnmarshaller implements
        Unmarshaller<KvsResult, JsonUnmarshallerContext> {

    public KvsResult unmarshall(JsonUnmarshallerContext context)
            throws Exception {
    	KvsResult kvsRequest = new KvsResult();
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

                if (context.testExpression("PresetList", targetDepth)) {
                	context.nextToken();
                	kvsRequest
                            .setPresetList(new ListUnmarshaller<Preset>(PresetListJsonUnmarshaller.getInstance()).unmarshall(context));
                }else if(context.testExpression("ErrNum", targetDepth)){
                    context.nextToken();
                    kvsRequest.setErrNum((context.getUnmarshaller(Integer.class).unmarshall(context)));
                }else if(context.testExpression("ErrMsg", targetDepth)){
                    context.nextToken();
                    kvsRequest.setErrMsg((context.getUnmarshaller(String.class).unmarshall(context)));
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
		return kvsRequest;
    }

    private static KvsResultJsonUnmarshaller instance;

    public static KvsResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new KvsResultJsonUnmarshaller();
        return instance;
    }
}
