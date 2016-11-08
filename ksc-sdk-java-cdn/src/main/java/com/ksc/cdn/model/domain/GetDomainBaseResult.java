package com.ksc.cdn.model.domain;

/**
 * GetDomainBaseResult
 *
 * @author jiangran@kingsoft.com
 * @date 08/11/2016
 */
public class GetDomainBaseResult {
    private String DomainName;
    private String DomainId;
    private String Cname;
    private String HttpsCname;
    private String HttpDnsCname;
    private String DomainStatus;
    private String CdnType;
    private String CdnSubType;
    private String IcpRegistration;
    private String AuditFailReason;
    private String CdnProtocol;
    private String Regions;
    private String OriginType;
    private Integer OriginPort;
    private String OriginProtocol;
    private String Origin;
    private String CreatedTime;
    private String ModifiedTime;

    public String getDomainName() {
        return DomainName;
    }

    public void setDomainName(String domainName) {
        DomainName = domainName;
    }

    public String getDomainId() {
        return DomainId;
    }

    public void setDomainId(String domainId) {
        DomainId = domainId;
    }

    public String getCname() {
        return Cname;
    }

    public void setCname(String cname) {
        Cname = cname;
    }

    public String getHttpsCname() {
        return HttpsCname;
    }

    public void setHttpsCname(String httpsCname) {
        HttpsCname = httpsCname;
    }

    public String getHttpDnsCname() {
        return HttpDnsCname;
    }

    public void setHttpDnsCname(String httpDnsCname) {
        HttpDnsCname = httpDnsCname;
    }

    public String getDomainStatus() {
        return DomainStatus;
    }

    public void setDomainStatus(String domainStatus) {
        DomainStatus = domainStatus;
    }

    public String getCdnType() {
        return CdnType;
    }

    public void setCdnType(String cdnType) {
        CdnType = cdnType;
    }

    public String getCdnSubType() {
        return CdnSubType;
    }

    public void setCdnSubType(String cdnSubType) {
        CdnSubType = cdnSubType;
    }

    public String getIcpRegistration() {
        return IcpRegistration;
    }

    public void setIcpRegistration(String icpRegistration) {
        IcpRegistration = icpRegistration;
    }

    public String getAuditFailReason() {
        return AuditFailReason;
    }

    public void setAuditFailReason(String auditFailReason) {
        AuditFailReason = auditFailReason;
    }

    public String getCdnProtocol() {
        return CdnProtocol;
    }

    public void setCdnProtocol(String cdnProtocol) {
        CdnProtocol = cdnProtocol;
    }

    public String getRegions() {
        return Regions;
    }

    public void setRegions(String regions) {
        Regions = regions;
    }

    public String getOriginType() {
        return OriginType;
    }

    public void setOriginType(String originType) {
        OriginType = originType;
    }

    public Integer getOriginPort() {
        return OriginPort;
    }

    public void setOriginPort(Integer originPort) {
        OriginPort = originPort;
    }

    public String getOriginProtocol() {
        return OriginProtocol;
    }

    public void setOriginProtocol(String originProtocol) {
        OriginProtocol = originProtocol;
    }

    public String getOrigin() {
        return Origin;
    }

    public void setOrigin(String origin) {
        Origin = origin;
    }

    public String getCreatedTime() {
        return CreatedTime;
    }

    public void setCreatedTime(String createdTime) {
        CreatedTime = createdTime;
    }

    public String getModifiedTime() {
        return ModifiedTime;
    }

    public void setModifiedTime(String modifiedTime) {
        ModifiedTime = modifiedTime;
    }
}
