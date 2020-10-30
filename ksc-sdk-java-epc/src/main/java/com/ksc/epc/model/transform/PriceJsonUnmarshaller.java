package com.ksc.epc.model.transform;

import com.ksc.epc.model.Price;
import com.fasterxml.jackson.core.JsonToken;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import java.math.BigDecimal;

import static com.fasterxml.jackson.core.JsonToken.END_ARRAY;
import static com.fasterxml.jackson.core.JsonToken.END_OBJECT;
import static com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
import static com.fasterxml.jackson.core.JsonToken.START_OBJECT;
import static com.fasterxml.jackson.core.JsonToken.VALUE_NULL;

public class PriceJsonUnmarshaller implements Unmarshaller<Price, JsonUnmarshallerContext> {
    private static PriceJsonUnmarshaller instance;

    public static PriceJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new PriceJsonUnmarshaller();
        return instance;
    }

    @Override
    public Price unmarshall(JsonUnmarshallerContext context) throws Exception {
        Price Price = new Price();
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
                    if (context.testExpression("Currency", targetDepth)) {
                        context.nextToken();
                            Price.setCurrency(context.getUnmarshaller(String.class).unmarshall(context));
                    }
                    if (context.testExpression("DiscountPrice", targetDepth)) {
                        context.nextToken();
                            Price.setDiscountPrice(context.getUnmarshaller(BigDecimal.class).unmarshall(context));
                    }
                    if (context.testExpression("OriginalPrice", targetDepth)) {
                        context.nextToken();
                            Price.setOriginalPrice(context.getUnmarshaller(BigDecimal.class).unmarshall(context));
                    }
                    if (context.testExpression("TradePrice", targetDepth)) {
                        context.nextToken();
                            Price.setTradePrice(context.getUnmarshaller(BigDecimal.class).unmarshall(context));
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
        return Price;
    }
}
