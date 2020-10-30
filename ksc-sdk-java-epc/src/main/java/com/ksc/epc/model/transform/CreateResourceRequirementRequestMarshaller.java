package com.ksc.epc.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.epc.model.CreateResourceRequirementRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

public class CreateResourceRequirementRequestMarshaller implements
        Marshaller<Request<CreateResourceRequirementRequest>, CreateResourceRequirementRequest> {

    @Override
    public Request<CreateResourceRequirementRequest> marshall(CreateResourceRequirementRequest createResourceRequirementRequest) {
        if (createResourceRequirementRequest == null) {
            throw new KscClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateResourceRequirementRequest> request = new DefaultRequest<CreateResourceRequirementRequest>(
                createResourceRequirementRequest, "epc");
        request.addParameter("Action", "CreateResourceRequirement");
        String version = createResourceRequirementRequest.getVersion();
        if (org.apache.commons.lang.StringUtils.isBlank(version)) {
            version = "2015-11-01";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);

        if (!StringUtils.isNullOrEmpty(createResourceRequirementRequest.getAvailabilityZone())) {
            request.addParameter("AvailabilityZone", createResourceRequirementRequest.getAvailabilityZone());
        }
        if (createResourceRequirementRequest.getRequirementCount() != null) {
            request.addParameter("RequirementCount", String.valueOf(createResourceRequirementRequest.getRequirementCount()));
        }
        if (!StringUtils.isNullOrEmpty(createResourceRequirementRequest.getProjectName())) {
            request.addParameter("ProjectName", createResourceRequirementRequest.getProjectName());
        }
        if (!StringUtils.isNullOrEmpty(createResourceRequirementRequest.getUsageDate())) {
            request.addParameter("UsageDate", createResourceRequirementRequest.getUsageDate());
        }
        if (!StringUtils.isNullOrEmpty(createResourceRequirementRequest.getDescription())) {
            request.addParameter("Description", createResourceRequirementRequest.getDescription());
        }
        if (!StringUtils.isNullOrEmpty(createResourceRequirementRequest.getHostType())) {
            request.addParameter("HostType", createResourceRequirementRequest.getHostType());
        }

        return request;
    }
}