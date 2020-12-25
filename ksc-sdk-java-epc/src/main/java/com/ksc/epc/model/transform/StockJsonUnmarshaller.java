package com.ksc.epc.model.transform;

import com.ksc.epc.model.Stock;
import com.fasterxml.jackson.core.JsonToken;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.Unmarshaller;
import com.ksc.transform.ListUnmarshaller;
import static com.fasterxml.jackson.core.JsonToken.END_ARRAY;
import static com.fasterxml.jackson.core.JsonToken.END_OBJECT;
import static com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
import static com.fasterxml.jackson.core.JsonToken.START_OBJECT;
import static com.fasterxml.jackson.core.JsonToken.VALUE_NULL;

public class StockJsonUnmarshaller implements Unmarshaller<Stock, JsonUnmarshallerContext> {
    private static StockJsonUnmarshaller instance;

    public static StockJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new StockJsonUnmarshaller();
        return instance;
    }

    @Override
    public Stock unmarshall(JsonUnmarshallerContext context) throws Exception {
        Stock Stock = new Stock();
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
                    if (context.testExpression("HostType", targetDepth)) {
                        context.nextToken();
                            Stock.setHostType(context.getUnmarshaller(String.class).unmarshall(context));
                    }
                    if (context.testExpression("InstanceCount", targetDepth)) {
                        context.nextToken();
                            Stock.setInstanceCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                    }
                    if (context.testExpression("AvailabilityZone", targetDepth)) {
                        context.nextToken();
                            Stock.setAvailabilityZone(context.getUnmarshaller(String.class).unmarshall(context));
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
        return Stock;
    }
}
