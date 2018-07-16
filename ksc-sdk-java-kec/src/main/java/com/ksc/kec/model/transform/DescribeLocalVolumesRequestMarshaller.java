package com.ksc.kec.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.kec.model.DescribeLocalVolumesRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

public class DescribeLocalVolumesRequestMarshaller implements
       Marshaller<Request<DescribeLocalVolumesRequest>, DescribeLocalVolumesRequest>{
	
	public Request<DescribeLocalVolumesRequest> marshall(
			DescribeLocalVolumesRequest describeLocalVolumesRequest) {

        if (describeLocalVolumesRequest == null) {
            throw new KscClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<DescribeLocalVolumesRequest> request = new DefaultRequest<DescribeLocalVolumesRequest>(
        		describeLocalVolumesRequest, "kec");
        request.addParameter("Action", "DescribeLocalVolumes");
        String version=describeLocalVolumesRequest.getVersion();
        if(org.apache.commons.lang.StringUtils.isBlank(version)){
        	version="2016-03-04";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);

        if(describeLocalVolumesRequest.getInstanceName() != null){
        	request.addParameter("InstanceName", 
                    StringUtils.fromString(describeLocalVolumesRequest.getInstanceName()));
        }
        if(describeLocalVolumesRequest.getMarker() != null){
            request.addParameter("Marker",
                    StringUtils.fromInteger(describeLocalVolumesRequest.getMarker()));
        }
        if(describeLocalVolumesRequest.getMaxResults() != null){
            request.addParameter("MaxResults",
                    StringUtils.fromInteger(describeLocalVolumesRequest.getMaxResults()));
        }
        return request;
    }
}
