package com.ksc.cdn.model.domain.domainbase;

/**
 * GetDomainBaseResult
 *
 * @author jiangran@kingsoft.com
 * @date 08/11/2016
 */
public class GetDomainBaseResult {
    /**
     * 接入CDN进行加速的域名
     */
    private String DomainName;
    /**
     * 域名ID
     */
    private String DomainId;
    /**
     * 为加速域名生成的一个CNAME域名，需要在域名解析服务商处将加速域名CNAME解析到该域名
     */
    private String Cname;
    /**
     * 开启https的CNAME域名
     */
    private String HttpsCname;
    /**
     * 开启httpDNS服务的CNAME域名
     */
    private String HttpDnsCname;
    /**
     * 加速域名运行状态
     */
    private String DomainStatus;
    /**
     * 加速域名的产品类型
     */
    private String CdnType;
    /**
     * 加速产品子类型
     */
    private String CdnSubType;
    /**
     * ICP备案号
     */
    private String IcpRegistration;
    /**
     * 审核失败原因
     */
    private String AuditFailReason;
    /**
     * 客户访问边缘节点的协议。默认HTTP
     */
    private String CdnProtocol;
    /**
     * 计费区域，多个以逗号间隔
     */
    private String Regions;
    /**
     * 源站类型
     */
    private String OriginType;
    /**
     * 源站端口号,默认值80
     */
    private Integer OriginPort;
    /**
     * 回源协议
     */
    private String OriginProtocol;
    /**
     * 回源地址
     */
    private String Origin;
    /**
     * 加速域名创建时间,ISO8601表示法，北京时间，格式为：YYYY-MM-DDThh:mm+0800
     */
    private String CreatedTime;
    /**
     * 加速域名修改时间，ISO8601表示法，北京时间，格式为：YYYY-MM-DDThh:mm+0800
     */
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
