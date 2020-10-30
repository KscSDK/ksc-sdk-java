package com.ksc.epc.model.transform;

import com.ksc.epc.model.PriceInfo;
import com.fasterxml.jackson.core.JsonToken;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.Unmarshaller;
import com.ksc.transform.ListUnmarshaller;
import static com.fasterxml.jackson.core.JsonToken.END_ARRAY;
import static com.fasterxml.jackson.core.JsonToken.END_OBJECT;
import static com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
import static com.fasterxml.jackson.core.JsonToken.START_OBJECT;
import static com.fasterxml.jackson.core.JsonToken.VALUE_NULL;
        import com.ksc.epc.model.Price;

public class PriceInfoJsonUnmarshaller implements Unmarshaller<PriceInfo, JsonUnmarshallerContext> {
    private static PriceInfoJsonUnmarshaller instance;

    public static PriceInfoJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new PriceInfoJsonUnmarshaller();
        return instance;
    }

    @Override
    public PriceInfo unmarshall(JsonUnmarshallerContext context) throws Exception {
        PriceInfo PriceInfo = new PriceInfo();
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
                    if (context.testExpression("PriceSet", targetDepth)) {
                        context.nextToken();
                        PriceInfo.setPriceSet(new ListUnmarshaller<Price>(PriceJsonUnmarshaller.getInstance()).unmarshall(context));
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
        return PriceInfo;
    }
}
