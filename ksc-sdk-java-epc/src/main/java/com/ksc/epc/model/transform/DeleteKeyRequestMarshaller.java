package com.ksc.epc.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.epc.model.DeleteKeyRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

public class DeleteKeyRequestMarshaller implements
        Marshaller<Request<DeleteKeyRequest>, DeleteKeyRequest> {

    @Override
    public Request<DeleteKeyRequest> marshall(DeleteKeyRequest deleteKeyRequest) {
        if (deleteKeyRequest == null) {
            throw new KscClientException("Invalid argument passed to marshall(...)");
        }

        Request<DeleteKeyRequest> request = new DefaultRequest<DeleteKeyRequest>(
                deleteKeyRequest, "epc");
        request.addParameter("Action", "DeleteKey");
        String version = deleteKeyRequest.getVersion();
        if (org.apache.commons.lang.StringUtils.isBlank(version)) {
            version = "2015-11-01";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);

        if (!StringUtils.isNullOrEmpty(deleteKeyRequest.getKeyId())) {
            request.addParameter("KeyId", deleteKeyRequest.getKeyId());
        }

        return request;
    }
}