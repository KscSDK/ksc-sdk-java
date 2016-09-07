package com.ksc.kec.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.kec.model.RebootInstancesRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

/**
 * RebootInstancesRequest Marshaller
 */

public class RebootInstancesRequestMarshaller implements
        Marshaller<Request<RebootInstancesRequest>, RebootInstancesRequest> {

    public Request<RebootInstancesRequest> marshall(
    		RebootInstancesRequest rebootInstancesRequest) {

        if (rebootInstancesRequest == null) {
            throw new KscClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<RebootInstancesRequest> request = new DefaultRequest<RebootInstancesRequest>(
        		rebootInstancesRequest, "kec");
        request.addParameter("Action", "RebootInstances");
        String version=rebootInstancesRequest.getVersion();
        if(org.apache.commons.lang.StringUtils.isBlank(version)){
        	version="2016-03-04";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);

        com.ksc.internal.SdkInternalList<String> instanceIdsList = (com.ksc.internal.SdkInternalList<String>) rebootInstancesRequest
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
