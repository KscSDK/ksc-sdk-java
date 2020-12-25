package com.ksc.epc.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.epc.model.ModifyKeyRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

public class ModifyKeyRequestMarshaller implements
        Marshaller<Request<ModifyKeyRequest>, ModifyKeyRequest> {

    @Override
    public Request<ModifyKeyRequest> marshall(ModifyKeyRequest modifyKeyRequest) {
        if (modifyKeyRequest == null) {
            throw new KscClientException("Invalid argument passed to marshall(...)");
        }

        Request<ModifyKeyRequest> request = new DefaultRequest<ModifyKeyRequest>(
                modifyKeyRequest, "epc");
        request.addParameter("Action", "ModifyKey");
        String version = modifyKeyRequest.getVersion();
        if (org.apache.commons.lang.StringUtils.isBlank(version)) {
            version = "2015-11-01";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);

        if (!StringUtils.isNullOrEmpty(modifyKeyRequest.getKeyId())) {
            request.addParameter("KeyId", modifyKeyRequest.getKeyId());
        }
        if (!StringUtils.isNullOrEmpty(modifyKeyRequest.getKeyName())) {
            request.addParameter("KeyName", modifyKeyRequest.getKeyName());
        }

        return request;
    }
}