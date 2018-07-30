package com.ksc.kec.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.kec.model.DescribeInstanceFamilysRequest;
import com.ksc.transform.Marshaller;


public class DescribeInstanceFamilysRequestMarshaller implements
        Marshaller<Request<DescribeInstanceFamilysRequest>, DescribeInstanceFamilysRequest> {

    public Request<DescribeInstanceFamilysRequest> marshall(
    		DescribeInstanceFamilysRequest describeInstanceFamilysRequest) {

        if (describeInstanceFamilysRequest == null) {
            throw new KscClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<DescribeInstanceFamilysRequest> request = new DefaultRequest<DescribeInstanceFamilysRequest>(
        		describeInstanceFamilysRequest, "kec");
        request.addParameter("Action", "DescribeInstanceFamilys");
        String version=describeInstanceFamilysRequest.getVersion();
        if(org.apache.commons.lang.StringUtils.isBlank(version)){
        	version="2016-03-04";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);

        return request;
    }

}
