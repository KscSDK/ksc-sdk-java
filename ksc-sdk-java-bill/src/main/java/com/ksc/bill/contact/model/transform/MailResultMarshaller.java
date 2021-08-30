package com.ksc.bill.contact.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.bill.contact.model.MailRequest;
import com.ksc.http.HttpMethodName;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

/**
 * @author chenhetong
 * @since 2021/7/22
 */
public class MailResultMarshaller implements Marshaller<Request<MailRequest>, MailRequest> {

    @Override
    public Request<MailRequest> marshall(MailRequest req) {
        if (req == null) {
            throw new KscClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<MailRequest> request = new DefaultRequest<MailRequest>(
                req, "contact");
        request.addParameter("Action", "queryInMailList");
        String version = req.getVersion();
        if (org.apache.commons.lang.StringUtils.isBlank(version)) {
            version = "2021-07-08";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);
        if (!StringUtils.isNullOrEmpty(req.getStartTime())) {
            request.addParameter("StartTime", req.getStartTime());
        }
        if (!StringUtils.isNullOrEmpty(req.getEndTime())) {
            request.addParameter("EndTime", req.getEndTime());
        }
        if (!StringUtils.isNullOrEmpty(req.getCategoryId())) {
            request.addParameter("CategoryId", req.getCategoryId());
        }
        if (!StringUtils.isNullOrEmpty(req.getTypeId())) {
            request.addParameter("TypeId", req.getTypeId());
        }
        if (req.getPageNumber() != null) {
            request.addParameter("PageNumber", String.valueOf(req.getPageNumber()));
        }
        if (req.getPageSize() != null) {
            request.addParameter("PageSize", String.valueOf(req.getPageSize()));
        }
        return request;
    }
}
