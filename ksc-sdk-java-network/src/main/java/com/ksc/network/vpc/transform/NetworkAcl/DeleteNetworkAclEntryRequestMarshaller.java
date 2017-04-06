package com.ksc.network.vpc.transform.NetworkAcl;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.network.vpc.model.NetworkAcl.DeleteNetworkAclEntryRequest;
import com.ksc.network.vpc.model.SecurityGroups.RevokeSecurityGroupEntryRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

/**
 * CreateSecurityGroupRequest Marshaller
 */

public class DeleteNetworkAclEntryRequestMarshaller implements
        Marshaller<Request<DeleteNetworkAclEntryRequest>, DeleteNetworkAclEntryRequest> {

    public Request<DeleteNetworkAclEntryRequest> marshall(
            DeleteNetworkAclEntryRequest deleteNetworkAclEntryRequest) {

        if (deleteNetworkAclEntryRequest == null) {
            throw new KscClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<DeleteNetworkAclEntryRequest> request = new DefaultRequest<DeleteNetworkAclEntryRequest>(
                deleteNetworkAclEntryRequest, "vpc");
        request.addParameter("Action", "DeleteNetworkAclEntry");
        String version = deleteNetworkAclEntryRequest.getVersion();
        if (org.apache.commons.lang.StringUtils.isBlank(version)) {
            version = "2016-03-04";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);

        if (!StringUtils.isNullOrEmpty(deleteNetworkAclEntryRequest.getNetworkAclId())) {
            request.addParameter("NetworkAclId", deleteNetworkAclEntryRequest.getNetworkAclId());
        }
        if (!StringUtils.isNullOrEmpty(deleteNetworkAclEntryRequest.getNetworkAclEntryId())) {
            request.addParameter("NetworkAclEntryId", deleteNetworkAclEntryRequest.getNetworkAclEntryId());
        }
        
        return request;
    }

}
