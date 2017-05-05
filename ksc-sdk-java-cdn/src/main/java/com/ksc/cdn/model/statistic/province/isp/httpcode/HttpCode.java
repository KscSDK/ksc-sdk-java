package com.ksc.cdn.model.statistic.province.isp.httpcode;

/**
 * HttpCode
 *
 * @author qichao@kingsoft.com
 * @date 2017/02/27
 */
public class HttpCode {
    /**
     * 各种Http状态码，如：200，206，302，403,504
     */
    private String Code;
    /**
     * 各种状态码访问占比
     */
    private Double Proportion;
    /**
     * 本状态码的的访问次数
     */
    private Long Pv;

    public String getCode() {
        return Code;
    }

    public void setCode(String code) {
        Code = code;
    }

    public Double getProportion() {
        return Proportion;
    }

    public void setProportion(Double proportion) {
        Proportion = proportion;
    }

    public Long getPv() {
        return Pv;
    }

    public void setPv(Long pv) {
        Pv = pv;
    }
}

