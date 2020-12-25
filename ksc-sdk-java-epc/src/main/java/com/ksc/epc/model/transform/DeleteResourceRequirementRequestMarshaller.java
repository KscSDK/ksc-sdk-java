package com.ksc.epc.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.epc.model.DeleteResourceRequirementRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

public class DeleteResourceRequirementRequestMarshaller implements
        Marshaller<Request<DeleteResourceRequirementRequest>, DeleteResourceRequirementRequest> {

    @Override
    public Request<DeleteResourceRequirementRequest> marshall(DeleteResourceRequirementRequest deleteResourceRequirementRequest) {
        if (deleteResourceRequirementRequest == null) {
            throw new KscClientException("Invalid argument passed to marshall(...)");
        }

        Request<DeleteResourceRequirementRequest> request = new DefaultRequest<DeleteResourceRequirementRequest>(
                deleteResourceRequirementRequest, "epc");
        request.addParameter("Action", "DeleteResourceRequirement");
        String version = deleteResourceRequirementRequest.getVersion();
        if (org.apache.commons.lang.StringUtils.isBlank(version)) {
            version = "2015-11-01";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);

        if (!StringUtils.isNullOrEmpty(deleteResourceRequirementRequest.getResourceRequirementId())) {
            request.addParameter("ResourceRequirementId", deleteResourceRequirementRequest.getResourceRequirementId());
        }

        return request;
    }
}