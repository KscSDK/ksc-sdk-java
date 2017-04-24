package com.ksc.kls.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.transform.Marshaller;

/**
 * Created by yangfan on 2017/4/24.
 */
public class CreateRecordRequestMarshaller implements Marshaller<Request<CreateRecordRequest>, CreateRecordRequest> {
    @Override
    public Request<CreateRecordRequest> marshall(CreateRecordRequest createRecordRequest) throws Exception {
        if (createRecordRequest == null) {
            throw new KscClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<CreateRecordRequest> request = new DefaultRequest<CreateRecordRequest>(createRecordRequest, "kls");

        request.addParameter("Action","TopTaskByTaskID");
        String version=createRecordRequest.getVersion();
        if(org.apache.commons.lang.StringUtils.isBlank(version)){
            version="2017-01-01";
        }
        request.addParameter("Version", version);
        if(!topTaskByTaskIDRequest.getTaskID().isEmpty()){
            request.addParameter("TaskID", StringUtils.fromString(topTaskByTaskIDRequest.getTaskID()));
        }

        request.setHttpMethod(HttpMethodName.GET);
        return request;
    }
}
