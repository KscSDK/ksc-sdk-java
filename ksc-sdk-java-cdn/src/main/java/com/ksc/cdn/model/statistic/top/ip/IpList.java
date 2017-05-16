package com.ksc.cdn.model.statistic.top.ip;

/**
 * IpList
 *
 * @author qichao@kingsoft.com
 * @date 2017/02/27
 */
public class IpList {
    /**
     * 独立请求的IP地址
     */
    private String Ip;

    /**
     * 访问次数
     */
    private Long Pv;

    /**
     * 访问流量
     */
    private Long Flow;

    public String getIp() {
        return Ip;
    }

    public void setIp(String ip) {
        Ip = ip;
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
