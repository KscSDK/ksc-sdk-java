package com.ksc.krds.transform.securityGroup;

import com.fasterxml.jackson.core.JsonToken;
import com.ksc.krds.model.krdsInstance.InstanceBrief;
import com.ksc.krds.model.securityGroup.DescribeSecurityGroupResponse;
import com.ksc.krds.transform.krdsInstance.KrdsInstanceBriefJsonUnmarshaller;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.ListUnmarshaller;
import com.ksc.transform.Unmarshaller;

import static com.fasterxml.jackson.core.JsonToken.*;
import static com.fasterxml.jackson.core.JsonToken.END_OBJECT;

public class SecurityGroupJsonUnmarshaller implements Unmarshaller<DescribeSecurityGroupResponse.SecurityGroup, JsonUnmarshallerContext> {
    private static SecurityGroupJsonUnmarshaller instance;

    public static SecurityGroupJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new SecurityGroupJsonUnmarshaller();
        return instance;
    }

    @Override
    public DescribeSecurityGroupResponse.SecurityGroup unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeSecurityGroupResponse.SecurityGroup securityGroup = (new DescribeSecurityGroupResponse()).new SecurityGroup();
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
                if (context.testExpression("SecurityGroupId", targetDepth)) {
                    context.nextToken();
                    securityGroup.setSecurityGroupId(context.getUnmarshaller(String.class).unmarshall(context));
                } else if (context.testExpression("SecurityGroupName", targetDepth)) {
                    context.nextToken();
                    securityGroup.setSecurityGroupName(context.getUnmarshaller(String.class).unmarshall(context));
                } else if (context.testExpression("SecurityGroupDescription", targetDepth)) {
                    context.nextToken();
                    securityGroup.setSecurityGroupDescription(context.getUnmarshaller(String.class).unmarshall(context));
                } else if (context.testExpression("Created", targetDepth)) {
                    context.nextToken();
                    securityGroup.setCreated(context.getUnmarshaller(String.class).unmarshall(context));
                }else if (context.testExpression("SecurityGroupType", targetDepth)) {
                    context.nextToken();
                    securityGroup.setSecurityGroupType(context.getUnmarshaller(String.class).unmarshall(context));
                } else if (context.testExpression("Instances", targetDepth)) {
                    context.nextToken();
                    securityGroup.setInstances(new ListUnmarshaller<InstanceBrief>(KrdsInstanceBriefJsonUnmarshaller.getInstance()).unmarshall(context));
                } else if (context.testExpression("SecurityGroupRules", targetDepth)) {
                    context.nextToken();
                    securityGroup.setSecurityGroupRules(new ListUnmarshaller<DescribeSecurityGroupResponse.SecurityGroupRule>(SecurityGroupRulesJsonUnmarshaller.getInstance()).unmarshall(context));
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
        return securityGroup;
    }
}
