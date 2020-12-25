package com.ksc.epc.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.epc.model.ReinstallCustomerEpcRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

public class ReinstallCustomerEpcRequestMarshaller implements
        Marshaller<Request<ReinstallCustomerEpcRequest>, ReinstallCustomerEpcRequest> {

    @Override
    public Request<ReinstallCustomerEpcRequest> marshall(ReinstallCustomerEpcRequest reinstallCustomerEpcRequest) {
        if (reinstallCustomerEpcRequest == null) {
            throw new KscClientException("Invalid argument passed to marshall(...)");
        }

        Request<ReinstallCustomerEpcRequest> request = new DefaultRequest<ReinstallCustomerEpcRequest>(
                reinstallCustomerEpcRequest, "epc");
        request.addParameter("Action", "ReinstallCustomerEpc");
        String version = reinstallCustomerEpcRequest.getVersion();
        if (org.apache.commons.lang.StringUtils.isBlank(version)) {
            version = "2015-11-01";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);

        if (!StringUtils.isNullOrEmpty(reinstallCustomerEpcRequest.getHostId())) {
            request.addParameter("HostId", reinstallCustomerEpcRequest.getHostId());
        }
        if (!StringUtils.isNullOrEmpty(reinstallCustomerEpcRequest.getServerIp())) {
            request.addParameter("ServerIp", reinstallCustomerEpcRequest.getServerIp());
        }
        if (!StringUtils.isNullOrEmpty(reinstallCustomerEpcRequest.getPath())) {
            request.addParameter("Path", reinstallCustomerEpcRequest.getPath());
        }

        return request;
    }
}