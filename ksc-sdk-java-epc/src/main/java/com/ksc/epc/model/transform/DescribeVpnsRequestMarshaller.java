package com.ksc.epc.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.epc.model.DescribeVpnsRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

public class DescribeVpnsRequestMarshaller implements
        Marshaller<Request<DescribeVpnsRequest>, DescribeVpnsRequest> {

    @Override
    public Request<DescribeVpnsRequest> marshall(DescribeVpnsRequest describeVpnsRequest) {
        if (describeVpnsRequest == null) {
            throw new KscClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeVpnsRequest> request = new DefaultRequest<DescribeVpnsRequest>(
                describeVpnsRequest, "epc");
        request.addParameter("Action", "DescribeVpns");
        String version = describeVpnsRequest.getVersion();
        if (org.apache.commons.lang.StringUtils.isBlank(version)) {
            version = "2015-11-01";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);

        if (!StringUtils.isNullOrEmpty(describeVpnsRequest.getRemoteManagementId())) {
            request.addParameter("RemoteManagementId", describeVpnsRequest.getRemoteManagementId());
        }
        if (!StringUtils.isNullOrEmpty(describeVpnsRequest.getDynamicCode())) {
            request.addParameter("DynamicCode", describeVpnsRequest.getDynamicCode());
        }
        if (!StringUtils.isNullOrEmpty(describeVpnsRequest.getPin())) {
            request.addParameter("Pin", describeVpnsRequest.getPin());
        }

        return request;
    }
}