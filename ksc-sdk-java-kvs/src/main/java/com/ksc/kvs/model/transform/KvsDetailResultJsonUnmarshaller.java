package com.ksc.kvs.model.transform;

import static com.fasterxml.jackson.core.JsonToken.END_ARRAY;
import static com.fasterxml.jackson.core.JsonToken.END_OBJECT;
import static com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
import static com.fasterxml.jackson.core.JsonToken.START_OBJECT;
import static com.fasterxml.jackson.core.JsonToken.VALUE_NULL;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import com.fasterxml.jackson.core.JsonToken;
import com.ksc.kvs.model.DetailPreset;
import com.ksc.kvs.model.GetPresetDetailResult;
import com.ksc.kvs.model.KvsResult;
import com.ksc.kvs.model.Preset;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.ListUnmarshaller;
import com.ksc.transform.Unmarshaller;

public class KvsDetailResultJsonUnmarshaller implements
Unmarshaller<GetPresetDetailResult, JsonUnmarshallerContext>{

	public GetPresetDetailResult unmarshall(JsonUnmarshallerContext context)
            throws Exception {
		GetPresetDetailResult getPresetDetailResult = new GetPresetDetailResult();
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

                if (context.testExpression("PresetDetail", targetDepth)) {
                	context.nextToken();
                	getPresetDetailResult
                            .setPresetDetail(DetailPresetJsonUnmarshaller.getInstance().unmarshall(context));
                }else 
                if(context.testExpression("ErrNum", targetDepth)){
                    context.nextToken();
                    getPresetDetailResult.setErrNum((context.getUnmarshaller(Integer.class).unmarshall(context)));
                }else if(context.testExpression("ErrMsg", targetDepth)){
                    context.nextToken();
                    getPresetDetailResult.setErrMsg((context.getUnmarshaller(String.class).unmarshall(context)));
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
		return getPresetDetailResult;
    }

    private static KvsDetailResultJsonUnmarshaller instance;

    public static KvsDetailResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new KvsDetailResultJsonUnmarshaller();
        return instance;
    }
}
