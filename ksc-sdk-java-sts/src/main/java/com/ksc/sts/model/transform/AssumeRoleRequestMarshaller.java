package com.ksc.sts.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.sts.model.AssumeRoleRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

public class AssumeRoleRequestMarshaller
        implements Marshaller<Request<AssumeRoleRequest>, AssumeRoleRequest> {

    @Override
    public Request<AssumeRoleRequest> marshall(
            AssumeRoleRequest AssumeRoleRequest) {
        if (AssumeRoleRequest == null) {
            throw new KscClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<AssumeRoleRequest> request = new DefaultRequest<AssumeRoleRequest>(
                AssumeRoleRequest, "sts");
        request.addParameter("Action", "AssumeRole");

        String version = AssumeRoleRequest.getVersion();
        if (org.apache.commons.lang.StringUtils.isBlank(version)) {
            version = "2015-11-01";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);

        String roleKrn = AssumeRoleRequest.getRoleKrn();
        if (StringUtils.isNullOrEmpty(roleKrn)) {
            throw new KscClientException(
                    "Invalid argument roleKrn passed to marshall(...)");
        } else {
            request.addParameter("RoleKrn", roleKrn);
        }

        String roleSessionName = AssumeRoleRequest.getRoleSessionName();
        if (StringUtils.isNullOrEmpty(roleSessionName)) {
            throw new KscClientException(
                    "Invalid argument roleSessionName passed to marshall(...)");
        } else {
            request.addParameter("RoleSessionName", roleSessionName);
        }

        Integer durationSeconds = AssumeRoleRequest.getDurationSeconds();
        if (null != durationSeconds) {
            request.addParameter("DurationSeconds",
                    StringUtils.fromInteger(durationSeconds));
        }

        return request;
    }

}
