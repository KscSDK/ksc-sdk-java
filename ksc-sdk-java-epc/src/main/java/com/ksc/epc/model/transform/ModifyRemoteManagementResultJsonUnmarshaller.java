package com.ksc.epc.model.transform;

import com.ksc.epc.model.ModifyRemoteManagementResult;
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
 * ModifyRemoteManagementResult Json Unmarshaller
 */
public class ModifyRemoteManagementResultJsonUnmarshaller implements Unmarshaller<ModifyRemoteManagementResult, JsonUnmarshallerContext> {
    @Override
    public ModifyRemoteManagementResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        ModifyRemoteManagementResult modifyRemoteManagementResult = new ModifyRemoteManagementResult();
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
                            modifyRemoteManagementResult.setRequestId(context.getUnmarshaller(String.class).unmarshall(context));
                    }
                    if (context.testExpression("RemoteManagement", targetDepth)) {
                    context.nextToken();
                        modifyRemoteManagementResult.setRemoteManagement(RemoteManagementJsonUnmarshaller.getInstance().unmarshall(context));
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
        return modifyRemoteManagementResult;
    }

    private static ModifyRemoteManagementResultJsonUnmarshaller instance;

    public static ModifyRemoteManagementResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ModifyRemoteManagementResultJsonUnmarshaller();
        return instance;
    }
}
