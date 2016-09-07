package com.ksc.network.eip.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.network.eip.model.GetLinesRequest;
import com.ksc.transform.Marshaller;

public class GetLinesRequestMarshaller implements Marshaller<Request<GetLinesRequest>, GetLinesRequest> {

	@Override
	public Request<GetLinesRequest> marshall(GetLinesRequest getLinesRequest) {
		// TODO Auto-generated method stub
		 if (getLinesRequest == null) {
	            throw new KscClientException(
	                    "Invalid argument passed to marshall(...)");
	        }

	        Request<GetLinesRequest> request = new DefaultRequest<GetLinesRequest>(
	        		getLinesRequest, "eip");
	        request.addParameter("Action", "GetLines");
	        String version=getLinesRequest.getVersion();
	        if(org.apache.commons.lang.StringUtils.isBlank(version)){
	        	version="2016-03-04";
	        }
	        request.addParameter("Version", version);
	        request.setHttpMethod(HttpMethodName.GET);
	        return request;
	}

}
