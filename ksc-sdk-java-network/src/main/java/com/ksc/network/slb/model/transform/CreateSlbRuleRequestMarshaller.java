package com.ksc.network.slb.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.network.slb.model.CreateSlbRuleRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

public class CreateSlbRuleRequestMarshaller implements
        Marshaller<Request<CreateSlbRuleRequest>, CreateSlbRuleRequest> {

    @Override
    public Request<CreateSlbRuleRequest> marshall(CreateSlbRuleRequest createSlbRuleRequest) {
        if (createSlbRuleRequest == null) {
            throw new KscClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateSlbRuleRequest> request = new DefaultRequest<CreateSlbRuleRequest>(
                createSlbRuleRequest, "slb");
        request.addParameter("Action", "CreateSlbRule");
        String version = createSlbRuleRequest.getVersion();
        if (org.apache.commons.lang.StringUtils.isBlank(version)) {
            version = "2016-03-04";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);

        if (!StringUtils.isNullOrEmpty(createSlbRuleRequest.getPath())) {
            request.addParameter("Path", createSlbRuleRequest.getPath());
        }
        if (!StringUtils.isNullOrEmpty(createSlbRuleRequest.getBackendServerGroupId())) {
            request.addParameter("BackendServerGroupId", createSlbRuleRequest.getBackendServerGroupId());
        }
        if (!StringUtils.isNullOrEmpty(createSlbRuleRequest.getHostHeaderId())) {
            request.addParameter("HostHeaderId", createSlbRuleRequest.getHostHeaderId());
        }
        if (!StringUtils.isNullOrEmpty(createSlbRuleRequest.getListenerSync())) {
            request.addParameter("ListenerSync", createSlbRuleRequest.getListenerSync());
        }
        if (!StringUtils.isNullOrEmpty(createSlbRuleRequest.getMethod())) {
            request.addParameter("Method", createSlbRuleRequest.getMethod());
        }
        if (!StringUtils.isNullOrEmpty(createSlbRuleRequest.getSessionState())) {
            request.addParameter("SessionState", createSlbRuleRequest.getSessionState());
        }
        if (createSlbRuleRequest.getSessionPersistencePeriod() != null) {
            request.addParameter("SessionPersistencePeriod", String.valueOf(createSlbRuleRequest.getSessionPersistencePeriod()));
        }
        if (!StringUtils.isNullOrEmpty(createSlbRuleRequest.getCookieType())) {
            request.addParameter("CookieType", createSlbRuleRequest.getCookieType());
        }
        if (!StringUtils.isNullOrEmpty(createSlbRuleRequest.getCookieName())) {
            request.addParameter("CookieName", createSlbRuleRequest.getCookieName());
        }
        if (createSlbRuleRequest.getTimeout() != null) {
            request.addParameter("Timeout", String.valueOf(createSlbRuleRequest.getTimeout()));
        }
        if (createSlbRuleRequest.getInterval() != null) {
            request.addParameter("Interval", String.valueOf(createSlbRuleRequest.getInterval()));
        }
        if (createSlbRuleRequest.getHealthyThreshold() != null) {
            request.addParameter("HealthyThreshold", String.valueOf(createSlbRuleRequest.getHealthyThreshold()));
        }
        if (createSlbRuleRequest.getUnhealthyThreshold() != null) {
            request.addParameter("UnhealthyThreshold", String.valueOf(createSlbRuleRequest.getUnhealthyThreshold()));
        }
        if (!StringUtils.isNullOrEmpty(createSlbRuleRequest.getUrlPath())) {
            request.addParameter("UrlPath", createSlbRuleRequest.getUrlPath());
        }
        if (!StringUtils.isNullOrEmpty(createSlbRuleRequest.getHostName())) {
            request.addParameter("HostName", createSlbRuleRequest.getHostName());
        }
        if (!StringUtils.isNullOrEmpty(createSlbRuleRequest.getHealthCheckState())) {
            request.addParameter("HealthCheckState", createSlbRuleRequest.getHealthCheckState());
        }

        return request;
    }
}