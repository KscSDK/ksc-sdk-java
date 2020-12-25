package com.ksc.epc.model.transform;

import com.ksc.epc.model.ModifyResourceRequirementResult;
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
 * ModifyResourceRequirementResult Json Unmarshaller
 */
public class ModifyResourceRequirementResultJsonUnmarshaller implements Unmarshaller<ModifyResourceRequirementResult, JsonUnmarshallerContext> {
    @Override
    public ModifyResourceRequirementResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        ModifyResourceRequirementResult modifyResourceRequirementResult = new ModifyResourceRequirementResult();
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
                            modifyResourceRequirementResult.setRequestId(context.getUnmarshaller(String.class).unmarshall(context));
                    }
                    if (context.testExpression("Return", targetDepth)) {
                    context.nextToken();
                            modifyResourceRequirementResult.setReturn(context.getUnmarshaller(Boolean.class).unmarshall(context));
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
        return modifyResourceRequirementResult;
    }

    private static ModifyResourceRequirementResultJsonUnmarshaller instance;

    public static ModifyResourceRequirementResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ModifyResourceRequirementResultJsonUnmarshaller();
        return instance;
    }
}
