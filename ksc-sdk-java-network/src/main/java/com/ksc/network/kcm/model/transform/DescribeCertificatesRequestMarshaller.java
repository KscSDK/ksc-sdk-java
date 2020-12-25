package com.ksc.network.kcm.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.network.kcm.model.DescribeCertificatesRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

public class DescribeCertificatesRequestMarshaller implements
        Marshaller<Request<DescribeCertificatesRequest>, DescribeCertificatesRequest> {
    @Override
    public Request<DescribeCertificatesRequest> marshall(DescribeCertificatesRequest describeCertificatesRequest) {
        if (describeCertificatesRequest == null) {
            throw new KscClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeCertificatesRequest> request = new DefaultRequest<DescribeCertificatesRequest>(
                describeCertificatesRequest, "kcm");
        request.addParameter("Action", "DescribeCertificates");
        String version = describeCertificatesRequest.getVersion();
        if (org.apache.commons.lang.StringUtils.isBlank(version)) {
            version = "2016-03-04";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);


        com.ksc.internal.SdkInternalList<String> list = describeCertificatesRequest.getCertificateIds();
        if (list != null && (!list.isEmpty() || !list.isAutoConstruct())) {
            int index = 1;
            for (String value : list) {
                if (value != null) {
                    request.addParameter("CertificateId." + index, StringUtils.fromString(value));
                }
                index++;
            }
        }

        return request;
    }
}
