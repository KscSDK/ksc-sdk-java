package com.ksc.network.vpc.transform.SecurityGroups;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.network.vpc.model.SecurityGroups.CreateSecurityGroupRequest;
import com.ksc.network.vpc.model.SecurityGroups.ModifySecurityGroupRequest;
import com.ksc.network.vpc.model.vpc.CreateVpcRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

/**
 * ModifySecurityGroupRequest Marshaller
 */

public class ModifySecurityGroupRequestMarshaller implements
        Marshaller<Request<ModifySecurityGroupRequest>, ModifySecurityGroupRequest> {

    public Request<ModifySecurityGroupRequest> marshall(
    		ModifySecurityGroupRequest modifySecurityGroupRequest) {

        if (modifySecurityGroupRequest == null) {
            throw new KscClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<ModifySecurityGroupRequest> request = new DefaultRequest<ModifySecurityGroupRequest>(
        		modifySecurityGroupRequest, "vpc");
        request.addParameter("Action", "ModifySecurityGroup");
        String version = modifySecurityGroupRequest.getVersion();
        if (org.apache.commons.lang.StringUtils.isBlank(version)) {
            version = "2016-03-04";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);

        if (!StringUtils.isNullOrEmpty(modifySecurityGroupRequest.getSecurityGroupId())) {
            request.addParameter("SecurityGroupId", modifySecurityGroupRequest.getSecurityGroupId());
        }

        if (!StringUtils.isNullOrEmpty(modifySecurityGroupRequest.getSecurityGroupName())) {
            request.addParameter("SecurityGroupName", modifySecurityGroupRequest.getSecurityGroupName());
        }

        return request;
    }

}
