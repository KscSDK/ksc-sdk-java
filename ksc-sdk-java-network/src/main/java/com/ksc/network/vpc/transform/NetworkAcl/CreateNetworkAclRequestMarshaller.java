package com.ksc.network.vpc.transform.NetworkAcl;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.network.vpc.model.NetworkAcl.CreateNetworkAclRequest;
import com.ksc.network.vpc.model.vpc.CreateVpcRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

/**
 * CreateVpcRequest Marshaller
 */

public class CreateNetworkAclRequestMarshaller implements
        Marshaller<Request<CreateNetworkAclRequest>, CreateNetworkAclRequest> {

    public Request<CreateNetworkAclRequest> marshall(
            CreateNetworkAclRequest createNetworkAclRequest) {

        if (createNetworkAclRequest == null) {
            throw new KscClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<CreateNetworkAclRequest> request = new DefaultRequest<CreateNetworkAclRequest>(
                createNetworkAclRequest, "vpc");
        request.addParameter("Action", "CreateNetworkAcl");
        String version = createNetworkAclRequest.getVersion();
        if (org.apache.commons.lang.StringUtils.isBlank(version)) {
            version = "2016-03-04";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);

        if (!StringUtils.isNullOrEmpty(createNetworkAclRequest.getVpcId())) {
            request.addParameter("VpcId", createNetworkAclRequest.getVpcId());
        }

        if (!StringUtils.isNullOrEmpty(createNetworkAclRequest.getNetworkAclName())) {
            request.addParameter("NetworkAclName", createNetworkAclRequest.getNetworkAclName());
        }

        if (!StringUtils.isNullOrEmpty(createNetworkAclRequest.getDescription())) {
            request.addParameter("Description", createNetworkAclRequest.getDescription());
        }


        return request;
    }

}
