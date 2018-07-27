package com.ksc.kec.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.kec.model.DescribeImagesRequest;
import com.ksc.transform.Marshaller;

/**
 * DescribeImagesRequest Marshaller
 */

public class DescribeImagesRequestMarshaller implements
        Marshaller<Request<DescribeImagesRequest>, DescribeImagesRequest> {

    public Request<DescribeImagesRequest> marshall(
    		DescribeImagesRequest describeImagesRequest) {

        if (describeImagesRequest == null) {
            throw new KscClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<DescribeImagesRequest> request = new DefaultRequest<DescribeImagesRequest>(
        		describeImagesRequest, "kec");
        request.addParameter("Action", "DescribeImages");
        String version=describeImagesRequest.getVersion();
        if(org.apache.commons.lang.StringUtils.isBlank(version)){
        	version="2016-03-04";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);
        if(describeImagesRequest.getImageId()!=null){
        	request.addParameter("ImageId", describeImagesRequest.getImageId());
        }

        if(describeImagesRequest.getImageType()!=null){
            request.addParameter("ImageType", describeImagesRequest.getImageType());
        }
        return request;
    }

}
