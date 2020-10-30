package com.ksc.epc.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.epc.model.ReplyResourceRequirementRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

public class ReplyResourceRequirementRequestMarshaller implements
        Marshaller<Request<ReplyResourceRequirementRequest>, ReplyResourceRequirementRequest> {

    @Override
    public Request<ReplyResourceRequirementRequest> marshall(ReplyResourceRequirementRequest replyResourceRequirementRequest) {
        if (replyResourceRequirementRequest == null) {
            throw new KscClientException("Invalid argument passed to marshall(...)");
        }

        Request<ReplyResourceRequirementRequest> request = new DefaultRequest<ReplyResourceRequirementRequest>(
                replyResourceRequirementRequest, "epc");
        request.addParameter("Action", "ReplyResourceRequirement");
        String version = replyResourceRequirementRequest.getVersion();
        if (org.apache.commons.lang.StringUtils.isBlank(version)) {
            version = "2015-11-01";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);

        if (!StringUtils.isNullOrEmpty(replyResourceRequirementRequest.getResourceRequirementId())) {
            request.addParameter("ResourceRequirementId", replyResourceRequirementRequest.getResourceRequirementId());
        }
        if (!StringUtils.isNullOrEmpty(replyResourceRequirementRequest.getRemarks())) {
            request.addParameter("Remarks", replyResourceRequirementRequest.getRemarks());
        }

        return request;
    }
}