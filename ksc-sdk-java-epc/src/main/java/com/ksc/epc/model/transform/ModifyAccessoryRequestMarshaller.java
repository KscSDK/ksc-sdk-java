package com.ksc.epc.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.epc.model.ModifyAccessoryRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

public class ModifyAccessoryRequestMarshaller implements
        Marshaller<Request<ModifyAccessoryRequest>, ModifyAccessoryRequest> {

    @Override
    public Request<ModifyAccessoryRequest> marshall(ModifyAccessoryRequest modifyAccessoryRequest) {
        if (modifyAccessoryRequest == null) {
            throw new KscClientException("Invalid argument passed to marshall(...)");
        }

        Request<ModifyAccessoryRequest> request = new DefaultRequest<ModifyAccessoryRequest>(
                modifyAccessoryRequest, "epc");
        request.addParameter("Action", "ModifyAccessory");
        String version = modifyAccessoryRequest.getVersion();
        if (org.apache.commons.lang.StringUtils.isBlank(version)) {
            version = "2015-11-01";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);

        if (!StringUtils.isNullOrEmpty(modifyAccessoryRequest.getAccessoryId())) {
            request.addParameter("AccessoryId", modifyAccessoryRequest.getAccessoryId());
        }
        if (!StringUtils.isNullOrEmpty(modifyAccessoryRequest.getAccessoryName())) {
            request.addParameter("AccessoryName", modifyAccessoryRequest.getAccessoryName());
        }

        return request;
    }
}