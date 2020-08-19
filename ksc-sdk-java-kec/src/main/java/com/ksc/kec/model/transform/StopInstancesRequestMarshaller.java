package com.ksc.kec.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.kec.model.StopInstancesRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

/**
 * StopInstancesRequest Marshaller
 */

public class StopInstancesRequestMarshaller implements
        Marshaller<Request<StopInstancesRequest>, StopInstancesRequest> {

    public Request<StopInstancesRequest> marshall(
    		StopInstancesRequest stopInstancesRequest) {

        if (stopInstancesRequest == null) {
            throw new KscClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<StopInstancesRequest> request = new DefaultRequest<StopInstancesRequest>(
        		stopInstancesRequest, "kec");
        request.addParameter("Action", "StopInstances");
        String version=stopInstancesRequest.getVersion();
        if(org.apache.commons.lang.StringUtils.isBlank(version)){
        	version="2016-03-04";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);

        com.ksc.internal.SdkInternalList<String> instanceIdsList = (com.ksc.internal.SdkInternalList<String>) stopInstancesRequest
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

        if(stopInstancesRequest.getForceStop()!=null && stopInstancesRequest.getForceStop()){
            request.addParameter("ForceStop", String.valueOf(stopInstancesRequest.getForceStop()));
        }

        if(StringUtils.isNullOrEmpty(stopInstancesRequest.getStoppedMode())){
            request.addParameter("StoppedMode", stopInstancesRequest.getStoppedMode());
        }

        return request;
    }

}
