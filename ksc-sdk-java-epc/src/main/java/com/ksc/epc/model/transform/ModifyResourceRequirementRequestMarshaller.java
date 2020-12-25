package com.ksc.epc.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.epc.model.ModifyResourceRequirementRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

public class ModifyResourceRequirementRequestMarshaller implements
        Marshaller<Request<ModifyResourceRequirementRequest>, ModifyResourceRequirementRequest> {

    @Override
    public Request<ModifyResourceRequirementRequest> marshall(ModifyResourceRequirementRequest modifyResourceRequirementRequest) {
        if (modifyResourceRequirementRequest == null) {
            throw new KscClientException("Invalid argument passed to marshall(...)");
        }

        Request<ModifyResourceRequirementRequest> request = new DefaultRequest<ModifyResourceRequirementRequest>(
                modifyResourceRequirementRequest, "epc");
        request.addParameter("Action", "ModifyResourceRequirement");
        String version = modifyResourceRequirementRequest.getVersion();
        if (org.apache.commons.lang.StringUtils.isBlank(version)) {
            version = "2015-11-01";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);

        if (!StringUtils.isNullOrEmpty(modifyResourceRequirementRequest.getResourceRequirementId())) {
            request.addParameter("ResourceRequirementId", modifyResourceRequirementRequest.getResourceRequirementId());
        }
        if (!StringUtils.isNullOrEmpty(modifyResourceRequirementRequest.getProjectName())) {
            request.addParameter("ProjectName", modifyResourceRequirementRequest.getProjectName());
        }
        if (!StringUtils.isNullOrEmpty(modifyResourceRequirementRequest.getDescription())) {
            request.addParameter("Description", modifyResourceRequirementRequest.getDescription());
        }

        return request;
    }
}