package com.ksc.network.slb.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.network.slb.model.ModifyListenersRequest;
import com.ksc.network.slb.model.ModifyLoadBalancerRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

/**
 * Created by LIUHONGMING on 2017/4/26.
 */
public class ModifyListenersRequestMarshaller implements
        Marshaller<Request<ModifyListenersRequest>, ModifyListenersRequest> {

    public Request<ModifyListenersRequest> marshall(
            ModifyListenersRequest modifyListenersRequest) {

        if (modifyListenersRequest == null) {
            throw new KscClientException(
                    "Invalid argument passed to marshall(...)" );
        }

        Request<ModifyListenersRequest> request = new DefaultRequest<ModifyListenersRequest>(
                modifyListenersRequest, "slb" );
        request.addParameter("Action", "ModifyListeners");
        String version = modifyListenersRequest.getVersion();
        if (org.apache.commons.lang.StringUtils.isBlank(version)) {
            version = "2016-03-04";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);

        if (!StringUtils.isNullOrEmpty(modifyListenersRequest.getListenerId())) {
            request.addParameter("ListenerId", modifyListenersRequest.getListenerId());
        }

        if (!StringUtils.isNullOrEmpty(modifyListenersRequest.getListenerName())) {
            request.addParameter("ListenerName", modifyListenersRequest.getListenerName());
        }

        if (!StringUtils.isNullOrEmpty(modifyListenersRequest.getListenerState())) {
            request.addParameter("ListenerState", modifyListenersRequest.getListenerState());
        }

        if (!StringUtils.isNullOrEmpty(modifyListenersRequest.getSessionState())) {
            request.addParameter("SessionState", modifyListenersRequest.getSessionState());
        }

        if (!StringUtils.isNullOrEmpty(modifyListenersRequest.getMethod())) {
            request.addParameter("Method", modifyListenersRequest.getMethod());
        }

        if (modifyListenersRequest.getSessionPersistencePeriod() != null) {
            request.addParameter("SessionPersistencePeriod", StringUtils
                    .fromLong(modifyListenersRequest.getSessionPersistencePeriod()));
        }

        if (!StringUtils.isNullOrEmpty(modifyListenersRequest.getCookieType())) {
            request.addParameter("CookieType", modifyListenersRequest.getCookieType());
        }

        if (!StringUtils.isNullOrEmpty(modifyListenersRequest.getCookieName())) {
            request.addParameter("CookieName", modifyListenersRequest.getCookieName());
        }

        return request;
    }

}

