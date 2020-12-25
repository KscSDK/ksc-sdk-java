package com.ksc.epc.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.epc.model.DeleteRemoteManagementRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

public class DeleteRemoteManagementRequestMarshaller implements
        Marshaller<Request<DeleteRemoteManagementRequest>, DeleteRemoteManagementRequest> {

    @Override
    public Request<DeleteRemoteManagementRequest> marshall(DeleteRemoteManagementRequest deleteRemoteManagementRequest) {
        if (deleteRemoteManagementRequest == null) {
            throw new KscClientException("Invalid argument passed to marshall(...)");
        }

        Request<DeleteRemoteManagementRequest> request = new DefaultRequest<DeleteRemoteManagementRequest>(
                deleteRemoteManagementRequest, "epc");
        request.addParameter("Action", "DeleteRemoteManagement");
        String version = deleteRemoteManagementRequest.getVersion();
        if (org.apache.commons.lang.StringUtils.isBlank(version)) {
            version = "2015-11-01";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);

        if (!StringUtils.isNullOrEmpty(deleteRemoteManagementRequest.getRemoteManagementId())) {
            request.addParameter("RemoteManagementId", deleteRemoteManagementRequest.getRemoteManagementId());
        }

        return request;
    }
}