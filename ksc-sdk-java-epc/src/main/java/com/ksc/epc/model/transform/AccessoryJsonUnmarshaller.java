package com.ksc.epc.model.transform;

import com.ksc.epc.model.Accessory;
import com.fasterxml.jackson.core.JsonToken;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.Unmarshaller;
import com.ksc.transform.ListUnmarshaller;
import static com.fasterxml.jackson.core.JsonToken.END_ARRAY;
import static com.fasterxml.jackson.core.JsonToken.END_OBJECT;
import static com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
import static com.fasterxml.jackson.core.JsonToken.START_OBJECT;
import static com.fasterxml.jackson.core.JsonToken.VALUE_NULL;

public class AccessoryJsonUnmarshaller implements Unmarshaller<Accessory, JsonUnmarshallerContext> {
    private static AccessoryJsonUnmarshaller instance;

    public static AccessoryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AccessoryJsonUnmarshaller();
        return instance;
    }

    @Override
    public Accessory unmarshall(JsonUnmarshallerContext context) throws Exception {
        Accessory Accessory = new Accessory();
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
                    if (context.testExpression("AccessoryId", targetDepth)) {
                        context.nextToken();
                            Accessory.setAccessoryId(context.getUnmarshaller(String.class).unmarshall(context));
                    }
                    if (context.testExpression("AccessorySalesType", targetDepth)) {
                        context.nextToken();
                            Accessory.setAccessorySalesType(context.getUnmarshaller(String.class).unmarshall(context));
                    }
                    if (context.testExpression("AccessoryType", targetDepth)) {
                        context.nextToken();
                            Accessory.setAccessoryType(context.getUnmarshaller(String.class).unmarshall(context));
                    }
                    if (context.testExpression("AccessorySuit", targetDepth)) {
                        context.nextToken();
                            Accessory.setAccessorySuit(context.getUnmarshaller(String.class).unmarshall(context));
                    }
                    if (context.testExpression("AccessoryDescription", targetDepth)) {
                        context.nextToken();
                            Accessory.setAccessoryDescription(context.getUnmarshaller(String.class).unmarshall(context));
                    }
                    if (context.testExpression("HostId", targetDepth)) {
                        context.nextToken();
                            Accessory.setHostId(context.getUnmarshaller(String.class).unmarshall(context));
                    }
                    if (context.testExpression("HostName", targetDepth)) {
                        context.nextToken();
                            Accessory.setHostName(context.getUnmarshaller(String.class).unmarshall(context));
                    }
                    if (context.testExpression("Sn", targetDepth)) {
                        context.nextToken();
                            Accessory.setSn(context.getUnmarshaller(String.class).unmarshall(context));
                    }
                    if (context.testExpression("AccessoryName", targetDepth)) {
                        context.nextToken();
                            Accessory.setAccessoryName(context.getUnmarshaller(String.class).unmarshall(context));
                    }
                    if (context.testExpression("AvailabilityZone", targetDepth)) {
                        context.nextToken();
                            Accessory.setAvailabilityZone(context.getUnmarshaller(String.class).unmarshall(context));
                    }
                    if (context.testExpression("Status", targetDepth)) {
                        context.nextToken();
                            Accessory.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                    }
                    if (context.testExpression("ProjectId", targetDepth)) {
                        context.nextToken();
                            Accessory.setProjectId(context.getUnmarshaller(String.class).unmarshall(context));
                    }
                    if (context.testExpression("CreateTime", targetDepth)) {
                        context.nextToken();
                            Accessory.setCreateTime(context.getUnmarshaller(String.class).unmarshall(context));
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
        return Accessory;
    }
}
