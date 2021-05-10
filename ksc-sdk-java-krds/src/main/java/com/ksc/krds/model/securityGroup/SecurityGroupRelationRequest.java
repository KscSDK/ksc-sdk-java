package com.ksc.krds.model.securityGroup;

import com.ksc.krds.model.krdsInstance.BaseRequest;

import java.util.List;

public class SecurityGroupRelationRequest extends BaseRequest<SecurityGroupRelationRequest> {

    private String SecurityGroupId;
    List<String> DBInstanceIdentifier;
    private String RelationAction;

    public String getSecurityGroupId() {
        return SecurityGroupId;
    }

    public void setSecurityGroupId(String securityGroupId) {
        SecurityGroupId = securityGroupId;
    }

    public List<String> getDBInstanceIdentifier() {
        return DBInstanceIdentifier;
    }

    public void setDBInstanceIdentifier(List<String> DBInstanceIdentifier) {
        this.DBInstanceIdentifier = DBInstanceIdentifier;
    }

    public String getRelationAction() {
        return RelationAction;
    }

    public void setRelationAction(String relationAction) {
        RelationAction = relationAction;
    }
}
