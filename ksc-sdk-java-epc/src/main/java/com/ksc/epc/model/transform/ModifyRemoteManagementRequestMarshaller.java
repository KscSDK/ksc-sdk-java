package com.ksc.epc.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.epc.model.ModifyRemoteManagementRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

public class ModifyRemoteManagementRequestMarshaller implements
        Marshaller<Request<ModifyRemoteManagementRequest>, ModifyRemoteManagementRequest> {

    @Override
    public Request<ModifyRemoteManagementRequest> marshall(ModifyRemoteManagementRequest modifyRemoteManagementRequest) {
        if (modifyRemoteManagementRequest == null) {
            throw new KscClientException("Invalid argument passed to marshall(...)");
        }

        Request<ModifyRemoteManagementRequest> request = new DefaultRequest<ModifyRemoteManagementRequest>(
                modifyRemoteManagementRequest, "epc");
        request.addParameter("Action", "ModifyRemoteManagement");
        String version = modifyRemoteManagementRequest.getVersion();
        if (org.apache.commons.lang.StringUtils.isBlank(version)) {
            version = "2015-11-01";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);

        if (!StringUtils.isNullOrEmpty(modifyRemoteManagementRequest.getRemoteManagementId())) {
            request.addParameter("RemoteManagementId", modifyRemoteManagementRequest.getRemoteManagementId());
        }
        if (!StringUtils.isNullOrEmpty(modifyRemoteManagementRequest.getDynamicCode())) {
            request.addParameter("DynamicCode", modifyRemoteManagementRequest.getDynamicCode());
        }
        if (!StringUtils.isNullOrEmpty(modifyRemoteManagementRequest.getNewPhoneNumber())) {
            request.addParameter("NewPhoneNumber", modifyRemoteManagementRequest.getNewPhoneNumber());
        }
        if (!StringUtils.isNullOrEmpty(modifyRemoteManagementRequest.getPin())) {
            request.addParameter("Pin", modifyRemoteManagementRequest.getPin());
        }
        if (!StringUtils.isNullOrEmpty(modifyRemoteManagementRequest.getNewPin())) {
            request.addParameter("NewPin", modifyRemoteManagementRequest.getNewPin());
        }
        if (!StringUtils.isNullOrEmpty(modifyRemoteManagementRequest.getName())) {
            request.addParameter("Name", modifyRemoteManagementRequest.getName());
        }

        return request;
    }
}