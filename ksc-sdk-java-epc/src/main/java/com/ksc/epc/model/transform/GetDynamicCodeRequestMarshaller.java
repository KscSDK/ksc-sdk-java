package com.ksc.epc.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.epc.model.GetDynamicCodeRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

public class GetDynamicCodeRequestMarshaller implements
        Marshaller<Request<GetDynamicCodeRequest>, GetDynamicCodeRequest> {

    @Override
    public Request<GetDynamicCodeRequest> marshall(GetDynamicCodeRequest getDynamicCodeRequest) {
        if (getDynamicCodeRequest == null) {
            throw new KscClientException("Invalid argument passed to marshall(...)");
        }

        Request<GetDynamicCodeRequest> request = new DefaultRequest<GetDynamicCodeRequest>(
                getDynamicCodeRequest, "epc");
        request.addParameter("Action", "GetDynamicCode");
        String version = getDynamicCodeRequest.getVersion();
        if (org.apache.commons.lang.StringUtils.isBlank(version)) {
            version = "2015-11-01";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);

        if (!StringUtils.isNullOrEmpty(getDynamicCodeRequest.getRemoteManagementId())) {
            request.addParameter("RemoteManagementId", getDynamicCodeRequest.getRemoteManagementId());
        }

        return request;
    }
}