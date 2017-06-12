package com.ksc.kec.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.kec.model.TerminateInstancesRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

/**
 * TerminateInstancesRequest Marshaller
 */

public class TerminateInstancesRequestMarshaller implements
        Marshaller<Request<TerminateInstancesRequest>, TerminateInstancesRequest> {

    public Request<TerminateInstancesRequest> marshall(
            TerminateInstancesRequest terminateInstancesRequest) {

        if (terminateInstancesRequest == null) {
            throw new KscClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<TerminateInstancesRequest> request = new DefaultRequest<TerminateInstancesRequest>(
                terminateInstancesRequest, "kec");
        request.addParameter("Action", "TerminateInstances");
        String version = terminateInstancesRequest.getVersion();
        if (org.apache.commons.lang.StringUtils.isBlank(version)) {
            version = "2016-03-04";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);

        com.ksc.internal.SdkInternalList<String> instanceIdsList = (com.ksc.internal.SdkInternalList<String>) terminateInstancesRequest
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

        return request;
    }

}
