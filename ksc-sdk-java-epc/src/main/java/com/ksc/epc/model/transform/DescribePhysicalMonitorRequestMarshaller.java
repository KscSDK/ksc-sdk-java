package com.ksc.epc.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.epc.model.DescribePhysicalMonitorRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

public class DescribePhysicalMonitorRequestMarshaller implements
        Marshaller<Request<DescribePhysicalMonitorRequest>, DescribePhysicalMonitorRequest> {

    @Override
    public Request<DescribePhysicalMonitorRequest> marshall(DescribePhysicalMonitorRequest describePhysicalMonitorRequest) {
        if (describePhysicalMonitorRequest == null) {
            throw new KscClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribePhysicalMonitorRequest> request = new DefaultRequest<DescribePhysicalMonitorRequest>(
                describePhysicalMonitorRequest, "epc");
        request.addParameter("Action", "DescribePhysicalMonitor");
        String version = describePhysicalMonitorRequest.getVersion();
        if (org.apache.commons.lang.StringUtils.isBlank(version)) {
            version = "2015-11-01";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);

        if (!StringUtils.isNullOrEmpty(describePhysicalMonitorRequest.getHostId())) {
            request.addParameter("HostId", describePhysicalMonitorRequest.getHostId());
        }

        return request;
    }
}