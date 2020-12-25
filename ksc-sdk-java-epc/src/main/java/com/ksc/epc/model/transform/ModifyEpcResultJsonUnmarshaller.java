package com.ksc.epc.model.transform;

import com.ksc.epc.model.ModifyEpcResult;
import com.fasterxml.jackson.core.JsonToken;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.Unmarshaller;
import com.ksc.transform.ListUnmarshaller;
import static com.fasterxml.jackson.core.JsonToken.END_ARRAY;
import static com.fasterxml.jackson.core.JsonToken.END_OBJECT;
import static com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
import static com.fasterxml.jackson.core.JsonToken.START_OBJECT;
import static com.fasterxml.jackson.core.JsonToken.VALUE_NULL;

/**
 * ModifyEpcResult Json Unmarshaller
 */
public class ModifyEpcResultJsonUnmarshaller implements Unmarshaller<ModifyEpcResult, JsonUnmarshallerContext> {
    @Override
    public ModifyEpcResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        ModifyEpcResult modifyEpcResult = new ModifyEpcResult();
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
                    if (context.testExpression("RequestId", targetDepth)) {
                    context.nextToken();
                            modifyEpcResult.setRequestId(context.getUnmarshaller(String.class).unmarshall(context));
                    }
                    if (context.testExpression("Return", targetDepth)) {
                    context.nextToken();
                            modifyEpcResult.setReturn(context.getUnmarshaller(Boolean.class).unmarshall(context));
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
        return modifyEpcResult;
    }

    private static ModifyEpcResultJsonUnmarshaller instance;

    public static ModifyEpcResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ModifyEpcResultJsonUnmarshaller();
        return instance;
    }
}
