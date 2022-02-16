package com.ksc.redis.model.security;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.redis.transform.security.CloneSecurityGroupMarshaller;

import java.io.Serializable;
import java.util.List;

public class CloneSecurityGroupRequest extends KscWebServiceRequest implements Serializable, Cloneable, DryRunSupportedRequest<CloneSecurityGroupRequest> {
    private String name;
    private String description;
    private String srcSecurityGroupId;


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

    public String getSecurityGroupId() {
        return SecurityGroupId;
    }

    public void setSecurityGroupId(String securityGroupId) {
        SecurityGroupId = securityGroupId;
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

    public String getSrcSecurityGroupId() {
        return srcSecurityGroupId;
    }

    public void setSrcSecurityGroupId(String srcSecurityGroupId) {
        this.srcSecurityGroupId = srcSecurityGroupId;
    }

    @Override
    public Request<CloneSecurityGroupRequest> getDryRunRequest() {
        Request<CloneSecurityGroupRequest> request = new CloneSecurityGroupMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }
}
