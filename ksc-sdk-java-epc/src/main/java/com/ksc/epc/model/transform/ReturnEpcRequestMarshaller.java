package com.ksc.epc.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.epc.model.ReturnEpcRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

public class ReturnEpcRequestMarshaller implements
        Marshaller<Request<ReturnEpcRequest>, ReturnEpcRequest> {

    @Override
    public Request<ReturnEpcRequest> marshall(ReturnEpcRequest returnEpcRequest) {
        if (returnEpcRequest == null) {
            throw new KscClientException("Invalid argument passed to marshall(...)");
        }

        Request<ReturnEpcRequest> request = new DefaultRequest<ReturnEpcRequest>(
                returnEpcRequest, "epc");
        request.addParameter("Action", "ReturnEpc");
        String version = returnEpcRequest.getVersion();
        if (org.apache.commons.lang.StringUtils.isBlank(version)) {
            version = "2015-11-01";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);

        if (!StringUtils.isNullOrEmpty(returnEpcRequest.getHostId())) {
            request.addParameter("HostId", returnEpcRequest.getHostId());
        }

        return request;
    }
}