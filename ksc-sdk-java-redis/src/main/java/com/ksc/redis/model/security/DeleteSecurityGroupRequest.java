package com.ksc.redis.model.security;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.redis.transform.security.DeleteSecurityGroupMarshaller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class DeleteSecurityGroupRequest extends KscWebServiceRequest implements Serializable, Cloneable, DryRunSupportedRequest<DeleteSecurityGroupRequest> {
    private List<String> securityGroupId;
    private String SecurityGroupIds;
    private List<String> SecurityGroupIdList = new ArrayList<String>();

    public String getSecurityGroupIds() {
        return SecurityGroupIds;
    }

    public void setSecurityGroupIds(String securityGroupIds) {
        SecurityGroupIds = securityGroupIds;
    }

    public List<String> getSecurityGroupIdList() {
        return SecurityGroupIdList;
    }

    public void setSecurityGroupIdList(List<String> securityGroupIdList) {
        SecurityGroupIdList = securityGroupIdList;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    private List<String> SecurityGroupId;
    private String Type;



    public List<String> getSecurityGroupId() {
        return securityGroupId;
    }

    public void setSecurityGroupId(List<String> securityGroupId) {
        this.securityGroupId = securityGroupId;
    }

    @Override
    public Request<DeleteSecurityGroupRequest> getDryRunRequest() {
        Request<DeleteSecurityGroupRequest> request = new DeleteSecurityGroupMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }
}
