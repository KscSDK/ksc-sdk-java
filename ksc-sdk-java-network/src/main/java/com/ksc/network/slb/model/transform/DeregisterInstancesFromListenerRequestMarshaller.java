package com.ksc.network.slb.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.network.slb.model.DeregisterInstancesFromListenerRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

/**
 * DeregisterInstancesFromListenerRequest Marshaller
 */

public class DeregisterInstancesFromListenerRequestMarshaller implements
        Marshaller<Request<DeregisterInstancesFromListenerRequest>, DeregisterInstancesFromListenerRequest> {

    public Request<DeregisterInstancesFromListenerRequest> marshall(
            DeregisterInstancesFromListenerRequest deregisterInstancesFromListenerRequest) {

        if (deregisterInstancesFromListenerRequest == null) {
            throw new KscClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<DeregisterInstancesFromListenerRequest> request = new DefaultRequest<DeregisterInstancesFromListenerRequest>(
                deregisterInstancesFromListenerRequest, "slb");
        request.addParameter("Action", "DeregisterInstancesFromListener");
        String version = deregisterInstancesFromListenerRequest.getVersion();
        if (org.apache.commons.lang.StringUtils.isBlank(version)) {
            version = "2016-03-04";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);

        if (!StringUtils.isNullOrEmpty(((DeregisterInstancesFromListenerRequest) deregisterInstancesFromListenerRequest).getRegisterId())) {
            request.addParameter("RegisterId", ((DeregisterInstancesFromListenerRequest) deregisterInstancesFromListenerRequest).getRegisterId());
        }

        return request;
    }

}
