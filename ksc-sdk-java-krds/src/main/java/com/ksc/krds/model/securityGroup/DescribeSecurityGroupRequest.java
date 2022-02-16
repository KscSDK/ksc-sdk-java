package com.ksc.krds.model.securityGroup;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.krds.transform.securityGroup.DescribeSecurityGroupMarshaller;
import com.ksc.model.DryRunSupportedRequest;
import org.apache.commons.lang.StringUtils;

import java.io.Serializable;
import java.util.List;

public class DescribeSecurityGroupRequest extends KscWebServiceRequest
        implements Serializable, Cloneable, DryRunSupportedRequest<DescribeSecurityGroupRequest> {

    private List<String> SecurityGroupId;

    private String Type;
    private String SecurityGroupType;
    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public String getSecurityGroupType() {
        return SecurityGroupType;
    }

    public void setSecurityGroupType(String securityGroupType) {
        SecurityGroupType = securityGroupType;
    }

    public String getSecurityGroupId() {return StringUtils.join(SecurityGroupId, ",");}

    public void setSecurityGroupId(List<String> securityGroupId) {SecurityGroupId = securityGroupId;}

    public Request<DescribeSecurityGroupRequest> getDryRunRequest() {
        Request<DescribeSecurityGroupRequest> request = new DescribeSecurityGroupMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }
}