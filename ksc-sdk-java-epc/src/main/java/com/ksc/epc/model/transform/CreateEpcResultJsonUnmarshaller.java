package com.ksc.epc.model.transform;

import com.ksc.epc.model.CreateEpcResult;
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
 * CreateEpcResult Json Unmarshaller
 */
public class CreateEpcResultJsonUnmarshaller implements Unmarshaller<CreateEpcResult, JsonUnmarshallerContext> {
    @Override
    public CreateEpcResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        CreateEpcResult createEpcResult = new CreateEpcResult();
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
                            createEpcResult.setRequestId(context.getUnmarshaller(String.class).unmarshall(context));
                    }
                    if (context.testExpression("Host", targetDepth)) {
                    context.nextToken();
                        createEpcResult.setHost(HostJsonUnmarshaller.getInstance().unmarshall(context));
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
        return createEpcResult;
    }

    private static CreateEpcResultJsonUnmarshaller instance;

    public static CreateEpcResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CreateEpcResultJsonUnmarshaller();
        return instance;
    }
}
