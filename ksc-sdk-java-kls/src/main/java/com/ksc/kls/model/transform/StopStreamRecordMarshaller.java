package com.ksc.kls.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.kls.model.StopStreamRecordRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

/**
 * Created by yangfan on 2017/4/27.
 */
public class StopStreamRecordMarshaller implements Marshaller<Request<StopStreamRecordRequest>, StopStreamRecordRequest> {
    private static StopStreamRecordMarshaller instance;

    public static StopStreamRecordMarshaller getInstance() {
        if (instance == null)
            instance = new StopStreamRecordMarshaller();
        return instance;
    }

    @Override
    public Request<StopStreamRecordRequest> marshall(StopStreamRecordRequest stopStreamRecordRequest) {
        if (stopStreamRecordRequest == null) {
            throw new KscClientException(
                    "Invalid argument passed to marshall(...)");
        }
        Request<StopStreamRecordRequest> request = new DefaultRequest<StopStreamRecordRequest>(stopStreamRecordRequest, "kls");

        request.addParameter("Action", "StopStreamRecord");
        String version=stopStreamRecordRequest.getVersion();
        if(org.apache.commons.lang.StringUtils.isBlank(version)){
            version="2017-01-01";
        }
        request.addParameter("Version", version);


        request.addParameter("RecID", StringUtils.fromInteger(stopStreamRecordRequest.getRecID()));
        request.addParameter("UniqueName",stopStreamRecordRequest.getUniqueName());
        request.addParameter("App",stopStreamRecordRequest.getApp());
        request.addParameter("Pubdomain",stopStreamRecordRequest.getPubdomain());
        request.addParameter("Stream",stopStreamRecordRequest.getStream());

        request.setHttpMethod(HttpMethodName.POST);
        return request;
    }
}
