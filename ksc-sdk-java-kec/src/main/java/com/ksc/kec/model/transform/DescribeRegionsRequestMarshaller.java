package com.ksc.kec.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.kec.model.DescribeRegionsRequest;
import com.ksc.transform.Marshaller;


public class DescribeRegionsRequestMarshaller implements
        Marshaller<Request<DescribeRegionsRequest>, DescribeRegionsRequest> {

    public Request<DescribeRegionsRequest> marshall(
            DescribeRegionsRequest describeRegionsRequest) {

        if (describeRegionsRequest == null) {
            throw new KscClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<DescribeRegionsRequest> request = new DefaultRequest<DescribeRegionsRequest>(
                describeRegionsRequest, "kec");
        request.addParameter("Action", "DescribeRegions");
        String version= describeRegionsRequest.getVersion();
        if(org.apache.commons.lang.StringUtils.isBlank(version)){
        	version="2016-03-04";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);

        return request;
    }

}
