package com.ksc.cdn.model.domain.domainhttps;

import com.ksc.cdn.KscClientException;
import com.ksc.cdn.model.GeneralRequest;
import com.ksc.cdn.model.GeneralRequestParam;
import com.ksc.cdn.model.valid.FieldValidate;

import java.text.ParseException;
import java.util.Map;

/**
 * 配置证书参数
 * Created by YANGXUEYI on 2017/7/13.
 */
public class HttpsSetCertRequest implements GeneralRequest {
    /**
     * 证书对应的唯一ID
     */
    @FieldValidate
    private String CertificateId;

    /**
     * 安全证书名称
     */
    private String CertificateName;

    /**
     * 域名对应的安全证书内容
     */
    @FieldValidate
    private String ServerCertificate;

    /**
     * 安全证书对应的私钥内容
     */
    @FieldValidate
    private String PrivateKey;

    @Override
    public GeneralRequestParam getGeneralRequestParam() {
        return new GeneralRequestParam("SetCertificate", "2016-09-01","/2016-09-01/cert/SetCertificate");
    }

    @Override
    public Map<String, String> buildParams() throws KscClientException, ParseException {
        return null;
    }

    public String getCertificateId() {
        return CertificateId;
    }

    public void setCertificateId(String certificateId) {
        CertificateId = certificateId;
    }

    public String getCertificateName() {
        return CertificateName;
    }

    public void setCertificateName(String certificateName) {
        CertificateName = certificateName;
    }

    public String getServerCertificate() {
        return ServerCertificate;
    }

    public void setServerCertificate(String serverCertificate) {
        ServerCertificate = serverCertificate;
    }

    public String getPrivateKey() {
        return PrivateKey;
    }

    public void setPrivateKey(String privateKey) {
        PrivateKey = privateKey;
    }
}
