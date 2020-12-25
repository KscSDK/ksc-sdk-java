package com.ksc.epc.model.transform;

import com.ksc.epc.model.Cabinet;
import com.fasterxml.jackson.core.JsonToken;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.Unmarshaller;
import com.ksc.transform.ListUnmarshaller;
import static com.fasterxml.jackson.core.JsonToken.END_ARRAY;
import static com.fasterxml.jackson.core.JsonToken.END_OBJECT;
import static com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
import static com.fasterxml.jackson.core.JsonToken.START_OBJECT;
import static com.fasterxml.jackson.core.JsonToken.VALUE_NULL;

public class CabinetJsonUnmarshaller implements Unmarshaller<Cabinet, JsonUnmarshallerContext> {
    private static CabinetJsonUnmarshaller instance;

    public static CabinetJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CabinetJsonUnmarshaller();
        return instance;
    }

    @Override
    public Cabinet unmarshall(JsonUnmarshallerContext context) throws Exception {
        Cabinet Cabinet = new Cabinet();
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
                    if (context.testExpression("CreateTime", targetDepth)) {
                        context.nextToken();
                            Cabinet.setCreateTime(context.getUnmarshaller(String.class).unmarshall(context));
                    }
                    if (context.testExpression("CabinetName", targetDepth)) {
                        context.nextToken();
                            Cabinet.setCabinetName(context.getUnmarshaller(String.class).unmarshall(context));
                    }
                    if (context.testExpression("CabinetType", targetDepth)) {
                        context.nextToken();
                            Cabinet.setCabinetType(context.getUnmarshaller(String.class).unmarshall(context));
                    }
                    if (context.testExpression("CabinetId", targetDepth)) {
                        context.nextToken();
                            Cabinet.setCabinetId(context.getUnmarshaller(String.class).unmarshall(context));
                    }
                    if (context.testExpression("ProjectId", targetDepth)) {
                        context.nextToken();
                            Cabinet.setProjectId(context.getUnmarshaller(String.class).unmarshall(context));
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
        return Cabinet;
    }
}
