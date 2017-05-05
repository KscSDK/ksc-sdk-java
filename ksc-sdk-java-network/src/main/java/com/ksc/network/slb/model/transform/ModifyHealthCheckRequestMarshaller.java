package com.ksc.network.slb.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.network.slb.model.ConfigureHealthCheckRequest;
import com.ksc.network.slb.model.ModifyHealthCheckRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

/**
 * CreateVpcRequest Marshaller
 */

public class ModifyHealthCheckRequestMarshaller implements
        Marshaller<Request<ModifyHealthCheckRequest>, ModifyHealthCheckRequest> {

    public Request<ModifyHealthCheckRequest> marshall(
            ModifyHealthCheckRequest modifyHealthCheckRequest) {

        if (modifyHealthCheckRequest == null) {
            throw new KscClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<ModifyHealthCheckRequest> request = new DefaultRequest<ModifyHealthCheckRequest>(
                modifyHealthCheckRequest, "slb");
        request.addParameter("Action", "ModifyHealthCheck");
        String version = modifyHealthCheckRequest.getVersion();
        if (org.apache.commons.lang.StringUtils.isBlank(version)) {
            version = "2016-03-04";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);

        if (!StringUtils.isNullOrEmpty(modifyHealthCheckRequest.getHealthCheckId())) {
            request.addParameter("HealthCheckId", modifyHealthCheckRequest.getHealthCheckId());
        }

        if (!StringUtils.isNullOrEmpty(modifyHealthCheckRequest.getHealthCheckState())) {
            request.addParameter("HealthCheckState", modifyHealthCheckRequest.getHealthCheckState());
        }

        if (modifyHealthCheckRequest.getHealthyThreshold() != null) {
            request.addParameter("HealthyThreshold", StringUtils
                    .fromInteger(modifyHealthCheckRequest.getHealthyThreshold()));
        }

        if (modifyHealthCheckRequest.getInterval() != null) {
            request.addParameter("Interval", StringUtils
                    .fromInteger(modifyHealthCheckRequest.getInterval()));
        }

        if (modifyHealthCheckRequest.getTimeout() != null) {
            request.addParameter("Timeout", StringUtils
                    .fromInteger(modifyHealthCheckRequest.getTimeout()));
        }

        if (modifyHealthCheckRequest.getUnhealthyThreshold() != null) {
            request.addParameter("UnhealthyThreshold", StringUtils
                    .fromInteger(modifyHealthCheckRequest.getUnhealthyThreshold()));
        }

        if (!StringUtils.isNullOrEmpty(modifyHealthCheckRequest.getUrlPath())) {
            request.addParameter("UrlPath", modifyHealthCheckRequest.getUrlPath());
        }

        if (modifyHealthCheckRequest.getDefaultHostName() != null) {
            request.addParameter("IsDefaultHostName", StringUtils
                    .fromBoolean(modifyHealthCheckRequest.getDefaultHostName()));
        }

        if (!StringUtils.isNullOrEmpty(modifyHealthCheckRequest.getHostName())) {
            request.addParameter("HostName", modifyHealthCheckRequest.getHostName());
        }

        return request;
    }

}
