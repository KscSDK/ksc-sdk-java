package com.ksc.cdn.model.domain.domaindetail;

/**
 * UrlAuthConfig
 *
 * @author jiangran@kingsoft.com
 * @date 2016/11/15
 */
public class UrlAuthConfig{
    /**
     * 配置是否开启或关闭
     * 开启时，下述必须项为必填项；关闭时，只更改此标识，忽略后面的项目。
     * 取值
     * @see com.ksc.cdn.model.enums.SwitchEnum
     */
    private String Enable;
    /**
     * 鉴权类型，只能输入一个
     * 取值
     * @see com.ksc.cdn.model.enums.AuthTypeEnum
     */
    private String AuthType;
    /**
     * 主鉴权key，必须输入，输入大小写字母，数字，长度6到32位
     */
    private String Key1;
    /**
     * 副鉴权Key，输入大小写字母，数字，长度6到32位
     */
    private String Key2;
    /**
     * 鉴权缓存时间，支持B或C方式设置该参数，单位为秒；
     * URL鉴权的过期时间为指定“timestamp+timeout”;默认为1800s;
     */
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
