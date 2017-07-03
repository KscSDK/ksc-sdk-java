package com.ksc.monitor.model.transform;

import java.io.ByteArrayInputStream;
import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.monitor.model.PutMetricDataRequest;
import com.ksc.transform.Marshaller;

public class PutMetricDataRequestMarshaller implements Marshaller<Request<PutMetricDataRequest>, PutMetricDataRequest> {

	@Override
	public Request<PutMetricDataRequest> marshall(PutMetricDataRequest putMetricDataRequest) {
		// TODO Auto-generated method stub
		if (putMetricDataRequest == null) {
			throw new KscClientException("Invalid argument passed to marshall(...)");
		}

		Request<PutMetricDataRequest> request = new DefaultRequest<PutMetricDataRequest>(putMetricDataRequest,
				"monitor");
		request.addParameter("Action", "PutMetricData");
		String version = putMetricDataRequest.getVersion();
		System.out.println("version" + version);
		if (org.apache.commons.lang.StringUtils.isBlank(version)) {
			version = "2017-07-01";
		}
		System.out.println("version" + version);
		byte[] content = putMetricDataRequest.getData().getBytes();
		request.addHeader("Content-Type", "application/json");
		request.setContent(new ByteArrayInputStream(content));
		request.addHeader("Content-Length", Integer.toString(content.length));
		request.setHttpMethod(HttpMethodName.POST);
		request.addParameter("Version", version);

		return request;
	}

}
