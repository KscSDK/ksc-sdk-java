package com.ksc.kec.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.kec.model.DescribeInstanceFamilysRequest;
import com.ksc.kec.model.ImageImportRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;


public class ImageImportRequestMarshaller implements
        Marshaller<Request<ImageImportRequest>, ImageImportRequest> {

    public Request<ImageImportRequest> marshall(
            ImageImportRequest imageImportRequest) {

        if (imageImportRequest == null) {
            throw new KscClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<ImageImportRequest> request = new DefaultRequest<ImageImportRequest>(
                imageImportRequest, "kec");
        request.addParameter("Action", "ImportImage");
        String version=imageImportRequest.getVersion();
        if(org.apache.commons.lang.StringUtils.isBlank(version)){
        	version="2016-03-04";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);
        if(imageImportRequest.getImageName() != null){
            request.addParameter("ImageName",
                    StringUtils.fromString(imageImportRequest.getImageName()));
        }
        if(imageImportRequest.getImageUrl() != null){
            request.addParameter("ImageUrl",
                    StringUtils.fromString(imageImportRequest.getImageUrl()));
        }
        if(imageImportRequest.getPlatform() != null){
            request.addParameter("Platform",
                    StringUtils.fromString(imageImportRequest.getPlatform()));
        }
        if(imageImportRequest.getArchitecture() != null){
            request.addParameter("Architecture",
                    StringUtils.fromString(imageImportRequest.getArchitecture()));
        }
        if(imageImportRequest.getImageFormat() != null){
            request.addParameter("ImageFormat",
                    StringUtils.fromString(imageImportRequest.getImageFormat()));
        }
        return request;
    }

}
