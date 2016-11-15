package com.ksc.cdn.model.domain.domaindetail;

/**
 * DetectOriginConfig
 * 回源探测配置
 * @author jiangran@kingsoft.com
 * @date 2016/11/15
 */
public class DetectOriginConfig{
    /**
     * 取值
     * @see com.ksc.cdn.model.enums.SwitchEnum
     * 开启时，下述必须项为必填项；关闭时，只更改此标识，忽略后面的项内容
     */
    private String Enable;
    /**
     * 回源探测的探测方法，开启后必填
     * 取值
     * @see com.ksc.cdn.model.enums.DetectMethodEnum
     */
    private String DetectMethod;
    /**
     * 回源探测认为有效的状态码，默认为2xx、3xx、4xx都有效
     */
    private String ExpectedResponse;
    /**
     * 回源探测的监控URL，开启后必填
     */
    private String DetectUrl;
    /**
     * 回源探测的频率，目前只可以选择为60s（默认）
     */
    private String Frequency;

    public String getEnable() {
        return Enable;
    }

    public void setEnable(String enable) {
        Enable = enable;
    }

    public String getDetectMethod() {
        return DetectMethod;
    }

    public void setDetectMethod(String detectMethod) {
        DetectMethod = detectMethod;
    }

    public String getExpectedResponse() {
        return ExpectedResponse;
    }

    public void setExpectedResponse(String expectedResponse) {
        ExpectedResponse = expectedResponse;
    }

    public String getDetectUrl() {
        return DetectUrl;
    }

    public void setDetectUrl(String detectUrl) {
        DetectUrl = detectUrl;
    }

    public String getFrequency() {
        return Frequency;
    }

    public void setFrequency(String frequency) {
        Frequency = frequency;
    }
}
