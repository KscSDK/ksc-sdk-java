package com.ksc.redis.model.security;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.redis.transform.security.ModifySecurityGroupMarshaller;

import java.io.Serializable;
import java.util.List;

public class ModifySecurityGroupRequest extends KscWebServiceRequest implements Serializable, Cloneable, DryRunSupportedRequest<ModifySecurityGroupRequest> {
    private String name;
    private String description;
    private String securityGroupId;


    private String SecurityGroupName;
    private String SecurityGroupDescription;
    private List<String> DBInstanceIdentifier;
    private String Type;
    private String SecurityGroupId;
    public String getSecurityGroupName() {
        return SecurityGroupName;
    }

    public void setSecurityGroupName(String securityGroupName) {
        SecurityGroupName = securityGroupName;
    }

    public String getSecurityGroupDescription() {
        return SecurityGroupDescription;
    }

    public void setSecurityGroupDescription(String securityGroupDescription) {
        SecurityGroupDescription = securityGroupDescription;
    }

    public List<String> getDBInstanceIdentifier() {
        return DBInstanceIdentifier;
    }

    public void setDBInstanceIdentifier(List<String> DBInstanceIdentifier) {
        this.DBInstanceIdentifier = DBInstanceIdentifier;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSecurityGroupId() {
        return securityGroupId;
    }

    public void setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
    }

    @Override
    public Request<ModifySecurityGroupRequest> getDryRunRequest() {
        Request<ModifySecurityGroupRequest> request = new ModifySecurityGroupMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }
}
