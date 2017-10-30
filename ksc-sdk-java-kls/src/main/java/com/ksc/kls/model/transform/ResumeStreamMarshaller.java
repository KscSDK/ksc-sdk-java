package com.ksc.kls.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.kls.model.ResumeStreamRequest;
import com.ksc.transform.Marshaller;

/**
 * Created by yangfan on 2017/7/26.
 */
public class ResumeStreamMarshaller implements Marshaller<Request<ResumeStreamRequest>, ResumeStreamRequest> {
    private static ResumeStreamMarshaller instance;

    public static ResumeStreamMarshaller getInstance() {
        if (instance == null)
            instance = new ResumeStreamMarshaller();
        return instance;
    }

    @Override
    public Request<ResumeStreamRequest> marshall(ResumeStreamRequest resumeStreamRequest)  {
        if (resumeStreamRequest == null) {
            throw new KscClientException("Invalid argument passed to marshall(...)");
        }
        Request<ResumeStreamRequest> request = new DefaultRequest<ResumeStreamRequest>(resumeStreamRequest, "kls");

        request.addParameter("Action", "ResumeStream");
        String version=resumeStreamRequest.getVersion();
        if(org.apache.commons.lang.StringUtils.isBlank(version)){
            version="2017-01-01";
        }
        request.addParameter("Version", version);

        request.addParameter("UniqueName",resumeStreamRequest.getUniqueName());
        request.addParameter("App",resumeStreamRequest.getApp());
        request.addParameter("Pubdomain",resumeStreamRequest.getPubdomain());
        request.addParameter("Stream",resumeStreamRequest.getStream());


        request.setHttpMethod(HttpMethodName.POST);
        return request;
    }
}
