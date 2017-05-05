package com.ksc.network.slb.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.network.slb.model.RegisterInstancesWithListenerRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

/**
 * RegisterInstancesWithListener Marshaller
 */

public class RegisterInstancesWithListenerRequestMarshaller implements
        Marshaller<Request<RegisterInstancesWithListenerRequest>, RegisterInstancesWithListenerRequest> {

    public Request<RegisterInstancesWithListenerRequest> marshall(
            RegisterInstancesWithListenerRequest registerInstancesWithListenerRequest) {

        if (registerInstancesWithListenerRequest == null) {
            throw new KscClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<RegisterInstancesWithListenerRequest> request = new DefaultRequest<RegisterInstancesWithListenerRequest>(
                registerInstancesWithListenerRequest, "slb");
        request.addParameter("Action", "RegisterInstancesWithListener");
        String version = registerInstancesWithListenerRequest.getVersion();
        if (org.apache.commons.lang.StringUtils.isBlank(version)) {
            version = "2016-03-04";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);

        if (!StringUtils.isNullOrEmpty(registerInstancesWithListenerRequest.getListenerId())) {
            request.addParameter("ListenerId", registerInstancesWithListenerRequest.getListenerId());
        }

        if (!StringUtils.isNullOrEmpty(registerInstancesWithListenerRequest.getRealServerIp())) {
            request.addParameter("RealServerIp", registerInstancesWithListenerRequest.getRealServerIp());
        }

        if (registerInstancesWithListenerRequest.getRealServerPort() != null) {
            request.addParameter("RealServerPort", StringUtils
                    .fromInteger(registerInstancesWithListenerRequest.getRealServerPort()));
        }

        if (!StringUtils.isNullOrEmpty(registerInstancesWithListenerRequest.getRealServerType())) {
            request.addParameter("RealServerType", registerInstancesWithListenerRequest.getRealServerType());
        }

        if (registerInstancesWithListenerRequest.getWeight() != null) {
            request.addParameter("Weight", StringUtils
                    .fromInteger(registerInstancesWithListenerRequest.getWeight()));
        }

        return request;
    }

}
