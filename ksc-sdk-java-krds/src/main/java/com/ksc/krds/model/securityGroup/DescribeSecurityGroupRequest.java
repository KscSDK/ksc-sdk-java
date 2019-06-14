package com.ksc.krds.model.securityGroup;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.krds.transform.securityGroup.DescribeSecurityGroupMarshaller;
import com.ksc.model.DryRunSupportedRequest;

import java.io.Serializable;

public class DescribeSecurityGroupRequest extends KscWebServiceRequest
        implements Serializable, Cloneable, DryRunSupportedRequest<DescribeSecurityGroupRequest> {

    private String SecurityGroupId;

    public String getSecurityGroupId() {
        return SecurityGroupId;
    }

    public void setSecurityGroupId(String securityGroupId) {
        SecurityGroupId = securityGroupId;
    }

    public Request<DescribeSecurityGroupRequest> getDryRunRequest() {
        Request<DescribeSecurityGroupRequest> request = new DescribeSecurityGroupMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }
}