package com.ksc.krds;

import com.ksc.KscWebServiceResponse;
import com.ksc.Request;
import com.ksc.Response;
import com.ksc.auth.AWSCredentials;
import com.ksc.http.ExecutionContext;
import com.ksc.http.HttpResponseHandler;
import com.ksc.krds.model.KrdsResponse;
import com.ksc.krds.model.krdsInstance.BaseRequest;
import com.ksc.krds.model.securityGroup.*;
import com.ksc.krds.transform.krdsInstance.BaseMarshaller;
import com.ksc.krds.transform.securityGroup.DescribeSecurityGroupJsonUnmarshaller;
import com.ksc.krds.transform.securityGroup.DescribeSecurityGroupMarshaller;
import com.ksc.protocol.json.JsonOperationMetadata;
import com.ksc.util.KscRequestMetrics;

import static com.ksc.krds.transform.ActionEnum.*;

/**
 *      security operation for version 2020-08-25
 *      安全组操作-version：2020-08-25
 *      security group client
 */
public class SecurityGroupsClient extends Client{

    public SecurityGroupsClient(AWSCredentials awsCredentials) {
        super(awsCredentials);
    }


    public <T extends BaseRequest> Response<DescribeSecurityGroupResponse> doExecute(T in, BaseMarshaller<T> marshaller) {
        return execute(marshaller, new DescribeSecurityGroupJsonUnmarshaller(), in);
    }

    /**
     * 1.CreateSecurityGroup 新建安全组
     * create security group
     */
    public DescribeSecurityGroupResponse  createSecurityGroupRule(CreateSecurityGroupRequest request) {
        request.setVersion("2020-08-25");
        Response<DescribeSecurityGroupResponse> response = doExecute(request,
                new BaseMarshaller<CreateSecurityGroupRequest>(CREATE_SECURITY_GROUP));
        return response.getKscResponse();
    }


    /**
     * 2.DescribeSecurityGroup 查看安全组
     * search security group list
     */
    public DescribeSecurityGroupResponse describeSecurityGroup(DescribeSecurityGroupRequest describeSecurityGroupRequest){

        describeSecurityGroupRequest.setVersion("2020-08-25");

        ExecutionContext executionContext = createExecutionContext(describeSecurityGroupRequest);
        KscRequestMetrics kscRequestMetrics = executionContext.getKscRequestMetrics();
        kscRequestMetrics.startEvent(KscRequestMetrics.Field.ClientExecuteTime);
        Request<DescribeSecurityGroupRequest> request = null;
        Response<DescribeSecurityGroupResponse> response = null;
        try {
            kscRequestMetrics.startEvent(KscRequestMetrics.Field.RequestMarshallTime);
            try {
                request = new DescribeSecurityGroupMarshaller().marshall(super.beforeMarshalling(describeSecurityGroupRequest));
                request.addHeader("Accept", "application/json");
                request.setKscRequestMetrics(kscRequestMetrics);
            } finally {
                kscRequestMetrics.endEvent(KscRequestMetrics.Field.RequestMarshallTime);
            }

            HttpResponseHandler<KscWebServiceResponse<DescribeSecurityGroupResponse>> responseHandler = protocolFactory
                    .createResponseHandler(
                            new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new DescribeSecurityGroupJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);
            return response.getKscResponse();

        } finally {
            endClientExecution(kscRequestMetrics, request, response);
        }
    }

    /**
     * 3.CloneSecurityGroup 复制(克隆)安全组
     * Clone security group
     */
    public DescribeSecurityGroupResponse cloneSecurityGroup(CreateSecurityGroupRequest request){
        request.setVersion("2020-08-25");
        Response<DescribeSecurityGroupResponse> response = doExecute(request,
                new BaseMarshaller<CreateSecurityGroupRequest>(CLONE_SECURITY_GROUP));
        return response.getKscResponse();
    }

    /**
     * 4.DeleteSecurityGroup 删除安全组
     * Delete security group & Support batch deletion
     */
    public KrdsResponse deleteSecurityGroup(DeleteSecurityGroupRequest request) {
        request.setVersion("2020-08-25");
        Response<DescribeSecurityGroupResponse> response = doExecute(request,
                new BaseMarshaller<DeleteSecurityGroupRequest>(DELETE_SECURITY_GROUP));
        return response.getKscResponse();
    }

    /**
     * 5.ModifySecurityGroupRule 修改安全组规则
     * modify security group rules
     */
    public DescribeSecurityGroupResponse modifySecurityGroupRule(ModifySecurityGroupRuleRequest request){
        request.setVersion("2020-08-25");
        Response<DescribeSecurityGroupResponse> response = doExecute(request,
                new BaseMarshaller<ModifySecurityGroupRuleRequest>(MODIFY_SECURITY_GROUP_RULE));
        return response.getKscResponse();
    }

    /**
     * 6.SecurityGroupRelation 修改安全组绑定实例
     * modify security group relation instance
     */
    public DescribeSecurityGroupResponse securityGroupRelation(SecurityGroupRelationRequest request){
        request.setVersion("2020-08-25");
        Response<DescribeSecurityGroupResponse> response = doExecute(request,
                new BaseMarshaller<SecurityGroupRelationRequest>(SECURITY_GROUP_RELATION));
        return response.getKscResponse();
    }

    /**
     * 7.ModifySecurityGroup 修改安全组
     * modify security group
     */
    public DescribeSecurityGroupResponse modifySecurityGroup(CreateSecurityGroupRequest request) {
        request.setVersion("2020-08-25");
        Response<DescribeSecurityGroupResponse> response = doExecute(request,
                new BaseMarshaller<CreateSecurityGroupRequest>(MODIFY_SECURITY_GROUP));
        return response.getKscResponse();
    }

    /**
     * 8.ModifySecurityGroupRuleName 修改安全组规则备注
     * modify security group rule describe
     */
    public KrdsResponse modifySecurityGroupRuleName(ModifySecurityGroupRuleNameRequest request){
        request.setVersion("2020-08-25");
        Response<DescribeSecurityGroupResponse> response = doExecute(request,
                new BaseMarshaller<ModifySecurityGroupRuleNameRequest>(MODIFY_SECURITY_GROUP_RULE_NAME));
        return response.getKscResponse();
    }

}
