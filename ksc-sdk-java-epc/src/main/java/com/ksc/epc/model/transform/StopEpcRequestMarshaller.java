package com.ksc.epc.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.epc.model.StopEpcRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

public class StopEpcRequestMarshaller implements
        Marshaller<Request<StopEpcRequest>, StopEpcRequest> {

    @Override
    public Request<StopEpcRequest> marshall(StopEpcRequest stopEpcRequest) {
        if (stopEpcRequest == null) {
            throw new KscClientException("Invalid argument passed to marshall(...)");
        }

        Request<StopEpcRequest> request = new DefaultRequest<StopEpcRequest>(
                stopEpcRequest, "epc");
        request.addParameter("Action", "StopEpc");
        String version = stopEpcRequest.getVersion();
        if (org.apache.commons.lang.StringUtils.isBlank(version)) {
            version = "2015-11-01";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);

        if (!StringUtils.isNullOrEmpty(stopEpcRequest.getHostId())) {
            request.addParameter("HostId", stopEpcRequest.getHostId());
        }

        return request;
    }
}