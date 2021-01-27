package com.ksc.kec.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.kec.model.ModifyInstanceAutoDeleteTimeRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

/**
 * ModifyInstanceAutoDeleteTimeRequest Marshaller
 */
public class ModifyInstanceAutoDeleteTimeRequestMarshaller implements
        Marshaller<Request<ModifyInstanceAutoDeleteTimeRequest>, ModifyInstanceAutoDeleteTimeRequest> {

    public Request<ModifyInstanceAutoDeleteTimeRequest> marshall(
            ModifyInstanceAutoDeleteTimeRequest modifyInstanceAutoDeleteTimeRequest) {

        if (modifyInstanceAutoDeleteTimeRequest == null) {
            throw new KscClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<ModifyInstanceAutoDeleteTimeRequest> request = new DefaultRequest<ModifyInstanceAutoDeleteTimeRequest>(
                modifyInstanceAutoDeleteTimeRequest, "kec");
        request.addParameter("Action", "ModifyInstanceAutoDeleteTime");
        String version = modifyInstanceAutoDeleteTimeRequest.getVersion();
        if (org.apache.commons.lang.StringUtils.isBlank(version)) {
            version = "2016-03-04";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);

        com.ksc.internal.SdkInternalList<String> instanceIdsList = (com.ksc.internal.SdkInternalList<String>) modifyInstanceAutoDeleteTimeRequest
                .getInstanceIds();
        if (!instanceIdsList.isEmpty() || !instanceIdsList.isAutoConstruct()) {
            int instanceIdsListIndex = 1;

            for (String instanceIdsListValue : instanceIdsList) {
                if (instanceIdsListValue != null) {
                    request.addParameter("InstanceId." + instanceIdsListIndex,
                            StringUtils.fromString(instanceIdsListValue));
                }
                instanceIdsListIndex++;
            }
        }

        //AddParameter
        if(modifyInstanceAutoDeleteTimeRequest.getAutoDeleteTime()!=null) {
            request.addParameter("AutoDeleteTime",
                    StringUtils.fromString(modifyInstanceAutoDeleteTimeRequest.getAutoDeleteTime()));
        }
        if(modifyInstanceAutoDeleteTimeRequest.getAutoDeleteEip()!=null) {
            request.addParameter("AutoDeleteEip",
                    StringUtils.fromBoolean(modifyInstanceAutoDeleteTimeRequest.getAutoDeleteEip()));
        }

        return request;
    }

}
