package com.ksc.epc.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.epc.model.ResetPasswordRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

public class ResetPasswordRequestMarshaller implements
        Marshaller<Request<ResetPasswordRequest>, ResetPasswordRequest> {

    @Override
    public Request<ResetPasswordRequest> marshall(ResetPasswordRequest resetPasswordRequest) {
        if (resetPasswordRequest == null) {
            throw new KscClientException("Invalid argument passed to marshall(...)");
        }

        Request<ResetPasswordRequest> request = new DefaultRequest<ResetPasswordRequest>(
                resetPasswordRequest, "epc");
        request.addParameter("Action", "ResetPassword");
        String version = resetPasswordRequest.getVersion();
        if (org.apache.commons.lang.StringUtils.isBlank(version)) {
            version = "2015-11-01";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);

        if (!StringUtils.isNullOrEmpty(resetPasswordRequest.getPassword())) {
            request.addParameter("Password", resetPasswordRequest.getPassword());
        }
        if (!StringUtils.isNullOrEmpty(resetPasswordRequest.getHostId())) {
            request.addParameter("HostId", resetPasswordRequest.getHostId());
        }

        return request;
    }
}