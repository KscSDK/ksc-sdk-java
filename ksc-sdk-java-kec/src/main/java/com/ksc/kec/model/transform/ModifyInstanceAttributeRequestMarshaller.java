package com.ksc.kec.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.kec.model.ModifyInstanceAttributeRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

/**
 * ModifyInstanceAttributeRequest Marshaller
 */

public class ModifyInstanceAttributeRequestMarshaller implements
        Marshaller<Request<ModifyInstanceAttributeRequest>, ModifyInstanceAttributeRequest> {

    public Request<ModifyInstanceAttributeRequest> marshall(
            ModifyInstanceAttributeRequest modifyInstanceAttributeRequest) {

        if (modifyInstanceAttributeRequest == null) {
            throw new KscClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<ModifyInstanceAttributeRequest> request = new DefaultRequest<ModifyInstanceAttributeRequest>(
                modifyInstanceAttributeRequest, "kec");
        request.addParameter("Action", "ModifyInstanceAttribute");
        String version = modifyInstanceAttributeRequest.getVersion();
        if (org.apache.commons.lang.StringUtils.isBlank(version)) {
            version = "2016-03-04";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);

        //AddParameter
        if(modifyInstanceAttributeRequest.getInstanceId()!=null) {
            request.addParameter("InstanceId",
                    StringUtils.fromString(modifyInstanceAttributeRequest.getInstanceId()));
        }
        if(modifyInstanceAttributeRequest.getInstanceName()!=null) {
            request.addParameter("InstanceName",
                    StringUtils.fromString(modifyInstanceAttributeRequest.getInstanceName()));
        }
        if(modifyInstanceAttributeRequest.getInstancePassword()!=null) {
            request.addParameter("InstancePassword",
                    StringUtils.fromString(modifyInstanceAttributeRequest.getInstancePassword()));
        }

        return request;
    }

}
