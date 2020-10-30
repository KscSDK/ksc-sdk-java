package com.ksc.epc.model.transform;

import com.ksc.epc.model.CreateAccessory;
import com.fasterxml.jackson.core.JsonToken;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.Unmarshaller;
import com.ksc.transform.ListUnmarshaller;
import static com.fasterxml.jackson.core.JsonToken.END_ARRAY;
import static com.fasterxml.jackson.core.JsonToken.END_OBJECT;
import static com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
import static com.fasterxml.jackson.core.JsonToken.START_OBJECT;
import static com.fasterxml.jackson.core.JsonToken.VALUE_NULL;

public class CreateAccessoryJsonUnmarshaller implements Unmarshaller<CreateAccessory, JsonUnmarshallerContext> {
    private static CreateAccessoryJsonUnmarshaller instance;

    public static CreateAccessoryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CreateAccessoryJsonUnmarshaller();
        return instance;
    }

    @Override
    public CreateAccessory unmarshall(JsonUnmarshallerContext context) throws Exception {
        CreateAccessory CreateAccessory = new CreateAccessory();
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
                    if (context.testExpression("AccessoryType", targetDepth)) {
                        context.nextToken();
                            CreateAccessory.setAccessoryType(context.getUnmarshaller(String.class).unmarshall(context));
                    }
                    if (context.testExpression("AccessorySuit", targetDepth)) {
                        context.nextToken();
                            CreateAccessory.setAccessorySuit(context.getUnmarshaller(String.class).unmarshall(context));
                    }
                    if (context.testExpression("AccessoryName", targetDepth)) {
                        context.nextToken();
                            CreateAccessory.setAccessoryName(context.getUnmarshaller(String.class).unmarshall(context));
                    }
                    if (context.testExpression("ChargeType", targetDepth)) {
                        context.nextToken();
                            CreateAccessory.setChargeType(context.getUnmarshaller(String.class).unmarshall(context));
                    }
                    if (context.testExpression("AvailabilityZone", targetDepth)) {
                        context.nextToken();
                            CreateAccessory.setAvailabilityZone(context.getUnmarshaller(String.class).unmarshall(context));
                    }
                    if (context.testExpression("PurchaseTime", targetDepth)) {
                        context.nextToken();
                            CreateAccessory.setPurchaseTime(context.getUnmarshaller(Integer.class).unmarshall(context));
                    }
                    if (context.testExpression("ProjectId", targetDepth)) {
                        context.nextToken();
                            CreateAccessory.setProjectId(context.getUnmarshaller(String.class).unmarshall(context));
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
        return CreateAccessory;
    }
}
