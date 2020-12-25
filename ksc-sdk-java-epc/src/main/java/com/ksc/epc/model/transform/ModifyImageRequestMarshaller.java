package com.ksc.epc.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.epc.model.ModifyImageRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

public class ModifyImageRequestMarshaller implements
        Marshaller<Request<ModifyImageRequest>, ModifyImageRequest> {

    @Override
    public Request<ModifyImageRequest> marshall(ModifyImageRequest modifyImageRequest) {
        if (modifyImageRequest == null) {
            throw new KscClientException("Invalid argument passed to marshall(...)");
        }

        Request<ModifyImageRequest> request = new DefaultRequest<ModifyImageRequest>(
                modifyImageRequest, "epc");
        request.addParameter("Action", "ModifyImage");
        String version = modifyImageRequest.getVersion();
        if (org.apache.commons.lang.StringUtils.isBlank(version)) {
            version = "2015-11-01";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);

        if (!StringUtils.isNullOrEmpty(modifyImageRequest.getImageName())) {
            request.addParameter("ImageName", modifyImageRequest.getImageName());
        }
        if (!StringUtils.isNullOrEmpty(modifyImageRequest.getImageId())) {
            request.addParameter("ImageId", modifyImageRequest.getImageId());
        }

        return request;
    }
}