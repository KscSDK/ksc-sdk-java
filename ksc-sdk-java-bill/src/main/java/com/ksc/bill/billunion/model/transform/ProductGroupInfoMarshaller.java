package com.ksc.bill.billunion.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.bill.billunion.model.request.ProductGroupInfoRequest;
import com.ksc.bill.billunion.model.request.SummaryRequest;
import com.ksc.http.HttpMethodName;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

/**
 * @author chenhetong
 * @since 2021/7/22
 */
public class ProductGroupInfoMarshaller implements Marshaller<Request<ProductGroupInfoRequest>, ProductGroupInfoRequest> {

    @Override
    public Request<ProductGroupInfoRequest> marshall(ProductGroupInfoRequest req) {


        Request<ProductGroupInfoRequest> request = new DefaultRequest<ProductGroupInfoRequest>(
                req, "bill-union");
        request.addParameter("Action", "DescribeProductCode");
        String version = req.getVersion();
        if (org.apache.commons.lang.StringUtils.isBlank(version)) {
            version = "2020-01-01";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);
        return request;
    }
}
