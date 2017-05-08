package com.ksc.network.vpc.transform.NetworkAcl;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.network.vpc.model.NetworkAcl.ModifyNetworkAclEntryRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

/**
 * ModifyNetworkAclEntryRequest Marshaller
 */

public class ModifyNetworkAclEntryRequestMarshaller implements
        Marshaller<Request<ModifyNetworkAclEntryRequest>, ModifyNetworkAclEntryRequest> {

    public Request<ModifyNetworkAclEntryRequest> marshall(
    		ModifyNetworkAclEntryRequest modifyNetworkAclEntryRequest) {

        if (modifyNetworkAclEntryRequest == null) {
            throw new KscClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<ModifyNetworkAclEntryRequest> request = new DefaultRequest<ModifyNetworkAclEntryRequest>(
        		modifyNetworkAclEntryRequest, "vpc");
        request.addParameter("Action", "ModifyNetworkAclEntry");
        String version = modifyNetworkAclEntryRequest.getVersion();
        if (org.apache.commons.lang.StringUtils.isBlank(version)) {
            version = "2016-03-04";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);

        if (!StringUtils.isNullOrEmpty(modifyNetworkAclEntryRequest.getNetworkAclEntryId())) {
            request.addParameter("NetworkAclEntryId", modifyNetworkAclEntryRequest.getNetworkAclEntryId());
        }

        if (!StringUtils.isNullOrEmpty(modifyNetworkAclEntryRequest.getDescription())) {
            request.addParameter("Description", modifyNetworkAclEntryRequest.getDescription());
        }

        return request;
    }

}
