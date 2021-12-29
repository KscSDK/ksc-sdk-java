package com.ksc.krds.transform.krdsInstance;

import com.fasterxml.jackson.core.JsonToken;
import com.ksc.krds.model.RdsResponse;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import static com.fasterxml.jackson.core.JsonToken.*;

public class ModifyDBNetworkUnmarshaller implements Unmarshaller<RdsResponse, JsonUnmarshallerContext> {

    public RdsResponse unmarshall(JsonUnmarshallerContext context) throws Exception {
        RdsResponse result = new RdsResponse();
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

    private static ListKrdsResponseJsonUnmarshaller instance;

    public static ListKrdsResponseJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ListKrdsResponseJsonUnmarshaller();
        return instance;
    }
}
