package com.ksc.network.vpc.transform.NetworkAcl;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.network.vpc.model.NetworkAcl.ModifyNetworkAclRequest;
import com.ksc.network.vpc.model.SecurityGroups.ModifySecurityGroupRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

/**
 * ModifySecurityGroupRequest Marshaller
 */

public class ModifyNetworkAclRequestMarshaller implements
        Marshaller<Request<ModifyNetworkAclRequest>, ModifyNetworkAclRequest> {

    public Request<ModifyNetworkAclRequest> marshall(
    		ModifyNetworkAclRequest modifyNetworkAclRequest) {

        if (modifyNetworkAclRequest == null) {
            throw new KscClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<ModifyNetworkAclRequest> request = new DefaultRequest<ModifyNetworkAclRequest>(
        		modifyNetworkAclRequest, "vpc");
        request.addParameter("Action", "ModifyNetworkAcl");
        String version = modifyNetworkAclRequest.getVersion();
        if (org.apache.commons.lang.StringUtils.isBlank(version)) {
            version = "2016-03-04";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);

        if (!StringUtils.isNullOrEmpty(modifyNetworkAclRequest.getNetworkAclId())) {
            request.addParameter("NetworkAclId", modifyNetworkAclRequest.getNetworkAclId());
        }

        if (!StringUtils.isNullOrEmpty(modifyNetworkAclRequest.getNetworkAclName())) {
            request.addParameter("NetworkAclName", modifyNetworkAclRequest.getNetworkAclName());
        }

        if (!StringUtils.isNullOrEmpty(modifyNetworkAclRequest.getDescription())) {
            request.addParameter("Description", modifyNetworkAclRequest.getDescription());
        }

        return request;
    }

}
