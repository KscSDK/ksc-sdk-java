package com.ksc.epc.model.transform;

import com.ksc.epc.model.DescribeAccessorysResult;
import com.fasterxml.jackson.core.JsonToken;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.Unmarshaller;
import com.ksc.transform.ListUnmarshaller;
import static com.fasterxml.jackson.core.JsonToken.END_ARRAY;
import static com.fasterxml.jackson.core.JsonToken.END_OBJECT;
import static com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
import static com.fasterxml.jackson.core.JsonToken.START_OBJECT;
import static com.fasterxml.jackson.core.JsonToken.VALUE_NULL;
import com.ksc.epc.model.Accessory;

/**
 * DescribeAccessorysResult Json Unmarshaller
 */
public class DescribeAccessorysResultJsonUnmarshaller implements Unmarshaller<DescribeAccessorysResult, JsonUnmarshallerContext> {
    @Override
    public DescribeAccessorysResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeAccessorysResult describeAccessorysResult = new DescribeAccessorysResult();
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
                            describeAccessorysResult.setRequestId(context.getUnmarshaller(String.class).unmarshall(context));
                    }
                    if (context.testExpression("AccessorySet", targetDepth)) {
                    context.nextToken();
                    describeAccessorysResult.setAccessorySet(new ListUnmarshaller<Accessory>(AccessoryJsonUnmarshaller.getInstance()).unmarshall(context));
                    }
                    if (context.testExpression("TotalCount", targetDepth)) {
                    context.nextToken();
                            describeAccessorysResult.setTotalCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                    }
                    if (context.testExpression("NextToken", targetDepth)) {
                    context.nextToken();
                            describeAccessorysResult.setNextToken(context.getUnmarshaller(String.class).unmarshall(context));
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
        return describeAccessorysResult;
    }

    private static DescribeAccessorysResultJsonUnmarshaller instance;

    public static DescribeAccessorysResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeAccessorysResultJsonUnmarshaller();
        return instance;
    }
}
