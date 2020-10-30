package com.ksc.epc.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.epc.model.DeleteProcessRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

public class DeleteProcessRequestMarshaller implements
        Marshaller<Request<DeleteProcessRequest>, DeleteProcessRequest> {

    @Override
    public Request<DeleteProcessRequest> marshall(DeleteProcessRequest deleteProcessRequest) {
        if (deleteProcessRequest == null) {
            throw new KscClientException("Invalid argument passed to marshall(...)");
        }

        Request<DeleteProcessRequest> request = new DefaultRequest<DeleteProcessRequest>(
                deleteProcessRequest, "epc");
        request.addParameter("Action", "DeleteProcess");
        String version = deleteProcessRequest.getVersion();
        if (org.apache.commons.lang.StringUtils.isBlank(version)) {
            version = "2015-11-01";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);

        if (!StringUtils.isNullOrEmpty(deleteProcessRequest.getOperationProcessId())) {
            request.addParameter("OperationProcessId", deleteProcessRequest.getOperationProcessId());
        }

        return request;
    }
}