package com.ksc.bill.billunion.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.bill.billunion.model.request.SummaryRequest;
import com.ksc.http.HttpMethodName;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

/**
 * @author chenhetong
 * @since 2021/7/22
 */
public class ProductSummaryMarshaller implements Marshaller<Request<SummaryRequest>, SummaryRequest> {

    @Override
    public Request<SummaryRequest> marshall(SummaryRequest req) {
        if (req == null) {
            throw new KscClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<SummaryRequest> request = new DefaultRequest<SummaryRequest>(
                req, "bill-union");
        request.addParameter("Action", "DescribeBillSummaryByProduct");
        String version = req.getVersion();
        if (org.apache.commons.lang.StringUtils.isBlank(version)) {
            version = "2020-01-01";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);
        if (!StringUtils.isNullOrEmpty(req.getBillBeginMonth())) {
            request.addParameter("BillBeginMonth", req.getBillEndMonth());
        }
        if (!StringUtils.isNullOrEmpty(req.getBillEndMonth())) {
            request.addParameter("BillEndMonth", req.getBillEndMonth());
        }

        return request;
    }
}
