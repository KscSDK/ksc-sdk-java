package com.ksc.network.slb.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.network.slb.model.DeleteRuleRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

public class DeleteRuleRequestMarshaller implements
        Marshaller<Request<DeleteRuleRequest>, DeleteRuleRequest> {

    @Override
    public Request<DeleteRuleRequest> marshall(DeleteRuleRequest deleteRuleRequest) {
        if (deleteRuleRequest == null) {
            throw new KscClientException("Invalid argument passed to marshall(...)");
        }

        Request<DeleteRuleRequest> request = new DefaultRequest<DeleteRuleRequest>(
                deleteRuleRequest, "slb");
        request.addParameter("Action", "DeleteRule");
        String version = deleteRuleRequest.getVersion();
        if (org.apache.commons.lang.StringUtils.isBlank(version)) {
            version = "2016-03-04";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);

        if (!StringUtils.isNullOrEmpty(deleteRuleRequest.getRuleId())) {
            request.addParameter("RuleId", deleteRuleRequest.getRuleId());
        }

        return request;
    }
}