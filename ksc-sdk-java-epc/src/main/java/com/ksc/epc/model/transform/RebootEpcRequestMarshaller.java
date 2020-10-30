package com.ksc.epc.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.epc.model.RebootEpcRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

public class RebootEpcRequestMarshaller implements
        Marshaller<Request<RebootEpcRequest>, RebootEpcRequest> {

    @Override
    public Request<RebootEpcRequest> marshall(RebootEpcRequest rebootEpcRequest) {
        if (rebootEpcRequest == null) {
            throw new KscClientException("Invalid argument passed to marshall(...)");
        }

        Request<RebootEpcRequest> request = new DefaultRequest<RebootEpcRequest>(
                rebootEpcRequest, "epc");
        request.addParameter("Action", "RebootEpc");
        String version = rebootEpcRequest.getVersion();
        if (org.apache.commons.lang.StringUtils.isBlank(version)) {
            version = "2015-11-01";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);

        if (!StringUtils.isNullOrEmpty(rebootEpcRequest.getHostId())) {
            request.addParameter("HostId", rebootEpcRequest.getHostId());
        }

        return request;
    }
}