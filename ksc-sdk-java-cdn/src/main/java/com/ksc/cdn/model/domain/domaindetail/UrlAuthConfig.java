package com.ksc.cdn.model.domain.domaindetail;

/**
 * UrlAuthConfig
 *
 * @author jiangran@kingsoft.com
 * @date 2016/11/15
 */
public class UrlAuthConfig{
    private String Enable;
    private String AuthType;
    private String Key1;
    private String Key2;
    private String Timeout;

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

    public String getTimeout() {
        return Timeout;
    }

    public void setTimeout(String timeout) {
        Timeout = timeout;
    }
}
