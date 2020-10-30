package com.ksc.epc.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.epc.model.RecoverEpcRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

public class RecoverEpcRequestMarshaller implements
        Marshaller<Request<RecoverEpcRequest>, RecoverEpcRequest> {

    @Override
    public Request<RecoverEpcRequest> marshall(RecoverEpcRequest recoverEpcRequest) {
        if (recoverEpcRequest == null) {
            throw new KscClientException("Invalid argument passed to marshall(...)");
        }

        Request<RecoverEpcRequest> request = new DefaultRequest<RecoverEpcRequest>(
                recoverEpcRequest, "epc");
        request.addParameter("Action", "RecoverEpc");
        String version = recoverEpcRequest.getVersion();
        if (org.apache.commons.lang.StringUtils.isBlank(version)) {
            version = "2015-11-01";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);

        if (!StringUtils.isNullOrEmpty(recoverEpcRequest.getHostId())) {
            request.addParameter("HostId", recoverEpcRequest.getHostId());
        }

        return request;
    }
}