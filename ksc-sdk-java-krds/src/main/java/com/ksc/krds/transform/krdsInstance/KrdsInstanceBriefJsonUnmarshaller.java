package com.ksc.krds.transform.krdsInstance;

import com.fasterxml.jackson.core.JsonToken;
import com.ksc.krds.model.krdsInstance.InstanceBrief;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import static com.fasterxml.jackson.core.JsonToken.*;
import static com.fasterxml.jackson.core.JsonToken.END_OBJECT;

public class KrdsInstanceBriefJsonUnmarshaller implements Unmarshaller<InstanceBrief, JsonUnmarshallerContext> {
    private static KrdsInstanceBriefJsonUnmarshaller instance;

    public static KrdsInstanceBriefJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new KrdsInstanceBriefJsonUnmarshaller();
        return instance;
    }

    @Override
    public InstanceBrief unmarshall(JsonUnmarshallerContext context) throws Exception {
        InstanceBrief instance = new InstanceBrief();
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
                if (context.testExpression("DBInstanceIdentifier", targetDepth)) {
                    context.nextToken();
                    instance.setDBInstanceIdentifier(context.getUnmarshaller(String.class).unmarshall(context));
                } else if (context.testExpression("DBInstanceName", targetDepth)) {
                    context.nextToken();
                    instance.setDBInstanceName(context.getUnmarshaller(String.class).unmarshall(context));
                } else if (context.testExpression("Vip", targetDepth)) {
                    context.nextToken();
                    instance.setVip(context.getUnmarshaller(String.class).unmarshall(context));
                } else if (context.testExpression("Created", targetDepth)) {
                    context.nextToken();
                    instance.setCreated(context.getUnmarshaller(String.class).unmarshall(context));
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
        return instance;
    }
}
