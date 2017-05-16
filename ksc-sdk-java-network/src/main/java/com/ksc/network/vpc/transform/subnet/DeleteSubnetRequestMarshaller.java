package com.ksc.network.vpc.transform.subnet;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.network.vpc.model.subnet.DeleteSubnetRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

/**
 * DeleteVpcRequest Marshaller
 */

public class DeleteSubnetRequestMarshaller implements
        Marshaller<Request<DeleteSubnetRequest>, DeleteSubnetRequest> {

    public Request<DeleteSubnetRequest> marshall(
    		DeleteSubnetRequest deleteSubnetRequest) {

        if (deleteSubnetRequest == null) {
            throw new KscClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<DeleteSubnetRequest> request = new DefaultRequest<DeleteSubnetRequest>(
        		deleteSubnetRequest, "vpc");
        request.addParameter("Action", "DeleteSubnet");
        String version = deleteSubnetRequest.getVersion();
        if (org.apache.commons.lang.StringUtils.isBlank(version)) {
            version = "2016-03-04";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);

        if (!StringUtils.isNullOrEmpty(((DeleteSubnetRequest) deleteSubnetRequest).getSubnetId())) {
            request.addParameter("SubnetId", ((DeleteSubnetRequest) deleteSubnetRequest).getSubnetId());
        }

        return request;
    }

}
