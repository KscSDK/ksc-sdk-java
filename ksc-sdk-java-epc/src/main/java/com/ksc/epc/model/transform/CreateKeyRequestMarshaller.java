package com.ksc.epc.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.epc.model.CreateKeyRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

public class CreateKeyRequestMarshaller implements
        Marshaller<Request<CreateKeyRequest>, CreateKeyRequest> {

    @Override
    public Request<CreateKeyRequest> marshall(CreateKeyRequest createKeyRequest) {
        if (createKeyRequest == null) {
            throw new KscClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateKeyRequest> request = new DefaultRequest<CreateKeyRequest>(
                createKeyRequest, "epc");
        request.addParameter("Action", "CreateKey");
        String version = createKeyRequest.getVersion();
        if (org.apache.commons.lang.StringUtils.isBlank(version)) {
            version = "2015-11-01";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);

        if (!StringUtils.isNullOrEmpty(createKeyRequest.getKeyName())) {
            request.addParameter("KeyName", createKeyRequest.getKeyName());
        }

        return request;
    }
}