package com.ksc.epc.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.epc.model.ListEpcsRequest;
import com.ksc.http.HttpMethodName;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

public class ListEpcsRequestMarshaller implements Marshaller<Request<ListEpcsRequest>, ListEpcsRequest> {

	@Override
	public Request<ListEpcsRequest> marshall(ListEpcsRequest listEpcsRequest) {
		if (listEpcsRequest == null) {
			throw new KscClientException("Invalid argument passed to marshall(...)");
		}

		Request<ListEpcsRequest> request = new DefaultRequest<ListEpcsRequest>(listEpcsRequest, "epc");
		request.addParameter("Action", "ListEpcs");
		String version = listEpcsRequest.getVersion();
		if (org.apache.commons.lang.StringUtils.isBlank(version)) {
			version = "2015-11-01";
		}
		request.addParameter("Version", version);
		request.setHttpMethod(HttpMethodName.GET);
		if (listEpcsRequest.getVpcId() != null) {
			request.addParameter("VpcId", StringUtils.fromString(listEpcsRequest.getVpcId()));
		}
		if (listEpcsRequest.getSubnetId() != null) {
			request.addParameter("SubnetId", StringUtils.fromString(listEpcsRequest.getSubnetId()));
		}
		if (listEpcsRequest.getOffset() != null) {
			request.addParameter("Offset", StringUtils.fromInteger(listEpcsRequest.getOffset()));
		}
		if (listEpcsRequest.getLimit() != null) {
			request.addParameter("Limit", StringUtils.fromInteger(listEpcsRequest.getLimit()));
		}
		return request;
	}

}
