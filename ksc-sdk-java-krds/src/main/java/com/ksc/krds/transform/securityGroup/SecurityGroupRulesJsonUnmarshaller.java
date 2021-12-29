package com.ksc.krds.transform.securityGroup;

import com.fasterxml.jackson.core.JsonToken;
import com.ksc.krds.model.securityGroup.DescribeSecurityGroupResponse;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

import static com.fasterxml.jackson.core.JsonToken.*;
import static com.fasterxml.jackson.core.JsonToken.END_OBJECT;

public class SecurityGroupRulesJsonUnmarshaller implements Unmarshaller<DescribeSecurityGroupResponse.SecurityGroupRule, JsonUnmarshallerContext> {
    private static SecurityGroupRulesJsonUnmarshaller instance;

    public static SecurityGroupRulesJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new SecurityGroupRulesJsonUnmarshaller();
        return instance;
    }

    @Override
    public DescribeSecurityGroupResponse.SecurityGroupRule unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeSecurityGroupResponse.SecurityGroupRule securityGroupRule = (new DescribeSecurityGroupResponse()).new SecurityGroupRule();
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
                if (context.testExpression("SecurityGroupRuleId", targetDepth)) {
                    context.nextToken();
                    securityGroupRule.setSecurityGroupRuleId(context.getUnmarshaller(String.class).unmarshall(context));
                } else if (context.testExpression("SecurityGroupRuleName", targetDepth)) {
                    context.nextToken();
                    securityGroupRule.setSecurityGroupRuleName(context.getUnmarshaller(String.class).unmarshall(context));
                } else if (context.testExpression("SecurityGroupRuleProtocol", targetDepth)) {
                    context.nextToken();
                    securityGroupRule.setSecurityGroupRuleProtocol(context.getUnmarshaller(String.class).unmarshall(context));
                } else if (context.testExpression("SecurityGroupRuleCidr", targetDepth)) {
                    context.nextToken();
                    securityGroupRule.setSecurityGroupRuleCidr(context.getUnmarshaller(String.class).unmarshall(context));
                } else if (context.testExpression("Created", targetDepth)) {
                    context.nextToken();
                    securityGroupRule.setCreated(context.getUnmarshaller(String.class).unmarshall(context));
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
        return securityGroupRule;
    }
}
