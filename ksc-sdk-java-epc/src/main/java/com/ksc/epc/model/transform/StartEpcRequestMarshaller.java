package com.ksc.epc.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.epc.model.StartEpcRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

public class StartEpcRequestMarshaller implements
        Marshaller<Request<StartEpcRequest>, StartEpcRequest> {

    @Override
    public Request<StartEpcRequest> marshall(StartEpcRequest startEpcRequest) {
        if (startEpcRequest == null) {
            throw new KscClientException("Invalid argument passed to marshall(...)");
        }

        Request<StartEpcRequest> request = new DefaultRequest<StartEpcRequest>(
                startEpcRequest, "epc");
        request.addParameter("Action", "StartEpc");
        String version = startEpcRequest.getVersion();
        if (org.apache.commons.lang.StringUtils.isBlank(version)) {
            version = "2015-11-01";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);

        if (!StringUtils.isNullOrEmpty(startEpcRequest.getHostId())) {
            request.addParameter("HostId", startEpcRequest.getHostId());
        }

        return request;
    }
}