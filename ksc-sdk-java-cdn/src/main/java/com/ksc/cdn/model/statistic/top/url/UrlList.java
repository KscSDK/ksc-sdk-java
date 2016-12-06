package com.ksc.cdn.model.statistic.top.url;

/**
 * UrlList
 *
 * @author jiangran@kingsoft.com
 * @date 2016/11/17
 */
public class UrlList {
    /**
     * URL地址（去除问号后部分）
     */
    private String Url;
    /**
     * 访问次数
     */
    private Long Pv;
    /**
     * 访问流量
     */
    private Long Flow;

    public String getUrl() {
        return Url;
    }

    public void setUrl(String url) {
        Url = url;
    }

    public Long getPv() {
        return Pv;
    }

    public void setPv(Long pv) {
        Pv = pv;
    }

    public Long getFlow() {
        return Flow;
    }

    public void setFlow(Long flow) {
        Flow = flow;
    }
}
