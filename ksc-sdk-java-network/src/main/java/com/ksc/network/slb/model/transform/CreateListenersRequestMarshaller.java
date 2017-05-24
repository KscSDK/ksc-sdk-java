package com.ksc.network.slb.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.network.slb.model.CreateListenersRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

/**
 * CreateListenersRequest Marshaller
 */

public class CreateListenersRequestMarshaller implements
        Marshaller<Request<CreateListenersRequest>, CreateListenersRequest> {

    public Request<CreateListenersRequest> marshall(
            CreateListenersRequest createListenersRequest) {

        if (createListenersRequest == null) {
            throw new KscClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<CreateListenersRequest> request = new DefaultRequest<CreateListenersRequest>(
                createListenersRequest, "slb");
        request.addParameter("Action", "CreateListeners");
        String version = createListenersRequest.getVersion();
        if (org.apache.commons.lang.StringUtils.isBlank(version)) {
            version = "2016-03-04";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);

        if (!StringUtils.isNullOrEmpty(createListenersRequest.getLoadBalancerId())) {
            request.addParameter("LoadBalancerId", createListenersRequest.getLoadBalancerId());
        }

        if (!StringUtils.isNullOrEmpty(createListenersRequest.getListenerState())) {
            request.addParameter("ListenerState", createListenersRequest.getListenerState());
        }

        if (!StringUtils.isNullOrEmpty(createListenersRequest.getListenerName())) {
            request.addParameter("ListenerName", createListenersRequest.getListenerName());
        }

        if (!StringUtils.isNullOrEmpty(createListenersRequest.getListenerProtocol())) {
            request.addParameter("ListenerProtocol", createListenersRequest.getListenerProtocol());
        }

        if (!StringUtils.isNullOrEmpty(createListenersRequest.getCertificateId())) {
            request.addParameter("CertificateId", createListenersRequest.getCertificateId());
        }

        if (!StringUtils.isNullOrEmpty(createListenersRequest.getListenerPort())) {
            request.addParameter("ListenerPort", createListenersRequest.getListenerPort());
        }

        if (!StringUtils.isNullOrEmpty(createListenersRequest.getMethod())) {
            request.addParameter("Method", createListenersRequest.getMethod());
        }

        if (!StringUtils.isNullOrEmpty(createListenersRequest.getSessionState())) {
            request.addParameter("SessionState", createListenersRequest.getSessionState());
        }

        if (createListenersRequest.getSessionPersistencePeriod() != null) {
            request.addParameter("SessionPersistencePeriod", StringUtils
                    .fromLong(createListenersRequest.getSessionPersistencePeriod()));
        }

        if (!StringUtils.isNullOrEmpty(createListenersRequest.getCookieType())) {
            request.addParameter("CookieType", createListenersRequest.getCookieType());
        }

        if (!StringUtils.isNullOrEmpty(createListenersRequest.getCookieName())) {
            request.addParameter("CookieName", createListenersRequest.getCookieName());
        }

        return request;
    }

}
