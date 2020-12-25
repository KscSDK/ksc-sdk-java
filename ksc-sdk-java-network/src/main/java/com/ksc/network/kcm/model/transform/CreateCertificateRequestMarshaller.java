package com.ksc.network.kcm.model.transform;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.network.kcm.model.CreateCertificateRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

public class CreateCertificateRequestMarshaller implements
        Marshaller<Request<CreateCertificateRequest>, CreateCertificateRequest> {

    @Override
    public Request<CreateCertificateRequest> marshall(CreateCertificateRequest createCertificateRequest) {
        if (createCertificateRequest == null) {
            throw new KscClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<CreateCertificateRequest> request = new DefaultRequest<CreateCertificateRequest>(
                createCertificateRequest, "kcm");
        request.addParameter("Action", "CreateCertificate");
        String version = createCertificateRequest.getVersion();
        if (org.apache.commons.lang.StringUtils.isBlank(version)) {
            version = "2016-03-04";
        }
        request.addParameter("Version", version);
        request.setHttpMethod(HttpMethodName.POST);

        if (!StringUtils.isNullOrEmpty(createCertificateRequest.getCertificateName())) {
            request.addParameter("CertificateName", createCertificateRequest.getCertificateName());
        }
        if (!StringUtils.isNullOrEmpty(createCertificateRequest.getPrivateKey())) {
            request.addParameter("PrivateKey", createCertificateRequest.getPrivateKey().replace("\n", "\\n"));
        }
        if (!StringUtils.isNullOrEmpty(createCertificateRequest.getPublicKey())) {
            request.addParameter("PublicKey", createCertificateRequest.getPublicKey().replace("\n", "\\n"));
        }
        return request;
    }
}
