package com.ksc.kls.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.kls.model.CancelRecordRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

/**
 * Created by yangfan on 2017/4/26.
 */
public class CancelRecordRequestMarshaller implements Marshaller<Request<CancelRecordRequest>, CancelRecordRequest> {
    private static CancelRecordRequestMarshaller instance;

    public static CancelRecordRequestMarshaller getInstance() {
        if (instance == null)
            instance = new CancelRecordRequestMarshaller();
        return instance;
    }
    @Override
    public Request<CancelRecordRequest> marshall(CancelRecordRequest cancelRecordRequest) {
        if (cancelRecordRequest == null) {
            throw new KscClientException(
                    "Invalid argument passed to marshall(...)");
        }
        Request<CancelRecordRequest> request = new DefaultRequest<CancelRecordRequest>(cancelRecordRequest, "kls");

        request.addParameter("Action", "CancelRecordTask");
        String version=cancelRecordRequest.getVersion();
        if(org.apache.commons.lang.StringUtils.isBlank(version)){
            version="2017-01-01";
        }
        request.addParameter("Version", version);


        request.addParameter("RecID", StringUtils.fromInteger(cancelRecordRequest.getRecID()));

        if (cancelRecordRequest.getUniqueName() != null) {
            request.addParameter("UniqueName",cancelRecordRequest.getUniqueName());
        }
        if (cancelRecordRequest.getApp() != null) {
            request.addParameter("App",cancelRecordRequest.getApp());
        }
        if (cancelRecordRequest.getPubdomain() != null) {
            request.addParameter("Pubdomain",cancelRecordRequest.getPubdomain());
        }
        if (cancelRecordRequest.getStream() != null) {
            request.addParameter("Stream",cancelRecordRequest.getStream());
        }

        request.setHttpMethod(HttpMethodName.POST);
        return request;
    }
}
