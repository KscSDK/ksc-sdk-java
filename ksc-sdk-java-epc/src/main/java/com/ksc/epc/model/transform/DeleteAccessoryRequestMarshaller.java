package com.ksc.epc.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.epc.model.DeleteAccessoryRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

public class DeleteAccessoryRequestMarshaller implements
        Marshaller<Request<DeleteAccessoryRequest>, DeleteAccessoryRequest> {

    @Override
    public Request<DeleteAccessoryRequest> marshall(DeleteAccessoryRequest deleteAccessoryRequest) {
        if (deleteAccessoryRequest == null) {
            throw new KscClientException("Invalid argument passed to marshall(...)");
        }

        Request<DeleteAccessoryRequest> request = new DefaultRequest<DeleteAccessoryRequest>(
                deleteAccessoryRequest, "epc");
        request.addParameter("Action", "DeleteAccessory");
        String version = deleteAccessoryRequest.getVersion();
        if (org.apache.commons.lang.StringUtils.isBlank(version)) {
            version = "2015-11-01";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);

        if (!StringUtils.isNullOrEmpty(deleteAccessoryRequest.getAccessoryId())) {
            request.addParameter("AccessoryId", deleteAccessoryRequest.getAccessoryId());
        }

        return request;
    }
}