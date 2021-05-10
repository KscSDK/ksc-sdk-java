package com.ksc.krds.model.securityGroup;

import com.ksc.krds.model.krdsInstance.BaseRequest;

import java.util.ArrayList;
import java.util.List;

public class DeleteSecurityGroupRequest extends BaseRequest<DeleteSecurityGroupRequest> {

    private String SecurityGroupIds;
    private List<String> SecurityGroupIdList = new ArrayList<String>();
    private List<String> SecurityGroupId;

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

    public List<String> getSecurityGroupId() {
        return SecurityGroupId;
    }

    public void setSecurityGroupId(List<String> securityGroupId) {
        SecurityGroupId = securityGroupId;
    }
}
