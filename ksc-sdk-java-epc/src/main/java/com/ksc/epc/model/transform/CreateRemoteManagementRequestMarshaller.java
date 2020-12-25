package com.ksc.epc.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.epc.model.CreateRemoteManagementRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

public class CreateRemoteManagementRequestMarshaller implements
        Marshaller<Request<CreateRemoteManagementRequest>, CreateRemoteManagementRequest> {

    @Override
    public Request<CreateRemoteManagementRequest> marshall(CreateRemoteManagementRequest createRemoteManagementRequest) {
        if (createRemoteManagementRequest == null) {
            throw new KscClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateRemoteManagementRequest> request = new DefaultRequest<CreateRemoteManagementRequest>(
                createRemoteManagementRequest, "epc");
        request.addParameter("Action", "CreateRemoteManagement");
        String version = createRemoteManagementRequest.getVersion();
        if (org.apache.commons.lang.StringUtils.isBlank(version)) {
            version = "2015-11-01";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);

        if (!StringUtils.isNullOrEmpty(createRemoteManagementRequest.getPhoneNumber())) {
            request.addParameter("PhoneNumber", createRemoteManagementRequest.getPhoneNumber());
        }
        if (!StringUtils.isNullOrEmpty(createRemoteManagementRequest.getPin())) {
            request.addParameter("Pin", createRemoteManagementRequest.getPin());
        }
        if (!StringUtils.isNullOrEmpty(createRemoteManagementRequest.getName())) {
            request.addParameter("Name", createRemoteManagementRequest.getName());
        }

        return request;
    }
}