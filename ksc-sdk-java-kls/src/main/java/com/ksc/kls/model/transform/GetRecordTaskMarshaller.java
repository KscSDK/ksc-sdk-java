package com.ksc.kls.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.kls.model.CancelRecordRequest;
import com.ksc.kls.model.GetRecordTaskRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

/**
 * Created by yangfan on 2017/4/27.
 */
public class GetRecordTaskMarshaller implements Marshaller<Request<GetRecordTaskRequest>, GetRecordTaskRequest> {

    private static GetRecordTaskMarshaller instance;

    public static GetRecordTaskMarshaller getInstance() {
        if (instance == null)
            instance = new GetRecordTaskMarshaller();
        return instance;
    }

    @Override
    public Request<GetRecordTaskRequest> marshall(GetRecordTaskRequest getRecordTaskRequest) throws Exception {
        if (getRecordTaskRequest == null) {
            throw new KscClientException(
                    "Invalid argument passed to marshall(...)");
        }
        Request<GetRecordTaskRequest> request = new DefaultRequest<GetRecordTaskRequest>(getRecordTaskRequest, "kls");

        request.addParameter("Action", "GetRecordTask");
        String version=getRecordTaskRequest.getVersion();
        if(org.apache.commons.lang.StringUtils.isBlank(version)){
            version="2017-01-01";
        }
        request.addParameter("Version", version);

        request.addParameter("RecID", StringUtils.fromInteger(getRecordTaskRequest.getRecID()));

        request.setHttpMethod(HttpMethodName.GET);
        return request;
    }
}
