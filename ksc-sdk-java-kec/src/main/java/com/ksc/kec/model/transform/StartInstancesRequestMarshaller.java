package com.ksc.kec.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.kec.model.StartInstancesRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

/**
 * StartInstancesRequest Marshaller
 */

public class StartInstancesRequestMarshaller implements
        Marshaller<Request<StartInstancesRequest>, StartInstancesRequest> {

    public Request<StartInstancesRequest> marshall(
    		StartInstancesRequest startInstancesRequest) {

        if (startInstancesRequest == null) {
            throw new KscClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<StartInstancesRequest> request = new DefaultRequest<StartInstancesRequest>(
        		startInstancesRequest, "kec");
        request.addParameter("Action", "StartInstances");
        String version=startInstancesRequest.getVersion();
        if(org.apache.commons.lang.StringUtils.isBlank(version)){
        	version="2016-03-04";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);

        com.ksc.internal.SdkInternalList<String> instanceIdsList = (com.ksc.internal.SdkInternalList<String>) startInstancesRequest
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
