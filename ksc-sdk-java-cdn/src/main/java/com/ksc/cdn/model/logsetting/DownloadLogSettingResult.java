package com.ksc.cdn.model.logsetting;

/**
 * DownloadLogSettingResult
 * 日志下载响应结果
 * @author jiangran@kingsoft.com
 * @date 2016/11/30
 */
@Deprecated
public class DownloadLogSettingResult {
    private Integer id;
    private Integer domainId;
    /**
     * 所属区域
     */
    private String region;
    /**
     * 存储bucket
     */
    private String bucket;
    /**
     * 日志文件名称
     */
    private String name;
    /**
     * 日志下载url地址
     */
    private String url;
    /**
     * 日志产生时间
     */
    private Long logTime;
    /**
     * 日志文件生成时间
     */
    private Long createTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDomainId() {
        return domainId;
    }

    public void setDomainId(Integer domainId) {
        this.domainId = domainId;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getBucket() {
        return bucket;
    }

    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Long getLogTime() {
        return logTime;
    }

    public void setLogTime(Long logTime) {
        this.logTime = logTime;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }
}
