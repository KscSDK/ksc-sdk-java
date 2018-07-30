package com.ksc.kec.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.kec.model.DescribeAvailabilityZonesRequest;
import com.ksc.transform.Marshaller;


public class DescribeAvailabilityZonesRequestMarshaller implements
        Marshaller<Request<DescribeAvailabilityZonesRequest>, DescribeAvailabilityZonesRequest> {

    public Request<DescribeAvailabilityZonesRequest> marshall(
    		DescribeAvailabilityZonesRequest describeAvailabilityZonesRequest) {

        if (describeAvailabilityZonesRequest == null) {
            throw new KscClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<DescribeAvailabilityZonesRequest> request = new DefaultRequest<DescribeAvailabilityZonesRequest>(
        		describeAvailabilityZonesRequest, "kec");
        request.addParameter("Action", "DescribeAvailabilityZones");
        String version=describeAvailabilityZonesRequest.getVersion();
        if(org.apache.commons.lang.StringUtils.isBlank(version)){
        	version="2016-03-04";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);

        return request;
    }

}
