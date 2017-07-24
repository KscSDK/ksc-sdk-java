package com.ksc.cdn.model.domain.domainhttps;

/**
 * 证书实体信息
 * Created by YANGXUEYI on 2017/7/13.
 */
public class HttpsCertificate {

    /**
     * 证书名称
     */
    private String CertificateName;

    /**
     * 证书唯一性ID
     */
    private String CertificateId;

    /**
     * 证书状态，启用：on，未启用:off
     */
    private String Enable;

    /**
     * 证书颁发时间
     */
    private String IssueTime;

    /**
     * 证书过期时间
     */
    private String ExpirationTime;

    /**
     * 证书内容，PEM格式
     */
    private String CertificateContent;

    /**
     * 证书类型，分别是EV\DV\OV
     */
    private String CertificateType;

    /**
     * CA颁发时证书绑定的域名
     */
    private String IssueDomain;

    /**
     * 证书已绑定域名，域名之间用半角英文逗号“,”相隔
     */
    private String ConfigDomainNames;

    public String getCertificateName() {
        return CertificateName;
    }

    public void setCertificateName(String certificateName) {
        CertificateName = certificateName;
    }

    public String getCertificateId() {
        return CertificateId;
    }

    public void setCertificateId(String certificateId) {
        CertificateId = certificateId;
    }

    public String getEnable() {
        return Enable;
    }

    public void setEnable(String enable) {
        Enable = enable;
    }

    public String getIssueTime() {
        return IssueTime;
    }

    public void setIssueTime(String issueTime) {
        IssueTime = issueTime;
    }

    public String getExpirationTime() {
        return ExpirationTime;
    }

    public void setExpirationTime(String expirationTime) {
        ExpirationTime = expirationTime;
    }

    public String getCertificateContent() {
        return CertificateContent;
    }

    public void setCertificateContent(String certificateContent) {
        CertificateContent = certificateContent;
    }

    public String getCertificateType() {
        return CertificateType;
    }

    public void setCertificateType(String certificateType) {
        CertificateType = certificateType;
    }

    public String getIssueDomain() {
        return IssueDomain;
    }

    public void setIssueDomain(String issueDomain) {
        IssueDomain = issueDomain;
    }

    public String getConfigDomainNames() {
        return ConfigDomainNames;
    }

    public void setConfigDomainNames(String configDomainNames) {
        ConfigDomainNames = configDomainNames;
    }
}
