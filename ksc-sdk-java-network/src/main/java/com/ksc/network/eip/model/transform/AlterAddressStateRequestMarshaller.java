package com.ksc.network.eip.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.network.eip.model.AlterAddressStateRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

/**
 * AlterAddressStateRequest Marshaller
 */

public class AlterAddressStateRequestMarshaller implements
        Marshaller<Request<AlterAddressStateRequest>, AlterAddressStateRequest> {

    public Request<AlterAddressStateRequest> marshall(
    		AlterAddressStateRequest alterAddressStateRequest) {

        if (alterAddressStateRequest == null) {
            throw new KscClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<AlterAddressStateRequest> request = new DefaultRequest<AlterAddressStateRequest>(
        		alterAddressStateRequest, "eip");
        request.addParameter("Action", "AlterAddressState");
        String version = alterAddressStateRequest.getVersion();
        if (org.apache.commons.lang.StringUtils.isBlank(version)) {
            version = "2016-03-04";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);

        if (!StringUtils.isNullOrEmpty(alterAddressStateRequest.getAllocationId())) {
            request.addParameter("AllocationId", alterAddressStateRequest.getAllocationId());
        }

        if (!StringUtils.isNullOrEmpty(alterAddressStateRequest.getState())) {
            request.addParameter("State", alterAddressStateRequest.getState());
        }
        
        return request;
    }

}
