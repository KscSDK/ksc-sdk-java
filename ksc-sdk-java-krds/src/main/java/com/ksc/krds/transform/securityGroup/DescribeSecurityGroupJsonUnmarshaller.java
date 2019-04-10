package com.ksc.krds.transform.securityGroup;

import com.fasterxml.jackson.core.JsonToken;
import com.ksc.krds.model.securityGroup.DescribeSecurityGroupResponse;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.ListUnmarshaller;
import com.ksc.transform.Unmarshaller;

import static com.fasterxml.jackson.core.JsonToken.*;
import static com.fasterxml.jackson.core.JsonToken.END_OBJECT;

public class DescribeSecurityGroupJsonUnmarshaller implements Unmarshaller<DescribeSecurityGroupResponse, JsonUnmarshallerContext> {
    public DescribeSecurityGroupResponse unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeSecurityGroupResponse result = new DescribeSecurityGroupResponse();
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
                if (context.testExpression("SecurityGroups", targetDepth+1)) {
                    context.nextToken();
                    result.getData().setSecurityGroups(
                            new ListUnmarshaller<DescribeSecurityGroupResponse.SecurityGroup>(SecurityGroupJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("RequestId", targetDepth)) {
                    context.nextToken();
                    result.setRequestId(context.getUnmarshaller(String.class).unmarshall(context));
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

        return result;
    }

    private static DescribeSecurityGroupJsonUnmarshaller instance;


    public static DescribeSecurityGroupJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeSecurityGroupJsonUnmarshaller();
        return instance;
    }
}
