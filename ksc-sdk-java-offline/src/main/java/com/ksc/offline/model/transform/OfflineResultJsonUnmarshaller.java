package com.ksc.offline.model.transform;

import static com.fasterxml.jackson.core.JsonToken.END_ARRAY;
import static com.fasterxml.jackson.core.JsonToken.END_OBJECT;
import static com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
import static com.fasterxml.jackson.core.JsonToken.START_OBJECT;
import static com.fasterxml.jackson.core.JsonToken.VALUE_NULL;

import com.fasterxml.jackson.core.JsonToken;
import com.ksc.offline.model.OfflineResult;
import com.ksc.offline.model.Preset;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.ListUnmarshaller;
import com.ksc.transform.Unmarshaller;

/**
 * DescribeAddressesResult JSON Unmarshaller
 */
public class OfflineResultJsonUnmarshaller implements
        Unmarshaller<OfflineResult, JsonUnmarshallerContext> {

    public OfflineResult unmarshall(JsonUnmarshallerContext context)
            throws Exception {
    	OfflineResult offlineRequest = new OfflineResult();
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

                if (context.testExpression("presetList", targetDepth)) {
                	context.nextToken();
                	offlineRequest
                            .setPresetList(new ListUnmarshaller<Preset>(PresetListJsonUnmarshaller.getInstance()).unmarshall(context));
                }else if(context.testExpression("errNum", targetDepth)){
                    context.nextToken();
                    offlineRequest.setErrNum((context.getUnmarshaller(Integer.class).unmarshall(context)));
                }else if(context.testExpression("errMsg", targetDepth)){
                    context.nextToken();
                    offlineRequest.setErrMsg((context.getUnmarshaller(String.class).unmarshall(context)));
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
		return offlineRequest;
    }

    private static OfflineResultJsonUnmarshaller instance;

    public static OfflineResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new OfflineResultJsonUnmarshaller();
        return instance;
    }
}
