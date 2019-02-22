package com.ksc.krds.transform.krdsInstance;

import com.fasterxml.jackson.core.JsonToken;
import com.ksc.krds.model.krdsInstance.CreateKrdsResponse;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import static com.fasterxml.jackson.core.JsonToken.*;
import static com.fasterxml.jackson.core.JsonToken.END_OBJECT;

public class CreateKrdsResponseJsonUnmarshaller implements Unmarshaller<CreateKrdsResponse, JsonUnmarshallerContext> {
    public CreateKrdsResponse unmarshall(JsonUnmarshallerContext context) throws Exception {
        CreateKrdsResponse result = new CreateKrdsResponse();
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
                if (context.testExpression("DBInstance", targetDepth+1)) {
                    context.nextToken();
                    result.getData().setDBInstance(KrdsInstanceJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("RequestId", targetDepth)) {
                    context.nextToken();
                    result.setRequestId(context.getUnmarshaller(String.class).unmarshall(context));
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

        return result;
    }

    private static CreateKrdsResponseJsonUnmarshaller instance;

    public static CreateKrdsResponseJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CreateKrdsResponseJsonUnmarshaller();
        return instance;
    }
}