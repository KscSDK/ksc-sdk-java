package com.ksc.cdn.model.statistic;

/**
 * GeneralRequestParam
 * 访问api,公用请求参数对象
 * @author jiangran@kingsoft.com
 * @date 2016/11/22
 */
public class GeneralRequestParam {
    private String action;
    private String version;
    private String url;

    public GeneralRequestParam(String action, String version, String url) {
        this.action = action;
        this.version = version;
        this.url = url;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
