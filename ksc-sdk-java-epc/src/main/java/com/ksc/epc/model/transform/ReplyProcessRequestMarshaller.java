package com.ksc.epc.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.epc.model.ReplyProcessRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

public class ReplyProcessRequestMarshaller implements
        Marshaller<Request<ReplyProcessRequest>, ReplyProcessRequest> {

    @Override
    public Request<ReplyProcessRequest> marshall(ReplyProcessRequest replyProcessRequest) {
        if (replyProcessRequest == null) {
            throw new KscClientException("Invalid argument passed to marshall(...)");
        }

        Request<ReplyProcessRequest> request = new DefaultRequest<ReplyProcessRequest>(
                replyProcessRequest, "epc");
        request.addParameter("Action", "ReplyProcess");
        String version = replyProcessRequest.getVersion();
        if (org.apache.commons.lang.StringUtils.isBlank(version)) {
            version = "2015-11-01";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);

        if (!StringUtils.isNullOrEmpty(replyProcessRequest.getOperationProcessId())) {
            request.addParameter("OperationProcessId", replyProcessRequest.getOperationProcessId());
        }
        if (!StringUtils.isNullOrEmpty(replyProcessRequest.getRemarks())) {
            request.addParameter("Remarks", replyProcessRequest.getRemarks());
        }

        return request;
    }
}