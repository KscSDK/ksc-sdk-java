package com.ksc.epc.model.transform;

import com.ksc.epc.model.DescribeInspectionsResult;
import com.fasterxml.jackson.core.JsonToken;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.Unmarshaller;
import com.ksc.transform.ListUnmarshaller;
import static com.fasterxml.jackson.core.JsonToken.END_ARRAY;
import static com.fasterxml.jackson.core.JsonToken.END_OBJECT;
import static com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
import static com.fasterxml.jackson.core.JsonToken.START_OBJECT;
import static com.fasterxml.jackson.core.JsonToken.VALUE_NULL;
import com.ksc.epc.model.Inspection;

/**
 * DescribeInspectionsResult Json Unmarshaller
 */
public class DescribeInspectionsResultJsonUnmarshaller implements Unmarshaller<DescribeInspectionsResult, JsonUnmarshallerContext> {
    @Override
    public DescribeInspectionsResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeInspectionsResult describeInspectionsResult = new DescribeInspectionsResult();
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
                            describeInspectionsResult.setRequestId(context.getUnmarshaller(String.class).unmarshall(context));
                    }
                    if (context.testExpression("InspectionSet", targetDepth)) {
                    context.nextToken();
                    describeInspectionsResult.setInspectionSet(new ListUnmarshaller<Inspection>(InspectionJsonUnmarshaller.getInstance()).unmarshall(context));
                    }
                    if (context.testExpression("TotalCount", targetDepth)) {
                    context.nextToken();
                            describeInspectionsResult.setTotalCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                    }
                    if (context.testExpression("NextToken", targetDepth)) {
                    context.nextToken();
                            describeInspectionsResult.setNextToken(context.getUnmarshaller(String.class).unmarshall(context));
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
        return describeInspectionsResult;
    }

    private static DescribeInspectionsResultJsonUnmarshaller instance;

    public static DescribeInspectionsResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeInspectionsResultJsonUnmarshaller();
        return instance;
    }
}
