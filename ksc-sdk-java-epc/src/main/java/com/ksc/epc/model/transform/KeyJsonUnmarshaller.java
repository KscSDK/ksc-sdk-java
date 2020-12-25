package com.ksc.epc.model.transform;

import com.ksc.epc.model.Key;
import com.fasterxml.jackson.core.JsonToken;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.Unmarshaller;
import com.ksc.transform.ListUnmarshaller;
import static com.fasterxml.jackson.core.JsonToken.END_ARRAY;
import static com.fasterxml.jackson.core.JsonToken.END_OBJECT;
import static com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
import static com.fasterxml.jackson.core.JsonToken.START_OBJECT;
import static com.fasterxml.jackson.core.JsonToken.VALUE_NULL;

public class KeyJsonUnmarshaller implements Unmarshaller<Key, JsonUnmarshallerContext> {
    private static KeyJsonUnmarshaller instance;

    public static KeyJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new KeyJsonUnmarshaller();
        return instance;
    }

    @Override
    public Key unmarshall(JsonUnmarshallerContext context) throws Exception {
        Key Key = new Key();
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
                    if (context.testExpression("KeyId", targetDepth)) {
                        context.nextToken();
                            Key.setKeyId(context.getUnmarshaller(String.class).unmarshall(context));
                    }
                    if (context.testExpression("PublicKey", targetDepth)) {
                        context.nextToken();
                            Key.setPublicKey(context.getUnmarshaller(String.class).unmarshall(context));
                    }
                    if (context.testExpression("CreateTime", targetDepth)) {
                        context.nextToken();
                            Key.setCreateTime(context.getUnmarshaller(String.class).unmarshall(context));
                    }
                    if (context.testExpression("KeyName", targetDepth)) {
                        context.nextToken();
                            Key.setKeyName(context.getUnmarshaller(String.class).unmarshall(context));
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
        return Key;
    }
}
