package com.ksc.network.slb.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.network.slb.model.ConfigureHealthCheckRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

/**
 * ConfigureHealthCheckRequest Marshaller
 */

public class ConfigureHealthCheckRequestMarshaller implements
        Marshaller<Request<ConfigureHealthCheckRequest>, ConfigureHealthCheckRequest> {

    public Request<ConfigureHealthCheckRequest> marshall(
            ConfigureHealthCheckRequest configureHealthCheckRequest) {

        if (configureHealthCheckRequest == null) {
            throw new KscClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<ConfigureHealthCheckRequest> request = new DefaultRequest<ConfigureHealthCheckRequest>(
                configureHealthCheckRequest, "slb");
        request.addParameter("Action", "ConfigureHealthCheck");
        String version = configureHealthCheckRequest.getVersion();
        if (org.apache.commons.lang.StringUtils.isBlank(version)) {
            version = "2016-03-04";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);

        if (!StringUtils.isNullOrEmpty(configureHealthCheckRequest.getListenerId())) {
            request.addParameter("ListenerId", configureHealthCheckRequest.getListenerId());
        }

        if (!StringUtils.isNullOrEmpty(configureHealthCheckRequest.getHealthCheckState())) {
            request.addParameter("HealthCheckState", configureHealthCheckRequest.getHealthCheckState());
        }

        if (configureHealthCheckRequest.getHealthyThreshold() != null) {
            request.addParameter("HealthyThreshold", StringUtils
                    .fromInteger(configureHealthCheckRequest.getHealthyThreshold()));
        }

        if (configureHealthCheckRequest.getInterval() != null) {
            request.addParameter("Interval", StringUtils
                    .fromInteger(configureHealthCheckRequest.getInterval()));
        }

        if (configureHealthCheckRequest.getTimeout() != null) {
            request.addParameter("Timeout", StringUtils
                    .fromInteger(configureHealthCheckRequest.getTimeout()));
        }

        if (configureHealthCheckRequest.getUnhealthyThreshold() != null) {
            request.addParameter("UnhealthyThreshold", StringUtils
                    .fromInteger(configureHealthCheckRequest.getUnhealthyThreshold()));
        }

        if (!StringUtils.isNullOrEmpty(configureHealthCheckRequest.getUrlPath())) {
            request.addParameter("UrlPath", configureHealthCheckRequest.getUrlPath());
        }

        if (configureHealthCheckRequest.getDefaultHostName() != null) {
            request.addParameter("IsDefaultHostName", StringUtils
                    .fromBoolean(configureHealthCheckRequest.getDefaultHostName()));
        }

        if (!StringUtils.isNullOrEmpty(configureHealthCheckRequest.getHostName())) {
            request.addParameter("HostName", configureHealthCheckRequest.getHostName());
        }

        return request;
    }

}
