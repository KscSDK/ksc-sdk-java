package com.ksc.epc.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.epc.model.CreateProcessRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

public class CreateProcessRequestMarshaller implements
        Marshaller<Request<CreateProcessRequest>, CreateProcessRequest> {

    @Override
    public Request<CreateProcessRequest> marshall(CreateProcessRequest createProcessRequest) {
        if (createProcessRequest == null) {
            throw new KscClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateProcessRequest> request = new DefaultRequest<CreateProcessRequest>(
                createProcessRequest, "epc");
        request.addParameter("Action", "CreateProcess");
        String version = createProcessRequest.getVersion();
        if (org.apache.commons.lang.StringUtils.isBlank(version)) {
            version = "2015-11-01";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);

        if (!StringUtils.isNullOrEmpty(createProcessRequest.getProcessId())) {
            request.addParameter("ProcessId", createProcessRequest.getProcessId());
        }
        if (!StringUtils.isNullOrEmpty(createProcessRequest.getSn())) {
            request.addParameter("Sn", createProcessRequest.getSn());
        }
        if (!StringUtils.isNullOrEmpty(createProcessRequest.getAvailabilityZone())) {
            request.addParameter("AvailabilityZone", createProcessRequest.getAvailabilityZone());
        }
        if (!StringUtils.isNullOrEmpty(createProcessRequest.getConfirm())) {
            request.addParameter("Confirm", createProcessRequest.getConfirm());
        }
        if (!StringUtils.isNullOrEmpty(createProcessRequest.getType())) {
            request.addParameter("Type", createProcessRequest.getType());
        }
        if (!StringUtils.isNullOrEmpty(createProcessRequest.getTitle())) {
            request.addParameter("Title", createProcessRequest.getTitle());
        }
        if (!StringUtils.isNullOrEmpty(createProcessRequest.getMachineCount())) {
            request.addParameter("MachineCount", createProcessRequest.getMachineCount());
        }
        if (!StringUtils.isNullOrEmpty(createProcessRequest.getContent())) {
            request.addParameter("Content", createProcessRequest.getContent());
        }
        if (!StringUtils.isNullOrEmpty(createProcessRequest.getAttribute())) {
            request.addParameter("Attribute", createProcessRequest.getAttribute());
        }

        return request;
    }
}