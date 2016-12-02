package com.ksc.cdn.model.logsetting;

/**
 * UpdateLogSettingResult
 * 更新日志响应结果
 * @author jiangran@kingsoft.com
 * @date 2016/11/30
 */
@Deprecated
public class UpdateLogSettingResult {

    private Integer id;
    /**
     * 域名
     */
    private String domain;
    /**
     * 存储空间
     */
    private String bucket;
    /**
     * 存储粒度
     * 0:小时，1:天, 2:5分钟
     */
    private Integer granularity;
    /**
     * 日志开启状态
     * 0 关闭，1 开启
     */
    private Integer status;
    /**
     * 更新时间
     */
    private Long updateTime;
    /**
     * 创建时间
     */
    private Long createTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getBucket() {
        return bucket;
    }

    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    public Integer getGranularity() {
        return granularity;
    }

    public void setGranularity(Integer granularity) {
        this.granularity = granularity;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }
}
