package com.ksc.bill.billunion.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.bill.billunion.model.request.InstanceSummaryRequest;
import com.ksc.http.HttpMethodName;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

/**
 * @author chenhetong
 * @since 2021/7/22
 */
public class InstanceSummaryMarshaller implements Marshaller<Request<InstanceSummaryRequest>, InstanceSummaryRequest> {

    @Override
    public Request<InstanceSummaryRequest> marshall(InstanceSummaryRequest req) {
        if (req == null) {
            throw new KscClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<InstanceSummaryRequest> request = new DefaultRequest<InstanceSummaryRequest>(
                req, "bill-union");
        request.addParameter("Action", "DescribeInstanceSummaryBills");
        String version = req.getVersion();
        if (org.apache.commons.lang.StringUtils.isBlank(version)) {
            version = "2020-01-01";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);
        if (!StringUtils.isNullOrEmpty(req.getBillMonth())) {
            request.addParameter("BillMonth", req.getBillMonth());
        }
        if (!StringUtils.isNullOrEmpty(req.getProductCode())) {
            request.addParameter("ProductCode", req.getProductCode());
        }
        if (req.getPage() != null) {
            request.addParameter("Page", String.valueOf(req.getPage()));
        }
        if (req.getSize() != null) {
            request.addParameter("Size", String.valueOf(req.getSize()));
        }
        return request;
    }
}
