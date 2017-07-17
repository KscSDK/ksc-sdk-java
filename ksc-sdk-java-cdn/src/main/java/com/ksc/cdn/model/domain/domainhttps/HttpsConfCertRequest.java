package com.ksc.cdn.model.domain.domainhttps;

import com.ksc.cdn.KscClientException;
import com.ksc.cdn.model.GeneralRequest;
import com.ksc.cdn.model.GeneralRequestParam;
import com.ksc.cdn.model.valid.FieldValidate;

import java.text.ParseException;
import java.util.Map;

/**
 * 配置证书请求信息
 * Created by YANGXUEYI on 2017/7/13.
 */
public class HttpsConfCertRequest implements GeneralRequest {

    /**
     * 开启、关闭设置服务证书，取值：on：开启，off：关闭，默认为off，当选择开启时，以下为必填
     */
    @FieldValidate
    private String Enable;

    /**
     * domainid列表，英文逗号隔开
     */
    @FieldValidate
    private String DomainIds;

    /**
     * 金山云生成的安全证书唯一性ID，若输入证书ID，则以下内容可不填写，若无证书ID，则以下内容为必填
     */
    private String CertificateId;

    /**
     * 安全证书名称
     */
    private String CertificateName;

    /**
     * 域名对应的安全证书内容
     */
    private String ServerCertificate;


    /**
     * 安全证书对应的私钥内容
     */
    private String PrivateKey;

    @Override
    public GeneralRequestParam getGeneralRequestParam() {
        return new GeneralRequestParam("ConfigCertificate","2016-09-01","/2016-09-01/cert/ConfigCertificate");
    }

    @Override
    public Map<String, String> buildParams() throws KscClientException, ParseException {
        return null;
    }

    public String getEnable() {
        return Enable;
    }

    public void setEnable(String enable) {
        Enable = enable;
    }

    public String getDomainIds() {
        return DomainIds;
    }

    public void setDomainIds(String domainIds) {
        DomainIds = domainIds;
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
