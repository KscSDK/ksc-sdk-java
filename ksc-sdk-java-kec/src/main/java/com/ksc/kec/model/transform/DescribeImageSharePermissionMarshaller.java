package com.ksc.kec.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.kec.model.DescribeImageSharePermissionRequest;
import com.ksc.kec.model.ModifyImageSharePermissionRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;


public class DescribeImageSharePermissionMarshaller implements
        Marshaller<Request<DescribeImageSharePermissionRequest>, DescribeImageSharePermissionRequest> {

    public Request<DescribeImageSharePermissionRequest> marshall(
            DescribeImageSharePermissionRequest describeImageSharePermissionRequest) {

        if (describeImageSharePermissionRequest == null) {
            throw new KscClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<DescribeImageSharePermissionRequest> request = new DefaultRequest<DescribeImageSharePermissionRequest>(
                describeImageSharePermissionRequest, "kec");
        request.addParameter("Action", "DescribeImageSharePermission");
        String version=describeImageSharePermissionRequest.getVersion();
        if(org.apache.commons.lang.StringUtils.isBlank(version)){
        	version="2016-03-04";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);
        if(describeImageSharePermissionRequest.getImageId() != null){
            request.addParameter("ImageId",
                    StringUtils.fromString(describeImageSharePermissionRequest.getImageId()));
        }
        return request;
    }

}
