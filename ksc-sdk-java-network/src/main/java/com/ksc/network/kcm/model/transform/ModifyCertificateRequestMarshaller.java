package com.ksc.network.kcm.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.network.kcm.model.ModifyCertificateRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

public class ModifyCertificateRequestMarshaller implements
        Marshaller<Request<ModifyCertificateRequest>, ModifyCertificateRequest> {
    @Override
    public Request<ModifyCertificateRequest> marshall(ModifyCertificateRequest modifyCertificateRequest) {
        if (modifyCertificateRequest == null) {
            throw new KscClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<ModifyCertificateRequest> request = new DefaultRequest<ModifyCertificateRequest>(
                modifyCertificateRequest, "kcm");
        request.addParameter("Action", "ModifyCertificate");
        String version = modifyCertificateRequest.getVersion();
        if (org.apache.commons.lang.StringUtils.isBlank(version)) {
            version = "2016-03-04";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.GET);

        if (!StringUtils.isNullOrEmpty(modifyCertificateRequest.getCertificateName())) {
            request.addParameter("CertificateName", modifyCertificateRequest.getCertificateName());
        }
        if (!StringUtils.isNullOrEmpty(modifyCertificateRequest.getCertificateId())) {
            request.addParameter("CertificateId", modifyCertificateRequest.getCertificateId());
        }

        return request;
    }
}
