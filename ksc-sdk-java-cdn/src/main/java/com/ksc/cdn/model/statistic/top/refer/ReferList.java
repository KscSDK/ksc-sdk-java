package com.ksc.cdn.model.statistic.top.refer;

import lombok.ToString;

/**
 * Created by qichao on 2017/2/27.
 */
@ToString
public class ReferList {
    /**
     * Refer来源地址（只统计来源地址的domain部分）
     */
    private String Refer;
    /**
     * 访问次数
     */
    private Long Pv;
    /**
     * 访问流量
     */
    private Long Flow;

    public String getRefer() {
        return Refer;
    }

    public void setRefer(String refer) {
        Refer = refer;
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
