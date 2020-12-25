package com.ksc.epc.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.epc.model.DeleteImageRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

public class DeleteImageRequestMarshaller implements
        Marshaller<Request<DeleteImageRequest>, DeleteImageRequest> {

    @Override
    public Request<DeleteImageRequest> marshall(DeleteImageRequest deleteImageRequest) {
        if (deleteImageRequest == null) {
            throw new KscClientException("Invalid argument passed to marshall(...)");
        }

        Request<DeleteImageRequest> request = new DefaultRequest<DeleteImageRequest>(
                deleteImageRequest, "epc");
        request.addParameter("Action", "DeleteImage");
        String version = deleteImageRequest.getVersion();
        if (org.apache.commons.lang.StringUtils.isBlank(version)) {
            version = "2015-11-01";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);

        if (!StringUtils.isNullOrEmpty(deleteImageRequest.getImageId())) {
            request.addParameter("ImageId", deleteImageRequest.getImageId());
        }

        return request;
    }
}