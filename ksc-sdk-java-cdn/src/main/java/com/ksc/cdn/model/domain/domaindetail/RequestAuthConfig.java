package com.ksc.cdn.model.domain.domaindetail;

/**
 * RequestAuthConfig
 * <p>
 * 时间+共享秘钥防盗链
 *
 * @author wanghaidong@kingsoft.com
 * @date 2018/12/13
 */
public class RequestAuthConfig {

    /**
     * 需要接入CDN的域名ID
     */
    private String DomainId;

    /**
     * 配置是否开启或关闭
     */
    private String Enable;

    /**
     * 防盗链类型 类型1：对应typeA  类型2:对应typeB
     */
    private String AuthType;

    /**
     * 主密钥
     */
    private String Key1;

    /**
     * 副密钥list,以逗号分隔
     */
    private String Key2;

    /**
     * 有效期
     */
    private Long ExpirationTime;

    public String getDomainId() {
        return DomainId;
    }

    public void setDomainId(String domainId) {
        DomainId = domainId;
    }

    public String getEnable() {
        return Enable;
    }

    public void setEnable(String enable) {
        Enable = enable;
    }

    public String getAuthType() {
        return AuthType;
    }

    public void setAuthType(String authType) {
        AuthType = authType;
    }

    public String getKey1() {
        return Key1;
    }

    public void setKey1(String key1) {
        Key1 = key1;
    }

    public String getKey2() {
        return Key2;
    }

    public void setKey2(String key2) {
        Key2 = key2;
    }

    public Long getExpirationTime() {
        return ExpirationTime;
    }

    public void setExpirationTime(Long expirationTime) {
        ExpirationTime = expirationTime;
    }
}
