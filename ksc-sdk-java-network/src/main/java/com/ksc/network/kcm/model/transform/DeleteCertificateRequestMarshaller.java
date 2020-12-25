package com.ksc.network.kcm.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.network.kcm.model.DeleteCertificateRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

public class DeleteCertificateRequestMarshaller implements
        Marshaller<Request<DeleteCertificateRequest>, DeleteCertificateRequest> {
    @Override
    public Request<DeleteCertificateRequest> marshall(DeleteCertificateRequest deleteCertificateRequest) {
        if (deleteCertificateRequest == null) {
            throw new KscClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<DeleteCertificateRequest> request = new DefaultRequest<DeleteCertificateRequest>(
                deleteCertificateRequest, "kcm");
        request.addParameter("Action", "DeleteCertificate");
        String version = deleteCertificateRequest.getVersion();
        if (org.apache.commons.lang.StringUtils.isBlank(version)) {
            version = "2016-03-04";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);

        if (!StringUtils.isNullOrEmpty(deleteCertificateRequest.getCertificateId())) {
            request.addParameter("CertificateId", deleteCertificateRequest.getCertificateId());
        }
        return request;
    }
}
