package com.ksc.epc.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.epc.model.CreateImageRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

public class CreateImageRequestMarshaller implements
        Marshaller<Request<CreateImageRequest>, CreateImageRequest> {

    @Override
    public Request<CreateImageRequest> marshall(CreateImageRequest createImageRequest) {
        if (createImageRequest == null) {
            throw new KscClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateImageRequest> request = new DefaultRequest<CreateImageRequest>(
                createImageRequest, "epc");
        request.addParameter("Action", "CreateImage");
        String version = createImageRequest.getVersion();
        if (org.apache.commons.lang.StringUtils.isBlank(version)) {
            version = "2015-11-01";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);

        if (!StringUtils.isNullOrEmpty(createImageRequest.getImageName())) {
            request.addParameter("ImageName", createImageRequest.getImageName());
        }
        if (!StringUtils.isNullOrEmpty(createImageRequest.getHostId())) {
            request.addParameter("HostId", createImageRequest.getHostId());
        }

        return request;
    }
}