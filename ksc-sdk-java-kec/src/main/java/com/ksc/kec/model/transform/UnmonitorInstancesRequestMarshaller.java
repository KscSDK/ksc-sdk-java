package com.ksc.kec.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.kec.model.UnmonitorInstancesRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

/**
 * UnmonitorInstancesRequest Marshaller
 */

public class UnmonitorInstancesRequestMarshaller implements
        Marshaller<Request<UnmonitorInstancesRequest>, UnmonitorInstancesRequest> {

    public Request<UnmonitorInstancesRequest> marshall(
    		UnmonitorInstancesRequest unmonitorInstancesRequest) {

        if (unmonitorInstancesRequest == null) {
            throw new KscClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<UnmonitorInstancesRequest> request = new DefaultRequest<UnmonitorInstancesRequest>(
                unmonitorInstancesRequest, "kec");
        request.addParameter("Action", "UnmonitorInstances");
        String version=unmonitorInstancesRequest.getVersion();
        if(org.apache.commons.lang.StringUtils.isBlank(version)){
        	version="2016-03-04";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);

        com.ksc.internal.SdkInternalList<String> instanceIdsList = (com.ksc.internal.SdkInternalList<String>) unmonitorInstancesRequest
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
