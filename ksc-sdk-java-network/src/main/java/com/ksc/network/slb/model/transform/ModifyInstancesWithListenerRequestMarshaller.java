package com.ksc.network.slb.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.network.slb.model.ModifyInstancesWithListenerRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

/**
 * ModifyInstancesWithListenerRequest Marshaller
 */

public class ModifyInstancesWithListenerRequestMarshaller implements
        Marshaller<Request<ModifyInstancesWithListenerRequest>, ModifyInstancesWithListenerRequest> {

    public Request<ModifyInstancesWithListenerRequest> marshall(
            ModifyInstancesWithListenerRequest modifyInstancesWithListenerRequest) {

        if (modifyInstancesWithListenerRequest == null) {
            throw new KscClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<ModifyInstancesWithListenerRequest> request = new DefaultRequest<ModifyInstancesWithListenerRequest>(
                modifyInstancesWithListenerRequest, "slb");
        request.addParameter("Action", "ModifyInstancesWithListener");
        String version = modifyInstancesWithListenerRequest.getVersion();
        if (org.apache.commons.lang.StringUtils.isBlank(version)) {
            version = "2016-03-04";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);

        if (!StringUtils.isNullOrEmpty(modifyInstancesWithListenerRequest.getRegisterId())) {
            request.addParameter("RegisterId", modifyInstancesWithListenerRequest.getRegisterId());
        }

        if (modifyInstancesWithListenerRequest.getRealServerPort() != null) {
            request.addParameter("RealServerPort", StringUtils
                    .fromInteger(modifyInstancesWithListenerRequest.getRealServerPort()));
        }

        if (modifyInstancesWithListenerRequest.getWeight() != null) {
            request.addParameter("Weight", StringUtils
                    .fromInteger(modifyInstancesWithListenerRequest.getWeight()));
        }

        return request;
    }

}
