package com.ksc.kec.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.kec.model.MonitorInstancesRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

/**
 * MonitorInstancesRequest Marshaller
 */

public class MonitorInstancesRequestMarshaller implements
        Marshaller<Request<MonitorInstancesRequest>, MonitorInstancesRequest> {

    public Request<MonitorInstancesRequest> marshall(
    		MonitorInstancesRequest monitorInstancesRequest) {

        if (monitorInstancesRequest == null) {
            throw new KscClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<MonitorInstancesRequest> request = new DefaultRequest<MonitorInstancesRequest>(
        		monitorInstancesRequest, "kec");
        request.addParameter("Action", "MonitorInstances");
        String version=monitorInstancesRequest.getVersion();
        if(org.apache.commons.lang.StringUtils.isBlank(version)){
        	version="2016-03-04";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);

        com.ksc.internal.SdkInternalList<String> instanceIdsList = (com.ksc.internal.SdkInternalList<String>) monitorInstancesRequest
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
