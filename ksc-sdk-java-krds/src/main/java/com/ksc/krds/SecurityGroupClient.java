package com.ksc.krds;

import com.ksc.Response;
import com.ksc.auth.AWSCredentials;
import com.ksc.krds.model.KrdsResponse;
import com.ksc.krds.model.krdsInstance.BaseRequest;
import com.ksc.krds.model.securityGroup.*;
import com.ksc.krds.transform.krdsInstance.BaseMarshaller;
import com.ksc.krds.transform.securityGroup.DescribeSecurityGroupJsonUnmarshaller;

import static com.ksc.krds.transform.ActionEnum.*;

public class SecurityGroupClient extends Client {

    public SecurityGroupClient(AWSCredentials awsCredentials) {
        super(awsCredentials);
    }

    public KrdsResponse createSecurityGroupRule(CreateSecurityGroupRequest request) {
        Response<DescribeSecurityGroupResponse> response = doExecute(request,
                new BaseMarshaller<CreateSecurityGroupRequest>(CREATE_SECURITY_GROUP));
        return response.getKscResponse();
    }

    public KrdsResponse modifySecurityGroup(CreateSecurityGroupRequest request) {
        Response<DescribeSecurityGroupResponse> response = doExecute(request,
                new BaseMarshaller<CreateSecurityGroupRequest>(MODIFY_SECURITY_GROUP));
        return response.getKscResponse();
    }

    public KrdsResponse deleteSecurityGroup(DeleteSecurityGroupRequest request) {
        Response<DescribeSecurityGroupResponse> response = doExecute(request,
                new BaseMarshaller<DeleteSecurityGroupRequest>(DELETE_SECURITY_GROUP));
        return response.getKscResponse();
    }

    public KrdsResponse cloneSecurityGroup(CreateSecurityGroupRequest request){
        Response<DescribeSecurityGroupResponse> response = doExecute(request,
                new BaseMarshaller<CreateSecurityGroupRequest>(CLONE_SECURITY_GROUP));
        return response.getKscResponse();
    }

    public KrdsResponse modifySecurityGroupRule(ModifySecurityGroupRuleRequest request){
        Response<DescribeSecurityGroupResponse> response = doExecute(request,
                new BaseMarshaller<ModifySecurityGroupRuleRequest>(MODIFY_SECURITY_GROUP_RULE));
        return response.getKscResponse();
    }

    public KrdsResponse securityGroupRelation(SecurityGroupRelationRequest request){
        Response<DescribeSecurityGroupResponse> response = doExecute(request,
                new BaseMarshaller<SecurityGroupRelationRequest>(SECURITY_GROUP_RELATION));
        return response.getKscResponse();
    }

    public KrdsResponse modifySecurityGroupRuleName(ModifySecurityGroupRuleNameRequest request){
        Response<DescribeSecurityGroupResponse> response = doExecute(request,
                new BaseMarshaller<ModifySecurityGroupRuleNameRequest>(SECURITY_GROUP_RELATION));
        return response.getKscResponse();
    }

    public <T extends BaseRequest> Response<DescribeSecurityGroupResponse> doExecute(T in, BaseMarshaller<T> marshaller) {
        return execute(marshaller, new DescribeSecurityGroupJsonUnmarshaller(), in);
    }
}
