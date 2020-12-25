package com.ksc.epc.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.epc.model.ImportKeyRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

public class ImportKeyRequestMarshaller implements
        Marshaller<Request<ImportKeyRequest>, ImportKeyRequest> {

    @Override
    public Request<ImportKeyRequest> marshall(ImportKeyRequest importKeyRequest) {
        if (importKeyRequest == null) {
            throw new KscClientException("Invalid argument passed to marshall(...)");
        }

        Request<ImportKeyRequest> request = new DefaultRequest<ImportKeyRequest>(
                importKeyRequest, "epc");
        request.addParameter("Action", "ImportKey");
        String version = importKeyRequest.getVersion();
        if (org.apache.commons.lang.StringUtils.isBlank(version)) {
            version = "2015-11-01";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);

        if (!StringUtils.isNullOrEmpty(importKeyRequest.getKeyName())) {
            request.addParameter("KeyName", importKeyRequest.getKeyName());
        }
        if (!StringUtils.isNullOrEmpty(importKeyRequest.getPublicKey())) {
            request.addParameter("PublicKey", importKeyRequest.getPublicKey());
        }

        return request;
    }
}