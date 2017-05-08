package com.ksc.network.vpc.transform.NetworkAcl;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.network.vpc.model.NetworkAcl.DeleteNetworkAclRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

/**
 * DeleteNetworkAclRequest Marshaller
 */

public class DeleteNetworkAclRequestMarshaller implements
        Marshaller<Request<DeleteNetworkAclRequest>, DeleteNetworkAclRequest> {

    public Request<DeleteNetworkAclRequest> marshall(
    		DeleteNetworkAclRequest deleteNetworkAclRequest) {

        if (deleteNetworkAclRequest == null) {
            throw new KscClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<DeleteNetworkAclRequest> request = new DefaultRequest<DeleteNetworkAclRequest>(
        		deleteNetworkAclRequest, "vpc");
        request.addParameter("Action", "DeleteNetworkAcl");
        String version = deleteNetworkAclRequest.getVersion();
        if (org.apache.commons.lang.StringUtils.isBlank(version)) {
            version = "2016-03-04";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);

        if (!StringUtils.isNullOrEmpty(((DeleteNetworkAclRequest) deleteNetworkAclRequest).getNetworkAclId())) {
            request.addParameter("NetworkAclId", ((DeleteNetworkAclRequest) deleteNetworkAclRequest).getNetworkAclId());
        }

        return request;
    }

}
