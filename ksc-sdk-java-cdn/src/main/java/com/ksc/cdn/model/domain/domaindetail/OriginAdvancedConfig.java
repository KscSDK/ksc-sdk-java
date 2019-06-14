package com.ksc.cdn.model.domain.domaindetail;

import com.ksc.cdn.model.valid.FieldValidate;

import java.util.List;

/**
 * OriginAdvancedConfig
 *
 * @author jiangran@kingsoft.com
 * @date 2016/11/15
 */
public class OriginAdvancedConfig{
    /**
     * 配置高级回源策略的开启或关闭 取值: on、off。
     * 注意：开启后会关闭掉基础配置中的的回源配置。默认值关闭。
     * 开启时，下述必须项为必填项；关闭时，只更改此标识，忽略后面的项目。
     */
    @FieldValidate
    private String Enable;
    /**
     * 源站类型 取值：ipaddr、 domain分别表示：IP源站、域名源站。
     */
    @FieldValidate
    private String OriginType;

    /**
     * 主源站回源地址，可以是IP或域名；IP支持最多20个，以逗号区分，域名只能输入一个。IP与域名不能同时输入。
     */
    @FieldValidate
    private String Origin;

    /**
     * rr: 轮询； quality: 按质量最优的topN来轮询回源
     */
    @FieldValidate
    private String OriginPolicy;
    /**
     * 该项必填。取值1-10
     */
    @FieldValidate
    private Long OriginPolicyBestCount;

    /**
     * 热备源站类型，取值：ipaddr、 domain，分别表示：IP源站、域名源站。
     */
    @FieldValidate
    private String BackupOriginType;

    /**
     * 热备源站回源地址，可以是IP或域名；IP支持最多20个，以逗号区分，域名只能输入一个。IP与域名不能同时输入。
     */
    @FieldValidate
    private String BackupOrigin;

    public String getEnable() {
        return Enable;
    }

    public void setEnable(String enable) {
        Enable = enable;
    }

    public String getOriginType() {
        return OriginType;
    }

    public void setOriginType(String originType) {
        OriginType = originType;
    }


    public String getOriginPolicy() {
        return OriginPolicy;
    }

    public void setOriginPolicy(String originPolicy) {
        OriginPolicy = originPolicy;
    }

    public Long getOriginPolicyBestCount() {
        return OriginPolicyBestCount;
    }

    public void setOriginPolicyBestCount(Long originPolicyBestCount) {
        OriginPolicyBestCount = originPolicyBestCount;
    }

    public String getOrigin() {
        return Origin;
    }

    public void setOrigin(String origin) {
        Origin = origin;
    }

    public String getBackupOriginType() {
        return BackupOriginType;
    }

    public void setBackupOriginType(String backupOriginType) {
        BackupOriginType = backupOriginType;
    }

    public String getBackupOrigin() {
        return BackupOrigin;
    }

    public void setBackupOrigin(String backupOrigin) {
        BackupOrigin = backupOrigin;
    }
}
