package com.ksc.krds.transform.krdsInstance;

import com.fasterxml.jackson.core.JsonToken;
import com.ksc.krds.model.krdsInstance.Instance;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import static com.fasterxml.jackson.core.JsonToken.*;
import static com.fasterxml.jackson.core.JsonToken.END_OBJECT;

public class DBInstanceClassJsonUnmarshaller implements Unmarshaller<Instance.DBInstanceClass, JsonUnmarshallerContext> {
    private static DBInstanceClassJsonUnmarshaller instance;

    public static DBInstanceClassJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DBInstanceClassJsonUnmarshaller();
        return instance;
    }

    @Override
    public Instance.DBInstanceClass unmarshall(JsonUnmarshallerContext context) throws Exception {
        Instance instance = new Instance();
        Instance.DBInstanceClass dbInstanceClass = instance.new DBInstanceClass();
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
                if (context.testExpression("Ram", targetDepth)) {
                    context.nextToken();
                    dbInstanceClass.setRam(context.getUnmarshaller(Integer.class).unmarshall(context));
                } else if (context.testExpression("Disk", targetDepth)) {
                    context.nextToken();
                    dbInstanceClass.setDisk(context.getUnmarshaller(Integer.class).unmarshall(context));
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
        return dbInstanceClass;
    }
}
