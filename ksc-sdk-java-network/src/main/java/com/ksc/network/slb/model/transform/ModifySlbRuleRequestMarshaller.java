package com.ksc.network.slb.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.network.slb.model.ModifySlbRuleRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

public class ModifySlbRuleRequestMarshaller implements
        Marshaller<Request<ModifySlbRuleRequest>, ModifySlbRuleRequest> {

    @Override
    public Request<ModifySlbRuleRequest> marshall(ModifySlbRuleRequest modifySlbRuleRequest) {
        if (modifySlbRuleRequest == null) {
            throw new KscClientException("Invalid argument passed to marshall(...)");
        }

        Request<ModifySlbRuleRequest> request = new DefaultRequest<ModifySlbRuleRequest>(
                modifySlbRuleRequest, "slb");
        request.addParameter("Action", "ModifySlbRule");
        String version = modifySlbRuleRequest.getVersion();
        if (org.apache.commons.lang.StringUtils.isBlank(version)) {
            version = "2016-03-04";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);

        if (!StringUtils.isNullOrEmpty(modifySlbRuleRequest.getRuleId())) {
            request.addParameter("RuleId", modifySlbRuleRequest.getRuleId());
        }
        if (!StringUtils.isNullOrEmpty(modifySlbRuleRequest.getBackendServerGroupId())) {
            request.addParameter("BackendServerGroupId", modifySlbRuleRequest.getBackendServerGroupId());
        }
        if (!StringUtils.isNullOrEmpty(modifySlbRuleRequest.getListenerSync())) {
            request.addParameter("ListenerSync", modifySlbRuleRequest.getListenerSync());
        }
        if (!StringUtils.isNullOrEmpty(modifySlbRuleRequest.getMethod())) {
            request.addParameter("Method", modifySlbRuleRequest.getMethod());
        }
        if (!StringUtils.isNullOrEmpty(modifySlbRuleRequest.getSessionState())) {
            request.addParameter("SessionState", modifySlbRuleRequest.getSessionState());
        }
        if (modifySlbRuleRequest.getSessionPersistencePeriod() != null) {
            request.addParameter("SessionPersistencePeriod", String.valueOf(modifySlbRuleRequest.getSessionPersistencePeriod()));
        }
        if (!StringUtils.isNullOrEmpty(modifySlbRuleRequest.getCookieType())) {
            request.addParameter("CookieType", modifySlbRuleRequest.getCookieType());
        }
        if (!StringUtils.isNullOrEmpty(modifySlbRuleRequest.getCookieName())) {
            request.addParameter("CookieName", modifySlbRuleRequest.getCookieName());
        }
        if (modifySlbRuleRequest.getTimeout() != null) {
            request.addParameter("Timeout", String.valueOf(modifySlbRuleRequest.getTimeout()));
        }
        if (modifySlbRuleRequest.getInterval() != null) {
            request.addParameter("Interval", String.valueOf(modifySlbRuleRequest.getInterval()));
        }
        if (modifySlbRuleRequest.getHealthyThreshold() != null) {
            request.addParameter("HealthyThreshold", String.valueOf(modifySlbRuleRequest.getHealthyThreshold()));
        }
        if (modifySlbRuleRequest.getUnhealthyThreshold() != null) {
            request.addParameter("UnhealthyThreshold", String.valueOf(modifySlbRuleRequest.getUnhealthyThreshold()));
        }
        if (!StringUtils.isNullOrEmpty(modifySlbRuleRequest.getUrlPath())) {
            request.addParameter("UrlPath", modifySlbRuleRequest.getUrlPath());
        }
        if (!StringUtils.isNullOrEmpty(modifySlbRuleRequest.getHostName())) {
            request.addParameter("HostName", modifySlbRuleRequest.getHostName());
        }
        if (!StringUtils.isNullOrEmpty(modifySlbRuleRequest.getHealthCheckState())) {
            request.addParameter("HealthCheckState", modifySlbRuleRequest.getHealthCheckState());
        }

        return request;
    }
}