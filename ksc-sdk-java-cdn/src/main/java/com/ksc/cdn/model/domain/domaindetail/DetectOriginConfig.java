package com.ksc.cdn.model.domain.domaindetail;

/**
 * DetectOriginConfig
 *
 * @author jiangran@kingsoft.com
 * @date 2016/11/15
 */
public class DetectOriginConfig{
    private String Enable;
    private String DetectMethod;
    private String ExpectedResponse;
    private String DetectUrl;
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
