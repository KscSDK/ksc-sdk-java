package com.ksc.epc.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.epc.model.DeleteEpcRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

public class DeleteEpcRequestMarshaller implements
        Marshaller<Request<DeleteEpcRequest>, DeleteEpcRequest> {

    @Override
    public Request<DeleteEpcRequest> marshall(DeleteEpcRequest deleteEpcRequest) {
        if (deleteEpcRequest == null) {
            throw new KscClientException("Invalid argument passed to marshall(...)");
        }

        Request<DeleteEpcRequest> request = new DefaultRequest<DeleteEpcRequest>(
                deleteEpcRequest, "epc");
        request.addParameter("Action", "DeleteEpc");
        String version = deleteEpcRequest.getVersion();
        if (org.apache.commons.lang.StringUtils.isBlank(version)) {
            version = "2015-11-01";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);

        if (!StringUtils.isNullOrEmpty(deleteEpcRequest.getHostId())) {
            request.addParameter("HostId", deleteEpcRequest.getHostId());
        }

        return request;
    }
}