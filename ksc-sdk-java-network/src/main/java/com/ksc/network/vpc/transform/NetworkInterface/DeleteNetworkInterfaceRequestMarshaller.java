package com.ksc.network.vpc.transform.NetworkInterface;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.network.vpc.model.NetworkInterface.DeleteNetworkInterfaceRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

public class DeleteNetworkInterfaceRequestMarshaller implements
        Marshaller<Request<DeleteNetworkInterfaceRequest>, DeleteNetworkInterfaceRequest> {

    @Override
    public Request<DeleteNetworkInterfaceRequest> marshall(DeleteNetworkInterfaceRequest deleteNetworkInterfaceRequest) {
        if (deleteNetworkInterfaceRequest == null) {
            throw new KscClientException("Invalid argument passed to marshall(...)");
        }

        Request<DeleteNetworkInterfaceRequest> request = new DefaultRequest<DeleteNetworkInterfaceRequest>(
                deleteNetworkInterfaceRequest, "vpc");
        request.addParameter("Action", "DeleteNetworkInterface");
        String version = deleteNetworkInterfaceRequest.getVersion();
        if (org.apache.commons.lang.StringUtils.isBlank(version)) {
            version = "2016-03-04";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);

        if (!StringUtils.isNullOrEmpty(deleteNetworkInterfaceRequest.getNetworkInterfaceId())) {
            request.addParameter("NetworkInterfaceId", deleteNetworkInterfaceRequest.getNetworkInterfaceId());
        }

        return request;
    }
}