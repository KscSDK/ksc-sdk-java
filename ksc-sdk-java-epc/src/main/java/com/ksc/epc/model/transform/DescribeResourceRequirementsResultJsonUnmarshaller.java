package com.ksc.epc.model.transform;

import com.ksc.epc.model.DescribeResourceRequirementsResult;
import com.fasterxml.jackson.core.JsonToken;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.Unmarshaller;
import com.ksc.transform.ListUnmarshaller;
import static com.fasterxml.jackson.core.JsonToken.END_ARRAY;
import static com.fasterxml.jackson.core.JsonToken.END_OBJECT;
import static com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
import static com.fasterxml.jackson.core.JsonToken.START_OBJECT;
import static com.fasterxml.jackson.core.JsonToken.VALUE_NULL;
import com.ksc.epc.model.ResourceRequirement;

/**
 * DescribeResourceRequirementsResult Json Unmarshaller
 */
public class DescribeResourceRequirementsResultJsonUnmarshaller implements Unmarshaller<DescribeResourceRequirementsResult, JsonUnmarshallerContext> {
    @Override
    public DescribeResourceRequirementsResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeResourceRequirementsResult describeResourceRequirementsResult = new DescribeResourceRequirementsResult();
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
                            describeResourceRequirementsResult.setRequestId(context.getUnmarshaller(String.class).unmarshall(context));
                    }
                    if (context.testExpression("ResourceRequirementSet", targetDepth)) {
                    context.nextToken();
                    describeResourceRequirementsResult.setResourceRequirementSet(new ListUnmarshaller<ResourceRequirement>(ResourceRequirementJsonUnmarshaller.getInstance()).unmarshall(context));
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
        return describeResourceRequirementsResult;
    }

    private static DescribeResourceRequirementsResultJsonUnmarshaller instance;

    public static DescribeResourceRequirementsResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeResourceRequirementsResultJsonUnmarshaller();
        return instance;
    }
}
